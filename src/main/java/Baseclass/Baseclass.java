package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver browserlanch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		else if (name.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 WebDriver driver = new FirefoxDriver();
			 driver.manage().window().maximize();	 
		}
		
		else if (name.equalsIgnoreCase("edge") ) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();	
		}
		
		return driver;
	}
	
	public static void button(WebElement element){
		element.click();
	}
	
	public static void input(WebElement element, String value) {
			element.sendKeys(value);
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void Select(String Type, WebElement element, String value) {
		Select s = new Select(element);
		if (Type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (Type.equalsIgnoreCase("Text")) {
			s.selectByVisibleText(value);
		}
		else if (Type.equalsIgnoreCase("index")) {
			int v = Integer.parseInt(value);
			s.selectByIndex(v);
		}
	}
	
	public static void close() {
		driver.close();
	}
	
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}
	
	public static void navto(String url) {
		driver.navigate().to(url);
		

	}
	
	public static void navback() {
		driver.navigate().back();
	}
	
	public static void navforward() {
		driver.navigate().forward();

	}
	
	public static void navrefresh() {
		driver.navigate().refresh();
	}
	
	private void alerts(String type) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
			
		}

	}
	
	public static void actions(WebElement element , String type) {
		Actions a = new Actions(driver);
		
		if (type.equalsIgnoreCase("click")) {
			a.click(element).build().perform();

			
		}
		else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).build().perform();
			
		}
		else if (type.equalsIgnoreCase("rightclick")) {
			a.contextClick(element).build().perform();
			
		}

	}
	
	public static void robots(String action) throws AWTException {
		
		Robot rob = new Robot();
		
		if (action.equalsIgnoreCase("down")) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (action.equalsIgnoreCase("up")) {
		    rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);
		}
		else if (action.equalsIgnoreCase("enter")) {
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
	
	public static void frames(String type,WebElement element) {
		if (type.equalsIgnoreCase("frame")) {
			driver.switchTo().frame(element);
			
		}
		else if (type.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			
		}
	}
	
	public static void windowhandle(String type,String handle) {
		if (type.equalsIgnoreCase("single")) {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			
		}
		else if (type.equalsIgnoreCase("multiple")) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String ids : windowHandles) {
				System.out.println(ids);
			}
		}
	   }
	
	   public static void screenshot() throws IOException {
			TakesScreenshot s =(TakesScreenshot)driver;
			File f = s.getScreenshotAs(OutputType.FILE);
			File f1 = new File("C:\\Users\\RONIE\\eclipse-workspace\\Selenium\\Ss\\ama.png");
		    FileHandler.copy(f, f1);
			

	}
	   
	   public static void checkbox(WebElement element) {
		   element.click();
		

	}
	   
	   public static  void isselected(WebElement element) {
		   System.out.println(element.isSelected());
		

	}
	   
	   public static  void isdisplayed(WebElement element,Boolean displayed) {
		   boolean displayed2 = element.isDisplayed();
		   System.out.println(displayed2);
	   }
	   
	   public static  void isenabled(WebElement element) {
		   System.out.println(element.isEnabled());
	   }
	   
	   public static void ismultiple(WebElement element) {
		   Select s = new Select(element);
		   
		   System.out.println(s.isMultiple());
		
	  }
	   
	   
	   public static void gettitle(String title) {
		  title = driver.getTitle();
		  System.out.println(title);
		}
		

	    public static void currenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}
	    
	    public static void getoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement opt : options) {
				System.out.println(opt.getText());
				
			}

		}
	    
	    public static void gettext(WebElement element) {
	    	String text = element.getText();
	    	System.out.println(text);
		}
	    
	    public static void getattribute(WebElement element,String attr) {
	    	String attribute = element.getAttribute(attr);
	    	System.out.println(attribute);
			

		}
	    
		

	
	   
	  
	
	
	
	
	
	
	
	
	
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


