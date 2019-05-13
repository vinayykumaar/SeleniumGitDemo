package PropScreenshot;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
	    
	    driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	    
	    WebElement draggable =  driver.findElement(By.xpath("//*[@id='draggable']"));
	    
	    WebElement dropon =  driver.findElement(By.xpath("//*[@id='droppable']"));
	    
	    
	    act.dragAndDrop(draggable, dropon).build().perform();
	    
	
	    

	}

}
