/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright� 2017 DIRECTV, INC.
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * 
 * This software is the confidential and proprietary information of
 * DIRECTV, Inc. ("Proprietary Information").  Any use, reproduction, 
 * distribution or disclosure of the software or Proprietary Information, 
 * in whole or in part, must comply with the terms of the license 
 * agreement, nondisclosure agreement or contract entered into with 
 * DIRECTV providing access to this software.
 */
package com.auto.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.auto.model.DataFile;
import com.auto.model.Keyword;
import com.auto.model.Keywords;
import com.auto.model.Scenario;
import com.auto.model.Sheet;
import com.auto.model.Sheets;
import com.auto.model.TestIDs;

public class TestCaseExcelDAL {
	protected static XSSFSheet sheet;

	private static String getCellValue(int iRow, int iCol) {
		XSSFRow row = sheet.getRow(iRow);
		XSSFCell cell = row.getCell(iCol);
		if (cell != null) {
			cell.setCellType(1);
			return cell.getRichStringCellValue().getString();
		}
		return "";
	}

	public static Scenario getTestScenario(String fileName) {
		Scenario scenario = new Scenario();

		String fileDataRef = null;
		try {
			File file = new File(fileName);
			file.canRead();
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook((InputStream) fis);
			Sheets sheets = new Sheets();
			List<Sheet> tcSheets = new ArrayList<>();
			for (int i = 0; i < wb.getNumberOfSheets(); ++i) {
				Sheet tcSheet = new Sheet();
				sheet = wb.getSheetAt(i);

				tcSheet.setName(sheet.getSheetName());

				String testIDs = getCellValue(0, 4);
				tcSheet.setTestIDs(new TestIDs(testIDs + ";"));

				fileDataRef = getCellValue(0, 1);
				tcSheet.setDataFile(new DataFile(fileDataRef, "Data"));

				String kwName;
				Keywords keywords = new Keywords();
				List<Keyword> keyword = new ArrayList<>();
				for (int j = 3; j < sheet.getLastRowNum() && (kwName = getCellValue(j, 0)).length() > 0; ++j) {
					Keyword kw = new Keyword();
					kw.setName(kwName);
					keyword.add(kw);
				}
				keywords.setKeyword(keyword);
				tcSheet.setKeywords(keywords);

				tcSheets.add(tcSheet);
			}
			sheets.setSheet(tcSheets);
			scenario.setSheets(sheets);
			wb.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return scenario;
	}
}
