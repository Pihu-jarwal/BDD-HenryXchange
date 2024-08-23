@Login
Feature: Login feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User is on login page

  @TC_M1_02
  Scenario: To check the validation in email field on login page
    When Users enters a invalid format email on login page in input field - muskan.trivedi8+2appinventiv.com
    Then Verify error message should be visible below the email input field on login page
    When User removes email from email field on login page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then Verify user should be successfully login and redirect to market page

  @TC_M1_06
  Scenario: To verify the functionality of the Enter button on login page
    And Verify skip email and password fields on login page and click on Enter button
    When User enters a email on login page in input field - muskan.trivedi8+3@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then Verify that error message should be shown as account details are incorrect Please try again on login page

  @TC_M1_11
  Scenario: Verify the functionality when user click on hyper link "Create a new account" on login page
    When Users click on create one hyper link on login page
    Then Verify the functionality when user click on hyper link Create a new account on login page

  @TC_M1_5
  Scenario: Verify functionality of eye icon over Password field on login page
    And Verify functionality of eye icon over Password field on login page

  @TC_M1_04
  Scenario: To verify the validation in password field on login page
    When User enters a password on login page in input field - Muskan@12
    Then User should able to enter max password by 12 on login page

  @TC_M1_16
  Scenario: Verify the redirection of the Legal page
    When User clicks on legal hyper link on login page
    Then verify Link should be clickable and user redirected to the legal page

  @TC_M1_15
  Scenario: verify the redirection of terms page
    When User clicks on terms link on login page
    Then Verify Link should be clickable and user redirected to the terms page

  @TC_M1_13
  Scenario: To verify that if blocked user try to login
    When User enters a email on login page in input field - muskan.trivedi8+2@appinventiv.com
    And User enters a password on login page in input field - Muskan@12234
    And User clicks on enter button on login page
    Then To verify that if blocked user try to login on login page

