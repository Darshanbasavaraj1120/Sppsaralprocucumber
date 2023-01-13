Feature: Create Company Functinality
	
  Scenario: Create new Company
    When Click on settings
    And Click on Add company
    Then User can view Add new Company page
    And Enter comapny details
    And click on save button
    Then Page header should show created company name
    And Page should be navigated to payroll setting
    And Enter Payroll Settings details, email settings details
    And click on save button
    And Add Paymonth from calendar
    And click on save button
    And Add Branch list details
    And click on save button
    Then Page should be navigated to PF settings enter PF details
    And Click on ESI settings
    And Enter ESI details
    #And click on save button
    #And Click on PT settings
    #And Enter PT details
    #And click on save button
    #And Click on LWF settings
    #And Enter LWF details
    #And click on save button
  
  
  Scenario: Verify Created company exist in Created comapany list
    When Click on settings
    And Click on company list
    And User should found company name in list