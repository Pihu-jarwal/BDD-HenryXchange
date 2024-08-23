package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;

public class ContactUs extends Helper {

    public ContactUs() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[contains(@id,'name')]")
    private WebElement nameField;

    @FindBy(xpath = "//p[contains(@id,'name-helper-text')]")
    private WebElement nameFieldErrorMsg;

    @FindBy(xpath = "//input[contains(@id,'email')]")
    private WebElement emailField;

    @FindBy(xpath = "//p[contains(@id,'email-helper-text')]")
    private WebElement emailFieldErrorMsg;

    @FindBy(xpath = "//input[contains(@id,'subject')]")
    private WebElement subjectField;

    @FindBy(xpath = "//p[contains(@id,'subject-helper-text')]")
    private WebElement subjectFieldErrorMsg;

    @FindBy(xpath = "//textarea[contains(@id,'message')]")
    private WebElement messageField;

    @FindBy(xpath = "//div[contains(@class,'errMsg')]/following-sibling::p")
    private WebElement messageCountCharacter;

    @FindBy(xpath = "//p[contains(@class,'ctxt')]")
    private WebElement message250Character;

    @FindBy(xpath = "//p[contains(@id,'message')]")
    private WebElement messageFieldErrorMsg;

    @FindBy(xpath = "//span[text()='Add attachments']")
    private WebElement addAttachments;

    @FindBy(xpath = "//span[contains(@class,'hint')]")
    private WebElement hintAddAttachment;

    @FindBy(xpath = "//input[contains(@type,'file')]")
    private WebElement selectFile;

    @FindBy(xpath = "//span[@class=\"name\"]")
    private WebElement afterUploadfileName;

    @FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[3]")
    private WebElement uploadMoreThan10MBFileValidationMsg;

    @FindBy(xpath = "//div[contains(@class,'info')]/following-sibling::div[contains(@class,'MuiBox-root')]/*[name()='svg']")
    private WebElement crossIconFileAttachment;

    @FindBy(xpath = "//div[contains(@class,'info')]//p[2]/*[name()='svg']")
    private WebElement whiteTickWithGreenCircle;

    @FindBy(xpath = "//div[contains(@class,'ico')]/*[name()='svg']")
    private WebElement fileImage;

    @FindBy(xpath = "//div[contains(@class,'info')]//p[2]//span")
    private WebElement fileSize;

    @FindBy(xpath = "(//div[contains(@class,'main-flex')]//p)[4]")
    private WebElement viewErrorMsgAfter3FilesUpload;

    @FindBy(xpath = "//button[text()='Send Message']")
    private WebElement sendMessageButton;

    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-body')]/div[2]")
    private WebElement toastMsgAfterClickSendMsgButton;

    public Boolean verify_Name_Field() {
        return isElementVisible(nameField);
    }

    public Boolean verify_Email_Field() {
        return isElementVisible(emailField);
    }

    public boolean verify_Subject_Field() {
        return isElementVisible(subjectField);
    }

    public boolean verify_Message_Field() {
        return isElementVisible(messageField);
    }

    public String view_Add_Attachment() {
        return getText(addAttachments);
    }

    public String view_Placeholder_Text_Hint_Of_Add_Attachments() {
        return getText(hintAddAttachment);
    }

    public boolean verify_Send_Message_Button() {
        return isElementVisible(sendMessageButton);
    }

    public void enter_The_Valid_Name_In_Name_Field(String name) {
        sendKeys(nameField, name);
    }

    public Boolean validate_Name_Field_Contains_Character_And_Space() {
        return nameField.getAttribute("value").matches("^[a-zA-Z ]+$");
    }

    public void no_Input_Enter_In_Name_Field(String name) {
        sendKeys(nameField, name);
    }

    public void click_Outside_the_Field() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    public String verify_Validation_Msg_Name_Field() {
        return getText(nameFieldErrorMsg);
    }

    public void enter_The_Invalid_Name_In_Name_Field(String name) {
        sendKeys(nameField, name);
    }

    public String verify_Validation_Msg_When_Enter_Invalid_Name() {
        return getText(nameFieldErrorMsg);
    }

    public void enter_Less_Than_Two_Character_In_Name_Field(String name) {
        sendKeys(nameField, name);
    }

    public String verify_Validation_Msg_When_Enter_Less_Than_Two_Character_In_Name_Field() {
        return getText(nameFieldErrorMsg);
    }

    public void enter_The_Valid_Email_In_Email_Field(String email) {
        sendKeys(emailField, email);
    }

    public Boolean validate_Email_Field() {
        return emailField.getAttribute("value").matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public void no_Input_Enter_In_Email_Field(String email) {
        sendKeys(emailField, email);
    }

    public String verify_Validation_Msg_Email_Field() {
        return getText(emailFieldErrorMsg);
    }

    public void enter_The_Invalid_Email_In_Email_Field(String email) {
        sendKeys(emailField, email);
    }

    public String verify_Validation_Msg_When_Enter_Invalid_Email() {
        return getText(emailFieldErrorMsg);
    }

    public void enter_The_Valid_Subject_In_Subject_Field(String subject) {
        sendKeys(subjectField, subject);
    }

    public Boolean validate_Subject_Field() {
        return subjectField.getAttribute("value").length() > 1;
    }

    public void enter_The_Invalid_Subject_In_Subject_Field(String subject) {
        sendKeys(subjectField, subject);
    }

    public String verify_Validation_Msg_When_Enter_Invalid_Subject() {
        return getText(subjectFieldErrorMsg);
    }

    public void no_Input_Enter_In_Subject_Field(String subject) {
        sendKeys(subjectField, subject);
    }

    public String verify_Validation_Msg_Subject_Field() {
        return getText(subjectFieldErrorMsg);
    }

    public void enter_The_Valid_Message_In_Message_Field(String message) {
        sendKeys(messageField, message);
    }

    public Boolean validate_Message_Field() {
        return messageField.getAttribute("value").length() > 1;
    }

    public void observe_Character_Count_Message_Field() {
        int message = getAttributeValue(messageField).length();
        String messageText = String.valueOf(message);
        String charCountText = getText(messageCountCharacter).replace("/", "").replace("250", "").trim();
        Assert.assertEquals("Character count is incorrect.", messageText, charCountText);
    }

    public void enter_The_Message_250_Character_In_Message_Field() {
        String text = "This is a test message.";
        String message = null;
        for (int i = 0; i < 12; i++) {
            message = message + text;
        }
        sendKeys(messageField, message);
    }

    public void observe_Character_250_Count_Message_Field() {
        String messageLength = String.valueOf(messageField.getAttribute("value").length());
        String charCountText = message250Character.getText().replace("/250", "").trim();
        Assert.assertEquals("Character count is incorrect.", charCountText, messageLength);
    }

    public void enter_The_Invalid_Message_In_Message_Field(String message) {
        sendKeys(messageField, message);
    }

    public String verify_Validation_Msg_When_Enter_Invalid_Message() {
        return getText(messageFieldErrorMsg);
    }

    public void no_Input_Enter_In_Message_Field(String message) {
        sendKeys(messageField, message);
    }

    public String verify_Validation_Msg_Message_Field() {
        return getText(messageFieldErrorMsg);
    }

    public void click_On_Add_Attachment_Link() {
        waitForElement(8);
        clickByAction(addAttachments);
        waitForElement(5);
    }

    public String upload_File(String uploadFileName) {
        waitForElement(10);
        String file = fileUploadPath(uploadFileName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add attachments']")));
        element.sendKeys(file);
        waitForElement(10);
        return file;
    }

    public Boolean verify_File_Visible_After_Upload() {
        waitForElement(5);
        return isElementVisible(afterUploadfileName);
    }

    public String upload_Multiple_File(String uploadFileName1, String uploadFileName2, String uploadFileName3) {
        String file = uploadMultipleFiles(uploadFileName1, uploadFileName2, uploadFileName3);
        waitForElement(10);
        return file;
    }

    public String verify_Validation_Msg_Upload_More_Than_10MB_File() {
        waitForElement(3);
        return getText(uploadMoreThan10MBFileValidationMsg);
    }

    public void click_On_Cross_Icon_On_File_Attachment() {
        waitForElement(5);
        clickOnWebElement(crossIconFileAttachment);
    }

    public Boolean validate_Cross_Icon_Functionality() {
        waitForElement(5);
        return isElementVisible(afterUploadfileName, 10);
    }

    public Boolean verify_File_Image_After_Upload_Successfully() {
        return isElementVisible(fileImage);
    }

    public Boolean verify_File_Size_After_Upload_Successfully() {
        return isElementVisible(fileSize);
    }

    public Boolean verify_Cross_Icon_After_Upload_Successfully() {
        return isElementVisible(crossIconFileAttachment);
    }

    public Boolean verify_White_Tick_With_Green_Circle_After_Upload_Successfully() {
        return isElementVisible(whiteTickWithGreenCircle);
    }

    public String view_Validation_Msg_Maximum_Attachment_Limit_Exceeded() {
        waitForElement(8);
        return getText(viewErrorMsgAfter3FilesUpload);
    }

    public Boolean verify_Send_Message_Button_Enabled() {
        return sendMessageButton.isEnabled();
    }

    public Boolean verify_Send_Message_Button_Disabled_When_Mandatory_Fields_Are_Not_Fills() {
        return isEnabled(sendMessageButton);
    }

    public void click_On_Send_Message_Button() {
        waitForElement(5);
        scrollByVisibilityOfElement(driver, sendMessageButton);
        clickOnWebElementByJs(sendMessageButton);
        waitForElement(5);
    }

    public String verify_Toast_Msg_After_Click_Send_Message_Button() {
        waitforElementVisible(toastMsgAfterClickSendMsgButton, 10);
        return getText(toastMsgAfterClickSendMsgButton);
    }

    public String verify_Name_Field_Data_Refreshed() {
        waitForElement(5);
        return getAttributeValue(nameField);
    }

    public String verify_Email_Field_Data_Refreshed() {
        return getAttributeValue(emailField);
    }

    public String verify_Subject_Field_Data_Refreshed() {
        waitForElement(5);
        return getAttributeValue(subjectField);
    }

    public String verify_Message_Field_Data_Refreshed() {
        return getAttributeValue(messageField);
    }

}
