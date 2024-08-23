@AddProperty

Feature: Add Property page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User click on owner tab on market page
    Then User navigate to owner dashboard page

  @TC_M9_001
  Scenario: Verify that user able to view Add Property Button over Owner page
    And User able to view Add property button at right top of owner dashboard page

  @TC_M9_002 @TC_M9_003
  Scenario: Verify that user able to navigate to Owner / Add Property Page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    #TC_M9_003
    And User able to view breadCrumbs "Add Property" on add property page
    And User able to view placeholder text "Add New Property" on add property page
    And User able to view subheading text "Enter property details to get started." on add property page
    And User able to view property name text field on add property page
    And User able to view Address text field on add property page
    And User able to view Apt suite optional text field on add property page
    And User able to view city text field on add property page
    And User able to view State text field on add property page
    And User able to view zipcode text field on add property page
    And User able to view Doors text field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown on add property page
    And User able to view state of entity text field on add property page
    And User able to view EIN text field on add property page
    And User able to view ticker symbol (optional) text field on add property page
    And User able to view continue button on add property page
    And User able to view cancel button on add property page

  @TC_M9_005
  Scenario: Verify the validation of Property name field with valid data
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on property name text field on add property page
    And User enter the property name "A" on add property page
    And User click on address input field on add property page
    Then User able to view error message "Property name must contain a minimum of 2 characters." on add property page
    Then User validate property name have maximum "45" character on add property page
    When User enter the property name "Alphanumeric123$" on add property page
    Then User validate property name should be alphanumeric with special characters on add property page

  @TC_M9_006
  Scenario: Verify the validation of Property name with invalid data
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on property name text field on add property page
    Then User able to view name field is active on add property page
    When User enter the property name "@#%" digit numeric on add property page
    Then User able to view error message "Please enter a valid Property Name." on add property page
    When User remove property name from input field on add property page
    And User enter the space " " in property name on add property page
    Then User should not be able to view entered data on add property page

  @TC_M9_007
  Scenario: Verify the validation of Address with valid data
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on address text field on add property page
    Then User able to view address field is active on add property page
    When User enter numeric character "413" in address field on add property page
    Then User able to view auto suggestion for typed input address on add property page
    When User remove input field text "address" on submit your application page
    And User enter alphabetic character in "abc" address field on add property page
    Then User able to view auto suggestion for typed input address on add property page
    When User remove input field text "address" on submit your application page
    And User enter alphanumeric character in "413good" address field on add property page
    Then User able to view auto suggestion for typed input address on add property page

  @TC_M9_008 @fail
  Scenario: Verify the validation of Address with Invalid data
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on address text field on add property page
    Then User able to view address field is active on add property page
    When User enter special character in "@#$" address field on add property page
    Then User should not be able to enter special character on add property page
    When User enter combination of alphabetic and special character "abc@def" on add property page
    Then User should not be able to enter Combination of alphabetic and special character on add property page
    When User enter Combination of numeric and special character "123@456" on add property page on add property page
    Then User should not be able to enter Combination of numeric and special character on add property page
    When User enter Combination of alphanumeric and special character "abc123@xyz" on add property page on add property page
    Then User should not be able to enter Combination of alphanumeric and special character on add property page
    When User enter 2 character value "NY" on add property page
    Then User Should not be able to view auto suggestion for address on add property page
    When User enter invalid address "ghaziabad" that is out of US Country and click outside the address field
    Then User should be able to view address field error message "Enter valid address" on add property page

  @TC_M9_009 @fail
  Scenario: Verify the validation of Minimum and Maximum character Address
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on address text field on add property page
    When User enter the address "NEW" in address field on add property page
    Then Verify user should be able to enter minimum 3 character on add property page
    When User enter the address "This is my Denton, TX address" in address field on add property page on add property page
    Then Verify user should be able to enter Maximum 50 character on add property page

  @TC_M9_010
  Scenario: Verify the functionality of Auto suggest address
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on address text field on add property page
    When User enter minimum 3 character "new" in address field on add property page
    Then User should be able to view dropdown list for auto suggest addresses on add property page

  @TC_M9_011
  Scenario: Verify the functionality when user erase all data from Address field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on address text field on add property page
    When User enter the character in "new" address field on add property page
    And User click on address from address dropdown on add property page
    Then User erase all address from address field on add property page

  @TC_M9_012
  Scenario: Verify the validation of name for  Apt,Suite field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on Apt,Suite field on add property page
    Then User should be able to view typing cursor on Apt,Suite field on add property page
    When User enter numeric value "123456" in Apt,Suite field on add property page
    Then User should be able to view entered input "123456" in Apt,Suite field on add property page
    When User remove input field text "apt" on add property page
    And User enter Alphabetic value "abcABh" in Apt,Suite field on add property page
    Then User should be able to view entered input "abcABh" in Apt,Suite field on add property page
    When User remove input field text "apt" on add property page
    And User enter Alphanumeric value "abc123@xyz" in Apt,Suite field on add property page
    Then User should be able to view entered input "abc123@xyz" in Apt,Suite field on add property page
    When User remove input field text "apt" on add property page
    And User enter Special character "@#$" in Apt,Suite field on add property page
    Then User should be able to view entered input "@#$" in Apt,Suite field on add property page
    When User remove input field text "apt" on add property page
    And User enter Combination of Alphanumeric and special character "abc123@xyz@@" in Apt,Suite field on add property page
    Then User should be able to view entered input "abc123@xyz@@" in Apt,Suite field on add property page

  @TC_M9_013 @fail
  Scenario: Verify the validation of Minimum and Maximum character for Apt, Suite
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on Apt,Suite field on add property page
    When User enter the character "ALP" in Apt,Suite field on add property page
    Then User should be able to enter minimum 3 character on add property page
    When User enter the Apt,Suite "This is apt, suit name" 50 character in Apt,Suite field on add property page
    Then User should be able to enter Maximum 50 character on add property page

  @TC_M9_018
  Scenario: Verify the Functionality of Zip Code field with valid input on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on Zip Code field on add property page
    And User enter 5 digit "90210" valid Zip Code on add property page
    Then Verify user able to view entered input in Zip Code field on add property page

  @TC_M9_019
  Scenario: Verify the Functionality of Zip Code field with valid input on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on Zip Code field on add property page
    And User enter zipcode digit "1" and click outside the field on add property page
    Then User should able to view error "Zip Code must be a 5-digit number" on add property page
    When User enter zipcode digit "12" and click outside the field on add property page
    Then User should able to view error "Zip Code must be a 5-digit number" on add property page
    When User enter zipcode digit "123" and click outside the field on add property page
    Then User should able to view error "Zip Code must be a 5-digit number" on add property page
    When User enter zipcode digit "1234" and click outside the field on add property page
    Then User should able to view error "Zip Code must be a 5-digit number" on add property page
    When User enter zipcode digit "201002" for non-matching state in zip code field on add property page
    Then User should able to view error "Zip Code must be a 5-digit number" on add property page

  @TC_M9_020
  Scenario: Verify the Validation of Doors field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    Then Verify user should be able to enter greater than 1 numeric value in field on add property page
    When User remove input field text "doors" on add property page
    And User enter doors "9999" in doors field on add property page
    Then Verify user should be able to enter less than 10000 numeric value in field on add property page
    And Verify user should be able to enter numeric digit only in doors field on add property page

  @TC_M9_021 @fail
  Scenario: Verify the error message when user enter invalid data in Doors
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on doors field on add property page
    And User enter invalid doors "1" in doors field on add property page
    Then User should be able to view error message "Doors should not be less than 2 or more than 9999." on add property page
    When User remove input field text "doors" on add property page
    And User enter invalid doors "100000" in doors field on add property page
    Then User should be able to view error message "Doors should not be less than 2 or more than 9999." on add property page
    When User remove input field text "doors" on add property page
    And User enter invalid doors "abc" in doors field on add property page
    Then User unable to view Entered value alphabetic value in doors field on add property page
    When User remove input field text "doors" on add property page
#    And User enter invalid doors "a1b2c" in doors field on add property page
#    Then User unable to view Entered value alphanumeric value in doors field on add property page
    When User enter invalid doors "#$%" in doors field on add property page
    Then User unable to view Entered value special character value in doors field on add property page
    When User enter invalid doors " " in doors field on add property page
    Then User unable to view Entered value space in doors field on add property page

  @TC_M9_022
  Scenario: Verify the Functionality of Property class field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    When User able to select option "A" in property class field on add property page
    Then User should be able to view "A" option selected in property class field on add property page
    And User click on property class field on add property page
    When User able to select option "B" in property class field on add property page
    Then User should be able to view "B" option selected in property class field on add property page
    And User click on property class field on add property page
    When User able to select option "C" in property class field on add property page
    Then User should be able to view "C" option selected in property class field on add property page
    And User click on property class field on add property page
    When User able to select option "D" in property class field on add property page
    Then User should be able to view "D" option selected in property class field on add property page

  @TC_M9_023
  Scenario: Verify the error message when user didn't select any option for Property Class field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    When User click on outside the field on add property page
    Then Verify user should be able to view property class field error message "Property class is mandatory" on add property page

  @TC_M9_024
  Scenario: Verify the functionality of Year Built field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    When User able to select option "2023" in Year Built field on add property page
    Then User should be able to view "2023" option selected in Year Built field on add property page

  @TC_M9_025
  Scenario: Verify the error message when user didn't select any option for Year Built field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    When User click on outside the field on add property page
    Then Verify User should be able to view year built field error message "Year Built is mandatory" on add property page

  @TC_M9_026
  Scenario: Verify the functionality of owner entity field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    When User able to select option "Agile Real Estate Group" in owner entity field on add property page
    Then User should be able to view "Agile Real Estate Group" option selected in owner entity field on add property page

  @TC_M9_027
  Scenario: Verify the error message when user didn't select any option for Owner Entity field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    When User click on outside the field on add property page
    Then Verify User should be able to view owner entity field error message "Owner Entity is mandatory" on add property page

  @TC_M9_028 @TC_M9_029
  Scenario: Verify the functionality of State of Entity Field
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    When User able to select option "Agile Real Estate Group" in owner entity field on add property page
    Then User should be able to view "Agile Real Estate Group" option selected in owner entity field on add property page
    And Verify user should be able to view State of Entity value depending upon the selection of Owner from Owner Entity listing on add property page
    #TC_M9_029
    And Verify user should be able to view EIN value depending upon the selection of Owner from Owner Entity listing on add property page

  @TC_M9_030
  Scenario: Verify the functionality of Ticker symbol field on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on ticker symbol field on add property page
    Then User enter the "abc123" value in ticker symbol field on add property page
    And Verify user should only allow to enter Alphabetic value in ticker symbol field on add property page
    When User enter the "abcdef" value in ticker symbol field on add property page
    Then Verify user should only allow to enter minimum and maximum 5 Alphabet in ticker symbol field on add property page
    When User enter the "abcdef" value in ticker symbol field on add property page
    Then Verify user Text should automatically be capitalized in ticker symbol field on add property page

  @TC_M9_031
  Scenario:Verify the functionality of Ticker symbol field with valid input on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on ticker symbol field on add property page
    Then User enter the "abcef" lowercase value between 3-5 alphabet in ticker symbol field on add property page
    And  Verify user should be able to view uppercase value in ticker symbol field on add property page
    When User enter the "ABCDS" uppercase value between 3-5 alphabet in ticker symbol field on add property page
    Then Verify user should be able to view uppercase value in ticker symbol field on add property page
#
  @TC_M9_032
  Scenario: Verify the functionality of Ticker symbol field with invalid input on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on ticker symbol field on add property page
    Then User enter value "ab" less than 3 alphabet in ticker symbol field and click outside the field on add property page
    And User should be able to view ticker symbol field error message "Not a valid Ticker Symbol, please try again." on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter value "MNBVCC" more than 5 alphabet in ticker symbol field on add property page
    Then User unable to enter more than 5 value in ticker symbol field on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter numeric value "12345" in ticker symbol field on add property page
    Then User should not be allowed to enter numeric value in ticker symbol field on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter special character value "@#$%" in ticker symbol field on add property page
    Then User should not be allowed to enter special character in ticker symbol field on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter space " " in ticker symbol field on add property page
    Then User should not be allowed to enter space in ticker symbol field on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter Enter alphanumeric value "abc123" in ticker symbol field on add property page
    Then User should not be allowed to enter alphanumeric value in ticker symbol field on add property page
    When User remove input field text "tickerSymbol" on add property page
    And User enter already used value "oaks" in ticker symbol field and click outside the field on add property page
    Then User should be able to view ticker symbol field error message "Sorry, that Ticker Symbol is already taken, please try again."

  @TC_M9_033
  Scenario: Verify the functionality when user hover mouse over "?" icon in Ticker Symbol field on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User hover the mouse over ? mark symbol in ticker symbol field on add property page
    Then User able to view tooltip on add property page
    And User able to view heading "Choose Your Ticker Symbol" in tooltip on add property page
    And User able to view body "Please choose a 3-5 Alpha Character Ticker Symbol to identify your Property ex.DTXMF" in tooltip on add property page

  @TC_M9_035
  Scenario: Verify the functionality of "Continue" Button when data is missing from the field on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User should be able to view continue Button disabled when some mandatory field value are null on add property page

  @TC_M9_036
  Scenario: Verify the functionality of "Continue" Button with all mandatory field value on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page

  @TC_M9_037
  Scenario: Verify the functionality of "Continue" Button when data is missing from the field on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on cancel button on add property page
    Then User should be able to view Are you sure you want to exit setup pop-up on add property page

  @TC_M9_038
  Scenario: Verify the UI of Are you sure you want to exit setup Pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on cancel button on add property page
    Then User should be able to view placeholder text are you sure you want to exit setup in exit setup popup on add property page
    And User should be able to view body Your property information that you have entered will be deleted and not be saved in exit setup popup on add property page
    And User should be able to view exit button in exit setup pop-up on add property page
    And User should be able to view return to add property button in exit setup pop-up on add property page

  @TC_M9_039
  Scenario: Verify the functionality of Exit button over "Are you sure you want to exit setup" Pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on cancel button on add property page
    When User click on exit button in exit setup pop-up on add property page
    Then User navigate to owner dashboard page

  @TC_M9_040
  Scenario: Verify the functionality of Return to Add Property button over "Are you sure you want to exit setup" Pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on cancel button on add property page
    When User click on return to address button in exit setup pop-up on add property page
    Then User should be able to stay on Add Property page and Pop-up is discarded

  @TC_M9_041
  Scenario: Verify the functionality when user click outside the "Are you sure you want to exit setup" Pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And User click on cancel button on add property page
    When User click outside the exit setup pop-up on add property page
    Then User should be able to stay on Add Property page and Pop-up is discarded

  @TC_M9_042
  Scenario: Verify the UI of Agree to terms Pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    And User able to view placeholder text "Agree to Terms" on Agree to terms Pop-up on add property page
    And User able to view property name on Agree to terms Pop-up on add property page
    And User able to view self name as "Muskan Trivedi" , position as "President" , and entity name as "Agile Real Estate Group" in the description on Agree to terms Pop-up on add property page
    And User able to view enter your initials field on Agree to terms Pop-up on add property page
    And User able to view agree and continue button on Agree to terms Pop-up on add property page
    And User able to view owner position in bracket & owner entity name just below the Initials field on Agree to terms Pop-up
    And User able to view download button on Agree to terms Pop-up on add property page
    And User able to view cross icon at right top on Agree to terms Pop-up on add property page

  @TC_M9_043
  Scenario: Verify the functionality when Enter Your Initials button should active
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User scroll till the bottom of the Agreement description on agree to terms popup on add property page
    Then User should be able to view Enter Your Initials field Active on agree to terms popup on add property page

  @TC_M9_044
  Scenario: Verify the Validation of Enter Your Initials fields on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User scroll till the bottom of the Agreement description on agree to terms popup on add property page
    Then User should be able to view Enter Your Initials field Active on agree to terms popup on add property page
    When User enter "A" Input Alpha character in enter your initials field on agree to terms popup on add property page
    Then Verify input "A" must be Alpha character in enter your initials field on agree to terms popup on add property page
    When User enter "ABC" Caps Alpha character in enter your initials field on agree to terms popup on add property page
    Then Verify input "ABC" only allow Caps Alpha character in enter your initials field on agree to terms popup on add property page
    When User enter "AB" Minimum 2 Character allowed in enter your initials field on agree to terms popup on add property page
    Then Verify minimum 2 Character allowed in enter your initials field on agree to terms popup on add property page
    When User enter "ANUJ" Maximum 3 character allowed in enter your initials field on agree to terms popup on add property page
    Then Verify maximum 3 character allowed in enter your initials field on agree to terms popup on add property page
    When User enter "MT" Character should match the first letter of the First name and Middle name and Last name in enter your initials field on agree to terms popup on add property page
    Then Character should match the first letter of the First name and Middle name and Last name in enter your initials field on agree to terms popup on add property page

  @TC_M9_045
  Scenario: Verify that user enter Invalid input on add property page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User scroll till the bottom of the Agreement description on agree to terms popup on add property page
    Then User should be able to view Enter Your Initials field Active on agree to terms popup on add property page
    When User enter "12345" input numeric digit in enter your initials field on agree to terms popup on add property page
    Then Verify user not allowed to enter numeric digit in enter your initials field on agree to terms popup on add property page
    When User remove initial input field text on add property page
    And User enter "%$$$^" input special character in enter your initials field on agree to terms popup on add property page
    Then Verify user not allowed to enter special character in enter your initials field on agree to terms popup on add property page
    When User remove initial input field text on add property page
    And User enter "aks" input lower case alpha character in enter your initials field on agree to terms popup on add property page
    Then Verify user view lower case alphabet should changed to upper case character in enter your initials field on agree to terms popup on add property page
    When User remove initial input field text on add property page
    And User enter " " input space in enter your initials field on agree to terms popup on add property page
    Then Verify user not allowed to enter space in enter your initials field on agree to terms popup on add property page
    When User remove initial input field text on add property page
    And User enter "mk" wrong input in enter your initials field on agree to terms popup on add property page
    Then Verify user should be able to view error message "Your initials must match with the name you used to verify your ID." on agree to terms popup on add property page

  @TC_M9_047
  Scenario: Verify the functionality of Download button
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User click on download button on agree to terms popup on add property page
    Then User should be able to download agreement on agree to terms popup on add property page

  @TC_M9_048
  Scenario: Verify the functionality when user click on "cross icon" over Agree to terms pop-up or click outside the pop-up
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User click on cross icon on agree to terms popup on add property page
    Then User should be able to stay on Add Property page and agree to terms pop-up is discarded
    When User click on continue button on add property page
    And User click outside the popup on agree to terms popup on add property page
    Then User should be able to stay on Add Property page and agree to terms pop-up is discarded

  @TC_M9_004
  Scenario: Verify the navigation when user click on hyperlink or any button
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When User click on Owner over breadcrumb on add property page
    Then User navigate to owner dashboard page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "Alp" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User should be able to navigate to Add Property >Agreement page
    And User click on cross icon on agree to terms popup on add property page
    When User click on cancel button on add property page
    Then User should be able to view Are you sure you want to exit setup pop-up on add property page

  @TC_M9_046
  Scenario: Verify the functionality when user provide valid input
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    And  User enter the property name "AlpOAK" on add property page
    When User click on address text field on add property page
    Then User enter the address "413 Good Road, Landrum, SC, USA" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    When User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    When User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User scroll till the bottom of the Agreement description on agree to terms popup on add property page
    Then User should be able to view Enter Your Initials field Active on agree to terms popup on add property page
    And User enter "MT" Input in enter your initials field on agree to terms popup on add property page
    When User click on Agree and Continue button on agree to terms popup on add property page
    Then User should be able to navigate to Upload Property Documents page
    #TC_M9_034
    And Verify user should be able to view unique Ticker symbol at Upload property document page assigned by Henry team.
