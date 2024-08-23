@TransferAgentLoginPage
Feature: Transfer agent login page

  Background:
    Given User navigate to "https://qaapp.drylakes.co/"

  @TC_M11_001 @TC_M11_002 @TC_M11_003
  Scenario: Verify that Super admin user able to navigate to login page
    Then Verify user should able to navigate to login page
      #TC_M11_002
    And Verify email field should visible on login page
    And Verify password field should visible on login page
    And Verify enter button should visible on login page
      #TC_M11_003
    When User enter email "muskan.trivedi8appinventiv.com" in input field on login page
    And User click on enter button on login page
    Then Verify error message should be visible below the email input field on login page

  @TC_M11_004
  Scenario: Verify the Error message over Email field
    When User click on email field on login page
    And User click on enter button on login page
    Then Verify Error message should show "Email is required." on login page
    When User enter email "muskan.trivedi9@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message on login page

  @TC_M11_005
  Scenario: Verify the validation over Password field
    When User enter email "muskan.trivedi8@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    Then Verify passwords must contain at least 12 characters on login page

  @TC_M11_006
  Scenario: Verify the Error message over Password field
    When User click on password field on login page
    And User click on enter button on login page
    Then Verify Error message should show "Password is required." below the password field on login page
    When User enter email "muskan.trivedi10@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message on login page

  @TC_M11_007 @TC_M11_008 @TC_M11_009 @TC_M11_010 @TC_M11_011
  Scenario: Verify the functionality when user enter wrong password 1st time
    When User enter email "muskan.trivedi8@appinventiv.com" in input field on login page
    And User enter password "Muskan@12355545" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 1st time on login page
    #TC_M11_008
    When User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 2nd time on login page
    #TC_M11_009
    When User click on enter button on login page
    Then Verify Account locked popup should be visible when user enter 3rd time wrong password on login page
    #TC_M11_010
    And Verify user able to view account locked sub text on account locked popup on login page
    And Verify user able to view cross icon on account locked popup on login page
    #TC_M11_011
    And User should be able to view Account Locked pop-up closed automatically in 3 sec on login page

  @TC_M11_012
  Scenario: Verify the functionality of eye icon over Password field
    When User enter password "Muskan@12345" in input field on login page
    And User click on eye icon in password field on login page
    Then Verify eye icon should active in password field on login page
    When User click on eye icon in password field on login page
    Then Verify eye icon should inactive in password field on login page

  @TC_M11_015
  Scenario: Verify that Enter button is disabled when mandatory input is not filled
    Then Verify user should be able to view Enter button disabled when input filled on login page

  @TC_M11_016
  Scenario: Verify the functionality of Enter button
    When User enter email "muskan.trivedi8+64@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify user should able to navigate to OTP page

  @TC_M11_017
  Scenario: Verify that user navigate to Admin Page
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    Then Verify user should be able to view Admin Page


  @TC_M11_019
  Scenario: Verify that user able to view Add admin pop-up
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    Then Verify add user popup should be visible on admin page

  @TC_M11_020
  Scenario: Verify the UI of Add Admin pop-up
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    Then User able to view first name and last name text field on add user popup on admin page
    And Verify user able to access level and temporary password field on add user popup on admin page
    And Verify user able to view email field and mobile number field on add user popup on admin page
    And Verify user able to view generate link and add user button on add user popup on admin page

  @TC_M11_021
  Scenario: Verify the validation of First Name field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on first name input field on add user popup on admin page
    And User click on last name input field on add user popup on admin page
    Then Verify user able to view error msg below the first name field on add user popup on admin page
    When User enter first name "@#3453" in input field on add user popup on admin page
    And User click on last name input field on add user popup on admin page
    Then Verify contain alpha characters when I am entering special and numeric value in first name field on add user popup on admin page
    When User remove input field text "firstName" on add user popup on admin page
    And User enter first name "   " in input field on add user popup on admin page
    And User click on last name input field on add user popup on admin page
    Then Verify space is not allowed in first name field on add user popup on admin page

  @TC_M11_022
  Scenario: Verify the validation of Last Name field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on last name input field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error msg below the last name field on add user popup on admin page
    When User enter last name "@#3453" in input field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify contain alpha characters when I am entering special and numeric value in last name field on add user popup on admin page
    When User remove input field text "lastName" on add user popup on admin page
    And User enter last name "  " in input field on add user popup on admin page
    Then Verify space is allowed in last name field on add user popup on admin page

  @TC_M11_023
  Scenario: Verify the Error message over email field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on email field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message  "Email is required." on add user popup on admin page

  @TC_M11_024
  Scenario: Verify the Error message over First Name field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on first name input field on add user popup on admin page
    And User click on last name input field on add user popup on admin page
    Then Verify user able to view error msg below the first name field on add user popup on admin page

  @TC_M11_025
  Scenario: Verify the validation in email field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter email "muskan.trivedi8@appinventiv.com" in input field on add user popup on admin page
    Then Verify email validation in email field on add user popup on admin page

  @TC_M11_029
  Scenario: Verify the functionality of Access Level field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on access level on add user popup on admin page
    Then Verify user able to view multiple options on add user popup on admin page

  @TC_M11_030
  Scenario: Verify that user able to select user role
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on access level on add user popup on admin page
    And User click on admin option from access level dropdown on add user popup on admin page
    Then Verify user able to view admin option in Access level field and dropdown should close
    When User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    Then Verify user able to view Agent option in Access level field and dropdown should close

  @TC_M11_027
  Scenario: Verify the Validation of Mobile field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter mobile number "test@#" in input field on add user popup on admin page
    Then Verify no other value should acceptable except numeric values on add user popup on admin page
    When User enter mobile number "829-570-3458" in input field on add user popup on admin page
    Then Verify user able to view a green check in mobile number field on add user popup on admin page
    When User enter mobile number "8" in input field on add user popup on admin page
    Then Verify system should accept valid 12-digit Mobile number including 2 characters for hyphens on add user popup on admin page
    And Verify non VOIP, landlines message below the mobile number field on add user popup on admin page

  @TC_M11_028
  Scenario: Verify the Error Message over Mobile field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    When User enter mobile number "829-57" in input field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message below the mobile number field on add user popup on admin page
    When User enter mobile number "0-9063" in input field on add user popup on admin page
    And User click on email field on add user popup on admin page
    Then Verify user able to view error message when enter used number on add user popup on admin page
    When User remove input field text "mobile" on add user popup on admin page
    And User enter mobile number "903-402-3043" in input field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message when enter wrong format number on add user popup on admin page
    When User remove input field text "mobile" on add user popup on admin page
    And User click on mobile number field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message mobile number required on add user popup on admin page

  @TC_M11_032
  Scenario: Verify when user try to click on Temporary password field after generate password
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on temporary password field on add user popup on admin page
    Then Verify temporary password field should disabled on add user popup on admin page

  @TC_M11_033
  Scenario: Verify the functionality how user able to generate temporary password multiple time
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on generate password link on add user popup on admin page
    Then Verify user should be able to view Temporary password generated on add user popup on admin page
    When User click on generate password link on add user popup on admin page
    Then Verify user should be able to view Temporary password generated again on add user popup on admin page

  @TC_M11_034
  Scenario: Verify the  functionality of Cancel Button
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on cancel button on add user popup on admin page
    Then Verify Add user popup should be close when clicking on cancel button on add user popup on admin page

  @TC_M11_035
  Scenario: Verify that user click outside the add admin pop-up
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on outside the popup on add user popup on admin page
    Then Verify Add user popup should be close when clicking on cancel button on add user popup on admin page

  @TC_M11_036
  Scenario: Verify the functionality of Add User button when one of the Mandatory field is missing
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email "muskan.trivedi8@appinventiv.com" in input field on add user popup on admin page
    And User enter mobile number "829-570-3458" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    Then Verify Add user button should disabled on add user popup on admin page

  @TC_M11_037 @TC_M11_039
  Scenario: Verify the functionality of Add User Button when all mandatory input is entered
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-34" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    Then Verify user able to view success popup on add user popup on admin page
    #TC_M11_039
    When User click on cross icon on success popup on admin page
    Then Verify user should able to close success pop-up and should stays on same page


  @TC_M11_038
  Scenario: Verify the functionality of auto close success pop-up for Add Admin
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-34" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    Then Verify user should able to view pop-up is closed in 5 sec and user should on same page

  @TC_M11_098 @TC_M11_100
  Scenario: Verify the functionality of Name column
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on name label on admin page
    Then Verify user able to view name column options on admin page
      #TC_M11_100
    When User click on a to z option of name label on admin page
    Then Verify User should be able to view list in A to Z alphabetical order on admin page

  @TC_M11_101
  Scenario: Verify the list when user select Z-A option  over Name field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on name label on admin page
    And User click on Z to A option of name label on admin page
    Then Verify User should be able to view list in Z to A alphabetical order on admin page
#
  @TC_M11_102
  Scenario: Verify the functionality of Email over user list
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    Then Verify user should able to view Email column with register email on admin page

  @TC_M11_103
  Scenario: Verify the functionality of Mobile Number over user list
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    Then Verify user should able to view mobile number column  on admin page

  @TC_M11_104
  Scenario: Verify the functionality of Role over user list
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on all roles filter on admin page
    Then Verify user should be able to view Role of user on admin page

  @TC_M11_105
  Scenario: Verify the functionality of Status over user list
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    Then Verify status should show active right after user is added on admin page
    When User click on user detail row on admin page
    And User click on Deactivate account button on user detail page
    Then Verify status should show deactivate when account has been deactivate by admin on user details page

  @TC_M11_107
  Scenario: Verify the functionality of pagination when user have more than 10 Entries in Admin list
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    Then Verify user should able to view pagination at Right bottom of page on admin page

  @TC_M11_108
  Scenario: verify that user able to view updated list when user click on pagination number
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User get the pagination count on admin page
    And User click on pagination 2 on admin page
    Then Verify user should able to view list of 2nd page user list on admin page

  @TC_M11_110 @TC_M11_109
  Scenario: Verify the functionality of Previous count in pagination
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User get the pagination count on admin page
    And User click on forward arrow of pagination on admin page
    Then Verify user should get oldest user list compare to present list on admin page
      #TC_M11_109
    When User get the pagination count on admin page
    And User click on previous arrow of pagination on admin page
    Then Verify user should get oldest user list compare to present list on admin page

  @TC_M11_113
  Scenario: Verify the functionality when user click over anywhere within the respective user’s row
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on user detail row on admin page
    Then Verify user should be able to view user detail page

  @TC_M11_114
  Scenario: Verify the UI of Admin/User detail page
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on user detail row on admin page
    Then Verify user able to view side bar menu on admin page
    And Verify user able to view header column name on user detail page

  @TC_M11_115
  Scenario: Verify the functionality of Reset Password button
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on user detail row on admin page
    And User click on reset password button on user detail page
    Then Verify user able to view toast message says "Reset password has been sent successfully" on user detail page

  @TC_M11_058
  Scenario: Verify that user able to view 2FA page
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    Then User should be able to view 2FA page

  @TC_M11_059
  Scenario: Verify the UI of 2FA page
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    Then Verify Back to login button should visible on 2FA page
    And Verify user able to view placeholder text "Verify Account Access" on 2FA page
    And Verify user able to view sub heading text on 2FA page
    And Verify resend button should visible on 2FA page
    And Verify confirm code button should visible on 2FA page

  @TC_M11_060
  Scenario: Verify the Validation over Enter code field
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "test@#" in input field on OTP page
    Then Verify user should not be able to enter Alphabetic code in otp field on 2FA page
    When User enter otp "123456" in input field on OTP page
    Then Verify user able to view confirm code button should enabled on 2FA page

  @TC_M11_073 @TC_M11_075
  Scenario: Verify the functionality when Pop-up auto closed or closed intentionally
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User will wait for 3 seconds on 2FA page
    Then Verify User should able to navigate to Reset Password Page
    #TC_M11_075
    When User click on back to login button on reset password page
    Then Verify user should able to view login page

  @TC_M11_074
  Scenario: Verify the UI of Reset Password Page
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on cross icon on verified popup on 2FA page
    Then Verify User should able to navigate to Reset Password Page
    And Verify User able to view current password field , new password field and confirm password field on reset password page
    And Verify user should be able to view submit button on reset password page
    And Verify sub text should be visible on reset password page
    And Verify Header text should be visible "Reset Password" on reset password page

  @TC_M11_076
  Scenario: Verify the functionality when user didn't reset their password and try to login with temporary password
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on cross icon on verified popup on 2FA page
    Then Verify User should able to navigate to Reset Password Page

  @TC_M11_070 @TC_M11_071
  Scenario: Verify the functionality when user enter Correct Code
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then Verify user able to view account verified popup on 2FA page
    #TC_M11_071
    And Verify user able to view sub text of account verified popup on 2FA page

  @TC_M11_072
  Scenario: Verify the functionality to close the Account Verified Pop-up
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User will wait for 3 seconds on 2FA page
    Then Verify Pop-up should Auto close after 3sec on 2FA page

  @TC_M11_077
  Scenario: Verify the Validation over Current Password field
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on cross icon on verified popup on 2FA page
    And User enter current password "muskan" in input field on reset password page
    And User click on new password field on reset page
    Then Verify Passwords must contain at least 12 characters on reset password page

  @TC_M11_078
  Scenario: Verify the Error message over Current Password field
    When User enter email "muskan.trivedi8+1801@appinventiv.com" in input field on login page
    And User enter password "aI1{fA0%gK6&" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on cross icon on verified popup on 2FA page
    And User click on current password field on reset page
    And User click on new password field on reset page
    Then Verify user able to view error msg "Current Password is required." on reset page

  @TC_M11_079 @TC_M11_080 @TC_M11_081 @TC_M11_082
  Scenario: Verify the functionality when user enter wrong Current Password 1st time
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User get the temporary password on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter temporary password in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password "muskantrivedi" in input field on reset password page
    And User enter new password "Muskan@12345" in input field on reset password page
    And User enter confirm password  "Muskan@12345" in input field on reset password page
    And User click on submit button on reset password page
    Then Verify error message "Your current password is incorrect, you have two (2) attempts remaining." on reset password page
    #TC_M11_080
    When User click on submit button on reset password page
    Then Verify error message "Your current password is incorrect, you have two (1) attempts remaining." on reset password page
    #TC_M11_081
    When User click on submit button on reset password page
    And Verify user able to view "Password Not Confirmed" popup on reset password page
    #TC_M11_082
    And Verify user able to view sub text of password not confirmed popup on reset password page
    And verify user able to view cross icon on reset password page

  @TC_M11_083 @TC_M11_084
  Scenario: Verify the functionality to close the Password Not Confirmed Pop-up
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User get the temporary password on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter temporary password in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password "muskantrivedi" in input field on reset password page
    And User enter new password "Muskan@12345" in input field on reset password page
    And User enter confirm password  "Muskan@12345" in input field on reset password page
    And User click on submit button on reset password page
    Then Verify error message "Your current password is incorrect, you have two (2) attempts remaining." on reset password page
    When User click on submit button on reset password page
    Then Verify error message "Your current password is incorrect, you have two (1) attempts remaining." on reset password page
    When User click on submit button on reset password page
    Then Verify user able to view "Password Not Confirmed" popup on reset password page
    And Verify Pop-up should Auto close after 3sec on reset password page
    #TC_M11_084
    And Verify user should able to navigate to login page

  @TC_M11_061
  Scenario: Verify the Enter code functionality when user enter less than 5 digit code
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "12345" in input field on OTP page
    Then Verify user should able to view Confirm code button is disabled on 2FA page

  @TC_M11_042 @TC_M11_043 @TC_M11_044
  Scenario: Verify that user able to navigate to login screen
    Then Verify user should able to navigate to login page
  #TC_M11_043
    And Verify email field should visible on login page
    And Verify password field should visible on login page
    And Verify enter button should visible on login page
  #TC_M11_044
    When User enter email "muskan.trivedi8appinventiv.com" in input field on login page
    And User click on enter button on login page
    Then Verify error message should be visible below the email input field on login page

  @TC_M11_045
  Scenario: Verify the Error message over Email field
    When User click on email field on login page
    And User click on enter button on login page
    Then Verify Error message should show "Email is required." on login page
    When User enter email "muskan.trivedi9@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message on login page

  @TC_M11_046
  Scenario: Verify the validation over Password field
    When User enter email "muskan.trivedi8@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    Then Verify passwords must contain at least 12 characters on login page

  @TC_M11_047
  Scenario: Verify the Error message over Password field
    When User click on password field on login page
    And User click on enter button on login page
    Then Verify Error message should show "Password is required." below the password field on login page
    When User enter email "muskan.trivedi10@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message on login page
#
  @TC_M11_048 @TC_M11_049 @TC_M11_050 @TC_M11_051 @TC_M11_052
  Scenario: Verify the functionality when user enter wrong password 1st time
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter password "Muskan@12355545" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 1st time on login page
    #TC_M11_049
    When User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 2nd time on login page
    #TC_M11_050
    When User click on enter button on login page
    Then Verify Account locked popup should be visible when user enter 3rd time wrong password on login page
    #TC_M11_051
    And Verify user able to view account locked sub text on account locked popup on login page
    And Verify user able to view cross icon on account locked popup on login page
    #TC_M11_052
    And User should be able to view Account Locked pop-up closed automatically in 3 sec on login page

  @TC_M11_013 @TC_M11_014
  Scenario: Verify the functionality of Account locked email
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter password "Muskan@12355545" in input field on login page
    And User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 1st time on login page
    When User click on enter button on login page
    Then Verify account details are incorrect error message when user enter wrong password 2nd time on login page
    When User click on enter button on login page
    Then Verify Account locked popup should be visible when user enter 3rd time wrong password on login page
    #TC_M11_014
    And Verify user able to view account locked sub text on account locked popup on login page
    And Verify user able to view cross icon on account locked popup on login page

  @TC_M11_018
  Scenario: Verify the UI of Admin page
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then Verify user able to view side bar menu on admin page

  @TC_M11_026
  Scenario: Verify the Error message over Email field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User click on email field on add user popup on admin page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message  "Email is required." on add user popup on admin page
    When User enter email "muskan.trivedi+999623@appinventiv.com" in input field on login page
    And User click on first name input field on add user popup on admin page
    Then Verify user able to view error message  "An account with this email address already exists. Please log-in." on add user popup on admin page

  @TC_M11_053
  Scenario: Verify the functionality of eye icon over Password field
    When User enter password "Muskan@12345" in input field on login page
    And User click on eye icon in password field on login page
    Then Verify eye icon should active in password field on login page
    When User click on eye icon in password field on login page
    Then Verify eye icon should inactive in password field on login page

  @TC_M11_056
  Scenario: Verify that Enter button is disabled
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde123" in input field on login page
    Then Verify enter button should disabled when user enter less than 12digit password on login page

  @TC_M11_057
  Scenario: Verify the functionality of Enter button
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    Then Verify user should able to navigate to OTP page

  @TC_M11_086
  Scenario: Verify the validation of New Password field
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter new password "Muskan" in input field on reset password page
    And User click on confirm new password field on reset password page
    Then Verify new password must contain at least 12 characters on reset password page
    And Verify validation of New Password field on reset password page

  @TC_M11_087
  Scenario: Verify the Error message over New Password field
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on new password field on reset page
    When User enter new password "Muskan" in input field on reset password page
    And Verify validation of New Password field on reset password page

  @TC_M11_090
  Scenario: Verify the error message for Confirm Password field
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password "Muskan@12345" in input field on reset password page
    And User enter new password "Muskan@123456" in input field on reset password page
    And User click on confirm new password field on reset password page
    And User click on new password field on reset page
    Then Verify user able to view error msg "Confirm New Password is required." on reset password page
    When User enter confirm password "Muskan@1234567" but not same as new password on reset password page
    Then Verify user able to view error msg "Your new and confirm new password doesn’t match." on reset password page
    When User remove input field text "confirm_password" on reset password page
    And User enter confirm password "muskantrivedi12" which didn't match validation of password field on reset password page
    Then Verify user able to view error msg "Your new and confirm new password doesn’t match." on reset password page

  @TC_M11_091
  Scenario: Verify the functionality of eye icon over New password and Confirm password field
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter new password "Muskan@123456" in input field on reset password page
    And user click on new password eye icon on reset password page
    Then Verify eye icon should active in password field on login page
    When user click on new password eye icon on reset password page
    Then Verify eye icon should inactive in password field on login page

  @TC_M11_093
  Scenario: Verify the functionality of Submit Button when input is not provided in mandatory field
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter new password "Muskan@123456" in input field on reset password page
    And User enter confirm password  "Muskan@123456" in input field on reset password page
    And User click on current password field on reset page
    And User click on new password field on reset page
    Then Verify user able to view Submit button is Disabled on reset password page

  @TC_M11_094
  Scenario: Verify the functionality of Submit Button when all mandatory field is filled with valid input
    When User enter email "muskan.trivedi8+189@appinventiv.com" in input field on login page
    And User enter password "aP4!lI5#cM6-" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password "Muskan@123456" in input field on reset password page
    And User enter new password "Muskan@123456" in input field on reset password page
    And User enter confirm password  "Muskan@123456" in input field on reset password page
    Then Verify user able to view Submit button is Enabled on reset password page

  @TC_M11_095
  Scenario: Verify the functionality when user click on Submit button
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User get the temporary password on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter temporary password in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password in input field on reset password page
    And User enter new password "Muskan@12345" in input field on reset password page
    And User enter confirm password  "Muskan@12345" in input field on reset password page
    And User click on submit button on reset password page
    Then User should be able to navigate to Transfer Agent>Properties page

  @TC_M11_096
  Scenario: Verify the UI of New Password Set pop
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User get the temporary password on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    And User click on profile icon on admin page
    And User click on logout button on admin page
    And User enter email in email input field on login page
    And User enter temporary password in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User enter current password in input field on reset password page
    And User enter new password "Muskan@12345" in input field on reset password page
    And User enter confirm password  "Muskan@12345" in input field on reset password page
    And User click on submit button on reset password page
    Then Verify user able to view header text "New Password Set" on reset password page
    And Verify user able to view sub text of new password setup popup on reset password page

  @TC_M11_099
  Scenario: Verify the list when user select Newest to Oldest option  over Name field
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on name label on admin page
    And User click on newest to oldest filter on name filter on admin page
    Then Verify user able to view newest to oldest list on admin page

  @TC_M11_117 @TC_M11_118
  Scenario: Verify the functionality of Deactivated button
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
    Then Verify status should show active right after user is added on admin page
    When User click on user detail row on admin page
    And User click on Deactivate account button on user detail page
    Then Verify user should be able to view Toast message "Muskan has been Deactivated" on user detail page
    And Verify Deactivate button change to Activate on user detail page
    #TC_M11_118
    When User click on activate button on user detail page
    Then Verify user should be able to view Toast message "Muskan has been Activated" on user detail page
    And Verify Activate button change to Deactivate on user detail page

  @TC_M11_119
  Scenario: Verify the functionality when user try to login after account is Deactivated by admin
    When User enter email "muskan.trivedi8+1845454@appinventiv.com" in input field on login page
    And User enter password "Muskan@12345" in input field on login page
    And User click on enter button on login page
    Then Verify error Message "Your account has been deactivated. Please contact admin." on login page

  @TC_M11_120
  Scenario: Verify the functionality when user try to login after account is Activate by admin
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    Then User should be able to navigate to Transfer Agent>Properties page

  @TC_M11_097
  Scenario: Verify the UI of Admin List Page
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    Then Verify user able to view side bar menu on admin page
    And Verify user able to view role filter on admin page
    And Verify user able to view all status filter on admin page
    And Verify user able to view list of user in form of table on admin page

  @TC_M11_121
  Scenario: Verify the functionality of log Details
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on user detail row on admin page
    Then Verify user should be able to view log Details of every action on user detail page

  @TC_M11_122
  Scenario: Verify the functionality of log Details when user didn't log in in system before
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on admin module at side bar
    And User click on add user button on admin page
    And User enter first name "Muskan" in input field on add user popup on admin page
    And User enter last name "Trivedi" in input field on add user popup on admin page
    And User enter email in input field on add user popup on admin page
    And User enter phone number "829-570-" in input field on add user popup on admin page
    And User click on access level on add user popup on admin page
    And User click on agent option from access level dropdown on add user popup on admin page
    And User click on generate password link on add user popup on admin page
    And User click on add user button on add user popup on admin page
    And User click on cross icon on success popup on admin page
