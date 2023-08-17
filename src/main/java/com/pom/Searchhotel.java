package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	
	public static WebDriver driver;
	

	@FindBy(name="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	
	@FindBy(name="room_type")
	private WebElement type;
	
	@FindBy(name="room_nos")
	private WebElement num;
	
	@FindBy(name="datepick_in")
	private WebElement in;
	
	@FindBy(name="datepick_out")
	private WebElement out;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(name="Submit")
	private WebElement sub;
	
		

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNum() {
		return num;
	}
	

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	
	public WebElement getSub() {
		return sub;
	}

	
	public Searchhotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	
	}	

}
