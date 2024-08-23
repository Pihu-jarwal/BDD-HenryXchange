package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

public class SellSharePage extends Helper {
    public SellSharePage() {
        PageFactory.initElements(driver, this);
    }

    int otpAttempts = 0;

    @FindBy(xpath = "//li[contains(@class,'MuiBreadcrumbs-li')]/p")
    private WebElement breadCrumbs;

    @FindBy(xpath = "//h2[contains(@class,\"pageTitle\")]")
    private WebElement placeHolderText;

    @FindBy(xpath = "//div[contains(@class,'inner_left_sellShare')]")
    private WebElement investmentDetails;

    @FindBy(xpath = "//div[contains(@class,'inner_left_sellShare')]/img")
    private WebElement thumbnailImageInvestmentDetails;

    @FindBy(xpath = "//div[contains(@class,'sellshare_detail')]//h2")
    private WebElement propertyNameInvestmentDetails;

    @FindBy(xpath = "//div[contains(@class,'sellshare_detail')]//p[1]")
    private WebElement totalSharesInvestmentDetails;

    @FindBy(xpath = "(//span[contains(@class,'number_sellshare')])[1]")
    private WebElement totalSharesValueInvestmentDetails;

    @FindBy(xpath = "//div[contains(@class,'sellshare_detail')]//p[2]")
    private WebElement averageShareCostInvestmentDetails;

    @FindBy(xpath = "(//span[contains(@class,'number_sellshare')])[2]")
    private WebElement averageShareCostValueInvestmentDetails;

    @FindBy(xpath = "//div[contains(@class,'sellshare_detail')]//p[3]")
    private WebElement totalValueTextInvestmentDetails;

    @FindBy(xpath = "(//span[contains(@class,'number_sellshare')])[3]")
    private WebElement totalValueInvestmentDetails;

    @FindBy(xpath = "//div[contains(@class,'custom_tab_holder')]//a")
    private List<WebElement> segmentedTabs;

    @FindBy(xpath = "//div[contains(@class,'MuiTableContainer-root')]//table")
    private WebElement currentListTable;

    @FindBy(xpath = "//div[contains(@class,'table_holder')]//div//a[2]")
    private WebElement recentSaleListTab;

    @FindBy(xpath = "//div[contains(@class,'MuiTableContainer-root')]//table")
    private WebElement recentListTable;

    @FindBy(xpath = "//div[contains(@class,'inner_right_sellShare_detail')]/p")
    private WebElement grossSaleAmountText;

    @FindBy(xpath = "//div[contains(@class,'inner_right_sellShare_detail')]/h2")
    private WebElement grossAmountValue;

    @FindBy(xpath = "//div[contains(@class,'market_estimate_style')]/img")
    private WebElement oracleIcon;

    @FindBy(xpath = "(//div[contains(@class,'market_estimate_style')])[2]")
    private WebElement marketEstimate;

    @FindBy(xpath = "(//div[contains(@class,'grp_share_price')]/p)[1]")
    private WebElement sharePriceText;

    @FindBy(xpath = "(//input[@id = 'outlined-basic'])[1]")
    private WebElement sharePriceField;

    @FindBy(xpath = "(//div[contains(@class,'grp_share_price')]/p)[2]")
    private WebElement hashOfSharesText;

    @FindBy(xpath = "(//div[contains(@class,'MuiInputBase-root')]//input)[2]")
    private WebElement hashOfSharesTextField;

    @FindBy(xpath = "//div[contains(@class,'inner_exceed_amount')]")
    private WebElement lowPriceWarningMsg;

    @FindBy(xpath = "//div[contains(@class,'inner_exceed_amount')]")
    private WebElement cannotExceedAmountWarningMsg;

    @FindBy(xpath = "//div[contains(@class,\"inner_net_amount\")]/p[1]")
    private WebElement feesText;

    @FindBy(xpath = "//div[contains(@class,\"inner_net_amount\")]/p[2]")
    private WebElement feesValue;

    @FindBy(xpath = "//div[contains(@class,'total_net_amount')]//p[1]")
    private WebElement netAmountToYouText;

    @FindBy(xpath = "//div[contains(@class,'total_net_amount')]//p[2]")
    private WebElement netAmountToYouValue;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement twoFactorMethodVerificationPopup;

    @FindBy(xpath = "//p[contains(@class,'dailog_header')]")
    private WebElement chooseTheVerificationMethodVerifyYourIdentity;

    @FindBy(xpath = "//div[contains(@class,'MuiFormGroup-root')]/label[1]")
    private WebElement smsTextMessageOptionWithProvidedMobileNumber;

    @FindBy(xpath = "//div[contains(text() ,'SMS (Text Message)')]")
    private WebElement smsTextMessage;

    @FindBy(xpath = "//div[contains(@class,'MuiFormGroup-root')]/label[2]")
    private WebElement emailOptionWithProvidedEmailAddress;

    @FindBy(xpath = "//div[contains(@class,'dailogbox_btn')]/button[1]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[contains(@class,'dailogbox_btn')]/button[2]")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[contains(@class,'MuiPaper-root')]")
    private WebElement viewTwoFactorAuthVerificationPopup;

    @FindBy(xpath = "(//p[contains(@class,'otp_heading')])[1]")
    private WebElement pleaseConfirmYourIdentityCompleteThisAction;

    @FindBy(xpath = "(//p[contains(@class,'sub_otp_heading')])")
    private WebElement viewSMSTextMessageSent;

    @FindBy(xpath = "(//p[contains(@class,'small_heading_otp')])")
    private WebElement pleaseEnter6DigitCodeSent;

    @FindBy(xpath = "//div[contains(@class,'otp-inputs')]")
    private WebElement sixDigitCodeInputField;

    @FindBy(xpath = "//div[contains(@class,'btnfullwidth')]/button")
    private WebElement confirmCodeButton;

    @FindBy(xpath = "(//div[contains(@class,'options')]//p)[1]")
    private WebElement didNotReceiveIt;

    @FindBy(xpath = "(//a[contains(@class,'link')])[1]")
    private WebElement resendCode;

    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-body')]")
    private WebElement toastMsgResendCode;

    @FindBy(xpath = "(//div[contains(@class,'options')]//p)[2]")
    private WebElement useAnotherMethod;

    @FindBy(xpath = "//p[contains(@class,'sub_otp_heading')]")
    private WebElement viewOtpSent;

    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root css-10y6fqq')]//p)[3]")
    private WebElement viewPleaseEnterCodeSentYourEmailOrderToVerifyYourIdentity;

    @FindBy(xpath = "//div[contains(@class,'otp-inputs')]/div/input")
    private List<WebElement> otp6Box;

    @FindBy(xpath = "//p[contains(@class,'text-red')]")
    private WebElement wrongOtpErrorMsg;

    @FindBy(xpath = "//p[contains(@class,'text-red')]")
    private WebElement threeAttemptWrongErrorMsg;

    @FindBy(xpath = "//img[contains(@alt,'close-icon')]")
    private WebElement crossIconTwoFactorAuthVerificationPopup;

    @FindBy(xpath = "//div[contains(@class,'MuiPaper-root')]")
    private WebElement idVerifiedPopup;

    @FindBy(xpath = "//div[contains(@class,'verified_box')]/p[1]")
    private WebElement headerIDVerified;

    @FindBy(xpath = "//div[contains(@class,'verified_box')]/p[2]")
    private WebElement yourIDHasBeenVerifiedAndYourSellOrderHasBeenSubmitted;

    @FindBy(xpath = "(//img[@alt ='close-icon'])[1]")
    private WebElement crossIcon;

    @FindBy(xpath = "//div[contains(@class,'modal-inner')]")
    private WebElement agreeToTermsPopup;

    @FindBy(xpath = "//div[@class='close-btn']/button/span")
    private WebElement crossIconAgreeToTermsPopup;

    @FindBy(xpath = "//div[contains(@class,'inner_loader')]")
    private WebElement preparingContractLoader;

    @FindBy(xpath = "//h4[contains(text(),'Agree')]")
    private WebElement agreeToTermsText;
    @FindBy(xpath = "//button[contains(@class,'agree-btn')]")
    private WebElement agreeAndContinueButton;

    @FindBy(xpath = "//div[contains(@class,'basic-modal')]/div/div[2]/h4/p")
    private WebElement propertyNameOnTermsPopup;

    @FindBy(xpath = "(//div[contains(@class,'text')])[1]")
    private WebElement agreementDescription;

    @FindBy(xpath = "(//div[contains(@class,'MuiInputBase-root')]/input)[3]")
    private WebElement enterYourInitials;

    @FindBy(xpath = "//div[contains(@class,'agree-sec')]/p")
    private WebElement errorMsgWrongEnterYourInitials;

    @FindBy(xpath = "//div[contains(@class,'download_btn')]")
    private WebElement downloadButton;

    @FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
    private WebElement profileText;

    @FindBy(xpath = "//div[contains(@class,'sell_order_submitted')]")
    private WebElement sellOrderSubmittedPage;

    @FindBy(xpath = "//li[@class='MuiBreadcrumbs-li']/p")
    private WebElement breadCrumbsSubmittedPage;

    @FindBy(xpath = "(//div[contains(@class,'inner_right_sellShare_detail')]/h2)[1]")
    private WebElement sellOrderSubmittedText;

    @FindBy(xpath = "//div[contains(@class,'placeImg MuiBox-root')]")
    private WebElement assetNameSubmitted;

    @FindBy(xpath = "//div[contains(@class,'placeImg')]/p")
    private WebElement assetNameText;

    @FindBy(xpath = "(//div[contains(@class,'inner_right_sellShare_detail')]/h2)[2]")
    private WebElement netAmountToYouSubmittedText;

    @FindBy(xpath = "(//div[contains(@class,'total_net_amount')]//p)[4]")
    private WebElement netAmountToYouValueSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')])[1]")
    private WebElement sharePriceSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')]/p)[2]")
    private WebElement sharePriceValueSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')])[2]")
    private WebElement numberOfSharesSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')]/p)[4]")
    private WebElement numberOfShareValueSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')])[3]")
    private WebElement grossPriceSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')]/p)[6]")
    private WebElement grossPriceValueSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')])[4]")
    private WebElement feesSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'inner_net_amount')]/p)[8]")
    private WebElement feesValueSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'total_net_amount')])[1]")
    private WebElement totalAmountSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'total_net_amount')]/p)[2]")
    private WebElement totalAmountValueSubmitted;

    @FindBy(xpath = "//div[contains(@class,'btn_holder')]//button[@type=\"button\"]")
    private WebElement viewPortfolioBtnSubmitted;

    @FindBy(xpath = "(//div[contains(@class,'tooltip')])[1]")
    private WebElement propertyNameTooltip;

    @FindBy(xpath = "//a[contains(@class,'SellShares_a')]")
    private WebElement marketEstimateTooltip;

    @FindBy(xpath = "//div[contains(@class,'table_holder')]//span[text() = 'No Data Available']")
    private WebElement noDataSell;

    static String property = null;

    public String verify_Sell_Share_Page() {
        return getText(breadCrumbs);
    }

    public void verify_Segmented_Tab_Holder() {
        for (WebElement element : segmentedTabs) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void verify_Current_Listed_List() {
        WebElement table = currentListTable;

        for (WebElement headerValue : table.findElements(By.xpath("//table//thead"))) {
            for (WebElement headerCell : headerValue.findElements(By.xpath("//table//thead//th"))) {
                Assert.assertTrue(isElementVisible(headerCell));
                Assert.assertFalse(getText(headerCell).isEmpty());
            }
        }
        for (WebElement rowValues : table.findElements(By.xpath("//tbody//tr"))) {
            for (WebElement cell : rowValues.findElements(By.xpath("//tbody//tr//th"))) {
                Assert.assertTrue(isElementVisible(cell));
                Assert.assertFalse(getText(cell).isEmpty());
            }
            for (WebElement cell : rowValues.findElements(By.xpath("//tbody//tr//td"))) {
                Assert.assertTrue(isElementVisible(cell));
                Assert.assertFalse(getText(cell).isEmpty());
            }
        }
    }


    public void click_On_Recent_Sale_List_Tab() {
        clickOnWebElement(recentSaleListTab);
    }

    public void verify_Recent_Sale_List() {
        WebElement table = recentListTable;

        for (WebElement headerValue : table.findElements(By.xpath("//table//thead"))) {
            for (WebElement headerCell : headerValue.findElements(By.xpath("//table//thead//th"))) {
                Assert.assertTrue(isElementVisible(headerCell));
                Assert.assertFalse(getText(headerCell).isEmpty());
            }
        }
        for (WebElement rowValues : table.findElements(By.xpath("//tbody//tr"))) {
            for (WebElement cell : rowValues.findElements(By.xpath("//tbody//tr//th"))) {
                Assert.assertTrue(isElementVisible(cell));
                Assert.assertFalse(getText(cell).isEmpty());
            }
            for (WebElement cell : rowValues.findElements(By.xpath("//tbody//tr//td"))) {
                Assert.assertTrue(isElementVisible(cell));
                Assert.assertFalse(getText(cell).isEmpty());
            }
        }
    }

    public void view_Share_Price_Text_Field() {
        getText(sharePriceField);
    }

    public void enters_Numeric_Value_In_Share_Price_Field(String numericValue) {
        clearText(sharePriceField);
        sharePriceField.sendKeys(numericValue);
    }

    public String numeric_Value_Is_Visible_In_Text_Field() {
        return getAttributeValue(sharePriceField);
    }

    public void enters_Alphabetic_Value_In_Share_Price_Field(String alphaValue) {
        clearText(sharePriceField);
        sendKeys(sharePriceField, alphaValue);
    }

    public void alphabeticValueIsNotVisibleInTextField() {
        Assert.assertEquals(getAttributeValue(sharePriceField), "$0.00");
    }

    public void enters_Special_Character_Value_In_Share_Price_Field(String specialCharacter) {
        clearText(sharePriceField);
        sendKeys(sharePriceField, specialCharacter);
    }

    public void special_Character_Value_Is_Not_Visible_In_TextField() {
        Assert.assertEquals(getAttributeValue(sharePriceField), "$0.00");
    }

    public void press_SpaceBar_In_Share_Price_Field() {
        clearText(sharePriceField);
        sharePriceField.sendKeys(Keys.SPACE);
    }

    public void press_Space_Bar_Input_Is_Not_Visible_In_Text_Field() {
        Assert.assertEquals(getAttributeValue(sharePriceField), "$0.00");
    }

    public void entersZeroAsInputInSharePriceField(String input) {
        clearText(sharePriceField);
        sendKeys(sharePriceField, String.valueOf(input));
    }

    public void continue_Button_Should_Not_Be_Active() {
        Assert.assertFalse(continueBtn.isEnabled());
    }


    public void enters_Numeric_Value_In_Share_Price_Field_Less_Than_Market_Price() {
        String marketEstimateValue = getText(marketEstimate);
        String marketEstimateValueNumber = marketEstimateValue.replaceAll("[^0-9]", "");
        double marketEstimateNumeric = Double.parseDouble(marketEstimateValueNumber);
        double enteredSharePrice = marketEstimateNumeric - 10;
        Assert.assertTrue(enteredSharePrice < marketEstimateNumeric);
        clearText(sharePriceField);
        sendKeys(sharePriceField, String.valueOf(enteredSharePrice));
    }

    public void enters_Numeric_Value_In_Shares_Field(String numericValue) {
        clearText(hashOfSharesTextField);
        sendKeys(hashOfSharesTextField, numericValue);
    }

    public String view_Updated_Gross_Amount() {
        return getText(grossAmountValue);
    }

    public void clicks_On_Continue_Button() {
        clickOnWebElement(continueBtn);
    }

    public Boolean verify_your_Identity_Popup() {
        return isElementVisible(twoFactorMethodVerificationPopup);
    }

    public void enters_Numeric_Value_In_Share_Price_Field_Ten_Percent_Less_Than_Market_Price() {
        String marketEstimateValue = getText(marketEstimate);
        String marketEstimateValueNumber = marketEstimateValue.replaceAll("[^0-9]", "");
        double marketEstimateNumeric = Double.parseDouble(marketEstimateValueNumber);
        double enteredSharePrice = (((marketEstimateNumeric * 0.9) - 10) / 100);
        DecimalFormat df = new DecimalFormat("0.00");
        double tenPercentLess = (marketEstimateNumeric * 0.9) / 100;
        clearText(sharePriceField);
        sendKeys(sharePriceField, String.valueOf(df.format(enteredSharePrice)));
        assert enteredSharePrice < tenPercentLess : "Entered share price is not ten percent less than market estimate.";
    }

    public void click_On_Share_Text_Field() {
        clickOnWebElement(hashOfSharesTextField);
    }

    public String view_Low_Price_Warning() {
        waitForElement(2);
        return getText(lowPriceWarningMsg);
    }

    public void enters_Numeric_Value_In_Share_Price_Field_Higher_Than_Market_Price() {
        String marketEstimateValue = getText(marketEstimate);
        String marketEstimateValueNumber = marketEstimateValue.replaceAll("[^0-9]", "");
        double marketEstimateNumeric = Double.parseDouble(marketEstimateValueNumber);
        double enteredSharePrice = marketEstimateNumeric + 10;
        Assert.assertTrue("Entered share price is not higher than market estimate.", enteredSharePrice > marketEstimateNumeric);
        clearText(sharePriceField);
        sendKeys(sharePriceField, String.valueOf(enteredSharePrice));
    }


    public String numeric_Value_Is_Visible_In_Shares_Text_Field() {
        return getAttributeValue(hashOfSharesTextField);
    }

    public void enters_Alphabetic_Value_In_Shares_Field(String alphaValue) {
        clearText(hashOfSharesTextField);
        sendKeys(hashOfSharesTextField, alphaValue);
    }

    public String alphabeticValueIsNotVisibleInSharesTextField() {
        return getAttributeValue(hashOfSharesTextField);
    }

    public void enters_Special_Character_Value_In_Shares_Text_Field(String specialCharacter) {
        clearText(hashOfSharesTextField);
        sendKeys(hashOfSharesTextField, specialCharacter);
    }

    public String special_Character_Value_Is_Not_Visible_In_Shares_Text_Field() {
        return getAttributeValue(hashOfSharesTextField);
    }

    public void press_SpaceBar_In_Shares_Text_Field() {
        clearText(hashOfSharesTextField);
        hashOfSharesTextField.sendKeys(Keys.SPACE);
    }

    public String press_Space_Bar_Input_Is_Not_Visible_In_Shares_Text_Field() {
        return getAttributeValue(hashOfSharesTextField);
    }

    public void entersZeroAsInputInSharesTextField(String input) {
        clearText(hashOfSharesTextField);
        hashOfSharesTextField.sendKeys(String.valueOf(input));
    }

    public void set_Number_Of_Share_Count_More_Than_Share_Hold_By_Shareholder(String input) {
        clearText(hashOfSharesTextField);
        hashOfSharesTextField.sendKeys(String.valueOf(input));
    }

    public Boolean cannot_Exceed_Amount_Owned_Warning() {
        return isElementVisible(cannotExceedAmountWarningMsg);
    }

    public void enter_Between_Shares_Hold_By_Shareholder(String input) {
        clearText(hashOfSharesTextField);
        hashOfSharesTextField.sendKeys(String.valueOf(input));
    }

    public void view_Fees_Calculation() {
        String grossAmount = getText(grossAmountValue);
        String grossAmountNumber = grossAmount.replaceAll("[^\\d.]", "");
        double grossAmountNumeric = Double.parseDouble(grossAmountNumber);
        double grossSaleAmountValue = grossAmountNumeric * 0.05;
        DecimalFormat df = new DecimalFormat("0.00");
        String feesNumericValue = getText(feesValue);
        Assert.assertTrue("Fees calculation is not based on (Gross Sale Amount) * (0. 05)", feesNumericValue.replaceAll("[^\\d.]", "").equals(String.valueOf(df.format(grossSaleAmountValue))));

    }

    public void view_Net_Amount_To_You_Calculation() {
        String grossAmount = getText(grossAmountValue);
        String grossAmountNumber = grossAmount.replaceAll("[^\\d.]", "");
        double grossAmountNumeric = Double.parseDouble(grossAmountNumber);
        String fees = getText(feesValue);
        String feesValueNumber = fees.replaceAll("[^\\d.]", "");
        double feesValueNumeric = Double.parseDouble(feesValueNumber);
        double netAmountToYouValueNumber = grossAmountNumeric - feesValueNumeric;
        DecimalFormat df = new DecimalFormat("0.00");
        String netAmountToYou = getText(netAmountToYouValue);
        Assert.assertTrue(" Net amount to you calculation is not based on (Gross Sale Amount) − (1-0.05) on sell submitted page ", netAmountToYou.replaceAll("[^\\d.]", "").equals(String.valueOf(df.format(netAmountToYouValueNumber))));
    }

    public Boolean view_Two_Factor_Method_Verification_Popup() {
        return isElementVisible(twoFactorMethodVerificationPopup);
    }

    public String view_Placeholder_Text_Choose_Verification_Method_To_Verify_Your_Identity() {
        return getText(chooseTheVerificationMethodVerifyYourIdentity);
    }

    public Boolean view_SMS_Text_Message_By_Default_Selected() {
        return smsTextMessageOptionWithProvidedMobileNumber.isSelected();
    }

    public Boolean view_SMS_Text_Message_Option_With_Provided_Mobile_Number() {
        return isElementVisible(smsTextMessageOptionWithProvidedMobileNumber);
    }

    public Boolean view_Email_Option_With_Provided_Email_Address() {
        return isElementVisible(emailOptionWithProvidedEmailAddress);
    }

    public Boolean view_Cancel_Button_Text() {
        return isElementVisible(cancelButton);
    }

    public Boolean view_Confirm_Button_Text() {
        return isElementVisible(confirmButton);
    }

    public void click_On_Email_Option() {
        waitForElement(2);
        clickOnWebElement(emailOptionWithProvidedEmailAddress);
    }

    public Boolean view_Email_Option_Selected() {
        return emailOptionWithProvidedEmailAddress.isSelected();
    }

    public void click_On_SMS_Text_Option() {
        waitForElement(2);
        clickOnWebElement(smsTextMessageOptionWithProvidedMobileNumber);
    }

    public Boolean view_SMS_Text_Option_Selected() {
        return smsTextMessageOptionWithProvidedMobileNumber.isSelected();
    }

    public void click_On_Cancel_Button() {
        clickOnWebElement(cancelButton);
    }


    public void click_On_Confirm_Button() {
        clickOnWebElement(confirmButton);
    }

    public Boolean view_Two_Factor_Auth_Verification_Popup() {
        waitForElement(2);
        return isElementVisible(viewTwoFactorAuthVerificationPopup);
    }

    public void click_Outside_The_Popup() {
        clickOutsideThePopup();
    }

    public Boolean view_SMS_Text_Option_Deselected() {
        return smsTextMessageOptionWithProvidedMobileNumber.isSelected();
    }

    public Boolean view_Email_Option_Deselected() {
        return emailOptionWithProvidedEmailAddress.isSelected();
    }

    public String verify_Text_Please_Confirm_Your_Identity_Complete_This_Action() {
        waitForElement(2);
        return getText(pleaseConfirmYourIdentityCompleteThisAction);
    }

    public String verify_View_SMS_Text_Message_Sent() {
        return getText(viewSMSTextMessageSent);
    }


    public String verify_View_Please_Enter_6_Digit_Code_Sent_Number_Ending_XXXX() {
        return getText(pleaseEnter6DigitCodeSent);
    }

    public Boolean verify_View_6_Digit_Code_Input_Field() {
        waitForElement(2);
        return sixDigitCodeInputField.isDisplayed();
    }

    public Boolean verify_View_Confirm_Code_Button() {
        return confirmCodeButton.isDisplayed();
    }

    public String verify_View_DidNot_Receive_It() {
        return getText(didNotReceiveIt);
    }

    public String verify_View_Resend_Code() {
        return getText(resendCode);
    }

    public String verify_View_Use_Another_Method() {
        return getText(useAnotherMethod);
    }

    public String verify_View_Otp_Sent() {
        return getText(viewOtpSent);
    }

    public String verify_View_Please_Enter_Code_Sent_Your_Email_Order_To_Verify_Your_Identity() {
        return getText(viewPleaseEnterCodeSentYourEmailOrderToVerifyYourIdentity);
    }

    public void enter_Valid_6Digit_Code(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
    }

    public void clicks_On_Confirm_Code_Button() {
        waitForElement(2);
        clickOnWebElement(confirmCodeButton);
        waitForElement(2);
    }

    public Boolean view_Id_verified_Popup() {
        return isElementVisible(idVerifiedPopup, 10);
    }

    public void enter_The_One_To_Five_Digit_Numeric_Code(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
    }

    public Boolean view_Confirm_Code_Button_Disabled() {
        return isEnabled(confirmCodeButton);
    }

    public void delete_otp_In_Boxes() {
        waitForElement(2);
        for (int i = otp6Box.size() - 1; i >= 0; i--) {
            otp6Box.get(i).sendKeys(Keys.BACK_SPACE);
        }
    }


    public void enter_Alphabetic_Code(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
    }

    public Boolean getOtpPin() {
        for (int i = 0; i < otp6Box.size(); i++) {
            getAttributeValue(otp6Box.get(i));
        }
        return false;
    }

    public void enter_Special_Character_Code(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
    }

    public void enter_Wrong_Otp_Code(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
        otpAttempts++;
    }

    public Boolean view_Wrong_Otp_Error_Msg() {
        return wrongOtpErrorMsg.isDisplayed();
    }

    public String verify_User_Should_View_Wrong_Error_Message() {
        return getText(threeAttemptWrongErrorMsg);
    }

    public void click_On_Cross_Icon_On_Two_Factor_Auth_Verification_Popup() {
        clickOnWebElement(crossIconTwoFactorAuthVerificationPopup);
    }

    public Boolean click_On_Resend_Code_Link() {
        try {
            clickOnWebElement(resendCode);
            waitForElement(2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String view_Toast_Msg_To_Check_The_Functionality_Resend_Code_Link() {
        return getText(toastMsgResendCode);
    }

    public void verify_User_Able_To_Enter_Three_Times_Wrong_OTP(String otpPin) {
        sendkeysForOtp(otp6Box, otpPin);
        otpAttempts++;
        Assert.assertEquals("OTP attempts should be 3", 3, otpAttempts);
    }

    public void click_On_Use_Another_Method_Link() {
        clickOnWebElement(useAnotherMethod);
    }

    public String navigate_To_Two_Factor_Method_PopUp() {
        return getText(chooseTheVerificationMethodVerifyYourIdentity);
    }

    public String view_Previously_Selected_Option() {
        return getText(smsTextMessage);
    }

    public Boolean click_On_Another_Method() {
        waitForElement(2);
        clickOnWebElement(emailOptionWithProvidedEmailAddress);
        return emailOptionWithProvidedEmailAddress.isSelected();
    }

    public String view_Header_Id_Verified_Text() {
        return getText(headerIDVerified);
    }

    public String view_Your_ID_Verified_And_Your_Sell_Order_Has_Been_Submitted() {
        return getText(yourIDHasBeenVerifiedAndYourSellOrderHasBeenSubmitted);
    }

    public Boolean view_Cross_Icon() {
        return crossIcon.isDisplayed();
    }

    public void click_On_Cross_Icon_On_Id_Verified_Popup() {
        clickOnWebElement(crossIcon);
    }

    public Boolean verify_Agree_To_Terms_Popup() {
        waitForVisibility(agreeToTermsPopup);
        return isElementVisible(agreeToTermsPopup, 10);
    }

    public void click_On_Close_Agree_To_Terms_Popup() {
        clickOnWebElement(crossIconAgreeToTermsPopup);
    }

    public boolean isIdVerificationPopupAutoClosed() {
        return isElementVisible(preparingContractLoader, 3);
    }

    public String view_Preparing_Contract_Loader() {
        waitForVisibility(preparingContractLoader);
        return getText(preparingContractLoader);
    }

    public String view_Agree_To_Terms_Text() {
        String actualText = getText(agreeToTermsText).replace("Oakwood Sarasota", "").trim();
        return actualText;
    }

    public Boolean view_Property_Name() {
        return isElementVisible(propertyNameOnTermsPopup);
    }

    public Boolean view_AgreementDescription() {
        return isElementVisible(agreementDescription);
    }

    public Boolean view_Enter_Your_Initials_Field() {
        return isElementVisible(enterYourInitials);
    }

    public Boolean view_Agree_And_Continue_Button() {
        return isElementVisible(agreeAndContinueButton);
    }

    public Boolean view_Download_Button() {
        return isElementVisible(downloadButton);
    }

    public Boolean view_Cross_Icon_At_Right_Top() {
        return isElementVisible(crossIconAgreeToTermsPopup);
    }

    public boolean is_Enter_Initials_Button_Active() {
        waitForElement(3);
        scrollPopUpByJs();
        waitForVisibility(enterYourInitials);
        return enterYourInitials.isEnabled();
    }


    public void enter_Initials(String initials) {
        waitForElement(2);
        clearText(enterYourInitials);
        sendKeys(enterYourInitials, initials);
    }

    public String get_Entered_Initials() {
        return getAttributeValue(enterYourInitials);
    }

    public Boolean initials_Should_Contain_Two_To_Three_Alpha_Characters() {
        return (get_Entered_Initials().length() <= 3 || get_Entered_Initials().length() >= 2 || get_Entered_Initials().matches("^[a-zA-Z]*$"));
    }

    public boolean validate_Profile_First_Last_Name() {
        return get_Entered_Initials().equals(getText(profileText));
    }

    public String entered_Initials_Should_Not_Contain_Numeric_Digits() {
        return getAttributeValue(enterYourInitials);
    }

    public String entered_Initials_Should_Not_Contain_Special_Character() {
        return getAttributeValue(enterYourInitials);
    }

    public Boolean verify_LowerCase_Alphabets_Should_Be_Changed_To_Uppercase_Characters() {
        String initials = "abc";
        return getAttributeValue(enterYourInitials).equals(initials.toUpperCase());
    }

    public void press_SpaceBar_In_Enter_Your_Initials_Field() {
        clearText(enterYourInitials);
        enterYourInitials.sendKeys(Keys.SPACE);
    }

    public String press_Space_Bar_Input_Is_Not_Allowed_In_Enter_Your_Initials_Field() {
        return getAttributeValue(enterYourInitials);
    }

    public void click_On_Agree_To_Continue_Button() {
        waitforElementClickable(agreeAndContinueButton, 10);
        clickOnWebElement(agreeAndContinueButton);
        waitForElement(2);
    }

    public Boolean view_Error_Msg_Below_Enter_Your_Initials() {
        return isElementVisible(errorMsgWrongEnterYourInitials);
    }

    public String verify_Error_Msg_Below_Enter_Your_Initials() {
        return getText(errorMsgWrongEnterYourInitials);
    }

    public Boolean navigate_To_Sell_Submitted_Page() {
        return isElementVisible(sellOrderSubmittedPage);
    }


    public void clicks_On_Cross_Icon_Agree_To_Terms_Page() {
        waitForElement(2);
        clickOnWebElement(crossIconAgreeToTermsPopup);
    }

    public Boolean verify_Agree_To_Terms_Popup_Close_Functionality() {
        return isElementVisible(agreeToTermsText, 10);
    }

    public Boolean verify_Breadcrumbs_Sell_Submitted_Page() {
        return isElementVisible(breadCrumbsSubmittedPage);
    }

    public String verify_Header_Sell_Order_Submitted_Text() {
        return getText(sellOrderSubmittedText);
    }

    public String verify_Asset_Name_Sell_Order_Submitted() {
        property = getText(assetNameText);
        return property;
    }

    public void verify_NetAmount_To_You_Sell_Order_Submitted() {
        Assert.assertTrue(isElementVisible(netAmountToYouSubmittedText));
        String grossAmount = getText(grossPriceValueSubmitted);
        String grossAmountNumber = grossAmount.replaceAll("[$]", "");
        double grossAmountNumeric = Double.parseDouble(grossAmountNumber);
        double netAmountToYouValueNumber = grossAmountNumeric * 0.95;
        DecimalFormat df = new DecimalFormat("0.00");
        String netAmountToYou = getText(netAmountToYouValueSubmitted);
        Assert.assertTrue(" Net amount to you calculation is not based on (Gross Sale Amount) − (Fees)", netAmountToYou.replaceAll("[$]", "").equals(String.valueOf(df.format(netAmountToYouValueNumber))));
    }

    public boolean verify_Share_Price_Sell_Order_Submitted() {
        return isElementVisible(sharePriceSubmitted);
    }

    public Boolean verify_Number_Of_Shares_Sell_Order_Submitted() {
        return isElementVisible(numberOfSharesSubmitted);
    }

    public void verify_Gross_Price_Sell_Order_Submitted() {
        Assert.assertTrue(isElementVisible(grossPriceSubmitted));
        String sharePrice = getText(sharePriceValueSubmitted);
        String sharePriceNumber = sharePrice.replaceAll("[$]", "");
        String numberOfShares = getText(numberOfShareValueSubmitted);
        double numberOfSharesNumber = Double.parseDouble(numberOfShares);
        DecimalFormat df = new DecimalFormat("0.00");
        double grossPriceAmount = Double.parseDouble(sharePriceNumber) * numberOfSharesNumber;
        String grossPriceValueText = getText(grossPriceValueSubmitted).replaceAll("[$]", "");
        Assert.assertTrue(" Gross amount value calculation is not based on (sharePrice) * (numberOfShares) on sell submitted page ", grossPriceValueText.equals(String.valueOf(df.format(grossPriceAmount))));
    }

    public void verify_Fees_Sell_Order_Submitted() {
        Assert.assertTrue(isElementVisible(feesSubmitted));
        String grossAmount = getText(grossPriceValueSubmitted);
        String grossAmountNumber = grossAmount.replaceAll("[^\\d.]", "");
        double grossAmountNumeric = Double.parseDouble(grossAmountNumber);
        double grossSaleAmountValue = grossAmountNumeric * 0.05;
        DecimalFormat df = new DecimalFormat("0.00");
        String feesNumericValue = getText(feesValueSubmitted);
        Assert.assertTrue("Fees calculation is not based on (Gross Sale Amount) * (0. 05) on sell submitted page ", feesNumericValue.replaceAll("[^\\d.]", "").equals(String.valueOf(df.format(grossSaleAmountValue))));

    }

    public void verify_Total_Amount_Sell_Order_Submitted() {
        Assert.assertTrue(isElementVisible(totalAmountSubmitted));
        String sharePrice = getText(sharePriceValueSubmitted);
        String sharePriceNumber = sharePrice.replaceAll("[$]", "");
        String numberOfShares = getText(numberOfShareValueSubmitted);
        double numberOfSharesNumber = Double.parseDouble(numberOfShares);
        DecimalFormat df = new DecimalFormat("0.00");
        double TotalAmount = Double.parseDouble(sharePriceNumber) * numberOfSharesNumber;
        String totalAmountValueText = getText(totalAmountValueSubmitted).replaceAll("[$]", "");
        Assert.assertTrue(" Total amount value calculation is not based on (sharePrice) * (numberOfShares) on sell submitted page ", totalAmountValueText.equals(String.valueOf(df.format(TotalAmount))));
    }

    public Boolean verify_View_Portfolio_Btn_Sell_Order_Submitted() {
        return isElementVisible(viewPortfolioBtnSubmitted);
    }

    public Boolean clicks_On_View_Portfolio_Button_Sell_Order_Submitted() {
        try {
            clickOnWebElement(viewPortfolioBtnSubmitted);
            waitForElement(2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void click_On_Tooltip_Of_Property_Name_Tooltip() {
        hoverByAction(propertyNameTooltip);
    }

    public boolean verify_Tooltip_Of_Property_Name() {
        return isElementVisible(propertyNameTooltip);
    }

    public void click_On_Tooltip_Of_Market_Estimate_Tooltip() {
        hoverByAction(marketEstimateTooltip);
    }

    public boolean verify_Tooltip_Of_Market_Estimate_Description() {
        return isElementVisible(marketEstimateTooltip);
    }


    public boolean verify_PlaceHolder_Text() {
        return isElementVisible(placeHolderText);
    }

    public boolean verify_Investment_Section() {
        return isElementVisible(investmentDetails);
    }

    public boolean verify_Thumbnail_Image_In_Investment_Section() {
        return isElementVisible(thumbnailImageInvestmentDetails);
    }

    public String verify_Property_Name_In_Investment_Section() {
        return getText(propertyNameInvestmentDetails);
    }

    public void verify_Total_Shares_And_Value_In_Investment_Section() {
        Assert.assertTrue(isElementVisible(totalSharesInvestmentDetails));
        Assert.assertNotNull("Total share value is null ", totalSharesValueInvestmentDetails);
        getText(totalSharesValueInvestmentDetails);
    }


    public void verify_Average_Share_Cost_In_Investment_Section() {
        Assert.assertTrue(isElementVisible(averageShareCostInvestmentDetails));
    }

    public void verify_Average_Share_Cost_Value_In_Investment_Section() {
        Assert.assertNotNull("Average share cost value is null ", totalSharesValueInvestmentDetails);
        String totalSharesValue = getText(totalSharesValueInvestmentDetails);
        double totalSharesValueNumber = Double.parseDouble(totalSharesValue);
        String totalValue = getText(totalValueInvestmentDetails);
        String totalValueNumber = totalValue.replaceAll("[^0-9]", "");
        double totalValueNumeric = Double.parseDouble((totalValueNumber));
        double averageShareCostValue = totalValueNumeric / totalSharesValueNumber;
        String averageShareCost = getText(averageShareCostValueInvestmentDetails);
        String averageCostNumber = averageShareCost.replaceAll("[^0-9]", "");
        double averageCostNumeric = Double.parseDouble((averageCostNumber));
        Assert.assertTrue(" Average share cost value calculation is not based on (totalValue) / (totalShares)", String.valueOf(averageCostNumeric).equals(String.valueOf((averageShareCostValue))));
    }

    public void verify_Total_Value_Text_In_Investment_Section() {
        Assert.assertTrue(isElementVisible(totalValueInvestmentDetails));
    }

    public String verify_Total_Value_In_Investment_Section() {
        return getText(totalValueInvestmentDetails);
    }

    public String verify_Gross_Sale_Amount_In_Sell_Order_Table() {
        return getText(grossSaleAmountText);
    }

    public void verify_Gross_Sale_Amount_And_Oracle_Icon_And_Market_Estimate_And_Estimate_Price_Sell_Order_Table() {
        Assert.assertNotNull("Gross sale amount value is not visible", isElementVisible(grossAmountValue));
        Assert.assertTrue("Oracle Icon is not visible", isElementVisible(oracleIcon));
        Assert.assertTrue("Market estimate is not visible", isElementVisible(marketEstimate));
    }

    public void verify_Gross_Sale_Amount_Value() throws ParseException {
        waitForElement(3);
        sendKeys(sharePriceField, "1000");
        String sharePrice = getAttributeValue(sharePriceField);
        String sharePriceNumber = sharePrice.replaceAll("[$]", "");
        sendKeys(hashOfSharesTextField, "5");
        String hashOfShares = getAttributeValue(hashOfSharesTextField);
        double hashOfSharesNumber = Double.parseDouble(hashOfShares);
        DecimalFormat df = new DecimalFormat("0.00");
        double grossSaleAmount = Double.parseDouble(sharePriceNumber) * hashOfSharesNumber;
        String grossAmountValueText = getText(grossAmountValue).replaceAll("[$]", "");
        Assert.assertTrue(" Gross amount value calculation is not based on (sharePrice) * (hashOfShares)", grossAmountValueText.equals(String.valueOf(df.format(grossSaleAmount))));

    }

    public void verify_Share_Price_Field_Name_And_Text_Field() {
        Assert.assertEquals("Share price field name is mismatch", "Share Price", getText(sharePriceText));
        Assert.assertTrue("Share price text field is not visible ", isElementVisible(sharePriceField));
    }

    public void verify_Hash_Of_Share_Field_Name_And_Text_Field() {
        Assert.assertTrue("# of share field name with actual holding share count is not visible", isElementVisible(hashOfSharesText));
        Assert.assertNotNull("# of share text field is empty ", isElementVisible(hashOfSharesTextField));
    }

    public void verify_Fees_And_Net_Amount_To_You_Text() {
        Assert.assertEquals("Fees text is mismatch", "Fees", getText(feesText));
        Assert.assertEquals("Net Amount to you text is mismatch", "Net Amount to You", getText(netAmountToYouText));
    }

    public Boolean verify_Continue_Button_On_Sell_Share_Page() {
        return isElementVisible(continueBtn);
    }

    public Boolean verify_Not_Able_To_View_Currently_Listed_List() {
        return isElementVisible(noDataSell);
    }

    public Boolean verify_Not_Able_To_View_Recently_Listed_List() {
        return isElementVisible(noDataSell);
    }


}
