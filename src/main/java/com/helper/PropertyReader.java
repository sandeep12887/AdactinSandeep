package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertyReader {
	public static Properties prop;

	public PropertyReader() throws Throwable {
		try {
			prop = new Properties();
			File propFILE= new File(System.getProperty
					("user.dir")+"//src//test//resource//com//configuration//config.properties");
					//System.getProperty("C:\\Users\\admin\\eclipse-workspace\\AdactinLatest\\src\\test\\resource\\com\\configuration\\config.properties"));
			
			FileInputStream fin = new FileInputStream(propFILE);
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	

	public String getBrowserName() throws Exception {
		String property = prop.getProperty("BrowserName");
		if (property==null) {
			throw new Exception("not valid");
		}
		return property;

	}
	public String getUrl() throws Exception {
		String property = prop.getProperty("Url");
		if (property==null) {
			throw new Exception("not valid");
		}
		return property;

	}
	public String getUsername() throws Exception {
		String property = prop.getProperty("Username");
		if (property==null) {
			throw new Exception("Invalid Username");
		}
		return property;

	}
	public String getPassword() throws Exception {
		String property = prop.getProperty("Password");
		if (property==null) {
			throw new Exception("Invalid Username");
		}
		return property;
		}
	public String getImplicitWait() throws Exception {
		String property = prop.getProperty("ImplicitWait");
		if (property==null) {
			throw new Exception("Invalid Wait Name");
		}
		return property;
		}
	
}
