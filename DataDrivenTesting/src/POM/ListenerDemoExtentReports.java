package POM;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenerDemoExtentReports implements ITestListener {

	
	protected static WebDriver driver;
	protected static ExtentReports reports;
	protected static ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "has started");
		
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName()+" Test has Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ " is successful");
		
		test.log(LogStatus.PASS, result.getMethod().getMethodName()+" Test has Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "has Failed");
		System.out.println("Error message is "+result.getThrowable());
		
		test.log(LogStatus.FAIL, result.getMethod().getMethodName()+" Test has Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "was skipped");
		System.out.println("Error message is "+result.getThrowable());
		
		test.log(LogStatus.SKIP, result.getMethod().getMethodName()+" Test has Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------------------------------");
		System.out.println("On Start");
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		reports = new ExtentReports("C:\\Vinay\\DataDrivenTesting\\src\\POM\\test_"+ new  SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date())+ "Reports.html");
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		driver.close();
		reports.endTest(test);
		reports.flush();
		
	}

	
	
}
