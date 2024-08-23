package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.BuySharePage;
import org.xchange.pom.ForgotPasswordPage;
import org.xchange.pom.KycPage;
import org.xchange.pom.LoginPage;
import utils.PropertiesUtil;

import static utils.Helper.waitForElementInMinutes;

public class ForgotPasswordSteps {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    LoginPage loginPage = new LoginPage();

    KycPage kycPage = new KycPage();

    BuySharePage buySharePage = new BuySharePage();


    @When("User click on forgot password link on login page")
    public void userClickOnForgotPasswordLinkOnLoginPage() {
        forgotPasswordPage.click_On_Forgot_Password_Link();
    }

    @Then("User should be able to navigate the Forgot Password option from login page")
    public void userShouldBeAbleToNavigateTheForgotPasswordOptionFromLoginPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("URL") + "forgot-password", forgotPasswordPage.get_Current_Url());
    }

    @And("Verify forgot Password option should be visible on login page")
    public void verifyForgotPasswordOptionShouldBeVisibleOnLoginPage() {
        Assert.assertTrue("Forgot password link is not visible", forgotPasswordPage.is_Forgot_Password_Link_Visible());
    }

    @Then("Verify user should be redirected to Reset Password page")
    public void verifyUserShouldBeRedirectedToResetPasswordPage() {
        Assert.assertEquals("Reset Password", forgotPasswordPage.verify_Reset_Password());
    }

    @And("Verify user able to view heading of reset password on forgot password page")
    public void verifyUserAbleToViewHeadingOfResetPasswordOnForgotPasswordPage() {
        Assert.assertTrue("Reset password text is not visible", forgotPasswordPage.verify_Reset_Password_Text());

    }

    @And("Verify user able to view sub heading of reset password on forgot password page")
    public void verifyUserAbleOViewSubHeadingOfResetPasswordOnForgotPasswordPage() {
        Assert.assertTrue("Sub heading of reset password dis not visible", forgotPasswordPage.verify_Reset_Password_Sub_Heading());
    }

    @And("Verify user able to view back to profile button on forgot password page")
    public void verifyUserAbleToViewBackToProfileButtonOnForgotPasswordPage() {
        Assert.assertTrue("Back to login button is not visible", forgotPasswordPage.verify_Back_To_Login_Button());
    }

    @And("Verify user able to view send code button on on forgot password page")
    public void verifyUserAbleToViewSendCodeButtonOnOnForgotPasswordPage() {
        Assert.assertTrue("Send code button is not visible", forgotPasswordPage.is_Send_Code_Button_Visible());
    }

    @When("User click on back to login button on forgot password")
    public void userClickOnBackToLoginButtonOnForgotPassword() {
        forgotPasswordPage.click_On_Back_To_Login_Button();
    }

    @Then("Verify user should be redirected to login page")
    public void verifyUserShouldBeRedirectedToLoginPage() {
        Assert.assertEquals("Login page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "login", loginPage.verify_Login_Screen());
    }

    @When("User enter email {string} in input field on forgot password page")
    public void userEnterEmailInInputFieldOnForgotPasswordPage(String email) {
        forgotPasswordPage.enter_Email_In_Input_Field(email);
    }

    @Then("User should be able to type valid email address having @ and domain on forgot password page")
    public void userShouldBeAbleToTypeValidEmailAddressHavingAndDomainOnForgotPasswordPage() {
        forgotPasswordPage.verify_Is_Email_Valid();
    }

    @When("User click on email input field on forgot password page")
    public void userClickOnEmailInputFieldOnForgotPasswordPage() {
        forgotPasswordPage.click_On_Email_Field();
    }

    @And("User click on send code button on forgot password page")
    public void userClickOnOutsideTheEmailInputFieldOnForgotPasswordPage() {
        forgotPasswordPage.click_On_Outside_The_Field();
    }

    @Then("Verify email is required validation message should be displayed on forgot password page")
    public void verifyEmailIsRequiredValidationMessageShouldBeDisplayedOnForgotPasswordPage() {
        Assert.assertEquals("Email is not required", "Email is Required", forgotPasswordPage.verify_Email_Field_Validation_Msg());
    }


    @Then("Verify Error message should be displayed if email is entered without @ on forgot password page")
    public void verifyErrorMessageShouldBeDisplayedIfEmailIsEnteredWithoutOnForgotPasswordPage() {
        Assert.assertEquals("Enter a valid email address to reset your Henry account password.", forgotPasswordPage.verify_Email_Field_Validation_Msg());

    }

    @Then("Verify validation message should displayed when user enters email address which is not existing in system")
    public void verifyValidationMessageShouldDisplayedWhenUserEntersEmailAddressWhichIsNotExistingInSystem() {
        Assert.assertEquals("That Henry account doesn’t exist. Enter a different email address or" + " create a new account", forgotPasswordPage.verify_Error_Msg());
    }

    @Then("Verify send code button should active when valid email address is entered on forgot password page")
    public void verifySendCodeButtonShouldActiveWhenValidEmailAddressIsEnteredOnForgotPasswordPage() {
        Assert.assertFalse("Send code button is disabled", forgotPasswordPage.is_Send_Code_Button_Enabled());
    }

    @And("Verify send code button should remain in disabled button on forgot password page")
    public void verifySendCodeButtonShouldRemainInDisabledButtonOnForgotPasswordPage() {
        Assert.assertFalse("Send code button is enabled", forgotPasswordPage.is_Send_Code_Button_Enabled());
    }

    @Then("Verify user should be redirected to Verify Account Access page")
    public void verifyUserShouldBeRedirectedToVerifyAccountAccessPage() {
        Assert.assertEquals("Login page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "verify-account", loginPage.verify_Login_Screen());
    }

    @And("Verify back to login button on Verify Account Access page")
    public void verifyBackToLoginButtonOnVerifyAccountAccessPage() {
        Assert.assertTrue("Back to login button is not visible", forgotPasswordPage.verify_Back_To_Login_Button());
    }

    @And("Verify heading text on Verify Account Access page")
    public void verifyPlaceholderTextOnVerifyAccountAccessPage() {
        Assert.assertTrue("Heading text is not visible", forgotPasswordPage.is_Heading_Text_Visible());
    }

    @And("Verify hint text on Verify Account Access page")
    public void verifyHintTextOnVerifyAccountAccessPage() {
        Assert.assertTrue("Hint text is not visible", forgotPasswordPage.is_Hint_Text_Visible());
    }

    @And("Verify user able to view confirm code button on Verify Account Access page")
    public void verifyUserAbleToViewConfirmCodeButtonOnVerifyAccountAccessPage() {
        Assert.assertTrue("Confirm code button is not visible", forgotPasswordPage.verify_Confirm_Code_Button());

    }


    @And("Verify Didn't get a code text should visible on Verify Account Access page")
    public void verifyDidnTGetACodeTextShouldVisibleOnVerifyAccountAccessPage() {
        Assert.assertTrue("Get code text is not visible", forgotPasswordPage.is_Did_Not_Get_Code_Text_Visible());

    }


    @And("^User enter 5 digit otp (.+) in OTP field on Verify Account Access page$")
    public void userEnterDigitOtpInOTPFieldOnForgotPasswordPage(String OTP) {
        buySharePage.set_OTP(OTP);
    }

    @Then("Verify confirm button should disabled on Verify Account Access page")
    public void verifyConfirmButtonShouldDisabledOnForgotPasswordPage() {
        Assert.assertFalse("Confirm code button is enabled", forgotPasswordPage.is_Confirm_Code_button_Disabled());
    }

    @When("User remove otp from input field on Verify Account Access page")
    public void userRemoveOtpFromInputFieldOnVerifyAccountAccessPage() {
        buySharePage.remove_Code_From_Otp_Box();
    }

    @Then("^Verify user is allowed to add any random OTP (.+) in OTP field on Verify Account Access page$")
    public void verifyUserIsAllowedToAddAnyRandomOTPInOTPFieldOnVerifyAccountAccessPage(String OTP) {
        buySharePage.set_OTP(OTP);
    }

    @When("^User enter 6 digit otp (.+) in OTP field on Verify Account Access page$")
    public void userEnterDigitOtpInOTPFieldOnVerifyAccountAccessPage(String OTP) {
        buySharePage.set_OTP(OTP);
    }

    @Then("Verify invalid code is entered, validation message should displayed on Verify Account Access page")
    public void verifyInvalidCodeIsEnteredValidationMessageShouldDisplayedOnVerifyAccountAccessPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your email", forgotPasswordPage.verify_Validation_Msg());
    }

    @And("User click on confirm button on Verify Account Access page")
    public void userClickOnConfirmButtonOnVerifyAccountAccessPage() {
        forgotPasswordPage.click_On_Confirm_Code_Button();
    }


    @Then("Verify enter the invalid code third time validation message should displayed on Verify Account Access page")
    public void verifyEnterTheInvalidCodeThirdTimeValidationMessageShouldDisplayedOnVerifyAccountAccessPage() {
        Assert.assertEquals("Too many failed attempts. Please try again in 15 minutes", forgotPasswordPage.verify_Validation_Msg());
    }

    @And("User click on resend code button on Verify Account Access page")
    public void userClickOnResendCodeButtonOnVerifyAccountAccessPage() {
        forgotPasswordPage.click_On_Resend_Code_Btn();
    }

    @Then("Verify message new code should be sent successfully")
    public void verifyMessageNewCodeShouldBeSentSuccessfully() {
        Assert.assertTrue("New code sent msg is not visible", forgotPasswordPage.verify_OTP_Sent_Successfully_Msg());
    }

    @And("Verify timer should start with 14:59 for OTP resend on Verify Account Access page")
    public void verifyTimerShouldStartWithForOTPResendOnVerifyAccountAccessPage() {
        Assert.assertEquals("15:00" + " mins", forgotPasswordPage.verify_OTP_Timer());

    }

    @When("User will wait for {int} min on Verify Account Access page")
    public void userWillWaitForMinOnVerifyAccountAccessPage(int timer) {
        waitForElementInMinutes(timer);

    }

    @Then("Verify resend Code link should displayed in enabled state on Verify Account Access page")
    public void verifyResendCodeLinkShouldDisplayedInEnabledStateOnVerifyAccountAccessPage() {
        Assert.assertTrue("Resend code button is not visible", forgotPasswordPage.is_Resend_Button_Visible());
    }

    @Then("Verify error message when user again enter invalid code after 15 minutes on Verify Account Access page")
    public void verifyErrorMessageWhenUserAgainEnterInvalidCodeAfterMinutesOnVerifyAccountAccessPage() {
        Assert.assertEquals("Code is invalid, one ( 1 ) attempts remaining", forgotPasswordPage.verify_Validation_Msg());
    }

    @Then("Verify user able to view KYC process disrupted error message on Verify Account Access page")
    public void verifyUserAbleToViewKYCProcessDisruptedErrorMessageOnVerifyAccountAccessPage() {
        Assert.assertEquals("Your Reset password process has been disrupted due to invalid attempts; please try again in 8 hours.", kycPage.validate_Kyc_Process_Disrupted());

    }

    @Then("Verify confirm Code button should enabled on Verify Account Access page")
    public void verifyConfirmCodeButtonShouldEnabledOnVerifyAccountAccessPage() {
        Assert.assertTrue("Confirm code button is disabled", forgotPasswordPage.verify_Confirm_Code_Button_Is_Enabled());
    }

}
