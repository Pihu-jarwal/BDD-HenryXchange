package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.*;

import java.text.ParseException;

public class SellShareSteps {

    MarketPlace page = new MarketPlace();

    AgreementPage agreementPage = new AgreementPage();

    PropertyDetailPage propertyPage = new PropertyDetailPage();

    PortfolioPage portfolioPage = new PortfolioPage();

    SellSharePage sellShare = new SellSharePage();

    @When("User view the investment text on portfolio page")
    public void userViewTheInvestmentTextOnPortfolioPage() {
        portfolioPage.verify_View_Investment_Text();
    }

    @Then("click on Sell button on portfolio page")
    public void clickOnSellButtonOnPortfolioPage() {
        portfolioPage.click_On_Sell_Button();
    }

    @Then("User click on invested property on market page")
    public void userClickOnInvestedPropertyOnMarketPage() {
        page.clicks_On_Asset_Name();
    }

    @When("User click on sell button over your investment section on property detail page")
    public void userClickOnSellButtonOverYourInvestmentSectionOnPropertyDetailPage() {
        propertyPage.click_On_Sell_Button_Property_Detail_Page();
    }

    @And("User is navigate on sell share page")
    public void userIsNavigateOnSellSharePage() {
        Assert.assertEquals("Actual and expected values are not equal", "Sell Shares", sellShare.verify_Sell_Share_Page());
    }

    @And("User able to view custom tab holder on sell share page")
    public void userAbleToViewCustomTabHolderOnSellSharePage() {
        sellShare.verify_Segmented_Tab_Holder();
    }

    @Then("User able to view the current listed list on sell share page")
    public void userAbleToViewTheCurrentListedListOnSellSharePage() {
        sellShare.verify_Current_Listed_List();
    }

    @When("User click on recent sales tab on sell share page")
    public void userClickOnRecentSalesTabOnSellSharePage() {
        sellShare.click_On_Recent_Sale_List_Tab();
    }

    @Then("User able to view the recent sale list on sell share page")
    public void userAbleToViewTheRecentSaleListOnSellSharePage() {
        sellShare.verify_Recent_Sale_List();
    }

    @And("User views the share price text field on sell share page")
    public void userViewsTheSharePriceTextFieldOnSellSharePage() {
        sellShare.view_Share_Price_Text_Field();
    }

    @When("User enters a numeric value {string} in the share price field on sell share page")
    public void userEntersANumericValueInTheSharePriceFieldOnSellSharePage(String numericValue) {
        sellShare.enters_Numeric_Value_In_Share_Price_Field(numericValue);
    }

    @Then("User view numeric value is visible in the text field on sell share page")
    public void userViewNumericValueIsVisibleInTheTextFieldOnSellSharePage() {
        sellShare.numeric_Value_Is_Visible_In_Text_Field();
    }

    @When("User enters an alphabetic value {string} in the share price field on sell share page")
    public void userEntersAnAlphabeticValueInTheSharePriceFieldOnSellSharePage(String alphaValue) {
        sellShare.enters_Alphabetic_Value_In_Share_Price_Field(alphaValue);
    }

    @Then("User view alphabetic value is not visible in the text field on sell share page")
    public void userViewAlphabeticValueIsNotVisibleInTheTextFieldOnSellSharePage() {
        sellShare.alphabeticValueIsNotVisibleInTextField();
    }

    @When("User enters a special character value {string} in the share price field on sell share page")
    public void userEntersASpecialCharacterValueInTheSharePriceFieldOnSellSharePage(String specialCharacter) {
        sellShare.enters_Special_Character_Value_In_Share_Price_Field(specialCharacter);
    }

    @Then("User view special character value is not visible in the text field on sell share page")
    public void userViewSpecialCharacterValueIsNotVisibleInTheTextFieldOnSellSharePage() {
        sellShare.special_Character_Value_Is_Not_Visible_In_TextField();
    }

    @When("User press the space bar in the share price field on sell share page")
    public void userPressTheSpaceBarInTheSharePriceFieldOnSellSharePage() {
        sellShare.press_SpaceBar_In_Share_Price_Field();
    }

    @Then("User view space bar input is not visible in the text field on sell share page")
    public void userViewSpaceBarInputIsNotVisibleInTheTextFieldOnSellSharePage() {
        sellShare.press_Space_Bar_Input_Is_Not_Visible_In_Text_Field();
    }

    @When("User enters {string} as input in the share price field on sell share page")
    public void userEntersAsInputInTheSharePriceFieldOnSellSharePage(String input) {
        sellShare.entersZeroAsInputInSharePriceField(input);
    }

    @Then("User view Continue button should not be active on sell share page")
    public void userViewContinueButtonShouldNotBeActiveOnSellSharePage() {
        sellShare.continue_Button_Should_Not_Be_Active();
    }

    @When("User enters a numeric value less than market estimate in the share price field on sell share page")
    public void userEntersANumericValueLessThanMarketEstimateInTheSharePriceFieldOnSellSharePage() {
        sellShare.enters_Numeric_Value_In_Share_Price_Field_Less_Than_Market_Price();
    }

    @And("User enters value in {string} # of Shares text field on sell share page")
    public void userEntersValueInOfSharesTextFieldOnSellSharePage(String numericValue) {
        sellShare.enters_Numeric_Value_In_Shares_Field(numericValue);
    }

    @Then("User able to view updated gross amount value when user provide input sell share price and share on sell share page")
    public void userAbleToViewUpdatedGrossAmountValueWhenUserProvideInputSellSharePriceAndShareOnSellSharePage() {
        Assert.assertFalse(sellShare.view_Updated_Gross_Amount().isEmpty());

    }

    @When("User able to clicks on continue button on sell share page")
    public void userAbleToClicksOnContinueButtonOnSellSharePage() {
        sellShare.clicks_On_Continue_Button();
    }

    @Then("User is navigate verify your identity popup on sell share page")
    public void userIsNavigateVerifyYourIdentityPopupOnSellSharePage() {
        Assert.assertTrue("Verify your identity popup is not visible ", sellShare.verify_your_Identity_Popup());
    }

    @When("User enters a numeric value ten percent less than market estimate in the share price field on sell share page")
    public void userEntersANumericValueTenPercentLessThanMarketEstimateInTheSharePriceFieldOnSellSharePage() {
        sellShare.enters_Numeric_Value_In_Share_Price_Field_Ten_Percent_Less_Than_Market_Price();
    }

    @And("User click on # of Shares text field on sell share page")
    public void userClickOnOfSharesTextFieldOnSellSharePage() {
        sellShare.click_On_Share_Text_Field();
    }

    @Then("User able to view low pricing warning on sell share page")
    public void userAbleToViewLowPricingWarningOnSellSharePage() {
        Assert.assertFalse(sellShare.view_Low_Price_Warning().isEmpty());
    }

    @When("User enters a numeric value higher than market estimate in the share price field on sell share page")
    public void userEntersANumericValueHigherThanMarketEstimateInTheSharePriceFieldOnSellSharePage() {
        sellShare.enters_Numeric_Value_In_Share_Price_Field_Higher_Than_Market_Price();
    }

    @When("User click on property detail over breadcrumbs on sell order page")
    public void userClickOnPropertyDetailOverBreadcrumbsOnSellOrderPage() {
        propertyPage.click_On_Property_Detail_Over_Breadcrumbs();
    }

    @When("User click on market over breadcrumbs on market page")
    public void userClickOnMarketOverBreadcrumbsOnMarketPage() {
        page.click_On_Market_Over_Breadcrumbs();
    }

    @And("User click on portfolio over the breadcrumbs on sell share page")
    public void userClickOnPortfolioOverTheBreadcrumbsOnSellSharePage() {
        portfolioPage.click_On_Portfolio_Over_Breadcrumbs();
    }


    @When("User enters a numeric value {string} in the shares field on sell share page")
    public void userEntersANumericValueInTheSharesFieldOnSellSharePage(String numericValue) {
        sellShare.enters_Numeric_Value_In_Shares_Field(numericValue);
    }

    @Then("User view numeric value is visible in the share text field on sell share page")
    public void userViewNumericValueIsVisibleInTheShareTextFieldOnSellSharePage() {
        sellShare.numeric_Value_Is_Visible_In_Shares_Text_Field();
    }

    @When("User enters an alphabetic value {string} in the shares field on sell share page")
    public void userEntersAnAlphabeticValueInTheSharesFieldOnSellSharePage(String alphaValue) {
        sellShare.enters_Alphabetic_Value_In_Shares_Field(alphaValue);
    }

    @Then("User view alphabetic value is not visible in the share text field on sell share page")
    public void userViewAlphabeticValueIsNotVisibleInTheShareTextFieldOnSellSharePage() {
        Assert.assertTrue("Share Text field is not empty", sellShare.alphabeticValueIsNotVisibleInSharesTextField().isEmpty());
    }


    @When("User enters a special character value {string} in the shares field on sell share page")
    public void userEntersASpecialCharacterValueInTheSharesFieldOnSellSharePage(String specialCharacter) {
        sellShare.enters_Special_Character_Value_In_Shares_Text_Field(specialCharacter);
    }

    @Then("User view special character value is not visible in the share text field on sell share page")
    public void userViewSpecialCharacterValueIsNotVisibleInTheShareTextFieldOnSellSharePage() {
        Assert.assertTrue("Share Text field is not empty", sellShare.special_Character_Value_Is_Not_Visible_In_Shares_Text_Field().isEmpty());
    }

    @When("User press the space bar in the shares field on sell share page")
    public void userPressTheSpaceBarInTheSharesFieldOnSellSharePage() {
        sellShare.press_SpaceBar_In_Shares_Text_Field();
    }

    @Then("User view space bar input is not visible in the share text field on sell share page")
    public void userViewSpaceBarInputIsNotVisibleInTheShareTextFieldOnSellSharePage() {
        Assert.assertTrue("Share Text field is not empty", sellShare.press_Space_Bar_Input_Is_Not_Visible_In_Shares_Text_Field().isEmpty());
    }

    @When("User set number of share count {string} as input in the shares field on sell share page")
    public void userSetNumberOfShareCountAsInputInTheSharesFieldOnSellSharePage(String input) {
        sellShare.entersZeroAsInputInSharesTextField(input);
    }

    @When("User set number of share count {string} more than the share hold by shareholder on sell share page")
    public void userSetNumberOfShareCountMoreThanTheShareHoldByShareholderOnSellSharePage(String input) {
        sellShare.set_Number_Of_Share_Count_More_Than_Share_Hold_By_Shareholder(input);
    }

    @Then("User able to view Can't Exceed Amount Owned Warning msg on sell share page")
    public void userAbleToViewCanTExceedAmountOwnedWarningMsgOnSellSharePage() {
        Assert.assertTrue("Can’t Exceed Amount Owned warning msg is not displayed", sellShare.cannot_Exceed_Amount_Owned_Warning());
    }

    @And("User enter input as {string} in between shares Hold by shareholder on sell share page")
    public void userEnterInputAsInBetweenSharesHoldByShareholderOnSellSharePage(String input) {
        sellShare.enter_Between_Shares_Hold_By_Shareholder(input);
    }

    @Then("User able to view fees calculation on sell order page")
    public void userAbleToViewFeesCalculationOnSellOrderPage() {
        sellShare.view_Fees_Calculation();
    }

    @Then("User able to view net amount to you calculation on sell order page")
    public void userAbleToViewNetAmountToYouCalculationOnSellOrderPage() {
        sellShare.view_Net_Amount_To_You_Calculation();
    }

    @Then("User able to view two factor method verification pop-up on sell share page")
    public void userAbleToViewTwoFactorMethodVerificationPopUpOnSellSharePage() {
        Assert.assertTrue("Two factor method verification pop-up on sell share page is not visible ", sellShare.view_Two_Factor_Method_Verification_Popup());
    }

    @And("User able to view text choose the verification method to verify your identity on two factor popup in sell share page")
    public void userAbleToViewTextChooseTheVerificationMethodToVerifyYourIdentityOnTwoFactorPopupInSellSharePage() {
        sellShare.view_Placeholder_Text_Choose_Verification_Method_To_Verify_Your_Identity();
        Assert.assertEquals("Choose the verification method to verify your identity. msg is mismatch on two factor popup in sell share page", "Choose the verification method to verify your identity.", sellShare.view_Placeholder_Text_Choose_Verification_Method_To_Verify_Your_Identity());
    }

    @And("User able to view SMS text message is by-default selected on two factor popup in sell share page")
    public void userAbleToViewSMSTextMessageIsByDefaultSelectedOnTwoFactorPopupInSellSharePage() {
        Assert.assertFalse("Sms option is not default selected on two factor popup", sellShare.view_SMS_Text_Message_By_Default_Selected());
    }

    @And("User able to view SMS text message option with provided mobile number on two factor popup in sell share page")
    public void userAbleToViewSMSTextMessageOptionWithProvidedMobileNumberOnTwoFactorPopupInSellSharePage() {
        Assert.assertTrue("View SMS text message option with provided mobile number on two factor popup in sell share page is not visible ", sellShare.view_SMS_Text_Message_Option_With_Provided_Mobile_Number());
    }

    @And("User able to view email option with provided email address on two factor popup in sell share page")
    public void userAbleToViewEmailOptionWithProvidedEmailAddressOnTwoFactorPopupInSellSharePage() {
        Assert.assertTrue("View email option with provided email address on two factor popup in sell share page is not visible ", sellShare.view_Email_Option_With_Provided_Email_Address());
    }

    @And("User able to view cancel button on two factor popup in sell share page")
    public void userAbleToViewCancelButtonOnTwoFactorPopupInSellSharePage() {
        Assert.assertTrue("Cancel button is not visible on two factor popup", sellShare.view_Cancel_Button_Text());
    }

    @And("User able to view confirm button on two factor popup in sell share page")
    public void userAbleToViewConfirmButtonOnTwoFactorPopupInSellSharePage() {
        Assert.assertTrue("Confirm button is not visible on two factor popup", sellShare.view_Confirm_Button_Text());
    }

    @When("User click on email option on two factor popup on sell share page")
    public void userClickOnEmailOptionOnTwoFactorPopupOnSellSharePage() {
        sellShare.click_On_Email_Option();
    }

    @Then("User able to view email option is selected on two factor popup on sell share page")
    public void userAbleToViewEmailOptionIsSelectedOnTwoFactorPopupOnSellSharePage() {
        Assert.assertFalse("Email option is not selected on two factor popup", sellShare.view_Email_Option_Selected());
    }

    @When("User click on SMS text option on two factor popup in sell share page")
    public void userClickOnSMSTextOptionOnTwoFactorPopupInSellSharePage() {
        sellShare.click_On_SMS_Text_Option();
    }

    @Then("User able to view SMS Text option is selected on two factor popup on sell share page")
    public void userAbleToViewSMSTextOptionIsSelectedOnTwoFactorPopupOnSellSharePage() {
        sellShare.view_SMS_Text_Option_Selected();
    }

    @When("User click on cancel button on two factor popup on sell share page")
    public void userClickOnCancelButtonOnTwoFactorPopupOnSellSharePage() {
        sellShare.click_On_Cancel_Button();
    }

    @Then("User able to stay in same page Portfolio - on Sell shares page")
    public void userAbleToStayInSamePagePortfolioOnSellSharesPage() {
        Assert.assertEquals("Actual and expected values are not equal", "Sell Shares", sellShare.verify_Sell_Share_Page());
    }

    @When("User clicks on confirm button on two factor popup on sell share page")
    public void userClicksOnConfirmButtonOnTwoFactorPopupOnSellSharePage() {
        sellShare.click_On_Confirm_Button();
    }

    @Then("User able to view Two Factor Auth Verification Pop-up on sell share page")
    public void userAbleToViewTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertTrue("Two Factor Auth Verification Pop-up on sell share page is not visible ", sellShare.view_Two_Factor_Auth_Verification_Popup());
    }

    @When("User click outside the pop-up on sell share page")
    public void userClickOutsideThePopUpOnSellSharePage() {
        sellShare.click_Outside_The_Popup();
    }

    @And("User able to view SMS text option is deselected on two factor popup on sell share page")
    public void userAbleToViewSMSTextOptionIsDeselectedOnTwoFactorPopupOnSellSharePage() {
        Assert.assertFalse("Sms option is not deselected on two factor popup", sellShare.view_SMS_Text_Option_Deselected());
    }

    @Then("User able to view email option is deselected on two factor popup on sell share page")
    public void userAbleToViewEmailOptionIsDeselectedOnTwoFactorPopupOnSellSharePage() {
        Assert.assertFalse("Email option is not deselected on two factor popup", sellShare.view_Email_Option_Deselected());
    }

    @Then("User able to view text please confirm your identity to complete this action on two factor auth verification popup on sell share page")
    public void userAbleToViewTextPleaseConfirmYourIdentityToCompleteThisActionOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("Please confirm your identity to complete this action.", sellShare.verify_Text_Please_Confirm_Your_Identity_Complete_This_Action());
    }

    @And("User able to view SMS text message sent on two factor auth verification popup on sell share page")
    public void userAbleToViewSMSTextMessageSentOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("SMS Text Message Sent", sellShare.verify_View_SMS_Text_Message_Sent());
    }

    @And("User able to view text please enter the six digit code sent to the number ending in XXXX on two factor auth verification popup on sell share page")
    public void userAbleToViewTextPleaseEnterTheSixDigitCodeSentToTheNumberEndingInXXXXOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("Please enter the 6-digit code sent to the number ending in 0770.", sellShare.verify_View_Please_Enter_6_Digit_Code_Sent_Number_Ending_XXXX());
    }

    @And("User able to view six digit code input field on two factor auth verification popup on sell share page")
    public void userAbleToViewSixDigitCodeInputFieldOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertTrue("6 digit code input field is not displayed on two factor auth verification popup", sellShare.verify_View_6_Digit_Code_Input_Field());
    }

    @And("User able to view confirm code button on two factor auth verification popup on sell share page")
    public void userAbleToViewConfirmCodeButtonOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertTrue("Confirm code button is not displayed on two factor auth verification popup", sellShare.verify_View_Confirm_Code_Button());
    }

    @And("User able to view text Didn't receive it? Resend code link on two factor auth verification popup on sell share page")
    public void userAbleToViewTextDidnTReceiveItResendCodeLinkOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("Didn’t receive it? Resend code", sellShare.verify_View_DidNot_Receive_It());
    }

    @And("User able to view text use another method on two factor auth verification popup on sell share page")
    public void userAbleToViewTextUseAnotherMethodOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("Use another method", sellShare.verify_View_Use_Another_Method());
    }

    @And("User able to view text OTP Sent on two factor auth verification popup on sell share page on two factor auth verification popup on sell share page")
    public void userAbleToViewTextOTPSentOnTwoFactorAuthVerificationPopupOnSellSharePageOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("OTP Sent", sellShare.verify_View_Otp_Sent());
    }

    @And("User able to view text Please enter the code sent to your email in order to verify your identity on two factor auth verification popup on sell share page")
    public void userAbleToViewTextPleaseEnterTheCodeSentToYourEmailInOrderToVerifyYourIdentityOnTwoFactorAuthVerificationPopupOnSellSharePage() {
        Assert.assertEquals("Please enter the code sent to your email in order to verify your identity.", sellShare.verify_View_Please_Enter_Code_Sent_Your_Email_Order_To_Verify_Your_Identity());
    }

    @And("User enter the valid code {string} in otp box two factor auth verification pop-up for SMS on sell share page")
    public void userEnterTheValidCodeInOtpBoxTwoFactorAuthVerificationPopUpForSMSOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Valid_6Digit_Code(otpPin);
    }

    @And("User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page")
    public void userClicksOnConfirmCodeButtonOnTwoFactorAuthVerificationPopUpForSMSOnSellSharePage() {
        sellShare.clicks_On_Confirm_Code_Button();
    }

    @Then("User should be able to view ID verified pop-up on sell share page")
    public void userShouldBeAbleToViewIDVerifiedPopUpOnSellSharePage() {
        Assert.assertTrue("Id verified popup is not visible ", sellShare.view_Id_verified_Popup());
    }

    @And("User enter the one to five digit numeric code {string} two factor auth verification pop-up on sell share page")
    public void userEnterTheOneToFiveDigitNumericCodeTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.enter_The_One_To_Five_Digit_Numeric_Code(otpPin);
    }

    @Then("User able to view confirm code button is disabled two factor auth verification pop-up on sell share page")
    public void userAbleToViewConfirmCodeButtonIsDisabledTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertFalse("Email button is displayed ", sellShare.view_Confirm_Code_Button_Disabled());
    }

    @When("User enter the alphabetic code {string} in otp box two factor auth verification pop-up on sell share page")
    public void userEnterTheAlphabeticCodeInOtpBoxTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Alphabetic_Code(otpPin);
    }

    @Then("Verify User should not be able to enter Alphabetic code two factor auth verification pop-up on sell share page")
    public void verifyUserShouldNotBeAbleToEnterAlphabeticCodeTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertFalse("", sellShare.getOtpPin());
    }

    @When("User enter the special Character code {string} in otp box two factor auth verification pop-up on sell share page")
    public void userEnterTheSpecialCharacterCodeInOtpBoxTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Special_Character_Code(otpPin);
    }

    @Then("Verify User should not be able to enter Special character code two factor auth verification pop-up on sell share page")
    public void verifyUserShouldNotBeAbleToEnterSpecialCharacterCodeTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertFalse("", sellShare.getOtpPin());
    }

    @When("User enter the wrong code {string} in otp box two factor auth verification pop-up on sell share page")
    public void userEnterTheWrongCodeInOtpBoxTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Wrong_Otp_Code(otpPin);
    }

    @Then("User view the error msg on two factor auth verification pop-up on sell share page")
    public void userViewTheErrorMsgOnTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertTrue("Wrong otp error msg is not displayed ", sellShare.view_Wrong_Otp_Error_Msg());
    }


    @Then("User should be able to view error message on two factor auth verification pop-up on sell share page")
    public void userShouldBeAbleToViewErrorMessageOnTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertEquals("Wrong error message is displayed", "The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your email/SMS", sellShare.verify_User_Should_View_Wrong_Error_Message());
    }

    @When("User first attempt enter wrong code {string} in otp box on two factor auth verification pop-up on sell share page")
    public void userFirstAttemptEnterWrongCodeInOtpBoxOnTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Wrong_Otp_Code(otpPin);
    }

    @And("User Second attempt enter wrong code {string} in otp box on two factor auth verification pop-up on sell share page")
    public void userSecondAttemptEnterWrongCodeInOtpBoxOnTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Wrong_Otp_Code(otpPin);
    }

    @And("User third attempt enter wrong code {string} in otp box on two factor auth verification pop-up on sell share page")
    public void userThirdAttemptEnterWrongCodeInOtpBoxOnTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Wrong_Otp_Code(otpPin);
    }

    @And("User try to attempt fourth time enter wrong code {string} in otp box on two factor auth verification pop-up on sell share page")
    public void userTryToAttemptFourthTimeEnterWrongCodeInOtpBoxOnTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.delete_otp_In_Boxes();
        sellShare.enter_Wrong_Otp_Code(otpPin);
    }

    @Then("Verify User able to view error message on two factor auth verification pop-up on sell share page")
    public void verifyUserAbleToViewErrorMessageOnTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertEquals("Verification failed due to more than three (3) attempts, please try again", sellShare.verify_User_Should_View_Wrong_Error_Message());
    }

    @And("User able to clicks on cross icon on two factor auth verification pop-up for SMS on sell share page")
    public void userAbleToClicksOnCrossIconOnTwoFactorAuthVerificationPopUpForSMSOnSellSharePage() {
        sellShare.click_On_Cross_Icon_On_Two_Factor_Auth_Verification_Popup();
    }

    @And("User clicks on resend code link on two factor auth verification pop-up on sell share page")
    public void userClicksOnResendCodeLinkOnTwoFactorAuthVerificationPopUpOnSellSharePage() {
        sellShare.click_On_Resend_Code_Link();
    }

    @And("Verify User able to view toast msg code resent successfully on two factor auth verification pop-up on sell share page")
    public void verifyUserAbleToViewToastMsgCodeResentSuccessfullyOnTwoFactorAuthVerificationPopUpOnSellSharePage() {
        Assert.assertEquals("Code resent successfully!", sellShare.view_Toast_Msg_To_Check_The_Functionality_Resend_Code_Link());
    }

    @Then("Verify User able to enter third wrong otp {string} again on two factor auth verification pop-up on sell share page")
    public void verifyUserAbleToEnterThirdWrongOtpAgainOnTwoFactorAuthVerificationPopUpOnSellSharePage(String otpPin) {
        sellShare.verify_User_Able_To_Enter_Three_Times_Wrong_OTP(otpPin);
    }

    @And("User clicks on use another method link on two factor popup on sell share page")
    public void userClicksOnUseAnotherMethodLinkOnTwoFactorPopupOnSellSharePage() {
        sellShare.click_On_Use_Another_Method_Link();
    }

    @Then("User able to navigate to Two factor Method Pop-up on sell share page")
    public void userAbleToNavigateToTwoFactorMethodPopUpOnSellSharePage() {
        Assert.assertEquals("Choose the verification method to verify your identity.", sellShare.navigate_To_Two_Factor_Method_PopUp());
    }

    @And("User able to view Previously selected option on Two factor Method Pop-up on sell share page")
    public void userAbleToViewPreviouslySelectedOptionOnTwoFactorMethodPopUpOnSellSharePage() {
        String previouslySelectedOption = "SMS (Text Message)";
        Assert.assertEquals("Previously selected option should be displayed", previouslySelectedOption, sellShare.view_Previously_Selected_Option());
    }

    @And("User able to select another method on Two factor Method Pop-up on sell share page")
    public void userAbleToSelectAnotherMethodOnTwoFactorMethodPopUpOnSellSharePage() {
        Assert.assertFalse("Another option is not selected on two factor popup", sellShare.click_On_Another_Method());
    }

    @And("User able to view header: ID verified on ID verified popup on sell share page")
    public void userAbleToViewHeaderIDVerifiedOnIDVerifiedPopupOnSellSharePage() {
        Assert.assertEquals(" ID verified text should be displayed", "ID Verified", sellShare.view_Header_Id_Verified_Text());
    }

    @And("User able to Sub-text: Your ID has been verified and your sell order has been submitted. on ID verified popup on sell share page")
    public void userAbleToSubTextYourIDHasBeenVerifiedAndYourSellOrderHasBeenSubmittedOnIDVerifiedPopupOnSellSharePage() {
        Assert.assertEquals("Your ID has been verified and your sell order has been submitted is displayed on ID verified popup on sell share page ", "Your ID has been verified and your sell order has been submitted", sellShare.view_Your_ID_Verified_And_Your_Sell_Order_Has_Been_Submitted());
    }

    @And("User able to view cross icon at right top on ID verified popup on sell share page")
    public void userAbleToViewCrossIconAtRightTopOnIDVerifiedPopupOnSellSharePage() {
        Assert.assertTrue("Cross icon is not displayed ", sellShare.view_Cross_Icon());
    }

    @And("User clicks on cross icon on ID verified pop-up for SMS on sell share page")
    public void userClicksOnCrossIconOnIDVerifiedPopUpForSMSOnSellSharePage() {
        sellShare.click_On_Cross_Icon_On_Id_Verified_Popup();
    }

    @Then("User should be able to navigate on agree to terms page to sell shares")
    public void userShouldBeAbleToNavigateOnAgreeToTermsPageToSellShares() {
        Assert.assertTrue("Agree to terms popup is not displayed", sellShare.verify_Agree_To_Terms_Popup());
    }

    @And("User clicks outside the popup on on ID verified pop-up for SMS on sell share page")
    public void userClicksOutsideThePopupOnOnIDVerifiedPopUpForSMSOnSellSharePage() {
        sellShare.click_Outside_The_Popup();
    }

    @And("User able to click on close button on agree to terms popup on sell share page")
    public void userAbleToClickOnCloseButtonOnAgreeToTermsPopupOnSellSharePage() {
        sellShare.click_On_Close_Agree_To_Terms_Popup();
    }


    @Then("User should be able to view ID Verification is auto closed in three Sec on sell share page")
    public void userShouldBeAbleToViewIDVerificationIsAutoClosedInThreeSecOnSellSharePage() {
        Assert.assertTrue("ID Verification pop-up is not visible", sellShare.view_Id_verified_Popup());
        Assert.assertTrue("ID Verification pop-up should not be auto-close in 3 seconds", sellShare.isIdVerificationPopupAutoClosed());
    }


    @Then("User able to view Sell Share page with {string} Loader right of Segment tabs on sell share page")
    public void userAbleToViewSellSharePageWithLoaderRightOfSegmentTabsOnSellSharePage(String preparingContract) {
        Assert.assertEquals("Preparing contract loader is not displayed", preparingContract, sellShare.view_Preparing_Contract_Loader());
    }

    @And("User able to view placeholder text: agree to terms as {string} on agree to terms Pop-up on sell share page")
    public void userAbleToViewPlaceholderTextAgreeToTermsAsOnAgreeToTermsPopUpOnSellSharePage(String text) {
        Assert.assertEquals("Agree to terms text is not displayed", text, sellShare.view_Agree_To_Terms_Text());
    }

    @And("User able to view property name on agree to terms Pop-up on sell share page")
    public void userAbleViewToPropertyNameOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Property name is not displayed",sellShare.view_Property_Name());
    }

    @And("User able to view agreement description on agree to terms Pop-up on sell share page")
    public void userAbleToViewAgreementDescriptionOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Agreement description is not displayed", sellShare.view_AgreementDescription());
    }

    @And("User able to view enter your initials field on agree to terms Pop-up on sell share page")
    public void userAbleToViewEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Enter your initials field is not displayed", sellShare.view_Enter_Your_Initials_Field());
    }

    @And("User able to view agree and continue button on agree to terms Pop-up on sell share page")
    public void userAbleToViewAgreeAndContinueButtonOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Agree and continue button is not displayed", sellShare.view_Agree_And_Continue_Button());
    }

    @And("User able to view download button on agree to terms Pop-up on sell share page")
    public void userAbleToViewDownloadButtonOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Download button is not displayed", sellShare.view_Download_Button());
    }

    @And("User able to view cross icon at right top on agree to terms Pop-up on sell share page")
    public void userAbleToViewCrossIconAtRightTopOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Cross icon is not displayed at right top ", sellShare.view_Cross_Icon_At_Right_Top());
    }

    @Then("User able to view enter your initials button active on agree to terms Pop-up on sell share page")
    public void userAbleToViewEnterYourInitialsButtonActiveOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue(" Enter initials button is not active ", sellShare.is_Enter_Initials_Button_Active());
    }


    @And("User enter input {string} and only allow Caps alpha character in field on agree to terms page to sell shares")
    public void userEnterInputAndOnlyAllowCapsAlphaCharacterInFieldOnAgreeToTermsPageToSellShares(String initials) {
        sellShare.enter_Initials(initials);
        Assert.assertTrue("The entered initials are not contain uppercase alpha characters.", sellShare.get_Entered_Initials().matches("[A-Z]+"));
    }

    @And("User enter minimum two and maximum three character allowed in field on agree to terms page to sell shares")
    public void userEnterMinimumTwoAndMaximumThreeCharacterAllowedInFieldOnAgreeToTermsPageToSellShares() {
        Assert.assertTrue("The entered initials does not contain minimum two and max three characters or alpha characters.", sellShare.initials_Should_Contain_Two_To_Three_Alpha_Characters());
    }


    @And("User enter the character should match the first letter of the First name Middle name Last name on agree to terms page to sell shares")
    public void userEnterTheCharacterShouldMatchTheFirstLetterOfTheFirstNameMiddleNameLastNameOnAgreeToTermsPageToSellShares() {
        Assert.assertTrue("Enter character should not match the first letter of the First name Middle name Last name  ", sellShare.validate_Profile_First_Last_Name());
    }

    @When("User enter numeric digit {string} in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterNumericDigitInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage(String initials) {
        sellShare.enter_Initials(initials);
    }

    @Then("User is not able to allowed to enter numeric digit in enter your initials field on agree to terms Pop-up on sell share page")
    public void userIsNotAbleToAllowedToEnterNumericDigitInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Initial value is not empty", sellShare.entered_Initials_Should_Not_Contain_Numeric_Digits().isEmpty());
    }

    @When("User enter special character {string} in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterSpecialCharacterInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage(String initials) {
        sellShare.enter_Initials(initials);
    }

    @Then("User is not able to allowed to special character in enter your initials field on agree to terms Pop-up on sell share page")
    public void userIsNotAbleToAllowedToSpecialCharacterInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Initial value is not empty", sellShare.entered_Initials_Should_Not_Contain_Special_Character().isEmpty());
    }

    @When("User enter lower case alpha character {string} in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterLowerCaseAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage(String initials) {
        sellShare.enter_Initials(initials);
    }

    @Then("User are able to view upper case character in enter your initials field on agree to terms Pop-up on sell share page")
    public void userAreAbleToViewUpperCaseCharacterInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("The lowercase alphabets should be changed to uppercase characters.", sellShare.verify_LowerCase_Alphabets_Should_Be_Changed_To_Uppercase_Characters());
    }

    @When("User enter space in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterSpaceInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        sellShare.press_SpaceBar_In_Enter_Your_Initials_Field();
    }

    @Then("User is not able to allowed to enter space in enter your initials field on agree to terms Pop-up on sell share page")
    public void userIsNotAbleToAllowedToEnterSpaceInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Initial value is not empty", sellShare.press_Space_Bar_Input_Is_Not_Allowed_In_Enter_Your_Initials_Field().isEmpty());
    }

    @When("User enter wrong input {string} in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterWrongInputInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage(String initials) {
        sellShare.enter_Initials(initials);
    }

    @And("User clicks on agree and continue button on agree to terms Pop-up on sell share page")
    public void userClicksOnAgreeAndContinueButtonOnAgreeToTermsPopUpOnSellSharePage() {
        sellShare.click_On_Agree_To_Continue_Button();
    }

    @Then("User is able to view error message below the enter your initials field on agree to terms Pop-up on sell share page")
    public void userIsAbleToViewErrorMessageBelowTheEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertTrue("Sell share page is not displayed ", sellShare.view_Error_Msg_Below_Enter_Your_Initials());
    }

    @And("User able to view error message below the enter your initials field on agree to terms Pop-up on sell share page")
    public void userAbleToViewErrorMessageBelowTheEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage() {
        Assert.assertEquals("Your initials must match with the name you used to verify your ID.", sellShare.verify_Error_Msg_Below_Enter_Your_Initials());
    }


    @When("User enter valid input {string} in enter your initials field on agree to terms Pop-up on sell share page")
    public void userEnterValidInputInEnterYourInitialsFieldOnAgreeToTermsPopUpOnSellSharePage(String initials) {
        sellShare.enter_Initials(initials);
    }

    @Then("User should be able to navigate to Sell order submitted page")
    public void userShouldBeAbleToNavigateToSellOrderSubmittedPage() {
        Assert.assertTrue("Sell share page is not displayed ", sellShare.navigate_To_Sell_Submitted_Page());
    }

    @Then("User clicks on cross icon over agree to terms page to sell shares")
    public void userClicksOnCrossIconOverAgreeToTermsPageToSellShares() {
        sellShare.clicks_On_Cross_Icon_Agree_To_Terms_Page();
    }

    @Then("User should able to view popup will disappear on sell share page")
    public void userShouldAbleToViewPopupWillDisappearOnSellSharePage() {
        Assert.assertTrue("Agree to terms popup did not closed", sellShare.verify_Agree_To_Terms_Popup_Close_Functionality());
    }

    @Then("User able to view breadcrumbs on sell order submitted page")
    public void userAbleToViewBreadcrumbsOnSellOrderSubmittedPage() {
        Assert.assertTrue("Breadcrumbs is not displayed ", sellShare.verify_Breadcrumbs_Sell_Submitted_Page());
    }

    @And("User able to view header: Sell Order Submitted on sell order submitted page")
    public void userAbleToViewHeaderSellOrderSubmittedOnSellOrderSubmittedPage() {
        Assert.assertEquals("Sell Order Submitted", sellShare.verify_Header_Sell_Order_Submitted_Text());
    }

    @And("User able to view asset name on sell order submitted page")
    public void userAbleToViewAssetNameOnSellOrderSubmittedPage() {
        Assert.assertEquals("Asset name is not displayed ", "Oakwood Sarasota", sellShare.verify_Asset_Name_Sell_Order_Submitted());
    }

    @And("user able to view net amount to You on sell order submitted page")
    public void userAbleToViewNetAmountToYouOnSellOrderSubmittedPage() {
        sellShare.verify_NetAmount_To_You_Sell_Order_Submitted();
    }

    @And("User able to view Share Price on sell order submitted page")
    public void userAbleToViewSharePriceOnSellOrderSubmittedPage() {
        Assert.assertTrue("Share price is not displayed ", sellShare.verify_Share_Price_Sell_Order_Submitted());
    }

    @And("User able to view Number of Shares on sell order submitted page")
    public void userAbleToViewNumberOfSharesOnSellOrderSubmittedPage() {
        Assert.assertTrue("Number of shares is not displayed ", sellShare.verify_Number_Of_Shares_Sell_Order_Submitted());
    }

    @And("User able to view Total Amount on sell order submitted page")
    public void userAbleToViewTotalAmountOnSellOrderSubmittedPage() {
        sellShare.verify_Total_Amount_Sell_Order_Submitted();
    }

    @And("User able to view Gross Price on sell order submitted page")
    public void userAbleToViewGrossPriceOnSellOrderSubmittedPage() {
        sellShare.verify_Gross_Price_Sell_Order_Submitted();
    }

    @And("User able to view Fees on sell order submitted page")
    public void userAbleToViewFeesOnSellOrderSubmittedPage() {
        sellShare.verify_Fees_Sell_Order_Submitted();
    }

    @And("User able to view Portfolio button on sell order submitted page")
    public void userAbleToViewPortfolioButtonOnSellOrderSubmittedPage() {
        Assert.assertTrue("View portfolio button is not displayed ", sellShare.verify_View_Portfolio_Btn_Sell_Order_Submitted());
    }

    @When("User clicks on view Portfolio button on sell order submitted page")
    public void userClicksOnViewPortfolioButtonOnSellOrderSubmittedPage() {
        sellShare.clicks_On_View_Portfolio_Button_Sell_Order_Submitted();
    }

    @Then("User able to view Agreement in My agreement page")
    public void userAbleToViewAgreementInMyAgreementPage() {
        Assert.assertTrue("Property name is not matching ", agreementPage.validate_Property_Name_On_Agreement_Page());
    }

    @When("User clicks on market tab on portfolio page")
    public void userClicksOnMarketTabOnPortfolioPage() {
        portfolioPage.click_On_Market_Tab();
    }

    @When("User clicks on asset card on market page")
    public void userClicksOnAssetCardOnMarketPage() {
        page.clicks_On_Asset_Name(); }

    @And("User view the header open orders with count on property detail page")
    public void userViewTheHeaderOpenOrdersWithCountOnPropertyDetailPage() {
        propertyPage.view_Open_Order_With_count();
    }

    @And("User view the table which contain type , # OF SHARES , SHARE PRICE , FEE, TOTAL and manage on property detail page")
    public void userViewTheTableWhichContainTypeOFSHARESSHAREPRICEFEETOTALAndManageOnPropertyDetailPage() {
        propertyPage.view_Open_Order_Table_Content();
    }

    @When("User clicks on manage in open order on property detail page")
    public void userClicksOnManageInOpenOrderOnPropertyDetailPage() {
        propertyPage.click_On_Manage_Open_Order_Table();
    }

    @And("User view the your investment section contains total investment, total shares in the property, view transactions, sell button on property detail page")
    public void userViewTheYourInvestmentSectionContainsTotalInvestmentTotalSharesInThePropertyViewTransactionsSellButtonOnPropertyDetailPage() {
        Assert.assertEquals("Your investment text is not displayed in your investment section ","Your Investment", propertyPage.view_Your_Investment_Section());
        Assert.assertTrue("View total investment is not displayed in your investment section ", propertyPage.view_Total_Investment_In_Your_Investment_Section());
        Assert.assertTrue("View total shares is not displayed in your investment section ", propertyPage.view_Total_Shares_In_The_Property_In_Your_Investment_Section());
        Assert.assertEquals("View transactions is not displayed in your investment section ", "View Transactions", propertyPage.view_Transactions_In_Your_Investment_Section());
        Assert.assertTrue("sell Button is not displayed in your investment section ", propertyPage.view_Sell_Button_In_Your_Investment_Section());
    }

    @When("User able to click on view transaction in your investment on property detail page")
    public void userAbleToClickOnViewTransactionInYourInvestmentOnPropertyDetailPage() {
        propertyPage.click_On_View_Transaction();
    }

    @When("User clicks on cancel button over sell orders table on portfolio page")
    public void userClicksOnCancelButtonOverSellOrdersTableOnPortfolioPage() {
        portfolioPage.click_On_Cancel_Button_Sell_Order();
    }

    @Then("User should able to view cancel sell order popup on portfolio page")
    public void userShouldAbleToViewCancelSellOrderPopupOnPortfolioPage() {
        Assert.assertTrue("cancel order popup is not displayed ", portfolioPage.verify_Cancel_Order_Popup());
    }

    @And("User able to view header Withdraw sell order for property name on cancel sell order popup in portfolio page")
    public void userAbleToViewHeaderWithdrawSellOrderForPropertyNameOnCancelSellOrderPopupInPortfolioPage() {
        Assert.assertTrue(" Header text is not displayed in cancel order popup ", portfolioPage.view_Header_Text_On_Cancel_Order_Popup());
    }

    @And("User able to view subtext Your shares will be removed from the market place on cancel sell order popup in portfolio page")
    public void userAbleToViewSubtextYourSharesWillBeRemovedFromTheMarketPlaceOnCancelSellOrderPopupInPortfolioPage() {
        Assert.assertEquals("Your shares will be removed from the marketplace.", portfolioPage.view_SubText_On_Cancel_Order_Popup());
    }

    @And("User able to view Return to Portfolio button on cancel sell order popup in portfolio page")
    public void userAbleToViewReturnToPortfolioButtonOnCancelSellOrderPopupInPortfolioPage() {
        Assert.assertTrue(" Return to Portfolio button is not displayed in cancel order popup ", portfolioPage.view_Return_To_Portfolio_Button_On_Cancel_Order_Popup());
    }

    @And("User able to view Yes, Withdraw button on cancel sell order popup in portfolio page")
    public void userAbleToViewYesWithdrawButtonOnCancelSellOrderPopupInPortfolioPage() {
        Assert.assertTrue(" Yes, Withdraw button is not displayed in cancel order popup ", portfolioPage.view_Yes_Withdraw_Button_On_Cancel_Order_Popup());
    }

    @When("User clicks on return to portfolio button on cancel sell order popup in portfolio page")
    public void userClicksOnReturnToPortfolioButtonOnCancelSellOrderPopupInPortfolioPage() {
        portfolioPage.click_On_Return_To_Portfolio_Button_On_Cancel_Order_Popup();
    }

    @And("Verify user view the cancel sell order popup is closed")
    public void verifyUserViewTheCancelSellOrderPopupIsClosed() {
        Assert.assertFalse(portfolioPage.verify_Return_To_Portfolio_Btn_Functionality());
    }

    @And("User clicks on yes withdraw button on cancel sell order popup in portfolio page")
    public void userClicksOnYesWithdrawButtonOnCancelSellOrderPopupInPortfolioPage() {
        portfolioPage.click_On_Yes_Withdraw_Button_On_Cancel_Order_Popup();
    }

    @Then("User able to view toast msg Your Sell Order has been successfully canceled on portfolio page")
    public void userAbleToViewToastMsgYourSellOrderHasBeenSuccessfullyCanceledOnPortfolioPage() {
        Assert.assertEquals("Your Sell Order has been successfully canceled", portfolioPage.view_Toast_Msg_Sell_Order_Cancelled());
    }

    @And("User clicks outside the cancel sell order popup in portfolio page")
    public void userClicksOutsideTheCancelSellOrderPopupInPortfolioPage() {
        portfolioPage.click_Outside_Cancel_Sell_Order_Popup();
    }

    @Then("click on invest property Sell button on portfolio page")
    public void clickOnInvestPropertySellButtonOnPortfolioPage() {
        portfolioPage.click_On_Invest_Property_Sell_Button();
    }


    @When("User does hover on tooltip of property name on sell share page")
    public void userDoesHoverOnTooltipOfPropertyNameOnSellSharePage() {
        sellShare.click_On_Tooltip_Of_Property_Name_Tooltip();
    }

    @Then("Verify user should be able to view full property name as shown in design on sell share page")
    public void verifyUserShouldBeAbleToViewFullPropertyNameAsShownInDesignOnSellSharePage() {
        Assert.assertTrue("Property name tooltip data is not visible", sellShare.verify_Tooltip_Of_Property_Name());
    }

    @When("User does hover on tooltip of market estimate on sell share page")
    public void userDoesHoverOnTooltipOfMarketEstimateOnSellSharePage() {
        sellShare.click_On_Tooltip_Of_Market_Estimate_Tooltip();
    }

    @Then("Verify User should be able to view market estimate description on sell share page")
    public void verifyUserShouldBeAbleToViewMarketEstimateDescriptionOnSellSharePage() {
        Assert.assertTrue("Market estimation tooltip data is not visible", sellShare.verify_Tooltip_Of_Market_Estimate_Description());
    }

    @And("User able to view sell order count before canceled sell order on portfolio page")
    public void userAbleToViewSellOrderCountBeforeCanceledSellOrderOnPortfolioPage() {
        portfolioPage.view_Sell_Order_List_Before_Cancel_Sell_Order();
    }

    @And("Verify user able to view the Shares are no longer listed for sale on the Exchange")
    public void verifyUserAbleToViewTheSharesAreNoLongerListedForSaleOnTheExchange() {
        portfolioPage.validate_Sell_Order_Canceled();
    }

    @Then("User able to view breadcrumb on sell share page")
    public void userAbleToViewBreadcrumbOnSellSharePage() {
        sellShare.verify_Sell_Share_Page();
    }

    @And("User able to view placeholder Text: Sell Shares is displayed on sell share page")
    public void userAbleToViewPlaceholderTextSellSharesIsDisplayedOnSellSharePage() {
        sellShare.verify_PlaceHolder_Text();
    }

    @And("User able to view investment Details card is displayed with the following details like thumbnail image, property name, total shares, average share cost and total value on sell share page")
    public void userAbleToViewInvestmentDetailsCardIsDisplayedWithTheFollowingDetailsLikeThumbnailImagePropertyNameTotalSharesAverageShareCostAndTotalValueOnSellSharePage() {
        sellShare.verify_Investment_Section();
        sellShare.verify_Thumbnail_Image_In_Investment_Section();
        sellShare.verify_Property_Name_In_Investment_Section();
        sellShare.verify_Total_Shares_And_Value_In_Investment_Section();
        sellShare.verify_Average_Share_Cost_In_Investment_Section();
        sellShare.verify_Average_Share_Cost_Value_In_Investment_Section();
        Assert.assertNotNull("Total value is null ", sellShare.verify_Total_Value_In_Investment_Section());
        sellShare.verify_Total_Value_Text_In_Investment_Section();
    }

    @And("User able to view segmented Tabs are displayed with two tabs on sell share page")
    public void userAbleToViewSegmentedTabsAreDisplayedWithTwoTabsOnSellSharePage() {
        sellShare.verify_Segmented_Tab_Holder();
    }

    @And("User able to view currently Listed tab is displayed with four listed shares and their details")
    public void userAbleToViewCurrentlyListedTabIsDisplayedWithFourListedSharesAndTheirDetails() {
        sellShare.verify_Current_Listed_List();
    }

    @And("User able to view recent Sales tab is displayed with four recent sales and their details")
    public void userAbleToViewRecentSalesTabIsDisplayedWithFourRecentSalesAndTheirDetails() {
        sellShare.verify_Recent_Sale_List();
    }

    @And("User able to view gross sale amount in sell order table on sell share page")
    public void userAbleToViewGrossSaleAmountInSellOrderTableOnSellSharePage() throws ParseException {
        sellShare.verify_Gross_Sale_Amount_Value();
    }

    @And("User able to view the following details like oracle icon, estimated share price, Market estimated link in sell order table on sell share page")
    public void userAbleToViewTheFollowingDetailsLikeOracleIconEstimatedSharePriceMarketEstimatedLinkInSellOrderTableOnSellSharePage() {
        Assert.assertEquals("Gross sale amount text is mismatch ", "Gross Sale Amount", sellShare.verify_Gross_Sale_Amount_In_Sell_Order_Table());
        sellShare.verify_Gross_Sale_Amount_And_Oracle_Icon_And_Market_Estimate_And_Estimate_Price_Sell_Order_Table();
    }

    @And("User able to view share price field name, share price text field in sell order table on sell share page")
    public void userAbleToViewSharePriceFieldNameSharePriceTextFieldInSellOrderTableOnSellSharePage() {
        sellShare.verify_Share_Price_Field_Name_And_Text_Field();
    }

    @And("user able to view  # of Shares Field name with actual holding share count, # of Shares Text field in sell order table on sell share page")
    public void userAbleToViewOfSharesFieldNameWithActualHoldingShareCountOfSharesTextFieldInSellOrderTableOnSellSharePage() {
        sellShare.verify_Hash_Of_Share_Field_Name_And_Text_Field();
    }

    @And("User able to view fees , Net Amount to You, and Continue button in sell order table on sell share page")
    public void userAbleToViewFeesNetAmountToYouAndContinueButtonInSellOrderTableOnSellSharePage() {
        sellShare.verify_Fees_And_Net_Amount_To_You_Text();
        sellShare.view_Fees_Calculation();
        sellShare.view_Net_Amount_To_You_Calculation();
        Assert.assertTrue("Continue button is not visible",  sellShare.verify_Continue_Button_On_Sell_Share_Page());
    }


    @When("User enters asset name {string} in search field on market page")
    public void userEntersAssetNameInSearchFieldOnMarketPage(String propertyName) {
        page.Enter_Asset_Name_In_Search_Field(propertyName);
    }

    @When("click on Sell button no shares sold for their property on portfolio page")
    public void clickOnSellButtonNoSharesSoldForTheirPropertyOnPortfolioPage() {
        portfolioPage.click_On_Sell_Button_No_Shares_Sold_In_Property();
    }

    @And("User Should be not able to view Currently Listed list on sell share page")
    public void userShouldBeNotAbleToViewCurrentlyListedListOnSellSharePage() {
        Assert.assertTrue(" Currently Listed list is not visible ",sellShare.verify_Not_Able_To_View_Currently_Listed_List());
    }

    @And("User Should be not able to view Recent Sales List on sell share page")
    public void userShouldBeNotAbleToViewRecentSalesListOnSellSharePage() {
        Assert.assertTrue("Recently Listed list is not display",sellShare.verify_Not_Able_To_View_Recently_Listed_List());
    }
}
