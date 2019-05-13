package PropScreenshot;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
		
	    WebElement m =  driver.findElement(By.xpath("//input[@title='Search']"));
	    act.moveToElement(m).click().sendKeys("Accenture").sendKeys(Keys.ENTER).build().perform();
	    
	    driver.get("http://demowebshop.tricentis.com/");
	    
	    WebElement m2 =  driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
	    act.keyDown(m2,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	    
	    Thread.sleep(2000);
	    
	    act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
	    System.out.println("The test is ok");
	    
	    WebElement m3 =  driver.findElement(By.linkText("COMPUTERS"));
	    act.moveToElement(m3).moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a"))).click().build().perform();
	    Thread.sleep(2000);
	    System.out.println("555555");
	    
	    
	    Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));
	    System.out.println("The second test is ok too");
	    Thread.sleep(5000);
	    driver.close();

	}

}
