@accountPage

Feature: Account page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - anuj.kumar8+2@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    And User clicks on enter button on login page
    Then Verify user is navigate to kyc page
    When User click on market tab on kyc page
    Then Verify user navigation to market page, when user logged in with valid credential

  @TC_M1_55
  Scenario: To check the account setup percentage on market page
    And Verify user should be able to view account setup on market page

  @TC_M1_56
  Scenario: To verify name edit profile button on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit name on account page
    Then Verify user is on edit name popup on account page

  @TC_M1_57
  Scenario: To verify when user click on Edit Button on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit name on account page
    Then Verify user is on edit name popup on account page
    And User able to view the edit name text, legal first name and legal last name text field on edit name popup in account page
    And User able to view the cancel and save changes button on edit name popup in account page

  @TC_M1_58
  Scenario:To verify if user wants to change his/her name on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit name on account page
    Then Verify user is on edit name popup on account page
    Then Verify user view the already entered first name and last name on edit name popup in account page
    Then User check the validation of first name as "@@@" on edit name popup in account page
    And User check the validation of last name as "@q@" on edit name popup in account page
    And User enter first name on edit name popup on account page
    And User enter last name on edit name popup on account page

  @TC_M1_59
  Scenario: To verify when user click on Cancel button on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit name on account page
    Then Verify user is on edit name popup on account page
    And User able to view the edit name text, legal first name and legal last name text field on edit name popup in account page
    And User able to view the cancel and save changes button on edit name popup in account page
    When User clicks on cancel button on edit name popup in account page
    Then User able to view edit name popup is not displayed in account page

  @TC_M1_60
  Scenario: To verify when user click on save changes button after entering a new first and last name in edit name popup on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit name on account page
    Then Verify user view the already entered first name and last name on edit name popup in account page
    When User enter first name on edit name popup on account page
    And User enter last name on edit name popup on account page
    And User clicks on save changes button on edit name popup on account page
    Then Verify user view the msg Name updated successfully on account page

  @TC_M1_61
  Scenario: To verify when user click on Edit email button on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit email on account page
    Then User verify is on edit email popup on account page
    And User able to view the edit email text, email text field on edit name popup in account page
    And User able to view the cancel and verify email button on edit name popup in account page

  @TC_M1_62 @TC_M1_63
  Scenario: To verify when the popup will get open on account page
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User clicks on edit email on account page
    Then User view the see the current email already entered in email field on edit email popup in account page
    And user verify email button disabled on edit email popup in account page
    #TC_M1_63
    When User clicks on cancel button on edit email popup in account page
    Then User able to view edit email popup is not displayed in account page

  @TC_M1_70 @TC_M1_71 @TC_M1_72
  Scenario:To verify the functionality of the logout button
    When User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    And User clicks on profile icon on header
    When User clicks on logout in profile menu on header
    Then User is on logout popup on header
    And User able to view the message are you sure want to logout on logout popup in account page
    And User able to view cancel and logout button on logout popup in account page
     #TC_M1_71
    When User clicks on cancel button to navigate previous page on logout popup in account page
    Then User verify to redirect my account page
    And User clicks on profile icon on header
    When User clicks on logout in profile menu on header
    Then User is on logout popup on header
     #TC_M1_72
    When User clicks on logout button on header
    Then User is on homepage
