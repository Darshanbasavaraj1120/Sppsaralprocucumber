package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	@FindBy(name="username")
	@CacheLookup
	WebElement txtusername;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath="//button[contains(text(),' Sign In')]")
	@CacheLookup
	WebElement btnsignin;

	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-zoef60']")
	@CacheLookup
	WebElement btnpersonicon;

	@FindBy(id="logout")
	@CacheLookup
	WebElement btnlogout;

	
	public void setusername(String username) 
	{
		txtusername.clear();
		txtusername.sendKeys(username);
	}
	public void setpassword(String password) 
	{
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}
	public void clickbtnsignin() 
	{
		btnsignin.click();
	}
	public void clickbtnuser() 
	{
		btnpersonicon.click();
	}
	public void clickbtnlogout() 
	{
		btnlogout.click();
	}
}
