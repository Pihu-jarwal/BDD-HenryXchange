@KycPage
Feature: Kyc page feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+24@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page

  @TC_M7_001
  Scenario: Verify that level 1 user (without KYC) should able to navigate to KYC Step 1 page.
    Then Verify user should be able to navigate to KYC Step 1 page
    When User clicks on mobile number field on kyc page
    And User clicks on residential address on kyc page
    Then Verify mobile number field should be mandatory on kyc page
    When User clicks on city field on kyc page
    Then Verify residential address field should be mandatory on kyc page
    When User clicks on state input field on kyc page
    Then Verify city field should be mandatory on kyc page
    And User clicks on zip code input field on kyc page
    Then Verify state field should be mandatory on kyc page
    When User clicks on mobile number field on kyc page
    Then Verify zipcode field should be mandatory on kyc page
    When User clicks on market tab on KYC page
    And User enter property name on search bar on market page - Lakewood Oaks
    And User clicks on asset name as "Lakewood" on market page
    And User scroll down to financials and documents section on property detail page
    And User clicks on complete your account setup option on property detail page
    Then Verify user should be able to navigate to KYC Step 1 page
    When User clicks on Account setup from the header on kyc page
    And User clicks on verify Identity on account dropdown on kyc page
    Then Verify user should be able to navigate to KYC Step 1 page

  @TC_M7_002
  Scenario: Verify the UI of Step 1 page of KYC
    Then Basic information will be green ticket on kyc page
    And Verify Identity It will be highlighted as I am currently on it on kyc page
    And Verify add investor profile, link external account, deposit funds are disabled on kyc page

  @TC_M7_005
  Scenario: Verify Do this later option for Level 1 user (without KYC).
    And User clicks on do this later button on kyc page
    And User clicks on do this later button on Are you sure want to exit popup on kyc page
    Then User should be successfully redirected to Marketplace page with 20% completed Account setup

  @TC_M7_003
  Scenario: Verify Level 1 user (without KYC) is redirected to Verify Identity option with green empty circle.
    Then Basic information will be green ticket on kyc page
    And Verify Identity It will be highlighted as I am currently on it on kyc page

  @TC_M7_004
  Scenario: Verify for Level 1 user (without KYC) when mandatory details are not filled
    And User clicks on mobile number field on kyc page
    And User clicks on residential address on kyc page
    Then Verify mobile number field should be mandatory on kyc page
    When User clicks on city field on kyc page
    Then Verify residential address field should be mandatory on kyc page
    When User clicks on state input field on kyc page
    And Verify city field should be mandatory on kyc page
    And User clicks on zip code input field on kyc page
    Then Verify state field should be mandatory on kyc page
    When User clicks on mobile number field on kyc page
    Then Verify zipcode field should be mandatory on kyc page
    And Verify continue button should remain in the disabled state until all the mandatory details are not filled

  @TC_M7_006
  Scenario: Verify the functionality of Mobile Number field while completing KYC with valid input
    And User clicks on mobile number field on kyc page
    And User clicks on residential address on kyc page
    Then Verify mobile number field should be mandatory on kyc page
    And Verify number "2342443453" hyphen should be automatically included between the numbers on kyc page
    And Verify system should accept valid 10-digit Mobile number format as XXX-XXX-XXXX on kyc page
    And Verify valid US numbers should be accepted other than Non- VOIP landlines or temporary number on kyc page

  @TC_M7_007
  Scenario: Verify the functionality of Mobile Number field while completing KYC with invalid input.
    When User enter "23424434" digit mobile number in mobile input field on kyc page
    And User clicks on residential address on kyc page
    Then User should able to view error message when enters less than 10 digit mobile number in input field
    When User remove input field text "mobile" on kyc page
    And User enter "8295703598" digit mobile number in mobile input field on kyc page
    Then Verify error message should be displayed on entering existing Mobile number on kyc page
    When User remove input field text "mobile" on kyc page
    And User enter "67776787687887" digit mobile number in mobile input field on kyc page
    Then Verify error message should be displayed on entering invalid Mobile number on kyc page
    When User remove input field text "mobile" on kyc page
    And User enter "08295703598" digit mobile number in mobile input field on kyc page
    And User enter address "9675 County Road 210, Craig, CO, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify continue button will remain disabled if invalid value is included in input field on kyc page

  @TC_M7_008
  Scenario: Verify the functionality of Mobile Number field while completing KYC when field is left blank
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on mobile number field on kyc page
    And User clicks on residential address on kyc page
    Then Verify mobile number field should be mandatory on kyc page

  @TC_M7_009
  Scenario: Verify the functionality of Residential Address while completing KYC with valid input
    And User clicks on residential address on kyc page
    And User clicks on city field on kyc page
    Then Verify residential address field should be mandatory on kyc page
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    Then Verify that enter address matched with dropdown value on kyc page
    When User click on address from address dropdown on kyc page
    Then Verify that should auto fill all fields which are included in the address displayed in drop down

  @TC_M7_010
  Scenario: Verify the functionality of Residential Address while completing KYC with invalid input
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "12" in residential address input field on kyc page
    Then User type less than 3 characters no drop down will appear in residential field on kyc page
    And Verify continue button will remain disabled if invalid value is included in input field on kyc page
    When User remove input field text "address" on kyc page
    And User enter address "testtesttest" in residential address input field on kyc page
    Then Verify no options should appear if a address entered is not having any suggestion on kyc page

  @TC_M7_011
  Scenario: Verify the functionality of Residential Address while completing KYC with no input
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User clicks on residential address on kyc page
    And User clicks on city field on kyc page
    Then Verify residential address field should be mandatory on kyc page
    And Verify continue button will remain disabled if invalid value is included in input field on kyc page

  @TC_M7_012
  Scenario: Verify the functionality of City while completing KYC with valid input
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify city should be auto filled when user selects address from drop down on kyc page
    And User should be able to edit the city as "Collin" successfully and add another city on kyc page
    When User remove input field text "address" on kyc page
    And User enter address "Eee Zee Rd" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify city field should be mandatory on kyc page

  @TC_M7_014
  Scenario: Verify the functionality of City while completing KYC when field is left blank
    And User enter address "Eee Zee Road" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify city field should be mandatory on kyc page
    And Verify continue button should remain disabled if City field is left blank on kyc page

  @TC_M7_018
  Scenario: Verify the functionality of Zip Code while completing KYC with valid input
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify zip code should be auto filled when user selects address from drop down on kyc page
    When User remove input field text "zipcode" on kyc page
    Then User should be able to edit the zipcode as "59002" successfully and add another city on kyc page
    When User remove input field text "address" on kyc page
    And User enter address "Texas City, TX, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify zipcode field should be mandatory on kyc page
    When User can enter zip code "59234" in input field on kyc page
    Then Verify zip code filled in input field on kyc page
    And Verify valid 5 digit zip Code in field matching with city and State on kyc page

  @TC_M7_013
  Scenario: Verify the functionality of City while completing KYC with invalid input
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify city should be auto filled when user selects address from drop down on kyc page
    When User remove input field text "city" on kyc page
    Then Verify city field should be mandatory on kyc page

  @TC_M7_020
  Scenario: Verify the functionality of City while completing KYC when field is left blank
    When User enter address "Texas City, TX, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on zip code input field on kyc page
    And User clicks on mobile number field on kyc page
    Then Verify zipcode field should be mandatory on kyc page
    And Verify continue button should remain disabled if Zip Code field is left blank on kyc page

  @TC_M7_021
  Scenario: Verify the functionality of Apartment Number/ Suite Number while completing KYC.
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    Then Verify Apt, Suite is not mandatory field on kyc page
    When User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify Apt, Suite should not auto filled when user selects suggested address on kyc page
    And Verify No impact will be observed on continue button even if Apt,Suite field is left blank on kyc page

  @TC_M7_023 @TC_M7_022
  Scenario: Verify the functionality of Continue button while completing KYC when all mandatory fields are filled
    Then Verify continue button should remain in disabled if all mandatory fields are unfilled on kyc page
      #TC_M7_022
    When User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then verify continue button should be enabled if all valid details are filled in mandatory fields

  @TC_M7_024
  Scenario: Verify functionality of Continue button while completing KYC when all mandatory fields are filled with invalid data
    And User enter "67776787687887" digit mobile number in mobile input field on kyc page
    And User enter address "21323233123" in residential address input field on kyc page
    And User enter city name "invalidCityName" in input field on kyc page
    And User enter state name "state" in input field on kyc page
    And User can enter zip code "592344" in input field on kyc page
    Then Verify continue button will remain disabled if invalid value is included in input field on kyc page

  @TC_M7_025 @TC_M7_026 @TC_M7_027
  Scenario: Verify the functionality of Do this later button displayed in Verify Identity page while performing Kyc
    And User clicks on do this later button on kyc page
    Then Verify user should be redirected to the exit pop-up on kyc page
    #TC_M7_026
    And User should be able to view UI of exit popup like placeholder name on kyc page
    And Verify user able to view "Do this later" and "Return to verification" buttons on kyc page
    #TC_M7_027
    When User clicks on do this later button on Are you sure want to exit popup on kyc page
    Then User should be redirected to the Marketplace page

  @TC_M7_028 @TC_M7_029 @TC_M7_031 @TC_M7_032
  Scenario: Verify  functionality of Return to Verification btn displayed in exit setup pop up while performing KYC
    And User clicks on do this later button on kyc page
    And User click on return to verification button on exit popup on kyc page
    Then Verify user should be able to navigate to KYC Step 1 page
    When User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    Then User should be redirected to OTP pop-up on kyc page
    #TC_M7_029
    And Verify UI of OTP popup on kyc page like placeholder text, 6 box should appear
    And Verify resend code link, confirm code button on kyc page
    #TC_M7_031
    When User enter 6-digit valid code 123456 in otp input field on kyc page
    #TC_M7_032
    Then Verify confirm Code button should be enabled if 6-digit code is entered on kyc page

  @TC_M7_034
  Scenario: Verify functionality of Confirm Code button when invalid OTP is entered while completing KYC process
    And User enter "8295701202" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 299212 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify six 6 digit code you entered is incorrect on OTP popup on kyc page
    When User remove code from otp box on OTP popup on kyc page
    And User enter 6-digit valid code 434334 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    And User remove code from otp box on OTP popup on kyc page
    And User enter 6-digit valid code 434334 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify user enters the invalid code third time on otp popup on kyc page

  @TC_M7_035
  Scenario: Verify the functionality of Resend Code link while completing KYC process
    And User enter "8295701202" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User click on resend code link on OTP popup on kyc page
    Then Verify new code should be sent successfully

  @TC_M7_041 @TC_M7_042 @TC_M7_044
  Scenario: Verify functionality of Mobile Number Verified Pop up when valid OTP entered for completing KYC process
    And User enter "8295709826" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 123456 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then User should be redirected to Mobile Number Verified Popup on kyc page
      #TC_M7_042
    And User should be able to view placeholder text on mobile verified popup on kyc page
      #TC_M7_044
    And User should be redirected to Marketplace page successfully after 2 seconds
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    Then User clicks on save changes button on edit name popup on account page

  @TC_M7_043
  Scenario: Verify the functionality of cross icon displayed in the Mobile Number Verified pop-up after completing KYC
    And User enter "8295709364" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 123456 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then User should be redirected to Mobile Number Verified Popup on kyc page
    When User click on cross icon on mobile verified popup on kyc page
    Then User should be redirected to the Marketplace page
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User click on confirm button on edit name confirmation popup on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    Then User clicks on save changes button on edit name popup on account page

  @TC_M7_030
  Scenario: Verify the functionality of Confirm Code when valid OTP is entered for completing KYC process
    And User enter "8295701202" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User click on cross icon on OTP popup on kyc page
    Then User should be redirected to Verify identity page with all fields filled and continue button active

  @TC_M7_040 @TC_M7_033
  Scenario:Verify the functionality of Confirm Code when less than 6-digit OTP is entered for completing KYC process
    And User enter "8295709382" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User clicks on continue button on kyc page
    And User enter 6-digit valid code 12345 in otp input field on kyc page
    Then Verify confirm Code button should remain in the disabled form if less than 6-digit code is entered
    #TC_M7_033
    When User remove code from otp box on OTP popup on kyc page
    And User enter 6-digit valid code 038293 in otp input field on kyc page
    And User click on confirm code button on OTP popup on kyc page
    Then Verify six 6 digit code you entered is incorrect on OTP popup on kyc page

  @TC_M7_046
  Scenario: Verify the functionality of Finish Account setup link when KYC is not completed
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    When User click on finish account setup link on account page
    Then Verify user should be able to navigate to KYC Step 1 page

  @TC_M7_047 @TC_M7_048 @TC_M7_049
  Scenario: Verify the functionality of Edit link for name when KYC is not completed
    And User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And User clicks on edit name on account page
    Then Verify user is on edit name popup on account page
      #TC_M7_048
    And User able to view the edit name text, legal first name and legal last name text field on edit name popup in account page
    And User able to view the cancel and save changes button on edit name popup in account page
    And Verify first and last name should be auto field on edit name popup on account page
    #TC_M7_049
    When User clicks on cancel button on edit name popup in account page
    Then Verify user is on account page

  @TC_M7_050
  Scenario: Verify the functionality of editing Legal First name on Edit Name pop up without KYC
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User click on first name input field on edit name popup on account page
    Then Verify legal first name input field should active with blue placeholder
    When User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    Then Verify save Changes button should active on edit name popup on account page

  @TC_M7_051
  Scenario: Verify the functionality of editing Legal Last name on Edit Name pop up without KYC
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User click on last name input field on edit name popup on account page
    Then Verify legal last name input field should active with blue placeholder
    When User remove last name from name field on edit name popup on account page
    And User enter last name in input field on edit name popup on account page
    Then Verify save Changes button should active on edit name popup on account page

  @TC_M7_052
  Scenario: Verify the functionality of Save Changes button on Edit Name pop up without KYC
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    And User remove last name from name field on edit name popup on account page
    And User enter last name in input field on edit name popup on account page
    And User clicks on save changes button on edit name popup on account page
    Then Verify user is on account page

  @TC_M7_053
  Scenario: Verify the functionality of updated name without KYC
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    And User clicks on edit name on account page
    And User remove first name from name field on edit name popup on account page
    And User enter first name in input field on account page
    And User remove last name from name field on edit name popup on account page
    Then Verify User enter last name, And should updated with new Legal Last Name and old Legal Last Name

  @TC_M7_045
  Scenario: Verify the UI of Account page when KYC is not done
    And User clicks on profile icon on header
    Then Verify the profile menu item on header
    When User clicks on account on profile menu on header
    Then Verify user able to view Name of the user and edit button on account page
    And Verify kyc process not completed message on account page
    And Verify finish account setup link on account page
    And Verify auth email field on account page
    And Verify two factor auth update option should be visible
    And Verify password field should be visible on account page
    And Verify user able to view phone number on account page

  @TC_M7_068 @TC_M7_069
  Scenario: Verify the UI of Account setup drop down when KYC is not done
    And User clicks on Account setup from the header on kyc page
    Then User should be able to view drop down of account setup on kyc page
    And Basic information will be green ticket on kyc page
      #TC_M7_069
    And User clicks on verify Identity on account dropdown on kyc page

  @TC_M7_071
  Scenario: Verify the functionality of 20% Account completed for Level 1 User when KYC is not completed
    Then User should be able to view 20% completed with circle having only 20% on kyc page

  @TC_M7_019
  Scenario: Verify the functionality of Zip Code while completing KYC with invalid input
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User remove input field text "zipcode" on kyc page
    And User clicks on state input field on kyc page
    Then Verify zipcode field should be mandatory on kyc page
    When User can enter zip code "5923" in input field on kyc page
    Then Verify error message when user enter invalid data in Zip Code field on kyc page
    And Verify continue button will remain disabled if invalid value is included in input field on kyc page

  @TC_M7_016
  Scenario: Verify the functionality of State while completing KYC with invalid selection
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    And User remove input field text "state" on kyc page
    And User clicks on mobile number field on kyc page
    Then Verify state field should be mandatory on kyc page

  @TC_M7_015
  Scenario: Verify the functionality of State while completing KYC with valid input
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    Then Verify state should be auto filled when selects address on kyc page
    And User should be able to edit state and select another state "state" on kyc page
    When User remove input field text "address" on kyc page
    And User enter address "usa" in residential address input field on kyc page
    And User clicks on residential address on kyc page
    Then Verify address selected is not having state included in address on kyc page
    When User enter state name "state" in input field on kyc page
    Then Verify state should be filled when enter state in input field on kyc page

  @TC_M7_017
  Scenario: Verify the functionality of State while completing KYC when field is left blank
    And User enter "8295703593" digit mobile number in mobile input field on kyc page
    And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
    And User click on address from address dropdown on kyc page
    When User remove input field text "state" on kyc page
    And User clicks on mobile number field on kyc page
    Then Verify state field should be mandatory on kyc page
    And Verify continue button should remain in disabled if all mandatory fields are unfilled on kyc page

