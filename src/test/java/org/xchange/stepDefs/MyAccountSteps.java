package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.BuySharePage;
import org.xchange.pom.ForgotPasswordPage;
import org.xchange.pom.KycPage;
import org.xchange.pom.MyAccountPage;
import utils.Helper;
import utils.PropertiesUtil;

public class MyAccountSteps extends Helper {
    MyAccountPage myAccount = new MyAccountPage();
    BuySharePage buySharePage = new BuySharePage();

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    KycPage kycPage = new KycPage();

    String mobileNumber = "";

    String addressValue = "";

    @Then("Verify user is navigate to kyc page")
    public void verifyUserIsNavigateToKycPage() {//PropertiesUtil.getEnvironmentKey("URL")
        Assert.assertEquals("User is not navigate on Kyc page", PropertiesUtil.getEnvironmentKey("URL") + "account/kyc", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @When("User click on market tab on kyc page")
    public void userClickOnMarketTabOnKycPage() {
        myAccount.click_On_Market_Tab();
    }

    @When("^User clicks on profile icon on header$")
    public void user_clicks_on_profile_icon() {
        myAccount.clicks_On_Profile_Icon();
    }

    @Then("Verify the profile menu item on header")
    public void verify_the_profile_menu_item() {
        myAccount.verify_Profile_Menu_Item();
    }

    @And("^User clicks on account on profile menu on header$")
    public void user_clicks_on_account_on_profile_menu() {
        myAccount.click_On_Account();
    }

    @And("^Verify user is on account page$")
    public void verify_user_is_on_account_page() {
        Assert.assertEquals("Account", myAccount.verify_Account_Page());
    }

    @When("^User clicks on edit name on account page$")
    public void user_clicks_on_edit_name_on_account_page() {
        myAccount.click_On_Name_Edit_Button_On_Profile_Page();
    }

    @Then("^Verify user is on edit name popup on account page$")
    public void verify_user_is_on_edit_name_popup_on_account_page() {
        Assert.assertEquals("Edit Name", myAccount.verify_Edit_Text_On_Edit_Name_Popup());
    }

    @And("User able to view the edit name text, legal first name and legal last name text field on edit name popup in account page")
    public void userAbleToViewTheEditNameTextLegalFirstNameAndLegalLastNameTextFieldOnEditNamePopupInAccountPage() {
        myAccount.verify_First_Name_And_Last_Name_Text_Field_Popup();
    }

    @And("User able to view the cancel and save changes button on edit name popup in account page")
    public void userAbleToViewTheCancelAndSaveChangesButtonOnEditNamePopupInAccountPage() {
        Assert.assertEquals("Cancel", myAccount.verify_cancel_Button());
        Assert.assertEquals("Save Changes", myAccount.verify_Save_Changes_Button());
    }

    @When("Verify user view the already entered first name and last name on edit name popup in account page")
    public void verifyUserViewTheAlreadyEnteredFirstNameAndLastNameOnEditNamePopupInAccountPage() {
        myAccount.verify_Already_Enter_First_Name();
        myAccount.verify_Already_Enter_Last_Name();
    }

    @Then("User check the validation of first name as {string} on edit name popup in account page")
    public void userCheckTheValidationOfFirstNameAsOnEditNamePopupInAccountPage(String firstname) {
        myAccount.click_On_First_Name();
        Assert.assertEquals("Legal First Name is Required", myAccount.verify_Msg_Legal_First_Name_Required());
        myAccount.verify_First_Name_Validation(firstname);
        Assert.assertEquals("Please enter a valid name", myAccount.verify_Msg_Please_Enter_Valid_Name_In_First_Name());
    }

    @And("User check the validation of last name as {string} on edit name popup in account page")
    public void userCheckTheValidationOfLastNameAsOnEditNamePopupInAccountPage(String lastname) {
        myAccount.click_On_Last_Name();
        Assert.assertEquals("Legal Last Name is Required", myAccount.verify_Msg_Legal_Last_Name_Required());
        myAccount.verify_Last_Name_Validation(lastname);
        Assert.assertEquals("Please enter a valid name", myAccount.verify_Msg_Please_Enter_Valid_Name());
    }

    @And("User enter first name on edit name popup on account page")
    public void userEnterFirstNameOnEditNamePopupOnAccountPage() {
        Assert.assertFalse("First name field is not empty", myAccount.enter_First_Name_On_Name_Edit_Screen().isEmpty());
    }

    @And("User enter last name on edit name popup on account page")
    public void userEnterLastNameOnEditNamePopupOnAccountPage() {
        Assert.assertFalse("Last name field is not empty", myAccount.enter_Last_Name_On_Name_Edit_Screen().isEmpty());
    }

    @And("User clicks on cancel button on edit name popup in account page")
    public void userClicksOnCancelButtonOnEditNamePopupInAccountPage() {
        myAccount.click_On_Cancel_Button();
    }

    @Then("User able to view edit name popup is not displayed in account page")
    public void userAbleToViewEditNamePopupIsNotDisplayedInAccountPage() {
        Assert.assertFalse(myAccount.validate_Name_Popup_Closed_Successfully());
    }

    @And("^User clicks on save changes button on edit name popup on account page$")
    public void user_clicks_on_save_changes_button_on_edit_name_popup_on_account_page() {
        myAccount.click_On_Save_Changes_Button();
    }

    @Then("^Verify user view the msg Name updated successfully on account page$")
    public void verify_user_view_the_msg_name_updated_successfully_on_account_page() {
        Assert.assertTrue(myAccount.verify_Msg_Name_Updated_Successfully());
    }

    @And("^User clicks on logout in profile menu on header$")
    public void user_clicks_on_logout_in_profile_menu() {
        myAccount.click_On_Logout_In_Profile_Menu();
    }

    @Then("^User is on logout popup on header$")
    public void user_is_on_logout_screen() {
        Assert.assertEquals("Logout", myAccount.verify_Logout_Screen());
    }

    @And("User able to view the message are you sure want to logout on logout popup in account page")
    public void userAbleToViewTheMessageAreYouSureWantToLogoutOnLogoutPopupInAccountPage() {
        Assert.assertEquals("Are you sure you want to logout?", myAccount.verify_Message_Are_You_Want_To_Sure_Logout());
    }

    @And("User able to view cancel and logout button on logout popup in account page")
    public void userAbleToViewCancelAndLogoutButtonOnLogoutPopupInAccountPage() {
        Assert.assertEquals("Cancel", myAccount.verify_Cancel_Button());
        Assert.assertEquals("Logout", myAccount.verify_Logout_Button());
    }

    @When("User clicks on cancel button to navigate previous page on logout popup in account page")
    public void user_clicks_on_cancel_button_to_navigate_previous_page_on_logout_popup_in_account_page() {
        myAccount.click_Cancel_Button_Logout_Screen();
    }

    @Then("User verify to redirect my account page")
    public void userVerifyToRedirectMyAccountPage() {
        Assert.assertEquals("User is not navigate on account page", PropertiesUtil.getEnvironmentKey("URL") + "account", myAccount.verify_Redirection_Of_Account_Page());
    }

    @And("^User clicks on logout button on header$")
    public void user_clicks_on_logout_button() {
        myAccount.click_On_logout_Button_In_Logout_Screen();
    }

    @When("User clicks on edit email on account page")
    public void userClicksOnEditEmailOnAccountPage() {
        myAccount.click_On_Edit_Email();
    }

    @Then("User verify is on edit email popup on account page")
    public void userVerifyIsOnEditEmailPopupOnAccountPage() {
        myAccount.verify_Email_Text();
    }

    @And("User able to view the edit email text, email text field on edit name popup in account page")
    public void userAbleToViewTheEditEmailTextEmailTextFieldOnEditNamePopupInAccountPage() {
        Assert.assertEquals("Edit Email", myAccount.verify_Email_Text());
        Assert.assertTrue("Email text field is not displayed on edit email popup :-", myAccount.verify_Email_Text_Field());
    }

    @And("User able to view the cancel and verify email button on edit name popup in account page")
    public void userAbleToViewTheCancelAndVerifyEmailButtonOnEditNamePopupInAccountPage() {
        Assert.assertEquals("Cancel", myAccount.cancel_Button_On_Edit_Email_Popup());
        Assert.assertEquals("Verify Email", myAccount.Verify_Email_Button_On_Edit_Email_Popup());
    }

    @Then("User view the see the current email already entered in email field on edit email popup in account page")
    public void userViewTheSeeTheCurrentEmailAlreadyEnteredInEmailFieldOnEditEmailPopupInAccountPage() {
        myAccount.verify_Already_Exist_Email_In_Edit_Email_Popup();
    }

    @And("user verify email button disabled on edit email popup in account page")
    public void userVerifyEmailButtonDisabledOnEditEmailPopupInAccountPage() {
        Assert.assertFalse("Email button is displayed ", myAccount.verify_Email_Button_Disabled());
    }

    @When("User clicks on cancel button on edit email popup in account page")
    public void userClicksOnCancelButtonOnEditEmailPopupInAccountPage() {
        myAccount.click_On_Cancel_Email_Button();
    }

    @Then("User able to view edit email popup is not displayed in account page")
    public void userAbleToViewEditEmailPopupIsNotDisplayedInAccountPage() {
        Assert.assertFalse(myAccount.validate_Email_Popup_Closed_Successfully());
    }

    @And("Verify first and last name should be auto field on edit name popup on account page")
    public void verifyFirstAndLastNameShouldBeAutoFieldOnEditNamePopupOnAccountPage() {
        Assert.assertFalse("First name field is empty", myAccount.verify_First_Name_Field().isEmpty());
        Assert.assertFalse("Last name field is empty", myAccount.verify_Last_Name_Field().isEmpty());
    }

    @And("User remove first name from name field on edit name popup on account page")
    public void userRemoveNameFromNameFieldOnAccountPage() {
        myAccount.remove_First_Name_from_Name_Field();
    }

    @And("User click on first name input field on edit name popup on account page")
    public void userClickOnFirstNameInputFieldOnEditNamePopupOnAccountPage() {
        myAccount.click_On_First_Name_Input_Field();
    }

    @Then("Verify legal first name input field should active with blue placeholder")
    public void verifyLegalFirstNameInputFieldShouldActiveWithBluePlaceholder() {
        Assert.assertTrue("First name input field is not active", myAccount.is_Active_Placeholder_Of_First_Name());
    }

    @And("User enter first name in input field on account page")
    public void userEnterFirstNameInInputFieldOnAccountPage() {
        myAccount.enter_First_Name_In_Input_Field();
    }

    @Then("Verify save Changes button should active on edit name popup on account page")
    public void verifySaveChangesButtonShouldActiveOnEditNamePopupOnAccountPage() {
        Assert.assertTrue("Save changes button is disabled", myAccount.is_Enabled_Save_Changes_Btn());
    }

    @And("User click on last name input field on edit name popup on account page")
    public void userClickOnLastNameInputFieldOnEditNamePopupOnAccountPage() {
        myAccount.click_On_Last_Name_Input_Field();
    }

    @Then("Verify legal last name input field should active with blue placeholder")
    public void verifyLegalLastNameInputFieldShouldActiveWithBluePlaceholder() {
        Assert.assertTrue("Last name input field is not active", myAccount.is_Active_Placeholder_Of_First_Name());
    }

    @And("User enter last name in input field on edit name popup on account page")
    public void userEnterLastNameInInputFieldOnEditNamePopupOnAccountPage() {
        myAccount.enter_Last_Name_In_Input_Field();
    }

    @When("User remove last name from name field on edit name popup on account page")
    public void userRemoveLastNameFromNameFieldOnEditNamePopupOnAccountPage() {
        myAccount.remove_Last_Name_from_Name_Field();
    }

    @Then("Verify User enter last name, And should updated with new Legal Last Name and old Legal Last Name")
    public void verifyUserEnterLastNameAndShouldUpdatedWithNewLegalLastNameAndOldLegalLastName() {
        String previousValue = myAccount.verify_Last_Name_Field();
        myAccount.enter_Last_Name_In_Input_Field();
        String newValue = myAccount.verify_Last_Name_Field();
        Assert.assertNotEquals("last name is not different", previousValue, newValue);
    }

    @Then("Verify user able to view Name of the user and edit button on account page")
    public void verifyUserAbleToViewNameOfTheUserAndEditButtonOnAccountPage() {
        myAccount.verify_Profile_Data();
    }

    @And("Verify kyc process not completed message on account page")
    public void verifyKycProcessNotCompletedMessageOnAccountPage() {
        Assert.assertEquals("Your KYC has not been completed yet", myAccount.verify_Kyc_Not_Completed_Msg());
    }

    @And("Verify finish account setup link on account page")
    public void verifyFinishAccountSetupLinkOnAccountPage() {
        Assert.assertTrue("Finish account set up is not visible", myAccount.is_Finish_Account_Setup_Visible());
    }

    @And("Verify auth email field on account page")
    public void verifyAuthEmailFieldOnAccountPage() {
        Assert.assertTrue("Email is not visible", myAccount.is_Email_Visible_On_Account_Page());
    }

    @And("Verify two factor auth update option should be visible")
    public void verifyTwoFactorAuthUpdateOptionShouldBeVisible() {
        Assert.assertTrue("Update option is not visible", myAccount.is_Update_Option_Visible());
    }

    @And("Verify password field should be visible on account page")
    public void verifyPasswordFieldShouldBeVisibleOnAccountPage() {
        Assert.assertTrue("Password field is not visible", myAccount.verify_Password_field());
    }

    @And("Verify address included during KYC should be displayed on account page")
    public void verifyAddressIncludedDuringKYCShouldBeDisplayedOnAccountPage() {
        Assert.assertTrue("Address is not visible", myAccount.verify_Address_Of_User());
    }

    @And("Verify KYC should be verified on account page")
    public void verifyIDVKYCShouldBeVerifiedOnAccountPage() {
        Assert.assertTrue("KYC is not verified", myAccount.is_Verified_Kyc());
    }

    @And("Verify user able to view phone number on account page")
    public void verifyUserAbleToViewPhoneNumberOnAccountPage() {
        Assert.assertTrue("Phone number is not visible", myAccount.is_Phone_Number_Visible());
    }

    @Then("User should be redirected to Edit Name confirmation pop up on account page")
    public void userShouldBeRedirectedToEditNameConfirmationPopUpOnAccountPage() {
        Assert.assertTrue("Edit name confirmation popup is not visible", myAccount.is_Edit_Name_Confirmation_Popup_Visible());
    }

    @And("Verify user able to view title and sub title to Edit Name confirmation pop up on account page")
    public void verifyUserAbleToViewTitleAndSubTitleToEditNameConfirmationPopUpOnAccountPage() {
        Assert.assertEquals("Are you sure you want to edit the name?", myAccount.verify_Title_Of_Edit_Name_Confirmation_Popup());
        Assert.assertEquals("To edit the name, you need to do the IDV/KYC again.", myAccount.verify_Sub_Title_Of_Edit_Name_Permission_Popup());
    }

    @And("User able to view cancel button on edit popup on account page")
    public void userAbleToViewCancelButtonOnEditPopupOnAccountPage() {
        Assert.assertTrue("Confirm btn is not visible", myAccount.is_Confirm_Btn_Visible());
        Assert.assertTrue("Cancel btn is not visible", myAccount.is_Cancel_Btn_visible());
    }

    @And("User click on confirm button on edit name confirmation popup on account page")
    public void userClickOnConfirmButtonOnEditPopupOnAccountPage() {
        myAccount.click_On_Confirm_Btn();
    }

    @And("User able to view cancel button on edit name confirmation popup on account page")
    public void userAbleToViewCancelButtonOnEditNameConfirmationPopupOnAccountPage() {
        myAccount.is_Cancel_Btn_visible();
    }

    @When("User clicks on cancel button on edit name confirmation popup in account page")
    public void userClicksOnCancelButtonOnEditNameConfirmationPopupInAccountPage() {
        myAccount.click_On_Cancel_Button();
    }

    @And("User should able to view Edit option in Mobile Number section on account page")
    public void userShouldAbleToViewEditOptionInMobileNumberSectionAccountPage() {
        myAccount.is_Edit_Button_Visible();
    }

    @When("User click on edit option in mobile number section on account page")
    public void userClickOnEditOptionInMobileNumberSectionOnAccountPage() {
        myAccount.click_Cn_Phone_Number_Edit_Button();

    }

    @Then("User should be successfully redirected to Edit Mobile Number pop up on account page")
    public void userShouldBeSuccessfullyRedirectedToEditMobileNumberPopUpOnAccountPage() {
        Assert.assertTrue("Edit mobile number popup is nt visible", myAccount.verify_Mobile_Number_Popup());
    }

    @And("Verify mobile number field on edit popup on account page")
    public void verifyMobileNumberFieldOnEditPopupOnAccountPage() {
        Assert.assertTrue("Mobile number field is not visible", myAccount.verify_Mobile_Number_Field());
    }

    @And("Verify placeholder text on edit popup on account page")
    public void verifyPlaceholderTextOnEditPopupOnAccountPage() {
        Assert.assertEquals("VOIP, landlines, or any temporary mobile are not accepted", myAccount.verify_Voip_Validation_Msg());
    }

    @And("Verify cancel button and verify mobile number button on edit popup on account page")
    public void verifyCancelButtonAndVerifyMobileNumberButtonOnEditPopupOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());
        Assert.assertTrue("Verify mobile number button is not visible", myAccount.is_Verify_Mobile_Number_Button());
    }

    @And("Verify green outline circle should displayed with Request Details option on account page")
    public void verifyGreenOutlineCircleShouldDisplayedWithRequestDetailsOptionOnAccountPage() {
        Assert.assertTrue("Green outline is not visible", myAccount.verify_Request_Detail_Option());
    }

    @And("User will remove mobile number from mobile number field on account page")
    public void userWillRemoveMobileNumberFromMobileNumberFieldOnAccountPage() {
        myAccount.remove_Mobile_Number_In_Number_Field();
    }

    @And("User enter mobile number {string} in input field on account page")
    public void userEnterMobileNumberInInputFieldOnAccountPage(String mobileNumber) {
        myAccount.enter_Mobile_number_In_Input_Field(mobileNumber);
    }

    @Then("Verify system should accept valid 12-digit Mobile number including 2 characters for hyphens on account page")
    public void verifySystemShouldAcceptValidDigitMobileNumberOnAccountPage() {
        Assert.assertEquals("Mobile number contains more than 10 digit", 12, myAccount.verify_10_Digit_Mobile_Number());
    }

    @Then("Verify no other value should acceptable except numeric values on account page")
    public void verifyNoOtherValueShouldAcceptableExceptNumericValuesOnAccountPage() {
        Assert.assertTrue("Mobile number field is empty", myAccount.get_Mobile_Number_Value().isEmpty());
    }

    @Then("Verify user able to view a green check in mobile number field on account page")
    public void verifyUserAbleToViewAGreenCheckInMobileNumberFieldOnAccountPage() {
        Assert.assertTrue("Green tick is not visible", myAccount.is_Green_Tick_Visible());
    }


    @And("Verify non VOIP, landlines message below the mobile number field on account page")
    public void verifyNonVOIPLandlinesMessageBelowTheMobileNumberFieldOnAccountPage() {
        Assert.assertEquals("VOIP, landlines, or any temporary mobile are not accepted", myAccount.verify_Voip_Validation_Msg());
    }

    @Then("Verify system should reject Mobile number with invalid format on account page")
    public void verifySystemShouldRejectMobileNumberWithInvalidFormatOnAccountPage() {
        Assert.assertEquals("Please ensure a valid 10-digit mobile number is entered", myAccount.verify_Voip_Validation_Msg());
    }

    @Then("Verify error message should displayed on entering invalid Mobile number on account page")
    public void verifyErrorMessageShouldDisplayedOnEnteringInvalidMobileNumberOnAccountPage() {
        Assert.assertEquals("This is not a valid mobile number", myAccount.verify_Voip_Validation_Msg());

    }

    @Then("Verify error message should displayed on entering existing Mobile number on account page")
    public void verifyErrorMessageShouldDisplayedOnEnteringExistingMobileNumberOnAccountPage() {
        Assert.assertEquals("This mobile number is already associated with another account.", myAccount.verify_Voip_Validation_Msg());

    }

    @And("Verify cross icon should appear with below validation message on account page")
    public void verifyCrossIconShouldAppearWithBelowValidationMessageOnAccountPage() {
        Assert.assertTrue("Cross icon is not visible", myAccount.verify_Cross_Icon());
    }

    @And("User click on cancel button on edit option on account page")
    public void userClickOnCancelButtonOnEditOptionOnAccountPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @Then("Verify mobile Number button should remain in disabled when already autofill number is displayed on account page")
    public void verifyMobileNumberButtonShouldRemainInDisabledWhenAlreadyAutofillNumberIsDisplayedOnAccountPage() {
        Assert.assertFalse("Verify mobile number button is enabled", myAccount.verify_Mobile_Number_Btn());
    }

    @Then("Verify mobile number button should enabled if valid non existing number is entered on account page")
    public void verifyMobileNumberButtonShouldEnabledIfValidNonExistingNumberIsEnteredOnAccountPage() {
        Assert.assertTrue("Verify mobile number button is disabled", myAccount.verify_Mobile_Number_Btn());
    }

    @Then("Verify Mobile Number button should remain disabled when invalid Number entered in input field on account page")
    public void verifyMobileNumberButtonShouldRemainDisabledWhenInvalidNumberEnteredInInputFieldOnAccountPage() {
        Assert.assertFalse("Verify mobile number button is enabled", myAccount.verify_Mobile_Number_Btn());
    }

    @And("User click on verify mobile number button on edit popup on account page")
    public void userClickOnVerifyMobileNumberButtonOnEditPopupOnAccountPage() {
        myAccount.click_On_Verify_Mobile_Number_Btn();
    }

    @Then("Verify user should redirected to Verify Mobile Number pop up when clicked on Verify Mobile Number button")
    public void verifyUserShouldRedirectedToVerifyMobileNumberPopUpWhenClickedOnVerifyMobileNumberButton() {
        Assert.assertEquals("Verify Mobile Number", myAccount.verify_Mobile_Number_Text_Popup());
    }

    @Then("Verify request detail tick with green filled circle on verify mobile popup on account page")
    public void verifyRequestDetailTickWithGreenFilledCircleOnVerifyMobilePopupOnAccountPage() {
        Assert.assertTrue("Green tick is not visible", myAccount.verify_Icon_With_Green_Tick());
    }

    @And("Verify Didn't get a code? resend code link on verify mobile popup on account page")
    public void verifyDidnTGetACodeResendCodeLinkOnVerifyMobilePopupOnAccountPage() {
        Assert.assertTrue("Did get OTP text and resend Btn are not visible", myAccount.verify_Did_Not_Get_OTP());
    }

    @And("Verify change mobile number btn and confirm code button on verify mobile popup on account page")
    public void verifyChangeMobileNumberAndConfirmCodeButtonOnVerifyMobilePopupOnAccountPage() {
        Assert.assertTrue("Confirm code button is not visible", myAccount.is_Confirm_Code_Btn_Visible());
        Assert.assertTrue("Change Number button is not visible", myAccount.is_Change_Mobile_Number_Btn_Visible());
    }

    @When("^User enter OTP (.+) in input field on verify mobile popup on account page$")
    public void userEnterOTPInInputFieldOnVerifyMobilePopupOnAccountPage(String OTP) {
        buySharePage.set_OTP(OTP);
    }

    @Then("Verify user should able to include 6-digit code on verify mobile popup on account page")
    public void verifyUserShouldAbleToIncludeDigitCodeOnVerifyMobilePopupOnAccountPage() {
        buySharePage.verify_OTP_Field();
    }

    @Then("Verify confirm button should disabled when enter less than 6 digit code in OTP box on verify mobile popup on account page")
    public void verifyConfirmButtonShouldDisabledWhenEnterLessThanDigitCodeInOTPBoxOnVerifyMobilePopupOnAccountPage() {
        Assert.assertFalse("Confirm code button is enabled", myAccount.verify_Confirm_Code_Button_Enabled());
    }

    @And("User click on confirm code button on verify mobile popup on account page")
    public void userClickOnConfirmCodeButtonOnVerifyMobilePopupOnAccountPage() {
        myAccount.click_On_confirm_Button();
    }

    @Then("Verify invalid code is entered, validation message should displayed on verify mobile popup on account page")
    public void verifyInvalidCodeIsEnteredValidationMessageShouldDisplayedOnVerifyMobilePopupOnAccountPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your SMS", myAccount.verify_Validation_Msg());
    }

    @When("User remove otp from input field on verify mobile popup on account page")
    public void userRemoveOtpFromInputFieldOnVerifyMobilePopupOnAccountPage() {
        buySharePage.remove_Code_From_Otp_Box();
    }

    @Then("Verify enter the invalid code third time validation message should displayed on verify mobile popup on account page")
    public void verifyEnterTheInvalidCodeThirdTimeValidationMessageShouldDisplayedOnVerifyMobilePopupOnAccountPage() {
        Assert.assertEquals("Too many failed attempts. Please try again in 15 minutes", myAccount.verify_Validation_Msg());
    }

    @Then("Verify Resend Code link should displayed in enabled state on verify mobile popup on account page")
    public void verifyResendCodeLinkShouldDisplayedInEnabledStateOnVerifyMobilePopupOnAccountPage() {
        Assert.assertTrue("Resend code button is disabled", myAccount.is_Resend_Code_Btn_Enabled());
    }

    @When("User click on resend code button on verify mobile popup on account page")
    public void userClickOnResendCodeButtonOnVerifyMobilePopupOnAccountPage() {
        myAccount.click_On_Resend_Code_Btn();
    }

    @Then("Verify text new code should be sent successfully on verify mobile popup on account page")
    public void verifyTextNewCodeShouldBeSentSuccessfullyOnVerifyMobilePopupOnAccountPage() {
        Assert.assertEquals("Code resent successfully!", myAccount.verify_Error_Code_Msg());
    }

    @And("Verify timer should start with 14:59 for OTP resend on verify mobile popup on account page")
    public void verifyTimerShouldStartWithForOTPResendOnVerifyMobilePopupOnAccountPage() {
        Assert.assertEquals("15:00" + " mins", forgotPasswordPage.verify_OTP_Timer());
    }

    @When("User will wait for {int} min on verify mobile popup on account page")
    public void userWillWaitForMinOnVerifyMobilePopupOnAccountPage(int timer) {
        waitForElementInMinutes(timer);

    }

    @Then("Verify error message when user again enter invalid code after 15 minutes on verify mobile popup on account page")
    public void verifyErrorMessageWhenUserAgainEnterInvalidCodeAfterMinutesOnVerifyMobilePopupOnAccountPage() {
        Assert.assertEquals("Code is invalid, one ( 1 ) attempts remaining", myAccount.get_Error_Msg());
    }

    @Then("Verify user able to view pop up should appear as Mobile Number not verified")
    public void verifyUserAbleToViewPopUpShouldAppearAsMobileNumberNotVerified() {
        Assert.assertTrue("NOt verified popup is not visible", myAccount.is_Not_Verified_Popup_Visible());
    }

    @And("Verify sub heading should appear as Mobile Number not verified popup on account page")
    public void verifySubHeadingShouldAppearAsMobileNumberNotVerifiedPopupOnAccountPage() {
        Assert.assertTrue("Sub heading is not visible", myAccount.is_Not_Verified_Popup_Sub_Heading_visible());
    }

    @And("Verify user able to view cross icon on Mobile Number not verified popup on account page")
    public void verifyUserAbleToViewCrossIconOnMobileNumberNotVerifiedPopupOnAccountPage() {
        Assert.assertTrue("Cross icon not visible", myAccount.is_Close_Icon_Visible());
    }

    @When("User click on cross icon on Mobile Number not verified popup on account page")
    public void userClickOnCrossIconOnMobileNumberNotVerifiedPopupOnAccountPage() {
        myAccount.click_On_Close_Icon();
    }

    @And("user click on stay logged in button on are you there popup on account page")
    public void userClickOnStayLoggedInButtonOnAreYouTherePopupOnAccountPage() {
        myAccount.click_On_Stay_Logged_In_Btn();
    }

    @When("User get the value of mobile number section on account page")
    public void userGetTheValueOfMobileNumberSectionOnAccountPage() {
        mobileNumber = myAccount.get_Mobile_Number();
    }

    @And("Verify number is changed successfully on account page")
    public void verifyNumberIsChangedSuccessfullyOnAccountPage() {
        Assert.assertNotEquals("Both the mobile number are same", mobileNumber, myAccount.get_Mobile_Number());
    }

    @Then("Verify confirm code button should enabled when enter valid OTP on account page")
    public void verifyConfirmCodeButtonShouldEnabledWhenEnterValidOTPOnAccountPage() {
        Assert.assertTrue("Confirm code button is disabled", myAccount.verify_Confirm_Code_Button_Enabled());
    }

    @Then("Verify user able to view mobile number verified popup on account page")
    public void verifyUserAbleToViewMobileNumberVerifiedPopupOnAccountPage() {
        Assert.assertTrue("Mobile verified popup is not visible", kycPage.verify_Mobile_Verification_Popup());
    }

    @Then("Verify user able to view placeholder text on verify mobile popup on account page")
    public void verifyUserAbleToViewPlaceholderTextOnVerifyMobilePopupOnAccountPage() {
        Assert.assertTrue("Placeholder text is not visible", kycPage.verify_Placeholder_Text());

    }

    @When("User click on cross icon on verify mobile popup on account page")
    public void userClickOnCrossIconOnVerifyMobilePopupOnAccountPage() {
        buySharePage.click_On_Close_Icon();
    }

    @Then("Verify user should be redirected to Account page")
    public void verifyUserShouldBeRedirectedToAccountPage() {
        Assert.assertFalse("Mobile verified popup is visible", kycPage.verify_Mobile_Verification_Popup());
    }

    @And("User will wait for {int} sec on verify mobile popup on account page")
    public void userWillWaitForSecOnVerifyMobilePopupOnAccountPage(int timer) {
        waitForElement(timer);
    }

    @Then("Verify user able to view edit address option in address section on account page")
    public void verifyUserAbleToViewEditAddressOptionInAddressSectionOnAccountPage() {
        Assert.assertTrue("Edit option is not visible", myAccount.is_Address_Edit_option_Visible());
    }

    @When("User click on edit address option on on account page")
    public void userClickOnEditAddressOptionOnOnAccountPage() {
        myAccount.click_On_Edit_Address_Option();
    }

    @Then("Verify User should be redirected to Edit Address pop up on account page")
    public void verifyUserShouldBeRedirectedToEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Edit address popup is not visible", myAccount.is_Edit_Address_Popup_Visible());
    }

    @Then("Verify user able to view residential address field and apt suite on Edit Address pop up on account page")
    public void verifyUserAbleToViewResidentialAddressFieldAndAptSuiteOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Address field is not visible", kycPage.is_Address_Field_Visible());
        Assert.assertTrue("Apt suite is not visible", kycPage.is_Apt_Suite_Field_Visible());
    }

    @And("Verify user able to view city, state, zipcode on Edit Address pop up on account page")
    public void verifyUserAbleToViewCityStateZipcodeOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("City field is not visible", kycPage.is_City_Field_Visible());
        Assert.assertTrue("State field is not visible", kycPage.is_State_Field_Visible());
        Assert.assertTrue("Zipcode field is not visible", kycPage.is_Zipcode_Field_Visible());
    }

    @And("Verify user able to view cancel and save changes button on Edit Address pop up on account page")
    public void verifyUserAbleToViewCancelAndSaveChangesButtonOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_Cancel_Btn_Visible());
        Assert.assertTrue("Save change button is not visible", myAccount.is_Save_Changes_Btn_Visible());
    }

    @And("User click on residential address on Edit Address pop up on account page")
    public void userClickOnResidentialAddressOnEditAddressPopUpOnAccountPage() {
        kycPage.click_On_Residential_Input_Field();

    }

    @Then("Verify residential address field should be mandatory on Edit Address pop up on account page")
    public void verifyResidentialAddressFieldShouldBeMandatoryOnOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Residential field is not mandatory", kycPage.verify_Residential_Mandatory_Field());
    }

    @And("User click on city field on Edit Address pop up on account page")
    public void userClickOnCityFieldOnEditAddressPopUpOnAccountPage() {
        kycPage.click_On_city_Input_Field();
    }

    @When("User enter address {string} in residential input field on Edit Address pop up on account page")
    public void userEnterAddressInResidentialInputFieldOnEditAddressPopUpOnAccountPage(String address) {
        kycPage.enters_Address_In_Residential_Field(address);
    }

    @Then("Verify that enter address matched with dropdown value on Edit Address pop up on account page")
    public void verifyThatEnterAddressMatchedWithDropdownValueOnEditAddressPopUpOnAccountPage() {
        String addressInputFieldValue = kycPage.get_Residential_Address_Value();
        String addressSuggestionValue = kycPage.verify_Suggestion_Of_Address_Dropdown();
        Assert.assertEquals("Actual and expected are not matched", addressInputFieldValue, addressSuggestionValue);
    }

    @When("User click on address from address dropdown on Edit Address pop up on account page")
    public void userClickOnAddressFromAddressDropdownOnEditAddressPopUpOnAccountPage() {
        kycPage.click_On_Residential_Dropdown_Value();
    }

    @And("Verify save changes button should disabled on Edit Address pop up on account page")
    public void verifySaveChangesButtonShouldDisabledOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("Save changes button is enabled", myAccount.is_Save_Changes_Button_Disabled());
    }

    @Then("Verify City should autofill when user selects address on Edit Address pop up on account page")
    public void verifyCityShouldAutofillWhenUserSelectsAddressOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("City input field is empty", kycPage.get_City_Value().isEmpty());
    }

    @And("User remove input field text {string} on Edit Address pop up on account page")
    public void userRemoveInputFieldTextOnEditAddressPopUpOnAccountPage(String value) {
        remove_Text_Field_Data(value);
    }

    @Then("Verify city field should mandatory on Edit Address pop up on account page")
    public void verifyCityFieldShouldMandatoryOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("City field is not mandatory", kycPage.verify_City_Mandatory_Field());

    }

    @Then("Verify state should be filled when enter state in input field on Edit Address pop up on account page")
    public void verifyStateShouldBeFilledWhenEnterStateInInputFieldOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("State field is empty", kycPage.get_State_Value().isEmpty());
    }

    @Then("Verify state field should be mandatory on Edit Address pop up on account page")
    public void verifyStateFieldShouldBeMandatoryOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("State field is not mandatory", kycPage.verify_state_Input_Field_Mandatory());
    }

    @Then("Verify zip code should be filled when enter zip code in input field on Edit Address pop up on account page")
    public void verifyZipCodeShouldBeFilledWhenEnterStateInInputFieldOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("Address field is empty", myAccount.get_Zip_Code_Value().isEmpty());
    }

    @Then("Verify zipcode field should mandatory on Edit Address pop up on account page")
    public void verifyZipcodeFieldShouldMandatoryOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Zip code field is not mandatory", myAccount.is_Zip_Code_Field_Error_Msg());
    }

    @Then("Verify residential address should filled when select address dropdown value on Edit Address pop up on account page")
    public void verifyResidentialAddressShouldFilledWhenSelectAddressDropdownValueOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("Address field is empty", kycPage.get_Residential_Address_Value().isEmpty());
    }

    @And("User enter city name {string} in input field on Edit Address pop up on account page")
    public void userEnterCityNameInInputFieldOnOnEditAddressPopUpOnAccountPage(String cityNAme) {
        kycPage.enter_City_Name_In_Input_Field(cityNAme);
    }

    @Then("Verify User should be able to type the City successfully on Edit Address pop up on account page")
    public void verifyUserShouldBeAbleToTypeTheCitySuccessfullyOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("City field is empty", myAccount.get_City_Value().isEmpty());
    }

    @And("User enter state name {string} in input field on Edit Address pop up on account page")
    public void userEnterStateNameInInputFieldOnEditAddressPopUpOnAccountPage(String stateName) {
        kycPage.enter_State_Name_In_Input_Field(stateName);
    }


    @And("User enter zip code name {string} in input field on Edit Address pop up on account page")
    public void userEnterZipCodeNameInInputFieldOnEditAddressPopUpOnAccountPage(String zipCode) {
        kycPage.enter_Zip_Code_In_Input_Field(zipCode);

    }

    @Then("Verify zipcode should be filled when enter state in input field on Edit Address pop up on account page")
    public void verifyZipcodeShouldBeFilledWhenEnterStateInInputFieldOnEditAddressPopUpOnAccountPage() {
        Assert.assertFalse("Zipcode input field is empty", kycPage.get_Zip_Code_Value().isEmpty());
    }

    @Then("Verify Save Changes button should enabled when valid input is added on Edit Address pop up on account page")
    public void verifySaveChangesButtonShouldEnabledWhenValidInputIsAddedOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Save changes button is enabled", myAccount.is_Save_Changes_Button_Disabled());

    }

    @And("User click on cancel button on Edit Address pop up on account page")
    public void userClickOnCancelButtonOnEditAddressPopUpOnAccountPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @And("Verify user should redirect to my account page")
    public void verifyUserShouldRedirectToMyAccountPage() {
        Assert.assertFalse("Edit address popup is not visible", myAccount.is_Edit_Address_Popup_Visible());
    }

    @And("User get the value of address on account page")
    public void userGetTheValueOfAddressOnAccountPage() {
        addressValue = myAccount.get_Address_Value();
    }


    @And("User click on save changes on Edit Address pop up on account page")
    public void userClickOnSaveChangesOnEditAddressPopUpOnAccountPage() {
        myAccount.click_On_Save_Changes_Btn();
    }

    @Then("Verify user should be redirected successfully to My Account page with updated address")
    public void verifyUserShouldBeRedirectedSuccessfullyToMyAccountPageWithUpdatedAddress() {
        Assert.assertFalse("Edit address popup is visible", myAccount.verify_Did_You_Mean_Address_Popup_Visible());
        Assert.assertNotEquals("Both the address are same", addressValue, myAccount.get_Address_Value());
    }

    @Then("Verify user should be redirected to {string} pop up on account page")
    public void verifyUserShouldBeRedirectedToPopUpOnAccountPage(String didYouMeanPopup) {
        Assert.assertEquals("Did you mean popup is not visible", didYouMeanPopup, myAccount.verify_Did_You_Mean_Address_Popup());
    }

    @And("Verify you Entered radio button is displayed as active by default on did you mean popup on account page")
    public void verifyYouEnteredRadioButtonIsDisplayedAsActiveByDefaultOnDidYouMeanPopupOnAccountPage() {
        Assert.assertTrue("Default selected checkbox is not visible", myAccount.verify_Default_Checkbox());
    }

    @And("Verify address which is recommended with radio button on did you mean popup on account page")
    public void verifyAddressWhichIsRecommendedWithRadioButtonOnDidYouMeanPopupOnAccountPage() {
        Assert.assertTrue("recommended address is not visible", myAccount.verify_Recommended_Address());
    }

    @When("Verify recommended radio button should active, user clicks on radio button on did you mean popup on account page")
    public void verifyRecommendedRadioButtonShouldActiveUserClicksOnRadioButtonOnDidYouMeanPopupOnAccountPage() {
        myAccount.click_On_Recommended_Address_Checkbox();
        Assert.assertTrue("Recommended checkbox is not active", myAccount.verify_Recommended_Checkbox_Active());
    }

    @And("User enter address in residential input field on Edit Address pop up on account page")
    public void userEnterAddressInResidentialInputFieldOnEditAddressPopUpOnAccountPage() {
        kycPage.generate_Random_Address();
    }

    @And("Verify user able to view cancel and confirm button on Edit Address pop up on account page")
    public void verifyUserAbleToViewCancelAndConfirmButtonOnEditAddressPopUpOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());
        Assert.assertTrue("Confirm button is not visible", myAccount.is_Confirm_Button_Visible());
    }

    @When("User click on confirm button on Did you mean popup on account page")
    public void userClickOnConfirmButtonOnDidYouMeanPopupOnAccountPage() {
        myAccount.click_On_Confirm_Btn();
    }

    @Then("Verify user able to view Change option in Account Recovery Mode section on account page")
    public void verifyUserAbleToViewChangeOptionInAccountRecoveryModeSectionOnAccountPage() {
        Assert.assertTrue("Update button is not visible", myAccount.is_Account_Recovery_Update_Btn_Visible());
    }

    @When("User click on account recovery update button on account page")
    public void userClickOnAccountRecoveryUpdateButtonOnAccountPage() {
        myAccount.click_On_Update_Btn();
    }

    @Then("Verify verification method popup should be visible on account page")
    public void verifyVerificationMethodPopupShouldBeVisibleOnAccountPage() {
        Assert.assertTrue("Verification popup is not visible", myAccount.is_Verification_Popup_Visible());
    }

    @And("Verify user able to view email option on verification method popup on account page")
    public void verifyUserAbleToViewEmailOptionOnVerificationMethodPopupOnAccountPage() {
        Assert.assertTrue("Email option is not visible", myAccount.is_Email_Option_Visible());
    }

    @And("Verify user able to view SMS option on verification method popup on account page")
    public void verifyUserAbleToViewSMSOptionOnVerificationMethodPopupOnAccountPage() {
        Assert.assertTrue("Sms options is not visible", myAccount.is_Sms_Option_Visible());
    }

    @And("Verify user able to view cancel and confirm button on verification method popup on account page")
    public void verifyUserAbleToViewCancelAndConfirmButtonOnVerificationMethodPopupOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());
        Assert.assertTrue("Confirm button is not visible", myAccount.is_Confirm_Button_Visible());
    }

    @Then("Verify user should redirect to address popup on account page")
    public void verifyUserShouldRedirectToAddressPopupOnAccountPage() {
        Assert.assertFalse("Did you mean popup is visible", myAccount.verify_Did_You_Mean_Address_Popup_Visible());
    }

    @And("Verify email should be displayed as default selection on verification method popup on account page")
    public void verifyEmailShouldBeDisplayedAsDefaultSelectionOnVerificationMethodPopupOnAccountPage() {
        Assert.assertTrue("Email option is not visible", myAccount.is_Email_Option_Visible());

    }

    @When("User click on cancel button on verification method popup on account page")
    public void userClickOnCancelButtonOnVerificationMethodPopupOnAccountPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @Then("Verify User should redirect to account page")
    public void verifyUserShouldRedirectToAccountPage() {
        Assert.assertFalse("Verification popup is visible", myAccount.is_Verification_Popup_Visible());

    }

    @Then("verify user SMS option should selected on verification method popup on account page")
    public void verifyUserSMSOptionShouldSelectedOnVerificationMethodPopupOnAccountPage() {
        Assert.assertTrue("SMS option is not selected", myAccount.verify_SMS_options_Selected());
    }

    @When("User click on SMS text option on verification method popup on account page")
    public void userClickOnSMSTextOptionOnVerificationMethodPopupOnAccountPage() {
        myAccount.click_On_SMS_Checkbox();
    }

    @When("User click on confirm button on verification method popup on account page")
    public void userClickOnConfirmButtonOnVerificationMethodPopupOnAccountPage() {
        kycPage.click_On_Confirm_Btn();
    }

    @Then("Verify User should be redirect to account page")
    public void verifyUserShouldBeRedirectToAccountPage() {
        Assert.assertFalse("Verification popup is visible", myAccount.is_Verification_Popup_Visible());
    }

    @Then("Verify user able to view password edit option on account page")
    public void verifyUserAbleToViewPasswordEditOptionOnAccountPage() {
        Assert.assertTrue("Password edit option is not visible", myAccount.is_Password_Edit_Options_Visible());
    }

    @When("User click on password edit option on account page")
    public void userClickOnPasswordEditOptionOnAccountPage() {
        myAccount.click_On_Password_Edit_Option();
    }

    @Then("Verify user should be redirected to Verify OTP pop up on account page")
    public void verifyUserShouldBeRedirectedToVerifyOTPPopUpOnAccountPage() {
        Assert.assertTrue("OTP popup is not visible", myAccount.is_OTP_Popup_Visible());
    }


    @And("Verify 6 digit otp field should be visible on verify OTP pop up on account page")
    public void verifyDigitOtpFieldShouldBeVisibleOnVerifyOTPPopUpOnAccountPage() {
        Assert.assertTrue("6 digit otp field is not visible", myAccount.verify_OTP_Field());
    }

    @And("Verify close icon should be visible on verify OTP pop up on account page")
    public void verifyCloseIconShouldBeVisibleOnVerifyOTPPopUpOnAccountPage() {
        Assert.assertTrue("Cross icon not visible", myAccount.is_Close_Icon_Visible());
    }

    @And("Verify placeholder text {string} on verify OTP pop up on account page")
    public void verifyPlaceholderTextOnVerifyOTPPopUpOnAccountPage(String otpText) {
        Assert.assertEquals("OTP sent text is not visible", otpText, myAccount.verify_OTP_Sent_text());

    }

    @And("Verify Didn't receive it? Resend code link on verify OTP pop up on account page")
    public void verifyDidnTReceiveItResendCodeLinkOnVerifyOTPPopUpOnAccountPage() {
        Assert.assertTrue("Resend code is not visible", myAccount.verify_Already_Sign_In_Visible());
    }

    @When("User click on cross icon on verify OTP pop up on account page")
    public void userClickOnCrossIconOnOnVerifyOTPPopUpOnAccountPage() {
        myAccount.click_On_Close_Icon();
    }

    @Then("User should redirect to account page")
    public void userShouldRedirectToAccountPage() {
        Assert.assertFalse("Otp popup is visible", myAccount.is_OTP_Popup_Visible());
    }

    @When("User enter otp {string} in input field on Verify OTP pop up on account page")
    public void userEnterOtpInInputFieldOnVerifyOTPPopUpOnAccountPage(String otp) {
        buySharePage.set_OTP(otp);
    }

    @When("User remove Otp code in input field on Verify OTP pop up on account page")
    public void userRemoveOtpCodeInInputFieldOnVerifyOTPPopUpOnAccountPage() {
        buySharePage.remove_Code_From_Otp_Box();
    }

    @When("User click on email option on verification method popup on account page")
    public void userClickOnEmailOptionOnVerificationMethodPopupOnAccountPage() {
        myAccount.click_On_Email_option();
    }

    @Then("Verify invalid code is entered, validation message should displayed on Verify OTP pop up on account page")
    public void verifyInvalidCodeIsEnteredValidationMessageShouldDisplayedOnVerifyOTPPopUpOnAccountPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your email", myAccount.get_Error_Msg());
    }

    @Then("Verify enter the invalid code third time validation message should displayed on on Verify OTP pop up on account page")
    public void verifyEnterTheInvalidCodeThirdTimeValidationMessageShouldDisplayedOnOnVerifyOTPPopUpOnAccountPage() {
        Assert.assertEquals("Too many failed attempts. Please try again in 15 minutes", myAccount.get_Error_Msg());
    }

    @And("User click on confirm button on Verify OTP pop up on account page")
    public void userClickOnConfirmButtonOnVerifyOTPPopUpOnAccountPage() {
        myAccount.click_On_confirm_Button();
    }

    @When("User click on resend code link on Verify OTP pop up on account page")
    public void userClickOnResendCodeLinkOnVerifyOTPPopUpOnAccountPage() {
        myAccount.click_On_Resend_Link();
    }

    @Then("Verify {string} should be sent successfully")
    public void verifyShouldBeSentSuccessfully(String toastMsg) {
        Assert.assertEquals("Toast msg is not visible", toastMsg, buySharePage.validate_Resend_Code_Link_Msg());
    }

    @Then("Verify ID Verified pop up should be displayed on account page")
    public void verifyIDVerifiedPopUpShouldBeDisplayedOnAccountPage() {
        Assert.assertTrue("Id verified popup is not visible", myAccount.is_ID_Verified_Popup_Visible());
    }

    @And("Verify user able to view your id verified text on verified popup on account page")
    public void verifyUserAbleToViewYourIdVerifiedTextOnVerifiedPopupOnAccountPage() {
        Assert.assertTrue("Placeholder text is not visible", myAccount.is_Placeholder_Text_Visible());
    }

    @Then("Verify user should be redirected to Edit Password pop up on account page")
    public void verifyUserShouldBeRedirectedToEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("Edit password popup is not visible", myAccount.verify_Edit_Password_Popup_Visible());
    }

    @And("Verify old password field should visible to Edit Password pop up on account page")
    public void verifyOldPasswordFieldShouldVisibleToEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("Old password field is not visible", myAccount.is_Old_Password_Field_Visible());
    }

    @And("Verify new password field should visible to Edit Password pop up on account page")
    public void verifyNewPasswordFieldShouldVisibleToEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("New password field is not visible", myAccount.is_New_Password_Field_Visible());
    }

    @And("Verify confirm password field should visible to Edit Password pop up on account page")
    public void verifyConfirmPasswordFieldShouldVisibleToEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("Confirm password field is not visible", myAccount.is_Confirm_Password_Field_Visible());
    }

    @And("Verify user able to view cancel and save change button on Edit Password pop up on account page")
    public void verifyUserAbleToViewCancelAndSaveChangeButtonOnEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());
        Assert.assertTrue("Save changes button is not visible", myAccount.is_Save_Changes_Button_Visible());
    }

    @When("User click on cancel button on Edit Password pop up on account page")
    public void userClickOnCancelButtonOnEditPasswordPopUpOnAccountPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @Then("User should be redirect to account page")
    public void userShouldBeRedirectToAccountPage() {
        Assert.assertFalse("Edit password popup is visible", myAccount.verify_Edit_Password_Popup_Visible());
    }

    @And("User click on eye icon on Edit Password pop up on account page")
    public void userClickOnEyeIconOnEditPasswordPopUpOnAccountPage() {
        myAccount.click_On_Password_Eye_Icon();
    }

    @Then("Verify encrypted form of Password should be visible on Edit Password pop up on account page")
    public void verifyEncryptedFormOfPasswordShouldBeVisibleOnEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("Password is decrypted form", myAccount.is_Eye_Icon_Open());
    }

    @And("User enter new password {string} in input field on Edit Password pop up on account page")
    public void userEnterPasswordInInputFieldOnEditPasswordPopUpOnAccountPage(String password) {
        myAccount.enter_New_Password_In_Input_Field(password);
    }

    @Then("Verify password should be accepted successfully on Edit Password pop up on account page")
    public void verifyPasswordShouldBeAcceptedSuccessfullyOnEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("No validation for password field", myAccount.verify_Password_Limit());
    }


    @And("User enter old password {string} in input field on Edit Password pop up on account page")
    public void userEnterOldPasswordInInputFieldOnEditPasswordPopUpOnAccountPage(String password) {
        myAccount.enter_Old_Password_In_Input_Field(password);
    }


    @And("User click on new password eye icon on Edit Password pop up on account page")
    public void userClickOnNewPasswordEyeIconOnEditPasswordPopUpOnAccountPage() {
        myAccount.click_On_New_Password_Eye_Icon();
    }

    @And("User click on outside the new password field on Edit Password pop up on account page")
    public void userClickOnOutsideTheNewPasswordFieldOnEditPasswordPopUpOnAccountPage() {
        myAccount.click_On_New_Password_Field();
    }

    @Then("Verify user able to view validation message below the password field on Edit Password pop up on account page")
    public void verifyUserAbleToViewValidationMessageBelowThePasswordFieldOnEditPasswordPopUpOnAccountPage() {
        Assert.assertTrue("No validation for password field", myAccount.verify_Password_Limit());
    }

    @And("User enter confirm password {string} in input field on Edit Password pop up on account page")
    public void userEnterConfirmPasswordInInputFieldOnEditPasswordPopUpOnAccountPage(String password) {
        myAccount.enter_Confirm_Password_In_Input_Field(password);
    }

    @Then("Verify user able to view {string} below confirm password field on Edit Password pop up on account page")
    public void verifyUserAbleToViewBelowConfirmPasswordFieldOnEditPasswordPopUpOnAccountPage(String validationMsg) {
        Assert.assertEquals("Both the msg are different", validationMsg, myAccount.verify_Password_Not_Match_Msg());
    }

    @And("User click on save changes button on Edit Password pop up on account page")
    public void userClickOnSaveChangesButtonOnEditPasswordPopUpOnAccountPage() {
        myAccount.click_On_Save_Changes_Button();
    }

    @Then("Verify 1 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up on account page")
    public void verifyAttemptsRemainingMessageShouldDisplayedWhenIncorrectOldPasswordEnteredOnEditPasswordPopUpOnAccountPage() {
        Assert.assertEquals("The password you’ve entered is incorrect, please try again, you have one (1) attempt remaining.", myAccount.verify_Password_Attempts_Msg());
    }

    @When("User remove input field text {string} on Edit Password pop up on account page")
    public void userRemoveInputFieldTextOnEditPasswordPopUpOnAccountPage(String password) {
        myAccount.remove_Text_Field_Data_By_Name(password);
    }

    @Then("Verify 2 attempts remaining message should displayed when incorrect old password entered on Edit Password pop up")
    public void verifyNdAttemptsRemainingMessageShouldDisplayedWhenIncorrectOldPasswordEnteredOnEditPasswordPopUp() {
        Assert.assertEquals("The password you’ve entered is incorrect, please try again, you have two (2) attempts remaining.", myAccount.verify_Password_Attempts_Msg());

    }

    @Then("Verify user able to view password not confirmed popup on account page")
    public void verifyUserAbleToViewPasswordNotConfirmedPopupPnAccountPage() {
        Assert.assertTrue("Password not confirmed popup is not visible", myAccount.is_Password_Not_Confirmed_Popup_Visible());
    }

    @And("Verify user able to view placeholder text on password not confirmed popup on account page")
    public void verifyUserAbleToViewPlaceholderTextOnPasswordNotConfirmedPopupOnAccountPage() {
        Assert.assertTrue("Sub heading is not visible", myAccount.is_Sub_Heading_Password_Not_Confirmed());
    }

    @When("User click on cross icon on password not confirmed popup on account page")
    public void userClickOnCrossIconOnPasswordNotConfirmedPopupOnAccountPage() {
        myAccount.click_On_Close_Icon();


    }

    @Then("User should be redirected to My Account page when clicking on cross icon")
    public void userShouldBeRedirectedToMyAccountPageWhenClickingOnCrossIcon() {
        Assert.assertFalse("Password not confirmed popup is visible", myAccount.is_Password_Not_Confirmed_Popup_Visible());
    }

    @Then("Verify password updated to new password and user should successfully redirected to My Account page")
    public void verifyPasswordUpdatedToNewPasswordAndUserShouldSuccessfullyRedirectedToMyAccountPage() {
        Assert.assertEquals("Password Updated Successfully.", myAccount.verify_Password_Updated_OR_not());
    }

    @And("User will wait {int} for verify OTP popup on account page")
    public void userWillWaitForVerifyOTPPopupOnAccountPage(int timer) {
        waitForElementInMinutes(timer);
    }


    @Then("Verify validation message should displayed after 5 minutes of code generation on account page")
    public void verifyValidationMessageShouldDisplayedAfterMinutesOfCodeGenerationOnAccountPage() {
        Assert.assertEquals("The six (6) digit code you entered has expired, resend code again to proceed.", myAccount.get_Error_Msg());
    }

    @Then("Verify user able to view update option with Two-Factor Auth section on account page")
    public void verifyUserAbleToViewUpdateOptionWithTwoFactorAuthSectionOnAccountPage() {
        Assert.assertTrue("Update button is not visible¬", myAccount.is_Two_Factor_Update_Button_Visible());
    }


    @When("User click on update option with Two-Factor Auth section on account page")
    public void userClickOnUpdateOptionWithTwoFactorAuthSectionOnAccountPage() {
        myAccount.click_On_Two_Factor_Update_Option();
    }

    @Then("User should be redirected to {string} pop up")
    public void userShouldBeRedirectedToPopUp(String twoFactorPopup) {
        Assert.assertEquals("Two factor popup is not visible", twoFactorPopup, myAccount.verify_Two_Factor_Popup());
    }

    @Then("Verify user should able to view Turn off Email SMS option on Two-Factor Auth section on account page")
    public void verifyUserShouldAbleToViewTurnOffEmailSMSOptionOnTwoFactorAuthSectionOnAccountPage() {
        myAccount.verify_Email_SMS_Turn_Off_Options();
    }

    @And("Verify user able to view cancel and confirm button on Two-Factor Auth section on account page")
    public void verifyUserAbleToViewCancelAndConfirmButtonOnTwoFactorAuthSectionOnAccountPage() {
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());
        Assert.assertTrue("Verify mobile number button is not visible", myAccount.is_Verify_Mobile_Number_Button());

    }

    @And("Verify SMS should disabled state for Two-Factor Authorization popup on account page")
    public void verifySMSShouldDisabledStateForTwoFactorAuthorizationPopupOnAccountPage() {
        Assert.assertTrue("SMS option is enabled", myAccount.is_SMS_Option_Disabled());
    }

    @When("User click on cancel button on Two-Factor Auth section on account page")
    public void userClickOnCancelButtonOnTwoFactorAuthSectionOnAccountPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @Then("Verify user should be successfully redirected to My Account")
    public void verifyUserShouldBeSuccessfullyRedirectedToMyAccount() {
        Assert.assertFalse("Two factor popup is visible", myAccount.is_Two_Factor_Popup_Visible());
    }

    @Then("Verify Email should displayed as selected for Two-Factor Authorization popup on account page")
    public void verifyEmailShouldDisplayedAsSelectedForTwoFactorAuthorizationPopupOnAccountPage() {
        Assert.assertTrue("Email checkbox is not selected", myAccount.is_Email_Checkbox_Selected());
    }

    @Then("Verify mobile number should be autofill on mobile number popup on account page")
    public void verifyMobileNumberShouldBeAutofillOnMobileNumberPopupOnAccountPage() {
        Assert.assertFalse("Mobile number field is empty", myAccount.get_Mobile_Number_Value().isEmpty());
    }

    @And("Verify that city should auto fill field which are included in the address displayed in drop down")
    public void verifyThatCityShouldAutoFillFieldWhichAreIncludedInTheAddressDisplayedInDropDown() {
        Assert.assertFalse("City input field is empty", kycPage.get_City_Value().isEmpty());
    }

    @And("Verify that zip code should auto fill field which are included in the address displayed in drop down")
    public void verifyThatZipCodeShouldAutoFillFieldWhichAreIncludedInTheAddressDisplayedInDropDown() {
        Assert.assertFalse("City input field is empty", kycPage.get_City_Value().isEmpty());
    }

    @Then("Verify that state should auto fill field which are included in the address displayed in drop down")
    public void verifyThatStateShouldAutoFillFieldWhichAreIncludedInTheAddressDisplayedInDropDown() {
        Assert.assertFalse("State input field is empty", kycPage.get_State_Value().isEmpty());

    }

    @Then("Verify account recovery method should not visible if KYC is not completed on account page")
    public void verifyAccountRecoveryMethodShouldNotVisibleIfKYCIsNotCompletedOnAccountPage() {
        Assert.assertFalse("Account recovery is visible", myAccount.is_Account_Recovery_Update_Btn_Visible());
    }

    @Then("Verify Input should accepted without any validation message if Confirm New Password is entered same as New Password")
    public void verifyInputShouldAcceptedWithoutAnyValidationMessageIfConfirmNewPasswordIsEnteredSameAsNewPassword() {
        Assert.assertFalse("Validation message is displayed", myAccount.verify_Password_Not_Match_Validation());
    }

    @And("Verify user able to view cancel and update method btn on Two-Factor Auth section on account page")
    public void verifyUserAbleToViewCancelAndUpdateMethodBtnOnTwoFactorAuthSectionOnAccountPage() {
        Assert.assertTrue("Update button is not visible", myAccount.is_Update_Method_Btn_Visible());
        Assert.assertTrue("Cancel button is not visible", myAccount.is_cancel_Btn_Visible());

    }
}

