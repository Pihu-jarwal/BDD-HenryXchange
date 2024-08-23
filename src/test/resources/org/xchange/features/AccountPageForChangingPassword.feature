@AccountPageForChangingPassword
Feature: Account feature for changing password

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page


  @TC_M10.1_146 @TC_M10.1_149 @TC_M10.1_150 @TC_M10.1_151 @TC_M10.1_152
  Scenario: Verify the functionality of Confirm Code button when invalid OTP is entered while verifying OTP during changing the password with kyc
    And User enters a email on login page in input field - muskan.trivedi8+57@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    When User enter otp "858485" in input field on Verify OTP pop up on account page
    And User click on confirm button on Verify OTP pop up on account page
    Then Verify invalid code is entered, validation message should displayed on Verify OTP pop up on account page
    When User remove Otp code in input field on Verify OTP pop up on account page
    And User enter otp "858425" in input field on Verify OTP pop up on account page
    And User click on confirm button on Verify OTP pop up on account page
    Then Verify enter the invalid code third time validation message should displayed on on Verify OTP pop up on account page
    #TC_M10.1_149
    And Verify timer should start with 14:59 for OTP resend on verify mobile popup on account page
    When User will wait for 9 min on verify mobile popup on account page
    And user click on stay logged in button on are you there popup on account page
    And User will wait for 6 min on verify mobile popup on account page
    #TC_M10.1_150
    Then Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    #TC_M10.1_151
    When User click on resend code button on verify mobile popup on account page
    And User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify error message when user again enter invalid code after 15 minutes on verify mobile popup on account page
    #TC_M10.1_152
    When User click on resend code button on verify mobile popup on account page
    And User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify user able to view placeholder text on password not confirmed popup on account page

  @TC_M10.1_111 @TC_M10.1_114 @TC_M10.1_115 @TC_M10.1_116 @TC_M10.1_117
  Scenario: Verify the functionality of Confirm Code button when invalid OTP is entered while verifying OTP during changing the password without kyc
    And User enters a email on login page in input field - muskan.trivedi8+62@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    When User enter otp "858485" in input field on Verify OTP pop up on account page
    And User click on confirm button on Verify OTP pop up on account page
    Then Verify invalid code is entered, validation message should displayed on Verify OTP pop up on account page
    When User remove Otp code in input field on Verify OTP pop up on account page
    And User enter otp "858425" in input field on Verify OTP pop up on account page
    And User click on confirm button on Verify OTP pop up on account page
    Then Verify enter the invalid code third time validation message should displayed on on Verify OTP pop up on account page
    #TC_M10.1_114
    And Verify timer should start with 14:59 for OTP resend on verify mobile popup on account page
    When User will wait for 9 min on verify mobile popup on account page
    And user click on stay logged in button on are you there popup on account page
    And User will wait for 6 min on verify mobile popup on account page
    #TC_M10.1_115
    Then Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    #TC_M10.1_116
    When User click on resend code button on verify mobile popup on account page
    And User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify error message when user again enter invalid code after 15 minutes on verify mobile popup on account page
    #TC_M10.1_117
    When User click on resend code button on verify mobile popup on account page
    And User remove otp from input field on verify mobile popup on account page
    And User enter OTP 443234 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify user able to view placeholder text on password not confirmed popup on account page
