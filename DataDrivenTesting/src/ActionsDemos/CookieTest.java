package ActionsDemos;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class CookieTest {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//Actions act = new Actions(driver);
	    
	    driver.get("http://www.google.com/");
	   
	    
	    /*Cookie SelDemo = new Cookie("New Cookoe with Username Vinay", "Content written on 10th May 2019") ;
	    driver.manage().addCookie(SelDemo);
	    
	    
	    Set<Cookie> CookiesList = driver.manage().getCookies();
	    
	    for(Cookie getcookies : CookiesList) {
	    	System.out.println(getcookies);
	    	System.out.println("  ");*/
	    	
	    	
	    Cookie TestCookie1 = new Cookie("Username","TestUser");
	    driver.manage().addCookie(TestCookie1);
	    
	    Cookie TestCookie2 = new Cookie("Password", "TestPassword");
	    driver.manage().addCookie(TestCookie2);
	    
	    
	    Set <Cookie> ck = driver.manage().getCookies();
	    for(Cookie c:ck) {
	    	System.out.println("Name "+c.getName());
	    	System.out.println("Value "+c.getValue());
	    	System.out.println("Domain "+c.getDomain());
	    	System.out.println("Path "+c.getPath());
	    	System.out.println("Expires "+c.getExpiry());
	    	System.out.println("   ");
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	}
	
	

}
