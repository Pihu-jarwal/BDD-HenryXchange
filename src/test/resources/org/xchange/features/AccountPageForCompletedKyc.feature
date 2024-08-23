@KycPage
Feature: Account feature for completed kyc

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+61@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header

  @TC_M7_054
  Scenario: Verify the UI of Account page when KYC is completed
    Then Verify user able to view Name of the user and edit button on account page
    And Verify address included during KYC should be displayed on account page
    And Verify KYC should be verified on account page
    And Verify auth email field on account page
    And Verify two factor auth update option should be visible
    And Verify password field should be visible on account page
    And Verify user able to view phone number on account page

  @TC_M7_055 @TC_M7_056 @TC_M7_057
  Scenario: Verify the functionality of Edit link for name after KYC is completed
    And User clicks on edit name on account page
    Then User should be redirected to Edit Name confirmation pop up on account page
    #TC_M7_056
    And Verify user able to view title and sub title to Edit Name confirmation pop up on account page
    And User able to view cancel button on edit name confirmation popup on account page
    #TC_M7_057
    When User clicks on cancel button on edit name confirmation popup in account page
    Then Verify user is on account page


  @TC_M7_059 @TC_M7_058
  Scenario: Verify the functionality of Cancel button of Edit Name pop up when KYC is completed
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    Then Verify user is on edit name popup on account page
    #TC_M7_058
    When User clicks on cancel button on edit name popup in account page
    Then Verify user is on account page

  @TC_M7_062
  Scenario: Verify the functionality of editing Legal First name on Edit Name pop up when KYC is completed
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User click on first name input field on edit name popup on account page
    Then Verify legal first name input field should active with blue placeholder
    When User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    Then Verify save Changes button should active on edit name popup on account page

  @TC_M7_063
  Scenario: Verify the functionality of editing Legal Last name on Edit Name pop up after KYC is completed
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User click on last name input field on edit name popup on account page
    Then Verify legal last name input field should active with blue placeholder
    When User remove last name from name field on edit name popup on account page
    And User enter last name in input field on edit name popup on account page
    Then Verify save Changes button should active on edit name popup on account page

  @TC_M7_064 @TC_M7_065
  Scenario: Verify the functionality of Save Changes button on Edit Name pop up when KYC was completed before
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    And User remove last name from name field on edit name popup on account page
    And User enter last name in input field on edit name popup on account page
    And User clicks on save changes button on edit name popup on account page
    Then Verify user should be able to navigate to KYC Step 1 page
    #TC_M7_065
    When User enter "8295701202" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 123456 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then User should be redirected to the Marketplace page

  @TC_M7_066
  Scenario: Verify the functionality of updated name when KYC was completed before
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    And User remove last name from name field on edit name popup on account page
    Then Verify User enter last name, And should updated with new Legal Last Name and old Legal Last Name

  @TC_M7_067
  Scenario: Verify the UI of updated name when user is active to re- KYC
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    And User remove last name from name field on edit name popup on account page
    And User enter last name in input field on edit name popup on account page
    And User clicks on save changes button on edit name popup on account page
    Then Verify user should be able to navigate to KYC Step 1 page
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    Then Verify user able to view Name of the user and edit button on account page
    And Verify kyc process not completed message on account page
    And Verify finish account setup link on account page
    And Verify auth email field on account page
    And Verify two factor auth update option should be visible
    And Verify password field should be visible on account page
    And Verify user able to view phone number on account page
    When User click on finish account setup link on account page
    And User enter "8295701202" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 123456 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then User should be redirected to the Marketplace page

  @TC_M7_070
  Scenario: Verify the UI of Account setup drop down when KYC is done
    When User clicks on Account setup from the header on kyc page
    Then User should be able to view drop down of account setup on kyc page
    And Basic information will be green ticket on kyc page

  @TC_M7_072
  Scenario: Verify the functionality of 100% Account completed for Level 2 User when KYC is completed
    Then User able to view 100% completed with circle having only 100% completed if KYC is completed

  @TC_M7_061
  Scenario: Verify the functionality of Cancel button of Edit Name pop up when KYC is completed.
    And User clicks on edit name on account page
    And User clicks on cancel button on edit name confirmation popup in account page
    Then Verify User is on account page

  @TC_M7_060
  Scenario: Verify the UI of Edit Name pop up for name after KYC is completed
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    Then User able to view the edit name text, legal first name and legal last name text field on edit name popup in account page
    And User able to view the cancel and save changes button on edit name popup in account page
    And Verify first and last name should be auto field on edit name popup on account page

  @TC_M10.1_038 @TC_M10.1_039 @TC_M10.1_040 @TC_M10.1_041
  Scenario:Verify that user should be redirected to the Edit Mobile Number option in the Account page when KYC is completed.
    Then User should able to view Edit option in Mobile Number section on account page
     #TC_M10.1_039
    When User click on edit option in mobile number section on account page
    Then User should be successfully redirected to Edit Mobile Number pop up on account page
    #TC_M10.1_040
    And Verify mobile number field on edit popup on account page
    And Verify placeholder text on edit popup on account page
    And Verify cancel button and verify mobile number button on edit popup on account page
    #TC_M10.1_041
    And Verify green outline circle should displayed with Request Details option on account page

  @TC_M10.1_042
  Scenario: Verify the functionality of editing Mobile Number with valid input
    Then User should able to view Edit option in Mobile Number section on account page
    When User click on edit option in mobile number section on account page
    Then Verify mobile number should be autofill on mobile number popup on account page

  @TC_M10.1_043
  Scenario: Verify the functionality of editing Mobile Number with valid input.
    Then User should able to view Edit option in Mobile Number section on account page
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "test@#$" in input field on account page
    Then Verify no other value should acceptable except numeric values on account page
    When User enter mobile number "829-570-3458" in input field on account page
    Then Verify user able to view a green check in mobile number field on account page
    When User enter mobile number "8" in input field on account page
    Then Verify system should accept valid 12-digit Mobile number including 2 characters for hyphens on account page
    And Verify non VOIP, landlines message below the mobile number field on account page

  @TC_M10.1_044
  Scenario: Verify the functionality of editing Mobile Number with invalid input
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "82957" in input field on account page
    Then Verify system should reject Mobile number with invalid format on account page
    When User will remove mobile number from mobile number field on account page
    And User enter mobile number "6777678764" in input field on account page
    Then Verify error message should displayed on entering invalid Mobile number on account page

  @TC_M10.1_045 @TC_M10.1_046
  Scenario: Verify the functionality of editing Mobile Number with existing Mobile Number.
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295703597" in input field on account page
    Then Verify error message should displayed on entering existing Mobile number on account page
    #TC_M10.1_046
    And Verify cross icon should appear with below validation message on account page

  @TC_M10.1_047
  Scenario: Verify the functionality of Cancel button displayed on the Edit Mobile Number pop up
    When User click on edit option in mobile number section on account page
    And User click on cancel button on edit option on account page
    Then Verify user is on account page

  @TC_M10.1_048
  Scenario: Verify Mobile Number button when autofill number for this account is displayed on the Edit Mobile Number pop up
    When User click on edit option in mobile number section on account page
    Then Verify mobile Number button should remain in disabled when already autofill number is displayed on account page

  @TC_M10.1_049
  Scenario: Verify Mobile Number button when valid number is included in the field on the Edit Mobile Number pop up
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    Then Verify mobile number button should enabled if valid non existing number is entered on account page

  @TC_M10.1_050
  Scenario: Verify the Mobile Number button when invalid number is included in the field on the Edit Mobile Number pop up
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "6778767887" in input field on account page
    Then Verify Mobile Number button should remain disabled when invalid Number entered in input field on account page

  @TC_M10.1_051
  Scenario: Verify the functionality of Verify Mobile Number button displayed in the Edit Mobile Number Pop up
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    Then Verify user should redirected to Verify Mobile Number pop up when clicked on Verify Mobile Number button

  @TC_M10.1_052
  Scenario: Verify the UI of Verify Mobile Number pop up
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    Then Verify request detail tick with green filled circle on verify mobile popup on account page
    And Verify Didn't get a code? resend code link on verify mobile popup on account page
    And Verify change mobile number btn and confirm code button on verify mobile popup on account page

  @TC_M10.1_053
  Scenario: Verify the Verify Mobile Number green outline circle displayed in Verify Mobile Number pop up.
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    Then Verify request detail tick with green filled circle on verify mobile popup on account page

  @TC_M10.1_054
  Scenario: Verify the functionality of valid OTP required to Verify Mobile Number
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 643238 in input field on verify mobile popup on account page
    Then Verify user should able to include 6-digit code on verify mobile popup on account page

  @TC_M10.1_055
  Scenario: Verify the functionality of invalid OTP filled while changing the Mobile Number
    When User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 44323 in input field on verify mobile popup on account page
    Then Verify confirm button should disabled when enter less than 6 digit code in OTP box on verify mobile popup on account page

  @TC_M10.1_057
  Scenario: Verify the functionality of Resend Code link while changing the Mobile Number
    Then Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    When User click on resend code button on verify mobile popup on account page
    Then Verify text new code should be sent successfully on verify mobile popup on account page

  @TC_M10.1_058
  Scenario: Verify the functionality of OTP code expiration while changing the Mobile number.
    And User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number "8295706463" in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User will wait 5 for verify OTP popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify validation message should displayed after 5 minutes of code generation on account page

  @TC_M10.1_065 @TC_M10.1_066
  Scenario: Verify the functionality of Confirm Code when valid OTP is entered while changing the Mobile number
    And User get the value of mobile number section on account page
    And User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 123456 in input field on verify mobile popup on account page
    Then Verify confirm code button should enabled when enter valid OTP on account page
    #TC_M10.1_066
    When User click on confirm code button on verify mobile popup on account page
    Then Verify user able to view mobile number verified popup on account page
    And Verify number is changed successfully on account page

  @TC_M10.1_067 @TC_M10.1_068
  Scenario: Verify the UI of Mobile Number Verified pop up while changing the Mobile Number
    And User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 123456 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify user able to view placeholder text on verify mobile popup on account page
  #TC_M10.1_068
    When User click on cross icon on verify mobile popup on account page
    Then Verify user should be redirected to Account page

  @TC_M10.1_069
  Scenario: Verify the auto close functionality of Mobile Number Verified pop up while changing the Mobile Number.
    And User click on edit option in mobile number section on account page
    And User will remove mobile number from mobile number field on account page
    And User enter mobile number in input field on account page
    And User click on verify mobile number button on edit popup on account page
    And User enter OTP 123456 in input field on verify mobile popup on account page
    And User click on confirm code button on verify mobile popup on account page
    And User will wait for 3 sec on verify mobile popup on account page
    Then Verify user should be redirected to Account page

  @TC_M10.1_070 @TC_M10.1_071
  Scenario: Verify that user should be redirected to the Edit Address option in the Account page.
    Then Verify user able to view edit address option in address section on account page
      #TC_M10.1_071
    When User click on edit address option on on account page
    Then Verify User should be redirected to Edit Address pop up on account page

  @TC_M10.1_072
  Scenario: Verify the UI of Edit Address pop up
    And User click on edit address option on on account page
    Then Verify user able to view residential address field and apt suite on Edit Address pop up on account page
    And Verify user able to view city, state, zipcode on Edit Address pop up on account page
    And Verify user able to view cancel and save changes button on Edit Address pop up on account page

  @TC_M10.1_073
  Scenario: Verify autofill Address displayed in Residential Address, City, State and Zip code fields of Edit Address pop up
    And User click on edit address option on on account page
    Then Verify that state should auto fill field which are included in the address displayed in drop down
    And Verify that city should auto fill field which are included in the address displayed in drop down
    And Verify that zip code should auto fill field which are included in the address displayed in drop down

  @TC_M10.1_074 @TC_M10.1_075
  Scenario: Verify the functionality of Residential Address while changing the Address
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User click on city field on Edit Address pop up on account page
    Then Verify residential address field should be mandatory on Edit Address pop up on account page
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    Then Verify that enter address matched with dropdown value on Edit Address pop up on account page
    #TC_M10.1_075
    When User click on address from address dropdown on Edit Address pop up on account page
    Then Verify that should auto fill all fields which are included in the address displayed in drop down

  @TC_M10.1_076
  Scenario: Verify the functionality of Residential Address while changing address with no input
    And User click on edit address option on on account page
    And User click on residential address on Edit Address pop up on account page
    And User click on city field on Edit Address pop up on account page
    Then Verify residential address field should be mandatory on Edit Address pop up on account page
    And Verify save changes button should disabled on Edit Address pop up on account page

  @TC_M10.1_077
  Scenario: Verify the functionality of City while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    Then Verify City should autofill when user selects address on Edit Address pop up on account page

  @TC_M10.1_078
  Scenario: Verify the functionality of City while changing address with invalid input
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    And User remove input field text "city" on Edit Address pop up on account page
    And User click on city field on Edit Address pop up on account page
    Then Verify city field should mandatory on Edit Address pop up on account page

  @TC_M10.1_079 @TC_M10.1_080
  Scenario: Verify the functionality of State while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    Then Verify state should be filled when enter state in input field on Edit Address pop up on account page
      #TC_M10.1_080
    When User remove input field text "state" on Edit Address pop up on account page
    And User click on city field on Edit Address pop up on account page
    Then Verify state field should be mandatory on Edit Address pop up on account page

  @TC_M10.1_081
  Scenario: Verify the functionality of Zip code while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    Then Verify zip code should be filled when enter zip code in input field on Edit Address pop up on account page

  @TC_M10.1_082
  Scenario: Verify the functionality of State while changing address with invalid input.
    And User click on edit address option on on account page
    And User remove input field text "zipcode" on Edit Address pop up on account page
    And User click on city field on Edit Address pop up on account page
    Then Verify zipcode field should mandatory on Edit Address pop up on account page

  @TC_M10.1_083
  Scenario: Verify the functionality of manually adding Residential Address while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    Then Verify residential address should filled when select address dropdown value on Edit Address pop up on account page

  @TC_M10.1_084
  Scenario: Verify the functionality of manually adding City while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "city" on Edit Address pop up on account page
    And User enter city name "invalidCityName" in input field on Edit Address pop up on account page
    Then Verify User should be able to type the City successfully on Edit Address pop up on account page

  @TC_M10.1_085
  Scenario: Verify the functionality of manually adding State while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "state" on Edit Address pop up on account page
    And User enter state name "state" in input field on Edit Address pop up on account page
    Then Verify state should be filled when enter state in input field on Edit Address pop up on account page

  @TC_M10.1_086
  Scenario: Verify the functionality of manually adding Zip Code while changing address with valid input
    And User click on edit address option on on account page
    And User remove input field text "zipcode" on Edit Address pop up on account page
    And User enter zip code name "12345" in input field on Edit Address pop up on account page
    Then Verify zipcode should be filled when enter state in input field on Edit Address pop up on account page

  @TC_M10.1_087
  Scenario: Verify the enabled state of Save Changes button when Residential address, city, state and Zip code are filled with valid inputs while changing address with valid input.
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential input field on Edit Address pop up on account page
    And User click on address from address dropdown on Edit Address pop up on account page
    Then Verify Save Changes button should enabled when valid input is added on Edit Address pop up on account page

  @TC_M10.1_088
  Scenario: Verify the enabled functionality of Cancel button while changing address.
    And User click on edit address option on on account page
    And User click on cancel button on Edit Address pop up on account page
    And Verify user should redirect to my account page

  @TC_M10.1_089
  Scenario: Verify the functionality of Save Changes button when Residential address, city, state and Zip code are selected from suggestions while changing address
    And User get the value of address on account page
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address in residential input field on Edit Address pop up on account page
    And User enter city name "invalidCityName" in input field on Edit Address pop up on account page
    And User enter state name "state" in input field on Edit Address pop up on account page
    And User enter zip code name "12345" in input field on Edit Address pop up on account page
    And User click on save changes on Edit Address pop up on account page
    And User click on confirm button on Did you mean popup on kyc page
    Then Verify user should be redirected successfully to My Account page with updated address

  @TC_M10.1_090 @TC_M10.1_091 @TC_M10.1_092 @TC_M10.1_093 @TC_M10.1_094 @fail
  Scenario: Verify the functionality of Save Changes button when Residential address, city, state and Zip code are added manually while changing address
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "test test" in residential input field on Edit Address pop up on account page
    And User enter city name "invalidCityName" in input field on Edit Address pop up on account page
    And User enter state name "state" in input field on Edit Address pop up on account page
    And User enter zip code name "12345" in input field on Edit Address pop up on account page
    And User click on save changes on Edit Address pop up on account page
    Then Verify user should be redirected to "Did you mean this Address ?" pop up on account page
    #TC_M10.1_091
    And Verify address which is recommended with radio button on did you mean popup on account page
    And Verify user able to view cancel and confirm button on Edit Address pop up on account page
    #TC_M10.1_092
    And Verify you Entered radio button is displayed as active by default on did you mean popup on account page
    #TC_M10.1_093
    And Verify recommended radio button should active, user clicks on radio button on did you mean popup on account page
    #TC_M10.1_094
    When User click on cancel button on Edit Address pop up on account page
    Then Verify user should redirect to address popup on account page

  @TC_M10.1_095
  Scenario: Verify the functionality of Confirm button of Did you mean this Address? pop up.
    And User click on edit address option on on account page
    And User remove input field text "address" on Edit Address pop up on account page
    And User enter address "test test" in residential input field on Edit Address pop up on account page
    And User enter city name "invalidCityName" in input field on Edit Address pop up on account page
    And User enter state name "state" in input field on Edit Address pop up on account page
    And User enter zip code name "12345" in input field on Edit Address pop up on account page
    And User click on save changes on Edit Address pop up on account page
    Then Verify user should be redirected to "Did you mean this Address ?" pop up on account page
    And Verify recommended radio button should active, user clicks on radio button on did you mean popup on account page
    When User click on confirm button on Did you mean popup on account page
    Then Verify user should be redirected successfully to My Account page with updated address

  @TC_M10.1_096 @TC_M10.1_097 @TC_M10.1_098 @TC_M10.1_100 @TC_M10.1_101
  Scenario: Verify that user should be redirected to the Account Recovery Mode option in the Account page when KYC is completed.
    Then Verify user able to view Change option in Account Recovery Mode section on account page
    #TC_M10.1_097
    When User click on account recovery update button on account page
    Then Verify verification method popup should be visible on account page
    #TC_M10.1_098
    And Verify user able to view email option on verification method popup on account page
    And Verify user able to view SMS option on verification method popup on account page
    And Verify user able to view cancel and confirm button on verification method popup on account page
    #TC_M10.1_100
    And Verify email should be displayed as default selection on verification method popup on account page
    #TC_M10.1_101
    When User click on cancel button on verification method popup on account page
    Then Verify User should redirect to account page

  @TC_M10.1_102 @TC_M10.1_103
  Scenario: Verify the functionality of changing the default option to SMS of Account Recovery Mode
    Then Verify user able to view Change option in Account Recovery Mode section on account page
    When User click on account recovery update button on account page
    Then Verify verification method popup should be visible on account page
    When User click on SMS text option on verification method popup on account page
    Then verify user SMS option should selected on verification method popup on account page
    #TC_M10.1_103
    When User click on email option on verification method popup on account page
    And User click on confirm button on verification method popup on account page
    Then Verify User should be redirect to account page

  @TC_M10.1_138 @TC_M10.1_139
  Scenario: Verify that user should be redirected to the Edit Password option in the Account page when KYC is not completed
    Then Verify user able to view password edit option on account page
      #TC_M10.1_139
    When User click on password edit option on account page
    Then Verify verification method popup should be visible on account page

  @TC_M10.1_143
  Scenario: Verify the UI of "Verify OTP" pop up displayed on clicking on Edit option while changing password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    And Verify 6 digit otp field should be visible on verify OTP pop up on account page
    And Verify close icon should be visible on verify OTP pop up on account page
    And Verify placeholder text "OTP Sent" on verify OTP pop up on account page
    And Verify Didn't receive it? Resend code link on verify OTP pop up on account page
    When User click on cross icon on verify OTP pop up on account page
    Then User should redirect to account page

  @TC_M10.1_145
  Scenario: Verify the functionality of invalid OTP filled while changing password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    Then Verify user should be redirected to Verify OTP pop up on account page
    When User enter otp "12345" in input field on Verify OTP pop up on account page
    Then Verify confirm button should disabled when enter less than 6 digit code in OTP box on verify mobile popup on account page
    When User remove Otp code in input field on Verify OTP pop up on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    Then Verify confirm code button should enabled when enter valid OTP on account page

  @TC_M10.1_147
  Scenario: Verify the functionality of Resend Code link while changing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And Verify Resend Code link should displayed in enabled state on verify mobile popup on account page
    And User click on resend code link on Verify OTP pop up on account page
    Then Verify "Code resent successfully!" should be sent successfully

  @TC_M10.1_153 @TC_M10.1_154 @TC_M10.1_155 @TC_M10.1_156 @TC_M10.1_157
  Scenario: Verify the functionality of Confirm Code button when valid OTP is entered.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    Then Verify ID Verified pop up should be displayed on account page
    #TC_M10.1_154
    And Verify user able to view your id verified text on verified popup on account page
      #TC_M10.1_155
    When User click on cross icon on verify OTP pop up on account page
    Then Verify user should be redirected to Edit Password pop up on account page
    #TC_M10.1_156
    And Verify old password field should visible to Edit Password pop up on account page
    And Verify new password field should visible to Edit Password pop up on account page
    And Verify confirm password field should visible to Edit Password pop up on account page
    And Verify user able to view cancel and save change button on Edit Password pop up on account page
    #TC_M10.1_157
    When User click on cancel button on Edit Password pop up on account page
    Then User should be redirect to account page

  @TC_M10.1_159
  Scenario: Verify the functionality of New Password field with valid input while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User click on cross icon on verify OTP pop up on account page
    And User enter new password "Muskan@12345" in input field on Edit Password pop up on account page
    Then Verify password should be accepted successfully on Edit Password pop up on account page


  @TC_M10.1_162
  Scenario: Verify the functionality of New Password field with no input is entered while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123244" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify user able to view "Your password do not match" below confirm password field on Edit Password pop up on account page

  @TC_M10.1_161
  Scenario: Verify the functionality of Confirm New Password field with valid input while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    Then Verify Save Changes button should enabled when valid input is added on Edit Address pop up on account page

  @TC_M10.1_167
  Scenario: Verify the enabled state of Save Changes button displayed on Edit Password pop up
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@12345" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    Then Verify Save Changes button should enabled when valid input is added on Edit Address pop up on account page

  @TC_M10.1_163 @TC_M10.1_164 @TC_M10.1_165 @TC_M10.1_166
  Scenario: Verify when incorrect password is entered in the Old Password field while editing the password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify 2 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up
      #TC_M10.1_164
    When User remove input field text "oldPassword" on Edit Password pop up on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify 1 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up on account page
      #TC_M10.1_165
    When User remove input field text "oldPassword" on Edit Password pop up on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then Verify user able to view password not confirmed popup on account page
      #TC_M10.1_166
    And Verify user able to view placeholder text on password not confirmed popup on account page
    When User click on cross icon on password not confirmed popup on account page
    Then User should be redirected to My Account page when clicking on cross icon

  @TC_M10.1_141
  Scenario: Verify the default email state on "Choose Verification method" pop up displayed on clicking on Edit option while changing password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And Verify email should be displayed as default selection on verification method popup on account page

  @TC_M10.1_142
  Scenario: Verify the functionality of choosing Mobile Number on "Choose Verification method" pop up displayed on clicking on Edit option while changing password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on SMS text option on verification method popup on account page
    Then verify user SMS option should selected on verification method popup on account page
    When User click on cancel button on verification method popup on account page
    Then Verify User should redirect to account page

  @TC_M10.1_148
  Scenario: Verify the functionality of OTP code expiration while changing the password.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User will wait 5 for verify OTP popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify validation message should displayed after 5 minutes of code generation on account page

  @TC_M10.1_174 @TC_M10.1_175
  Scenario: Verify that user should be redirected to the Two-Factor Auth option in the Account page when KYC is completed
    Then Verify user able to view update option with Two-Factor Auth section on account page
    #TC_M10.1_175
    When User click on update option with Two-Factor Auth section on account page
    Then User should be redirected to "Choose Your Preferred Two-Factor Authorization Method" pop up

  @TC_M10.1_176 @TC_M10.1_177
  Scenario: Verify the UI of Choose Your Preferred Two-Factor Authorization Method pop up
    Then Verify user should able to view Turn off Email SMS option on Two-Factor Auth section on account page
    And Verify user able to view cancel and confirm button on Two-Factor Auth section on account page
    #TC_M10.1_177
    When User click on cancel button on Two-Factor Auth section on account page
    Then Verify user should be successfully redirected to My Account

  @TC_M10.1_168
  Scenario: Verify the functionality of Save Changes button displayed on Edit Password pop up.
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then User should be redirect to account page

  @TC_M10.1_140
  Scenario: Verify the UI of "Choose Verification method" pop up displayed on clicking on Edit option while changing password.
    Then Verify user should able to view Turn off Email SMS option on Two-Factor Auth section on account page
    And Verify user able to view cancel and confirm button on Two-Factor Auth section on account page

  @TC_M10.1_158
  Scenario: Verify Old Password while Editing Password
    Then Verify user able to view password edit option on account page
    When User click on password edit option on account page
    And User click on confirm button on verification method popup on account page
    And User enter otp "123456" in input field on Verify OTP pop up on account page
    And User click on confirm code button on verify mobile popup on account page
    And User enter old password "Muskan@1234567" in input field on Edit Password pop up on account page
    And User enter new password "Muskan@123243" in input field on Edit Password pop up on account page
    And User enter confirm password "Muskan@123243" in input field on Edit Password pop up on account page
    And User click on save changes button on Edit Password pop up on account page
    Then User should be redirect to account page
