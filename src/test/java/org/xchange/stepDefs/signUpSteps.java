package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.SignUpPage;
import utils.PropertiesUtil;

public class signUpSteps {
    SignUpPage signUpPage = new SignUpPage();


    @Then("User is on signup page")
    public void userIsOnSignupPage() {
        Assert.assertEquals("Signup page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "signUp", signUpPage.verify_Signup_Page());
    }

    @And("Verify user create account button disabled all fields are not field")
    public void User_verify_create_account_button_disabled_all_fields_are_not_field() {
        Assert.assertFalse("Create account button is enabled ", signUpPage.verify_Create_Account_Button_Disabled());
    }

    @When("User click on first name text field on signup page")
    public void userClickOnFirstNameTextFieldOnSignupPage() {
        signUpPage.click_On_First_Name_Text_Field();
        signUpPage.clear_Text_First_Name_Text_Field();
        signUpPage.click_On_Last_Name_Text_Field();
    }

    @Then("Verify user view the first name validation message on sign up page")
    public void verifyUserViewTheFirstNameValidationMessageOnSignUpPage() {
        signUpPage.click_On_First_Name_Text_Field();
        Assert.assertEquals("Legal First Name is Required text is not match ","Legal First Name is Required",signUpPage.verify_Validation_Msg_First_Name_Text_Field_Blank());
    }

    @When("User click on last name text field on sign up page")
    public void userClickOnLastNameTextFieldOnSignUpPage() {
        signUpPage.click_On_Last_Name_Text_Field();
        signUpPage.clear_Text_Last_Name_Text_Field();
    }

    @Then("Verify user view the last name validation message on sign up page")
    public void verifyUserViewTheLastNameValidationMessageOnSignUpPage() {
        signUpPage.verify_Validation_Msg_Last_Name_Text_Field_Blank();
        signUpPage.click_Enter_Email();
        signUpPage.click_On_First_Name_Text_Field();
    }

    @When("User enter the Legal first name as {string} on signup page")
    public void User_enter_the_legal_first_name_as_on_signup_page(String firstname) {
        signUpPage.enter_First_Name(firstname);
    }

    @And("^Verify the first name error msg on signup page$")
    public void Verify_the_first_name_error_msg_on_signup_page() {
        Assert.assertEquals("Please enter a valid name text is not match ","Please enter a valid name",signUpPage.verify_Error_Msg_First_Name());
    }

    @And("User enter the Legal last name as {string} on signup page")
    public void User_enter_the_legal_last_name_as_on_signup_page(String lastname) {
        signUpPage.enter_Last_Name(lastname);
    }

    @And("^Verify the last name error msg on signup page$")
    public void Verify_the_last_name_error_msg_on_signup_page() {
        Assert.assertEquals("Please enter a valid name text is not match ","Please enter a valid name",signUpPage.verify_Error_Msg_Last_Name());
    }

    @Then("User click on enter email on signup page")
    public void Click_on_enter_email_on_signup_page() {
        signUpPage.click_Enter_Email();
    }

    @And("User enter wrong email as {string} on signup page")
    public void User_enter_wrong_email_as_on_signup_page(String email) {
        signUpPage.enter_Wrong_Email(email);
    }

    @And("^Click on password text field on signup page$")
    public void Click_on_password_text_field_on_signup_page() {
        signUpPage.click_On_Password_Text_Field_On_SignUp_Page();
    }

    @Then("^Verify the error msg on signup page$")
    public void Verify_the_error_msg_on_signup_page() {
        Assert.assertEquals("Please enter a valid Email Address",signUpPage.verify_Email_Validation_Msg());
    }

    @And("Enter the email already registered as {string} on signup page")
    public void Enter_the_email_already_registered_as_on_signup_page(String email) {
        signUpPage.enter_Email_Already_Registered_On_Signup_Page(email);
        signUpPage.clickOutsideTheField();
    }

    @And("User enter the email {string} on a signup page")
    public void User_enter_the_email_on_a_signup_page(String email) {
        signUpPage.enter_The_Email_On_SignUp_Page(email);
    }

    @When("User enter the password as {string} on signup page")
    public void User_Enter_the_password_as_on_signup_page(String password) {
        signUpPage.enter_The_Password_On_SignUp_Page(password);
        signUpPage.clickOutsideTheField();
    }

    @When("^Click on confirm password text field on signup page$")
    public void Click_on_confirm_password_text_field_on_signup_page() {
        signUpPage.click_On_Confirm_Password_Text_Field_In_SignUpPage();
    }

    @Then("^Verify the password invalid validation msg on signup page$")
    public void Verify_the_password_invalid_validation_msg_on_signup_page() {
        Assert.assertEquals("Passwords must contain minimum 12 characters and the following: one lowercase letter (a-z), one uppercase letter (A-Z), one number (0-9), special characters (eg. !@#$)",signUpPage.verify_Password_Validation_Msg_On_SignUpPage());
    }

    @And("^Click on eye icon over the password on signup page$")
    public void Click_on_eye_icon_over_the_password_on_signup_page() {
        signUpPage.click_On_Eye_Icon_Over_Password_On_SignUp_Page();
    }

    @And("Enter the confirm password as {string} on signup page")
    public void Enter_the_confirm_password_as_on_signup_page(String confirmPassword) {
        signUpPage.enter_The_Confirm_Password_On_SignUp_Page(confirmPassword);
    }

    @And("^Click on eye icon over the confirm password on signup page$")
    public void Click_on_eye_icon_over_the_confirm_password_on_signup_page() {
        signUpPage.click_On_Eye_Icon_Over_The_Confirm_Password_On_SignUp_Page();
    }

    @Then("^Check the validation msg user enter different password on signup page$")
    public void Check_the_validation_msg_user_enter_different_password_on_signup_page() {
        Assert.assertEquals("Your password do not match", signUpPage.verify_The_Validation_Msg_User_Enter_Different_Password_On_SignUp_Page());
    }

    @Then("^Click on create account button on signup page$")
    public void Click_on_create_account_button_on_signup_page() {
        signUpPage.click_On_Create_Account_Button_On_SignUp_Page();
    }

    @Then("^Verify email already exist validation msg on signup page$")
    public void Verify_email_already_exist_validation_msg_on_signup_page() {
        Assert.assertEquals("Email already exist msg text is not matching with actual msg","An account with this email address already exists. Please log-in.", signUpPage.verify_Email_Already_Exist_Msg_On_SignUp_Page());
    }

    @When("User able to click on create Account button on signup page")
    public void UserAbleToClickOnCreateAccountButtonOnSignupPage() {
        signUpPage.click_On_Create_Account_Button_On_SignUp_Page();
    }

    @And("User enter the first name {string} for check validation on signup page")
    public void userEnterTheFirstNameForCheckValidationOnSignUpPage(String fName) {
        signUpPage.click_On_First_Name_Text_Field();
        signUpPage.check_Validation_Msg_First_Name(fName);
    }

    @And("User enter the last name {string} for check the validation on sign up page")
    public void userEnterTheLastNameForCheckTheValidationOnSignUpPage(String lName) {
        signUpPage.click_On_Last_Name_Text_Field();
        signUpPage.check_Validation_Msg_Last_Name(lName);
    }

    @When("User delete the email in email text field on signup page")
    public void userDeleteTheEmailInEmailTextFieldOnSignUpPage() {
        signUpPage.clear_Email_Text_field();
        signUpPage.clickOutsideTheField();
    }

    @Then("User verify the error msg on below the email text field on signup page")
    public void userVerifyTheErrorMsgOnBelowTheEmailTextFieldOnSignUpPage() {
        Assert.assertEquals("Email is Required", signUpPage.verify_Delete_Email_Error_Msg());
    }

    @And("User enter the email {string} to check the email field validation on signup page")
    public void userEnterTheEmailToCheckTheEmailFieldValidationOnSignupPage(String emailField) {
        signUpPage.email_Field_Validation(emailField);
    }

    @And("User enter the email {string} to check the character limitation on signup page")
    public void userEnterTheEmailToCheckTheCharacterLimitationOnSignupPage(String email) {
        signUpPage.clear_Email_Text_field();
        signUpPage.email_Field_No_Max_Limit(email);
    }

    @Then("Verify User see dots in password field on signup page")
    public void verifyUserSeeDotsInPasswordFieldOnSignUpPage() {
        Assert.assertEquals("Password input field is not Masked form ","password",signUpPage.dots_Password_View_Text_Field());
    }

    @Then("Verify user see the text over the password text field on signup page")
    public void verifyUserSeeTheTextOverThePasswordTextFieldOnSignUpPage() {
        Assert.assertEquals("Password input field is not text form ","Anuj@1234567",signUpPage.text_View_In_Password_Text_Field());
    }

    @And("User again click on eye icon to inactive on signup page")
    public void userAgainClickOnEyeIconToInactiveOnSignupPage() {
        signUpPage.click_On_Eye_Icon_Over_Password_On_SignUp_Page();
    }

    @Then("Verify User view default password on signup page")
    public void verifyUserViewDefaultPasswordOnSignupPage() {
        Assert.assertEquals("Dots are not showing in password text field ","password",signUpPage.default_View_Password_Field());
    }

    @When("User enter the valid password {string} and delete the password on signup page")
    public void userEnterTheValidPasswordAndDeleteThePasswordOnSignupPage(String password) {
        signUpPage.enter_Valid_Password(password);
    }

    @Then("Verify user view the validation msg {string} below the password on signup page")
    public void verifyUserViewTheValidationMsgBelowThePasswordOnSignupPage(String password) {
        Assert.assertEquals("Password is Required! text not matched expected and actual ",password, signUpPage.Error_Msg_Password_Required());
    }

    @Then("Verify user able to view create button should be disabled on signup page")
    public void verifyUserAbleToViewCreateButtonShouldBeDisabledOnSignupPage() {
        Assert.assertFalse("Create account button is enabled ", signUpPage.verify_Create_Account_Button_Disabled());
    }

    @And("User verify the error msg when enter minimum and maximum character in password on signup page")
    public void userVerifyTheErrorMsgWhenEnterMinimumAndMaximumCharacterInPasswordOnSignupPage() {
        signUpPage.verify_Error_Msg_Less_Than_8_Character_Password();
    }

    @And("User verify the error msg when enter less than {int} character in confirm password on signup page")
    public void userVerifyTheErrorMsgWhenEnterLessThanCharacterInConfirmPasswordOnSignupPage() {
        signUpPage.verify_Error_Msg_Less_Than_8_Character_Confirm_Password();
    }

    @Then("Verify the confirm password invalid validation msg on signup page")
    public void verifyTheConfirmPasswordInvalidValidationMsgOnSignupPage() {
        signUpPage.verify_Password_Validation_Msg_On_SignUpPage();
    }

    @When("User enter the valid confirm password {string} and delete the confirm password on signup page")
    public void userEnterTheValidConfirmPasswordAndDeleteTheConfirmPasswordOnSignupPage(String password) {
        Assert.assertNotNull("Confirm password is null ",signUpPage.enter_Confirm_Password(password));
    }

    @Then("Verify user view the validation msg {string} below the confirm password on signup page")
    public void verifyUserViewTheValidationMsgBelowTheConfirmPasswordOnSignupPage(String confirmPassword) {
        Assert.assertEquals("Confirm Password is Required! text not matched expected and actual ",confirmPassword, signUpPage.Error_Msg_Confirm_Password_Required());
    }

    @And("User enter the email on signup page")
    public void enterTheEmailAsOnSignupPage() {
        signUpPage.random_Email_Generation();
    }

    @Then("Verify user should be redirected on the verify email page")
    public void verifyUserShouldBeRedirectedOnTheVerifyEmailPage() {
        signUpPage.verify_Email_Text();
    }

    @When("User click on resend button on verify email page")
    public void userClickOnResendButtonOnVerifyEmailPage() {
        signUpPage.click_On_Resend_Button();
    }

    @Then("Verify user should view the message as {string} on verify email page")
    public void verifyUserShouldViewTheMessageAsCodeResetSuccessfullyOnVerifyEmailPage(String message) {
        Assert.assertEquals(message, signUpPage.verify_Code_Resent_Msg_Verify_Email_Page());
    }

    @When("User should able to view back to login button on verify email page")
    public void userShouldAbleToViewBackToLoginButtonOnVerifyEmailPage() {
        signUpPage.verify_Back_To_Login_Button();
    }

    @And("User should able to View Henry logo on verify email page")
    public void userShouldAbleToViewHenryLogoOnVerifyEmailPage() {
        Assert.assertTrue("Henry logo is not displayed ",signUpPage.verify_Henry_Logo());
    }

    @And("User should able to view verify email as {string} text on verify email page")
    public void userShouldAbleToViewVerifyEmailTextOnVerifyEmailPage(String verifyEmailText) {
        Assert.assertEquals(verifyEmailText,signUpPage.verify_Email_Text());
    }

    @And("User should able to view {string} on verify email page")
    public void userShouldAbleToViewPleaseEnterTheCodeSentToYourEmailInOrderToContinueWithAccountCreationOnVerifyEmailPage(String placeholderText) {
        Assert.assertEquals(placeholderText,signUpPage.verify_Place_Holder_Text());
    }

    @And("User should able to view six digit otp container box on verify email page")
    public void userShouldAbleToViewSixDigitOtpContainerBoxOnVerifyEmailPage() {
        Assert.assertTrue("Otp box is not displayed ",signUpPage.verify_Otp_box());
    }

    @And("User should able to view confirm code button on verify email page")
    public void userShouldAbleToViewConfirmCodeButtonOnVerifyEmailPage() {
        Assert.assertTrue(signUpPage.confirm_Code_Button());
    }

    @And("User should able to view text {string} on verify email page")
    public void userShouldAbleToViewTextOnVerifyEmailPage(String actualText) {
        Assert.assertEquals(actualText,signUpPage.didNot_Get_A_Code_Text());
    }

    @And("User should able to view resend button on verify email page")
    public void userShouldAbleToViewResendButtonOnVerifyEmailPage() {
        Assert.assertEquals("Resend Code",signUpPage.verify_Resent_Code_Button());
    }

    @And("User check the placeholder text on verify email page")
    public void userCheckThePlaceholderTextOnVerifyEmailPage() {
        signUpPage.verify_Place_Holder_Text();
    }

    @When("User enter otp {string} as on verify email page")
    public void userEnterOtpAsOnVerifyEmailPage(String expiryOtp) {
        signUpPage.check_Expiry_Otp(expiryOtp);
    }

    @And("User enter the character {string} in otp box to check the validation on verify email page")
    public void userEnterTheCharacterInOtpBoxToCheckTheValidationOnVerifyEmailPage(String otpPin) {
        signUpPage.enter_The_Character_In_Otp_Box(otpPin);
    }

    @Then("Verify User restrict to enter the character in the otp box field on verify email page")
    public void verifyUserRestrictToEnterTheCharacterInTheOtpBoxFieldOnVerifyEmailPage() {
        Assert.assertFalse("Character is accepting in otp box ",signUpPage.check_Enter_Character_Validation());
    }

    @When("User enter the wrong otp as {string} on verify email page")
    public void userEnterTheWrongOtpAsOnVerifyEmailPage(String wrongOtp) {
        signUpPage.delete_otp_In_Boxes();
        signUpPage.enter_Wrong_Otp(wrongOtp);
    }

    @And("User click on confirm code button on verify email page")
    public void userClickOnConfirmCodeButtonOnVerifyEmailPage() {
        signUpPage.click_on_Confirm_Code_Button();
    }

    @Then("Verify user view the error msg show below the field on verify email page")
    public void verifyUserViewTheErrorMsgShowBelowTheFieldOnVerifyEmailPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your email", signUpPage.verify_Expiry_Code_Msg());
    }

    @And("To verify user get account not confirmed popup when write third wrong otp on verify email page")
    public void toVerifyUserGetAccountNotConfirmedPopupWhenWriteThirdWrongOtpOnVerifyEmailPage() {
        Assert.assertEquals("user entered wrong otp third time ", "Account could not be confirmed owing to failed attempts, if the problem persists, contact support", signUpPage.verify_Account_Not_Confirmed_PopUp());
    }

    @And("User able to view the contact us button on account not confirmed popup")
    public void userAbleToViewTheContactUsButtonOnAccountNotConfirmedPopup() {
        Assert.assertTrue("Contact Support button is not displayed.", signUpPage.verify_Contact_Support_button());
    }


}
