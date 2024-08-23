Feature: Owner dashboard feature for no listed property

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+38@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_117
  Scenario: Verify the functionality of count of Listed Properties when there is no property in Owner Dashboard
    Then Verify No count should be displayed when there is no property included on owner dashboard
