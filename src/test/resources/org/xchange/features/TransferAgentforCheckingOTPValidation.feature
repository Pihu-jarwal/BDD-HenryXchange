@TransferAgentLoginPage
Feature: Transfer agent login page for checking OTP validation

  Background:
    Given User navigate to "https://qaapp.drylakes.co/"

  @TC_M11_062 @TC_M11_063 @TC_M11_064 @TC_M11_068 @TC_M11_069
  Scenario: Verify the Error message when user enter wrong code 1st time
    When User enter email "muskan.trivedi8+184@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    And User enter otp "123454" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then Verify User should be able to view error messages 2 attempts remaining below the OTP field on 2FA page
      #TC_M11_063
    When User remove Otp code in input field on 2FA page
    And User enter otp "123454" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then Verify enter the invalid code second time validation message should displayed on 2FA page
      #TC_M11_064
    When User remove Otp code in input field on 2FA page
    And User enter otp "123454" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then Verify user should be able to view pop-up "Account Not Confimed" on 2FA page
      #TC_M11_068
    And Verify user able to view sub text of account not verified popup on 2FA page
    And Verify user able to cross icon on account not confirmed popup on 2FA page
    #TC_M11_069
    And Verify user able to view account not confirmed pop up should close automatically after 3second on 2FA page






