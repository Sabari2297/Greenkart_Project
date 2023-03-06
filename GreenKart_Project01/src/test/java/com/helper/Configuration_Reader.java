package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties pro;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\sabarinathan\\eclipse-workspace\\GreenKart_Project01\\src\\test\\java\\com\\helper\\Greenkart.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 pro = new Properties();
		
		pro.load(fis);
	}
	
	public String getBrowser() {
	
		String browser = pro.getProperty("browser");
		
		return browser;

	}
	
	public String getUrl() {
	
		String url = pro.getProperty("url");
		
		return url;

	}

}
