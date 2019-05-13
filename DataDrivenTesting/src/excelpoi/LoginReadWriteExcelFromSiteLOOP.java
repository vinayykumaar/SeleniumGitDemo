package excelpoi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginReadWriteExcelFromSiteLOOP {
	
	 WebDriver driver;
	 FileInputStream FRead;
	 FileOutputStream FWrite;
	 //File FRead;
	 XSSFWorkbook wb;
	 XSSFSheet sh;
	 String d1, d2, login, pwd, webmsg;
	 String xlmsg;
	 String pass ="Test is Passed";
	 String fail ="Test is Failed";
	 int rowval, rowcount;
	 
	
  @BeforeTest
  public void beforeTest() throws InvalidFormatException, IOException {
		  
		  FRead = new FileInputStream("C:\\Vinay\\ReadWriteExcel.xlsx");
		  wb = new XSSFWorkbook(FRead);
		  sh = wb.getSheetAt(0);
		 // d1 = sh.getRow(0).getCell(0).getStringCellValue();
		 // d2 = sh.getRow(0).getCell(1).getStringCellValue();
		  rowcount=sh.getPhysicalNumberOfRows();
	  }
	  
  @Test
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	 
	  
	  for(rowval=1;rowval<rowcount;rowval++) {
		  
		  login = sh.getRow(rowval).getCell(0).getStringCellValue();
		  pwd = sh.getRow(rowval).getCell(1).getStringCellValue();
		  xlmsg = sh.getRow(rowval).getCell(2).getStringCellValue();
		  
		    driver.get("http://demowebshop.tricentis.com/login");
			driver.findElement(By.xpath("//input[@class='email']")).sendKeys(login);
			driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();  
			Thread.sleep(1000);
			webmsg = driver.findElement(By.xpath("//a[@class='account']")).getText();
			
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			
			Thread.sleep(1000);
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Login Id used is "+ login);
			System.out.println("Passeord used is "+ pwd);
			System.out.println("The username used is "+ webmsg);
			
			
			FWrite = new FileOutputStream("C:\\Vinay\\ReadWriteExcel.xlsx");
		
			sh.getRow(rowval).createCell(3).setCellValue(webmsg);
			
			
			if(webmsg.equals(xlmsg))
			{
				System.out.println(pass);
				sh.getRow(rowval).createCell(4).setCellValue(pass);
			}
			else
			{
				System.out.println(fail);
				sh.getRow(rowval).createCell(4).setCellValue(fail);
			}
			wb.write(FWrite);
			
			
	  }	
		
		 
  }
 

 @org.testng.annotations.AfterTest
  public void AfterTest() throws Exception {
	  wb.close();
	  driver.close();
  }
  }
  
  

