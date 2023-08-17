package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	
	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement fn;
	
	@FindBy(name="last_name")
	private WebElement ln;
	
	@FindBy(name="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement credit;
	
	@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	
	@FindBy(id="cc_exp_year")
	private WebElement yr;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;


	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public Bookhotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	

}
