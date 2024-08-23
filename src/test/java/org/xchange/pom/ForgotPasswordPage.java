package org.xchange.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

public class ForgotPasswordPage extends Helper {

    public ForgotPasswordPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//p[contains(@class,'heading-text')]")
    private WebElement resetPassword;

    @FindBy(xpath = "//p[contains(@class,'heading-text')]/following-sibling::p")
    private WebElement subHeading;

    @FindBy(xpath = "//button[contains(@class,'back-to-login')]")
    private WebElement backToLogin;

    @FindBy(xpath = "//button[text()='Send Code']")
    private WebElement sendCodeBtn;

    @FindBy(css = "p[id='email-helper-text']")
    private WebElement emailFieldValidationMsg;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(xpath = "//a[text()='create a new account']/..")
    private WebElement errorMsg;

    @FindBy(xpath = "//button[contains(@class,'Mui-disabled') and contains(text(),'Send Code')]")
    private WebElement sendCode;

    @FindBy(xpath = "//p[contains(@class,'hint-text')]")
    private WebElement hintText;

    @FindBy(xpath = "//p[contains(@class,'heading-text')]")
    private WebElement headingText;

    @FindBy(xpath = "//p[contains(@class,'alreadySignIn')]")
    private WebElement getCodeText;

    @FindBy(xpath = "//*[contains(@class,'submit-btn')]")
    private WebElement confirmCodeBtn;

    @FindBy(css = "p[class='text-red']")
    private WebElement validationMsgOfOTP;

    @FindBy(xpath = "//a[contains(@class,'MuiLink-underlineAlways')]")
    private WebElement resendCodeLink;

    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-icon')]/following-sibling::div")
    private WebElement otpCodeMsg;

    @FindBy(xpath = "//span[@class='timer']")
    private WebElement timer;

    public void click_On_Forgot_Password_Link(){
        clickOnWebElement(forgotPasswordLink);
    }

    public String get_Current_Url(){
        return driver.getCurrentUrl();
    }

    public boolean is_Forgot_Password_Link_Visible(){
        return isElementVisible(forgotPasswordLink);
    }

    public String verify_Reset_Password(){
        return getText(resetPassword);
    }

    public boolean verify_Reset_Password_Text(){
        return isElementVisible(resetPassword);
    }

    public boolean verify_Reset_Password_Sub_Heading(){
        return isElementVisible(subHeading);
    }

    public boolean verify_Back_To_Login_Button(){
        return isElementVisible(backToLogin);
    }

    public boolean is_Send_Code_Button_Visible(){
        return isElementVisible(sendCodeBtn);
    }

    public void click_On_Back_To_Login_Button(){
        clickOnWebElement(backToLogin);
    }

    public void enter_Email_In_Input_Field(String email){
        sendKeys(emailField ,email);
    }

    public void verify_Is_Email_Valid(){
        validateEmail(getAttributeValue(emailField));
    }

    public void click_On_Outside_The_Field(){
        clickByAction(sendCodeBtn);
        waitForElement(3);
    }

    public void click_On_Email_Field(){
        clickOnWebElement(emailField);
    }

    public String verify_Email_Field_Validation_Msg(){
        return getText(emailFieldValidationMsg);
    }

    public String verify_Error_Msg(){
        return getText(errorMsg);
    }

    public boolean is_Send_Code_Button_Enabled(){
        return isElementVisible(sendCode);
    }

    public boolean is_Heading_Text_Visible(){
        return isElementVisible(headingText);
    }

    public boolean is_Hint_Text_Visible(){
        return isElementVisible(headingText);
    }

    public boolean is_Did_Not_Get_Code_Text_Visible(){
        return isElementVisible(getCodeText);
    }

    public boolean verify_Confirm_Code_Button(){
        return isElementVisible(confirmCodeBtn);
    }

    public boolean is_Confirm_Code_button_Disabled(){
        return confirmCodeBtn.isEnabled();
    }

    public void click_On_Confirm_Code_Button(){
        waitForElement(2);
        clickOnWebElement(confirmCodeBtn);
    }

    public String verify_Validation_Msg(){
        waitForElement(2);
        return getText(validationMsgOfOTP);
    }

    public void click_On_Resend_Code_Btn(){
        clickOnWebElement(resendCodeLink);
    }

    public boolean is_Resend_Button_Visible(){
        return isElementVisible(resendCodeLink);
    }

    public boolean verify_OTP_Sent_Successfully_Msg(){
        return isElementVisible(otpCodeMsg);
    }

    public String verify_OTP_Timer(){
        return getText(timer);
    }

    public boolean verify_Confirm_Code_Button_Is_Enabled(){
        return confirmCodeBtn.isEnabled();
    }

}
