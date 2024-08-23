@PropertyPage
Feature: Property detail feature for level1 user

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page

  @TC_M3_003
  Scenario: Verify the functionality of all level 1 user to view and perform action
    And User enters a email in input field on login screen muskan.trivedi8+14@appinventiv.com
    And User enters a password in input field on login screen Muskan@12345
    And User clicks on enter button on login page
    And User clicks on market tab on KYC page
    And User is on market page
    And User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    Then Financial- not able to view Financial section, section got blurred and have locked icon on property detail page
    And Document- not able to view Document section, section got blurred and have locked icon on property detail page
    And Similar property - Not able to view Similar property section, section got blurred and have locked icon on property detail page
