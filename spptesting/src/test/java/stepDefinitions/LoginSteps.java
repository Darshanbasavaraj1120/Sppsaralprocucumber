package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import testRunner.TestRun;
import utilities.ReadConfig;


public class LoginSteps extends BaseClass{
	ReadConfig readconfig=new ReadConfig();
	public String br=readconfig.browser();
	public String baseurl=readconfig.getApplicationURL();
	public static WebDriver rdriver;
	
	public static WebDriver driver=TestRun.driver;

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_Username_as_and_password_as(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		lp= new LoginPage(driver);
		logger.info("********Entering companyname and Password********");
		lp.setusername(username);
		lp.setpassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		logger.info("********Clicking on signin********");
		lp.clickbtnsignin();
	}

	@Then("Page Titile should be {string}")
	public void page_titile_should_be(String title) throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********Verifying page title********");
		if(driver.getPageSource().contains("Invalid credential"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********Clicking on logout********");
		lp.clickbtnuser();
		lp.clickbtnlogout();
	}
}
