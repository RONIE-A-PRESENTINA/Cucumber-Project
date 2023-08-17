package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirm {
	
	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement iter;


	public WebElement getIter() {
		return iter;
	}
	
	public Bookingconfirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	 
	
	

}
