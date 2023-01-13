package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcompanyPage;
import pageObjects.LoginPage;
import pageObjects.SearchCompanyInlist;
import utilities.WaitHelper;

public class BaseClass {

	public static WebDriver driver;
	public LoginPage lp;
	public AddcompanyPage addcmp;
	public SearchCompanyInlist searchcmp;
	public static Logger logger;
	public Properties configProp;
	public WaitHelper wait;
	//Created for generating random string for unique company name
	public static String randomstring() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
	}	
}
