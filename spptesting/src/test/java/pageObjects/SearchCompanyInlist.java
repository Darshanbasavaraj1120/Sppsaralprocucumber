package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCompanyInlist {
	public WebDriver ldriver;
	WaitHelper waithelper;
	public SearchCompanyInlist(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper=new WaitHelper(ldriver);
	}
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-7ttn0o'])[1]")
	@CacheLookup
	WebElement btncompanylist;
	@FindBy(xpath ="//div[@class='MuiPaper-root MuiPaper-outlined MuiPaper-rounded MuiMenu-paper MuiPaper-root MuiPaper-outlined MuiPaper-rounded MuiPopover-paper css-12vn35a']")
	@CacheLookup
	WebElement btnselectcompany;
	@FindBy(xpath ="//div[@class='MuiPaper-root MuiPaper-outlined MuiPaper-rounded MuiMenu-paper MuiPaper-root MuiPaper-outlined MuiPaper-rounded MuiPopover-paper css-12vn35a']/child::ul/child::li")
	@CacheLookup
	List<WebElement> allcompaniesdetails;
	
//Actions method
	public void clickoncompanylist() {
		btncompanylist.click();	
	}
	public boolean SearchComapnyByUsername(String username)
	{
		boolean flag=false;
		for(WebElement webelement:allcompaniesdetails)
		{
			System.out.println(allcompaniesdetails.size());
			String companies= webelement.getText();
			System.out.println(companies);
			if(companies.equals(username))
				{
					flag= true;
				}
		}
		return flag;
		
	}
}
