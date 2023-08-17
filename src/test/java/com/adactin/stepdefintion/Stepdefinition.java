package com.adactin.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.testrnner.Testrunner;
import com.mongodb.operation.DropDatabaseOperation;
import com.sdp.Pageobjectmanager;

import Baseclass.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass{
	public static WebDriver driver = Testrunner.driver;
	public static Pageobjectmanager pom = new Pageobjectmanager(driver);
	
	@Given("^user Launches The Adactin Application$")
	public void user_Launches_The_Adactin_Application() throws Throwable {
		
		geturl("https://adactinhotelapp.com/");
	}
	
	@When("^the User Enters The \"([^\"]*)\" In The Username Field$")
	public void the_User_Enters_The_In_The_Username_Field(String username) throws Throwable {
		input(pom.getLp().getUsername(), username);
	    
	}

	@When("^the User Enters The \"([^\"]*)\" In The Password Field$")
	public void the_User_Enters_The_In_The_Password_Field(String password) throws Throwable {
		input(pom.getLp().getPass(), password);
	    
	}

	@Then("^the User Clicks The Login Button And It Navigates To The Search Hotel Page$")
	public void the_User_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		
		button(pom.getLp().getLog());
	}
	
	
	@When("^the User Selects The Location Of The Hotel$")
	public void the_User_Selects_The_Location_Of_The_Hotel() throws Throwable {
		
		Select("index", pom.getSer().getLoc(), "1");
	}

	@When("^the User Selects The Hotel$")
	public void the_User_Selects_The_Hotel() throws Throwable {
		
		Select("index", pom.getSer().getHot(), "2");
	}

	@When("^the User Selects The Room Type$")
	public void the_User_Selects_The_Room_Type() throws Throwable {
		
		Select("index", pom.getSer().getType(), "4");
	}

	@When("^the User Selects The Number Of Rooms$")
	public void the_User_Selects_The_Number_Of_Rooms() throws Throwable {
		
		Select("index",pom.getSer().getNum(), "2");
	}

	@When("^the User Enters The Check In Date$")
	public void the_User_Enters_The_Check_In_Date() throws Throwable {
		
		input(pom.getSer().getIn(), "23/8/2023");
	}

	@When("^the User Enters The Check Out Date$")
	public void the_User_Enters_The_Check_Out_Date() throws Throwable {
		
		input(pom.getSer().getOut(), "28/8/2023");
	}

	@When("^the User Selects Number Of Adults$")
	public void the_User_Selects_Number_Of_Adults() throws Throwable {
		
		Select("index", pom.getSer().getAdult(), "1");   
	}

	@When("^the User Selects Number Of Children$")
	public void the_User_Selects_Number_Of_Children() throws Throwable {
		
		Select("index", pom.getSer().getChild(), "3");
	}

	@Then("^the User Clicks The Login Button And It Navigates To The Select Hotel Page$")
	public void the_User_Clicks_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		
		button(pom.getSer().getSub());
	}

	@When("^the User Clicks The Required Hotel$")
	public void the_User_Clicks_The_Required_Hotel() throws Throwable {
		
		button(pom.getSl().getSel());	
	}

	@Then("^the User Clicks The Continue Button And It Navigates To The Book Hotel Page$")
	public void the_User_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		
		button(pom.getSl().getCon());
	}

	@When("^the User Enters The Firstname In The Firstame Field$")
	public void the_User_Enters_The_Firstname_In_The_Firstame_Field() throws Throwable {
		
		input(pom.getBh().getFn(), "ronie");
	}

	@When("^the User Enters The Lastname I The Lastname Field$")
	public void the_User_Enters_The_Lastname_I_The_Lastname_Field() throws Throwable {
		
		input(pom.getBh().getLn(), "tina");
	}

	@When("^the User Enters The Billing Address In The Billing Field$")
	public void the_User_Enters_The_Billing_Address_In_The_Billing_Field() throws Throwable {
		
		input(pom.getBh().getAdd(), "abc");
	}

	@When("^the User Enters The Credit Card Number In The Credit Card Number Field$")
	public void the_User_Enters_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		
		input(pom.getBh().getCredit(), "1234567887654321");
	}

	@When("^the User Selects Credit Card Type$")
	public void the_User_Selects_Credit_Card_Type() throws Throwable {
		
		Select("index",pom.getBh().getType(), "3");
		
	}

	@When("^the User Selects Expiry Month$")
	public void the_User_Selects_Expiry_Month() throws Throwable {
		
		Select("index", pom.getBh().getMon(), "5");
	}

	@When("^the User Selects Expiry Year$")
	public void the_User_Selects_Expiry_Year() throws Throwable {
		
		Select("index", pom.getBh().getYr(), "7");
	}

	@When("^the User Enters The CVV Number In The CVV Number Field$")
	public void the_User_Enters_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable{
	
		input(pom.getBh().getCvv(), "264");
	}

	@Then("^the User Clicks The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void the_User_Clicks_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		
		button(pom.getBh().getBook());
	}

	@Then("^the User clicks The Logout Button And Then It Navigates Back To The Login Page$")
	public void the_User_clicks_The_Logout_Button_And_Then_It_Navigates_Back_To_The_Login_Page() throws Throwable {
		
		button(pom.getBc().getIter());
	}




}
