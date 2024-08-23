package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class KycPage extends Helper {

    public KycPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[contains(text(),'Account')]")
    private WebElement accountSetUp;

    @FindBy(xpath = "(//span[text()='Verify Identity'])[2]")
    private WebElement verifyIdentityOption;

    @FindBy(xpath = "//button[text()='MARKET']")
    private WebElement market;

    @FindBy(name = "financials")
    private WebElement financials;

    @FindBy(xpath = "(//a[contains(text(),'complete')])[1]")
    private WebElement completeYourAccountSetup;

    @FindBy(xpath = "//span[contains(@class,'Mui-completed') and (text()='Basic Information')]")
    private WebElement basicInformation;

    @FindBy(xpath = "//span[contains(@class,'Mui-active') and (text()='Verify Identity')]")
    private WebElement verifyIdentity;

    @FindBy(xpath = "//span[contains(@class,'Mui-disabled') and (text()='Add Investor Profile')]")
    private WebElement addInvestorProfile;

    @FindBy(xpath = "//span[contains(@class,'Mui-disabled') and (text()='Link External Account')]")
    private WebElement linkExternalAccount;

    @FindBy(xpath = "//span[contains(@class,'Mui-disabled') and (text()='Deposit Funds')]")
    private WebElement depositFunds;

    @FindBy(xpath = "//button[text()='Do this later']")
    private WebElement doThisLater;

    @FindBy(xpath = "(//button[text()='Do this later'])[2]")
    private WebElement doThisLaterBtn;

    @FindBy(xpath = "//p[text()='Account Set-Up']/following-sibling::p")
    private WebElement accountSetUpPercent;

    @FindBy(xpath = "//p[contains(@id,'helper-text')]")
    private WebElement mandatoryField;

    @FindBy(id = "mobile")
    private WebElement mobileNumberField;

    @FindBy(id = "address")
    private WebElement residentialAddress;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='aptsuite']")
    private WebElement apiSuite;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//p[@id='zipcode-helper-text']")
    private WebElement zipCodeMandatoryField;

    @FindBy(xpath = "//p[@id='state-helper-text']")
    private WebElement stateMandatoryField;

    @FindBy(xpath = "//p[@id='city-helper-text']")
    private WebElement cityMandatoryField;

    @FindBy(xpath = "//p[text()='Mobile Number is mandatory']")
    private WebElement mobileMandatoryField;

    @FindBy(xpath = "//p[@id='address-helper-text']")
    private WebElement addressMandatoryField;

    @FindBy(xpath = "//p[@id='mobile-helper-text']")
    private WebElement errorMsg;

    @FindBy(xpath = "(//li[@role=\"option\"])[1]")
    private WebElement residentialAddressDropdown;

    @FindBy(xpath = "(//li[@role=\"option\"])[1]")
    private WebElement residentialAddressList;

    @FindBy(css = "ul[id='address-listbox']")
    private WebElement addressListBox;

    @FindBy(xpath = "//div[text()='Enter valid address']")
    private WebElement validAddressErrorMsg;

    @FindBy(xpath = "//p[contains(text(),'VOIP')]")
    private WebElement voipLandlines;

    @FindBy(xpath = "//label[contains(text(),'(Optional)')]")
    private WebElement aptSuiteOptional;

    @FindBy(id = "aptsuite")
    private WebElement aptSuite;

    @FindBy(xpath = "//p[contains(text(),'exit')]")
    private WebElement exitPopup;

    @FindBy(xpath = "//p[contains(text(),'Property')]")
    private WebElement exitPopupPlaceHolderText;

    @FindBy(xpath = "//button[text()='Return to Verification']")
    private WebElement returnToVerification;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    private WebElement confirmButton;

    @FindBy(xpath = "//h4[contains(text(),'Did you mean')]")
    private WebElement didYouMeanAddress;

    @FindBy(xpath = "//p[contains(text(),'OTP to verify')]")
    private WebElement otpPopup;

    @FindBy(xpath = "//p[contains(text(),'number ending')]")
    private WebElement placeholderTextOnOtpPopup;

    @FindBy(xpath = "//div[@class='otp-inputs']/input")
    private List<WebElement> otpBox;

    @FindBy(xpath = "//button[text()='Confirm Code']")
    private WebElement confirmCodeBtn;

    @FindBy(xpath = "//a[text()='Resend Code']")
    private WebElement resendBtn;

    @FindBy(xpath = "//p[contains(text(),'The six')]")
    private WebElement validationMsg;

    @FindBy(xpath = "//p[contains(text(),'Too many')]")
    private WebElement tooManyAttemptsMsg;

    @FindBy(xpath = "//div[contains(text(),'Code resent successfully!')]")
    private WebElement codeResendMsg;

    @FindBy(xpath = "//p[contains(text(),'Mobile Number')]")
    private WebElement mobileVerifiedPopup;

    @FindBy(xpath = "//p[contains(text(),'Your mobile number')]")
    private WebElement verifiedPopupPlaceholderText;

    @FindBy(xpath = "//p[contains(text(),'Resend OTP')]")
    private WebElement resendOTPWithTimer;

    @FindBy(xpath = "//p[contains(text(),'Code is invalid')]")
    private WebElement codeIsInvalid;

    @FindBy(xpath = "//p[contains(text(),'Your KYC process')]")
    private WebElement kycProcessErrorMsg;

    @FindBy(xpath = "(//p[contains(text(),'Account Set-up')])[1]")
    private WebElement finishAccountSetup;

    @FindBy(xpath = "//div[contains(@class,'common_box_account first_profiel')]/p")
    private List<WebElement> profileData;

    @FindBy(xpath = "//div[contains(text(),'Your KYC')]")
    private WebElement kycNotCompleted;

    @FindBy(xpath = "//h1[contains(text(),'Account Set-')]/following-sibling::div/div/div")
    private List<WebElement> accountSetUpValue;

    @FindBy(xpath = "//span[@aria-valuenow='20']")
    private WebElement progressBarCircle;

    @FindBy(id = "zipcode-helper-text")
    private WebElement zipCodeValidationMsg;

    @FindBy(xpath = "//p[contains(text(),'Resend OTP')]")
    private WebElement resendOtpTimer;



    public String get_Current_Url() {
        waitForElement(4);
        return driver.getCurrentUrl();
    }

    public void click_On_Account_Setup() {
        clickOnWebElement(accountSetUp);
    }

    public void click_On_Verify_Identity() {
        clickOnWebElement(verifyIdentityOption);
    }

    public void click_On_Financials() {
        clickOnWebElement(financials);
    }

    public void click_On_Complete_Your_Account_Setup() {
        clickOnWebElement(completeYourAccountSetup);
    }

    public boolean verify_Basic_Information() {
        return isElementVisible(basicInformation);
    }

    public boolean verify_Identity_On_Kyc_Page() {
        return isElementVisible(verifyIdentity);
    }


    public boolean verify_Add_Investor_Profile() {
        return isElementVisible(addInvestorProfile);
    }

    public boolean verify_Disable_Link_External_Account() {
        return isElementVisible(linkExternalAccount);
    }

    public boolean verify_Disable_Deposit_Funds() {
        return isElementVisible(depositFunds);
    }

    public void click_On_Do_This_Later() {
        clickOnWebElement(doThisLater);
    }

    public void click_On_Do_This_Later_Btn() {
        clickOnWebElement(doThisLaterBtn);
    }

    public String verify_Account_SetUp_Percent() {
        return getText(accountSetUpPercent);
    }

    public String get_Current_URL() {
        return driver.getCurrentUrl();
    }

    public boolean verify_Mobile_Number_Mandatory_Field() {
        return isElementVisible(mobileMandatoryField);
    }

    public void click_On_Mobile_Number_Field() {
        clickOnWebElement(mobileNumberField);
    }

    public void click_On_Residential_Input_Field() {
        clickOnWebElement(residentialAddress);
    }

    public boolean verify_Residential_Mandatory_Field() {
        return isElementVisible(addressMandatoryField);
    }


    public void click_On_city_Input_Field() {
        clickOnWebElement(city);
    }

    public boolean verify_City_Mandatory_Field() {
        return isElementVisible(cityMandatoryField);
    }

    public void click_On_State_Input_Field() {
        clickOnWebElement(state);
    }

    public boolean verify_state_Input_Field_Mandatory() {
        return isElementVisible(stateMandatoryField);

    }

    public void click_On_Zipcode_Input_Field() {
        clickOnWebElement(zipCode);
    }

    public boolean verify_Zipcode_Input_Field_Mandatory() {
        return isElementVisible(zipCodeMandatoryField);
    }

    public boolean validate_Continue_Btn() {
        waitForElement(2);
        isElementVisible(continueBtn, 10);
        return continueBtn.isEnabled();
    }

    public boolean click_On_Continue_Btn() {
        try {
            waitForElement(1);
            clickOnWebElement(continueBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String enter_Mobile_Number_In_Input_Field(String mobileNumber) {
        sendKeys(mobileNumberField, mobileNumber);
        waitForElement(2);
        return mobileNumber;
    }

    public boolean get_Mobile_Number() {
        String value = getAttributeValue(mobileNumberField).replace("-", "").trim();
        return value.length() == 10;
    }

    public String get_Mobile_Number_From_Mobile_Field() {
        return getAttributeValue(mobileNumberField);
    }

    public String validate_Error_Msg() {
        waitForElement(2);
        return getText(errorMsg);
    }


    public void remove_Address_In_Address_Field() {
        String value = getAttributeValue(residentialAddress);
        clearOneByOne(residentialAddress, value);
    }

    public boolean click_On_Residential_Dropdown_Value() {
        try {
            waitForElement(3);
            clickOnWebElement(residentialAddressDropdown);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void enters_Address_In_Residential_Field(String residentialAddress) {
        sendkeysOneByOne(this.residentialAddress, residentialAddress);
    }

    public String verify_Suggestion_Of_Address_Dropdown() {
        return getText(residentialAddressList);
    }

    public String get_Residential_Address_Value() {
        return getAttributeValue(residentialAddress);
    }

    public String get_City_Value() {
        waitForElement(2);
        return getAttributeValue(city);
    }

    public String get_Zip_Code_Value() {
        waitForElement(2);
        return getAttributeValue(zipCode);
    }

    public String get_State_Value() {
        waitForElement(2);
        return getAttributeValue(state);
    }

    public boolean is_Address_Dropdown_Visible() {
        return isElementVisible(addressListBox);
    }

    public boolean is_Valid_Error_Msg_Visible() {
        return isElementVisible(validAddressErrorMsg, 10);
    }

    public void remove_City_From_City_Field() {
        String value = getAttributeValue(city);
        clearOneByOne(city, value);
    }

    public void enter_City_Name_In_Input_Field(String cityName) {
        sendKeys(city, cityName);
    }

    public String get_Voip_Landline_Validation_Msg() {
        return getText(voipLandlines);
    }

    public void remove_Zipcode_In_ZipCode_Field() {
        String value = getAttributeValue(zipCode);
        clearOneByOne(zipCode, value);
    }

    public void enter_Zip_Code_In_Input_Field(String Code) {
        waitForElement(2);
        sendKeys(zipCode, Code);
    }

    public String verify_Apt_Suite_Optional() {
        return getText(aptSuiteOptional);
    }

    public boolean get_Apt_Suite_Value() {
        return getAttributeValue(aptSuite).isEmpty();
    }

    public void enter_State_Name_In_Input_Field(String stateName) {
        sendKeys(state, stateName);
    }

    public String verify_Exit_Popup() {
        return getText(exitPopup);
    }

    public String verify_Placeholder_Text_On_Exit_Popup() {
        return getText(exitPopupPlaceHolderText);
    }

    public boolean verify_return_To_Verification_Btn() {
        return isElementVisible(returnToVerification);
    }

    public boolean verify_Do_This_Later_Btn() {
        return isElementVisible(doThisLaterBtn);
    }

    public void click_On_Return_To_Verification_Button() {
        clickOnWebElement(returnToVerification);
    }

    public void click_On_Confirm_Btn() {
        clickOnWebElement(confirmButton);
    }

    public boolean verify_OTP_Popup() {
        return isElementVisible(otpPopup);
    }

    public boolean verify_Did_You_Mean_Popup() {
        return isElementVisible(didYouMeanAddress);
    }

    public boolean verify_Placeholder_Text_On_Otp_Popup() {
        return isElementVisible(placeholderTextOnOtpPopup);
    }

    public void is_Visible_6_Digit_OTP_Box() {
        for (int i = 0; i < otpBox.size(); i++) {
            Assert.assertTrue("OTP 6 box is not visible", isElementVisible(otpBox.get(i)));
        }
    }

    public boolean is_Confirm_Code_Btn_Visible() {
        return isElementVisible(confirmCodeBtn);
    }

    public boolean is_Resend_Btn_Visible() {
        return isElementVisible(resendBtn);
    }

    public void enter_OTP_In_Otp_Field(String otp) {
        sendkeysForOtp(otpBox, otp);
    }

    public boolean verify_Confirm_Code_Button() {
        return confirmCodeBtn.isEnabled();
    }

    public String validate_Error_Msg_For_Invalid_OTP() {
        return getText(validationMsg);
    }

    public void click_On_Confirm_Code_Btn() {
        clickOnWebElement(confirmCodeBtn);
    }

    public void remove_OTP_From_OTP_Field() {
        for (int i = otpBox.size() - 1; i >= 0; i--) {
            otpBox.get(i).sendKeys(Keys.BACK_SPACE);
        }
    }

    public String validate_Too_Many_Attempts_Msg() {
        return getText(tooManyAttemptsMsg);
    }

    public void click_On_Resend_Code_Link() {
        clickOnWebElement(resendBtn);
    }

    public String validate_Code_Send_Successfully() {
        return getText(codeResendMsg);
    }

    public boolean verify_Mobile_Verification_Popup() {
        return isElementVisible(mobileVerifiedPopup);
    }


    public boolean verify_Placeholder_Text() {
        return isElementVisible(verifiedPopupPlaceholderText);
    }

    public String verify_Code_Is_Invalid_Validation_Msg() {
        return getText(codeIsInvalid);
    }

    public String validate_Kyc_Process_Disrupted() {
        return getText(kycProcessErrorMsg);
    }

    public void click_On_Finish_Account_Setup() {
        clickOnWebElement(finishAccountSetup);
    }

    public boolean is_Account_Set_Up_Option_Visible() {
        boolean accountValue = false;
        for (int i = 0; i < accountSetUpValue.size(); i++) {
            accountValue = isElementVisible(accountSetUpValue.get(i));
        }
        return accountValue;
    }

    public String get_Zip_Code_Validation_Msg() {
        return getText(zipCodeValidationMsg);
    }

    public boolean get_Resend_Otp_Timer() {
        return isElementVisible(resendOTPWithTimer);
    }

    public boolean is_Address_Field_Visible() {
        return isElementVisible(residentialAddress);
    }

    public boolean is_Apt_Suite_Field_Visible() {
        return isElementVisible(aptSuite);
    }

    public boolean is_City_Field_Visible() {
        return isElementVisible(city);
    }

    public boolean is_Zipcode_Field_Visible() {
        return isElementVisible(zipCode);
    }

    public boolean is_State_Field_Visible() {
        return isElementVisible(state);
    }

    public void generate_Random_Address(){
        String address = generateRandomAlphabet(5);
        sendKeys(residentialAddress,address);
    }
}
