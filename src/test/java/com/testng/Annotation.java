package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	
	public static WebDriver driver;
	
	@BeforeSuite
	private void setproperty() {
		WebDriverManager.chromedriver().setup();
	}
	
	@BeforeTest
	private void browserlaunch() {
		driver = new ChromeDriver();

	}
	
	@BeforeClass
	private void launchingurl() {
		driver.get("https://adactinhotelapp.com/");
	}
	
	@BeforeMethod
	private void signin() {
		driver.findElement(By.name("username")).sendKeys("ronietina");
		driver.findElement(By.name("password")).sendKeys("3WE459");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	private void methods() throws InterruptedException {
		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(location);
		s.selectByIndex(5);
		
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		
		WebElement type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(type);
		s2.selectByVisibleText("Deluxe");
		
		WebElement num = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(num);
		s3.selectByIndex(4);
		
		WebElement ind = driver.findElement(By.className("date_pick"));
		ind.clear();
		ind.sendKeys("18/06/2023");
		
		WebElement outd = driver.findElement(By.id("datepick_out"));
		outd.clear();
		outd.sendKeys("20/06/2023");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByIndex(2);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("2");
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		//SELECT
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//BOOK
		
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("tina");
		
		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		last.sendKeys("ronie");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@class='txtarea']"));
		add.sendKeys("123,abc street");
		
		WebElement card = driver.findElement(By.xpath("//input[@id='cc_num']"));
		card.sendKeys("1234123412341234");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByValue("VISA");
		
		WebElement exp = driver.findElement(By.className("select_combobox2"));
		Select s7 = new Select(exp);
		s7.selectByIndex(5);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2023");
		
		driver.findElement(By.name("cc_cvv")).sendKeys("2846129");
		
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(8000);
		
	}
	
	@AfterMethod
	private void signout() {
		driver.findElement(By.id("logout")).click();

	}
	
	@AfterTest
	private void close() {
		driver.quit();

	}
	
	@AfterSuite
	private void deletecookie() {
		driver.manage().deleteAllCookies();
	}
	
 
}
