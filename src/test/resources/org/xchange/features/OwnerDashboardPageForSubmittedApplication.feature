Feature: Owner dashboard for submitted application form

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+36@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page


  @TC_M7_108 @TC_M7_109 @TC_M7_110
  Scenario: Verify the UI of Application Submitted success pop up
    And User click on apply now button on owner dashboard page
    And User click on aum input field on submit your application page
    And User click on dropdown option from aum input field on submit your application page
    And User click on number of properties input field on submit your application page
    And User click on dropdown option from number of properties field on submit your application page
    And User click on apply now button on submit your application page
    Then Verify application submitted form should be visible on owner dashboard page
     #TC_M7_109
    And Verify application placeholder text should be visible on owner dashboard page
     #TC_M7_110
    And Verify user should be redirected successfully to Owner Dashboard page

