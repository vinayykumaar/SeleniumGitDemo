package PropScreenshot;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class PassImageTest {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
	    
	    driver.get("https://postimages.org/");
	   
	    
	    WebElement choose =  driver.findElement(By.xpath("//*[@id='uploadFile']"));
	  
	    act.moveToElement(choose).click().build().perform();
	    
		
		//for taking screenshot 
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Vinay\\Demo.png"));
		
		StringSelection copy = new StringSelection("C:\\Vinay\\Demo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);
		
		Thread.sleep(1000);
		
		Robot robo = new Robot();
		
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.setAutoDelay(1000);
	    
	    robo.keyPress(KeyEvent.VK_V);
	    robo.setAutoDelay(1000);
		
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.setAutoDelay(1000);
	    
	    robo.keyRelease(KeyEvent.VK_V);
	    robo.setAutoDelay(1000);
	    
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.setAutoDelay(1000);
		
		
	}
	
	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }


}
