Feature: Login Functinality

  Scenario: Successful Login wih valid credentials
    Given User Launch Chrome browser
    When User opens URL "http://spp.saral.pro/login"
    And User enters Username as "Superadmin" and Password as "Superadmin@S9"
    And Click on Login
    Then Page Titile should be "SPP"
    When User click on Log out link
    Then Page Titile should be "SPP"
    
   Scenario Outline: Login Data driven
    Given User Launch Chrome browser
    When User opens URL "http://spp.saral.pro/login"
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    Then Page Titile should be "SPP"
    When User click on Log out link
    Then Page Titile should be "SPP"
    
    Examples:
				| username | password |
				| Superad  | Superadmin@S9|
				|Superadmin | Superadmin|
