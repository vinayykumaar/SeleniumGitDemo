package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_PageFactory {
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using="Email")
	WebElement UName;
	
	@FindBy(how=How.ID, using="Password")
	WebElement Password;
	
	@FindBy(how=How.CSS, using="input[value='Log in']")
	WebElement Login_btn;
	
	@FindBy(how=How.CSS, using="a.account")
	WebElement Get_name;
	
	@FindBy(how=How.XPATH, using="//a[@class='ico-logout']")
	WebElement LogOut;
	
	
	
	
	public void inputCredentials(String un, String pwd)
	{
		UName.sendKeys(un);
		Password.sendKeys(pwd);
		
		Login_btn.click();
		
	}
	
	public String getLoginInfo()
	{
		String name = Get_name.getText();
		return name;
	}
	
	public void exit()
	{
		LogOut.click();
		driver.close();
	}
	
	public Login_PageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
}
