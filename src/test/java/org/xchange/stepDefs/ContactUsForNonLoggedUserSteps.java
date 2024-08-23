package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.ContactUsPageNonLoggedUser;
import utils.PropertiesUtil;

public class ContactUsForNonLoggedUserSteps {

    ContactUsPageNonLoggedUser contactUs = new ContactUsPageNonLoggedUser();

    @Then("User should able to navigate to {string} contact us page before login")
    public void userShouldAbleToNavigateToContactUsPageBeforeLogin(String endPoint) {
        Assert.assertEquals("Contact us page is not visible", PropertiesUtil.getEnvironmentKey("URL") + endPoint, contactUs.verify_ContactUs_Page());
    }

    @And("User able to view black background of contact us page for non-logged user")
    public void userAbleToViewBlackBackgroundOfContactUsPageForNonLoggedUser() {
        contactUs.verify_Background_Color();
    }

    @And("User able to view header text {string} on contact us page before login")
    public void userAbleToViewHeaderTextOnContactUsPageBeforeLogin(String contactus) {
        Assert.assertEquals("Contact us expected and actual text are not same ", contactus, contactUs.view_ContactUs_Text());
    }


    @And("User able to view placeholder text How Can We Help? as {string} on contact us page before login")
    public void userAbleToViewPlaceholderTextHowCanWeHelpAsOnContactUsPageBeforeLogin(String howCanIHepYou) {
        Assert.assertEquals("How can i help you expected and actual text are not same", howCanIHepYou, contactUs.view_How_Can_We_Help_Text());
    }

    @And("User able to view description below the how can help you text on contact us page before login")
    public void userAbleToViewDescriptionBelowTheHowCanHelpYouTextOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Description is not displayed on contact us page", contactUs.view_Description_Below_How_Can_We_Help_Text());
    }

    @And("User able to view Henry phone number {string} on contact us page before login")
    public void userAbleToViewHenryPhoneNumberOnContactUsPageBeforeLogin(String henryPhoneNumber) {
        Assert.assertEquals("Henry phone number expected and actual text are not same", henryPhoneNumber, contactUs.view_Henry_Phone_Number());
    }

    @And("User able to view placeholder text Send a message as {string} on contact us page before login")
    public void userAbleToViewPlaceholderTextSendAMessageAsOnContactUsPageBeforeLogin(String sendAMessage) {
        Assert.assertEquals("Send A Message expected and actual text are not same", sendAMessage, contactUs.view_Placeholder_Text_Send_A_Message());
    }

    @And("User able to view name field on contact us page before login")
    public void userAbleToViewNameFieldOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Name field is not displayed on contact us page", contactUs.verify_Name_Field());
    }

    @And("User able to view email field on contact us page before login")
    public void userAbleToViewEmailFieldOnContactUsPageBeforeLogin() {
        Assert.assertTrue(" Email field is not displayed on contact us page", contactUs.verify_Email_Field());
    }

    @And("User able to view subject field on contact us page before login")
    public void userAbleToViewSubjectFieldOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Subject field is not displayed on contact us page", contactUs.verify_Subject_Field());
    }

    @And("User able to view message field on contact us page before login")
    public void userAbleToViewMessageFieldOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Message field is not displayed on contact us page", contactUs.verify_Message_Field());
    }

    @And("User able to view Add attachments as {string} on contact us page before login")
    public void userAbleToViewAddAttachmentsAsOnContactUsPageBeforeLogin(String addAttachment) {
        Assert.assertEquals("Add attachments expected and actual text are not same", addAttachment, contactUs.view_Add_Attachment());
    }

    @And("User able to view placeholder hint text {string} on contact us page before login")
    public void userAbleToViewPlaceholderHintTextOnContactUsPageBeforeLogin(String hint) {
        Assert.assertEquals("Add attachments hint expected and actual text are not same", hint, contactUs.view_Placeholder_Text_Hint_Of_Add_Attachments());
    }

    @And("User able to view send message button on contact us page before login")
    public void userAbleToViewSendMessageButtonOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Send message button is not displayed on contact us page ", contactUs.verify_Send_Message_Button());
    }

    @When("User enter the valid input name as {string} on contact us page before login")
    public void userEnterTheValidInputNameAsOnContactUsPageBeforeLogin(String name) {
        contactUs.enter_The_Valid_Name_In_Name_Field(name);
    }

    @Then("Verify name field contains only characters and spaces include between the character on contact us page before login")
    public void verifyNameFieldContainsOnlyCharactersAndSpacesIncludeBetweenTheCharacterOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Name field contains invalid characters.", contactUs.validate_Name_Field_Contains_Character_And_Space());
    }

    @When("User no input enter in name field as {string} on contact us page before login")
    public void userNoInputEnterInNameFieldAsOnContactUsPageBeforeLogin(String name) {
        contactUs.no_Input_Enter_In_Name_Field(name);
    }

    @And("User click outside the field on contact us page before login")
    public void userClickOutsideTheFieldOnContactUsPageBeforeLogin() {
        contactUs.click_Outside_the_Field();
    }

    @Then("User should able to view name validation message {string} on contact us page before login")
    public void userShouldAbleToViewNameValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Name is required validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_Name_Field());
    }

    @When("User enter the invalid input in name field as {string} on contact us page before login")
    public void userEnterTheInvalidInputInNameFieldAsOnContactUsPageBeforeLogin(String name) {
        contactUs.enter_The_Invalid_Name_In_Name_Field(name);
    }

    @Then("User able to view name validation msg on contact us page before login")
    public void userAbleToViewNameValidationMsgOnContactUsPageBeforeLogin() {
        String expected = "Please enter a valid name. A name should not contain special characters or numeric characters.";
        Assert.assertEquals("Invalid Name validation msg text expected and actual are not same ", expected, contactUs.verify_Validation_Msg_When_Enter_Invalid_Name());
    }

    @When("User enter less than two character input in name field as {string} on contact us page before login")
    public void userEnterLessThanTwoCharacterInputInNameFieldAsOnContactUsPageBeforeLogin(String name) {
        contactUs.enter_Less_Than_Two_Character_In_Name_Field(name);
    }

    @Then("User able to view name validation message {string} on contact us page before login")
    public void userAbleToViewNameValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Your name must contain at least 2 character validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_When_Enter_Less_Than_Two_Character_In_Name_Field());
    }

    @When("User enter the valid email in email field as {string} on contact us page before login")
    public void userEnterTheValidEmailInEmailFieldAsOnContactUsPageBeforeLogin(String email) {
        contactUs.enter_The_Valid_Email_In_Email_Field(email);
    }

    @Then("Verify user should be able to type valid email address having @ and a domain \\(.com, .org) on contact us page before login")
    public void verifyUserShouldBeAbleToTypeValidEmailAddressHavingAndADomainComOrgOnContactUsPage() {
        Assert.assertTrue("Email adress is not valid", contactUs.validate_Email_Field());
    }

    @And("User no input enter in email field as {string} on contact us page before login")
    public void userNoInputEnterInEmailFieldAsOnContactUsPageBeforeLogin(String email) {
        contactUs.no_Input_Enter_In_Email_Field(email);
    }

    @Then("User should able to view email validation message {string} on contact us page before login")
    public void userShouldAbleToViewEmailValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Email is required validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_Email_Field());
    }

    @When("User enter the invalid input in email field as {string} on contact us page before login")
    public void userEnterTheInvalidInputInEmailFieldAsOnContactUsPageBeforeLogin(String email) {
        contactUs.enter_The_Invalid_Email_In_Email_Field(email);
    }

    @Then("User able to view email validation msg {string} on contact us page before login")
    public void userAbleToViewEmailValidationMsgOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Please be sure a valid email is entered validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_When_Enter_Invalid_Email());
    }

    @When("User enter the valid input subject {string}  in subject field on contact us page before login")
    public void userEnterTheValidInputSubjectInSubjectFieldOnContactUsPageBeforeLogin(String subject) {
        contactUs.enter_The_Valid_Subject_In_Subject_Field(subject);
    }

    @Then("Verify user should able to type valid subject more than one character on contact us page before login")
    public void verifyUserShouldAbleToTypeValidSubjectMoreThanOneCharacterOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Subject field contains invalid characters.", contactUs.validate_Subject_Field());
    }

    @When("User enter the invalid input subject less than two characters {string} in subject field on contact us page before login")
    public void userEnterTheInvalidInputSubjectLessThanTwoCharactersInSubjectFieldOnContactUsPageBeforeLogin(String subject) {
        contactUs.enter_The_Invalid_Subject_In_Subject_Field(subject);
    }

    @Then("Verify user should able to view subject validation msg {string} on contact us page before login")
    public void verifyUserShouldAbleToViewSubjectValidationMsgOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("The subject must contain at least 2 characters validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_When_Enter_Invalid_Subject());
    }

    @And("User no input enter in subject field as {string} on contact us page before login")
    public void userNoInputEnterInSubjectFieldAsOnContactUsPageBeforeLogin(String subject) {
        contactUs.no_Input_Enter_In_Subject_Field(subject);
    }

    @Then("User should able to view subject validation message {string} on contact us page before login")
    public void userShouldAbleToViewSubjectValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Subject is required validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_Subject_Field());
    }

    @And("User enter the valid input message {string} in message field on contact us page before login")
    public void userEnterTheValidInputMessageInMessageFieldOnContactUsPageBeforeLogin(String message) {
        contactUs.enter_The_Valid_Message_In_Message_Field(message);
    }

    @Then("Verify user should able to type valid message more than one character on contact us page before login")
    public void verifyUserShouldAbleToTypeValidMessageMoreThanOneCharacterOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Message field contains invalid characters.", contactUs.validate_Message_Field());
    }

    @Then("Verify user observe the character count type 1 character in message field on contact us page before login")
    public void verifyUserObserveTheCharacterCountTypeCharacterInMessageFieldOnContactUsPageBeforeLogin() {
        contactUs.observe_Character_Count_Message_Field();
    }

    @When("User enter the valid input 250 character message in message field on contact us page before login")
    public void userEnterTheValidInputCharacterMessageInMessageFieldOnContactUsPageBeforeLogin() {
        contactUs.enter_The_Message_250_Character_In_Message_Field();
    }

    @Then("Verify user observe the character count type 250 characters in message field on contact us page before login")
    public void verifyUserObserveTheCharacterCountTypeCharactersInMessageFieldOnContactUsPageBeforeLogin() {
        contactUs.observe_Character_250_Count_Message_Field();
    }

    @And("User enter the invalid input message {string} in message field on contact us page before login")
    public void userEnterTheInvalidInputMessageInMessageFieldOnContactUsPageBeforeLogin(String message) {
        contactUs.enter_The_Invalid_Message_In_Message_Field(message);
    }

    @Then("User should able to view message validation message {string} on contact us page before login")
    public void userShouldAbleToViewMessageValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Message is required validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_When_Enter_Invalid_Message());
    }

    @And("User no input enter in message field as {string} on contact us page before login")
    public void userNoInputEnterInMessageFieldAsOnContactUsPageBeforeLogin(String message) {
        contactUs.no_Input_Enter_In_Message_Field(message);
    }

    @Then("User should able to view message validation msg {string} on contact us page before login")
    public void userShouldAbleToViewMessageValidationMsgOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("Message is required validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_Message_Field());
    }

    @When("User clicks on add attachment link on contact us page before login")
    public void userClicksOnAddAttachmentLinkOnContactUsPageBeforeLogin() {
        contactUs.click_On_Add_Attachment_Link();
    }

    @Then("User able to upload the file {string} on contact page before login")
    public void userAbleToUploadTheFileOnContactPageBeforeLogin(String uploadFileName) {
        Assert.assertFalse("File is not upload on contact us page ", contactUs.upload_File(uploadFileName).isEmpty());
    }

    @Then("User should be able to select from the internal files of the system on contact us page before login")
    public void userShouldBeAbleToSelectFromTheInternalFilesOfTheSystemOnContactPageBeforeLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_File_Visible_After_Upload());
    }

    @When("User able to upload the 3 files {string} {string} {string} one time on contact us page before login")
    public void userAbleToUploadTheFilesOneTimeOnContactUsPageBeforeLogin(String uploadFileName1, String uploadFileName2, String uploadFileName3) {
        Assert.assertFalse("File is not upload on contact us page ", contactUs.upload_Multiple_File(uploadFileName1, uploadFileName2, uploadFileName3).isEmpty());
    }

    @Then("User should be able to select maximum 3 files collectively at a time from the internal files of the system on contact us page before login")
    public void userShouldBeAbleToSelectMaximumFilesCollectivelyAtATimeFromTheInternalFilesOfTheSystemOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_File_Visible_After_Upload());
    }

    @When("User able to upload more than 10mb file {string} on contact page before login")
    public void userAbleToUploadMoreThanMbFileOnContactPageBeforeLogin(String uploadFileName) {
        Assert.assertFalse("File is not upload on contact us page ", contactUs.upload_File(uploadFileName).isEmpty());
    }

    @Then("User able to view validation message {string} on contact us page before login")
    public void userAbleToViewValidationMessageOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals("More than 10 mb file validation msg text expected and actual are not same ", validationMsg, contactUs.verify_Validation_Msg_Upload_More_Than_10MB_File());
    }

    @When("User clicks on cross icon on file attachment on contact us page before login")
    public void userClicksOnCrossIconOnFileAttachmentOnContactUsPageBeforeLogin() {
        contactUs.click_On_Cross_Icon_On_File_Attachment();
    }

    @Then("User able to view uploaded file should be removed successfully on contact us page before login")
    public void userAbleToViewUploadedFileShouldBeRemovedSuccessfullyOnContactUsPageBeforeLogin() {
        Assert.assertFalse(contactUs.validate_Cross_Icon_Functionality());
    }

    @And("User able to view image, name, size, cross icon, and white tick with green circle on contact us page before login")
    public void userAbleToViewImageNameSizeCrossIconAndWhiteTickWithGreenCircleOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_File_Image_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_File_Size_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_File_Visible_After_Upload());
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_White_Tick_With_Green_Circle_After_Upload_Successfully());
        Assert.assertTrue("Upload file is not displayed ", contactUs.verify_Cross_Icon_After_Upload_Successfully());
    }

    @Then("User able to view validation msg {string} on contact us page before login")
    public void userAbleToViewValidationMsgOnContactUsPageBeforeLogin(String validationMsg) {
        Assert.assertEquals(" Maximum attachment limit exceeded text expected and actual are not same ", validationMsg, contactUs.view_Validation_Msg_Maximum_Attachment_Limit_Exceeded());
    }

    @Then("Verify User able to view Send Message button should be enabled on contact us page before login")
    public void verifyUserAbleToViewSendMessageButtonShouldBeEnabledOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Send Message button should not be enabled ", contactUs.verify_Send_Message_Button_Enabled());
    }

    @And("User able to view send message button is disabled on contact us page before login")
    public void userAbleToViewSendMessageButtonIsDisabledOnContactUsPageBeforeLogin() {
        Assert.assertFalse("Send Message button should not be disabled ", contactUs.verify_Send_Message_Button_Disabled_When_Mandatory_Fields_Are_Not_Fills());
    }

    @When("User should able to clicks on send message button on contact us page before login")
    public void userShouldAbleToClicksOnSendMessageButtonOnContactUsPageBeforeLogin() {
        contactUs.click_On_Send_Message_Button();
    }

    @Then("Verify user able to view toast message on contact us page before login")
    public void verifyUserAbleToViewToastMessageOnContactUsPageBeforeLogin() {
        Assert.assertEquals(" Toast message text expected and actual are not same ", "We have received your message, please allow 24 hours for a team member to contact you", contactUs.verify_Toast_Msg_After_Click_Send_Message_Button());
    }

    @Then("User able to view field data should refreshed on contact us page before login")
    public void userAbleToViewFieldDataShouldRefreshedOnContactUsPageBeforeLogin() {
        Assert.assertTrue("Name field is not empty", contactUs.verify_Name_Field_Data_Refreshed().isEmpty());
        Assert.assertTrue("Email field is not empty", contactUs.verify_Email_Field_Data_Refreshed().isEmpty());
        Assert.assertTrue("Subject field is not empty", contactUs.verify_Subject_Field_Data_Refreshed().isEmpty());
        Assert.assertTrue("Message field is not empty", contactUs.verify_Message_Field_Data_Refreshed().isEmpty());
    }

    @And("User stay back on the contact us page before login")
    public void userStayBackOnTheContactUsPageBeforeLogin() {
        Assert.assertEquals("Contact us page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "contact-us#About-list", contactUs.verify_ContactUs_Page());
    }

}
