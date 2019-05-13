package PropScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
import java.util.Date;


public class KeyDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fi = new FileInputStream("C:\\Vinay\\DataDrivenTesting\\src\\PropScreenshot\\keyDriven.properties");
		Properties p = new Properties();
		p.load(fi);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get((p.getProperty("url")));
		driver.manage().window().maximize();
		
		driver.findElement(By.id(p.getProperty("un"))).sendKeys(p.getProperty("keyun"));
		driver.findElement(By.id(p.getProperty("pwd"))).sendKeys(p.getProperty("keypwd"));
		driver.findElement(By.xpath(p.getProperty("login"))).click();
		
		String filePath;
		
		
		//for getting filepath from user where screenshot needs to be copied
		//Scanner sc = new Scanner(System.in);
		//filePath = sc.next();
		
		//for taking screenshot
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File(filePath));
		FileUtils.copyFile(src, new File("C:\\Vinay\\Demo"+timestamp()+".png"));
		
		driver.close();
		
	}

	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
