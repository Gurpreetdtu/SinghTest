package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public WebDriver driver;
    public LoginPage loginpg;
     
	@Given("user Launch chrome browser")
	public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver() ;
	 
	 loginpg = new LoginPage(driver);
	  
	}  
	@When("user open URL https:\\/\\/admin-demo.nopcommerce.com\\/login?ReturnUrl=%2Fadmin%2F")
	public void user_open_url_https_admin_demo_nopcommerce_com_login_return_url_2fadmin_2f() {
	  driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	  
	}
    @When("user enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String emailadd, String password) {
	   loginpg.enterEmail(emailadd); 
	   loginpg.enterPassword(password);
	}

	@When("click to login")
	public void click_to_login() {
	   loginpg.clickonLoginButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		String actualtitle = driver.getTitle();
		
		if(actualtitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
			
		}
		else
		{	
			Assert.assertTrue(false);
	}}

	@When("Click on logout link")
	public void click_on_logout_link() {
		loginpg.clickonLogoutButton();
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be1(String string) {
	    
	}

	@Then("close Browser")
	public void close_browser() {
		
		driver.close();
	driver.quit();
	    
	}


}
