package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties p;    //p=null
	public Configuration_reader() throws IOException {
		
		File f = new File("\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	 
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}
	
	public String url() {
		String url = p.getProperty("url");
		return url;

	}

}
