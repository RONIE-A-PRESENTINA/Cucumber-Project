package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Bookediter;
import com.pom.Bookhotel;
import com.pom.Bookingconfirm;
import com.pom.LoginPg;
import com.pom.Searchhotel;
import com.pom.Selecthotel;

public class Pageobjectmanager {
	
	public static WebDriver driver;
	
	private LoginPg lp;
	private Searchhotel ser;
	private Selecthotel sl;
	private Bookhotel bh;
	private Bookingconfirm bc;
	private Bookediter bi;
	
	
	public LoginPg getLp() {
       lp = new LoginPg(driver);                                          //getters
       return lp;

    }
	

	public Searchhotel getSer() {
		ser = new Searchhotel(driver);
		return ser;
	}

	public Selecthotel getSl() {
		sl = new Selecthotel(driver);
		return sl;
	}

	public Bookhotel getBh() {
		bh = new Bookhotel(driver);
		return bh;
	}

	public Bookingconfirm getBc() {
		bc = new Bookingconfirm(driver);
		return bc;
	}

	public Bookediter getBi() {
		bi = new Bookediter(driver);
		return bi;
	}

	
	
    public Pageobjectmanager(WebDriver driver2) {
		
		this.driver = driver2;
	}


	
	

}
