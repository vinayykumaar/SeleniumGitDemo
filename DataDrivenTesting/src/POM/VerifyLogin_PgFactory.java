package POM;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

@SuppressWarnings("deprecation")
public class VerifyLogin_PgFactory extends ListenerDemoExtentReports {
	WebDriver d;
	Properties p;
	FileInputStream fi;
	Login_PageFactory LogFact;
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  fi = new FileInputStream("Src/POM/LoginData.properties");
	  p  = new Properties();
	  p.load(fi);
	  
	  }
	
	
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {
	  
	  d = ChooseDriver.Use("c");
	  d.manage().window().maximize();
	  d.get(p.getProperty("url"));
	  
	  LogFact = PageFactory.initElements(d, Login_PageFactory.class);
	  
	  LogFact.inputCredentials(p.getProperty("un"), p.getProperty("pwd"));
	  Thread.sleep(1000);
	 
	  Assert.assertEquals(LogFact.getLoginInfo(), p.getProperty("un"));
	  

	  System.out.println("Test is passed");
	  
	  LogFact.exit();
	  
	  
  }
 

}
