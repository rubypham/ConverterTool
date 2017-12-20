package com.auto.converter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;

import com.auto.dao.TestCaseExcelDAL;
import com.auto.model.Scenario;

public class ScenarioExcelToXMLConverter {

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
		String xmlFileName = fileName.replace(".xlsx", ".xml");
		xmlFileName = xmlFileName.replace("input", "output");

		Scenario scenario = TestCaseExcelDAL.getTestScenario(fileName);
		convertToXMl(scenario, xmlFileName);

	}

	public void convertToXMl(Scenario scenario, String path) {
		try {
			JAXBContext context = JAXBContext.newInstance(Scenario.class);
			context.createMarshaller().marshal(scenario, new File(path));
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Convert testsuites to XML errror: " + ex.getMessage());
		}
	}

	private String readXMLFileAsaString(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			String everything = sb.toString();
			return everything;
		} finally {
			try {
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	private void writeStringToFile(String content, String path) throws IOException {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write(content);

		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
	}

}
