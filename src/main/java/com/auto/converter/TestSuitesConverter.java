package com.auto.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import com.auto.model.AssertType;
import com.auto.model.Expectation;
import com.auto.model.TestCase;
import com.auto.model.TestParam;
import com.auto.model.TestSuite;
import com.auto.model.TestSuites;
import com.auto.model.UserInfo;


public class TestSuitesConverter {
	TestSuites testSuites;

	public void convert() {
		File folder = new File("input/");
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			System.out.println("Converting file: " + listOfFiles[i].getAbsolutePath());
			convert(listOfFiles[i].getAbsolutePath());
		}
		System.out.println("Done");
	}

	public void convert(String fileName) {
		String outFileName = fileName.replace("input", "output");
		this.testSuites = loadTestSuitesFromFile(fileName);
		convertTestSuites();
		writeTestSuites(outFileName);

	}

	private void writeTestSuites(String outFileName) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(TestSuites.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(testSuites, new File(outFileName));
			jaxbMarshaller.marshal(testSuites, System.out);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private String cook(String input) {
		// String input = "//content[101]/cha2nnel[32]/marketId";
		Pattern pattern = Pattern.compile("\\[(\\d+)\\]");
		Matcher m = pattern.matcher(input);
		StringBuilder cooked = new StringBuilder("//");
		int preIndex = 0;

		while (m.find()) {
			String text = m.group().replace("[", "").replace("]", "");
			Integer newNum = Integer.valueOf(text) + 1;
			cooked.append(input.substring(preIndex, m.start() + 1)).append(newNum);
			preIndex = m.end() - 1;
		}

		if (preIndex < input.length()) {
			cooked.append(input.substring(preIndex));
		}

		String result = convertField(cooked.toString());

		return result;
	}

	private String convertField(String string) {
		Properties prop = getConvertField();

		Set<Object> keys = prop.keySet();

		for (Object key : keys) {
			Object value = prop.get(key);
			string = string.replace(key.toString(), value.toString());
		}

		string=string.replace(".", "/");

		return string;
	}

	private Properties getConvertField() {
		File file = new File("tmp/convertfield.properties");

		Properties prop = new Properties();
		InputStream input = null;

		try {
			/* load prop */
			input = new FileInputStream(file);
			prop.load(input);

		} catch (IOException io) {
			io.printStackTrace();
		}

		return prop;
	}

	public static void main(String[] args) {
		String input = "//channel[id=7258]/nonLinear[1].premium";

		String inPattern = "nonLinear(\\[\\d+\\])\\.premium";
		String outPattern = "nonLinear(\\[\\d+\\])\\.@premium";

		String ouString = input.replace(inPattern, outPattern);
		System.out.println(ouString);
	}

	protected String siteId = "siteId";
	protected String siteUserId = "siteUserId";
	protected String password = "password";
	protected String signature = "signature";

	public TestSuites loadTestSuitesFromFile(String filePath) {

		TestSuites ret = new TestSuites();

		try {
			InputStream is = new FileInputStream(new File(filePath));
			JAXBContext context = JAXBContext.newInstance(TestSuites.class);
			// TestSuites testSuites = (TestSuites)
			// context.createUnmarshaller().unmarshal(is);

			XMLInputFactory xif = XMLInputFactory.newFactory();
			xif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false); // this
																		// is
																		// the
																		// magic
																		// line
			StreamSource source = new StreamSource(is);
			XMLStreamReader xsr = xif.createXMLStreamReader(source);

			Unmarshaller unmarshaller = context.createUnmarshaller();
			TestSuites testSuites = (TestSuites) unmarshaller.unmarshal(xsr);

			if (testSuites != null) {
				ret.getTestSuite().addAll(testSuites.getTestSuite());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Load testsuites " + filePath + " failed: " + ex.getMessage());
		}
		return ret;
	}

	private void convertTestSuites() {
		for (TestSuite testSuite : testSuites.getTestSuite()) {
			for (TestCase testCase : testSuite.getTestCase()) {
				convertUserInfo(testCase);

				cookObject(testCase);

			}
		}
	}

	private void cookObject(TestCase testCase) {
		for (Expectation expectation : testCase.getExpectedResult().getExpectation()) {
			String obj = expectation.getObject();
			if ("errors".equals(obj) && AssertType.isEmpty.toString().equalsIgnoreCase(expectation.getAssertType())) {
				expectation.setAssertType(AssertType.isNull.toString());
			}
			expectation.setObject(cook(obj));
		}

	}

	private void convertUserInfo(TestCase testCase) {
		UserInfo userInfo = testCase.getUserInfo();
		if (userInfo != null) {
			TestParam testParam = new TestParam();
			// set siteid
			if (userInfo.getSiteId() != null) {
				testParam.setName(siteId);
				testParam.setValue(userInfo.getSiteId());
				userInfo.getUserInfoParam().add(testParam);
				userInfo.setSiteId(null);
			}
			// set siteUserId
			testParam = new TestParam();
			if (userInfo.getSiteUserId() != null) {
				testParam.setName(siteUserId);
				testParam.setValue(userInfo.getSiteUserId());
				userInfo.getUserInfoParam().add(testParam);
				userInfo.setSiteUserId(null);
			}

			// set Password
			testParam = new TestParam();
			if (userInfo.getPassword() != null) {
				testParam.setName(password);
				testParam.setValue(userInfo.getPassword());
				userInfo.getUserInfoParam().add(testParam);
				userInfo.setPassword(null);
			}

			// set Signature
			testParam = new TestParam();
			if (userInfo.getSignature() != null) {
				testParam.setName(signature);
				testParam.setValue(userInfo.getSignature());
				userInfo.getUserInfoParam().add(testParam);
				userInfo.setSignature(null);
			}

		}

	}
}
