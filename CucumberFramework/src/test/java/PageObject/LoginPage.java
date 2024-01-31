package PageObject;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.Layout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
	ldriver=rDriver;
	
	PageFactory.initElements(rDriver,this );
	}
	
	 
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement LogoutBtn;
	
	public void enterEmail(String Emailadd)
	{
		email.clear();
		email.sendKeys(Emailadd);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
		public void clickonLoginButton()
		{
			LoginBtn.click();
	
		}
			public void clickonLogoutButton()
			{
				LogoutBtn.click();
		
    

			}}
	
	
