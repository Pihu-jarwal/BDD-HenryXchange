package org.xchange.pom;

import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageLoggedUser extends ContactUs {

    public ContactUsPageLoggedUser() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]")
    private WebElement whiteBackgroundColor;

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]//h1")
    private WebElement contactUs;

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]//h2")
    private WebElement howCanWeHelp;

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]//p")
    private WebElement descriptionText;

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]//h3[1]")
    private WebElement henryPhoneNumber;

    @FindBy(xpath = "//div[contains(@class,'marketWrapper')]//h3[2]")
    private WebElement sendAMessage;

    @FindBy(xpath = "//input[contains(@id,'name')]")
    private WebElement nameField;

    @FindBy(xpath = "//input[contains(@id,'email')]")
    private WebElement emailField;

    @FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[5]")
    private WebElement uploadMoreThan10MBFileValidationMsg;

    @FindBy(xpath = "(//div[contains(@class,'marketWrapper')]//p)[3]")
    private WebElement viewErrorMsgAfter3FilesUpload;

    static String name = null;

    static String email = null;


    public String verify_ContactUs_Page() {
        waitForElement(2);
        return driver.getCurrentUrl();
    }

    public void verify_White_Background_Color() {
        String color = whiteBackgroundColor.getCssValue("color");
        LogReporter.INFO(color);
        String expectedBackgroundColor = "rgba(0, 0, 0, 1)";
        Assert.assertEquals("White background color is not display ", expectedBackgroundColor, color);
    }

    public String view_ContactUs_Text() {
        return getText(contactUs);
    }

    public String view_How_Can_We_Help_Text() {
        return getText(howCanWeHelp);
    }

    public Boolean view_Description_Below_How_Can_We_Help_Text() {
        return isElementVisible(descriptionText);
    }

    public String view_Henry_Phone_Number() {
        return getText(henryPhoneNumber);
    }

    public String view_Placeholder_Text_Send_A_Message() {
        return getText(sendAMessage);
    }

    public void delete_Already_Existing_Name_Text() {
        clearText(nameField);
    }

    public String verify_Autofill_Name_In_Name_Field() {
        waitForElement(5);
        name = getAttributeValue(nameField);
        return name;
    }

    public void delete_Already_Existing_Email_Text() {
        clearText(emailField);
    }

    public String verify_Autofill_Email_In_Email_Field() {
        email = getAttributeValue(emailField);
        return email;
    }

    public String verify_Validation_Msg_Upload_More_Than_10MB_File_After_Login() {
        return getText(uploadMoreThan10MBFileValidationMsg);
    }

    public String view_Validation_Msg_Maximum_Attachment_Limit_Exceeded_After_Login() {
        waitForElement(8);
        return getText(viewErrorMsgAfter3FilesUpload);
    }
}
