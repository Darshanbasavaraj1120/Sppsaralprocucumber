package stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.AddcompanyPage;
import pageObjects.SearchCompanyInlist;
import testRunner.TestRun;


public class AddCompanySteps extends BaseClass{

	public static WebDriver driver=TestRun.driver;

	String companyname="Arun Constructions ltd";
	
	@Before
	public void log() throws IOException, InterruptedException
	{
		logger=Logger.getLogger("SPP Testing");
		PropertyConfigurator.configure("Log4j.properties");
	}

//	Add New company  step definitions

	@When("Click on settings")
	public void click_on_settings() {
		addcmp=new AddcompanyPage(driver);
		logger.info("********Clicking on settings********");
		addcmp.clickonsettings();
	}

	@Then("Click on Add company")
	public void click_on_Add_company() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********Clicking on Add company********");
		addcmp.clickonaddcompany();
	}
	
	@Then("User can view Add new Company page")
	public void User_can_view_Add_new_Company_page() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********Verifyning Navigated to Add comany page or not********");
		Assert.assertEquals("Add Company", addcmp.tabaddcompanyverify());
	}

	@Then("Enter comapny details")
	public void enter_comapny_details() {
		logger.info("********Entering company details********");
		addcmp.setcompanyname(companyname);
		addcmp.setdateofestablishment("20/07/1996");
		addcmp.settannumber("BLRL03775C");
		addcmp.setaddress1("Rajajinagar");
		addcmp.setphone1("9808767688");
	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		logger.info("********Clicking on savebuttton********");
		addcmp.Clickonsavebutton();
		Thread.sleep(3000);
	}
	@Then("Page header should show created company name")
	public void Page_header_should_show_created_company_name() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(companyname, addcmp.companycreateddisplayed());	
	}

	@And("Page should be navigated to payroll setting")
	public void page_should_be_navigated_to_payroll_setting() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals("Payroll Setting", addcmp.payrollsettingsdisplayed());
	}

	@Then("Enter Payroll Settings details, email settings details")
	public void enter_Payroll_Settings_details_email_settings_details() throws InterruptedException {
		addcmp.selectpaycyclestartdate(15);
		addcmp.selectnetsalaryroundoff("Nearest Rupee");
		addcmp.selectleavedefinedon("Calender Year");
		addcmp.selectpayrolldojcuttoffdate(10);
		addcmp.selectholidaysdefinedon("Holiday", "Attendance Master");
		addcmp.selectholidaysdefinedon("weekly", "weekly");
	}

	@Then("Add Paymonth from calendar")
	public void add_Paymonth_from_calendar() throws InterruptedException {
		addcmp.setpaymonthdate("2022","Jan");
	}

	@Then("Add Branch list details")
	public void add_Branch_list_details() throws InterruptedException {
		addcmp.setbranchname("Banglore Branch");
		addcmp.setbranstate("Karnataka");
		addcmp.setaddress1("Mahalakshmi Layout");
		addcmp.selectpfgroup();
		addcmp.selectesigroup();
		addcmp.selectptgroup();
		addcmp.selectlwfgroup();
		addcmp.selecteffectivemonth();
	}

	@Then("Page should be navigated to PF settings enter PF details")
	public void page_should_be_navigated_to_PF_settings_enter_PF_details() throws InterruptedException {
		addcmp.pfdetails();
		addcmp.clickonaddgroup();
		addcmp.setpfgroupname("Banglore pf");
		addcmp.setpfnumber("TNMAS00313100000000069");
		addcmp.setaddress1("Chord Road");
		addcmp.clickonsavegroup();
		addcmp.setepf("10");
		addcmp.setcuttoff("20000");
	}

	@Then("Click on ESI settings")
	public void click_on_ESI_settings() {
		addcmp.clickonesitab();
	}

	@Then("Enter ESI details")
	public void enter_ESI_details() throws InterruptedException {
		addcmp.clickonaddgroup();
		addcmp.setesigroupname("Group A");
		addcmp.setaddress1("Rajajinagar");
		addcmp.setesinumber("6756238");
		addcmp.setesilocaloffice("Banglore");
		addcmp.clickonsavegroup();
		addcmp.setcuttoff("12000");
		addcmp.setemployeerate("0.50");
		addcmp.selectnetsalaryroundoff("Actual");
	}

	@Then("Click on PT settings")
	public void click_on_PT_settings() {
		addcmp.clickonptsettings();
	}

	@Then("Enter PT details")
	public void enter_PT_details() {
		
	}

//	@Then("Click on LWF settings")
//	public void click_on_LWF_settings() {
//	}

//	@Then("Enter LWF details")
//	public void enter_LWF_details() {
//	}


	@Then("Click on company list")
	public void click_on_company_list() throws InterruptedException {
		searchcmp= new SearchCompanyInlist(driver);
		logger.info("********Clicking on Company list********");
		Thread.sleep(3000);
		searchcmp.clickoncompanylist();
	}

	@Then("User should found company name in list")
	public void user_should_found_company_name_in_list() throws InterruptedException {
		Thread.sleep(30000);
		logger.info("********Verifying company exist in list or not********");
		boolean status=searchcmp.SearchComapnyByUsername(companyname);
		Assert.assertEquals(true, status);
	}	
}
