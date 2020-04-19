package com.runner;


import java.io.File;

import org.baseclass.BaseeeClasss;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.helper.PropertyReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\feature",
glue       = {"com.adactin.stepDef"},
dryRun     = false,
strict     = true,
monochrome = true,
plugin     = {"pretty",
		     "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\reports\\reports.html",
		     "html:src\\test\\resource\\reports",
             "json:src\\test\\resource\\reports\\report.json",
	        "junit:src\\test\\resource\\reports\\report.xml"})

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverinial() throws Throwable {
String browserName = PropertyReaderManager.getInstance().getPr().getBrowserName();
System.out.println("The browser name is :" + browserName);
driver = BaseeeClasss.getBrowser("chrome");
//driver.get(PropertyReaderManager.getInstance().getPr().getUrl());


	}
	
	@AfterClass
	public static void driverquit() {
	Reporter.loadXMLConfig(new File("src\\test\\resource\\com\\configuration\\extent-config.xml"));
		//driver.quit();
	}

}
