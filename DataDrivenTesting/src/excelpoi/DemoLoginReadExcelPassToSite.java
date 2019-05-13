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

public class DemoLoginReadExcelPassToSite {
	
	 WebDriver driver;
	 File FRead;
	 XSSFWorkbook wb;
	 XSSFSheet sh;
	 String d1, d2, login, pwd, webmsg;
	
  @Test
  public void f() {
	
	  System.out.println("The Username Column is "+ d1 + " and Password Column is "+ d2);
	  
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();  
		webmsg = driver.findElement(By.xpath("//a[@class='account']")).getText();
		System.out.println(webmsg);
		
		System.out.println("The Username used is "+ login);
		System.out.println("The Password used is "+ pwd);
		System.out.println("The Webmessage for user login is "+ webmsg);
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
	  
	  login = sh.getRow(1).getCell(0).getStringCellValue();
	  pwd = sh.getRow(1).getCell(1).getStringCellValue();
	  
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	wb.close();  
	driver.findElement(By.xpath("//a[@class='ico-logout']"));
	driver.close();
	
  }

}
