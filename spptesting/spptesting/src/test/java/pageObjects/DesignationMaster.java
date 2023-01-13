package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesignationMaster {
	
	
	@FindBy(xpath = "//small[contains(text(),'Emp')]/parent::div")
	WebElement empicon;
	
	@FindBy(xpath = "//h6[contains(text(),'classifications')]/parent::div")
	WebElement classificatiosection;
	
	@FindBy(xpath = "//button[contains(text(),'Designation')]")
	WebElement designationlink;
	
	@FindBy(xpath = "//span[contains(text(),'Add Designation')]/parent::button")
	WebElement adddesignationbutton;
	
	@FindBy(id="designationName")
	WebElement txtdesignationname;
	
	@FindBy(id="Designation-btn")
	WebElement btnsave;
	
	@FindBy(xpath = "//td[contains(text(),'Tester')]")
	WebElement verifydesignation;
	
	
	
	public void clickonemp() {
		empicon.click();
	}

	public void clickonclassification() {
		classificatiosection.click();
	}
	public String clicckondesignation() {
		return designationlink.getText();	
	}
	public void clickonadddesignation() {
		adddesignationbutton.click();
	}
	public void setdesignationname(String des) {
		txtdesignationname.sendKeys(des);
	}
	public void clickondesignationsave() {
		btnsave.click();
	}
	public String verifydesignationcreated() {
		return verifydesignation.getText();
	}
}
