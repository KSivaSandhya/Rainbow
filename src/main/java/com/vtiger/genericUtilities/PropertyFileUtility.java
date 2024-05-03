package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility {// Notepad fetching code
	public String readDataFromPropertyFIle( String key) throws Throwable {
		FileInputStream fisp = new FileInputStream(IconstantUtility.propertyfilepath);
		Properties p = new Properties();
		p.load(fisp);
		return p.getProperty(key);
	}

}
