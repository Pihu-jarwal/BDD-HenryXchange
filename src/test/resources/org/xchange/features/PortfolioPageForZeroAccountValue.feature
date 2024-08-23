@PortfolioDetailPage
Feature: Portfolio page feature for zero account value

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+14@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on portfolio tab on market page

  @TC_M4_002
  Scenario: Verify the UI of PORTFOLIO page when User didn't have any investments or "0" Account value on portfolio page
    And User is on portfolio page
    Then User should be able to view account section value on portfolio page
    And Verify user should be able to view investments, cash, crypto value is 0 when user didn't have any investments on portfolio page
    And Verify graph is blurred out on portfolio page
    And Verify transfer funds Button over graph on portfolio page



