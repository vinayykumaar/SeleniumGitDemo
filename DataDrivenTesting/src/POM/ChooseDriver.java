package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChooseDriver {
	
	
	public static WebDriver Use(String browser){
		if(browser.equalsIgnoreCase("c"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("f"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
			return new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
			return new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
			return null;
		}
	}

}
