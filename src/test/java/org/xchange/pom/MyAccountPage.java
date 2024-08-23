package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;
import java.util.List;

public class MyAccountPage extends Helper {

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='MARKET']")
    private WebElement marketTab;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-xdhp2n']")
    private WebElement accountSetupPercentage;

    @FindBy(xpath = "//div[contains(@class,'MuiAvatar-circular')]")
    private WebElement profileIcon;

    @FindBy(xpath = "//ul[contains(@class,'MuiMenu-list')]")
    private List<WebElement> profileMenuItem;

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    private WebElement account;

    @FindBy(xpath = "//p[text()='Account']")
    private WebElement accountText;

    @FindBy(xpath = "//p[text()='Name']//descendant::span[text()='Edit']")
    private WebElement editNameButtonAccountPage;


    @FindBy(xpath = "//p[text()='Edit Name']")
    private WebElement verifyEditTextNameEditScreen;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameEditNameAccountPopup;

    @FindBy(xpath = "//p[@id=\"first_name-helper-text\"]")
    private WebElement validationMsgFirstName;

    @FindBy(xpath = "//p[text() = 'Please enter a valid name']")
    private WebElement errorMsgFirstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastNameEditNameAccountPopup;

    @FindBy(xpath = "//p[@id=\"last_name-helper-text\"]")
    private WebElement validationMsgLastName;

    @FindBy(xpath = "//p[text() = 'Please enter a valid name']")
    private WebElement errorMsgLastName;

    @FindBy(xpath = "//button[text() = 'Cancel']")
    private WebElement cancelButtonEditName;

    @FindBy(xpath = "//button[text()='Save Changes']")
    private WebElement saveChangesButtonEditNameAccountPopup;

    @FindBy(xpath = "//div[contains(text(),'Name updated sucessfully')]")
    private WebElement verifyMsgNameUpdatedSuccessfully;

    @FindBy(xpath = "(//span[contains(@class,'options')])[2]")
    private WebElement editEmail;

    @FindBy(xpath = "//p[text() = 'Edit Email']")
    private WebElement emailTextPopup;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailTextField;

    @FindBy(xpath = "//div[contains(@class,'btn_holder')]//button[@type='reset']")
    private WebElement cancelEmailBtn;

    @FindBy(xpath = "//div[contains(@class,'btn_holder')]//button[@type='submit']")
    private WebElement verifyEmailBtn;

    @FindBy(xpath = "//span[contains(text(),'Logout')]")
    private WebElement logoutButtonInAccountMenu;

    @FindBy(xpath = "//p[text() = 'Logout']")
    private WebElement verifyLogoutTextNameLogoutScreen;

    @FindBy(xpath = "//p[text() = 'Are you sure you want to logout?']")
    private WebElement areYouSureWantLogoutMsg;

    @FindBy(xpath = "//button[@type='reset']")
    private WebElement ResetButton;

    @FindBy(xpath = "//button[text()='Logout']")
    private WebElement logoutButtonLogoutScreen;

    @FindBy(xpath = "//div[contains(text(),'User Logged Out Successfully')]")
    private WebElement verifyUserLogoutSuccessfully;

    @FindBy(xpath = "//div[contains(@class,'common_box_account first_profiel')]/p")
    private List<WebElement> profileData;

    @FindBy(xpath = "//div[contains(text(),'Your KYC')]")
    private WebElement kycNotCompleted;

    @FindBy(xpath = "(//p[contains(text(),'Account Set-up')])[1]")
    private WebElement finishAccountSetup;

    @FindBy(xpath = "(//p[text()='Auth']/following-sibling::p)[2]")
    private WebElement authEmailField;

    @FindBy(xpath = "//div[contains(@class,'updaebtn')]")
    private WebElement updateBtnForKyc;

    @FindBy(xpath = "//img[@alt='password icon']")
    private WebElement passwordField;

    @FindBy(xpath = "//p[contains(@class,'address_panel')]")
    private WebElement address;

    @FindBy(xpath = "//p[contains(@class,'verified_text')]")
    private WebElement kycVerified;

    @FindBy(xpath = "(//p[contains(@class,'auth_email')])[2]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//p[@class='title']")
    private WebElement permissionEditNameTitle;

    @FindBy(xpath = "//p[contains(@class,'sub-title')]")
    private WebElement subTitleOfEditName;

    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//div[contains(@class,'first_profiel')]//p[3]")
    private WebElement accountName;

    @FindBy(xpath = "//div[contains(@class,'auth_holder')]//p[3]")
    private WebElement accountEmail;

    @FindBy(xpath = "//p[text()='Phone Number']/following-sibling::p/span")
    private WebElement phoneNumberEdit;

    @FindBy(xpath = "//div[contains(@class,'MuiStepper-root')]")
    private WebElement editMobileNumberPopup;

    @FindBy(xpath = "//p[@id='standard-helperText-helper-text']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//p[@id=\"standard-helperText-helper-text\"]")
    private WebElement voipValidationMsg;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirmButton;

    @FindBy(xpath = "//span[contains(@class,'MuiRadio-colorPrimary Mui-checked')]/input[@value='sms']")
    private WebElement smsCheckboxSelected;

    @FindBy(xpath = "(//input[@name=\"row-radio-buttons-group\"])[2]")
    private  WebElement smsCheckbox;

    @FindBy(xpath = "//button[text()='Verify Mobile Number']")
    private WebElement verifyMobileNumberBtn;

    @FindBy(xpath = "//span[contains(@class,'Mui-active') and contains(text(),'Request Details')]")
    private WebElement requestDetailOption;

    @FindBy(id = "standard-helperText")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//div[contains(@class,'MuiInputAdornment-positionEnd')]")
    private WebElement greenTick;

    @FindBy(id = "standard-helperText-helper-text")
    private WebElement ViopValidationMsg;

    @FindBy(xpath = "(//*[starts-with(@id,\"path-\")])//*[@clip-rule=\"evenodd\"]")
    private WebElement crossIcon;

    @FindBy(xpath = "//h4[contains(text(),'Verify Mobile Number')]")
    private WebElement mobileNumberText;

    @FindBy(xpath = "//span[contains(@class,'iconContainer Mui-completed')]")
    private WebElement iconWithGreenCircle;

    @FindBy(xpath = "//p[contains(text(),'Didn’t get')]")
    private WebElement didNotGetOTP;

    @FindBy(xpath = "//button[contains(text(),'Change Mobile Number')]")
    private WebElement changeMobileNumberBtn;

    @FindBy(xpath = "//button[contains(text(),'Confirm Code')]")
    private WebElement confirmCodeBtn;

    @FindBy(xpath = "//div[contains(@class,'error_line')]")
    private WebElement errorLine;

    @FindBy(xpath = "(//div[contains(@class,'OtpInputHolder error2')]/p)[1]")
    private WebElement errorMsg;

    @FindBy(xpath = "//a[text()='Resend Code']")
    private WebElement resendCodeBtn;

    @FindBy(xpath = "//div[contains(text(),'Code resent successfully!')]")
    private WebElement resendCodeMsg;

    @FindBy(xpath = "//button[contains(text(),'Stay logged In')]")
    private WebElement stayLoggedInBtn;

    @FindBy(xpath = "//p[contains(@class,'verified_heading')]")
    private WebElement verifiedPopupHeading;

    @FindBy(xpath = "//p[contains(@class,'id_verified_sub')]")
    private WebElement notVerifiedPopupSubHeading;

    @FindBy(xpath = "(//img[@alt=\"close-icon\"])[1]")
    private WebElement closeIcon;

    @FindBy(xpath = "//p[text()='Address']/span[text()='Edit']")
    private WebElement addressEditOption;

    @FindBy(xpath = "//div[contains(@class,'MuiPaper-elevation')]")
    private WebElement addressEditPopup;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[text()='Save Changes']")
    private WebElement saveChangesButton;

    @FindBy(id = "aptsuite")
    private WebElement aptSuite;

    @FindBy(id="zipcode")
    private WebElement zipCode;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id ="zipcode-helper-text")
    private WebElement zipcodeFieldErrorMsg;

    @FindBy(xpath = "//h4[contains(@class,'MuiTypography-root') and contains(text(),'Did you mean this Address ?')]")
    private WebElement didYouMeanAddress;

    @FindBy(xpath = "//span[contains(@class,' MuiRadio-colorDefault Mui-checked')]")
    private WebElement defaultCheckbox;

    @FindBy(xpath = "//label[text()='Recommended']/following-sibling::label/span/input")
    private WebElement recommendedAddress;

    @FindBy(xpath = "//label[text()='Recommended']")
    private WebElement recommended;

    @FindBy(xpath = "//label[contains(text(),'Recommended')]/following-sibling::label/span[contains(@class,'Mui-checked')]")
    private WebElement recommendedCheckboxActive;

    @FindBy(xpath = "//p[contains(text(),'Account Recovery Mode')]/following-sibling::p")
    private WebElement accountRecoveryUpdateBtn;

    @FindBy(xpath = "//div[contains(@class,'verification_field')]")
    private WebElement verificationPopup;

    @FindBy(xpath = "//label[contains(@class,'labelPlacementEnd checked')]")
    private WebElement emailOption;

    @FindBy(xpath = "//input[@value='email']")
    private WebElement emailCheckbox;

    @FindBy(xpath = "//div[contains(@class,'radioTitle') and contains(text(),' SMS (Text Message) ')]")
    private WebElement smsOption;

    @FindBy(xpath = "//div[contains(@class,'editbtn')]/p[text()='Password']/span")
    private WebElement passwordEditOption;

    @FindBy(xpath = "(//div[contains(@class,'OtpNewModa')])[2]")
    private WebElement otpPopup;

    @FindBy(xpath = "//div[@class='otp-inputs']")
    private WebElement otpField;

    @FindBy(xpath = "//p[contains(text(),'OTP')]")
    private WebElement otpText;

    @FindBy(xpath = "//p[contains(@class,'alreadySignIn')]")
    private WebElement alreadySignIn;

    @FindBy(xpath = "//p[text()='ID Verified']")
    private WebElement idVerified;

    @FindBy(xpath = "//p[contains(text(),'Your ID has been')]")
    private WebElement yourIDPlaceholderText;

    @FindBy(xpath = "//p[contains(text(),'Edit Password')]")
    private WebElement editPassword;

    @FindBy(xpath = "//a[text()='Resend Code']")
    private WebElement resendCodeLink;

    @FindBy(name = "oldPassword")
    private WebElement oldPassword;

    @FindBy(name = "newPassword")
    private WebElement newPassword;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "(//button[contains(@class,'MuiIconButton')])[1]")
    private WebElement passwordEyeIcon;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement eyeIconOpen;

    @FindBy(xpath = "//div[@id='criteria-text']")
    private WebElement limitForPassword;

    @FindBy(xpath = "(//button[contains(@class,'MuiIconButton')])[2]")
    private WebElement eyeIconForNewPassword;

    @FindBy(id = "standard-password-input-helper-text")
    private WebElement validationMsg;

    @FindBy(xpath = "//p[contains(@class,'verified_heading')]")
    private WebElement passwordNotConfirmedHeading;

    @FindBy(xpath = "//p[contains(@class,'id_verified_sub')]")
    private WebElement subHeading;

    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-icon')]/following-sibling::div")
    private WebElement passwordToastMsg;

    @FindBy(xpath = "//p[text()='Two-Factor Auth']/following-sibling::p/span")
    private WebElement twoFactorUpdateButton;

    @FindBy(xpath = "//div[contains(@class,'verification_field')]/../p")
    private WebElement twoFactorPopup;

    @FindBy(xpath = "//label[contains(@class,'MuiFormControlLabel-root')]")
    private List<WebElement> optionOfForm;

    @FindBy(xpath = "//span[contains(@class,'Mui-disabled')]/div/div[contains(@class,'radioTitle')]")
    private WebElement smsOptionDisabled;

    @FindBy(xpath = "//span[contains(@class,'Mui-checked')]/input[@value='email']")
    private WebElement emailCheckboxSelected;

    @FindBy(xpath = "//button[text()='Update Method']")
    private WebElement updateMethodBtn;


    public String verify_Navigate_To_Kyc_Page() {
        waitForElement(4);
        return driver.getCurrentUrl();
    }

    public void click_On_Market_Tab() {
        isElementVisible(marketTab, 2);
        clickOnWebElement(marketTab);
    }


    public void clicks_On_Profile_Icon() {
        waitForElement(5);
        clickByAction(profileIcon);
    }

    public void verify_Profile_Menu_Item() {
        for (WebElement element : profileMenuItem) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void click_On_Account() {
        clickOnWebElement(account);
    }

    public String verify_Account_Page() {
        isElementVisible(accountText, 10);
        return getText(accountText);
    }


    public void click_On_Name_Edit_Button_On_Profile_Page() {
        waitForElement(2);
        clickOnWebElement(editNameButtonAccountPage);
        waitForElement(5);
    }

    public String verify_Edit_Text_On_Edit_Name_Popup() {
        return getText(verifyEditTextNameEditScreen);
    }

    public void verify_First_Name_And_Last_Name_Text_Field_Popup() {
        Assert.assertTrue("First name text field is not displayed ", isElementVisible(firstNameEditNameAccountPopup));
        Assert.assertTrue("Last name text field is not displayed ", isElementVisible(lastNameEditNameAccountPopup));
    }

    public String verify_cancel_Button() {
        return getText(cancelButtonEditName);
    }

    public String verify_Save_Changes_Button() {
        return getText(saveChangesButtonEditNameAccountPopup);
    }

    public void verify_Already_Enter_First_Name() {
        Assert.assertFalse("First name is not displayed already entered :- ", getAttributeValue(firstNameEditNameAccountPopup).isEmpty());
    }

    public void verify_Already_Enter_Last_Name() {
        Assert.assertFalse("Last name is not displayed already entered :- ", getAttributeValue(lastNameEditNameAccountPopup).isEmpty());
    }

    public void click_On_First_Name() {
        String value = getAttributeValue(firstNameEditNameAccountPopup);
        clearOneByOne(firstNameEditNameAccountPopup, value);
        clickOnWebElement(lastNameEditNameAccountPopup);
    }

    public String verify_Msg_Legal_First_Name_Required() {
        return getText(validationMsgFirstName);
    }

    public void verify_First_Name_Validation(String firstName) {
        sendKeys(firstNameEditNameAccountPopup, firstName);
    }

    public String verify_Msg_Please_Enter_Valid_Name_In_First_Name() {
        return getText(errorMsgFirstName);
    }

    public void click_On_Last_Name() {
        String value = getAttributeValue(lastNameEditNameAccountPopup);
        clearOneByOne(lastNameEditNameAccountPopup, value);
    }

    public String verify_Msg_Legal_Last_Name_Required() {
        return getText(validationMsgLastName);
    }

    public void verify_Last_Name_Validation(String lastName) {
        Assert.assertTrue(isElementVisible(lastNameEditNameAccountPopup));
        sendKeys(lastNameEditNameAccountPopup, lastName);
    }

    public String verify_Msg_Please_Enter_Valid_Name() {
        return getText(errorMsgLastName);
    }

    public String enter_First_Name_On_Name_Edit_Screen() {
        String value = getAttributeValue(firstNameEditNameAccountPopup);
        clearOneByOne(firstNameEditNameAccountPopup, value);
        generateRandomCharacter(firstNameEditNameAccountPopup);
        return getAttributeValue(firstNameEditNameAccountPopup);
    }

    public String enter_Last_Name_On_Name_Edit_Screen() {
        String value = getAttributeValue(lastNameEditNameAccountPopup);
        clearOneByOne(lastNameEditNameAccountPopup, value);
        generateRandomCharacter(lastNameEditNameAccountPopup);
        return getAttributeValue(lastNameEditNameAccountPopup);
    }

    public void click_On_Cancel_Button() {
        clickOnWebElement(ResetButton);
    }

    public Boolean validate_Name_Popup_Closed_Successfully() {
        return isElementVisible(verifyEditTextNameEditScreen, 10);
    }

    public void click_On_Save_Changes_Button() {
        clickByAction(saveChangesButtonEditNameAccountPopup);
    }

    public Boolean verify_Msg_Name_Updated_Successfully() {
        isElementVisible(verifyMsgNameUpdatedSuccessfully, 10);
        return verifyMsgNameUpdatedSuccessfully.isDisplayed();
    }

    public void click_On_Edit_Email() {
        waitForElement(2);
        clickOnWebElement(editEmail);
        waitForElement(5);
    }

    public String verify_Email_Text() {
        return getText(emailTextPopup);
    }

    public Boolean verify_Email_Text_Field() {
        return emailTextField.isDisplayed();
    }

    public String cancel_Button_On_Edit_Email_Popup() {
        return getText(cancelEmailBtn);
    }

    public String Verify_Email_Button_On_Edit_Email_Popup() {
        return getText(verifyEmailBtn);
    }

    public void verify_Already_Exist_Email_In_Edit_Email_Popup() {
        waitForVisibility(emailTextField);
        Assert.assertFalse("Email is not displayed already entered", getAttributeValue(emailTextField).isEmpty());
    }

    public Boolean verify_Email_Button_Disabled() {
        return isEnabled(verifyEmailBtn);
    }

    public void click_On_Logout_In_Profile_Menu() {
        clickOnWebElement(logoutButtonInAccountMenu);
    }

    public String verify_Logout_Screen() {
        return getText(verifyLogoutTextNameLogoutScreen);
    }

    public String verify_Message_Are_You_Want_To_Sure_Logout() {
        return getText(areYouSureWantLogoutMsg);
    }

    public String verify_Cancel_Button() {
        return getText(ResetButton);
    }

    public String verify_Logout_Button() {
        return getText(logoutButtonLogoutScreen);
    }

    public void click_Cancel_Button_Logout_Screen() {
        clickOnWebElement(ResetButton);
    }

    public String verify_Redirection_Of_Account_Page() {
        return driver.getCurrentUrl();
    }

    public void click_On_logout_Button_In_Logout_Screen() {
        clickOnWebElement(logoutButtonLogoutScreen);
    }

    public void click_On_Cancel_Email_Button() {
        clickOnWebElement(cancelEmailBtn);
    }

    public Boolean validate_Email_Popup_Closed_Successfully() {
        return isElementVisible(emailTextPopup, 10);
    }

    public String verify_First_Name_Field() {
        return getAttributeValue(firstNameEditNameAccountPopup);
    }

    public String verify_Last_Name_Field() {
        return getAttributeValue(lastNameEditNameAccountPopup);
    }

    public void remove_First_Name_from_Name_Field() {
        String value = getAttributeValue(firstNameEditNameAccountPopup);
        clearOneByOne(firstNameEditNameAccountPopup, value);
    }

    public void remove_Last_Name_from_Name_Field() {
        String value = getAttributeValue(lastNameEditNameAccountPopup);
        clearOneByOne(lastNameEditNameAccountPopup, value);
    }

    public void click_On_First_Name_Input_Field() {
        clickOnWebElement(firstNameEditNameAccountPopup);
    }

    public boolean is_Active_Placeholder_Of_First_Name() {
        return isElementVisible(firstNameEditNameAccountPopup);
    }

    public void enter_First_Name_In_Input_Field() {
        generateRandomCharacter(firstNameEditNameAccountPopup);
    }

    public void enter_Last_Name_In_Input_Field() {
        generateRandomCharacter(lastNameEditNameAccountPopup);
    }

    public boolean is_Enabled_Save_Changes_Btn() {
        return saveChangesButtonEditNameAccountPopup.isEnabled();
    }

    public void click_On_Last_Name_Input_Field() {
        clickOnWebElement(lastNameEditNameAccountPopup);
    }

    public void verify_Profile_Data() {
        for (int i = 0; i < profileData.size(); i++) {
            Assert.assertTrue("user name and edit button is not visible", isElementVisible(profileData.get(i)));
        }
    }

    public String verify_Kyc_Not_Completed_Msg() {
        return getText(kycNotCompleted);
    }

    public boolean is_Finish_Account_Setup_Visible() {
        return isElementVisible(finishAccountSetup);
    }

    public boolean is_Email_Visible_On_Account_Page() {
        return isElementVisible(authEmailField, 10);
    }

    public boolean is_Update_Option_Visible() {
        return isElementVisible(updateBtnForKyc);
    }

    public boolean verify_Password_field() {
        return isElementVisible(passwordField);
    }

    public boolean verify_Address_Of_User() {
        return isElementVisible(address);
    }

    public boolean is_Verified_Kyc() {
        return isElementVisible(kycVerified);
    }

    public boolean is_Phone_Number_Visible() {
        return isElementVisible(phoneNumber);
    }

    public String verify_Title_Of_Edit_Name_Confirmation_Popup() {
        return getText(permissionEditNameTitle);
    }

    public boolean is_Edit_Name_Confirmation_Popup_Visible() {
        return isElementVisible(permissionEditNameTitle);
    }

    public String verify_Sub_Title_Of_Edit_Name_Permission_Popup() {
        return getText(subTitleOfEditName);
    }

    public boolean is_Cancel_Btn_visible() {
        return isElementVisible(ResetButton);
    }

    public boolean is_Confirm_Btn_Visible() {
        return isElementVisible(confirmBtn);
    }

    public void click_On_Confirm_Btn() {
        clickOnWebElement(confirmBtn);
    }

    public Boolean verify_Account_Name() {
        waitForElement(5);
        String expectedValue = ContactUsPageLoggedUser.name;
        String accountNameValue = getText(accountName);
        return expectedValue.equals(getText(accountName));
    }

    public Boolean verify_Account_Email() {
        isElementVisible(accountEmail, 10);
        String expectedValue = ContactUsPageLoggedUser.email;
        return expectedValue.equals(getText(accountEmail));
    }

    public void click_Cn_Phone_Number_Edit_Button() {
        clickOnWebElement(phoneNumberEdit);
    }

    public boolean is_Edit_Button_Visible() {
        return isElementVisible(phoneNumberEdit);
    }

    public boolean verify_Mobile_Number_Popup() {
        return isElementVisible(editMobileNumberPopup);
    }

    public boolean verify_Mobile_Number_Field() {
        return isElementVisible(mobileNumber);
    }


    public String verify_Voip_Validation_Msg() {
        waitForElement(2);
        return getText(voipValidationMsg);
    }

    public boolean is_cancel_Btn_Visible() {
        return isElementVisible(cancelBtn,30);
    }

    public boolean is_Verify_Mobile_Number_Button() {
        return isElementVisible(verifyMobileNumberBtn);
    }

    public boolean verify_Request_Detail_Option() {
        return isElementVisible(requestDetailOption);
    }

    public void remove_Mobile_Number_In_Number_Field() {
        clearOneByOne(mobileNumberField, getAttributeValue(mobileNumberField));
    }

    public void enter_Mobile_number_In_Input_Field(String mobileNumber) {
        sendKeys(mobileNumberField, mobileNumber);
    }


    public int verify_10_Digit_Mobile_Number() {
        return getAttributeValue(mobileNumberField).length();
    }

    public String get_Mobile_Number_Value() {
        return getAttributeValue(mobileNumberField);
    }

    public boolean is_Green_Tick_Visible() {
        return isElementVisible(greenTick);
    }

    public boolean verify_Cross_Icon() {
        return isElementVisible(crossIcon);
    }

    public void click_On_Cancel_Btn() {
        try {
            waitForElement(3);
            hoverByAction(cancelBtn);
            cancelBtn.click();
        }catch (Exception e){

        }
    }

    public boolean verify_Mobile_Number_Btn() {
        waitForElement(2);
        return verifyMobileNumberBtn.isEnabled();
    }

    public void click_On_Verify_Mobile_Number_Btn() {
        waitForElement(2);
        clickOnWebElement(verifyMobileNumberBtn);
    }

    public String verify_Mobile_Number_Text_Popup() {
        return getText(mobileNumberText);
    }


    public boolean verify_Icon_With_Green_Tick() {
        return isElementVisible(iconWithGreenCircle);
    }

    public boolean verify_Did_Not_Get_OTP() {
        return isElementVisible(didNotGetOTP);
    }

    public boolean is_Change_Mobile_Number_Btn_Visible() {
        return isElementVisible(changeMobileNumberBtn);
    }

    public boolean is_Confirm_Code_Btn_Visible() {
        return isElementVisible(confirmCodeBtn);
    }

    public boolean verify_Confirm_Code_Button_Enabled() {
        return confirmCodeBtn.isEnabled();
    }

    public void click_On_confirm_Button() {
        clickOnWebElement(confirmCodeBtn);
    }

    public String verify_Validation_Msg() {
        waitForElement(2);
        return getText(errorLine);
    }

    public void click_On_Resend_Code_Btn() {
        clickOnWebElement(resendCodeBtn);
    }

    public boolean is_Resend_Code_Btn_Enabled() {
        isElementVisible(resendCodeBtn,20);
        return resendCodeBtn.isEnabled();
    }

    public String verify_Error_Code_Msg() {
        return getText(resendCodeMsg);
    }

    public boolean is_Not_Verified_Popup_Visible() {
        return isElementVisible(verifiedPopupHeading);
    }

    public void click_On_Stay_Logged_In_Btn() {
        clickOnWebElement(stayLoggedInBtn);
    }

    public boolean is_Not_Verified_Popup_Sub_Heading_visible() {
        return isElementVisible(notVerifiedPopupSubHeading);
    }

    public void click_On_Close_Icon() {
        clickOnWebElement(closeIcon);
    }

    public boolean is_Close_Icon_Visible() {
        return isElementVisible(closeIcon);
    }


    public String get_Mobile_Number() {
        return getText(phoneNumber);
    }

    public boolean is_Address_Edit_option_Visible() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Address']/span[text()='Edit']")));
        return isElementVisible(addressEditOption, 100);
    }

    public void click_On_Edit_Address_Option() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Address']/span[text()='Edit']")));
        clickOnWebElement(addressEditOption);
    }

    public boolean is_Edit_Address_Popup_Visible() {
        return isElementVisible(addressEditPopup);
    }

    public boolean is_Cancel_Btn_Visible() {
        return isElementVisible(cancelButton);
    }

    public boolean is_Save_Changes_Btn_Visible() {
        return isElementVisible(saveChangesButton);
    }

    public boolean is_Save_Changes_Button_Disabled(){
        waitForElement(3);
        return saveChangesButton.isEnabled();
    }

    public String get_Zip_Code_Value(){
        waitForElement(2);
        return getAttributeValue(zipCode);
    }

    public boolean is_Zip_Code_Field_Error_Msg(){
        return isElementVisible(zipcodeFieldErrorMsg);
    }

    public String get_City_Value(){
        return getAttributeValue(cityField);
    }

    public String get_Address_Value(){
        return getText(address);
    }

    public void click_On_Save_Changes_Btn(){
       waitForElement(3);
        clickByAction(saveChangesButton);
    }

    public String verify_Did_You_Mean_Address_Popup(){
        return getText(didYouMeanAddress);
    }

    public boolean verify_Did_You_Mean_Address_Popup_Visible(){
        waitForElement(4);
        return isElementVisible(didYouMeanAddress,20);
    }

    public boolean verify_Default_Checkbox(){
        return isElementVisible(defaultCheckbox);
    }

    public boolean verify_Recommended_Address(){
        return isElementVisible(recommended,30);
    }

    public void click_On_Recommended_Address_Checkbox(){
        hoverAndClickByAction(recommendedAddress);
    }

    public boolean verify_Recommended_Checkbox_Active(){
        return isElementVisible(recommendedCheckboxActive);
    }

    public boolean is_Confirm_Button_Visible(){
        return isElementVisible(confirmBtn,20);
    }

    public boolean is_Account_Recovery_Update_Btn_Visible(){
        waitForElement(3);
        return isElementVisible(accountRecoveryUpdateBtn,20);
    }

    public void click_On_Update_Btn(){
        clickOnWebElement(accountRecoveryUpdateBtn);
    }

    public boolean is_Verification_Popup_Visible(){
        waitForElement(2);
        return isElementVisible(verificationPopup);
    }

    public boolean is_Email_Option_Visible(){
        return  isElementVisible(emailOption);
    }

    public boolean is_Sms_Option_Visible(){
        return  isElementVisible(smsOption);
    }

    public boolean verify_SMS_options_Selected(){
        return smsCheckbox.isSelected();
    }

    public void click_On_SMS_Checkbox(){
        hoverAndClickByAction(smsCheckbox);
    }

    public boolean is_Password_Edit_Options_Visible(){
        waitForElement(3);
        return isElementVisible(passwordEditOption,20);
    }

    public void click_On_Password_Edit_Option(){
        clickOnWebElement(passwordEditOption);
    }

    public boolean is_OTP_Popup_Visible(){
        return isElementVisible(otpPopup);
    }

    public boolean  verify_OTP_Field(){
        return  isElementVisible(otpField);
    }

    public String verify_OTP_Sent_text(){
        return getText(otpText);
    }

    public boolean verify_Already_Sign_In_Visible() {
        return isElementVisible(alreadySignIn);
    }

    public void click_On_Email_option(){
        hoverAndClickByAction(emailCheckbox);
    }

    public String get_Error_Msg(){
        return getText(errorMsg);
    }

    public boolean is_ID_Verified_Popup_Visible(){
        return isElementVisible(idVerified);
    }

    public boolean is_Placeholder_Text_Visible(){
        waitForElement(2);
        return isElementVisible(yourIDPlaceholderText);
    }

    public boolean verify_Edit_Password_Popup_Visible(){
        waitForElement(2);
        return isElementVisible(editPassword);
    }

    public void click_On_Resend_Link(){
        clickOnWebElement(resendCodeLink);
    }

    public boolean is_Old_Password_Field_Visible(){
        return isElementVisible(oldPassword);
    }

    public boolean is_New_Password_Field_Visible(){
        return isElementVisible(newPassword);
    }

    public boolean is_Confirm_Password_Field_Visible(){
        return isElementVisible(confirmPassword);
    }

    public boolean is_Save_Changes_Button_Visible(){
        return isElementVisible(saveChangesButton);
    }

    public void click_On_Password_Eye_Icon(){
        clickByAction(passwordEyeIcon);
    }

    public boolean is_Eye_Icon_Open(){
        return isElementVisible(eyeIconOpen);
    }
    
    public void enter_New_Password_In_Input_Field(String password){
        sendKeys(newPassword, password);
    }

    public boolean verify_Password_Limit(){
        return isElementVisible(limitForPassword);
    }

    public void  enter_Old_Password_In_Input_Field(String password){
        sendKeys(oldPassword, password);
    }

    public void click_On_New_Password_Eye_Icon(){
        hoverAndClickByAction(eyeIconForNewPassword);
        clickOnWebElement(eyeIconForNewPassword);
    }

    public void click_On_New_Password_Field(){
        clickOnWebElement(confirmPassword);
    }

    public void enter_Confirm_Password_In_Input_Field(String password){
        sendKeys(confirmPassword, password);
    }

    public String verify_Password_Not_Match_Msg(){
        return getText(validationMsg);
    }

    public boolean verify_Password_Not_Match_Validation(){
        return isElementVisible(validationMsg);
    }

    public String verify_Password_Attempts_Msg(){
        return getText(validationMsg);
    }

    public boolean is_Password_Not_Confirmed_Popup_Visible(){
        return isElementVisible(passwordNotConfirmedHeading);
    }

    public boolean is_Sub_Heading_Password_Not_Confirmed(){
        return isElementVisible(subHeading);
    }

    public String  verify_Password_Updated_OR_not(){
        return getText(passwordToastMsg);
    }

    public boolean is_Two_Factor_Update_Button_Visible(){
        return isElementVisible(twoFactorUpdateButton);
    }

    public void click_On_Two_Factor_Update_Option(){
        clickOnWebElement(twoFactorUpdateButton);
    }

    public String verify_Two_Factor_Popup(){
        return getText(twoFactorPopup);
    }

    public boolean is_Two_Factor_Popup_Visible(){
        return isElementVisible(twoFactorPopup);
    }

    public void verify_Email_SMS_Turn_Off_Options(){
        for(WebElement element : optionOfForm){
            Assert.assertTrue("Option is not visible", isElementVisible(element));
        }
    }

    public boolean is_SMS_Option_Disabled(){
        return isElementVisible(smsOptionDisabled);
    }

    public boolean is_Email_Checkbox_Selected(){
        return emailCheckboxSelected.isSelected();
    }

    public boolean is_Update_Method_Btn_Visible(){
        return isElementVisible(updateMethodBtn);
    }

}





