package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.BuySharePage;
import org.xchange.pom.KycPage;
import utils.Helper;
import utils.PropertiesUtil;

public class KycPageSteps extends Helper {

    KycPage kycPage = new KycPage();
    BuySharePage buySharePage = new BuySharePage();

    @And("Verify user should be able to navigate to KYC Step 1 page")
    public void verifyUserShouldBeAbleToNavigateToKYCStep1Page() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("URL") + "account" + "/kyc", kycPage.get_Current_Url());
    }

    @When("User clicks on Account setup from the header on kyc page")
    public void userClicksOnAccountSetupFromTheHeader() {
        kycPage.click_On_Account_Setup();
    }

    @And("User scroll down to financials and documents section on property detail page")
    public void userScrollDownToFinancialsAndDocumentsSectionOnPropertyDetailPage() {
        kycPage.click_On_Financials();
    }


    @And("User clicks on complete your account setup option on property detail page")
    public void userClicksOnCompleteYourAccountSetupOptionOnPropertyDetailPage() {
        kycPage.click_On_Complete_Your_Account_Setup();
    }

    @And("User clicks on verify Identity on account dropdown on kyc page")
    public void userClicksOnVerifyIdentityOnAccountDropdownOnKycPage() {
        kycPage.click_On_Verify_Identity();
    }


    @Then("Basic information will be green ticket on kyc page")
    public void basicInformationWillBeGreenTicketOnKycPage() {
        Assert.assertTrue("basic information is not visible", kycPage.verify_Basic_Information());
    }

    @And("Verify Identity It will be highlighted as I am currently on it on kyc page")
    public void verifyIdentityItWillBeHighlightedAsIAmCurrentlyOnItOnKycPage() {
        Assert.assertTrue("", kycPage.verify_Identity_On_Kyc_Page());
    }

    @And("Verify add investor profile, link external account, deposit funds are disabled on kyc page")
    public void verifyAddInvestorProfileLinkExternalAccountDepositFundsAreDisabledOnKycPage() {
        Assert.assertTrue("Add investor is not disabled", kycPage.verify_Add_Investor_Profile());
        Assert.assertTrue("Link external account is not disabled", kycPage.verify_Disable_Link_External_Account());
        Assert.assertTrue("Deposit funds is not disabled", kycPage.verify_Disable_Deposit_Funds());
    }

    @And("User clicks on do this later button on kyc page")
    public void userClicksOnDoThisLaterButtonOnKycPage() {
        kycPage.click_On_Do_This_Later();
    }

    @And("User clicks on do this later button on Are you sure want to exit popup on kyc page")
    public void userClicksOnDoThisLaterButtonOnAreYouSureWantToExitPopupOnKycPage() {
        kycPage.click_On_Do_This_Later_Btn();
    }

    @Then("User should be successfully redirected to Marketplace page with 20% completed Account setup")
    public void userShouldBeSuccessfullyRedirectedToMarketplacePageWithCompletedAccountSetupShouldKeepOnDisplaying() {
        Assert.assertEquals("Actual and expected are mismatched", PropertiesUtil.getEnvironmentKey("URL") + "market", kycPage.get_Current_URL());
        Assert.assertEquals("20" + "%" + " Completed", kycPage.verify_Account_SetUp_Percent());
    }

    @And("Verify residential address field should be mandatory on kyc page")
    public void verifyResidentialAddressFieldIsMandatoryOnKycPage() {
        Assert.assertTrue("Residential field is not mandatory", kycPage.verify_Residential_Mandatory_Field());
    }

    @Then("Verify mobile number field should be mandatory on kyc page")
    public void verifyMobileNumberFieldIsMandatoryOnKycPage() {
        Assert.assertTrue("Mobile number field is not mandatory", kycPage.verify_Mobile_Number_Mandatory_Field());
    }

    @And("Verify city field should be mandatory on kyc page")
    public void verifyCityFieldIsMandatoryOnKycPage() {
   }

    @And("Verify zipcode field should be mandatory on kyc page")
    public void verifyZipcodeFieldIsMandatoryOnKycPage() {
        Assert.assertTrue("Zipcode field is not mandatory", kycPage.verify_Zipcode_Input_Field_Mandatory());
    }

    @And("Verify state field should be mandatory on kyc page")
    public void verifyStateFieldIsMandatoryOnKycPage() {
        Assert.assertTrue("State field is not mandatory", kycPage.verify_state_Input_Field_Mandatory());
    }

    @And("Verify continue button should remain in the disabled state until all the mandatory details are not filled")
    public void verifyContinueButtonShouldRemainInTheDisabledStateUntilAllTheMandatoryDetailsAreNotFilled() {
        Assert.assertFalse("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @And("User clicks on mobile number field on kyc page")
    public void userClicksOnMobileNumberFieldOnKycPage() {
        kycPage.click_On_Mobile_Number_Field();
    }

    @And("User clicks on residential address on kyc page")
    public void userClicksOnResidentialAddressOnKycPage() {
        kycPage.click_On_Residential_Input_Field();
    }

    @When("User clicks on state input field on kyc page")
    public void userClicksOnResidentialInputFieldOnKycPage() {
        kycPage.click_On_State_Input_Field();
    }

    @And("User clicks on zip code input field on kyc page")
    public void userClicksOnZipCodeOnKycPage() {
        kycPage.click_On_Zipcode_Input_Field();
    }

    @When("User clicks on city field on kyc page")
    public void userClicksOnCityFieldOnKycPage() {
        kycPage.click_On_city_Input_Field();
    }

    @And("User clicks on continue button on kyc page")
    public void userClicksOnContinueButtonOnKycPage() {
        kycPage.click_On_Continue_Btn();
    }

    @And("Verify system should accept valid 10-digit Mobile number format as XXX-XXX-XXXX on kyc page")
    public void verifySystemShouldAcceptValidDigitMobileNumberFormatAsXXXXXXXXXXOnKcPage() {
        Assert.assertTrue("Mobile number does not contains 10 digit", kycPage.get_Mobile_Number());
    }

    @When("User enter {string} digit mobile number in mobile input field on kyc page")
    public void user_enter_digit_mobile_number_in_mobile_input_field_on_kyc_page(String mobileNumber) {
        kycPage.enter_Mobile_Number_In_Input_Field(mobileNumber);
    }

    @And("Verify number {string} hyphen should be automatically included between the numbers on kyc page")
    public void verifyHyphenShouldBeAutomaticallyIncludedBetweenTheNumbersOnKycPage(String mobileNumber) {
        Assert.assertNotEquals(kycPage.enter_Mobile_Number_In_Input_Field(mobileNumber), kycPage.get_Mobile_Number_From_Mobile_Field());
    }

    @Then("User should able to view error message when enters less than 10 digit mobile number in input field")
    public void userShouldAbleToViewErrorMessageWhenEntersLessThanDigitMobileNumberInInputField() {
        Assert.assertEquals("Please ensure a valid 10-digit phone number is entered.", kycPage.validate_Error_Msg());
    }

    @Then("Verify error message should be displayed on entering existing Mobile number on kyc page")
    public void verifyErrorMessageShouldBeDisplayedOnEnteringExistingMobileNumberOnKycPage() {
        Assert.assertEquals("This mobile number is already associated with another account.", kycPage.validate_Error_Msg());
    }

    @Then("Verify error message should be displayed on entering invalid Mobile number on kyc page")
    public void verifyErrorMessageShouldBeDisplayedOnEnteringInvalidMobileNumberOnKycPage() {
        Assert.assertEquals("This is not a valid mobile number", kycPage.validate_Error_Msg());
    }

    @And("User enter address {string} in residential address input field on kyc page")
    public void userEntersAddressInResidentialAddressInputFieldOnKycPage(String address) {
        kycPage.enters_Address_In_Residential_Field(address);
    }

    @Then("Verify continue button will remain disabled if invalid value is included in input field on kyc page")
    public void verifyContinueButtonWillRemainDisabledIfInvalidMobileNumberIsIncludedInTheMobileNumberField() {
        Assert.assertFalse("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @Then("Verify that enter address matched with dropdown value on kyc page")
    public void verifyItShouldDisplayAllTheAddressIncludingTerraceDriveInTheAddressDropdownOnKycPage() {
        String addressInputFieldValue = kycPage.get_Residential_Address_Value();
        String addressSuggestionValue = kycPage.verify_Suggestion_Of_Address_Dropdown();
        Assert.assertEquals("Actual and expected are not matched", addressInputFieldValue, addressSuggestionValue);
    }

    @And("User click on address from address dropdown on kyc page")
    public void userClickOnAddressFromAddressDropdownOnKycPage() {
        kycPage.click_On_Residential_Dropdown_Value();
    }

    @Then("Verify that should auto fill all fields which are included in the address displayed in drop down")
    public void verifyThatShouldAutoFillAllFieldsWhichAreIncludedInTheAddressDisplayedInDropDown() {
        Assert.assertFalse("City input field is empty", kycPage.get_City_Value().isEmpty());
        Assert.assertFalse("Zipcode input field is empty", kycPage.get_Zip_Code_Value().isEmpty());
        Assert.assertFalse("State input field is empty", kycPage.get_State_Value().isEmpty());
    }

    @Then("User type less than 3 characters no drop down will appear in residential field on kyc page")
    public void userTypeLessThanCharactersNoDropDownWillAppearInResidentialFieldOnKycPage() {
        Assert.assertFalse("Address dropdown is visible", kycPage.is_Address_Dropdown_Visible());
    }

    @When("User remove address from address field on kyc page")
    public void userRemoveAddressFromAddressFieldOnKycPage() {
        kycPage.remove_Address_In_Address_Field();
    }

    @Then("Verify no options should appear if a address entered is not having any suggestion on kyc page")
    public void verifyNoOptionsShouldAppearIfAAddressEnteredIsNotHavingAnySuggestionOnKycPage() {
        Assert.assertTrue("Error msg is not visible", kycPage.is_Valid_Error_Msg_Visible());
    }

    @When("User should be able to edit the city successfully and add another city on kyc page")
    public void userShouldBeAbleToEditTheCitySuccessfullyAndAddAnotherCityOnKycPage() {
        String previousValueOfCity = kycPage.get_City_Value();
        kycPage.remove_City_From_City_Field();
        String anotherValueOfCity = kycPage.get_City_Value();
        Assert.assertNotEquals("Previous and another value of city are same", previousValueOfCity, anotherValueOfCity);
    }

    @Then("Verify city should be auto filled when user selects address from drop down on kyc page")
    public void verifyCityShouldBeAutoFilledWhenUserSelectsAddressFromDropDownOnKycPage() {
        Assert.assertFalse("City input field is empty", kycPage.get_City_Value().isEmpty());
    }

    @And("User should be able to edit the city as {string} successfully and add another city on kyc page")
    public void userShouldBeAbleToEditTheCityAsSuccessfullyAndAddAnotherCityOnKycPage(String cityName) {
        String previousValueOfCity = kycPage.get_City_Value();
        kycPage.remove_City_From_City_Field();
        kycPage.enter_City_Name_In_Input_Field(cityName);
        String anotherValueOfCity = kycPage.get_City_Value();
        Assert.assertNotEquals("Previous and another value of city are same", previousValueOfCity, anotherValueOfCity);
    }

    @And("Verify continue button should remain disabled if City field is left blank on kyc page")
    public void verifyContinueButtonShouldRemainDisabledIfCityFieldIsLeftBlankOnKycPage() {
        Assert.assertFalse("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @And("Verify valid US numbers should be accepted other than Non- VOIP landlines or temporary number on kyc page")
    public void verifyValidUSNumbersShouldBeAcceptedOtherThanNonVOIPLandlinesOrTemporaryNumberOnKycPage() {
        Assert.assertEquals("Validation message is not visible", "VOIP, landlines, or any temporary mobile are not accepted", kycPage.get_Voip_Landline_Validation_Msg());
    }

    @Then("Verify zip code should be auto filled when user selects address from drop down on kyc page")
    public void verifyZipCodeShouldBeAutoFilledWhenUserSelectsAddressFromDropDownOnKycPage() {
        Assert.assertFalse("Zipcode input field is empty", kycPage.get_Zip_Code_Value().isEmpty());
    }

    @And("User should be able to edit the zipcode as {string} successfully and add another city on kyc page")
    public void userShouldBeAbleToEditTheZipcodeAsSuccessfullyAndAddAnotherCityOnKycPage(String zipcode) {
        String previousValueOfZipCode = kycPage.get_Zip_Code_Value();
        kycPage.remove_Zipcode_In_ZipCode_Field();
        kycPage.enter_Zip_Code_In_Input_Field(zipcode);
        String anotherValueOfZipcode = kycPage.get_Zip_Code_Value();
        Assert.assertNotEquals("Previous and another zipcode value are same", previousValueOfZipCode, anotherValueOfZipcode);
    }

    @When("User can enter zip code {string} in input field on kyc page")
    public void userCanEnterZipCodeInInputFieldOnKycPage(String zipCode) {
        kycPage.enter_Zip_Code_In_Input_Field(zipCode);
    }

    @Then("Verify zip code filled in input field on kyc page")
    public void verifyZipCodeFilledInInputFieldOnKycPage() {
        Assert.assertFalse("Zipcode value is empty", kycPage.get_Zip_Code_Value().isEmpty());
    }

    @When("Verify valid 5 digit zip Code in field matching with city and State on kyc page")
    public void verifyValidDigitZipCodeInFieldMatchingWithCityAndStateOnKycPage() {
        Assert.assertTrue("Zipcode is less and greater than 5", kycPage.get_Zip_Code_Value().length() == 5);
    }

    @And("Verify continue button should remain disabled if Zip Code field is left blank on kyc page")
    public void verifyContinueButtonShouldRemainDisabledIfZipCodeFieldIsLeftBlankOnKycPage() {
        Assert.assertFalse("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @Then("Verify Apt, Suite is not mandatory field on kyc page")
    public void verifyAptSuiteIsNotMandatoryFieldOnKycPage() {
        Assert.assertEquals("Apt suite is not optional", "Apt, Suite (Optional)", kycPage.verify_Apt_Suite_Optional());
    }

    @Then("Verify Apt, Suite should not auto filled when user selects suggested address on kyc page")
    public void verifyAptSuiteShouldNotAutoFilledWhenUserSelectsSuggestedAddressOnKycPage() {
        Assert.assertTrue("Apt suite field is not empty", kycPage.get_Apt_Suite_Value());
    }

    @And("Verify No impact will be observed on continue button even if Apt,Suite field is left blank on kyc page")
    public void verifyNoImpactWillBeObservedOnContinueButtonEvenIfAptSuiteFieldIsLeftBlankOnKycPage() {
        Assert.assertTrue("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @Then("Verify continue button should remain in disabled if all mandatory fields are unfilled on kyc page")
    public void verifyContinueButtonShouldRemainInDisabledIfAllMandatoryFieldsAreUnfilledOnKycPage() {
        Assert.assertFalse("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @Then("verify continue button should be enabled if all valid details are filled in mandatory fields")
    public void verifyContinueButtonShouldBeEnabledIfAllValidDetailsAreFilledInMandatoryFields() {
        Assert.assertTrue("Continue button is enabled", kycPage.validate_Continue_Btn());
    }

    @And("User enter city name {string} in input field on kyc page")
    public void userEnterCityNameInInputFieldOnKycPage(String cityNAme) {
        kycPage.enter_City_Name_In_Input_Field(cityNAme);
    }

    @And("User enter state name {string} in input field on kyc page")
    public void userEnterStateNameInInputFieldOnKycPage(String stateName) {
        kycPage.enter_State_Name_In_Input_Field(stateName);
    }

    @Then("Verify user should be redirected to the exit pop-up on kyc page")
    public void verifyUserShouldBeRedirectedToTheExitPopupOnKycPage() {
        Assert.assertEquals("Popup is not visible", "Are you sure you want to exit set-up?", kycPage.verify_Exit_Popup());
    }

    @And("User should be able to view UI of exit popup like placeholder name on kyc page")
    public void userShouldBeAbleToViewUIOfExitPopupOnKycPage() {
        Assert.assertEquals("Property and investment details will be limited if you don’t complete account set-up.", kycPage.verify_Placeholder_Text_On_Exit_Popup());
    }

    @And("Verify user able to view \"Do this later \"Return to verification\" buttons on kyc page")
    public void verifyUserAbleToViewDoThisLaterReturnToVerificationButtonsOnKycPage(String arg0) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }

    @And("Verify user able to view \"Do this later\" and \"Return to verification\" buttons on kyc page")
    public void verifyUserAbleToViewAndButtonsOnKycPage() {
        Assert.assertTrue("Return to verification button is not visible", kycPage.verify_return_To_Verification_Btn());
        Assert.assertTrue("Do this later btn is not visible", kycPage.verify_Do_This_Later_Btn());
    }

    @Then("User should be redirected to the Marketplace page")
    public void userShouldBeRedirectedToTheMarketplacePage() {
        Assert.assertEquals("Actual and expected are mismatched", PropertiesUtil.getEnvironmentKey("URL") + "market", kycPage.get_Current_Url());
    }

    @And("User click on return to verification button on exit popup on kyc page")
    public void userClickOnReturnToVerificationButtonOnExitPopupOnKycPage() {
        kycPage.click_On_Return_To_Verification_Button();
    }

    @And("User is on \"Did you mean\" address popup on kyc page")
    public void userIsOnAddressPopupOnKycPage() {
        Assert.assertTrue("Did you mean popup is not visible", kycPage.verify_Did_You_Mean_Popup());
    }

    @And("User click on confirm button on Did you mean popup on kyc page")
    public void userClickOnConfirmButtonOnDidYouMeanPopupOnKycPage() {
        kycPage.click_On_Confirm_Btn();
    }

    @Then("User should be redirected to OTP pop-up on kyc page")
    public void userShouldBeRedirectedToOTPPopUpOnKycPage() {
        Assert.assertTrue("OTP popup is not visible", kycPage.verify_OTP_Popup());
    }

    @And("Verify UI of OTP popup on kyc page like placeholder text, 6 box should appear")
    public void verifyUIOfOTPPopupOnKycPageLikePlaceholderTextBoxShouldAppear() {
        Assert.assertTrue("Placeholder text is not visible", kycPage.verify_Placeholder_Text_On_Otp_Popup());
        kycPage.is_Visible_6_Digit_OTP_Box();
    }

    @And("Verify resend code link, confirm code button on kyc page")
    public void verifyResendCodeLinkConfirmCodeButtonOnKycPage() {
        Assert.assertTrue("Confirm code button is not visible", kycPage.is_Confirm_Code_Btn_Visible());
        Assert.assertTrue("Resend button is not visible", kycPage.is_Resend_Btn_Visible());
    }

    @Then("Verify confirm Code button should be enabled if 6-digit code is entered on kyc page")
    public void verifyConfirmCodeButtonShouldBeEnabledIfDigitCodeIsEnteredOnKycPage() {
        Assert.assertTrue("Confirm button is disabled", kycPage.verify_Confirm_Code_Button());
    }

    @Then("Verify six 6 digit code you entered is incorrect on OTP popup on kyc page")
    public void verifySixDigitCodeYouEnteredIsIncorrectOnOTPPopupOnKycPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your SMS", kycPage.validate_Error_Msg_For_Invalid_OTP());
    }

    @Then("Verify user enters the invalid code third time on otp popup on kyc page")
    public void verifyUserEntersTheInvalidCodeThirdTimeOnOtpPopupOnKycPage() {
        Assert.assertEquals("Too many failed attempts. Please try again in 15 minutes", kycPage.validate_Too_Many_Attempts_Msg());
    }

    @And("^User enter 6-digit valid code (.+) in otp input field on kyc page$")
    public void userEnterDigitValidCodeInOtpInputFieldOnKycPage(String otp) {
        kycPage.enter_OTP_In_Otp_Field(otp);

    }

    @And("User click on confirm code button on OTP popup on kyc page")
    public void userClickOnConfirmCodeButtonOnOTPPopupOnKycPage() {
        kycPage.click_On_Confirm_Code_Btn();
    }

    @When("User remove code from otp box on OTP popup on kyc page")
    public void userRemovesCodeFromOtpBoxOnOTPPopupOnKycPage() {
        kycPage.remove_OTP_From_OTP_Field();
    }

    @When("User click on resend code link on OTP popup on kyc page")
    public void userClickOnResendCodeLinkOnOTPPopupOnKycPage() {
        kycPage.click_On_Resend_Code_Link();
    }

    @Then("Verify new code should be sent successfully")
    public void verifyNewCodeShouldBeSentSuccessfully() {
        Assert.assertEquals("Toast msg is not visible", "Code resent successfully!", kycPage.validate_Code_Send_Successfully());
    }

    @Then("User should be redirected to Mobile Number Verified Popup on kyc page")
    public void userShouldBeRedirectedToMobileNumberVerifiedPopupOnKycPage() {
        Assert.assertTrue("Mobile verified popup is not visible", kycPage.verify_Mobile_Verification_Popup());
    }

    @And("User should be able to view placeholder text on mobile verified popup on kyc page")
    public void userShouldBeAbleToViewPlaceholderTextOnMobileVerifiedPopupOnKycPage() {
        Assert.assertTrue("Placeholder text is not visible", kycPage.verify_Placeholder_Text());
    }

    @And("User should be redirected to Marketplace page successfully after {int} seconds")
    public void userShouldBeRedirectedToMarketplacePageSuccessfullyAfterSeconds(int min) {
        kycPage.waitForElementInMinutes(min);
        Assert.assertEquals("Actual and expected are mismatched", PropertiesUtil.getEnvironmentKey("URL") + "market", kycPage.get_Current_Url());
    }

    @When("User click on cross icon on mobile verified popup on kyc page")
    public void userClickOnCrossIconOnMobileVerifiedPopupOnKycPage() {
        buySharePage.click_On_Close_Icon();
    }

    @And("User will wait for {int} minutes on OTP popup on kyc page")
    public void userWillWaitForMinutesOnOTPPopupOnKycPage(int min) {
        kycPage.waitForElementInMinutes(min);
    }

    @Then("User should be able to view validation message on OTP popup on kyc page")
    public void userShouldBeAbleToViewValidationMessageOnOTPPopupOnKycPage() {
        Assert.assertEquals("Error message is not visible", "Code is invalid, one ( 1 ) attempt remaining", kycPage.verify_Code_Is_Invalid_Validation_Msg());
    }

    @And("^After 15-minutes if user re-enters (.+) invalid OTP on OTP popup on kyc page$")
    public void afterMinutesIfUserReEntersInvalidOTPOnOTPPopupOnKycPage(String otp) {
        kycPage.enter_OTP_In_Otp_Field(otp);
    }

    @And("User click on cross icon on OTP popup on kyc page")
    public void userClickOnCrossIconOnOTPPopupOnKycPage() {
        buySharePage.click_On_Close_Icon();
    }

    @Then("Verify user able to view KYC process disrupted error message on OTP popup on kyc page")
    public void verifyUserAbleToViewKYCProcessDisruptedErrorMessageOnOTPPopupOnKycPage() {
        Assert.assertEquals("Your KYC process has been disrupted due to invalid attempts; please try again in 8 hours.", kycPage.validate_Kyc_Process_Disrupted());
    }

    @Then("User should be redirected to Verify identity page with all fields filled and continue button active")
    public void userShouldBeRedirectedToVerifyIdentityPageWithAllFieldsFilledAndContinueButtonActive() {
        Assert.assertFalse("OTP popup is visible", kycPage.verify_OTP_Popup());
    }

    @Then("Verify confirm Code button should remain in the disabled form if less than 6-digit code is entered")
    public void verifyConfirmCodeButtonShouldRemainInTheDisabledFormIfLessThanDigitCodeIsEntered() {
        Assert.assertFalse("Confirm button is not disabled", kycPage.verify_Confirm_Code_Button());
    }

    @When("User will wait for {int} seconds on mobile verified popup on kyc page")
    public void userWillWaitForSecondsOnMobileVerifiedPopupOnKycPage(int second) {
        kycPage.waitForElement(second);
    }

    @When("User click on finish account setup link on account page")
    public void userClickOnFinishAccountSetupLinkOnAccountPage() {
        kycPage.click_On_Finish_Account_Setup();
    }

    @Then("User should be able to view drop down of account setup on kyc page")
    public void userShouldBeAbleToViewDropDownOfAccountSetupOnKycPage() {
        Assert.assertTrue("Account setup option is not visible", kycPage.is_Account_Set_Up_Option_Visible());
    }

    @Then("User should be able to view 20% completed with circle having only 20% on kyc page")
    public void userShouldBeAbleToViewCompletedWithCircleHavingOnlyOnKycPage() {
        Assert.assertEquals("Account did not complete 20%", "20" + "%" + " Completed", kycPage.verify_Account_SetUp_Percent());
    }


    @Then("User able to view 100% completed with circle having only 100% completed if KYC is completed")
    public void userAbleToViewCompletedWithCircleHavingOnlyCompletedIfKYCIsCompleted() {
        Assert.assertEquals("Account did not complete 100%", "100" + "%" + " Completed", kycPage.verify_Account_SetUp_Percent());
    }

    @Then("Verify error message when user enter invalid data in Zip Code field on kyc page")
    public void verifyErrorMessageWhenUserEnterInvalidDataInZipCodeFieldOnKycPage() {
        Assert.assertEquals("Error msg is not visible", "Please ensure a valid 5-digit zip code is entered", kycPage.get_Zip_Code_Validation_Msg());
    }

    @Then("Verify state should be auto filled when selects address on kyc page")
    public void veirfyStateShouldBeAutoFilledWhenSelectsAddressOnKycPage() {
        Assert.assertFalse("State field is empty", kycPage.get_State_Value().isEmpty());
    }

    @And("User should be able to edit state and select another state {string} on kyc page")
    public void userShouldBeAbleToEditStateAndSelectAnotherStateOnKycPage(String stateName) {
        String valueOfState = kycPage.get_State_Value();
        kycPage.enter_State_Name_In_Input_Field(stateName);
        String anotherValueOfState = kycPage.get_State_Value();
        Assert.assertNotEquals("Already added state and another both are same", valueOfState, anotherValueOfState);
    }

    @Then("Verify address selected is not having state included in address on kyc page")
    public void verifyAddressSelectedIsNotHavingStateIncludedInAddressOnKycPage() {
        Assert.assertTrue("State field is empty", kycPage.get_State_Value().isEmpty());
    }

    @Then("Verify state should be filled when enter state in input field on kyc page")
    public void verifyStateShouldBeFilledWhenEnterStateInInputFieldOnKycPage() {
        Assert.assertFalse("State field is empty", kycPage.get_State_Value().isEmpty());
    }

    @Then("verify timer should start with 14:59 for OTP on kyc page")
    public void verifyTimerShouldStartWithForOTPOnKycPage() {
        Assert.assertTrue("Timer is not visible", kycPage.get_Resend_Otp_Timer());
    }

    @And("User remove input field text {string} on kyc page")
    public void userRemoveInputFieldTextOnKycPage(String value) {
        remove_Text_Field_Data(value);
    }

}
