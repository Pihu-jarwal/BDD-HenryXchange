@AccountPageForCheckingOTPValidation
Feature: Account feature for changing mobile number

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+56@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header

  @TC_M10.1_056 @TC_M10.1_059 @TC_M10.1_060 @TC_M10.1_061 @TC_M10.1_062 @TC_M10.1_063 @TC_M10.1_064
  Scenario: Verify the functionality of Confirm Code button when invalid OTP is entered while verifying OTP during changing the number process.
    And User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706478" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify invalid code is entered, validation message should displayed on verify mobile popup on account page
    When User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify invalid code is entered, validation message should displayed on verify mobile popup on account page
    When User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify enter the invalid code third time validation message should displayed on verify mobile popup on account page
    #TC_M10.1_059
    And Verify timer should start with 14:59 for OTP resend on verify mobile popup on account page
    When User will wait for 9 min on verify mobile popup on account page
    And user click on stay logged in button on are you there popup on account page
    And User will wait for 6 min on verify mobile popup on account page
    #TC_M10.1_060
    Then Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    #TC_M10.1_061
    When User click on resend code button on verify mobile popup on account page
    And User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify error message when user again enter invalid code after 15 minutes on verify mobile popup on account page
    #TC_M10.1_062
    When User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443233 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify user able to view pop up should appear as Mobile Number not verified
    #TC_M10.1_063
    And Verify sub heading should appear as Mobile Number not verified popup on account page
    And Verify user able to view cross icon on Mobile Number not verified popup on account page
    #TC_M10.1_064
    When User click on cross icon on Mobile Number not verified popup on account page
    Then Verify user is on account page


