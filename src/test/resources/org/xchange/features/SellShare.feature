@sellSharePage

Feature: Sell Share Page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User is on login page
    And User enters a email on login page in input field - anuj.kumar8+12@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page

  @TC_M5_001
  Scenario: Verify that user navigate to Sell Share page from Property detail page
    Then Verify user navigation to market page, when user logged in with valid credential
    And User clicks on typing cursor over search field on market page
    When User enters asset name "Oakwood Sarasota" in search field on market page
    Then User click on invested property on market page
    When  User click on sell button over your investment section on property detail page
    Then User is navigate on sell share page

  @TC_M5_003
  Scenario: Verify the UI of Sell Share Page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User able to view breadcrumb on sell share page
    And User able to view placeholder Text: Sell Shares is displayed on sell share page
    And User able to view investment Details card is displayed with the following details like thumbnail image, property name, total shares, average share cost and total value on sell share page
    And User able to view segmented Tabs are displayed with two tabs on sell share page
    And User able to view currently Listed tab is displayed with four listed shares and their details
    When User click on recent sales tab on sell share page
    Then User able to view recent Sales tab is displayed with four recent sales and their details
    And User able to view gross sale amount in sell order table on sell share page
    And User able to view the following details like oracle icon, estimated share price, Market estimated link in sell order table on sell share page
    And User able to view share price field name, share price text field in sell order table on sell share page
    And user able to view  # of Shares Field name with actual holding share count, # of Shares Text field in sell order table on sell share page
    And User able to view fees , Net Amount to You, and Continue button in sell order table on sell share page


  @TC_M5_002
  Scenario: Verify that user navigate to Sell Share page from Portfolio
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page

  @TC_M5_004
  Scenario: Verify the functionality of clickable field or link to navigate
    Then Verify user navigation to market page, when user logged in with valid credential
    And User clicks on typing cursor over search field on market page
    When User enters asset name "Oakwood Sarasota" in search field on market page
    When User click on invested property on market page
    And  User click on sell button over your investment section on property detail page
    Then User is navigate on sell share page
    When User click on property detail over breadcrumbs on sell order page
    Then User is on property detail page
    When User click on market over breadcrumbs on market page
    Then User is on market page
    When User clicks on portfolio tab on market page
    And click on Sell button on portfolio page
    And User click on portfolio over the breadcrumbs on sell share page
    Then User is on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User able to view custom tab holder on sell share page
    And User able to view the current listed list on sell share page
    When User click on recent sales tab on sell share page
    Then User able to view the recent sale list on sell share page

  @TC_M5_005
  Scenario: Verify the functionality how user get Currently listed list on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User able to view custom tab holder on sell share page
    And User able to view the current listed list on sell share page

  @TC_M5_006
  Scenario: Verify the functionality how user get Recent Sales list on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    When User click on recent sales tab on sell share page
    Then User able to view the recent sale list on sell share page

  @TC_M5_009
  Scenario: Verify that how Gross Amount value changes on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    When User enters a numeric value "11.23" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    Then User able to view updated gross amount value when user provide input sell share price and share on sell share page


  @TC_M5_010
  Scenario: Verify the functionality of Share price field on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    When User enters a numeric value "11.23" in the share price field on sell share page
    Then User view numeric value is visible in the text field on sell share page
    When User enters an alphabetic value "abc" in the share price field on sell share page
    Then User view alphabetic value is not visible in the text field on sell share page
    When User enters a special character value "!@#$" in the share price field on sell share page
    Then User view special character value is not visible in the text field on sell share page
    When User press the space bar in the share price field on sell share page
    Then User view space bar input is not visible in the text field on sell share page
    When User enters "0" as input in the share price field on sell share page
    Then User view Continue button should not be active on sell share page

  @TC_M5_011
  Scenario: Verify the functionality when user try to set share price Lower than Market Estimate on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value less than market estimate in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User is navigate verify your identity popup on sell share page

  @TC_M5_012
  Scenario: Verify the functionality when user try to set share price 10% lower than the Market Estimate on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value ten percent less than market estimate in the share price field on sell share page
    When User click on # of Shares text field on sell share page
    Then User able to view low pricing warning on sell share page

  @TC_M5_013
  Scenario: Verify the functionality when user try to set share price Higher than Market Estimate on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value higher than market estimate in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User is navigate verify your identity popup on sell share page

  @TC_M5_014
  Scenario: Verify the functionality of # of Share Field on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    When User enters a numeric value "1" in the shares field on sell share page
    Then User view numeric value is visible in the share text field on sell share page
    When User enters an alphabetic value "abc" in the shares field on sell share page
    Then User view alphabetic value is not visible in the share text field on sell share page
    When User enters a special character value "!@#$" in the shares field on sell share page
    Then User view special character value is not visible in the share text field on sell share page
    When User press the space bar in the shares field on sell share page
    Then User view space bar input is not visible in the share text field on sell share page

  @TC_M5_015
  Scenario: Verify the functionality when user try to set no of share Count "0" on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    When User set number of share count "0" as input in the shares field on sell share page
    Then User view Continue button should not be active on sell share page

  @TC_M5_016
  Scenario: Verify the functionality when user try to set no of share Count more than the share hold by shareholder on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    When User set number of share count "50" more than the share hold by shareholder on sell share page
    Then User able to view Can't Exceed Amount Owned Warning msg on sell share page

  @TC_M5_017
  Scenario: Verify the functionality when user try to set # of share count in between shares hold by Shareholder on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "11.23" in the share price field on sell share page
    And User enter input as "1" in between shares Hold by shareholder on sell share page
    When User able to clicks on continue button on sell share page
    Then User is navigate verify your identity popup on sell share page

  @TC_M5_018
  Scenario: Verify how Fees calculated for sell shares on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    When User enters a numeric value "11.23" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    Then User able to view fees calculation on sell order page

  @TC_M5_019
  Scenario: Verify how Net Amount to you calculated for sell shares on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    When User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    Then User able to view net amount to you calculation on sell order page

  @TC_M5_020
  Scenario: Verify the functionality when user provide valid data for share price & # of shares and click on "Continue" Button on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page

  @TC_M5_021
  Scenario: Verify the UI of Two Factor Method pop-up on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User able to view text choose the verification method to verify your identity on two factor popup in sell share page
    And User able to view SMS text message is by-default selected on two factor popup in sell share page
    And User able to view SMS text message option with provided mobile number on two factor popup in sell share page
    And User able to view email option with provided email address on two factor popup in sell share page
    And User able to view cancel button on two factor popup in sell share page
    And User able to view confirm button on two factor popup in sell share page

  @TC_M5_022
  Scenario: Verify the navigation when user click on Clickable button or link on Two factor method pop-up on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    Then User able to view email option is selected on two factor popup on sell share page
    When User click on SMS text option on two factor popup in sell share page
    Then User able to view SMS Text option is selected on two factor popup on sell share page
    When User click on cancel button on two factor popup on sell share page
    Then User able to stay in same page Portfolio - on Sell shares page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User able to view Two Factor Auth Verification Pop-up on sell share page
    When User click outside the pop-up on sell share page
    Then User able to stay in same page Portfolio - on Sell shares page

  @TC_M5_023
  Scenario: Verify the functionality of selection of Email option on two factor popup on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    Then User able to view email option is selected on two factor popup on sell share page
    And User able to view SMS text option is deselected on two factor popup on sell share page

  @TC_M5_024
  Scenario: Verify the functionality of selection of SMS Text option when Email is selected on two factor popup on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    Then User able to view email option is selected on two factor popup on sell share page
    When User click on SMS text option on two factor popup in sell share page
    Then User able to view email option is deselected on two factor popup on sell share page

  @TC_M5_025
  Scenario: Verify the functionality of Cancel button on two factor popup on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on cancel button on two factor popup on sell share page
    Then User able to stay in same page Portfolio - on Sell shares page

  @TC_M5_026
  Scenario: Verify the functionality of Confirm button without any selection on two factor popup on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User able to view Two Factor Auth Verification Pop-up on sell share page


  @TC_M5_027
  Scenario: Verify the functionality of Confirm button with Email option selection
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User able to view Two Factor Auth Verification Pop-up on sell share page

  @TC_M5_028
  Scenario: Verify the UI of Two Factor auth verification pop-up for SMS option on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User able to view text please confirm your identity to complete this action on two factor auth verification popup on sell share page
    And User able to view SMS text message sent on two factor auth verification popup on sell share page
    And User able to view text please enter the six digit code sent to the number ending in XXXX on two factor auth verification popup on sell share page
    And User able to view six digit code input field on two factor auth verification popup on sell share page
    And User able to view confirm code button on two factor auth verification popup on sell share page
    And User able to view text Didn't receive it? Resend code link on two factor auth verification popup on sell share page
    And User able to view text use another method on two factor auth verification popup on sell share page

  @TC_M5_029
  Scenario: Verify the UI of Two Factor auth verification pop-up for Email option on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    Then User able to view email option is selected on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User able to view text please confirm your identity to complete this action on two factor auth verification popup on sell share page
    And User able to view text OTP Sent on two factor auth verification popup on sell share page on two factor auth verification popup on sell share page
    And User able to view text Please enter the code sent to your email in order to verify your identity on two factor auth verification popup on sell share page
    And User able to view six digit code input field on two factor auth verification popup on sell share page
    And User able to view confirm code button on two factor auth verification popup on sell share page
    And User able to view text Didn't receive it? Resend code link on two factor auth verification popup on sell share page
    And User able to view text use another method on two factor auth verification popup on sell share page

  @TC_M5_030
  Scenario: Verify the functionality when user enter Valid code on two factor auth verification popup for SMS on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User clicks on confirm button on two factor popup on sell share page
    And User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User should be able to view ID verified pop-up on sell share page

  @TC_M5_032
  Scenario:Verify the functionality when user enter inValid code on two factor auth verification popup for SMS on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    And User enter the one to five digit numeric code "12345" two factor auth verification pop-up on sell share page
    Then User able to view confirm code button is disabled two factor auth verification pop-up on sell share page
    When User enter the alphabetic code "aBCDeF" in otp box two factor auth verification pop-up on sell share page
    Then Verify User should not be able to enter Alphabetic code two factor auth verification pop-up on sell share page
    When User enter the special Character code "!@#$%^" in otp box two factor auth verification pop-up on sell share page
    Then Verify User should not be able to enter Special character code two factor auth verification pop-up on sell share page
    And User enter the wrong code "222765" in otp box two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User view the error msg on two factor auth verification pop-up on sell share page

  @TC_M5_033
  Scenario: Verify the error message when user enter Wrong Code on two factor auth verification popup for SMS on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    And User enter the wrong code "222765" in otp box two factor auth verification pop-up on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User should be able to view error message on two factor auth verification pop-up on sell share page

  @TC_M5_035
  Scenario: Verify the error message when user have 3 failed attempts and try to enter otp 4th time on two factor auth verification popup for SMS on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User first attempt enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User Second attempt enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User third attempt enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User try to attempt fourth time enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then Verify User able to view error message on two factor auth verification pop-up on sell share page
    When User able to clicks on cross icon on two factor auth verification pop-up for SMS on sell share page
    Then User is navigate on sell share page

  @TC_M5_037@TC_M5_038
  Scenario:Verify the validation of  2 failed attempts, when user enter 3 times wrong OTP and then Resend new OTP, So how wrong attempts user have.
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User first attempt enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User Second attempt enter wrong code "222765" in otp box on two factor auth verification pop-up on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on resend code link on two factor auth verification pop-up on sell share page
    #TC_M5_038
    Then Verify User able to view toast msg code resent successfully on two factor auth verification pop-up on sell share page
    #TC_M5_037
    And Verify User able to enter third wrong otp "222765" again on two factor auth verification pop-up on sell share page


  @TC_M5_041
  Scenario:Verify the functionality of Use another method link
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User clicks on confirm button on two factor popup on sell share page
    When User clicks on use another method link on two factor popup on sell share page
    Then User able to navigate to Two factor Method Pop-up on sell share page
    And User able to view Previously selected option on Two factor Method Pop-up on sell share page
    And User able to select another method on Two factor Method Pop-up on sell share page

  @TC_M5_042
  Scenario:Verify the UI of ID verified pop-up
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    And User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User able to view header: ID verified on ID verified popup on sell share page
    And User able to Sub-text: Your ID has been verified and your sell order has been submitted. on ID verified popup on sell share page
    And User able to view cross icon at right top on ID verified popup on sell share page

  @TC_M5_043
  Scenario: Verify that user able to close ID Verified pop-up
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    And User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User should be able to navigate on agree to terms page to sell shares
    When User able to click on close button on agree to terms popup on sell share page
    And User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks outside the popup on on ID verified pop-up for SMS on sell share page
    And User should be able to navigate on agree to terms page to sell shares

  @TC_M5_044
  Scenario: Verify the functionality of auto close ID verified pop-up
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    When User click on email option on two factor popup on sell share page
    And User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    When User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    Then User should be able to view ID Verification is auto closed in three Sec on sell share page

  @TC_M5_045
  Scenario: Verify the functionality when user within the process to get Agree to terms pop-up
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User able to view Sell Share page with "Preparing Contract" Loader right of Segment tabs on sell share page

  @TC_M5_046
  Scenario: Verify the UI of Agree to terms Pop-up
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User able to view placeholder text: agree to terms as "Agree to Terms" on agree to terms Pop-up on sell share page
    And User able to view property name on agree to terms Pop-up on sell share page
    And User able to view agreement description on agree to terms Pop-up on sell share page
    And User able to view enter your initials field on agree to terms Pop-up on sell share page
    And User able to view agree and continue button on agree to terms Pop-up on sell share page
    And User able to view download button on agree to terms Pop-up on sell share page
    And User able to view cross icon at right top on agree to terms Pop-up on sell share page

  @TC_M5_047 @TC_M5_048
  Scenario:Verify the functionality when Enter Your Initials button should active
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    And User able to view Sell Share page with "Preparing Contract" Loader right of Segment tabs on sell share page
    Then User should be able to navigate on agree to terms page to sell shares
    When User able to view enter your initials button active on agree to terms Pop-up on sell share page
    #TC_M5_048
    And User enter input "AK" and only allow Caps alpha character in field on agree to terms page to sell shares
    And User enter minimum two and maximum three character allowed in field on agree to terms page to sell shares
    Then User enter the character should match the first letter of the First name Middle name Last name on agree to terms page to sell shares

  @TC_M5_049 @TC_M5_050 @TC_M5_051
  Scenario: Verify that user enter Invalid input
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User able to view Sell Share page with "Preparing Contract" Loader right of Segment tabs on sell share page
    And User should be able to navigate on agree to terms page to sell shares
    And User able to view enter your initials button active on agree to terms Pop-up on sell share page
    When User enter numeric digit "1234" in enter your initials field on agree to terms Pop-up on sell share page
    Then User is not able to allowed to enter numeric digit in enter your initials field on agree to terms Pop-up on sell share page
    When User enter special character "@#%$" in enter your initials field on agree to terms Pop-up on sell share page
    Then User is not able to allowed to special character in enter your initials field on agree to terms Pop-up on sell share page
    When User enter lower case alpha character "abc" in enter your initials field on agree to terms Pop-up on sell share page
    Then User are able to view upper case character in enter your initials field on agree to terms Pop-up on sell share page
    When User enter space in enter your initials field on agree to terms Pop-up on sell share page
    Then User is not able to allowed to enter space in enter your initials field on agree to terms Pop-up on sell share page
    When User enter wrong input "MK" in enter your initials field on agree to terms Pop-up on sell share page
    Then User clicks on agree and continue button on agree to terms Pop-up on sell share page
    And User is able to view error message below the enter your initials field on agree to terms Pop-up on sell share page
    #TC_M5_050
    And User able to view error message below the enter your initials field on agree to terms Pop-up on sell share page
    #TC_M5_051
    When User enter valid input "AK" in enter your initials field on agree to terms Pop-up on sell share page
    Then User clicks on agree and continue button on agree to terms Pop-up on sell share page
    And User should be able to navigate to Sell order submitted page

  @TC_M5_052
  Scenario: verify the functionality when user click on "cross icon" over Agree to terms pop-up on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User able to view Sell Share page with "Preparing Contract" Loader right of Segment tabs on sell share page
    And User should be able to navigate on agree to terms page to sell shares
    When User clicks on cross icon over agree to terms page to sell shares
    Then User should able to view popup will disappear on sell share page
    And User is navigate on sell share page

  @TC_M5_007 @TC_M5_008
  Scenario: Verify the functionality of Currently Listed list when no one Listed there Shares on sell share page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    And User view the investment text on portfolio page
    When click on Sell button no shares sold for their property on portfolio page
    Then User is navigate on sell share page
    And User Should be not able to view Currently Listed list on sell share page
    #TC_M5_008
    When User click on recent sales tab on sell share page
    Then User Should be not able to view Recent Sales List on sell share page



















