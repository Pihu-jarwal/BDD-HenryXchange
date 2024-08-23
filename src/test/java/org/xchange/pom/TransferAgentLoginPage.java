package org.xchange.pom;

import com.github.javafaker.Faker;
import logger.LogReporter;
import lombok.Getter;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransferAgentLoginPage extends Helper {

    public TransferAgentLoginPage () {
        PageFactory.initElements (driver, this);
    }

    @FindBy (xpath = "//img[@alt=\"TA\"]/following-sibling::h2")
    private WebElement loginIn;

    @FindBy (id = "email")
    private WebElement email;

    @FindBy (name = "password")
    private WebElement password;

    @FindBy (xpath = "(//button[@type=\"button\"])[2]")
    private WebElement enterBtn;

    @FindBy (xpath = "//div[@class=\"Toastify__toast-body\"]/div/following-sibling::div")
    private WebElement toastMsg;

    @FindBy (id = "standard-password-input-helper-text")
    private WebElement passwordErrorMsg;

    @FindBy (xpath = "//button[contains(@class,'MuiIconButton-edgeEnd')]")
    private WebElement eyeIcon;

    @FindBy (xpath = "//input[@name=\"password\"]/following-sibling::div/button")
    private WebElement newPasswordEyeIcon;

    @FindBy (xpath = "//img[@alt='CLOSEEYEICON']")
    private WebElement closeEyeIcon;

    @FindBy (xpath = "//img[@alt='OPENEYEICON']")
    private WebElement openEyeIcon;

    @FindBy (xpath = "//p[text()='Account Locked']")
    private WebElement accountLocked;

    @FindBy (xpath = "//div[contains(@class,'admin')]")
    private WebElement adminModule;

    @FindBy (xpath = "//button[contains(@class,'MuiButton-textPrimary')]")
    private WebElement addUserButton;

    @FindBy (xpath = "//h2[text()='Add New User']")
    private WebElement addUserPopup;

    @FindBy (id = "email")
    private WebElement emailField;

    @FindBy (id = "mobile")
    private WebElement mobileNumberField;

    @FindBy (xpath = "//div[contains(@class,'MuiSelect-select')]")
    private WebElement accessLevel;

    @FindBy (id = "password")
    private WebElement temporaryPassword;

    @FindBy (xpath = "//button[text()='Generate']")
    private WebElement generateLink;

    @FindBy (xpath = "//button[text()='Add User']")
    private WebElement addUser;

    @FindBy (name = "firstName")
    private WebElement firstName;

    @FindBy (name = "lastName")
    private WebElement lastName;

    @FindBy (id = "name-helper-text")
    private WebElement firstNameErrorMsg;

    @FindBy (id = "email-helper-text")
    private WebElement emailRequired;

    @FindBy (xpath = "//ul[@role='listbox']")
    private WebElement accessLevelOptions;

    @FindBy (xpath = "//li[@data-value='ADMIN']")
    private WebElement adminOption;

    @FindBy (xpath = "//div[contains(@class,'MuiSelect-select') and contains(text(),'Admin')]")
    private WebElement adminOptionSelected;

    @FindBy (xpath = "//li[@data-value='AGENT']")
    private WebElement agentOption;

    @FindBy (xpath = "//div[contains(@class,'MuiSelect-select') and contains(text(),'Agent')]")
    private WebElement agentOptionSelected;

    @FindBy (xpath = "//input[@maxlength='12']")
    private WebElement maxLengthForNumber;

    @FindBy (id = "mobile")
    private WebElement mobileNumber;

    @FindBy (id = "mobile-helper-text")
    private WebElement errorMsgMobileNumber;

    @FindBy (xpath = "(//div[contains(@class,'MuiInputAdornment-positionEnd')])[1]")
    private WebElement greenTick;

    @FindBy (xpath = "//h2[text()='Properties']")
    private WebElement propertiesText;

    @FindBy (xpath = "//h2[text()='Admin']")
    private WebElement adminText;

    @FindBy (xpath = "//h2[contains(text(),'New User Created')]")
    private WebElement newUserCreatedPopup;

    @FindBy (xpath = "//h2[contains(text(),'A new user account')]")
    private WebElement userCreatedPopupText;

    @FindBy (xpath = "//button[contains(@class,'continue_Btn')]")
    private WebElement continueBtn;

    @FindBy (xpath = "//div[text()='All Status']")
    private WebElement allStatusFilter;
    @FindBy (xpath = "(//div[@class='label'])[1]")
    private WebElement nameLabel;

    @FindBy (xpath = "//div[@class=\"custom-select__option \"]")
    private List<WebElement> nameLabelOptions;

    @FindBy (id = "react-select-4-option-1")
    private WebElement aToZ;

    @FindBy (id = "react-select-4-option-2")
    private WebElement zToA;

    @FindBy (xpath = "//div[@class='filterIco atoz']")
    private WebElement aToZListing;

    @FindBy (xpath = "//div[@class='filterIco ztoa']")
    private WebElement zToAListing;

    @FindBy (xpath = "//tbody[contains(@class,'MuiTableBody-root')]/tr")
    private List<WebElement> listing;

    @FindBy (xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/preceding-sibling::th)+1+1]")
    private List<WebElement> emailColumnData;

    @FindBy (xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/preceding-sibling::th)+1+1+1]")
    private List<WebElement> mobileColumnData;

    @FindBy (xpath = "//div[contains(@class,'FilterForTime__single-value') and text()='All Roles']")
    private WebElement allRolesFilter;

    @FindBy (xpath = "//div[contains(@class,'FilterForTime__menu-list')]")
    private WebElement allRolesValue;

    @FindBy (css = "span[class='active']")
    private WebElement activeAccount;

    @FindBy (xpath = "//span[text()='Active']")
    private List<WebElement> userDetailRow;

    @FindBy (xpath = "//button[text()='Deactivate']")
    private WebElement accountDeactivate;

    @FindBy (css = "span[class='deactive']")
    private WebElement deactivateAccount;

    @FindBy (xpath = "//nav[@aria-label='pagination navigation']")
    private WebElement pagination;

    @FindBy (xpath = "//div[contains(text(),'Showing data ')]")
    private WebElement paginationCount;

    @FindBy (xpath = "//button[contains(@class,'MuiPaginationItem-root')]")
    private List<WebElement> pagination2;

    @FindBy (xpath = "(//button[contains(@class,'MuiPaginationItem-previousNext')])[2]")
    private WebElement forwardArrow;

    @FindBy (xpath = "(//button[contains(@class,'MuiPaginationItem-previousNext')])[1]")
    private WebElement previousArrow;

    @FindBy (xpath = "//h2[contains(@class,'MuiTypography-h2') and text()='User Details']")
    private WebElement userDetailPage;

    @FindBy (xpath = "//img[contains(@class,'CloseIcon')]")
    private WebElement closeIcon;

    @FindBy (xpath = "//span[contains(@class,'MuiListItemText-primary')]")
    private List<WebElement> sidebarMenuList;

    @FindBy (xpath = "//p[contains(@class,'headDetails')]")
    private List<WebElement> headerDetails;

    @Getter
    @FindBy (xpath = "//table//tbody/tr/td[6]")
    private List<WebElement> dateCellElements;

    @FindBy (xpath = "//button[contains(@class,'commonBtn ') and text()='Reset Password']")
    private WebElement resetPassword;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    private WebElement resetToastMsg;

    @FindBy (xpath = "//h2[text()=' Back to Login']")
    private WebElement backToLogin;

    @FindBy (xpath = "//h2[contains(text(),'Verify Account Access')]")
    private WebElement accountAccessMsg;

    @FindBy (xpath = "//p[contains(text(),'Please enter')]")
    private WebElement subHeadingText;

    @FindBy (xpath = "//button[contains(text(),'Confirm')]")
    private WebElement confirmButton;

    @FindBy (xpath = "//span[text()='Resend Code']")
    private WebElement resendButton;

    @FindBy (name = "currentPassword")
    private WebElement currentPassword;

    @FindBy (name = "password")
    private WebElement newPassword;

    @FindBy (name = "confirm_password")
    private WebElement confirmPassword;

    @FindBy (xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    @FindBy (xpath = "//p[contains(text(),'Please reset your')]")
    private WebElement subText;

    @FindBy (xpath = "//h2[contains(text(),'Reset Password')]")
    private WebElement headerText;

    @FindBy (xpath = "//img[@alt='close_icn']")
    private WebElement crossIcon;

    @FindBy (xpath = "//p[contains(text(),'Account Verified')]")
    private WebElement accountVerifiedText;

    @FindBy (xpath = "//p[contains(text(),'Your account')]")
    private WebElement subTextOfAccountVerified;

    @FindBy (css = "p[class='text-red']")
    private WebElement errorMsg;

    @FindBy (xpath = "//p[contains(text(),'Account Not Confimed')]")
    private WebElement accountNotConfirmed;

    @FindBy (xpath = "//p[contains(text(),'Your account has been')]")
    private WebElement subTextOfAccountNotVerified;

    @FindBy (xpath = "//div[contains(@class,'MuiAvatar-circular')]")
    private WebElement profileIcon;

    @FindBy (xpath = "//li[text()='Logout']")
    private WebElement logOut;

    @FindBy (xpath = "//span[contains(@class,'MuiListItemText-primary')]")
    private List<WebElement> sideBarMenu;

    @FindBy (xpath = "//p[contains(text(),'Password Not Confirmed')]")
    private WebElement passwordNotConfirmedPopup;

    @FindBy (xpath = "//p[contains(text(),'Password cannot be')]")
    private WebElement subtextOfPasswordNotConfirmed;

    @FindBy (id = "criteria-text")
    private WebElement passwordFieldValidationMsg;

    @FindBy (id = "standard-password-input-helper-text")
    private WebElement passwordFieldErrorMsg;

    @FindBy (xpath = "//p[contains(text(),'New Password Set')]")
    private WebElement newPasswordSetUpText;

    @FindBy (xpath = "//p[contains(text(),'Your new password')]")
    private WebElement sebText;

    @FindBy (xpath = "//div[@class='filterIco new']")
    private WebElement newestToOldest;

    @FindBy (xpath = "//div[text()='Newest to Oldest']")
    private WebElement newestToOldestFilter;

    @FindBy (xpath = "//*[@class=\"Toastify__toast-body\"]")
    private WebElement toastMsgForDeactivate;

    @FindBy (xpath = "//button[@type=\"button\" and text()='Activate']")
    private WebElement activateButton;

    @FindBy (xpath = "//div[contains(@class,'Toastify__toast-icon')]/following-sibling::div")
    private WebElement deactivateAccountToastMsg;

    @FindBy (xpath = "//div[@role=\"progressbar\"]")
    private WebElement progressBarCrossButton;

    @FindBy (xpath = "//*[@id=\"single-spa-application:@Exchange/TransferAgent-admin\"]/div[3]/div[2]/div[3]/div[2]/div[2]/ul/li")
    private WebElement logDetails;

    @FindBy (xpath = "//button[contains(@aria-label,'page')]")
    private List<WebElement> paginationNumber;

    public String is_Log_In_Page_Visible () {
        return getText (loginIn);
    }

    public boolean is_Email_Field_Visible () {
        return isElementVisible (email);
    }

    public boolean is_Password_Field_Visible () {
        return isElementVisible (password);
    }

    public boolean is_Enter_Btn_Visible () {
        return isElementVisible (enterBtn);
    }

    public void enter_Email_In_Input_Field (String userEmail) {
        sendKeys (email, userEmail);
    }

    public void click_On_Enter_Btn () {
        waitForElement (2);
        clickByAction (enterBtn);
    }

    public void click_On_Password_Field () {
        clickOnWebElement (password);
    }

    public void click_On_Email_input_Field () {
        clickOnWebElement (email);
    }

    public void enter_Password_In_Input_Field (String userPassword) {
        sendKeys (password, userPassword);
    }

    public String is_Error_Msg_Visible () {
        return getText (toastMsg);
    }

    public String get_Password_Error_Text () {
        waitForElement (2);
        isElementVisible (passwordErrorMsg, 100);
        return getText (passwordErrorMsg);
    }

    public boolean is_Enter_Btn_Enabled () {
        return enterBtn.isEnabled ();
    }

    public void click_On_Eye_Icon () {
        clickByAction (eyeIcon);
    }

    public boolean is_Active_Eye_Icon () {
        return isElementVisible (openEyeIcon);
    }

    public boolean is_Inactive_Eye_Icon () {
        return isElementVisible (closeEyeIcon);
    }

    public String verify_If_Blocked_User_Try_To_Login () {
        return getText (accountLocked);
    }

    public boolean is_Account_Locked_Popup_Visible () {
        return isElementVisible (accountLocked);
    }

    public void click_On_Admin_Module () {
        waitForVisibility (propertiesText);
        Assert.assertTrue (isElementVisible (propertiesText));
        waitForElement (10);
        clickByAction (adminModule);
        clickByAction (adminModule);
        Assert.assertTrue (isElementVisible (adminText));
        waitForElement (10);
    }

    public void enter_Phone_Number (String userMobileNumber) {
        isElementVisible (mobileNumber, 30);
        sendKeys (mobileNumber, userMobileNumber);
        sendKeys (mobileNumber, generateRandomNumbers (4));
    }

    public void click_On_Add_User_Btn () {
        waitForElement (2);
        Assert.assertTrue (isElementVisible (adminText));
        clickByAction (addUserButton);
    }

    public boolean is_Add_User_Popup_Visible () {
        return isElementVisible (addUserPopup);
    }

    public boolean is_Access_Level_Visible () {
        return isElementVisible (accessLevel);
    }

    public boolean is_Mobile_Number_Field_Visible () {
        return isElementVisible (mobileNumberField);
    }

    public boolean is_Generate_Link_Visible () {
        return isElementVisible (generateLink);
    }

    public boolean is_Add_User_Button_Visible () {
        return isElementVisible (addUser);
    }

    public void click_On_First_Name_Field () {
        clickOnWebElement (firstName);
    }

    public boolean is_First_Name_Visible () {
        return isElementVisible (firstName);
    }

    public boolean is_Last_Name_Visible () {
        return isElementVisible (lastName);
    }

    public void click_On_last_Name_Field () {
        clickOnWebElement (lastName);
    }

    public void enter_First_Name_In_Input_Field (String userFirstName) {
        sendKeys (firstName, userFirstName);
    }

    public String verify_Error_Msg () {
        return getText (firstNameErrorMsg);
    }

    public String verify_Error_Msg_Below_Last_Name () {
        return getText (firstNameErrorMsg);
    }

    public void enter_Last_Name_In_Input_Field (String userLastName) {
        sendKeys (lastName, userLastName);
    }

    public String verify_Space_Not_Allowed_In_Field () {
        return getAttributeValue (firstName);
    }

    public String verify_Last_name_Field () {
        return getAttributeValue (lastName);
    }

    public void click_On_Email_Field () {
        clickOnWebElement (emailField);
    }

    public String get_Email_Error_Msg () {
        return getText (emailRequired);
    }

    public void enter_Email_In_Input_field (String email) {
        sendKeys (emailField, email);
    }

    public void validate_Email_Value () {
        validateEmail (getAttributeValue (emailField));
    }

    public void click_On_Access_Level () {
        clickOnWebElement (accessLevel);
    }

    public boolean verify_Access_Level_Options () {
        return isElementVisible (accessLevelOptions);
    }

    public void click_On_Admin_Option () {
        clickOnWebElement (adminOption);
    }

    public boolean is_Admin_Option_Selected () {
        return isElementVisible (adminOptionSelected);
    }

    public void click_On_Agent_Option () {
        clickOnWebElement (agentOption);
    }

    public boolean is_Agent_Option_Selected () {
        return isElementVisible (agentOptionSelected);
    }

    public void enter_Mobile_Number_In_Input_Field (String userMobileNumber) {
        isElementVisible (mobileNumber, 30);
        sendKeys (mobileNumber, userMobileNumber);
    }

    public String get_Mobile_Number () {
        return getAttributeValue (mobileNumber);
    }

    public int validate_Mobile_Number () {
        return getAttributeValue (maxLengthForNumber).length ();
    }

    public boolean verify_Green_Tick_With_Mobile_Number () {
        return isElementVisible (greenTick);
    }

    public String verify_Mobile_Number_Error_msg () {
        waitForElement (2);
        return getText (errorMsgMobileNumber);
    }

    public void click_On_Mobile_Number () {
        clickOnWebElement (mobileNumber);
    }

    public void click_On_Generate_Link_Field () {
        clickOnWebElement (generateLink);
    }

    public boolean verify_Temporary_Password_Field_Disabled () {
        return temporaryPassword.isEnabled ();
    }

    public void click_On_Temporary_Password_Field () {
        clickOnWebElement (temporaryPassword);
    }

    public String get_Temporary_Password () {
        return getAttributeValue (temporaryPassword);
    }

    public boolean is_Add_user_Button_Enabled () {
        isElementVisible (continueBtn, 20);
        return continueBtn.isEnabled ();
    }

    public void click_On_Add_User_Button () {
        waitForElement (2);
        clickOnWebElement (continueBtn);
    }

    public boolean verify_Success_Popup () {
        return isElementVisible (newUserCreatedPopup);
    }

    public void click_On_Outside_The_Popup () {
        clickByAction (adminText);
    }

    public void click_On_Name_Label () {
        waitForElement (3);
        clickByAction (nameLabel);
    }

    public void verify_Name_Label_options () {
        for (WebElement element : nameLabelOptions) {
            Assert.assertTrue (isElementVisible (element));
        }
    }

    public void click_on_A_To_Z_Option () {
        clickOnWebElement (aToZ);
    }

    public void click_on_Z_To_A_Option () {
        clickOnWebElement (zToA);
    }

    public boolean is_Z_To_A_Listing_Visible () {
        return isElementVisible (zToAListing);
    }

    public boolean is_A_To_Z_Listing_Visible () {
        return isElementVisible (aToZListing);
    }

    public void verify_Listing_Of_User () {
        waitForElement (2);
        for (WebElement element : listing) {
            Assert.assertTrue (isElementVisible (element));
        }
    }


    public void verify_Email_Column () {
        for (WebElement element : emailColumnData) {
            Assert.assertTrue ("Email data is not visible", isElementVisible (element));
        }
    }

    public void verify_Mobile_Number_Column () {
        for (WebElement element : mobileColumnData) {
            Assert.assertTrue ("Mobile number data is not visible", isElementVisible (element));
        }
    }

    public void click_On_All_Roles_Filter () {
        clickByAction (allRolesFilter);
    }

    public boolean is_All_Role_Filter_Visible () {
        return isElementVisible (allRolesFilter);
    }

    public boolean is_All_Roles_Value_Dropdown () {
        return isElementVisible (allRolesValue);
    }

    public void click_On_User_Detail_Row () {
        for (int i = 0; i < userDetailRow.size (); i++) {
            if (i == 0)
                hoverByAction (userDetailRow.get (i));
            clickByAction (userDetailRow.get (i));
        }
    }

    public void click_On_Deactivate_Button () {
        waitForElement (2);
        clickByAction (accountDeactivate);
    }

    public boolean is_Deactivate_button_visible () {
        return isElementVisible (accountDeactivate);
    }

    public boolean is_Account_Status_Deactivate () {
        return isElementVisible (deactivateAccount);
    }

    public boolean is_Account_Status_Active () {
        return isElementVisible (activeAccount);
    }

    public boolean is_Pagination_Visible () {
        return isElementVisible (pagination);
    }

    public String get_Pagination_Value () {
        String paginationValue1 = getText (paginationCount).replace ("Showing data ", "")
            .replace (" of ", "")
            .replace ("1 to 10", "")
            .trim ();
        waitForElement (2);
        String paginationValue = getText (paginationCount).replace ("Showing data ", "")
            .replace (" of ", "")
            .replace (paginationValue1, "")
            .trim ();
        return paginationValue;
    }

    public void click_on_Pagination_2 () {
        scrollByVisibilityOfElement (driver, pagination2.get (3));
        for (int i = 0; i < pagination2.size (); i++) {
            if (i == 3)
                clickByAction (pagination2.get (i));
        }
    }

    public void click_On_Forward_Arrow () {
        scrollByVisibilityOfElement (driver, pagination2.get (3));
        clickByAction (forwardArrow);
    }

    public void click_On_Previous_Arrow () {
        scrollByVisibilityOfElement (driver, pagination2.get (3));
        clickByAction (previousArrow);
    }

    public boolean is_User_Detail_Page () {
        return isElementVisible (userDetailPage, 30);
    }

    public void click_On_Close_Icon () {
        clickOnWebElement (closeIcon);
    }

    public void verify_Side_Bar_Menu_List () {
        for (int i = 0; i < sidebarMenuList.size (); i++) {
            Assert.assertTrue ("Side bar menu is not visible", isElementVisible (sidebarMenuList.get (i)));
        }
    }

    public void verify_Header_Column_Name () {
        for (WebElement element : headerDetails) {
            Assert.assertTrue (isElementVisible (element));
        }
    }

    public void click_On_Reset_Password_Button () {
        waitForElement (2);
        waitForVisibility (resetPassword);
        clickOnWebElement (resetPassword);
    }

    public String verify_Reset_Toast_Msg () {
        return getText (resetToastMsg);
    }

    public boolean is_Back_To_Login_Btn_Visible () {
        return isElementVisible (backToLogin);
    }

    public String get_Placeholder_Text () {
        return getText (accountAccessMsg);
    }

    public boolean is_Sub_Heading_Visible () {
        return isElementVisible (subHeadingText);
    }

    public boolean is_Confirm_Code_Visible () {
        return isElementVisible (confirmButton);
    }

    public boolean is_Resend_Button_Visible () {
        return isElementVisible (resendButton);
    }

    public boolean verify_Confirm_Code_Enabled () {
        return confirmButton.isEnabled ();
    }

    public void click_On_Back_To_Login_Button () {
        clickOnWebElement (backToLogin);
    }

    public boolean is_Current_Password_Field_Visible () {
        return isElementVisible (currentPassword);
    }

    public boolean is_Confirm_Password_Field_Visible () {
        return isElementVisible (confirmPassword);
    }

    public boolean is_New_Password_Field_Visible () {
        return isElementVisible (newPassword);
    }

    public boolean is_Submit_Button_Visible () {
        return isElementVisible (submitButton);
    }

    public boolean is_Sub_Text_Visible () {
        return isElementVisible (subText);
    }

    public String is_Header_Text_Visible () {
        return getText (headerText);
    }

    public void click_On_Cross_Icon () {
        clickOnWebElement (crossIcon);
    }

    public boolean is_Cross_Icon_Visible () {
        return isElementVisible (crossIcon);
    }

    public boolean verify_Account_Verified_popup () {
        return isElementVisible (accountVerifiedText);
    }

    public boolean verify_subText_Account_popup () {
        waitForVisibility (subTextOfAccountVerified);
        return isElementVisible (subTextOfAccountVerified);
    }

    public String is_Validation_Msg_Visible () {
        return getText (errorMsg);
    }

    public String is_Account_Not_Confirmed_Popup_Visible () {
        return getText (accountNotConfirmed);
    }

    public boolean verify_Account_Not_Confirmed_Popup () {
        return isElementVisible (accountNotConfirmed);
    }

    public boolean is_Sub_Text_Of_Account_Not_Confirmed () {
        return isElementVisible (subTextOfAccountNotVerified);
    }

    public String random_Email_Generate () {
        Faker faker = new Faker ();
        String randomEmail = "muskan.trivedi+9999" + faker.random ()
            .nextInt (2000) + "@" + "appinventiv.com";
        email.sendKeys (randomEmail);
        return randomEmail;
    }

    public void click_On_Profile_Icon () {
        waitForElement (5);
        clickByAction (profileIcon);
    }

    public void click_On_Logout_Btn () {
        isElementClickable (logOut, 100);
        clickByAction (logOut);
    }

    public void enter_Current_Password_In_Input_Field (String userCurrentPassword) {
        sendKeys (currentPassword, userCurrentPassword);
    }

    public void click_On_Current_Password_Field () {
        clickOnWebElement (currentPassword);
    }

    public void click_On_New_Password_Field () {
        clickOnWebElement (newPassword);
    }

    public void click_On_Submit_Button () {
        waitforElementClickable (submitButton, 100);
        clickOnWebElement (submitButton);
    }

    public void enter_New_Password_In_Input_Field (String userNewPassword) {
        sendKeys (newPassword, userNewPassword);
    }

    public void enter_Confirm_Password_In_Input_Field (String userConfirmPassword) {
        sendKeys (confirmPassword, userConfirmPassword);
    }

    public String verify_Password_Not_Confirmed_Popup () {
        isElementVisible (passwordNotConfirmedPopup, 10);
        return getText (passwordNotConfirmedPopup);
    }

    public boolean is_Password_Not_Confirmed_Popup_Visible () {
        return isElementVisible (passwordNotConfirmedPopup, 10);
    }

    public boolean verify_Subtext_Of_Password_Not_Confirmed () {
        return isElementVisible (subtextOfPasswordNotConfirmed);
    }

    public void enter_Temporary_Password (String userPassword) {
        sendKeys (password, userPassword);
    }

    public void enter_Temporary_Current_Password (String userPassword) {
        sendKeys (currentPassword, userPassword);
    }

    public boolean is_Password_Field_Error_Msg_Visible () {
        return isElementVisible (passwordFieldValidationMsg, 20);
    }

    public String verify_Password_field_validation_Msg () {
        return getText (passwordFieldErrorMsg);
    }

    public void click_On_Confirm_new_password () {
        clickOnWebElement (confirmPassword);
    }

    public void click_On_New_Password_Eye_Icon () {
        clickByAction (newPasswordEyeIcon);
    }

    public boolean is_Submit_Button_Enabled () {
        return submitButton.isEnabled ();
    }

    public boolean is_Sub_text_Of_New_Password_Popup () {
        return isElementVisible (sebText);
    }

    public String verify_New_Password_Popup () {
        return getText (newPasswordSetUpText);
    }

    public void click_On_Newest_To_Oldest_Filter () {
        clickByAction (newestToOldestFilter);
    }

    public boolean is_Newest_To_Oldest_Filter_Visible () {
        return isElementVisible (newestToOldest);
    }

    public String verify_Deactivated_Toast_Msg () {
        waitForElement (3);
        return getText (toastMsgForDeactivate);
    }

    public boolean is_Activate_Button_Visible () {
        return isElementVisible (activateButton);
    }

    public void click_On_Activate_Button () {
        waitForElement (2);
        clickByAction (activateButton);
    }

    public String verify_Account_Deactivate_Toast_Msg () {
        return getText (deactivateAccountToastMsg);
    }

    public boolean is_All_Status_filter_Visible () {
        return isElementVisible (allStatusFilter);
    }

    public boolean is_Log_Detail_Visible () {
        return isElementVisible (logDetails);
    }
}
