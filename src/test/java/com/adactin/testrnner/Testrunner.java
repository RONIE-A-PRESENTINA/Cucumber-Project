package com.adactin.testrnner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.stepdefintion",
monochrome = true,
dryRun = false,
strict = true,
plugin = {"html:Reports/html_report",
		"pretty",
		"json:Reports/json_report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_report.html"
})
public class Testrunner  {
	public static WebDriver driver;
//	
	@BeforeClass
	public static void  set() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver = Baseclass.browserlanch("chrome");
	}
//	
//	
//	
    @AfterClass
	public static void close() {
		driver = Baseclass.quit();
	}
 
}


