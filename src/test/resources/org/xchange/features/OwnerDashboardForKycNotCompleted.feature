Feature: Owner dashboard feature for kyc not completed

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+26@appinventiv.com
    And User enters a password on login page in input field - Muskan@123456
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_073 @TC_M7_074 @TC_M7_075 @TC_M7_076
  Scenario: Verify that user should able to navigate to Owner dashboard page
    Then Verify user should be redirected successfully to Owner Dashboard page
      #TC_M7_074
    And User able to view placeholder text on owner dashboard page
    And User able to vie apply button on owner dashboard page
      #TC_M7_075
    When User click on apply now button on owner dashboard page
    Then User should be navigated to "Submit Your Application" page
      #TC_M7_076
    When User click on owner name field on submit your application page
    And User click on owner email input field on submit your application page
    Then Verify owner name field should be mandatory on submit your application page
    When User click on mobile number input field on submit your application page
    Then Verify owner email field should be mandatory on submit your application page
    When User click on business name input field on submit your application page
    Then Verify owner contact field should be mandatory on submit your application page
    When User click on aum input field on submit your application page
    And User click on business name input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify Aum input field should be mandatory on submit your application page
    When User click on number of properties input field on submit your application page
    And User click on business name input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify number of properties field should be mandatory on submit your application page
    And Verify business name input field should be optional on submit your application page

  @TC_M7_077
  Scenario: Verify functionality of Name field with valid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User click on owner name field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify owner name field should be mandatory on submit your application page
    And Verify characters UpTo 64 characters in name input field on submit your application page

  @TC_M7_078
  Scenario: Verify the functionality of Name field with invalid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User click on owner name field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify owner name field should be mandatory on submit your application page
    When User enter owner name "@#$%345" in input field on submit your application page
    Then Verify valid Name error message should displayed when invalid data entered in name field on submit your application page
    When User remove input field text "ownerName" on submit your application page
    And User enter less than 2 character "W" in owner name input field on submit your application page
    Then Verify valid Name error message should displayed when invalid data entered in name field on submit your application page

  @TC_M7_082
  Scenario: Verify functionality of Email field with valid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User click on owner email input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify owner email field should be mandatory on submit your application page
    When User enter email "muskan.trivedi8+2@appinventiv.com" in input field on submit your application page
    Then User should be type valid email address in email field on submit your application page

  @TC_M7_083
  Scenario: Verify functionality of Email field with invalid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User enter email "muskan.@com" in input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify error message should be displayed if any invalid email entered on submit your application page

  @TC_M7_087
  Scenario: Verify functionality of Phone Number with valid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User click on mobile number input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify owner contact field should be mandatory on submit your application page
    When User enter mobile number "8372638223" in input field on submit your application page
    And User able to view a green check mark in mobile number input field on submit your application page

  @TC_M7_088
  Scenario: Verify the functionality of Phone Number field with invalid input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User enter mobile number "83726382" in input field on submit your application page
    And User click on business name input field on submit your application page
    Then User able to view error message when enters less than 10 digit number in input field on submit your application page
    When User remove input field text "ownerContact" on submit your application page
    And User enter mobile number "677-767, 876-878-87" in input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify error message should displayed on entering invalid Mobile number on submit your application page

  @TC_M7_089
  Scenario: Verify the functionality of Phone Number field with no input while Submitting your application when KYC is not done
    And User click on apply now button on owner dashboard page
    And User click on mobile number input field on submit your application page
    And User click on owner email input field on submit your application page
    Then Verify owner contact field should be mandatory on submit your application page

  @TC_M7_092
  Scenario: Verify the functionality of Business Name (Optional) field while Submitting your application when KYC is not done or done.
    And User click on apply now button on owner dashboard page
    And User enter business name "ABC, 123, $%^" in input field on submit your application page
    Then Verify All input values should be accepted in business input field on submit your application page

  @TC_M7_093 @TC_M7_094 @TC_M7_095 @TC_M7_096 @TC_M7_097
  Scenario: Verify the functionality of Business Name (Optional) field while Submitting your application when KYC is not done or done
    And User click on apply now button on owner dashboard page
    And User enter business name "A" in input field on submit your application page
    And User click on mobile number input field on submit your application page
    Then User should able to view validation message when enter less than 2 character in business field
        #TC_M7_094
    When User click on aum input field on submit your application page
    Then Verify aum dropdown should be visible when I click on aum field on submit your application page
    #TC_M7_095
    And User should be able to view aum field dropdown options on submit your application page
    #TC_M7_096
    Then Verify 6 options displayed in aum drop down on submit your application page
    #TC_M7_097
    When User click on dropdown option from aum input field on submit your application page
    And Verify aum option should be selected and displayed in aum field on submit your application page

  @TC_M7_098
  Scenario: Verify the AUM field when no option is selected from drop down while Submitting your application when KYC is not done or done
    And User click on apply now button on owner dashboard page
    And User click on aum input field on submit your application page
    And User click on business name input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify Aum input field should be mandatory on submit your application page

  @TC_M7_099 @TC_M7_100 @TC_M7_101 @TC_M7_102
  Scenario: Verify the drop down of Number Of Properties field while Submitting your application when KYC is not done or done
    And User click on apply now button on owner dashboard page
    And User click on number of properties input field on submit your application page
    Then Verify number of properties dropdown should be visible on submit your application page
      #TC_M7_100
    And User should be able to view number of properties option should be visible on submit your application page
         #TC_M7_101
    Then Verify 4 options displayed in number of properties drop down on submit your application page
        #TC_M7_102
    When User click on dropdown option from number of properties field on submit your application page
    Then Verify number of properties option should be selected and displayed in field on submit your application page

  @TC_M7_103
  Scenario: Verify Number Of Properties field when no option is selected from drop down when KYC is not done or done
    And User click on apply now button on owner dashboard page
    When User click on number of properties input field on submit your application page
    And User click on business name input field on submit your application page
    And User click on business name input field on submit your application page
    Then Verify number of properties field should be mandatory on submit your application page

  @TC_M7_106
  Scenario: Verify Apply Now button when all mandatory fields are filled with invalid input when KYC is not done or done
    And User click on apply now button on owner dashboard page
    And User enter name "testtest" in input field on submit your application page
    And User enter mobile number "83524383" in input field on submit your application page
    And User enter email "muskan.trivedi8+8appinventiv.com" in input field on submit your application page
    And User click on aum input field on submit your application page
    And User click on dropdown option from aum input field on submit your application page
    And User click on number of properties input field on submit your application page
    And User click on dropdown option from number of properties field on submit your application page
    Then Verify apply Now button should disabled if mandatory fields are invalid on submit your application page

  @TC_M7_090
  Scenario: Verify functionality of Phone Number field when same number associated with another account is entered when KYC is not done
    And User click on apply now button on owner dashboard page
    And User enter mobile number "8295708475" in input field on submit your application page
    Then Verify no error message should displayed on entering existing mobile number on submit your application page
