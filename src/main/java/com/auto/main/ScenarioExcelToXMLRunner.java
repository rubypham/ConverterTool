package com.auto.main;

import com.auto.converter.ScenarioExcelToXMLConverter;

public class ScenarioExcelToXMLRunner {
	public static void main(String[] args) {
		ScenarioExcelToXMLConverter converter = new ScenarioExcelToXMLConverter();
		converter.convert();
	}

}
