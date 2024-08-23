@BuyShare
Feature: Buy share feature for level 2 user

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then User is on market page

  @TC_M6_001
  Scenario: Verify that Level 2  user should able to navigate to Buy Shares page on market page
    When User clicks on buy button over property card on market page
    Then Verify user should be navigate to Buy Shares Page

  @TC_M6_002
  Scenario: Verify that Level 2 user should able to navigate to Buy Shares page on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page

  @TC_M6_003
  Scenario: Verify that Level 2 user able to navigate to Buy Shares page for similar property
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User scroll down to the bottom on property detail page
    And User clicks on Buy Button in Similar properties on property detail page
    Then Verify user should be able to navigate to Buy Shares Page

  @TC_M6_005
  Scenario: Verify that Level 2.1 user should able to navigate to Buy Shares page on market page
    When User clicks on buy button over property card on market page
    Then Verify user should be navigate to Buy Shares Page

  @TC_M6_006
  Scenario: Verify that Level 2.1 user should able to navigate to Buy Shares page on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page

  @TC_M6_007
  Scenario: Verify that Level 2.1 user able to navigate to Buy Shares page for similar property
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy Button in Similar properties on property detail page
    Then Verify user should be able to navigate to Buy Shares Page

  @TC_M6_008
  Scenario: Verify the field appearance when user arrives First on the Buy Share page
    When User clicks on buy button over property card on market page
    Then Verify user should be navigate to Buy Shares Page
    And Verify user should be able to view all Available shares are grayed out on buy share page
    And Verify user entered a valid value "1" for Shares or USD over respective field on buy share page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to view all Available shares are grayed out on buy share page
    And Verify user entered a valid value "1" for Shares or USD over respective field on buy share page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy Button in Similar properties on property detail page
    Then Verify user should be able to view all Available shares are grayed out on buy share page
    And Verify user entered a valid value "1" for Shares or USD over respective field on buy share page

  @TC_M6_011
  Scenario: Verify UI of Tooltip when user hover on Market Estimate text
    When User clicks on buy button over property card on market page
    And User hover the cursor on Market Estimate Text on buy share page
    Then Verify user able to view Tooltip with the following details on market estimate on buy share page

  @TC_M6_012
  Scenario: Verify the Functionality of Toggle Button on buy share page
    When User clicks on buy button over property card on market page
    Then Verify by default, the toggle button will be set to Shares Option
    And User clicks on the Toggle button on buy share page
    And Verify should move to the USD option on buy share page

  @TC_M6_013
  Scenario: Verify when user enter values in Shares field on buy share page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    And User enters a value greater than the share listed for Sale in enter share input field on buy share page
    Then User should able to view error message when user enters value greater than share listed on buy share page
    When User removes shares in enter share input field on buy shares page
    And User enters alphabets and special character "@#$" in share field input on buy share page
    Then Verify user is not allowed to Enter alphabets and special characters on buy share page

  @TC_M6_017
  Scenario: Verify when user Hover on the Buy Shares Button when the button is enabled on buy share page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    Then Verify buy share button is enabled on buy share page
    And Verify toolTip will show When user hovers on the Buy Shares Button on buy share page

  @TC_M6_014
  Scenario: Verify when user enter amount in USD field on buy share page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    And User clicks on the Toggle button on buy share page
    And User enters alphabets and special character "abc@#$" in USD input field on buy share page
    Then Verify user is not allowed to Enter alphabets and special characters in usd input field on buy share page
    When User enter amount as "123456789" in USD input field on buy share page
    Then Verify system will arrange the values in USD input field on buy share page
    When User removes usd value from usd input field on buy share page
    And User enters value less than the lowest share price in usd input field on buy share page
    Then Verify user should be able to view an error message below the usd input field on buy share page

  @TC_M6_016
  Scenario: Verify the functionality when user enter the valid amount in USD Dollar field
    When User clicks on buy button over property card on market page
    And User clicks on the Toggle button on buy share page
    And User enters any valid amount in Enter USD dollar field on buy share page
    Then Verify system will select shares no which can be buy in this amount calculate the total investment amount

  @TC_M6_018 @TC_M6_027 @TC_M6_028 @TC_M6_029
  Scenario: Verify the functionality of Buy Shares button
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    Then Verify user will be redirected to the “Fund Your Purchase” page
    #TC_M6_027
    When User clicks on the Cancel Purchase button on fund your purchase page
    Then Verify user should be able to view cancel popup on fund your purchase page
    #TC_M6_028
    And User should be able to view cancel Pop-up with the following details on fund your purchase page
    #TC_M6_029
    When User clicks on the "Yes,Cancel" button on fund your purchase page
    Then Verify user should be able to navigate to "Buy Shares” page. and, the purchase will be canceled

  @TC_M6_022
  Scenario: Verify the Functionality of edit button on fund your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on Edit button on Fund your purchase page
    Then Verify user should be navigate to Buy Shares Page
    And Verify User will show all the previous data entered on buy share page
    And Verify user should be able to  edit previous data on buy share page

  @TC_M6_030
  Scenario: Verify the functionality of "Continue Purchase" button on fund your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    Then Verify user should navigate to confirm your purchase page

  @TC_M6_033 @TC_M6_034 @TC_M6_035
  Scenario: Verify the functionality of Cancel purchase button on Confirm Your Purchase
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Cancel Purchase button on fund your purchase page
    #TC_M6_034
    Then Verify user should be able to view cancel popup on confirm your purchase page
    And User should be able to view cancel Pop-up with the following details on fund your purchase page
    #TC_M6_035
    When User clicks on the "Yes,Cancel" button on confirm your purchase page
    Then Verify user should be able to navigate to "Buy Shares” page. and, the purchase will be canceled

  @TC_M6_036
  Scenario: Verify the functionality of the "Continue Purchase" button over the popup on confirm your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Cancel purchase button on confirm your purchase page
    And User clicks on the "Continue Purchase" button over the popup on confirm purchase page
    Then Verify User should be able to view pop-up is dismissed and user stay's on Confirm your purchase page

  @TC_M6_052 @TC_M6_053 @TC_M6_055 @TC_M6_056 @TC_M6_057
  Scenario: Verify when the user click on the Continue button over the Confirm your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    Then Verify user should be able to navigate to Two Factor Authentication popup on confirm your purchase page
      #TC_M6_053
    And User should be able to view details on Two Factor Authentication popup on confirm your purchase page
    And Verify SMS Text by-default selected on Two Factor Authentication popup on confirm your purchase page
      #TC_M6_055
    When User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    Then User should be able to view Email option is selected and SMS Text option is deselected
      #TC_M6_056
    When User clicks on "SMS Text" option on Two Factor Authentication popup on confirm your purchase page
    Then User should be able to view SMS Text option is selected and Email option is deselected
      #TC_M6_057
    When User clicks on "cancel Button" on Two Factor Authentication popup on confirm your purchase page
    Then Verify user should navigate to confirm your purchase page

  @TC_M6_054 @TC_M6_058
  Scenario: Verify the navigation when user click on Clickable button or link
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    Then User able to view email option is selected on Two Factor Authentication popup on confirm your purchase page
    When User clicks on "SMS Text" option on Two Factor Authentication popup on confirm your purchase page
    Then User able to view SMS option is selected on Two Factor Authentication popup on confirm your purchase page
      #TC_M6_058
    When User clicks outside the pop-up on Two Factor Authentication popup on confirm your purchase page
    Then Verify user should be able to navigate to Confirm your purchase page

  @TC_M6_060 @TC_M6_061 @TC_M6_062 @TC_M6_074 @TC_M6_076
  Scenario: Verify the functionality of Confirm button with Email option selection on confirm your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    Then User should be able to view Two Factor Auth verification Pop-up for Email OTP confirm your purchase page
    #TC_M6_061
    And User able to view details placeholder text, SMS text, OTP sent on auth popup on confirm your purchase page
    #TC_M6_062
    When User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    Then Verify user should be able to view ID verified pop-up
    #TC_M6_074
    And Verify user should be able to view sub text on ID verified pop-up on confirm your purchase page
    #TC_M6_076
    And Verify ID verified popup should get closed in 3 seconds

  @TC_M6_059
  Scenario: Verify the functionality of Confirm button without any selection on two factor auth popup
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    Then User should be able to view Two Factor Auth verification Pop-up for SMS OTP confirm your purchase page

  @TC_M6_065
  Scenario: Verify the functionality when user enter 1 to 5 digit Code on two factor auth popup
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 12345 code in otp field on two factor auth popup on confirm your purchase page
    Then Verify user able to view Confirm Code button Disabled on two factor auth popup on confirm your purchase page

  @TC_M6_066 @TC_M6_068
  Scenario: Verify the error message when user enter Wrong Code on two factor auth popup
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 323536 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    Then Verify user should be able to view error message when user entered incorrect otp on two factor auth popup
    #TC_M6_068
    When User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 264643 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 132453 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 152563 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    Then User should able to view error message when user failed due to more than three attempts
#
  @TC_M6_070 @TC_M6_073
  Scenario: Verify the functionality of Resend Code link on two factor auth popup on confirm your purchase page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User clicks on resend code link on two Factor Auth verification popup on confirm your purchase page
    Then User should able to get another code send to preferred method on two Factor Auth verification popup
    #TC_M6_073
    When User clicks on use another method link on two Factor Auth verification popup on confirm your purchase page
    Then Verify user should be able to navigate to Two Factor Authentication popup on confirm your purchase page

  @TC_M6_077 @TC_M6_075
  Scenario: Verify that user able to close ID Verified pop-up
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    Then User should able to view confirm Your Purchase page with "Preparing Contract" Loader right side of page
      #TC_M6_075
    And Verify user should be able to navigate to "Buy Shares>>Agree To Terms" page

  @TC_M6_078 @TC_M6_079 @TC_M6_080 @TC_M6_081
  Scenario: Verify the UI of Agree to terms Pop-up
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    Then Verify user should be able to navigate to "Buy Shares>>Agree To Terms" page
    And Verify the UI of Agree to terms Pop-up on confirm your purchase page
    #TC_M6_079
    And Verify user should able to view "Enter Your Initials" field disabled on agree to terms popup
    #TC_M6_081
    When User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify Only allow caps alpha character in initials field on agree popup on confirm your purchase page
    And Verify validate minimum two character allowed in initials field on agree popup on confirm your purchase page
    When User removes initials value from initials field on agree to terms popup on confirm your purchase page
    And User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify validate maximum three characters allowed in initials field on agree popup
    When User removes initials value from initials field on agree to terms popup on confirm your purchase page
    And User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify character match the first name of First/middle/last name should same as user name in initial field
    And Verify Input must be an Alpha character in initials field on agree popup on confirm your purchase page

  @TC_M6_083 @TC_M6_084 @TC_M6_085 @TC_M6_086
  Scenario: Verify the error message for Invalid input or the initials are not getting matched
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    And Verify user should able to view "Enter Your Initials" field disabled on agree to terms popup
    And User enters value "GHJ" in enter your initials field on agree to terms popup on confirm your purchase page
    And User clicks on agree to continue button on agree to terms popup on confirm your purchase page
    Then User should able to view error message below the initial field on agree terms popup on confirm your purchase page
      #TC_M6_084
    When User removes initials value from initials field on agree to terms popup on confirm your purchase page
    And User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    And User clicks on agree to continue button on agree to terms popup on confirm your purchase page
    Then Verify user will again be redirected to the Agree to Terms popup with some checkboxes in the description
    #TC_M6_085
    And User able to view details like property name, placeholder on agree checkboxes popup on confirm purchase page
    And Verify user able to view details like agreement description,agree btn, cross icon on agree checkbox popup
     #TC_M6_086
    When User clicks on cross icon at right top on agree popup with checkboxes on confirm your purchase page
    Then User should be able to view pop-up will disappear over agree popup with checkbox on confirm your purchase page
    When User clicks on yes cancel button on cancel popup on agree popup with checkbox on confirm your purchase page
    Then Verify user should be navigate to Buy Shares Page

  @TC_M6_087
  Scenario: Verify the functionality of Checkboxes on "Agree to Terms" popup
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    And Verify user should able to view "Enter Your Initials" field disabled on agree to terms popup
    And User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    And User clicks on agree to continue button on agree to terms popup on confirm your purchase page
    Then User able to view uncheck box on agree popup with checkbox on confirm your purchase page
    When User check the checkbox over description on agree popup with checkbox on confirm your purchase page
    Then User able to view checkbox and make the checkbox on agree popup with checkbox on confirm your purchase page
    And User able to click on checkbox again and make them uncheck box on agree checkbox popup on confirm page
    And User have to check all box to Continue the purchase on agree popup with checkbox on confirm your purchase page

  @TC_M6_088 @TC_M6_089 @TC_M6_092 @TC_M6_090
  Scenario: Verify the functionality of Agree and Continue button over  "Agree to Terms" popup
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    And Verify user should able to view "Enter Your Initials" field disabled on agree to terms popup
    And User enters value "MT" in enter your initials field on agree to terms popup on confirm your purchase page
    And User clicks on agree to continue button on agree to terms popup on confirm your purchase page
    Then Verify user should able to view Agree Continue button disabled on agree terms popup on confirm purchase page
    When User have to check all box to Continue the purchase on agree popup with checkbox on confirm your purchase page
    Then Verify user should able to view agree continue button Active on agree terms popup on confirm purchase page
    #TC_M6_089
    When User clicks on agree to continue button on agree to terms popup on confirm your purchase page
    And User click on confirm purchase button on continue purchase popup on confirm your purchase page
    Then Verify user should be able to navigate to the Purchase details page
    #TC_M6_090
    And Verify user should be able to view purchase summary on purchase detail page
    And Verify user should be able to view transfer summary on purchase detail page
    And Verify user should be able to view balance summary on purchase detail page
    And Verify User should be able to view breadcrumbs on purchase detail page
    And Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links
    #TC_M6_092
    And Verify user clicks on view portfolio and should able to navigate to portfolio page with updated information

  @TC_M6_091
  Scenario: Verify the navigation on the Purchase details page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify breadcrumb user clicks on market then the user should redirect to the market page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify breadcrumb user clicks on the Property details then user should redirect to the property details page

  @TC_M6_009 @TC_M6_015
  Scenario: Verify the UI of Buy Shares Page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page
    And Verify by default, the toggle button will be set to Shares Option
    And Verify remaining shares remain grayed by default on buy share page
    And Verify average share price = Sum of all Share Price divide by number of Shares on buy share page
    And Verify system will select shares no which can be buy in this amount calculate the total investment amount
    When User clicks on the Toggle button on buy share page
    And Verify should move to the USD option on buy share page
    And User enters any valid amount in Enter USD dollar field on buy share page
    Then Verify system will select shares no which can be buy in this amount calculate the total investment amount
    And Verify available Dollars Available share*Share price from index 0 1 4 on buy share page
    And Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links
    #TC_M6_015
    And Verify selected share will also display highlighted on buy share page

  @TC_M6_031 @TC_M6_032
  Scenario: Verify the UI of Confirm Your Purchase page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page
    When User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    Then Verify user will be redirected to the “Fund Your Purchase” page
    And Verify breadcrumbs on fund your purchase page
    And Verify Total Investment Value : (# of Shares) * (Avg. per Share) on fund your purchase page
    And Verify user should be able to view total amount, henry account balance and funds needed on fund your page
    And Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links
     #TC_M6_032
    And Verify breadcrumb user clicks on market then the user should redirect to the market page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify breadcrumb user clicks on the Property details then user should redirect to the property details page

  @TC_M6_064
  Scenario: Verify the functionality when user enter inValid code
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit abcde code in otp field on two factor auth popup on confirm your purchase page
    Then User should not be able to enter Alphabetic code in otp field on two factor auth popup on confirm your purchase page
    When User enters 6 digit @#$% code in otp field on two factor auth popup on confirm your purchase page
    Then User should not be able to enter Alphabetic code in otp field on two factor auth popup on confirm your purchase page
    When User enters 6 digit 12345 code in otp field on two factor auth popup on confirm your purchase page
    Then Verify user able to view Confirm Code button Disabled on two factor auth popup on confirm your purchase page
    When User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 323536 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    Then Verify user should be able to view error message when user entered incorrect otp on two factor auth popup

  @TC_M6_082
  Scenario: Verified if the user enters invalid input in Enter your initials field
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 123456 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page
    And Verify user should able to view "Enter Your Initials" field disabled on agree to terms popup
    And User enters value "  " in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify user should not allowed enter space in initials field on agree terms popup on confirm purchase page
    When User enters value "3443774" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify user should not allowed enter numeric digit in initials field on agree terms popup on confirm page
    When User enters value "@#$" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify user should not allowed enter special characters in initials field on agree terms popup on confirm purchase page
    When User enters value "mt" in enter your initials field on agree to terms popup on confirm your purchase page
    Then Verify user able to view should changed lower to upper case character in initials field on agree terms popup

  @TC_M6_069
  Scenario: Verify the validation of 2 failed attempts, when user enter 3 times wrong OTP and then Resend new OTP, So how wrong attempts user have.
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User clicks on the "Confirm Purchase" button on fund your purchase page
    And User clicks on the Continue button on confirm your purchase page
    And User clicks on "Email" option on Two Factor Authentication popup on confirm your purchase page
    And User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page
    And User enters 6 digit 646237 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 190193 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User clicks on resend code link on two Factor Auth verification popup on confirm your purchase page
    Then User should able to get another code send to preferred method on two Factor Auth verification popup
    When User enters 6 digit 646237 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 190193 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 102937 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    And User removes code from otp box on two factor auth popup on confirm your purchase page
    And User enters 6 digit 152563 code in otp field on two factor auth popup on confirm your purchase page
    And User clicks on "Confirm" Button on two factor auth popup on confirm your purchase page
    Then User should able to view error message when user failed due to more than three attempts

  @TC_M6_010
  Scenario: Verify the Redirections in the Buy Shares Page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page
    And Verify breadcrumb user clicks on market then the user should redirect to the market page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify breadcrumb user clicks on the Property details then user should redirect to the property details page

  @TC_M6_025
  Scenario: Verify the the functionality when sufficient funds are available in Henry Account balance
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    Then User will be able to continue purchase by using Henry account balance on fund your purchase page
    When User clicks on the "Confirm Purchase" button on fund your purchase page
    Then Verify user should navigate to confirm your purchase page

  @TC_M6_037 @TC_M6_038 @TC_M6_039
  Scenario: Verify the Functionality when user didn't done any activity or If user doesn't move mouse cursor for “2-3” minutes on this page
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User didn't do any activity for minimum 4 min on confirm your purchase page
    Then User should be able to view Pop-up says Are you there? on confirm your purchase page
      #TC_M6_038
    And Verify users should be able to view UI of Are you there? popup
      #TC_M6_039
    And User should be able to stay on Same page by clicking on “Continue Purchase” and pop-p is closed

  @TC_M6_041
  Scenario: Verify the functionality of Auto cancel Purchase of shares process
    When User clicks on buy button over property card on market page
    And User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    And User didn't do any activity for minimum 4 min on confirm your purchase page
    Then User should be able to view Pop-up says Are you there? on confirm your purchase page
    When User didn't do any activity for minimum 4 min on confirm your purchase page
    Then User should navigate to Buy shares page if user didn't get active within 2:30 minutes of pop-up appearance