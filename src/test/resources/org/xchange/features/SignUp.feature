@signup

Feature: Signup page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    Given User is on homepage
    When User clicks on sign up button on home page
    Then User is on signup page

  @TC_M1_21
  Scenario: To verify the validation in first and last name on sign up page
    And Verify user create account button disabled all fields are not field
    When User click on first name text field on signup page
    Then Verify user view the first name validation message on sign up page
    When User click on last name text field on sign up page
    Then Verify user view the last name validation message on sign up page
    When User enter the Legal first name as "@@a1" on signup page
    Then Verify the first name error msg on signup page
    When User enter the Legal last name as "@@b1" on signup page
    Then Verify the last name error msg on signup page
    When User click on enter email on signup page
    Then User enter the first name "ba" for check validation on signup page
    And User enter the last name "ab" for check the validation on sign up page

  @TC_M1_22
  Scenario: To verify the validation in email field on sign up page
    When User click on enter email on signup page
    Then User enter wrong email as "anuj.kumarappinventiv.com" on signup page
    When Click on password text field on signup page
    Then Verify the error msg on signup page
    When User delete the email in email text field on signup page
    Then User verify the error msg on below the email text field on signup page
    And User enter the email "anuj.kumar8@appinventiv.com" to check the email field validation on signup page
    And User enter the email "anuj.kumar8+2@appinventiv.com" to check the character limitation on signup page

  @TC_M1_23
  Scenario: To verify that if email id is already registered on signup page
    When User click on enter email on signup page
    And Enter the email already registered as "anuj.kumar8@appinventiv.com" on signup page
    Then Verify email already exist validation msg on signup page

  @TC_M1_24
  Scenario: To verify the functionality of eye icon over Password field on signup page
    When User enter the password as "Anuj@1234567" on signup page
    Then Verify User see dots in password field on signup page
    When Click on eye icon over the password on signup page
    Then Verify user see the text over the password text field on signup page
    When User again click on eye icon to inactive on signup page
    Then Verify User view default password on signup page

  @TC_M1_25
  Scenario: To verify the validation on Password field on signup page
    When User enter the password as "a" on signup page
    And User verify the error msg when enter minimum and maximum character in password on signup page
    Then Verify user able to view create button should be disabled on signup page
    When Click on confirm password text field on signup page
    Then Verify the password invalid validation msg on signup page
    When User enter the valid password "Anuj@1234567" and delete the password on signup page
    Then Verify user view the validation msg "Password is Required!" below the password on signup page

  @TC_M1_26
  Scenario: To verify the validation on confirm Password field on signup page
    When Click on confirm password text field on signup page
    Then Enter the confirm password as "a" on signup page
    And Verify user able to view create button should be disabled on signup page
    When User enter the valid confirm password "Anuj@1234567" and delete the confirm password on signup page
    Then Verify user view the validation msg "Confirm Password is Required" below the confirm password on signup page

  @TC_M1_27
  Scenario: To verify that if user enter different password in both fields on signup page
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email "anuj.kumar8@appinventiv.com" on a signup page
    And User enter the password as "Anuj@ " on signup page
    And Click on confirm password text field on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    Then Check the validation msg user enter different password on signup page

  @TC_M1_29
  Scenario: To check the redirection of the page after click on the create account button
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page

  @TC_M1_30
  Scenario: To verify the UI elements present in the email verification received
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page
    And User should able to view back to login button on verify email page
    And User should able to View Henry logo on verify email page
    And User should able to view verify email as "Verify Email" text on verify email page
    And User should able to view "Please enter the code sent to your email in order to continue with account creation" on verify email page
    And User should able to view six digit otp container box on verify email page
    And User should able to view confirm code button on verify email page
    And User should able to view text "Didn't get a code?" on verify email page
    And User should able to view resend button on verify email page

  @TC_M1_31
  Scenario: To verify the validation of verification code on mail
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page
    And User check the placeholder text on verify email page
    When User enter the character "Abc$%^" in otp box to check the validation on verify email page
    Then Verify User restrict to enter the character in the otp box field on verify email page
    And User enter otp "123456" as on verify email page
    When User click on confirm code button on verify email page
    Then Verify user view the error msg show below the field on verify email page

  @TC_M1_32
  Scenario: To verify the expiry of the email received for verification
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page
    And User enter otp "123456" as on verify email page
    When User click on confirm code button on verify email page
    Then Verify user view the error msg show below the field on verify email page

  @TC_M1_33
  Scenario: To verify the functionality of the resend button on verify email page
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page
    When User click on resend button on verify email page
    Then Verify user should view the message as "Code resent successfully!" on verify email page

  @TC_M1_34
  Scenario: To verify the OTP attempts on verify email page
    And User enter the Legal first name as "Anuj" on signup page
    And User enter the Legal last name as "Kumar" on signup page
    And User enter the email on signup page
    And User enter the password as "Anuj@1234567" on signup page
    And Enter the confirm password as "Anuj@1234567" on signup page
    When Click on create account button on signup page
    Then Verify user should be redirected on the verify email page
    And User enter the wrong otp as "155666" on verify email page
    When User click on confirm code button on verify email page
    Then Verify user view the error msg show below the field on verify email page
    And User enter the wrong otp as "777777" on verify email page
    When User click on confirm code button on verify email page
    Then Verify user view the error msg show below the field on verify email page
    And User enter the wrong otp as "123455" on verify email page
    When User click on confirm code button on verify email page
    Then To verify user get account not confirmed popup when write third wrong otp on verify email page
    And User able to view the contact us button on account not confirmed popup



