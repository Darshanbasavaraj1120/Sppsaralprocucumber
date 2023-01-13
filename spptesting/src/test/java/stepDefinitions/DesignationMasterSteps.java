package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import testRunner.TestRun;

public class DesignationMasterSteps {
	public static  WebDriver driver=TestRun.driver;
	public static  DesignationMasterSteps designation=new DesignationMasterSteps();
	@When("click on Emp")
	public void click_on_emp() {
		designation.click_on_emp();
	}
	@When("click on classifications")
	public void click_on_classifications() {
		designation.click_on_classifications();
	}

	@When("click on designation")
	public void click_on_designation() {
		designation.click_on_designation();

	}

//	@Then("page should should be navigated to designation")
//	public void page_should_should_be_navigated_to_designation() {
////		if (designation.click_on_designation().)
//
//	}

	@Then("click on Add designation")
	public void click_on_add_designation() {
		designation.click_on_add_designation();

	}

//	@Then("designation form should be displayed")
//	public void designation_form_should_be_displayed() {
//
//	}

	@Then("Enter designation name")
	public void enter_designation_name() {
		designation.setdesignationname("Tester");

	}

	private void setdesignationname(String string) {
	// TODO Auto-generated method stub
	
}
	@Then("click on save")
	public void click_on_save() {

	}

//	@Then("created designation should show in designation page")
//	public void created_designation_should_show_in_designation_page() {
//
//	}

}
