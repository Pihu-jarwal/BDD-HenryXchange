@KycPage
Feature: Account feature for completed kyc

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+63@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header


  @TC_M10.1_105 @TC_M10.1_106
  Scenario: Verify that user should be redirected to the Edit Password option in the Account page when KYC is not completed.
    Then Verify user able to view password edit option on account page
    #TC_M10.1_106
    When User click on password edit option on account page
    Then Verify user should be redirected to Verify OTP pop up on account page

  @TC_M10.1_107 @TC_M10.1_108
  Scenario: Verify the UI of "Verify OTP" pop up displayed on clicking on Edit option while changing password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    And Verify 6 digit otp field should be visible on verify OTP pop up on account page
    And Verify close icon should be visible on verify OTP pop up on account page
    And Verify placeholder text "OTP Sent" on verify OTP pop up on account page
    And Verify Didn't receive it? Resend code link on verify OTP pop up on account page
      #TC_M10.1_108
    When User click on cross icon on verify OTP pop up on account page
    Then User should redirect to account page

  @TC_M10.1_110
  Scenario: Verify the functionality of invalid OTP filled while changing password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    When User enter otp "12345" in input field on Verify OTP pop up on account page
    Then Verify confirm button should disabled when enter less than 6 digit code in OTP box on verify mobile popup on account page
    When User remove Otp code in input field on Verify OTP pop up on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    Then Verify confirm code button should enabled when enter valid OTP on account page

  @TC_M10.1_112
  Scenario: Verify the functionality of Resend Code link while changing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    And User click on resend code link on Verify OTP pop up on account page
    Then Verify "Code resent successfully!" should be sent successfully

  @TC_M10.1_118 @TC_M10.1_119 @TC_M10.1_120 @TC_M10.1_121 @TC_M10.1_122
  Scenario: Verify the functionality of Confirm Code button when valid OTP is entered.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify ID Verified pop up should be displayed on account page
    #TC_M10.1_119
    And Verify user able to view your id verified text on verified popup on account page
      #TC_M10.1_120
    When User click on cross icon on verify OTP pop up on account page
    Then Verify user should be redirected to Edit Password pop up on account page
      #TC_M10.1_121
    And Verify old password field should visible to Edit Password pop up on account page
    And Verify new password field should visible to Edit Password pop up on account page
    And Verify confirm password field should visible to Edit Password pop up on account page
    And Verify user able to view cancel and save change button on Edit Password pop up on account page
    #TC_M10.1_122
    When User click on cancel button on Edit Password pop up on account page
    Then User should be redirect to account page

  @TC_M10.1_124
  Scenario: Verify the functionality of icon eye with input displayed on the Old Password field while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User click on cross icon on verify OTP pop up on account page
    And User click on eye icon on Edit Password pop up on account page
    Then Verify encrypted form of Password should be visible on Edit Password pop up on account page

  @TC_M10.1_125
  Scenario: Verify the functionality of New Password field with valid input while editing the password
    When Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User click on cross icon on verify OTP pop up on account page
    And User enter new password "Muskan@12345" in input field on Edit Password pop up on account page
    Then Verify password should be accepted successfully on Edit Password pop up on account page

  @TC_M10.1_126
  Scenario: Verify the functionality of icon eye with input displayed on the New Password field while editing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on new password eye icon on Edit Password pop up on account page
    Then Verify encrypted form of Password should be visible on Edit Password pop up on account page

  @TC_M10.1_129
  Scenario: Verify the functionality of Confirm New Password field with invalid input while editing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123244" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify user able to view "Your password do not match" below confirm password field on Edit Password pop up on account page

  @TC_M10.1_130
  Scenario:Verify the functionality of icon eye with input displayed on the Confirm New Password field while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on new password eye icon on Edit Password pop up on account page
    Then Verify encrypted form of Password should be visible on Edit Password pop up on account page

  @TC_M10.1_136
  Scenario: Verify the enabled state of Save Changes button displayed on Edit Password pop up.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    Then Verify Save Changes button should enabled when valid input is added on Edit Address pop up on account page

  @TC_M10.1_137
  Scenario: Verify the functionality of Save Changes button displayed on Edit Password pop up
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@12345" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify password updated to new password and user should successfully redirected to My Account page

  @TC_M10.1_123
  Scenario: Verify Old Password while Editing Password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on OTP popup on kyc page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@12345" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then User should be redirect to account page

  @TC_M10.1_128
  Scenario: Verify the functionality of Confirm New Password field with valid input while editing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on OTP popup on kyc page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@12345" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify Input should accepted without any validation message if Confirm New Password is entered same as New Password

  @TC_M10.1_131 @TC_M10.1_132 @TC_M10.1_133 @TC_M10.1_134 @TC_M10.1_135
  Scenario: Verify when incorrect password is entered in the Old Password field while editing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify 2 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up
      #TC_M10.1_132
    When User remove input field text "oldPassword" on Edit Password pop up on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify 1 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up on account page
      #TC_M10.1_133
    When User remove input field text "oldPassword" on Edit Password pop up on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify user able to view password not confirmed popup on account page
      #TC_M10.1_134
    And Verify user able to view placeholder text on password not confirmed popup on account page
    #TC_M10.1_135
    When User click on cross icon on password not confirmed popup on account page
    Then User should be redirected to My Account page when clicking on cross icon

  @TC_M10.1_113
  Scenario: Verify the functionality of OTP code expiration while changing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User will wait 5 for verify OTP popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify validation message should displayed after 5 minutes of code generation on account page

  @TC_M10.1_169 @TC_M10.1_170
  Scenario: Verify that user should be redirected to the Two-Factor Auth option in the Account page when KYC is not completed.
    Then Verify user able to view update option with Two-Factor Auth section on account page
    #TC_M10.1_170
    When User click on update option with Two-Factor Auth section on account page
    Then User should be redirected to "Choose Your Preferred Two-Factor Authorization Method" pop up

  @TC_M10.1_171 @TC_M10.1_173
  Scenario: Verify the UI of Choose Your Preferred Two-Factor Authorization Method pop up.
    When User click on update option with Two-Factor Auth section on account page
    Then Verify user should able to view Turn off Email SMS option on Two-Factor Auth section on account page
    And Verify user able to view cancel and update method btn on Two-Factor Auth section on account page
      #TC_M10.1_173
    And Verify SMS should disabled state for Two-Factor Authorization popup on account page

  @TC_M10.1_172
  Scenario: Verify the when user selects email as Two-Factor Authorization
    When User click on update option with Two-Factor Auth section on account page
    And User click on email option on verification method popup on account page
    Then Verify Email should displayed as selected for Two-Factor Authorization popup on account page

  @TC_M10.1_099
  Scenario: Verify the Account Recovery option when KYC is not done
    Then Verify account recovery method should not visible if KYC is not completed on account page

