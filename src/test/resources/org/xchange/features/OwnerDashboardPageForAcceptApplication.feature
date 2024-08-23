Feature: Owner dashboard for accepted application form

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+32@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_114
  Scenario: Verify the UI of Owner Dashboard when application is accepted by Henry Team
    Then Verify User able to view placeholder text on owner dashboard page
    And Verify User able to view listed placeholder text on owner dashboard page
    And Verify don't have properties text on owner dashboard page