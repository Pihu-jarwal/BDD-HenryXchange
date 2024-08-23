package org.xchange.pom;

import com.github.javafaker.Faker;
import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class SignUpPage extends Helper {

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signupBtn;

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signUp;

    @FindBy(xpath = "//p[contains(text(),'Get Started')]")
    private WebElement signupScreen;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameOnSignUpPage;

    @FindBy(xpath = "//p[@id=\"firstName-helper-text\"]")
    private WebElement validationMsgFirstName;

    @FindBy(xpath = "//p[text()= 'Please enter a valid name']")
    private WebElement errorMessageFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameOnSignupPage;

    @FindBy(xpath = "//p[@id=\"lastName-helper-text\"]")
    private WebElement validationMsgLastName;

    @FindBy(xpath = "//p[text()= 'Please enter a valid name']")
    private WebElement errorMessageLastName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//p[@id='email-helper-text']")
    private WebElement emailValidationMsg;

    @FindBy(xpath = "(//div[contains(@class,'signUp')]//p)[3]")
    private WebElement deleteEmailErrorMsg;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement enterPassword;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement EyeIconOverPassword;

    @FindBy(xpath = "(//p[contains(@id,'password-helper-text')])[1]")
    private WebElement deletePasswordErrorMsg;

    @FindBy(xpath = "(//div[contains(@class,'signUp')]//p)[3]")
    private WebElement deleteConfirmPasswordErrorMsg;

    @FindBy(xpath = "//input[contains(@id,'confirm_password')]")
    private WebElement enterConfirmPassword;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement eyeIconOverConfirmPassword;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//p[contains(@id,'email-helper-text')]")
    private WebElement emailAlreadyExistMsg;

    @FindBy(xpath = "//p[@id='password-helper-text']")
    private WebElement passwordValidationMsg;

    @FindBy(xpath = "//p[@id='confirm_password-helper-text']")
    private WebElement confirmPasswordValidationMsg;

    @FindBy(xpath = "//p[@id='confirm_password-helper-text']")
    private WebElement passwordAndConfirmPasswordValidationMsg;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement homeScreenLogo;

    @FindBy(xpath = "//div[text() = 'OTP sent to email successfully!']")
    private WebElement otpSentEmailToastMsg;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement backToSignupButton;

    @FindBy(xpath = "//img[@alt='henry_logo']")
    private WebElement henryLogo;

    @FindBy(xpath = "//p[contains(text(),'Verify Email')]")
    private WebElement verifyEmailText;

    @FindBy(xpath = "//p[text() = 'Please enter the code sent to your email in order to continue with account creation']")
    private WebElement pleaseEnterCodeSentYourEmailOrderContinueWithAccountCreationText;

    @FindBy(xpath = "(//div[contains(@class,'otp-inputs')])[1]")
    private WebElement otpContainer;

    @FindBy(xpath = "//div[contains(@class,'otp-inputs')]//input")
    private List<WebElement> otp6Box;

    @FindBy(xpath = "//button[text() ='Confirm Code']")
    private WebElement confirmCode;

    @FindBy(xpath = "//p[@class='text-red']")
    private WebElement errorMsgWrongOtp;

    @FindBy(xpath = "//span[text() = 'Account Not Confirmed']")
    private WebElement accountNotConfirmed;

    @FindBy(xpath = "//span[text() = 'Account Not Confirmed']/following-sibling::p")
    private WebElement accountNotConfirmedText;

    @FindBy(xpath = "//span[text() = 'Account Not Confirmed']/following-sibling::button")
    private WebElement contactSupportButton;

    @FindBy(xpath = "//div[contains(@class,'verify-otp-auth')]//p")
    private WebElement didNot_Get_A_Code_Text;

    @FindBy(xpath = "//a[contains(text(),'Resend Code')]")
    private WebElement resendCode;

    @FindBy(xpath = "//div[text() = 'Code resent successfully!']")
    private WebElement codeResentSuccessfullyMsg;


    public String verify_Signup_Page() {
        return driver.getCurrentUrl();
    }

    public void click_On_First_Name_Text_Field() {
        clickOnWebElement(firstNameOnSignUpPage);
    }

    public void clear_Text_First_Name_Text_Field() {
        clearText(firstNameOnSignUpPage);
    }

    public void click_On_Last_Name_Text_Field() {
        clickOnWebElement(lastNameOnSignupPage);
    }

    public void clear_Text_Last_Name_Text_Field() {
        clearText(lastNameOnSignupPage);
    }

    public void enter_First_Name(String firstname) {
        sendKeys(firstNameOnSignUpPage, firstname);
        clickOnWebElement(lastNameOnSignupPage);
    }

    public void enter_Last_Name(String lastname) {
        sendKeys(lastNameOnSignupPage, lastname);
        clickOnWebElement(enterEmail);
    }

    public String verify_Validation_Msg_First_Name_Text_Field_Blank() {
        waitForElement(5);
        return getText(validationMsgFirstName);
    }

    public void verify_Validation_Msg_Last_Name_Text_Field_Blank() {
        Assert.assertTrue(true);
        isElementVisible(validationMsgLastName);
        waitForElement(2);
        clickOnWebElement(enterEmail);
        waitForElement(2);
        clickOnWebElement(firstNameOnSignUpPage);
    }

    public void check_Validation_Msg_First_Name(String fName) {
        sendKeys(firstNameOnSignUpPage, fName);
        Assert.assertTrue("First name is less than 2 character or is empty ", fName.length() >= 2);
    }

    public void check_Validation_Msg_Last_Name(String lName) {
        sendKeys(lastNameOnSignupPage, lName);
        Assert.assertTrue("Last name is less than 2 character or is empty ", lName.length() >= 2);
    }

    public String verify_Error_Msg_First_Name() {
        return getText(errorMessageFirstName);
    }

    public String verify_Error_Msg_Last_Name() {
        return getText(errorMessageLastName);
    }

    public void click_Enter_Email() {
        Assert.assertTrue(isElementVisible(enterEmail, 5));
        clickOnWebElement(enterEmail);
    }

    public void clear_Email_Text_field() {
        clickOnWebElement(enterEmail);
        waitForElement(2);
        clearText(enterEmail);
    }

    public void enter_Wrong_Email(String email) {
        Assert.assertTrue(isElementVisible(enterEmail));
        sendKeys(enterEmail, email);
    }

    public String verify_Email_Validation_Msg() {
        return getText(emailValidationMsg);
    }

    public String verify_Delete_Email_Error_Msg() {
        return getText(deleteEmailErrorMsg);
    }

    public void email_Field_Validation(String emailField) {
        enterEmail.sendKeys(emailField);
        String email = getAttributeValue(enterEmail);
        validateEmail(email);
    }

    public void email_Field_No_Max_Limit(String email) {
        sendKeys(enterEmail, email);
        String enterValue = getAttributeValue(enterEmail);
        Assert.assertTrue(enterValue.length() > 0);
    }

    public void enter_Email_Already_Registered_On_Signup_Page(String email) {
        sendKeys(enterEmail, email);
    }

    public void enter_The_Email_On_SignUp_Page(String email) {
        sendKeys(enterEmail, email);
    }

    public void click_On_Password_Text_Field_On_SignUp_Page() {
        clickOnWebElement(enterPassword);
    }

    public void enter_The_Password_On_SignUp_Page(String password) {
        sendKeys(enterPassword, password);
    }


    public void verify_Error_Msg_Less_Than_8_Character_Password() {
      getText(passwordValidationMsg);
    }


    public void verify_Error_Msg_Less_Than_8_Character_Confirm_Password() {
        String confirmPasswordText = getAttributeValue(enterConfirmPassword);
        Assert.assertFalse(confirmPasswordText.isEmpty());
        Assert.assertFalse(confirmPasswordText.length() >= 12);
    }

    public String dots_Password_View_Text_Field() {
        return enterPassword.getAttribute("type");
    }

    public void click_On_Eye_Icon_Over_Password_On_SignUp_Page() {
        waitForElement(3);
        clickOnWebElement(EyeIconOverPassword);
    }

    public String text_View_In_Password_Text_Field() {
        return getAttributeValue(enterPassword);
    }

    public String default_View_Password_Field() {
        isElementVisible(enterPassword, 10);
        return enterPassword.getAttribute("type");
    }

    public void enter_Valid_Password(String password) {
        sendKeys(enterPassword, password);
        String passwordText = getAttributeValue(enterPassword);
        Assert.assertFalse(enterPassword.getAttribute("type").isEmpty());
        Assert.assertTrue(passwordText.length() >= 12);
        clearText(enterPassword);
    }

    public String Error_Msg_Password_Required() {
        Assert.assertTrue(isElementVisible(deletePasswordErrorMsg, 5));
        return getText(deletePasswordErrorMsg);
    }

    public void click_On_Confirm_Password_Text_Field_In_SignUpPage() {
        clickOnWebElement(enterConfirmPassword);
    }

    public void enter_The_Confirm_Password_On_SignUp_Page(String confirmPassword) {
        waitForElement(2);
        sendKeys(enterConfirmPassword, confirmPassword);
        clickOutsideTheField();
    }

    public void click_On_Eye_Icon_Over_The_Confirm_Password_On_SignUp_Page() {
        clickByAction(eyeIconOverConfirmPassword);
        Assert.assertTrue(isElementVisible(eyeIconOverConfirmPassword));
        clickByAction(eyeIconOverConfirmPassword);
        Assert.assertFalse(isElementVisible(eyeIconOverConfirmPassword, 10));
    }

    public Boolean verify_Create_Account_Button_Disabled() {
        return isEnabled(createAccountBtn);
    }

    public String enter_Confirm_Password(String password) {
        sendKeys(enterConfirmPassword, password);
        String confirmPasswordText = enterConfirmPassword.getAttribute("type");
        clearText(enterConfirmPassword);
        return confirmPasswordText;
    }

    public String Error_Msg_Confirm_Password_Required() {
        scrollToHeightByJs();
        return getText(deleteConfirmPasswordErrorMsg);
    }

    public void click_On_Create_Account_Button_On_SignUp_Page() {
        waitForElement(5);
        scrollByVisibilityOfElement(driver, createAccountBtn);
        clickOnWebElement(createAccountBtn);
        waitForElement(2);
    }

    public String verify_Email_Already_Exist_Msg_On_SignUp_Page() {
        return getText(emailAlreadyExistMsg);
    }

    public String verify_Password_Validation_Msg_On_SignUpPage() {
        return getText(passwordValidationMsg);
    }

    public String verify_The_Validation_Msg_User_Enter_Different_Password_On_SignUp_Page() {
        return getText(passwordAndConfirmPasswordValidationMsg);
    }

    public void random_Email_Generation() {
        Faker faker = new Faker();
        String randomEmail = "muskan.trivedi+999" + faker.random().nextInt(1000) + "@" + "appinventiv.com";
        enterEmail.sendKeys(randomEmail);
    }

    public void verify_Back_To_Login_Button() {
        Assert.assertTrue(isElementVisible(backToSignupButton));
    }

    public Boolean verify_Henry_Logo() {
        Assert.assertTrue(isElementVisible(henryLogo));
        return henryLogo.isDisplayed();
    }

    public String verify_Email_Text() {
        waitForElement(2);
        return getText(verifyEmailText);
    }

    public String verify_Place_Holder_Text() {
        waitForElement(2);
        Assert.assertTrue(isElementVisible(pleaseEnterCodeSentYourEmailOrderContinueWithAccountCreationText));
        return getText(pleaseEnterCodeSentYourEmailOrderContinueWithAccountCreationText);
    }

    public Boolean verify_Otp_box() {
        return isElementVisible(otpContainer);
    }

    public Boolean confirm_Code_Button() {
        return isElementVisible(confirmCode);
    }

    public String didNot_Get_A_Code_Text() {
        String actualText = getText(didNot_Get_A_Code_Text).replace("Resend Code", "").trim();
        return actualText;
    }

    public String verify_Resent_Code_Button() {
        Assert.assertTrue(isElementVisible(resendCode));
        return getText(resendCode);
    }

    public void click_On_Resend_Button() {
        waitForElement(2);
        clickOnWebElement(resendCode);
    }

    public String verify_Code_Resent_Msg_Verify_Email_Page() {
        waitForElement(2);
        Assert.assertTrue(isElementVisible(codeResentSuccessfullyMsg, 5));
        return getText(codeResentSuccessfullyMsg);
    }

    public void check_Expiry_Otp(String expiryOtp) {
        sendkeysForOtp(otp6Box, expiryOtp);
    }

    public void enter_The_Character_In_Otp_Box(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
    }

    public Boolean check_Enter_Character_Validation() {
        for (int i = 0; i < otp6Box.size(); i++) {
            getAttributeValue(otp6Box.get(i));
        }
        return false;
    }

    public void enter_Wrong_Otp(String wrongOtp) {
        sendkeysForOtp(otp6Box, wrongOtp);
    }

    public void delete_otp_In_Boxes() {
        waitForElement(2);
        for (int i = otp6Box.size() - 1; i >= 0; i--) {
            otp6Box.get(i).sendKeys(Keys.BACK_SPACE);
        }
    }

    public void click_on_Confirm_Code_Button() {
        Assert.assertTrue(isElementVisible(confirmCode));
        boolean isButtonClickable = isEnabled(confirmCode);
        clickOnWebElement(confirmCode);
        Assert.assertTrue("Confirmation code button is not clickable.", isButtonClickable);
    }

    public String verify_Expiry_Code_Msg() {
        Assert.assertTrue(isElementVisible(errorMsgWrongOtp, 5));
        return getText(errorMsgWrongOtp);
    }

    public String verify_Account_Not_Confirmed_PopUp() {
        return getText(accountNotConfirmedText);
    }

    public Boolean verify_Contact_Support_button() {
        return isElementVisible(contactSupportButton);
    }

}
