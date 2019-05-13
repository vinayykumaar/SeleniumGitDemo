package excelpoi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoLogin {
	
	 WebDriver driver;
	 File FRead;
	 XSSFWorkbook wb;
	 XSSFSheet sh;
	 String d1, d2;
	
  @Test
  public void f() {
	
	  
		/*driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vinsample@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Nirmalati");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();*/
	  System.out.println("The Username Column is "+ d1 +"And Password Column is "+ d2);
  }
  
  @BeforeTest
  public void beforeTest() throws InvalidFormatException, IOException {
	  
	  FRead = new File("C:\\Vinay\\ReadWriteExcel.xlsx");
	  wb = new XSSFWorkbook(FRead);
	  sh = wb.getSheetAt(0);
	  d1 = sh.getRow(0).getCell(0).getStringCellValue();
	  d2 = sh.getRow(0).getCell(0).getStringCellValue();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	
	driver.close();
	
  }

}
