package testRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjects.AddcompanyPage;
import pageObjects.LoginPage;
import utilities.ReadConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/designationmaster.feature",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/Report.html","json:target/cucumber-report/reports.json"},
		publish=true
		)
public class TestRun {
	static ReadConfig readconfig=new ReadConfig();
	public static String br=readconfig.browser();
	public static String baseurl=readconfig.getApplicationURL();
	public static WebDriver driver;
	public static Properties configProp;
	public static Scenario scenario;
	


	@BeforeClass
	public static void setup() throws InterruptedException, IOException {
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp= new Properties();
		configProp.load(configPropfile);


		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver=new FirefoxDriver();	
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
			driver=new InternetExplorerDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver",configProp.getProperty("edgepath"));
			driver=new InternetExplorerDriver();
		}
		LoginPage lp= new LoginPage(driver);
		AddcompanyPage addcmp=new AddcompanyPage(driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(3000);
		lp.setusername(readconfig.getUsername());
		lp.setpassword(readconfig.getPassword());
		lp.clickbtnsignin();
		Thread.sleep(5000);
		Assert.assertEquals("Classification", addcmp.dashboarddisplayed());
	}
	@AfterClass()
	public static void teardown(){
		driver.quit();
		if (scenario.isFailed()) {
				String screeshotName=scenario.getName().replaceAll("", "_");
				byte [] sourcePath	=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcePath, "image/png", screeshotName);
		}
	}
}
	

	

