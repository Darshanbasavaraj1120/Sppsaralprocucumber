package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;



public class AddcompanyPage {
	public WebDriver ldriver;
	WaitHelper waithelper;
	Actions act;
	public AddcompanyPage(WebDriver rdriver)

	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper=new WaitHelper(ldriver);
		act=new Actions(ldriver);
	}
	@FindBy(xpath="//h5[@class=' MuiBox-root css-1uu2p54']")
	@CacheLookup
	WebElement verifydashboard;

	@FindBy(xpath="//small[contains(text(),'Setting')]/parent::div")
	WebElement btnsettings;

	@FindBy(xpath ="/html/body")
	WebElement scroll;

	//Add new Company
	@FindBy(xpath="//h6[contains(text(),'add company')]/parent::div")  
	WebElement lnkaddcompany;

	//Company details
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1rnjqk4']") 
	WebElement verifyaddcopmany;

	@FindBy(name="companyname")
	WebElement txtcompanyname;

	@FindBy(id="dateofestablishment")
	WebElement txtdateofestablishment;

	@FindBy(id="cinNumber")
	WebElement txtcinnumber;

	@FindBy(id="tan")
	WebElement txttannumber;

	@FindBy(id="website")
	WebElement txtwebsite;

	@FindBy(id="address")
	WebElement txtaddress;

	@FindBy(id="address2")
	WebElement txtaddress2;

	@FindBy(id="address3")
	WebElement txtaddress3;

	@FindBy(id="phonenumber1")
	WebElement txtphonenumber1;

	@FindBy(id="phonenumber2")
	WebElement txtphonenumber2;

	@FindBy(name="pf")
	WebElement btnpf;

	@FindBy(name="esi")
	WebElement btnesi;

	@FindBy(name="pt")
	WebElement btnpt;

	@FindBy(name="tds")
	WebElement btntds;

	@FindBy(name="lwf")
	WebElement btnlwf;

	@FindBy(xpath="//span[contains(text(),'Save')]/parent::button")
	WebElement btnsave;

	@FindBy(id="addNew-form-btn")
	WebElement btnsavegroup;

	@FindBy(xpath="//span[contains(text(),'Close')]//parent::button")
	WebElement btnclose;



	@FindBy(xpath="//h2[@class=' MuiBox-root css-xk13le']/child::div")
	WebElement verifycompanynameonheader;


	//payroll details
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit css-695zik']") 
	WebElement Verifypayrollsettings;

	@FindBy(id="mui-component-select-payCycle") 
	WebElement btncyclestartdate;

	@FindBy(id="netSalaryRoundoff")
	WebElement selnetsalaryroundoff;

	@FindBy(xpath="//li[contains(text(),'Actual')]")
	WebElement listnetsalaryroundoffasactual;

	@FindBy(xpath="//li[contains(text(),'Nearest Rupee')]")
	WebElement listnetsalaryroundoffasnearetrupee;

	@FindBy(xpath="//li[contains(text(),'Higher Rupee')]")
	@CacheLookup
	WebElement listnetsalaryroundoffashigherrupee;	

	@FindBy(id="leaveBasedOn")
	WebElement seleavebasedon;

	@FindBy(xpath="//li[contains(text(),'Calender Year')]")
	WebElement listcalendaryear;

	@FindBy(xpath="//li[contains(text(),'Financial Year')]")
	WebElement listfinancialyear;

	@FindBy(id="mui-component-select-joiningCutoffDay")
	WebElement btnpayrolldojcutoffdate;

	@FindBy(id="holidayBasedOn")
	WebElement selholidaysdefinedon;

	@FindBy(xpath="//li[contains(text(),'Attendance Master')]")
	WebElement listattendancemaster;

	@FindBy(xpath="//li[contains(text(),'Branch')]")
	WebElement listbranch;

	@FindBy(id="weeklyHolidayBasedOn")
	WebElement selweeklyholidaysdefinedon;


	//paymonth details
	@FindBy(id="monthyear")
	WebElement addpaymonth;

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1k8duoq']")
	WebElement btnaddpaymonthcalendar;


	//Branch details
	@FindBy(id="branchName")
	WebElement txtbranchname;

	@FindBy(id="stateId")
	WebElement selstate;

	@FindBy(id="pfGrpId")
	WebElement selpfgroup;

	@FindBy(xpath="//li[contains(text(),'Default')]")
	WebElement listdefault;

	@FindBy(xpath="(//div[contains(text(),'Select  Effective Month')])[1]")
	WebElement selpfeffectivemonth;

	@FindBy(id="esiGrpId")
	WebElement selesigroup;

	@FindBy(id="ptGrpId")
	WebElement selptgroup;

	@FindBy(id="lwfGrpId")
	WebElement sellwfgroup;

	@FindBy(xpath="//li[contains(text(),'Select  Effective Month')]/following-sibling::li[1]")
	WebElement listeffectivemonth;

	@FindBy(xpath="//span[@class='MuiSwitch-root MuiSwitch-sizeMedium css-1de6awt']")
	WebElement btnactive;


	//PF details
	@FindBy(xpath="//button[@aria-label='Add']") 
	WebElement btnadd;	

	@FindBy(id="pfGroupName")
	WebElement txtpfgroupname;

	@FindBy(id="pfNumber")
	WebElement txtpfnumber;

	@FindBy(id="extension")
	WebElement txtextensions;

	@FindBy(id="epf")
	WebElement txtepf;

	@FindBy(id="cutoff")
	WebElement txtcutoff;

	@FindBy(id="pensionFund")
	WebElement txtpensionfund;

	@FindBy(id="employerEpf")
	WebElement txtepfatob;

	@FindBy(id="roundOff")
	WebElement selroundoff;

	@FindBy(id="accountNumber02")
	WebElement txtaccountno02;

	@FindBy(id="accountNumber21")
	WebElement txtaccountno21;

	@FindBy(id="accountNumber22")
	WebElement txtaccountno22;

	@FindBy(id="restrictEmployerShare")
	WebElement chboxrestrictemployeershare;

	@FindBy(id="restrictEmployeeShareToEmployerShare")
	WebElement chboxrestrictemployeesharetoemployershare;

	@FindBy(xpath="//span[contains(text(),'Load Default Value')]//parent::button")
	WebElement btnloaddefaultvalue;

	@FindBy(id="PF_Form-btn")
	WebElement btnsavepf;


	//Esi details
	@FindBy(xpath="//button[contains(text(),'ESI Setting')]")
	WebElement tabesi;

	@FindBy(id="esiGroupName")
	WebElement txtesigroupname;

	@FindBy(id="esiNo")
	WebElement txtesinumber;

	@FindBy(id="esiLocalOffice")
	WebElement txtesilocaloffice;

	@FindBy(id="employeeRate")
	WebElement txtemployeerate;

	@FindBy(id="minimumLimitDailywage")
	WebElement txtminimumdailywage;

	@FindBy(xpath="//span[contains(text(),'Latest default rate')]//parent::button")
	WebElement btnlatestdefaultrate;


	//PT details
	@FindBy(xpath = "//span[contains(text(),'PT Setting')]//parent::button")
	WebElement tabpt;

	@FindBy(id="certificateNo")
	WebElement txtptcertificatenumber;

	@FindBy(id="ptoCircleNo")
	WebElement txtptocirclenumber;

	@FindBy(id="periodType")
	WebElement selperiod;

	@FindBy(id="minSalRange")
	WebElement txtfromsalary;

	@FindBy(id="maxSalRange")
	WebElement txttosalary;

	@FindBy(id="pt")
	WebElement txtpt;


	// lwf details
	@FindBy(id="lwfGroupName")
	WebElement lwfgroupname;



	//Actions Methods

	public void scrolltopage(Keys pageDown){
		scroll.sendKeys(pageDown);
	}

	public String dashboarddisplayed() {
		waithelper.WaitForElement(verifydashboard, 30);
		return verifydashboard.getText();
	} 
	public void clickonsettings() {
		btnsettings.click();
	}
	public void hoveronsettings() {
		act.moveToElement(btnsettings).perform();	
	}
	public void clickonaddcompany() {
		lnkaddcompany.click();
	}
	public void setcompanyname(String companyname) {
		txtcompanyname.click();
		txtcompanyname.sendKeys(companyname);
	}
	public void setdateofestablishment(String dateofestablishment) {
		txtdateofestablishment.sendKeys(dateofestablishment);
	}
	public void setcinnumber(String cinnumber) {
		txtcinnumber.sendKeys(cinnumber);
	}
	public void settannumber(String tannumber) {
		txttannumber.sendKeys(tannumber);;		
	}
	public void setwebsite(String website) {
		txtwebsite.sendKeys(website);	
	}
	public void setaddress1(String address1){
		txtaddress.sendKeys(address1);
	}
	public void setaddress2(String address2){
		txtaddress2.sendKeys(address2);
	}
	public void setaddress3(String address3){
		txtaddress3.sendKeys(address3);
	}
	public void setphone1(String phone1){
		txtphonenumber1.sendKeys(phone1);
	}
	public void setphone2(String phone2){
		txtphonenumber1.sendKeys(phone2);
	}
	public void Clickonsavebutton() throws InterruptedException {
		waithelper.WaitForElement(btnsave, 30);
		btnsave.click();
	}
	public void selectapplicable() {
		btnpf.click();
		btnesi.click();
		btnpt.click();
		btntds.click();
		btnlwf.click();
	}
	public String tabaddcompanyverify() {
		return verifyaddcopmany.getText();
	}
	public String companycreateddisplayed() {
		return verifycompanynameonheader.getText();
	}
	public String payrollsettingsdisplayed() {
		return Verifypayrollsettings.getText();
	}
	public void selectpaycyclestartdate(int date) throws InterruptedException {
		btncyclestartdate.click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//li[contains(text(),"+date+")]")).click();
	}
	public void selectnetsalaryroundoff(String role) throws InterruptedException
	{
		selnetsalaryroundoff.click();
		WebElement listitem;
		Thread.sleep(2000);
		if(role.equals("Actual"))
		{
			listitem=listnetsalaryroundoffasactual;
		}
		else if(role.equals("Nearest Rupee"))
		{
			listitem=listnetsalaryroundoffasnearetrupee;
		}
		else 
		{
			listitem=listnetsalaryroundoffashigherrupee;
		}
		listitem.click();
	}
	public void selectleavedefinedon(String role) throws InterruptedException
	{
		seleavebasedon.click();
		WebElement listitem;
		Thread.sleep(2000);
		if(role.equals("Calender Year"))
		{
			listitem=listcalendaryear;
		}
		else
		{
			listitem=listfinancialyear;
		}
		listitem.click();
	}
	public void selectpayrolldojcuttoffdate(int date) throws InterruptedException {
		btnpayrolldojcutoffdate.click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//li[contains(text(),"+date+")]")).click();
	}
	public void selectholidaysdefinedon(String field, String role) throws InterruptedException
	{
		if(field.equals("Holiday"))
		{
			selholidaysdefinedon.click();
		}
		else
			selweeklyholidaysdefinedon.click();
		WebElement listitem;
		Thread.sleep(2000);
		if(role.equals("Attendance Master"))
		{
			listitem=listattendancemaster;
		}
		else
		{
			listitem=listbranch;
		}
		listitem.click();
	}
	public void setpaymonthdate(String year,String month) throws InterruptedException {
		waithelper.WaitForElement(btnaddpaymonthcalendar, 30);
		btnaddpaymonthcalendar.click();
		ldriver.findElement(By.xpath("//button[contains(text(),'"+year+"')]")).click();
		Thread.sleep(3000);
		ldriver.findElement(By.xpath("//button[contains(text(),'"+month+"')]")).click();
	}
	public void setbranchname(String branchname) throws InterruptedException {
		Thread.sleep(3000);
		txtbranchname.sendKeys(branchname);
	}
	public void setbranstate(String state) throws InterruptedException {
		selstate.click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//li[contains(text(),'"+state+"')]")).click();
	}
	public void selectpfgroup() {
		selpfgroup.click();
		listdefault.click();
	}
	public void selectesigroup() {
		selesigroup.click();
		listdefault.click();
	}
	public void selectptgroup() {
		selptgroup.click();
		listdefault.click();
	}
	public void selectlwfgroup() {
		sellwfgroup.click();
		listdefault.click();
	}
	public void selecteffectivemonth() {
		for(int i=1;i<=4;i++)
		{
			selpfeffectivemonth.click();
			listeffectivemonth.click();
		}
	}
	public void pfdetails() throws InterruptedException {
		waithelper.WaitForElement(btnadd, 30);
		btnadd.click();
	}
	public void clickonaddgroup() {
		waithelper.WaitForElement(btnadd, 30);
		btnadd.click();
	}
	public void setpfgroupname(String pfgroupname) {
		txtpfgroupname.sendKeys(pfgroupname);
	}
	public void setpfnumber(String pfnumber) {
		txtpfnumber.sendKeys(pfnumber);
	}		
	public void clickonsavegroup() {
		btnsavegroup.click();
	}
	public void setepf(String epf) {
		waithelper.WaitForElement(txtcutoff, 30);
		txtepf.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		txtepf.sendKeys(epf);
	}
	public void setcuttoff(String cutoff) {
		waithelper.WaitForElement(txtcutoff, 30);
		txtcutoff.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		txtcutoff.sendKeys(cutoff);
	}
	public void clickonesitab() {
		tabesi.click();
	}
	public void setesigroupname(String esigroupname) {
		txtesigroupname.sendKeys(esigroupname);
	}
	public void setesinumber(String esinumber) {
		txtesinumber.sendKeys(esinumber);
	}
	public void setesilocaloffice(String esilocaloffice) {
		txtesilocaloffice.sendKeys(esilocaloffice);
	}
	public void setemployeerate(String employeerate) {
		waithelper.WaitForElement(txtemployeerate, 30);
		txtemployeerate.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		txtemployeerate.sendKeys(employeerate);
	}
	public void clickonptsettings() {
		tabpt.click();
	}
}

