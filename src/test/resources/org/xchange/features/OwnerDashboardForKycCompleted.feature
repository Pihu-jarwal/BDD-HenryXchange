Feature: Owner dashboard for kyc completed feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+25@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_079
  Scenario: Verify the functionality of Name field with valid input while Submitting your application when KYC is done
    And User click on apply now button on owner dashboard page
    And User get the value of owner name input field on submit your application page
    And User clicks on profile icon on header
    And User clicks on account on market page
    Then Verify name should be auto filled with same details as displayed in account page

  @TC_M7_080
  Scenario: Verify functionality Name field when auto filled name edited with valid input while Submitting your application when KYC is done.
    And User click on apply now button on owner dashboard page
    And User get the value of owner name input field on submit your application page
    And User remove input field text "ownerName" on submit your application page
    And User enter owner name "testOwner" in input field on submit your application page
    Then Verify name should be changed, auto filled name replaced with name on submit your application page

  @TC_M7_084
  Scenario: Verify the functionality of Email field with valid input while Submitting your application when KYC is done
    And User click on apply now button on owner dashboard page
    And User get the value of owner email input field on submit your application page
    And User clicks on profile icon on header
    And User clicks on account on market page
    Then Verify email should be auto filled with same details as displayed in account page

  @TC_M7_085
  Scenario: Verify functionality of Email field when auto filled name edited with valid email when KYC is done
    And User click on apply now button on owner dashboard page
    And User get the value of owner email input field on submit your application page
    And User remove input field text "ownerEmail" on submit your application page
    And User enter email "muskan8+2@appinventiv.com" in input field on submit your application page
    Then Verify email should be changed, auto filled email replaced with email on submit your application page

  @TC_M7_086
  Scenario: Verify functionality of Email field when auto filled name is edited with invalid input while Submitting your application when KYC is done.
    And User click on apply now button on owner dashboard page
    And User remove input field text "ownerEmail" on submit your application page
    And User enter email "muskan.@com" in input field on submit your application page
    And User click on mobile number input field on submit your application page
    Then Verify error message should be displayed if any invalid email entered on submit your application page

  @TC_M7_081
  Scenario: Verify functionality of Name field when auto filled name edited with invalid input when KYC is done
    And User click on apply now button on owner dashboard page
    And User remove input field text "ownerName" on submit your application page
    And User click on business name input field on submit your application page
    Then Verify owner name field should be mandatory on submit your application page
    When User enter owner name "@#$%345" in input field on submit your application page
    Then Verify valid Name error message should displayed when invalid data entered in name field on submit your application page

  @TC_M7_091
  Scenario: Verify the functionality of auto fill Phone field when KYC is already completed
    And User click on apply now button on owner dashboard page
    And User get the mobile number in mobile number field on submit your application page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header
    Then Verify phone number should auto filled with same number used by user while completing KYC on submit your application page

  @TC_M7_105 @TC_M7_104
  Scenario: Verify the Apply Now button when all mandatory fields are filled while Submitting your application when KYC is not done or done
    And User click on apply now button on owner dashboard page
    Then Verify apply Now button should remain disabled if all mandatory fields unfilled on submit your application page
    #TC_M7_104
    When User click on aum input field on submit your application page
    And User click on dropdown option from aum input field on submit your application page
    And User click on number of properties input field on submit your application page
    And User click on dropdown option from number of properties field on submit your application page
    Then Verify apply Now button should active once all the mandatory fields on submit your application page



