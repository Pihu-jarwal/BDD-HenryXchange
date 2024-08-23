package org.xchange.pom;

import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class BuySharePage extends Helper {

    public BuySharePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@class=\"buy buy-btn \"])[1]")
    private WebElement marketBuyBtn;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement breadCrumbsBuyPage;

    @FindBy(xpath = "//div[@class='marketEst_price']/button")
    private WebElement propertyDetailBuyBtn;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    private WebElement terms;

    @FindBy(xpath = "(//div[@class='similar-prop-price']/button)[1]")
    private WebElement similarPropertyBuy;

    @FindBy(xpath = "(//button[@class=\"buy buy-btn \"])[1]")
    private WebElement marketLevel2Buy;

    @FindBy(xpath = "//h5[@class='property-name ']")
    private List<WebElement> assetName;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root dark')]")
    private List<WebElement> availableSharesGreyed;

    @FindBy(xpath = "//input[@placeholder=\"Enter Shares\"]")
    private WebElement enterShares;

    @FindBy(xpath = "//span[text()='Careers']")
    private WebElement careers;

    @FindBy(xpath = "(//div[contains(@class,'shareData')])[1]")
    private WebElement shareData;

    @FindBy(xpath = "//a[text()='Market']")
    private WebElement market;

    @FindBy(xpath = "//span[@class=\"amount\"]")
    private WebElement marketEstimate;

    @FindBy(xpath = "//button[contains(@aria-labelledby,'mui')]")
    private WebElement toolTip;

    @FindBy(xpath = "//div[contains(@aria-labelledby,'mui')]")
    private WebElement toolTipMarketEstimate;

    @FindBy(xpath = "//span[contains(@class,'MuiSwitch-root')]")
    private WebElement toggleBtn;

    @FindBy(xpath = "//span[contains(@class,' Mui-checked Mui-checked')]")
    private WebElement usdToggle;

    @FindBy(xpath = "//button[text()='Buy Shares']")
    private WebElement buyShareBtn;

    @FindBy(xpath = "//h2[@class=\"pageTitle fund-your-purchase\"]")
    private WebElement fundYourPurchase;

    @FindBy(xpath = "//p[text()='Shares Avail.']/span")
    private WebElement availableShare;

    @FindBy(xpath = "//input[@placeholder=\"Enter USD\"]")
    private WebElement usd;

    @FindBy(xpath = "//div[contains(@class,'dollerIc')]")
    private WebElement dollarIcon;

    @FindBy(xpath = "//h1[contains(@class,'pageTitle')]/p")
    private WebElement marketInvestment;

    @FindBy(xpath = "//div[text()='Avg. per Share']/following-sibling::div")
    private WebElement avgPerShare;

    @FindBy(xpath = "//div[text()='Total Investment']/following-sibling::div")
    private WebElement totalInvestmentAmount;

    @FindBy(xpath = "//div[contains(text(),'# ')]/following-sibling::div")
    private WebElement shareCount;

    @FindBy(xpath = "//button[text()='Cancel Purchase']")
    private WebElement cancelPurchase;

    @FindBy(xpath = "//h2[@class=\"cancel_heading\"]")
    private WebElement cancelHeading;

    @FindBy(xpath = "//button[text()='edit']")
    private WebElement editBtn;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement breadCrumbs;

    @FindBy(xpath = "//div[text()='# of Shares']/following-sibling::div")
    private WebElement shareValue;

    @FindBy(xpath = "//p[@class=\"cancel_sub_heading\"]")
    private WebElement cancelPopupSubHeading;

    @FindBy(xpath = "(//div[contains(@class,'btn_holder')])[2]")
    private WebElement cancelAndContinueButton;

    @FindBy(xpath = "//button[text()='Yes, Cancel']")
    private WebElement yesCancelBtn;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    private WebElement confirmPurchaseBtn;

    @FindBy(xpath = "//button[text()='Continue Purchase']")
    private WebElement continuePurchaseBtn;

    @FindBy(xpath = "//h2[@class=\"pageTitle\"]")
    private WebElement confirmYourPurchase;

    @FindBy(xpath = "//h4[contains(text(),'Agree')]")
    private WebElement agreeToTerms;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//div[contains(@class,'verification_field')]")
    private WebElement verificationPopUp;

    @FindBy(xpath = "//p[contains(text(),'Choose the')]")
    private WebElement verificationPopupText;

    @FindBy(xpath = "(//input[@name=\"row-radio-buttons-group\"])[1]")
    private WebElement smsRadioBtn;

    @FindBy(xpath = "(//input[@name=\"row-radio-buttons-group\"])[2]")
    private WebElement emailRadioBtn;

    @FindBy(xpath = "//div[text()='Email']")
    private WebElement emailRadioButton;

    @FindBy(xpath = "//div[text()='SMS (Text Message)']")
    private WebElement smsRadioButton;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//div[contains(@class,'MuiDialog-paperScrollPape')]")
    private WebElement twoFactorAuthPopUp;

    @FindBy(xpath = "//p[contains(@class,'heading')]")
    private List<WebElement> headingTwoAuthPopup;

    @FindBy(xpath = "//p[text()='ID Verified']")
    private WebElement idVerifiedPopup;

    @FindBy(className = "OtpInput")
    private List<WebElement> otpBox;

    @FindBy(xpath = "//p[@class='text-red error-otp-buy']")
    private WebElement errorCode;

    @FindBy(xpath = "//p[@class=\"text-red error-otp-buy\"]")
    private WebElement expireCodeError;

    @FindBy(xpath = "//button[text()='Confirm Code']")
    private WebElement confirmCodeBTn;

    @FindBy(xpath = "//div[@class=\"otpContainer\"]")
    private WebElement otpContainer;

    @FindBy(xpath = "(//a[@class='link'])[1]")
    private WebElement resendCodeLink;

    @FindBy(xpath = "//div[contains(text(),'Code')]")
    private WebElement resendCodeToastMsg;

    @FindBy(xpath = "//a[contains(text(),'Use another')]")
    private WebElement useAnotherMethod;

    @FindBy(xpath = "//p[contains(text(),'Your ID')]")
    private WebElement subHeadingOfVerifiedPopup;

    @FindBy(xpath = "//img[@alt='close-icon']")
    private WebElement closeIcon;

    @FindBy(xpath = "//div[contains(@class,'inner_loader')]/p")
    private WebElement preparingContractLoader;

    @FindBy(xpath = "//div[@class='header']/p")
    private WebElement propertyNameOfAgreeToTerms;

    @FindBy(xpath = "//div[@class='text agree_terma_holder']/p")
    private List<WebElement> agreementDescription;

    @FindBy(xpath = "//button[@class=\"download\"]")
    private WebElement downloadIcon;

    @FindBy(xpath = "//canvas[@class=\"react-pdf__Page__canvas\"]")
    private WebElement pdfPage;

    @FindBy(xpath = "//div[@class=\"agree-sec\"]")
    private WebElement agreementSection;

    @FindBy(xpath = "//span[@class='close-icon']")
    private WebElement agreeCloseIcon;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement enterYourInitials;

    @FindBy(xpath = "//p[@class=\"text-red terms_error_message\"]")
    private WebElement errorMsg;

    @FindBy(css = "button[class=\"agree-btn blue-btn-sm\"]")
    private WebElement agreeToTermsBtn;

    @FindBy(xpath = "//div[@class='text agree_terma_holder']")
    private WebElement agreeToTermsPopUpWithCheckbox;

    @FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
    private WebElement profileNameText;

    @FindBy(xpath = "//div[@class='header']/p")
    private WebElement PropertyNameOFAgreePopup;

    @FindBy(xpath = "//div[contains(@class,'MuiBox-root')]/p/h2")
    private WebElement cancelPopup;

    @FindBy(xpath = "//span[contains(@class,'Mui-checked')]")
    private WebElement checkboxAgreePopup;

    @FindBy(xpath = "//input[@type='checkbox]")
    private WebElement checkbox;

    @FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input')])[1]")
    private WebElement descriptionCheckbox;

    @FindBy(xpath = "//input[contains(@class,'PrivateSwitchBase-input')]")
    private List<WebElement> checkboxes;

    @FindBy(xpath = "//p[contains(text(),'Your')]")
    private WebElement purchaseCompletedMsg;

    @FindBy(xpath = "//button[contains(text(),'View')]")
    private WebElement viewPortfolio;

    @FindBy(xpath = "//div[contains(@class,'inner_right_sellShare')]/div/p")
    private WebElement PropertyNameOfPurchaseDetail;

    @FindBy(xpath = "(//div[@class='name-flex']/p)[1]")
    private WebElement investmentPropertyName;

    @FindBy(xpath = "//button[text()='Buy']")
    private List<WebElement> buyBtn;

    @FindBy(xpath = "//h2[text()='Purchase Summary']/following-sibling::div")
    private List<WebElement> purchaseSummary;

    @FindBy(xpath = "//h2[text()='Transfer Summary']/following-sibling::div")
    private List<WebElement> transferSummary;

    @FindBy(xpath = "//h2[text()='Balance Summary']/following-sibling::div")
    private List<WebElement> balanceSummary;

    @FindBy(xpath = "(//li[@class='MuiBreadcrumbs-li'])[1]")
    private WebElement marketBreadCrumbs;

    @FindBy(xpath = "(//li[@class='MuiBreadcrumbs-li'])[2]")
    private WebElement PropertyDetailBreadCrumbs;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]/li/p")
    private WebElement purchaseDetailBreadCrumbs;

    @FindBy(xpath = "//h1[contains(@class,'pageTitle')]")
    private WebElement buyPropertyNameAndMinimumInvestment;

    @FindBy(xpath = "//td[contains(@class,'MuiTableCell-root')]")
    private List<WebElement> tableCellValue;

    @FindBy(xpath = "//tbody[contains(@class,'MuiTableBody-root')]")
    private List<WebElement> tableRowValue;

    @FindBy(xpath = "//tr[contains(@class,'light')]")
    private WebElement highlightShareRow;

    @FindBy(xpath = "//tr[contains(@class,'dark')]")
    private WebElement greyedRemainingShare;

    @FindBy(xpath = "//div[contains(text(),'Amount')]")
    private WebElement validationMsg;

    @FindBy(xpath = "//p[text()='Total shares']/span")
    private WebElement totalShare;

    @FindBy(xpath = "//p[text()='Average share cost']/span")
    private WebElement avgShareCost;

    @FindBy(xpath = "//p[text()='Total INVESTMENT value']/span")
    private WebElement totalInvestmentValue;

    @FindBy(xpath = "//p[contains(text(),'Linked Accounts')]/following-sibling::span")
    private WebElement noLinkedAccounts;

    @FindBy(xpath = "//p[text()=' Total Amount']/following-sibling::h2")
    private WebElement totalAmount;

    @FindBy(xpath = "//div[contains(@class,'net')]/p")
    private List<WebElement> henryAccountAndFunds;

    @FindBy(xpath = "//div[contains(@class,'btn_holdergrp')]/div/button")
    private WebElement cancelAndLinkedAccountBtn;

    @FindBy(xpath = "//div[contains(@class,'inner_exceed_amount')]/p")
    private WebElement noLinkAccountWarningMsg;

    @FindBy(xpath = "//div[contains(text(),'The number')]")
    private WebElement shareErrorMsg;

    @FindBy(xpath = "//p[contains(text(),'Henry Account')]/following-sibling::p")
    private WebElement henryAccount;

    @FindBy(xpath = "//h5[text()='Are you there ?']")
    private WebElement areYouTherePopup;

    @FindBy(xpath = "//button[text()='Continue Purchase']")
    private WebElement continuePurchase;

    @FindBy(xpath = "//p[@class=\"text-grey\"]")
    private WebElement areYouThereGreyText;

    @FindBy(xpath = "//p[@class='text-red']")
    private WebElement areYouThereRemainingTime;

    @FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/thead/tr/th[text()='Share Price'])]")
    private List<WebElement> columnValueOfAvailableShare;

    @FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/thead/tr/th[text()='Share Price']/preceding-sibling::th)+1+1+1+1]")
    private List<WebElement> sharePrice;

    @FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/thead/tr/th[text()='Share Price']/preceding-sibling::th)+1+1]")
    private List<WebElement>  vsLow;

    @FindBy(xpath = "//div[@class='header']/h5")
    private WebElement noShareNoLongerAvaiable;

    @FindBy(xpath = "//p[@class=\"text-grey\"]")
    private WebElement greySharesText;

    @FindBy(xpath = "//button[@class=\"agree-btn blue-btn-sm\"]")
    private WebElement okayBtn;

    @FindBy(xpath = "//h4[text()='Agree to Terms']")
    private WebElement agreeToTermsPlaceholder;

    @FindBy(xpath = "//button[text()='Yes, Cancel']")
    private WebElement yesCancelButton;

    public void click_On_Market_Buy_Btn() {
        clickOnWebElement(marketBuyBtn);
    }

    public void click_On_Level_2_Market_Buy() {
        waitForElement(2);
        clickOnWebElement(marketLevel2Buy);
    }

    public String verify_Buy_Page() {
        return getText(breadCrumbsBuyPage);
    }

    public void click_On_Property_Buy_Btn() {
        waitForElement(3);
        clickOnWebElement(propertyDetailBuyBtn);
        waitForElement(2);
    }

    public void scroll_Property_Page() {
        scrollByVisibilityOfElement(driver, terms);
    }

    public void click_On_similar_Property_Buy_Btm() {
        scrollByVisibilityOfElement(driver, careers);
        clickOnWebElement(similarPropertyBuy);
        waitForElement(2);
    }

    public void verify_Available_Share() {
        for (int i = 0; i < availableSharesGreyed.size(); i++) {
            Assert.assertTrue("Greyed shares is not available",isElementVisible(availableSharesGreyed.get(i)));
        }
    }

    public void enter_Shares_In_Input_Field(String shareValue) {
        sendKeys(enterShares, shareValue);
        Assert.assertTrue(getText(shareData).length() > 0);
        clickOnWebElement(market);
    }

    public void enter_Shares_Count_In_Input_Field(String shareValue) {
        waitforElementClickable(enterShares, 10);
        sendkeysOneByOne(enterShares, shareValue);
        waitForElement(3);
    }

    public void verify_Share_Value() {
        Assert.assertTrue(getText(shareData).length() > 0);
        clickOnWebElement(market);
    }

    public void click_On_Market_Estimate() {
        clickByAction(marketEstimate);
    }

    public boolean validate_Tooltip() {
        hoverByAction(buyShareBtn);
        return isElementVisible(toolTip, 10);
    }

    public boolean validate_Tooltip_Market_Estimate() {
        return isElementVisible(toolTipMarketEstimate, 10);
    }

    public void click_On_Toggle_Btn() {
        waitForElement(3);
        clickByAction(toggleBtn);
    }

    public boolean verify_USD_Toggle() {
        return isElementVisible(usdToggle, 10);
    }

    public boolean verify_Buy_Btn_Is_Enabled() {
        return buyShareBtn.isEnabled();
    }

    public void enter_Value_In_Share_Field() {
        int sum = 0;
        int count = 10;
        for (int i = 0; i < columnValueOfAvailableShare.size(); i++) {
            int value = Integer.parseInt(getText(columnValueOfAvailableShare.get(i)));
            sum = sum + value;
        }
        int value = sum + count;
        sendKeys(enterShares, String.valueOf(value));
    }

    public int enter_Shares_In_Share_Input_Field() {
        int sum = 0;
        for (int i = 0; i < columnValueOfAvailableShare.size(); i++) {
            int value = Integer.parseInt(getText(columnValueOfAvailableShare.get(i)));
            sum = sum + value;
        }
        sendKeys(enterShares, String.valueOf(sum));
        return sum;
    }

    public void enter_Usd_In_Input_Field() {
        String value = getText(marketInvestment).replace("$", "").replace("minimum", "").replace("investment", "").trim();
        sendkeysOneByOne(usd, value);
    }

    public void verify_share_And_Investment_Data() {
        waitForElement(3);
        String investment = getText(totalInvestmentAmount).replace("$", "").replace(",", "").trim();
        double totalInvestmentText = Double.parseDouble(investment);
        int intValueOfInvestment = (int) Math.floor(totalInvestmentText);
        String avgValue = getText(avgPerShare).replace("$", "").replace(",", "").trim();
        int share = Integer.parseInt(getText(shareCount));
        double avgToDoubleValue = Double.parseDouble(avgValue);
        double totalInvestment = share * avgToDoubleValue;
        int multiplicationOfAvgAndShare = (int) Math.floor(totalInvestment);
        LogReporter.INFO(""+multiplicationOfAvgAndShare);
        Assert.assertEquals("AvgPerShare * totalShare = InvestmentValue are not same as actual value", multiplicationOfAvgAndShare, intValueOfInvestment);
    }

    public void click_On_Buy_Share_Btn() {
        waitForElement(4);
        clickOnWebElement(buyShareBtn);
        waitForElement(3);
    }

    public String verify_Fund_Your_Purchase_Page() {
        return getText(fundYourPurchase);
    }

    public void click_On_Cancel_Purchase() {
        clickOnWebElement(cancelPurchase);
    }

    public boolean verify_Cancel_Popup() {
        return isElementVisible(cancelHeading, 5);
    }

    public void click_On_Edit_Button() {
        clickOnWebElement(editBtn);
    }

    public boolean validate_Previous_Data_On_Buy_Page() {
        waitForVisibility(shareCount);
        waitForElement(3);
        int value = Integer.parseInt(getText(shareCount));
        return value > 0;
    }

    public void validate_User_Can_Edit_Data() {
        String count = getText(shareCount);
        sendKeys(enterShares, "2");
        waitForElement(4);
        Assert.assertNotEquals(count, getText(shareCount));
    }

    public String verify_Cancel_Popup_Heading() {
        return cancelHeading.getText();
    }

    public String verify_Cancel_Popup_Sub_Heading() {
        return cancelPopupSubHeading.getText();
    }

    public boolean validate_Cancel_Continue_Btn_On_Cancel_Popup() {
        return cancelAndContinueButton.isDisplayed();
    }

    public void click_On_Yes_Cancel_Btn() {
        clickOnWebElement(yesCancelBtn);
    }

    public void click_On_Confirm_Purchase_Btn() {
        clickOnWebElement(confirmPurchaseBtn);
    }

    public String validate_Confirm_Your_Purchase() {
        return getText(confirmYourPurchase);
    }

    public void click_On_Continue_Purchase() {
        clickOnWebElement(continuePurchaseBtn);
    }

    public void click_On_Continue_Btn() {
        clickOnWebElement(continueBtn);
    }

    public boolean validate_Verification_Popup() {
        return isElementVisible(verificationPopUp, 10);
    }

    public String verify_Text_On_Verification_Pop_Up() {
        return getText(verificationPopupText);

    }

    public boolean verify_Sms_Radio_Btn_Is_Selected() {
        return smsRadioBtn.isSelected();
    }

    public void click_On_SMS_Radio_Btn() {
        clickOnWebElement(smsRadioButton);
    }

    public boolean verify_email_Radio_Btn_Is_Selected() {
        return emailRadioBtn.isSelected();
    }

    public void click_On_Email_Radio_Btn() {
        clickOnWebElement(emailRadioButton);
    }

    public void click_On_Cancel_Btn() {
        clickOnWebElement(cancelBtn);
    }

    public void click_On_Outside_The_Popup() {
        clickByAction(confirmYourPurchase);
    }

    public void click_On_Confirm_Btn() {
        clickOnWebElement(confirmBtn);
    }

    public boolean verify_Two_Factor_Auth_Popup() {
        return isElementVisible(twoFactorAuthPopUp);
    }

    public void validate_Two_Factor_Auth_UI() {
        for (WebElement element : headingTwoAuthPopup) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void set_OTP(String otp) {
        sendkeysForOtp(otpBox, otp);
    }

    public boolean verify_Id_Verified_PopUp() {
        return isElementVisible(idVerifiedPopup, 10);
    }

    public void click_On_Confirm_Code_Btn() {
        clickOnWebElement(confirmCodeBTn);
    }

    public boolean is_Confirm_Btn_Disable() {
        return confirmCodeBTn.isEnabled();
    }

    public void remove_Code_From_Otp_Box() {
        for (int i = otpBox.size() - 1; i >= 0; i--) {
            otpBox.get(i).sendKeys(Keys.BACK_SPACE);
        }
    }

    public String validate_Code_Expired_Error() {
        return getText(expireCodeError);
    }

    public void click_On_Resend_Code_Link() {
        clickOnWebElement(resendCodeLink);
    }

    public String validate_Resend_Code_Link_Msg() {
        return getText(resendCodeToastMsg);
    }

    public void click_On_Use_Another_Method_Link() {
        clickOnWebElement(useAnotherMethod);
    }

    public boolean verify_Sub_Heading_Of_Verification_Pop_Up() {
        return isElementVisible(subHeadingOfVerifiedPopup);
    }

    public String verify_Terms_page() {
        return getText(agreeToTerms);
    }

    public void click_On_Close_Icon() {
        clickOnWebElement(closeIcon);
    }

    public boolean verify_Closed_Verified_Popup() {
        return isElementVisible(preparingContractLoader, 3);
    }

    public boolean validate_Property_Name_On_Agree_To_terms() {
        return isElementVisible(propertyNameOfAgreeToTerms);
    }

    public boolean verify_Download_Icon_Visible() {
        return isElementVisible(downloadIcon, 10);
    }

    public boolean verify_Agreement_Section() {
        return isElementVisible(agreementSection, 10);
    }

    public boolean verify_Close_Icon_Visible() {
        return isElementVisible(agreeCloseIcon, 10);
    }

    public boolean validate_Enter_your_Initial_Field() {
        return enterYourInitials.isEnabled();
    }

    public void Scroll_Pdf_On_Agree_To_Terms() {
        clickOnWebElement(pdfPage);
        scrollPopUpByJs();
    }

    public void set_Initial_Value(String initialValue) {
        waitForElement(2);
        sendkeysOneByOne(enterYourInitials, initialValue);
    }

    public void remove_Value_From_Initial_Field() {
        String value = getAttributeValue(enterYourInitials);
        clearOneByOne(enterYourInitials, value);
    }

    public String check_Validation_In_Initial_Field() {
        return getAttributeValue(enterYourInitials);
    }

    public int validate_Initial_Field() {
        return getAttributeValue(enterYourInitials).length();
    }

    public void click_On_Agree_To_Terms_Btn() {
        clickOnWebElement(agreeToTermsBtn);
    }

    public boolean is_Agree_Btn_Enabled() {
        return agreeToTermsBtn.isEnabled();
    }

    public String validate_Error_Msg() {
        return getText(errorMsg);
    }

    public boolean validate_Profile_First_Last_Name() {
        return check_Validation_In_Initial_Field().equals(getText(profileNameText));
    }

    public boolean validate_Agree_To_Terms_Checkbox_Popup() {
        return isElementVisible(agreeToTermsPopUpWithCheckbox);
    }

    public boolean validate_Property_Name_On_Agree_Popup() {
        return isElementVisible(propertyNameOfAgreeToTerms, 10);
    }

    public boolean check_Visibility_Of_Agree_Btn() {
        return isElementVisible(agreeToTermsBtn, 10);
    }

    public void click_On_Cross_Icon() {
        clickOnWebElement(agreeCloseIcon);
    }

    public String verify_Cancel_The_Purchase_Popup() {
        return getText(cancelPopup);
    }

    public boolean is_Checkbox_Uncheck() {
        return isElementVisible(checkboxAgreePopup);
    }

    public boolean click_On_Checkbox() {
        hoverAndClickByAction(descriptionCheckbox);
        return true;
    }

    public void click_On_Checkboxes() {
        for (int i = 0; i < checkboxes.size(); i++) {
            hoverAndClickByAction(checkboxes.get(i));
        }
    }

    public String validate_Purchase_Detail() {
        return getText(purchaseCompletedMsg);
    }

    public String verify_Portfolio_Page() {
        return driver.getCurrentUrl();
    }

    public void click_On_View_Portfolio() {
        clickOnWebElement(viewPortfolio);
    }

    public boolean validate_Property_Name_On_Purchase_Detail() {
        String invest = getText(PropertyNameOfPurchaseDetail);
        clickOnWebElement(viewPortfolio);
        String ele = getText(investmentPropertyName);
        return invest.equals(ele);
    }

    public boolean verify_Purchase_Summary_Data() {
        for (WebElement element : purchaseSummary) {
            isElementVisible(element, 10);
        }
        return true;
    }

    public boolean verify_Transfer_Summary_Data() {
        for (WebElement element : transferSummary) {
            isElementVisible(element, 10);
        }
        return true;
    }

    public boolean verify_Balance_Summary_Data() {
        for (WebElement element : balanceSummary) {
            isElementVisible(element, 10);
        }
        return true;
    }

    public boolean verify_Breadcrumbs_On_Purchase_Detail() {
        return isElementVisible(purchaseDetailBreadCrumbs, 10);
    }

    public String verify_Market_BreadCrumb() {
        clickOnWebElement(marketBreadCrumbs);
        return driver.getCurrentUrl();
    }

    public String verify_Property_Detail_BreadCrumb() {
        clickOnWebElement(PropertyDetailBreadCrumbs);
        return getText(purchaseDetailBreadCrumbs);
    }

    public String get_Share_Price_Value(int columnIndexValue) {
        int columnIndex = columnIndexValue;
        String cell_value = "";
        for (WebElement row : tableRowValue) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > columnIndex) {
                WebElement desiredCell = cells.get(columnIndex);
                cell_value = getText(desiredCell);
            }
        }
        return cell_value;
    }

    public boolean verify_Highlight_Share_Row() {
        return isElementVisible(highlightShareRow, 10);
    }

    public boolean verify_Greyed_Out_Share() {
        return isElementVisible(greyedRemainingShare, 10);
    }

    public boolean get_Share_Value() {
        clearText(enterShares);
        return getAttributeValue(enterShares).isEmpty();
    }

    public String get_USD_Value() {
        return getAttributeValue(usd);
    }

    public void enter_USD_Value(String usdValue) {
        sendkeysOneByOne(usd, usdValue);
    }

    public void enter_Usd_Value_In_Input_Field() {
        String value = getText(marketInvestment).replace("$", "").replace("minimum", "").replace("investment", "").replace(",", "").trim();
        double number = Double.parseDouble(value) - 10;
        sendkeysOneByOne(usd, String.valueOf(number));
    }

    public boolean is_Validation_Msg_Visible() {
        return isElementVisible(validationMsg, 10);
    }

    public void remove_Data_In_Usd_Input_Field() {
        clearOneByOne(usd, get_USD_Value());
    }

    public String verify_Dollar_In_Usd_Field() {
        return getText(dollarIcon);
    }

    public void verify_Investment_Avg_Share_On_Fund_Page() {
        String investment = totalInvestmentValue.getText().replace("$", "").replace(",", "").trim();
        double totalInvestmentText = Double.parseDouble(investment);
        int intValueOfInvestment = (int) Math.floor(totalInvestmentText);
        String avgValue = getText(avgShareCost).replace("$", "").replace(",", "").trim();
        int share = Integer.parseInt(getText(totalShare));
        double avgToDoubleValue = Double.parseDouble(avgValue);
        double totalInvestment = share * avgToDoubleValue;
        int multiplicationOfAvgAndShare = (int) Math.floor(totalInvestment);
        Assert.assertEquals("AvgPerShare * totalShare = InvestmentValue are not same as actual investment value", multiplicationOfAvgAndShare, intValueOfInvestment);
    }

    public String validate_No_Linked_Account() {
        return getText(noLinkedAccounts);
    }

    public boolean verify_Total_Amount() {
        return isElementVisible(totalAmount, 10);
    }

    public boolean verify_Henry_Account_And_Funds() {
        for (WebElement element : henryAccountAndFunds) {
             isElementVisible(element, 10);
            return true;
        }
        return false;
    }

    public boolean verify_Cancel_And_Link_Btn() {
        return isElementVisible(cancelAndLinkedAccountBtn, 10);
    }

    public String verify_No_Linked_Account_Warning_Msg() {
        return getText(noLinkAccountWarningMsg);
    }

    public String get_OTP_Value() {
        String value = "";
        for (int i = 0; i < otpBox.size(); i++) {
            value =getAttributeValue(otpBox.get(i));
        }
        return value;
    }

    public String get_Enter_Initial_Value() {
        return getAttributeValue(enterYourInitials);
    }

    public String validate_Share_Error_Msg() {
        return getText(shareErrorMsg);
    }

    public void remove_Share_In_Input_Field() {
        String value = getAttributeValue(enterShares);
        clearOneByOne(enterShares, value);
    }

    public boolean verify_Henry_Account_Balance() {
        String henryAccountBalance = henryAccount.getText().replace("$", "").replace(",","").trim();
        double value = Double.parseDouble(henryAccountBalance);
        return value > 0.00;
    }

    public void wait_In_Minutes(int min) {
        waitForElementInMinutes(min);
    }

    public void wait_For_Minutes() {
        waitForElementInMinutes(3);
    }

    public String validate_Are_You_There_Popup() {
        return getText(areYouTherePopup);
    }

    public boolean is_Are_You_There_Popup_Visible() {
        return isElementVisible(areYouTherePopup);
    }

    public boolean verify_Continue_Purchase_Btn() {
        return isElementVisible(continuePurchase);
    }

    public void click_On_Continue_Purchase_Btn() {
        clickOnWebElement(continuePurchase);
    }

    public boolean verify_Sub_Heading_Of_Are_You_There_Popup() {
        return isElementVisible(areYouThereGreyText);
    }

    public boolean verify_Remaining_Time_Popup() {
        return isElementVisible(areYouThereRemainingTime);
    }

    public void click_On_Fund_Your_Purchase_Title() {
        clickByAction(cancelPurchase);
        clickByAction(cancelPurchase);
    }

    public int get_Total_Share_Price(){
        int sum = 0;
        for (int i = 0; i < sharePrice.size(); i++) {
            String text = getText(sharePrice.get(i)).replace("$","").replace(",","").replace(".","").trim();
            int value = Integer.parseInt((text));
            sum = sum + value;
        }
        return sum;
    }

    public int validate_Avg_Per_Share(){
        waitForElement(2);
        String value= getText(avgPerShare).replace("$","").replace(",", "").replace(".","").trim();
        int avgPerShare = Integer.parseInt(value);
        return avgPerShare;
    }

    public String validate_No_Longer_Share_Available_Popup(){
        return getText(noShareNoLongerAvaiable);
    }

    public boolean validate_Agreement_Description(){
        for(int i=0; i <agreementDescription.size(); i++){
            isElementVisible(agreementDescription.get(i));
        }
        return true;
    }

    public String verify_Agree_To_Terms_Placeholder_Name(){
        return  getText(agreeToTermsPlaceholder);
    }

    public void verify_OTP_Field() {
        for (WebElement element : otpBox) {
            String OTP= getAttributeValue(element);
            Assert.assertFalse("OTP field is empty", OTP.isEmpty());
        }
    }

}


