Feature: Forgot password page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User is on login page

  @TC_M10.1_001
  Scenario: Verify that user should be navigated to Forgot Password option
    When User click on forgot password link on login page
    Then User should be able to navigate the Forgot Password option from login page

  @TC_M10.1_002
  Scenario: Verify the UI of Forgot Password option.
    Then Verify forgot Password option should be visible on login page

  @TC_M10.1_003
  Scenario: Verify the functionality of Forgot Password option.
    And User click on forgot password link on login page
    Then Verify user should be redirected to Reset Password page

  @TC_M10.1_004
  Scenario: Verify the UI of  Reset Password page.
    When User click on forgot password link on login page
    Then Verify user able to view heading of reset password on forgot password page
    And Verify user able to view sub heading of reset password on forgot password page
    And Verify user able to view back to profile button on forgot password page
    And Verify user able to view send code button on on forgot password page

  @TC_M10.1_005
  Scenario: Verify the functionality of Back to login displayed in Reset Password page
    When User click on forgot password link on login page
    And User click on back to login button on forgot password
    Then Verify user should be redirected to login page

  @TC_M10.1_006
  Scenario: Verify the functionality of Email field with valid input displayed in Reset Password page
    When User click on forgot password link on login page
    And User enter email "test@gmail.com" in input field on forgot password page
    Then User should be able to type valid email address having @ and domain on forgot password page

  @TC_M10.1_007 @TC_M10.1_010
  Scenario: Verify the functionality of Email field with invalid input displayed in  Reset Password page
    When User click on forgot password link on login page
    And User click on email input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify email is required validation message should be displayed on forgot password page
    When User enter email "test.@com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify Error message should be displayed if email is entered without @ on forgot password page
    #TC_M10.1_010
    And Verify send code button should remain in disabled button on forgot password page

  @TC_M10.1_008
  Scenario: Verify the functionality of Email field when email address used is not existing in the system in Reset Password page.
    When User click on forgot password link on login page
    And User enter email "test@gmail.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify validation message should displayed when user enters email address which is not existing in system

  @TC_M10.1_009
  Scenario: Verify the enabled state of Send Code button when valid email address is entered
    When User click on forgot password link on login page
    And User enter email "sonali.sharma1+20@appinventiv.com" in input field on forgot password page
    Then Verify send code button should active when valid email address is entered on forgot password page

  @TC_M10.1_011
  Scenario: Verify the functionality of Send Code button when valid email address is entered.
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+15@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page

  @TC_M10.1_013
  Scenario: Verify the UI of the Verify Account Access page
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+15@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    And Verify heading text on Verify Account Access page
    And Verify back to login button on Verify Account Access page
    And Verify hint text on Verify Account Access page
    And Verify user able to view confirm code button on Verify Account Access page
    And Verify Didn't get a code text should visible on Verify Account Access page

  @TC_M10.1_016
  Scenario: Verify the functionality of invalid OTP filled while resetting new password
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+15@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    When User enter 5 digit otp 12345 in OTP field on Verify Account Access page
    Then Verify confirm button should disabled on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    Then Verify user is allowed to add any random OTP 756435 in OTP field on Verify Account Access page

  @TC_M10.1_017 @TC_M10.1_020 @@TC_M10.1_021
  Scenario: Verify the functionality of Confirm Code button when invalid OTP is entered while verifying OTP during resetting the password.
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+9@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    When User enter 6 digit otp 867584 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    When User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    When User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify enter the invalid code third time validation message should displayed on Verify Account Access page
    #TC_M10.1_020
    And Verify timer should start with 14:59 for OTP resend on Verify Account Access page
    #TC_M10.1_021
    When User will wait for 15 min on Verify Account Access page
    Then Verify resend Code link should displayed in enabled state on Verify Account Access page


  @TC_M10.1_018
  Scenario: Verify the functionality of Resend Code link while resetting the password
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+18@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    And User click on resend code button on Verify Account Access page
    Then Verify message new code should be sent successfully

  @TC_M10.1_020 @TC_M10.1_021
  Scenario: Verify the functionality of disabled OTP state during 15-minutes while resetting the password
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+10@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    When User enter 6 digit otp 867584 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    When User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    When User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify enter the invalid code third time validation message should displayed on Verify Account Access page
    And Verify timer should start with 14:59 for OTP resend on Verify Account Access page
    #TC_M10.1_021
    When User will wait for 15 min on Verify Account Access page
    Then Verify resend Code link should displayed in enabled state on Verify Account Access page

  @TC_M10.1_022 @TC_M10.1_023
  Scenario: Verify the functionality of 4th invalid code attempt after 15-minutes of blocking while resetting the password
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+35@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    When User enter 6 digit otp 867584 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    And User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify invalid code is entered, validation message should displayed on Verify Account Access page
    When User remove otp from input field on Verify Account Access page
    And User enter 6 digit otp 824352 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify enter the invalid code third time validation message should displayed on Verify Account Access page
    And Verify timer should start with 14:59 for OTP resend on Verify Account Access page
    When User will wait for 15 min on Verify Account Access page
    Then Verify resend Code link should displayed in enabled state on Verify Account Access page
    When User click on resend code button on Verify Account Access page
    And User remove otp from input field on Verify Account Access page
    And User enter 6 digit otp 824152 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify error message when user again enter invalid code after 15 minutes on Verify Account Access page
   #TC_M10.1_023
    When User remove otp from input field on Verify Account Access page
    And User enter 6 digit otp 822152 in OTP field on Verify Account Access page
    And User click on confirm button on Verify Account Access page
    Then Verify user able to view KYC process disrupted error message on Verify Account Access page

  @TC_M10.1_024
  Scenario: Verify the functionality of Confirm Code when valid OTP is entered for resetting the password
    When User click on forgot password link on login page
    And User enter email "muskan.trivedi8+15@appinventiv.com" in input field on forgot password page
    And User click on send code button on forgot password page
    Then Verify user should be redirected to Verify Account Access page
    When User enter 6 digit otp 867584 in OTP field on Verify Account Access page
    Then Verify confirm Code button should enabled on Verify Account Access page



