package org.xchange.stepDefs;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.xchange.pom.*;
import utils.Helper;
import utils.PropertiesUtil;

import java.util.List;

public class TransferAgentLoginSteps extends Helper {

    TransferAgentLoginPage transferAgentLoginPage = new TransferAgentLoginPage();

    portfolioYourSellOrderPage portfolioYourSellOrder = new portfolioYourSellOrderPage();

    LoginPage loginPage = new LoginPage();

    MyAccountPage myAccount = new MyAccountPage();

    KycPage kycPage = new KycPage();

    BuySharePage buySharePage = new BuySharePage();

    String temporaryPasswordValue = "";

    String paginationCount = "";

    String userEmail = "";

    @Given("User navigate to {string}")
    public void userNavigateTo(String url) {
        DriverFactory.getInstance().getOpenUrl(url);
    }

    @Then("Verify user should able to navigate to login page")
    public void verifyUserShouldAbleToNavigateToLoginPage() {
        Assert.assertEquals("Login page is not visible", "Log In", transferAgentLoginPage.is_Log_In_Page_Visible());
    }

    @And("Verify email field should visible on login page")
    public void verifyEmailFieldShouldVisibleOnLoginPage() {
        Assert.assertTrue("Email field is not visible", transferAgentLoginPage.is_Email_Field_Visible());
    }

    @And("Verify password field should visible on login page")
    public void verifyPasswordFieldShouldVisibleOnLoginPage() {
        Assert.assertTrue("Password field is not visible", transferAgentLoginPage.is_Password_Field_Visible());
    }

    @And("Verify enter button should visible on login page")
    public void verifyEnterButtonShouldVisibleOnLoginPage() {
        Assert.assertTrue("Enter button is not visible", transferAgentLoginPage.is_Enter_Btn_Visible());

    }

    @When("User enter email {string} in input field on login page")
    public void userEnterEmailInInputFieldOnLoginPage(String email) {
        transferAgentLoginPage.enter_Email_In_Input_Field(email);
    }

    @When("User click on email field on login page")
    public void userClickOnEmailFieldOnLoginPage() {
        transferAgentLoginPage.click_On_Email_input_Field();
    }

    @Then("Verify Error message should show {string} on login page")
    public void verifyErrorMessageShouldShowOnLoginPage(String emailRequired) {
        Assert.assertEquals("Error msg is not visible", emailRequired, loginPage.verify_Error_Message_Of_Email_Field());
    }

    @And("User enter password {string} in input field on login page")
    public void userEnterPasswordInInputFieldOnLoginPage(String password) {
        transferAgentLoginPage.enter_Password_In_Input_Field(password);
    }

    @Then("Verify account details are incorrect error message on login page")
    public void verifyAccountDetailsAreIncorrectErrorMessageOnLoginPage() {
        Assert.assertEquals("Account details are incorrect, please try again or contact your administrator", transferAgentLoginPage.is_Error_Msg_Visible());
    }

    @And("User click on enter button on login page")
    public void userClickOnEnterButtonOnLoginPage() {
        transferAgentLoginPage.click_On_Enter_Btn();
    }

    @Then("Verify Error message should show {string} below the password field on login page")
    public void verifyErrorMessageShouldShowBelowThePasswordFieldOnLoginPage(String passwordRequired) {
        Assert.assertEquals("Password is not required", passwordRequired, transferAgentLoginPage.get_Password_Error_Text());
    }

    @When("User click on password field on login page")
    public void userClickOnPasswordFieldOnLoginPage() {
        transferAgentLoginPage.click_On_Password_Field();
    }

    @Then("Verify passwords must contain at least 12 characters on login page")
    public void verifyPasswordsMustContainAtLeastCharactersOnLoginPage() {
        Assert.assertTrue("Enter button is disabled", transferAgentLoginPage.is_Enter_Btn_Enabled());
    }

    @Then("Verify account details are incorrect error message when user enter wrong password 1st time on login page")
    public void verifyAccountDetailsAreIncorrectErrorMessageWhenUserEnterWrongPasswordStTimeOnLoginPage() {
        Assert.assertEquals("Account details are incorrect, please try again or contact your administrator", transferAgentLoginPage.is_Error_Msg_Visible());
    }

    @Then("Verify account details are incorrect error message when user enter wrong password 2nd time on login page")
    public void verifyAccountDetailsAreIncorrectErrorMessageWhenUserEnterWrongPassword2ndTimeOnLoginPage() {
        Assert.assertEquals("Account details are incorrect, please try again or contact your administrator", transferAgentLoginPage.is_Error_Msg_Visible());
    }

    @Then("Verify Account locked popup should be visible when user enter 3rd time wrong password on login page")
    public void verifyAccountLockedPopupShouldBeVisibleWhenUserEnterRdTimeWrongPasswordOnLoginPage() {
        Assert.assertEquals("Account Locked", transferAgentLoginPage.verify_If_Blocked_User_Try_To_Login());
    }

    @Then("User should be able to view Account Locked pop-up closed automatically in {int} sec on login page")
    public void userShouldBeAbleToViewAccountLockedPopUpClosedAutomaticallyInSecOnLoginPage(int timer) {
        waitForElement(timer);
        Assert.assertFalse("Account popup is visible", transferAgentLoginPage.is_Account_Locked_Popup_Visible());
    }

    @And("User click on eye icon in password field on login page")
    public void userClickOnEyeIconInPasswordFieldOnLoginPage() {
        transferAgentLoginPage.click_On_Eye_Icon();
    }

    @Then("Verify eye icon should active in password field on login page")
    public void verifyEyeIconShouldActiveInPasswordFieldOnLoginPage() {
        Assert.assertTrue("Eye icon is not active", transferAgentLoginPage.is_Active_Eye_Icon());
    }

    @Then("Verify eye icon should inactive in password field on login page")
    public void verifyEyeIconShouldInactiveInPasswordFieldOnLoginPage() {
        Assert.assertTrue("Eye icon is active", transferAgentLoginPage.is_Inactive_Eye_Icon());
    }

    @Then("Verify user should be able to view Enter button disabled when input filled on login page")
    public void verifyUserShouldBeAbleToViewEnterButtonDisabledWhenInputFilledOnLoginPage() {
        Assert.assertFalse("Enter button is enabled", transferAgentLoginPage.is_Enter_Btn_Enabled());
    }

    @Then("Verify user should able to navigate to OTP page")
    public void verifyUserShouldAbleToNavigateToOTPPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "authenticate", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @And("User enter otp {string} in input field on OTP page")
    public void userEnterOtpInInputFieldOnOTPPage(String otp) {
        buySharePage.set_OTP(otp);

    }

    @And("User click on confirm code button on OTP verify page")
    public void userClickOnConfirmCodeButtonOnOTPVerifyPage() {
        kycPage.click_On_Confirm_Btn();
    }

    @Then("Verify user should be able to view Admin Page")
    public void verifyUserShouldBeAbleToViewAdminPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "admin", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @And("User click on admin module at side bar")
    public void userClickOnAdminModuleAtSideBar() {
        transferAgentLoginPage.click_On_Admin_Module();
    }

    @And("User click on add user button on admin page")
    public void userClickOnAddUserButtonOnAdminPage() {
        transferAgentLoginPage.click_On_Add_User_Btn();
    }

    @Then("Verify add user popup should be visible on admin page")
    public void verifyAddUserPopupShouldBeVisibleOnAdminPage() {
        Assert.assertTrue("Add user popup is not visible", transferAgentLoginPage.is_Add_User_Popup_Visible());
    }

    @And("User able to view first name and last name text field on add user popup on admin page")
    public void userAbleToViewFirstNameAndLastNameTextFieldOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("First name field is not visible", transferAgentLoginPage.is_First_Name_Visible());
        Assert.assertTrue("Last name field is not visible", transferAgentLoginPage.is_Last_Name_Visible());
    }

    @And("Verify user able to access level and temporary password field on add user popup on admin page")
    public void verifyUserAbleToAccessLevelAndTemporaryPasswordFieldOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Password field is not visible", transferAgentLoginPage.is_Password_Field_Visible());
        Assert.assertTrue("Access level field is not visible", transferAgentLoginPage.is_Access_Level_Visible());
    }

    @And("Verify user able to view email field and mobile number field on add user popup on admin page")
    public void verifyUserAbleToViewEmailFieldAndMobileNumberFieldOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Email field is not visible", transferAgentLoginPage.is_Email_Field_Visible());
        Assert.assertTrue("Mobile number field is not visible", transferAgentLoginPage.is_Mobile_Number_Field_Visible());
    }

    @And("Verify user able to view generate link and add user button on add user popup on admin page")
    public void verifyUserAbleToViewGenerateLinkAndAddUserButtonOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Generate link is not visible", transferAgentLoginPage.is_Generate_Link_Visible());
        Assert.assertTrue("Add user button is not visible", transferAgentLoginPage.is_Add_User_Button_Visible());
    }

    @And("User click on first name input field on add user popup on admin page")
    public void userClickOnFirstNameInputFieldOnAddUserButtonOnAdminPage() {
        transferAgentLoginPage.click_On_First_Name_Field();
    }

    @And("User click on last name input field on add user popup on admin page")
    public void userClickOnLastNameInputFieldOnAddUserButtonOnAdminPage() {
        transferAgentLoginPage.click_On_last_Name_Field();
    }

    @Then("Verify user able to view error msg below the first name field on add user popup on admin page")
    public void verifyUserAbleToViewErrorMsgBelowTheFirstNameFieldOnAddUserButtonOnAdminPage() {
        Assert.assertEquals("First Name is required.", transferAgentLoginPage.verify_Error_Msg_Below_Last_Name());
    }

    @When("User enter first name {string} in input field on add user popup on admin page")
    public void userEnterFirstNameInInputFieldOnAddUserPopupOnAdminPage(String firstName) {
        transferAgentLoginPage.enter_First_Name_In_Input_Field(firstName);
    }

    @Then("Verify contain alpha characters when I am entering special and numeric value in first name field on add user popup on admin page")
    public void verifyContainAlphaCharactersWhenIAmEnteringSpecialAndNumericValueInFirstNameFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Please enter a valid Name.", transferAgentLoginPage.verify_Error_Msg());
    }

    @When("User remove input field text {string} on add user popup on admin page")
    public void userRemoveInputFieldTextOnAddUserPopupOnAdminPage(String firstName) {
        remove_Text_Field_Data_By_Name(firstName);
    }

    @Then("Verify space is not allowed in first name field on add user popup on admin page")
    public void verifySpaceIsNotAllowedInFirstNameFieldOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("First name field is not empty", transferAgentLoginPage.verify_Space_Not_Allowed_In_Field().isEmpty());
    }

    @Then("Verify First Character should be Uppercase in first name input field on add user popup on admin page")
    public void verifyFirstCharacterShouldBeUppercaseInFirstNameInputFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Both the values are not equal", "T", transferAgentLoginPage.verify_Space_Not_Allowed_In_Field());
    }

    @Then("Verify user able to view error msg below the last name field on add user popup on admin page")
    public void verifyUserAbleToViewErrorMsgBelowTheLastNameFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Last Name is required.", transferAgentLoginPage.verify_Error_Msg_Below_Last_Name());

    }


    @Then("Verify contain alpha characters when I am entering special and numeric value in last name field on add user popup on admin page")
    public void verifyContainAlphaCharactersWhenIAmEnteringSpecialAndNumericValueInLastNameFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Please enter a valid Name.", transferAgentLoginPage.verify_Error_Msg());
    }

    @And("User enter last name {string} in input field on add user popup on admin page")
    public void userEnterLastNameInInputFieldOnAddUserPopupOnAdminPage(String LastName) {
        transferAgentLoginPage.enter_Last_Name_In_Input_Field(LastName);
    }


    @Then("Verify space is allowed in last name field on add user popup on admin page")
    public void verifySpaceIsNotAllowedInLastNameFieldOnAddUserPopupOnAdminPage() {
        Assert.assertFalse("Last name field is empty", transferAgentLoginPage.verify_Last_name_Field().isEmpty());
    }

    @Then("Verify last Character should be Uppercase in first name input field on add user popup on admin page")
    public void verifyLastCharacterShouldBeUppercaseInFirstNameInputFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Both the values are not equal", "T", transferAgentLoginPage.verify_Space_Not_Allowed_In_Field());
    }

    @And("User click on email field on add user popup on admin page")
    public void userClickOnEmailFieldOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Email_Field();
    }

    @Then("Verify user able to view error message  {string} on add user popup on admin page")
    public void verifyUserAbleToViewErrorMessageOnAddUserPopupOnAdminPage(String errorMsg) {
        Assert.assertEquals("Error msg is not visible", errorMsg, transferAgentLoginPage.get_Email_Error_Msg());
    }

    @And("User enter email {string} in input field on add user popup on admin page")
    public void userEnterEmailInInputFieldOnAddUserPopupOnAdminPage(String email) {
        transferAgentLoginPage.enter_Email_In_Input_field(email);
    }

    @Then("Verify email validation in email field on add user popup on admin page")
    public void verifyEmailValidationInEmailFieldOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.validate_Email_Value();
    }

    @And("User click on access level on add user popup on admin page")
    public void userClickOnAccessLevelOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Access_Level();
    }

    @Then("Verify user able to view multiple options on add user popup on admin page")
    public void verifyUserAbleToViewMultipleOptionsOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Access level option is not visible ", transferAgentLoginPage.verify_Access_Level_Options());
    }


    @And("User click on admin option from access level dropdown on add user popup on admin page")
    public void userClickOnAdminOptionFromAccessLevelDropdownOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Admin_Option();
    }

    @Then("Verify user able to view Agent option in Access level field and dropdown should close")
    public void verifyUserAbleToViewAgentOptionInAccessLevelFieldAndDropdownShouldClose() {
        Assert.assertTrue("Agent option is not visible", transferAgentLoginPage.is_Agent_Option_Selected());
    }

    @And("User click on agent option from access level dropdown on add user popup on admin page")
    public void userClickOnAgentOptionFromAccessLevelDropdownOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Agent_Option();
    }

    @Then("Verify user able to view admin option in Access level field and dropdown should close")
    public void verifyUserAbleToViewAdminOptionInAccessLevelFieldAndDropdownShouldClose() {
        Assert.assertTrue("Admin option is not visible", transferAgentLoginPage.is_Admin_Option_Selected());
    }

    @And("User enter mobile number {string} in input field on add user popup on admin page")
    public void userEnterMobileNumberInInputFieldOnOnAddUserPopupOnAdminPage(String mobileNumber) {
        transferAgentLoginPage.enter_Mobile_Number_In_Input_Field(mobileNumber);
    }

    @Then("Verify no other value should acceptable except numeric values on add user popup on admin page")
    public void verifyNoOtherValueShouldAcceptableExceptNumericValuesOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Mobile number is not empty", transferAgentLoginPage.get_Mobile_Number().isEmpty());
    }

    @Then("Verify user able to view a green check in mobile number field on add user popup on admin page")
    public void verifyUserAbleToViewAGreenCheckInMobileNumberFieldOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Green tick is not visible", transferAgentLoginPage.verify_Green_Tick_With_Mobile_Number());
    }

    @Then("Verify system should accept valid 12-digit Mobile number including 2 characters for hyphens on add user popup on admin page")
    public void verifySystemShouldAcceptValidDigitMobileNumberIncludingCharactersForHyphensOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Mobile number contains more than 10 digit", 12, transferAgentLoginPage.validate_Mobile_Number());

    }

    @And("Verify non VOIP, landlines message below the mobile number field on add user popup on admin page")
    public void verifyNonVOIPLandlinesMessageBelowTheMobileNumberFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("VOIP, landlines, or any temporary mobile are not accepted", transferAgentLoginPage.verify_Mobile_Number_Error_msg());
    }

    @Then("Verify user able to view error message below the mobile number field on add user popup on admin page")
    public void verifyUserAbleToViewErrorMessageBelowTheMobileNumberFieldOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Please ensure a valid 10-digit mobile number is entered.", transferAgentLoginPage.verify_Mobile_Number_Error_msg());
    }

    @Then("Verify user able to view error message when enter used number on add user popup on admin page")
    public void verifyUserAbleToViewErrorMessageWhenEnterUsedNumberOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("This mobile number is already associated with another account.", transferAgentLoginPage.verify_Mobile_Number_Error_msg());
    }

    @Then("Verify user able to view error message when enter wrong format number on add user popup on admin page")
    public void verifyUserAbleToViewErrorMessageWhenEnterWrongFormatNumberOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("This is not a valid mobile number (we do not accept VOIP, land lines, or other temporary mobile phone numbers).", transferAgentLoginPage.verify_Mobile_Number_Error_msg());

    }

    @And("User click on mobile number field on add user popup on admin page")
    public void userClickOnMobileNumberFieldOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Mobile_Number();
    }

    @Then("Verify user able to view error message mobile number required on add user popup on admin page")
    public void verifyUserAbleToViewErrorMessageMobileNumberRequiredOnAddUserPopupOnAdminPage() {
        Assert.assertEquals("Mobile Number is required.", transferAgentLoginPage.verify_Mobile_Number_Error_msg());
    }

    @And("User click on generate password link on add user popup on admin page")
    public void userClickOnGeneratePasswordButtonOnAddUserButtonOnAdminPage() {
        transferAgentLoginPage.click_On_Generate_Link_Field();
    }

    @Then("Verify temporary password field should disabled on add user popup on admin page")
    public void verifyTemporaryPasswordFieldShouldDisabledOnAddUserButtonOnAdminPage() {
        Assert.assertFalse("Temporary password field is enabled", transferAgentLoginPage.verify_Temporary_Password_Field_Disabled());
    }

    @And("User click on temporary password field on add user popup on admin page")
    public void userClickOnTemporaryPasswordFieldOnAddUserButtonOnAdminPage() {
        transferAgentLoginPage.click_On_Temporary_Password_Field();
    }

    @Then("Verify user should be able to view Temporary password generated on add user popup on admin page")
    public void verifyUserShouldBeAbleToViewTemporaryPasswordGeneratedOnAddUserButtonOnAdminPage() {
        temporaryPasswordValue = transferAgentLoginPage.get_Temporary_Password();
    }

    @Then("Verify user should be able to view Temporary password generated again on add user popup on admin page")
    public void verifyUserShouldBeAbleToViewTemporaryPasswordGeneratedAgainOnAddUserButtonOnAdminPage() {
        Assert.assertNotEquals("Password are same", temporaryPasswordValue, transferAgentLoginPage.get_Temporary_Password());
    }

    @And("User click on cancel button on add user popup on admin page")
    public void userClickOnCancelButtonOnAddUserPopupOnAdminPage() {
        myAccount.click_On_Cancel_Btn();
    }

    @Then("Verify Add user popup should be close when clicking on cancel button on add user popup on admin page")
    public void verifyAddUserPopupShouldBeCloseWhenClickingOnCancelButtonOnAddUserPopupOnAdminPage() {
        Assert.assertFalse("Add user popup is visible", transferAgentLoginPage.is_Add_User_Popup_Visible());

    }

    @And("User click on outside the popup on add user popup on admin page")
    public void userClickOnOutsideThePopupOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Outside_The_Popup();
    }

    @Then("Verify Add user button should disabled on add user popup on admin page")
    public void verifyAddUserButtonShouldDisabledOnAddUserPopupOnAdminPage() {
        Assert.assertFalse("Add user button is disabled", transferAgentLoginPage.is_Add_user_Button_Enabled());
    }

    @And("User click on add user button on add user popup on admin page")
    public void userClickOnAddUserButtonOnAddUserPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Add_User_Button();
    }

    @Then("Verify user able to view success popup on add user popup on admin page")
    public void verifyUserAbleToViewSuccessPopupOnAddUserPopupOnAdminPage() {
        Assert.assertTrue("Success popup is not visible", transferAgentLoginPage.verify_Success_Popup());
    }

    @And("User enter phone number {string} in input field on add user popup on admin page")
    public void userEnterPhoneNumberInInputFieldOnAddUserPopupOnAdminPage(String userMobileNumber) {
        transferAgentLoginPage.enter_Phone_Number(userMobileNumber);
    }

    @And("User enter email in input field on add user popup on admin page")
    public void userEnterEmailInInputFieldOnAddUserPopupOnAdminPage() {
        userEmail = transferAgentLoginPage.random_Email_Generate();
    }

    @Then("Verify user should able to view pop-up is closed in {int} sec and user should on same page")
    public void verifyUserShouldAbleToViewPopUpIsClosedInSecAndUserShouldOnSamePage(int timer) {
        waitForElement(timer);
        Assert.assertFalse("Success popup is visible", transferAgentLoginPage.verify_Success_Popup());
    }

    @Then("Verify user should able to close success pop-up and should stays on same page")
    public void verifyUserShouldAbleToCloseSuccessPopUpAndShouldStaysOnSamePage() {
        Assert.assertFalse("Success popup is visible", transferAgentLoginPage.verify_Success_Popup());
    }

    @When("User click on cross icon on success popup on admin page")
    public void userClickOnCrossIconOnSuccessPopupOnAdminPage() {
        transferAgentLoginPage.click_On_Close_Icon();
    }

    @And("User click on name label on admin page")
    public void userClickOnNameLabelOnAdminPage() {
        transferAgentLoginPage.click_On_Name_Label();
    }

    @Then("Verify user able to view name column options on admin page")
    public void verifyUserrAbleToViewNameColumnOptionsOnAdminPage() {
        transferAgentLoginPage.verify_Name_Label_options();
    }

    @When("User click on a to z option of name label on admin page")
    public void userClickOnAToZOptionOfNameLabelOnAdminPage() {
        transferAgentLoginPage.click_on_A_To_Z_Option();
    }

    @Then("Verify User should be able to view list in A to Z alphabetical order on admin page")
    public void verifyUserShouldBeAbleToViewListInAToZAlphabeticalOrderOnAdminPage() {
        List<WebElement> dataElement = portfolioYourSellOrder.getNameElements();
        String preValue = portfolioYourSellOrder.getText(dataElement.get(0));
        for (int i = 1; i < dataElement.size(); i++) {
            String nextValue = portfolioYourSellOrder.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in accessing order with prev row no: " + (i - 1),
                    isSorted(preValue, nextValue));
            preValue = nextValue;
        }
    }

    @And("User click on Z to A option of name label on admin page")
    public void userClickOnZToAOptionOfNameLabelOnAdminPage() {
        transferAgentLoginPage.click_on_Z_To_A_Option();
    }


    @Then("Verify User should be able to view list in Z to A alphabetical order on admin page")
    public void verifyUserShouldBeAbleToViewListInZToAAlphabeticalOrderOnAdminPage() {
        List<WebElement> dataElement = portfolioYourSellOrder.getNameElements();
        String preValue = portfolioYourSellOrder.getText(dataElement.get(0));
        for (int i = 1; i < dataElement.size(); i++) {
            String nextValue = portfolioYourSellOrder.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in reverse order with prev row no: " + (i - 1),
                    isReverseSorted(preValue, nextValue));
            preValue = nextValue;
        }
    }

    @Then("Verify user should able to view Email column with register email on admin page")
    public void verifyUserShouldAbleToViewEmailColumnWithRegisterEmailOnAdminPage() {
        transferAgentLoginPage.verify_Email_Column();
    }

    @Then("Verify user should able to view mobile number column  on admin page")
    public void verifyUserShouldAbleToViewMobileNumberColumnOnAdminPage() {
        transferAgentLoginPage.verify_Mobile_Number_Column();
    }

    @And("User click on all roles filter on admin page")
    public void userClickOnAllRolesFilterOnAdminPage() {
        transferAgentLoginPage.click_On_All_Roles_Filter();
    }

    @Then("Verify user should be able to view Role of user on admin page")
    public void verifyUserShouldBeAbleToViewRoleOfUserOnAdminPage() {
        Assert.assertTrue("Roles value is not visible", transferAgentLoginPage.is_All_Roles_Value_Dropdown());
    }

    @Then("Verify status should show active right after user is added on admin page")
    public void verifyStatusShouldShowActiveRightAfterUserIsAddedOnAdminPage() {
        Assert.assertTrue("Active status is not visible", transferAgentLoginPage.is_Account_Status_Active());
    }

    @When("User click on user detail row on admin page")
    public void userClickOnUserDetailRowOnAdminPage() {
        transferAgentLoginPage.click_On_User_Detail_Row();
    }

    @And("User click on Deactivate account button on user detail page")
    public void userClickOnDeactivateAccountOnUserDetailPage() {
        transferAgentLoginPage.click_On_Deactivate_Button();
    }

    @Then("Verify status should show deactivate when account has been deactivate by admin on user details page")
    public void verifyStatusShouldShowDeactivateWhenAccountHasBeenDeactivateByAdminOnUserDetailsPage() {
        Assert.assertTrue("Deactivate status is not visible", transferAgentLoginPage.is_Account_Status_Deactivate());
    }

    @Then("Verify user should able to view pagination at Right bottom of page on admin page")
    public void verifyUserShouldAbleToViewPaginationAtRightBottomOfPageOnAdminPage() {
        Assert.assertTrue("Pagination is not visible", transferAgentLoginPage.is_Pagination_Visible());
    }

    @Then("Verify user should able to view list of 2nd page user list on admin page")
    public void verifyUserShouldAbleToViewListOfNdPageUserListOnAdminPage() {
        Assert.assertNotEquals("User is on same page", paginationCount, transferAgentLoginPage.get_Pagination_Value());
    }

    @And("User get the pagination count on admin page")
    public void userGetThePaginationCountOnAdminPage() {
        paginationCount = transferAgentLoginPage.get_Pagination_Value();
    }

    @And("User click on pagination 2 on admin page")
    public void userClickOnPaginationOnAdminPage() {
        transferAgentLoginPage.click_on_Pagination_2();
    }

    @And("User click on forward arrow of pagination on admin page")
    public void userClickOnForwardArrowOfPaginationOnAdminPage() {
        transferAgentLoginPage.click_On_Forward_Arrow();
    }

    @Then("Verify user should get oldest user list compare to present list on admin page")
    public void verifyUserShouldGetOldestUserListCompareToPresentListOnAdminPage() {
        Assert.assertNotEquals("User is on same page", paginationCount, transferAgentLoginPage.get_Pagination_Value());

    }

    @When("User click on previous arrow of pagination on admin page")
    public void userClickOnPreviousArrowOfPaginationOnAdminPage() {
        transferAgentLoginPage.click_On_Previous_Arrow();
    }

    @Then("Verify user should be able to view user detail page")
    public void verifyUserShouldBeAbleToViewUserDetailPage() {
        Assert.assertTrue("User detail page is not visible", transferAgentLoginPage.is_User_Detail_Page());
    }

    @Then("Verify user able to view side bar menu on admin page")
    public void verifyUserAbleToViewSideBarMenuOnAdminPage() {
        transferAgentLoginPage.verify_Side_Bar_Menu_List();
    }

    @And("Verify user able to view header column name on user detail page")
    public void verifyUserAbleToViewHeaderColumnNameOnUserDetailPage() {
        transferAgentLoginPage.verify_Header_Column_Name();
    }

    @And("User click on reset password button on user detail page")
    public void userClickOnResetPasswordButtonOnUserDetailPage() {
        transferAgentLoginPage.click_On_Reset_Password_Button();
    }

    @Then("Verify user able to view toast message says {string} on user detail page")
    public void verifyUserAbleToViewToastMessageSaysOnUserDetailPage(String resetToastMsg) {
        Assert.assertEquals(resetToastMsg, transferAgentLoginPage.verify_Reset_Toast_Msg());
    }

    @And("User should be able to view 2FA page")
    public void userShouldBeAbleToViewFAPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "authenticate", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @Then("Verify Back to login button should visible on 2FA page")
    public void verifyBackToLoginButtonShouldVisibleOnFAPage() {
        Assert.assertTrue("Back to login button is not visible", transferAgentLoginPage.is_Back_To_Login_Btn_Visible());
    }

    @And("Verify user able to view placeholder text {string} on 2FA page")
    public void verifyUserAbleToViewPlaceholderTextOnFAPage(String placeHolderText) {
        Assert.assertEquals(placeHolderText, transferAgentLoginPage.get_Placeholder_Text());
    }

    @And("Verify user able to view sub heading text on 2FA page")
    public void verifyUserAbleToViewSubHeadingTextOnFAPage() {
        Assert.assertTrue("Sub heading is not visible", transferAgentLoginPage.is_Sub_Heading_Visible());
    }

    @And("Verify confirm code button should visible on 2FA page")
    public void verifyConfirmCodeButtonShouldVisibleOnFAPage() {
        Assert.assertTrue("Confirm code button is not visible", transferAgentLoginPage.is_Confirm_Code_Visible());
    }

    @Then("Verify user should not be able to enter Alphabetic code in otp field on 2FA page")
    public void verifyUserShouldNotBeAbleToEnterAlphabeticCodeInOtpFieldOnFAPage() {
        Assert.assertTrue("OTP field is not empty", buySharePage.get_OTP_Value().isEmpty());
    }

    @Then("Verify user able to view confirm code button should enabled on 2FA page")
    public void verifyUserAbleToViewConfirmCodeButtonShouldEnabledOnFAPage() {
        Assert.assertTrue("Confirm code button is disabled", transferAgentLoginPage.verify_Confirm_Code_Enabled());
    }

    @Then("Verify User should able to navigate to Reset Password Page")
    public void verifyUserShouldAbleToNavigateToResetPasswordPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "reset-password", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @When("User click on back to login button on reset password page")
    public void userClickOnBackToLoginButtonOnResetPasswordPage() {
        transferAgentLoginPage.click_On_Back_To_Login_Button();
    }

    @Then("Verify user should able to view login page")
    public void verifyUserShouldAbleToViewLoginPage() {
        Assert.assertEquals("Login page is not visible", "Log In", transferAgentLoginPage.is_Log_In_Page_Visible());

    }

    @And("Verify User able to view current password field , new password field and confirm password field on reset password page")
    public void verifyUserAbleToViewCurrentPasswordFieldNewPasswordFieldAndConfirmPasswordFieldOnResetPasswordPage() {
        Assert.assertTrue("Current password field is not visible", transferAgentLoginPage.is_Current_Password_Field_Visible());
        Assert.assertTrue("New password field is not visible", transferAgentLoginPage.is_New_Password_Field_Visible());
        Assert.assertTrue("Confirm password field is not visible", transferAgentLoginPage.is_Confirm_Password_Field_Visible());
    }

    @And("Verify resend button should visible on 2FA page")
    public void verifyResendButtonShouldVisibleOnFAPage() {
        Assert.assertTrue("resend button is not visible", transferAgentLoginPage.is_Resend_Button_Visible());
    }

    @And("Verify user should be able to view submit button on reset password page")
    public void verifyUserShouldBeAbleToViewSubmitButtonOnResetPasswordPage() {
        Assert.assertTrue("Submit button is not visible", transferAgentLoginPage.is_Submit_Button_Visible());

    }

    @And("Verify sub text should be visible on reset password page")
    public void verifySubTextShouldBeVisibleOnResetPasswordPage() {
        Assert.assertTrue("", transferAgentLoginPage.is_Sub_Text_Visible());
    }

    @And("Verify Header text should be visible {string} on reset password page")
    public void verifyHeaderTextShouldBeVisibleOnResetPasswordPage(String headerText) {
        Assert.assertEquals("Header text are not same", headerText, transferAgentLoginPage.is_Header_Text_Visible());
    }

    @And("User click on cross icon on verified popup on 2FA page")
    public void userClickOnCrossIconOnVerifiedPopupOnFAPage() {
        transferAgentLoginPage.click_On_Cross_Icon();
    }

    @And("User will wait for {int} seconds on 2FA page")
    public void userWillWaitForSecondsOnFAPage(int timer) {
        waitForElement(timer);
    }

    @Then("Verify user able to view account verified popup on 2FA page")
    public void verifyUserAbleToViewAccountVerifiedPopupOnFAPage() {
        Assert.assertTrue("Account verified popup is not visible", transferAgentLoginPage.verify_Account_Verified_popup());
    }

    @And("Verify user able to view sub text of account verified popup on 2FA page")
    public void verifyUserAbleToViewSubTestOfAccountVerifiedPopupOnFAPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.verify_subText_Account_popup());
    }

    @Then("Verify Pop-up should Auto close after 3sec on {int}FA page")
    public void verifyPopUpShouldAutoCloseAfterSecOnFAPage(int timer) {
        waitForElement(timer);
        Assert.assertFalse("Account verified popup is visible", transferAgentLoginPage.verify_Account_Verified_popup());
        ;
    }

    @Then("Verify user should able to view Confirm code button is disabled on 2FA page")
    public void verifyUserShouldAbleToViewConfirmCodeButtonIsDisabledOnFAPage() {
        Assert.assertFalse("Confirm code button is enabled", transferAgentLoginPage.verify_Confirm_Code_Enabled());
    }

    @Then("Verify User should be able to view error messages 2 attempts remaining below the OTP field on 2FA page")
    public void verifyUserShouldBeAbleToViewErrorMessagesAttemptsRemainingBelowTheOTPFieldOnFAPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, you have two (2) attempts remaining.", transferAgentLoginPage.is_Validation_Msg_Visible());
    }

    @When("User remove Otp code in input field on 2FA page")
    public void userRemoveOtpCodeInInputFieldOnFAPage() {
        buySharePage.remove_Code_From_Otp_Box();
    }


    @Then("Verify enter the invalid code second time validation message should displayed on 2FA page")
    public void verifyEnterTheInvalidCodeSecondTimeValidationMessageShouldDisplayedOnFAPage() {
        Assert.assertEquals("The six (6) digit code you entered is incorrect, you have one (1) attempt remaining.", transferAgentLoginPage.is_Validation_Msg_Visible());
    }

    @Then("Verify user should be able to view pop-up {string} on 2FA page")
    public void verifyUserShouldBeAbleToViewPopUpOnFAPage(String accountNotConfirmedPopup) {
        Assert.assertEquals(accountNotConfirmedPopup, transferAgentLoginPage.is_Account_Not_Confirmed_Popup_Visible());
    }

    @And("Verify user able to view sub text of account not verified popup on 2FA page")
    public void verifyUserAbleToViewSubTextOfAccountNotVerifiedPopupOnFAPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.is_Sub_Text_Of_Account_Not_Confirmed());
    }

    @And("Verify user able to cross icon on account not confirmed popup on 2FA page")
    public void verifyUserAbleToCrossIconOnAccountNotConfirmedPopupOnFAPage() {
        Assert.assertTrue("Cross icon is not visible", transferAgentLoginPage.is_Cross_Icon_Visible());
    }

    @And("Verify user able to view account locked sub text on account locked popup on login page")
    public void verifyUserAbleToViewAccountLockedSubTextOnAccountLockedPopupOnLoginPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.is_Sub_Text_Of_Account_Not_Confirmed());
    }

    @And("Verify user able to view cross icon on account locked popup on login page")
    public void verifyUserAbleToViewCrossIconOnAccountLockedPopupOnLoginPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.is_Sub_Text_Of_Account_Not_Confirmed());
        Assert.assertTrue("Cross icon is not visible", transferAgentLoginPage.is_Cross_Icon_Visible());
    }

    @And("User click on profile icon on admin page")
    public void userClickOnProfileIconOnAdminPage() {
        transferAgentLoginPage.click_On_Profile_Icon();
    }

    @And("User click on logout button on admin page")
    public void userClickOnLogoutButtonOnAdminPage() {
        transferAgentLoginPage.click_On_Logout_Btn();
    }

    @And("User enter email in email input field on login page")
    public void userEnterEmailInEmailInputFieldOnLoginPage() {
        transferAgentLoginPage.enter_Email_In_Input_Field(userEmail);
    }

    @Then("Verify enter button should disabled when user enter less than 12digit password on login page")
    public void verifyEnterButtonShouldDisabledWhenUserEnterLessThanDigitPasswordOnLoginPage() {
        Assert.assertFalse("Enter button is enabled", transferAgentLoginPage.is_Enter_Btn_Enabled());
    }

    @And("Verify user able to view account not confirmed pop up should close automatically after {int}second on 2FA page")
    public void verifyUserAbleToViewAccountNotConfirmedPopUpShouldCloseAutomaticallyAfterSecondOnFAPage(int timer) {
        waitForElement(timer);
        Assert.assertFalse("Account not confirm popup is visible", transferAgentLoginPage.verify_Account_Not_Confirmed_Popup());
    }

    @And("User enter current password {string} in input field on reset password page")
    public void userEnterCurrentPasswordInInputFieldOnFAPage(String currentPassword) {
        transferAgentLoginPage.enter_Current_Password_In_Input_Field(currentPassword);
    }

    @Then("Verify Passwords must contain at least 12 characters on reset password page")
    public void verifyPasswordsMustContainAtLeastCharactersOnResetPasswordPage() {
        Assert.assertEquals("Current Password must contain at least 12 characters.", transferAgentLoginPage.get_Password_Error_Text());
    }

    @And("User click on current password field on reset page")
    public void userClickOnCurrentPasswordFieldOnResetPage() {
        transferAgentLoginPage.click_On_Current_Password_Field();
    }

    @And("User click on new password field on reset page")
    public void userClickOnNewPasswordFieldOnResetPage() {
        transferAgentLoginPage.click_On_New_Password_Field();
    }

    @Then("Verify user able to view error msg {string} on reset page")
    public void verifyUserAbleToViewErrorMsgOnResetPage(String passwordErrorMsg) {
        Assert.assertEquals("Error msg is not visible", passwordErrorMsg, transferAgentLoginPage.get_Password_Error_Text());

    }

    @Then("Verify error message {string} on reset password page")
    public void verifyErrorMessageOnResetPasswordPage(String password) {
        Assert.assertEquals(password, transferAgentLoginPage.get_Password_Error_Text());
    }

    @And("User enter new password {string} in input field on reset password page")
    public void userEnterNewPasswordInInputFieldOnResetPasswordPage(String password) {
        transferAgentLoginPage.enter_New_Password_In_Input_Field(password);

    }

    @And("User click on submit button on reset password page")
    public void userClickOnSubmitButtonOnResetPasswordPage() {
        transferAgentLoginPage.click_On_Submit_Button();
    }

    @And("User enter confirm password  {string} in input field on reset password page")
    public void userEnterConfirmPasswordInInputFieldOnResetPasswordPage(String confirmPassword) {
        transferAgentLoginPage.enter_Confirm_Password_In_Input_Field(confirmPassword);
    }

    @And("Verify user able to view {string} popup on reset password page")
    public void verifyUserAbleToViewPopupOnResetPasswordPage(String passwordPopup) {
        Assert.assertEquals(passwordPopup, transferAgentLoginPage.verify_Password_Not_Confirmed_Popup());
    }

    @And("Verify user able to view sub text of password not confirmed popup on reset password page")
    public void verifyUserAbleToViewSubTextOfPasswordNotConfirmedPopupOnResetPasswordPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.verify_Subtext_Of_Password_Not_Confirmed());
    }

    @And("verify user able to view cross icon on reset password page")
    public void verifyUserAbleToViewCrossIconOnResetPasswordPage() {
        Assert.assertTrue("Cross icon is not visible", transferAgentLoginPage.is_Cross_Icon_Visible());
    }

    @And("User get the temporary password on add user popup on admin page")
    public void userGetTheTemporaryPasswordOnAddUserPopupOnAdminPage() {
        temporaryPasswordValue = transferAgentLoginPage.get_Temporary_Password();
    }


    @And("User enter temporary password in input field on login page")
    public void userEnterTemporaryPasswordInInputFieldOnLoginPage() {
        transferAgentLoginPage.enter_Temporary_Password(temporaryPasswordValue);
    }

    @Then("Verify Pop-up should Auto close after {int}sec on reset password page")
    public void verifyPopUpShouldAutoCloseAfterSecOnResetPasswordPage(int timer) {
        waitForElement(timer);
        Assert.assertFalse("Password not confirmed popup is visible", transferAgentLoginPage.is_Password_Not_Confirmed_Popup_Visible());
    }

    @Then("Verify new password must contain at least 12 characters on reset password page")
    public void verifyNewPasswordMustContainAtLeastCharactersOnResetPasswordPage() {
        Assert.assertEquals("Error msg is not visible", "Password must contain at least 12 characters.", transferAgentLoginPage.verify_Password_field_validation_Msg());
    }

    @And("Verify validation of New Password field on reset password page")
    public void verifyValidationOfNewPasswordFieldOnResetPasswordPage() {
        Assert.assertTrue("Error msg is not visible", transferAgentLoginPage.is_Password_Field_Error_Msg_Visible());
    }

    @And("Verify user able to view error msg {string} on reset password page")
    public void verifyUserAbleToViewErrorMsgOnResetPasswordPage(String passwordField) {
        Assert.assertEquals("", passwordField, transferAgentLoginPage.verify_Password_field_validation_Msg());
    }

    @And("User click on confirm new password field on reset password page")
    public void userClickOnConfirmNewPasswordFieldOnResetPasswordPage() {
        transferAgentLoginPage.click_On_Confirm_new_password();
    }

    @When("User enter confirm password {string} but not same as new password on reset password page")
    public void userEnterConfirmPasswordButNotSameAsNewPasswordOnResetPasswordPage(String confirmPassword) {
        transferAgentLoginPage.enter_Confirm_Password_In_Input_Field(confirmPassword);

    }

    @When("User enter confirm password {string} which didn't match validation of password field on reset password page")
    public void userEnterConfirmPasswordWhichDidnTMatchValidationOfPasswordFieldOnResetPasswordPage(String confirmPassword) {
        transferAgentLoginPage.enter_Confirm_Password_In_Input_Field(confirmPassword);

    }

    @And("user click on new password eye icon on reset password page")
    public void userClickOnNewPasswordEyeIconOnResetPasswordPage() {
        transferAgentLoginPage.click_On_New_Password_Eye_Icon();
    }

    @Then("Verify user able to view Submit button is Disabled on reset password page")
    public void verifyUserAbleToViewSubmitButtonIsDisabledOnResetPasswordPage() {
        Assert.assertFalse("Submit button is enabled", transferAgentLoginPage.is_Submit_Button_Enabled());
    }

    @Then("Verify user able to view Submit button is Enabled on reset password page")
    public void verifyUserAbleToViewSubmitButtonIsEnabledOnResetPasswordPage() {
        Assert.assertTrue("Submit button is disabled", transferAgentLoginPage.is_Submit_Button_Enabled());

    }

    @When("User remove input field text {string} on reset password page")
    public void userRemoveInputFieldTextOnResetPasswordPage(String value) {
        remove_Text_Field_Data_By_Name(value);
    }

    @And("User enter current password in input field on reset password page")
    public void userEnterCurrentPasswordInInputFieldOnResetPasswordPage() {
        transferAgentLoginPage.enter_Temporary_Current_Password(temporaryPasswordValue);
    }

    @Then("User should be able to navigate to Transfer Agent>Properties page")
    public void userShouldBeAbleToNavigateToTransferAgentPropertiesPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "properties", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @And("Verify user able to view header text {string} on reset password page")
    public void verifyUserAbleToViewHeaderTextOnResetPasswordPage(String headerText) {
        Assert.assertEquals(headerText, transferAgentLoginPage.verify_New_Password_Popup());
    }

    @And("Verify user able to view sub text of new password setup popup on reset password page")
    public void verifyUserAbleToViewSubTextOfNewPasswordSetupPopupOnResetPasswordPage() {
        Assert.assertTrue("Sub text is not visible", transferAgentLoginPage.is_Sub_text_Of_New_Password_Popup());
    }

    @And("User click on newest to oldest filter on name filter on admin page")
    public void userClickOnNewestToOldestFilterOnNameFilterOnAdminPage() {
        transferAgentLoginPage.click_On_Newest_To_Oldest_Filter();
    }

    @Then("Verify user able to view newest to oldest list on admin page")
    public void verifyUserAbleToViewNewestToOldestListOnAdminPage() {
        Assert.assertTrue("Newest to oldest filter is not visible", transferAgentLoginPage.is_Newest_To_Oldest_Filter_Visible());
        transferAgentLoginPage.verify_Listing_Of_User();

    }

    @Then("Verify user should be able to view Toast message {string} on user detail page")
    public void verifyUserShouldBeAbleToViewToastMessageOnUserDetailPage(String toastMsg) {
        Assert.assertEquals("Toast msg is not visible", toastMsg, transferAgentLoginPage.verify_Deactivated_Toast_Msg());
    }

    @And("Verify Deactivate button change to Activate on user detail page")
    public void verifyDeactivateButtonChangeToActivateOnUserDetailPage() {
        Assert.assertTrue("Activate button is not visible", transferAgentLoginPage.is_Activate_Button_Visible());
    }

    @When("User click on activate button on user detail page")
    public void userClickOnActivateButtonOnUserDetailPage() {
        transferAgentLoginPage.click_On_Activate_Button();
    }

    @And("Verify Activate button change to Deactivate on user detail page")
    public void verifyActivateButtonChangeToDeactivateOnUserDetailPage() {
        Assert.assertTrue("Deactivate button is not visible", transferAgentLoginPage.is_Deactivate_button_visible());
    }

    @Then("Verify error Message {string} on login page")
    public void verifyErrorMessageOnLoginPage(String accountDeactivateToastMsg) {
        Assert.assertEquals("Account is not deactivate", accountDeactivateToastMsg, transferAgentLoginPage.verify_Account_Deactivate_Toast_Msg());
    }

    @And("Verify user able to view all status filter on admin page")
    public void verifyUserAbleToViewAllStatusFilterOnAdminPage() {
        Assert.assertTrue("All status filter is not visible", transferAgentLoginPage.is_All_Status_filter_Visible());
    }

    @And("Verify user able to view role filter on admin page")
    public void verifyUserAbleToViewRoleFilterOnAdminPage() {
        Assert.assertTrue("All role filter is not visible", transferAgentLoginPage.is_All_Role_Filter_Visible());
    }

    @And("Verify user able to view list of user in form of table on admin page")
    public void verifyUserAbleToViewListOfUserInFormOfTableOnAdminPage() {
        transferAgentLoginPage.verify_Listing_Of_User();
    }

    @Then("Verify user should be able to view log Details of every action on user detail page")
    public void verifyUserShouldBeAbleToViewLogDetailsOfEveryActionOnUserDetailPage() {
        Assert.assertTrue("Log detail is not visible", transferAgentLoginPage.is_Log_Detail_Visible());
    }

}
