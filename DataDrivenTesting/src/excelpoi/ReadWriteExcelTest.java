package excelpoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vinsample@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Nirmalati");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
	}

}
