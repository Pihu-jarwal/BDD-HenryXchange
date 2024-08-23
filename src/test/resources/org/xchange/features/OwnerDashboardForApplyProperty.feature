Feature: Owner dashboard for apply property

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+30@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_111
  Scenario: Verify the functionality of application under review displayed after the Application has been Submitted successfully
    Then Verify application is under review should displayed when application is submitted on owner dashboard page

