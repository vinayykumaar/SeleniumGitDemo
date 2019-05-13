package PropScreenshot;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RediffGoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
	    WebElement m2 =  driver.findElement(By.xpath("//input[@value='Go']"));
	    act.moveToElement(m2).click().build().perform();
	    Thread.sleep(5000);
	   // /html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input
	    driver.switchTo().alert().accept();
	    
	   
	    
	    Thread.sleep(2000);
	    
	    driver.close();

	}

}
