package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoGrid {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
     DesiredCapabilities dc = new DesiredCapabilities();
     dc.setBrowserName("chrome");
     dc.setPlatform(Platform.ANY);
     
     WebDriver d = new RemoteWebDriver(new URL("http://10.216.139.23:4444/wd/hub"),dc);
     
     d.get("http://demowebshop.tricentis.com/login");
     Thread.sleep(1000);
     
	 d.findElement(By.name("Email")).sendKeys("vinsample@gmail.com");
	 d.findElement(By.name("Password")).sendKeys("Nirmalati");
	 
	 d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	 
	 Thread.sleep(2000);
	 
	 d.close();
		
	}

}
