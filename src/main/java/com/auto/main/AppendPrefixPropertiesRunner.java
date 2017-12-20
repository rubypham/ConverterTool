package com.auto.main;

import com.auto.converter.AppendPrefixPropertiesConverter;

public class AppendPrefixPropertiesRunner {

	public static void main(String[] args) {
		AppendPrefixPropertiesConverter converter = new AppendPrefixPropertiesConverter();
		converter.convert("Tablet.");
	}

}
