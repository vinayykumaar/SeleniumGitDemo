package POM;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "is successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "has Failed");
		System.out.println("Error message is "+result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("Test "+result.getTestClass() + result.getName()+ "was skipped");
		System.out.println("Error message is "+result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
