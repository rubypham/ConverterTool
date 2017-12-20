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
package com.auto.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class AppendPrefixPropertiesConverter {
	public void convert(String prefix) {
		File folder = new File("input/");
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			System.out.println("Converting file: " + listOfFiles[i].getAbsolutePath());
			convert(prefix, listOfFiles[i]);
		}
		System.out.println("Done");
	}

	public void convert(String prefix, File file) {
		String outputFile = file.getAbsolutePath().replace("input", "output");

		Properties prop = new Properties();
		Properties propOut = new Properties();
		InputStream input = null;
		OutputStream output = null;

		try {
			/* load prop */
			input = new FileInputStream(file);
			prop.load(input);

			/* set propOut */
			Set<Object> keys = prop.keySet();

			for (Object key : keys) {
				Object value = prop.get(key);
				propOut.setProperty(new StringBuilder(prefix).append(key.toString()).toString(), value.toString());
			}

			/* store prop */
			output = new FileOutputStream(outputFile);
			propOut.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
