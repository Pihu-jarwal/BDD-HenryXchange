package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.ContactUsPageLoggedUser;
import org.xchange.pom.MyAccountPage;
import utils.PropertiesUtil;

public class ContactUsForLoggedUserSteps {

    ContactUsPageLoggedUser contactUsLoggedUser = new ContactUsPageLoggedUser();
    MyAccountPage myAccount = new MyAccountPage();

    @Then("User should able to navigate to {string} contact us page after login")
    public void userShouldAbleToNavigateToContactUsPageAfterLogin(String endPoint) {
        Assert.assertEquals("Contact us page is not visible", PropertiesUtil.getEnvironmentKey("URL") + endPoint, contactUsLoggedUser.verify_ContactUs_Page());
    }

    @And("User able to view white background of contact us page for logged user")
    public void userAbleToViewWhiteBackgroundOfContactUsPageForLoggedUser() {
        contactUsLoggedUser.verify_White_Background_Color();
    }

    @And("User able to view header text {string} on contact us page after login")
    public void userAbleToViewHeaderTextOnContactUsPageAfterLogin(String contactus) {
        Assert.assertEquals("Contact us expected and actual text are not same ", contactus, contactUsLoggedUser.view_ContactUs_Text());
    }

    @And("User able to view placeholder text How Can We Help? as {string} on contact us page after login")
    public void userAbleToViewPlaceholderTextHowCanWeHelpAsOnContactUsPageAfterLogin(String howCanIHepYou) {
        Assert.assertEquals("How can i help you expected and actual text are not same", howCanIHepYou, contactUsLoggedUser.view_How_Can_We_Help_Text());
    }

    @And("User able to view description below the how can help you text on contact us page after login")
    public void userAbleToViewDescriptionBelowTheHowCanHelpYouTextOnContactUsPageAfterLogin() {
        Assert.assertTrue("Description is not displayed on contact us page", contactUsLoggedUser.view_Description_Below_How_Can_We_Help_Text());
    }

    @And("User able to view Henry phone number {string} on contact us page after login")
    public void userAbleToViewHenryPhoneNumberOnContactUsPageAfterLogin(String henryPhoneNumber) {
        Assert.assertEquals("Henry phone number expected and actual text are not same", henryPhoneNumber, contactUsLoggedUser.view_Henry_Phone_Number());
    }

    @And("User able to view placeholder text Send a message as {string} on contact us page after login")
    public void userAbleToViewPlaceholderTextSendAMessageAsOnContactUsPageAfterLogin(String sendAMessage) {
        Assert.assertEquals("Send A Message expected and actual text are not same", sendAMessage, contactUsLoggedUser.view_Placeholder_Text_Send_A_Message());
    }

    @And("User able to view name field on contact us page after login")
    public void userAbleToViewNameFieldOnContactUsPageAfterLogin() {
        Assert.assertTrue("Name field is not displayed on contact us page", contactUsLoggedUser.verify_Name_Field());
    }

    @And("User able to view email field on contact us page after login")
    public void userAbleToViewEmailFieldOnContactUsPageAfterLogin() {
        Assert.assertTrue(" Email field is not displayed on contact us page", contactUsLoggedUser.verify_Email_Field());
    }

    @And("User able to view subject field on contact us page after login")
    public void userAbleToViewSubjectFieldOnContactUsPageAfterLogin() {
        Assert.assertTrue("Subject field is not displayed on contact us page", contactUsLoggedUser.verify_Subject_Field());
    }

    @And("User able to view message field on contact us page after login")
    public void userAbleToViewMessageFieldOnContactUsPageAfterLogin() {
        Assert.assertTrue("Message field is not displayed on contact us page", contactUsLoggedUser.verify_Message_Field());
    }

    @And("User able to view Add attachments as {string} on contact us page after login")
    public void userAbleToViewAddAttachmentsAsOnContactUsPageAfterLogin(String addAttachment) {
        Assert.assertEquals("Add attachments expected and actual text are not same", addAttachment, contactUsLoggedUser.view_Add_Attachment());
    }

    @And("User able to view placeholder hint text {string} on contact us page after login")
    public void userAbleToViewPlaceholderHintTextOnContactUsPageAfterLogin(String hint) {
        Assert.assertEquals("Add attachments hint expected and actual text are not same", hint, contactUsLoggedUser.view_Placeholder_Text_Hint_Of_Add_Attachments());
    }

    @And("User able to view send message button on contact us page after login")
    public void userAbleToViewSendMessageButtonOnContactUsPageAfterLogin() {
        Assert.assertTrue("Send message button is not displayed on contact us page ", contactUsLoggedUser.verify_Send_Message_Button());
    }

    @When("User enter the valid input name as {string} on contact us page after login")
    public void userEnterTheValidInputNameAsOnContactUsPageAfterLogin(String name) {
        contactUsLoggedUser.enter_The_Valid_Name_In_Name_Field(name);
    }

    @Then("Verify name field contains only characters and spaces include between the character on contact us page after login")
    public void verifyNameFieldContainsOnlyCharactersAndSpacesIncludeBetweenTheCharacterOnContactUsPageAfterLogin() {
        Assert.assertTrue("Name field contains invalid characters.", contactUsLoggedUser.validate_Name_Field_Contains_Character_And_Space());
    }

    @And("User able to delete the already name filled in name field on contact us page after login")
    public void userAbleToDeleteTheAlreadyNameFilledInNameFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.delete_Already_Existing_Name_Text();
    }

    @And("User able to view name is autofill display in name field on contact us page after login")
    public void userAbleToViewNameIsAutofillDisplayInNameFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.verify_Autofill_Name_In_Name_Field();
    }

    @And("Verify user able to view Name should be displayed auto filled same as displayed in the Account page.")
    public void verifyUserAbleToViewNameShouldBeDisplayedAutoFilledSameAsDisplayedInTheAccountPage() {
        Assert.assertTrue(" Account Email is not matching ", myAccount.verify_Account_Name());
    }

    @When("User no input enter in name field as {string} on contact us page after login")
    public void userNoInputEnterInNameFieldAsOnContactUsPageAfterLogin(String name) {
        contactUsLoggedUser.no_Input_Enter_In_Name_Field(name);
    }

    @And("User click outside the field on contact us page after login")
    public void userClickOutsideTheFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.click_Outside_the_Field();
    }

    @Then("User should able to view name validation message {string} on contact us page after login")
    public void userShouldAbleToViewNameValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Name is required validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_Name_Field());
    }

    @When("User enter the invalid input in name field as {string} on contact us page after login")
    public void userEnterTheInvalidInputInNameFieldAsOnContactUsPageAfterLogin(String name) {
        contactUsLoggedUser.enter_The_Invalid_Name_In_Name_Field(name);
    }

    @Then("User able to view name validation msg on contact us page after login")
    public void userAbleToViewNameValidationMsgOnContactUsPageAfterLogin() {
        String expected = "Please enter a valid name. A name should not contain special characters or numeric characters.";
        Assert.assertEquals("Invalid Name validation msg text expected and actual are not same ", expected, contactUsLoggedUser.verify_Validation_Msg_When_Enter_Invalid_Name());
    }

    @When("User enter less than two character input in name field as {string} on contact us page after login")
    public void userEnterLessThanTwoCharacterInputInNameFieldAsOnContactUsPageAfterLogin(String name) {
        contactUsLoggedUser.enter_Less_Than_Two_Character_In_Name_Field(name);
    }

    @Then("User able to view name validation message {string} on contact us page after login")
    public void userAbleToViewNameValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Your name must contain at least 2 character validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_When_Enter_Less_Than_Two_Character_In_Name_Field());
    }

    @And("User able to delete the already email filled in email field on contact us page after login")
    public void userAbleToDeleteTheAlreadyEmailFilledInEmailFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.delete_Already_Existing_Email_Text();
    }

    @And("User enter the valid email in email field as {string} on contact us page after login")
    public void userEnterTheValidEmailInEmailFieldAsOnContactUsPageAfterLogin(String email) {
        contactUsLoggedUser.enter_The_Valid_Email_In_Email_Field(email);
    }

    @Then("Verify user should be able to type valid email address having @ and a domain \\(.com, .org) on contact us page after login")
    public void verifyUserShouldBeAbleToTypeValidEmailAddressHavingAndADomainComOrgOnContactUsPageAfterLogin() {
        Assert.assertTrue("Email address is not valid", contactUsLoggedUser.validate_Email_Field());
    }


    @And("User able to view email is autofill display in email field on contact us page after login")
    public void userAbleToViewEmailIsAutofillDisplayInEmailFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.verify_Autofill_Email_In_Email_Field();
    }

    @And("Verify user able to view email should be displayed auto filled same as displayed in the Account page.")
    public void verifyUserAbleToViewEmailShouldBeDisplayedAutoFilledSameAsDisplayedInTheAccountPage() {
        Assert.assertTrue(" Account Email is not matching ", myAccount.verify_Account_Email());
    }

    @And("User no input enter in email field as {string} on contact us page after login")
    public void userNoInputEnterInEmailFieldAsOnContactUsPageAfterLogin(String email) {
        contactUsLoggedUser.no_Input_Enter_In_Email_Field(email);
    }

    @Then("User should able to view email validation message {string} on contact us page after login")
    public void userShouldAbleToViewEmailValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Email is required validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_Email_Field());
    }

    @When("User enter the invalid input in email field as {string} on contact us page after login")
    public void userEnterTheInvalidInputInEmailFieldAsOnContactUsPageAfterLogin(String email) {
        contactUsLoggedUser.enter_The_Invalid_Email_In_Email_Field(email);
    }

    @Then("User able to view email validation msg {string} on contact us page after login")
    public void userAbleToViewEmailValidationMsgOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Please be sure a valid email is entered validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_When_Enter_Invalid_Email());
    }

    @When("User enter the valid input subject {string}  in subject field on contact us page after login")
    public void userEnterTheValidInputSubjectInSubjectFieldOnContactUsPageAfterLogin(String subject) {
        contactUsLoggedUser.enter_The_Valid_Subject_In_Subject_Field(subject);
    }

    @Then("Verify user should able to type valid subject more than one character on contact us page after login")
    public void verifyUserShouldAbleToTypeValidSubjectMoreThanOneCharacterOnContactUsPageAfterLogin() {
        Assert.assertTrue("Subject field contains invalid characters.", contactUsLoggedUser.validate_Subject_Field());
    }

    @And("User enter the invalid input subject less than two characters {string} in subject field on contact us page after login")
    public void userEnterTheInvalidInputSubjectLessThanTwoCharactersInSubjectFieldOnContactUsPageAfterLogin(String subject) {
        contactUsLoggedUser.enter_The_Invalid_Subject_In_Subject_Field(subject);
    }

    @Then("Verify user should able to view subject validation msg {string} on contact us page after login")
    public void verifyUserShouldAbleToViewSubjectValidationMsgOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("The subject must contain at least 2 characters validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_When_Enter_Invalid_Subject());
    }

    @And("User no input enter in subject field as {string} on contact us page after login")
    public void userNoInputEnterInSubjectFieldAsOnContactUsPageAfterLogin(String subject) {
        contactUsLoggedUser.no_Input_Enter_In_Subject_Field(subject);
    }

    @Then("User should able to view subject validation message {string} on contact us page after login")
    public void userShouldAbleToViewSubjectValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Subject is required validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_Subject_Field());
    }

    @When("User enter the valid input message {string} in message field on contact us page after login")
    public void userEnterTheValidInputMessageInMessageFieldOnContactUsPageAfterLogin(String message) {
        contactUsLoggedUser.enter_The_Valid_Message_In_Message_Field(message);
    }

    @Then("Verify user should able to type valid message more than one character on contact us page after login")
    public void verifyUserShouldAbleToTypeValidMessageMoreThanOneCharacterOnContactUsPageAfterLogin() {
        Assert.assertTrue("Message field contains invalid characters.", contactUsLoggedUser.validate_Message_Field());
    }

    @Then("Verify user observe the character count type 1 character in message field on contact us page after login")
    public void verifyUserObserveTheCharacterCountTypeCharacterInMessageFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.observe_Character_Count_Message_Field();
    }

    @When("User enter the valid input 250 character message in message field on contact us page after login")
    public void userEnterTheValidInputCharacterMessageInMessageFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.enter_The_Message_250_Character_In_Message_Field();
    }

    @Then("Verify user observe the character count type 250 characters in message field on contact us page after login")
    public void verifyUserObserveTheCharacterCountTypeCharactersInMessageFieldOnContactUsPageAfterLogin() {
        contactUsLoggedUser.observe_Character_250_Count_Message_Field();
    }

    @And("User enter the invalid input message {string} in message field on contact us page after login")
    public void userEnterTheInvalidInputMessageInMessageFieldOnContactUsPageAfterLogin(String message) {
        contactUsLoggedUser.enter_The_Invalid_Message_In_Message_Field(message);
    }

    @Then("User should able to view message validation message {string} on contact us page after login")
    public void userShouldAbleToViewMessageValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Message is required validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_When_Enter_Invalid_Message());
    }

    @And("User no input enter in message field as {string} on contact us page after login")
    public void userNoInputEnterInMessageFieldAsOnContactUsPageAfterLogin(String message) {
        contactUsLoggedUser.no_Input_Enter_In_Message_Field(message);
    }

    @Then("User should able to view message validation msg {string} on contact us page after login")
    public void userShouldAbleToViewMessageValidationMsgOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("Message is required validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_Message_Field());
    }

    @When("User clicks on add attachment link on contact us page after login")
    public void userClicksOnAddAttachmentLinkOnContactUsPageAfterLogin() {
        contactUsLoggedUser.click_On_Add_Attachment_Link();
    }

    @Then("User able to upload the file {string} on contact page after login")
    public void userAbleToUploadTheFileOnContactPageAfterLogin(String uploadFileName) {
        Assert.assertFalse("File is not upload on contact us page ", contactUsLoggedUser.upload_File(uploadFileName).isEmpty());
    }

    @Then("User should be able to select from the internal files of the system on contact us page after login")
    public void userShouldBeAbleToSelectFromTheInternalFilesOfTheSystemOnContactUsPageAfterLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_File_Visible_After_Upload());
    }

    @When("User able to upload the 3 files {string} {string} {string} one time on contact us page after login")
    public void userAbleToUploadTheFilesOneTimeOnContactUsPageAfterLogin(String uploadFileName1, String uploadFileName2, String uploadFileName3) {
        Assert.assertFalse("File is not upload on contact us page ", contactUsLoggedUser.upload_Multiple_File(uploadFileName1, uploadFileName2, uploadFileName3).isEmpty());
    }

    @Then("User should be able to select maximum 3 files collectively at a time from the internal files of the system on contact us page after login")
    public void userShouldBeAbleToSelectMaximumFilesCollectivelyAtATimeFromTheInternalFilesOfTheSystemOnContactUsPageAfterLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_File_Visible_After_Upload());
    }

    @And("User able to view image, name, size, cross icon, and white tick with green circle on contact us page after login")
    public void userAbleToViewImageNameSizeCrossIconAndWhiteTickWithGreenCircleOnContactUsPageAfterLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_File_Image_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_File_Size_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_File_Visible_After_Upload());
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_White_Tick_With_Green_Circle_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUsLoggedUser.verify_Cross_Icon_After_Upload_Successfully());
    }

    @When("User able to upload more than 10mb file {string} on contact page after login")
    public void userAbleToUploadMoreThanMbFileOnContactPageAfterLogin(String uploadFileName) {
        Assert.assertFalse("File is not upload on contact us page ", contactUsLoggedUser.upload_File(uploadFileName).isEmpty());
    }

    @Then("User able to view validation message {string} on contact us page after login")
    public void userAbleToViewValidationMessageOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals("More than 10 mb file validation msg text expected and actual are not same ", validationMsg, contactUsLoggedUser.verify_Validation_Msg_Upload_More_Than_10MB_File_After_Login());
    }

    @When("User clicks on cross icon on file attachment on contact us page after login")
    public void userClicksOnCrossIconOnFileAttachmentOnContactUsPageAfterLogin() {
        contactUsLoggedUser.click_On_Cross_Icon_On_File_Attachment();
    }

    @Then("User able to view uploaded file should be removed successfully on contact us page after login")
    public void userAbleToViewUploadedFileShouldBeRemovedSuccessfullyOnContactUsPageAfterLogin() {
        Assert.assertFalse(contactUsLoggedUser.validate_Cross_Icon_Functionality());
    }

    @Then("User able to view validation msg {string} on contact us page after login")
    public void userAbleToViewValidationMsgOnContactUsPageAfterLogin(String validationMsg) {
        Assert.assertEquals(" Maximum attachment limit exceeded text expected and actual are not same ", validationMsg, contactUsLoggedUser.view_Validation_Msg_Maximum_Attachment_Limit_Exceeded_After_Login());
    }

    @And("Verify User able to view Send Message button should be enabled on contact us page after login")
    public void verifyUserAbleToViewSendMessageButtonShouldBeEnabledOnContactUsPageAfterLogin() {
        Assert.assertTrue("Send Message button should not be enabled ", contactUsLoggedUser.verify_Send_Message_Button_Enabled());
    }

    @And("User able to view send message button is disabled on contact us page after login")
    public void userAbleToViewSendMessageButtonIsDisabledOnContactUsPageAfterLogin() {
        Assert.assertFalse("Send Message button should not be disabled ", contactUsLoggedUser.verify_Send_Message_Button_Disabled_When_Mandatory_Fields_Are_Not_Fills());
    }

    @When("User should able to clicks on send message button on contact us page after login")
    public void userShouldAbleToClicksOnSendMessageButtonOnContactUsPageAfterLogin() {
        contactUsLoggedUser.click_On_Send_Message_Button();
    }

    @Then("Verify user able to view toast message on contact us page after login")
    public void verifyUserAbleToViewToastMessageOnContactUsPageAfterLogin() {
        Assert.assertEquals(" Toast message text expected and actual are not same ", "We have received your message, please allow 24 hours for a team member to contact you", contactUsLoggedUser.verify_Toast_Msg_After_Click_Send_Message_Button());
    }

    @Then("User able to view field data should refreshed on contact us page after login")
    public void userAbleToViewFieldDataShouldRefreshedOnContactUsPageAfterLogin() {
        Assert.assertTrue("Subject field is not empty", contactUsLoggedUser.verify_Subject_Field_Data_Refreshed().isEmpty());
        Assert.assertTrue("Message field is not empty", contactUsLoggedUser.verify_Message_Field_Data_Refreshed().isEmpty());
    }

    @And("User stay back on the contact us page after login")
    public void userStayBackOnTheContactUsPageAfterLogin() {
        Assert.assertEquals("Contact us page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "contact#About-list", contactUsLoggedUser.verify_ContactUs_Page());
    }
}
