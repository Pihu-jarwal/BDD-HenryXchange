package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class OwnerDashboard extends Helper {

    public OwnerDashboard() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='Owner']")
    private WebElement ownerTab;

    @FindBy(xpath = "//button[text()='Apply Now']")
    private WebElement applyNowBtn;

    @FindBy(xpath = "//p[contains(@class,'common_para')]")
    private WebElement placeHolderText;

    @FindBy(xpath = "//p[contains(@class,'heading')]")
    private WebElement submitYourApplication;

    @FindBy(id = "ownerName")
    private WebElement ownerName;

    @FindBy(id = "ownerEmail")
    private WebElement ownerEmail;

    @FindBy(id = "ownerContact")
    private WebElement ownerContact;

    @FindBy(id = "ownerBuisnessName")
    private WebElement businessOwnerName;

    @FindBy(xpath = "//p[contains(text(),'AUM is required')]")
    private WebElement aumIsRequired;

    @FindBy(id = "ownerAUM")
    private WebElement ownerAum;

    @FindBy(id = "ownerPropertyNum")
    private WebElement ownerPropertyNumber;

    @FindBy(xpath = "//p[contains(@class,'heading')]/following-sibling::p")
    private List<WebElement> submitYourApplicationPlaceHolderText;

    @FindBy(id = "ownerName-helper-text")
    private WebElement ownerNameErrorMsg;

    @FindBy(id = "ownerEmail-helper-text")
    private WebElement ownerEmailErrorMsg;

    @FindBy(xpath = "//p[contains(text(),'Number Of Properties')]")
    private WebElement numberOfPropertyErrorMsg;

    @FindBy(id = "ownerContact-helper-text")
    private WebElement ownerContactErrorMsg;

    @FindBy(id = "ownerBuisnessName-label")
    private WebElement businessName;

    @FindBy(xpath = "//input[@maxlength='64']")
    private WebElement maxLengthOfCharacter;

    @FindBy(xpath = "(//p[text()='Profile']/following-sibling::p)[2]")
    private WebElement userName;

    @FindBy(xpath = "(//p[text()='Auth']/following-sibling::p)[2]")
    private WebElement userEmail;

    @FindBy(xpath = "//img[@alt='contact_icn_correct']")
    private WebElement greenCheck;

    @FindBy(xpath = "(//p[contains(@class,'auth_email')])[2]")
    private WebElement mobileNumber;

    @FindBy(id = "ownerBuisnessName-helper-text")
    private WebElement businessNameFieldErrorMsg;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement aumDropdownOptions;

    @FindBy(xpath = "//li[@role='option']")
    private List<WebElement> aumOptionsList;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    private WebElement aumDropdownOption;

    @FindBy(xpath = "//div[@id=\"ownerAUM\"]/span")
    private WebElement aumOptionSelected;

    @FindBy(xpath = "//div[@id='ownerPropertyNum']/span")
    private WebElement numberOfProperty;

    @FindBy(xpath = "//p[contains(@class,'application_text')]")
    private WebElement applicationUnderReviewedText;

    @FindBy(xpath = "//div[@class=\"portfolio-headwrap \"]/h1")
    private WebElement ownerDashboardTitle;

    @FindBy(xpath = "//div[contains(@class,'statement-heade')]/h2")
    private WebElement listedPropertyText;

    @FindBy(xpath = "//p[contains(@class,'no-data-owner ')]")
    private WebElement ownerPlaceholderText;

    @FindBy(xpath = "//p[contains(text(),'Application')]")
    private WebElement applicationSubmittedPopup;

    @FindBy(xpath = "//p[contains(text(),'Your application')]")
    private WebElement placeHolderTextForApplication;

    @FindBy(xpath = ".//h2[text()='Listed Properties']/sup")
    private WebElement listedPropertyCount;

    @FindBy(xpath = "//table[contains(@class,'left-select common_listing_table  ')]/tbody/tr")
    private List<WebElement> listingProperty;

    @FindBy(xpath = "//div[text()='Sort by']")
    private WebElement sortByFilter;

    @FindBy(xpath = "//div[contains(@class,'menu-list')]")
    private WebElement sortByMenuDropdown;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option')]")
    private List<WebElement> sortByMenuList;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__option')])[1]")
    private WebElement sortByOption;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__single-value')])[1]")
    private WebElement sortByFilteredValue;

    @FindBy(id = "ownerContact-helper-text")
    private WebElement contactErrorMsg;

    @FindBy(xpath = "//button[@class=\"chipButton\"]")
    private WebElement sortByOptionSelected;

    @FindBy(xpath = "//button[@class='chipButton']//*[@class='removeIcon']")
    private WebElement crossIcon;

    @FindBy(xpath = "//div[contains(@class,'search-icon')]/following-sibling::input")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class='propertySearchResult']")
    private WebElement searchResult;

    @FindBy(css = "mark[class='mark']")
    private WebElement dropdownSearchValue;

    @FindBy(css = "p[class='result-not-found']")
    private WebElement searchResultNotFound;

    @FindBy(xpath = "//button[@aria-label='search']//*[@data-testid='CloseIcon']")
    private WebElement closeIcon;

    @FindBy(css = "p[class='linkAddress']")
    private WebElement addressOfProperty;

    @FindBy(css = "button[class='shorAllResult']")
    private WebElement showAllResult;

    @FindBy(xpath = "(//div[contains(@class,'name-flex')]/p/following-sibling::span)[1]")
    private WebElement propertyName;

    @FindBy(css = "div[class='label']")
    private WebElement nameFilter;

    @FindBy(xpath = "//table[contains(@class,\"commonTable investment  left-select common_listing_table  new_gap_updated\")]//thead//th")
    private List<WebElement> columnHeading;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__dropdown-indicator')])[2]")
    private WebElement nameLabel;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option')]")
    private List<WebElement> nameFilterDropdownOptions;

    @FindBy(xpath = "//div[contains(@id,'react-select-5-listbox')]")
    private WebElement nameDropdown;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and (text()='Newest to Oldest')]")
    private WebElement defaultNewestToOldest;

    @FindBy(xpath = "//div[text()='A-Z']")
    private WebElement aToZFilter;

    @FindBy(xpath = "//div[@class='filterIco atoz']")
    private WebElement aToZ;

    @FindBy(xpath = "//div[@class='filterIco atoz']")
    private WebElement filterIcoAToZ;

    @FindBy(xpath = "//table[contains(@class,\"commonTable investment common_listing_table_pendingProperties pending\")]//thead//th")
    private List<WebElement> pendingPropertiesColumnName;

    @FindBy(xpath = "(//div[contains(@class,'flex-left')])[1] ")
    private WebElement draft;

    @FindBy(xpath = "(//button[contains(@class,'review_btn')])[1]")
    private WebElement reviewBtn;

    @FindBy(xpath = "(//table[contains(@class,'common_listing_table_pendingProperties')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/thead/tr/th[text()='Share Price']/preceding-sibling::th)+1+1+1])[1]")
    private WebElement documentCount;

    @FindBy(xpath = "//img[@alt='Error_STATUS']/following-sibling::span")
    private WebElement errorStatus;

    @FindBy(xpath = "(//table[contains(@class,'common_listing_table')]/tbody/tr/td[count(//table[contains(@class,'MuiTable-root')]/thead/tr/th[text()='Share Price']/preceding-sibling::th)+1+1])[1]")
    private WebElement investorsCount;


    @FindBy(xpath = "//button[text()='Resolve']")
    private WebElement resolveBtn;


    public void click_On_Owner_Tab() {
        clickOnWebElement(ownerTab);
    }

    public boolean is_Apply_Now_Btn_Visible() {
        return isElementVisible(applyNowBtn);
    }

    public boolean is_Place_Holder_Text_Visible() {
        return isElementVisible(placeHolderText);
    }

    public String verify_Submit_your_Application_Page() {
        return getText(submitYourApplication);
    }

    public void click_On_Apply_Now_Btn() {
        clickOnWebElement(applyNowBtn);
    }

    public String validate_Owner_Name_Error_Msg() {
        return getText(ownerNameErrorMsg);
    }

    public String validate_Owner_Contact_Error_Msg() {
        return getText(ownerContactErrorMsg);
    }

    public boolean is_Error_Message_Visible(){
        return isElementVisible(ownerContactErrorMsg,2);
    }

    public String validate_Owner_Email_Error_Msg() {
        return getText(ownerEmailErrorMsg);
    }


    public void click_On_Aum_Input_Field() {
        waitForElement(2);
        waitForVisibility(ownerAum);
        clickByAction(ownerAum);
    }

    public void click_On_Number_Of_Properties_Field() {
        waitForElement(2);
        clickByAction(ownerPropertyNumber);
    }

    public void click_On_Business_name_Field() {
        clickByAction(businessOwnerName);
    }

    public String validate_Business_Name_Field() {
        return getText(businessName);
    }

    public String is_Aum_Required() {
        return getText(aumIsRequired);
    }

    public String validate_Max_Character_Length() {
        return maxLengthOfCharacter.getAttribute("maxlength");
    }

    public void enter_Owner_Name_In_Input_Field(String owner) {
        sendKeys(ownerName, owner);
    }

    public String get_Owner_Name() {
        return getAttributeValue(ownerName);
    }


    public String get_User_Name() {
        waitForElement(3);
        return getText(userName);
    }

    public void click_On_Owner_Name() {
        clickOnWebElement(ownerName);
    }

    public void click_On_Owner_Email_field() {
        clickByAction(ownerEmail);
    }

    public void click_On_Mobile_Field() {
        clickOnWebElement(ownerContact);
    }

    public String verify_Number_Of_Properties_Field() {
        return getText(numberOfPropertyErrorMsg);
    }

    public void enter_Email_In_Input_Field(String email) {
        sendKeys(ownerEmail, email);
    }

    public String get_Owner_Email() {
        return getAttributeValue(ownerEmail);
    }

    public String get_User_Email() {
        return getText(userEmail);
    }

    public boolean is_Green_Check_Visible() {
        return isElementVisible(greenCheck);
    }

    public void enter_Mobile_Number_In_Input_Field(String number) {
        sendKeys(ownerContact, number);
    }

    public String get_Mobile_Number() {
        return getAttributeValue(ownerContact);
    }

    public String get_Mobile_Number_Of_Account_Page() {
        waitForElement(3);
        return getText(mobileNumber);
    }

    public void enter_Business_Name(String businessName) {
        sendKeys(businessOwnerName, businessName);
    }

    public String get_Business_Name() {
        return getAttributeValue(businessOwnerName);
    }

    public String validate_business_name_Field_Error_Msg() {
        return getText(businessNameFieldErrorMsg);
    }

    public boolean is_Aum_Dropdown_Visible() {
        return isElementVisible(aumDropdownOptions);
    }

    public void is_Aum_Options_Visible() {
        for (int i = 0; i < aumOptionsList.size(); i++) {
            Assert.assertTrue("Aum field options is not visible", isElementVisible(aumOptionsList.get(i)));
        }
    }

    public int validate_Count_Of_Dropdown_Options() {
        return aumOptionsList.size();
    }

    public void click_On_Aum_Dropdown_Option() {
        clickOnWebElement(aumDropdownOption);
    }

    public boolean is_Aum_Option_Selected() {
        return isElementVisible(aumOptionSelected);
    }


    public boolean is_Number_Of_Properties_Dropdown_Visible() {
        return isElementVisible(aumDropdownOptions);
    }

    public void click_On_Number_Of_Properties_Options() {
        clickOnWebElement(aumDropdownOption);
    }

    public boolean is_Apply_Number_Enabled() {
        return applyNowBtn.isEnabled();
    }

    public void enter_Name_In_Input_Field(String name) {
        sendKeys(ownerName, name);
    }

    public boolean is_Number_Of_Property_Selected() {
        return isElementVisible(numberOfProperty);
    }

    public String get_Under_Reviewed_Text() {
        return getText(applicationUnderReviewedText);
    }

    public boolean is_OwnerDashboard_Text_Visible() {
        return isElementVisible(ownerDashboardTitle);
    }

    public boolean is_Listed_Property_Text_Visible() {
        return isElementVisible(listedPropertyText);
    }

    public boolean is_Owner_Placeholder_Text_Visible() {
        return isElementVisible(ownerPlaceholderText);
    }


    public boolean is_Application_Form_Submitted_Popup_Visible() {
        return isElementVisible(applicationSubmittedPopup);
    }

    public boolean is_Application_Placeholder_Text_Visible() {
        return isElementVisible(placeHolderTextForApplication);
    }

    public String get_Listed_Property_Count() {
        return getText(listedPropertyCount);
    }

    public boolean verify_Listed_Property_Count_Visible(){
        return isElementVisible(listedPropertyCount);
    }
    public String get_Listed_Property() {
        int count = 0;
        for (int i = 0; i < listingProperty.size(); i++) {
            count = listingProperty.size();
        }
        return String.valueOf(count);

    }

    public void click_On_Sort_By_Filter() {
        clickOnWebElement(sortByFilter);
    }

    public boolean is_Sort_By_Dropdown_Visible() {
        return isElementVisible(sortByMenuDropdown);
    }

    public void verify_Dropdown_List_Of_Sort_By_Filter() {
        for (int i = 0; i < sortByMenuList.size(); i++) {
            Assert.assertTrue(isElementVisible(sortByMenuList.get(i)));
        }
    }

    public void click_On_Sort_By_Option() {
        clickOnWebElement(sortByOption);
    }

    public boolean verify_Filter_Option_Visible() {
        return isElementVisible(sortByOptionSelected);
    }

    public String get_Filter_Option_Value(){
        return getText(sortByOptionSelected);
    }

    public String get_Sort_By_Option_Value(){
        return getText(sortByFilteredValue);
    }

    public String verify_Error_Msg_On_Owner_Contact_Field(){
        return getText(contactErrorMsg);
    }


    public void click_On_Cross_Icon() {
        clickOnWebElement(crossIcon);
    }

    public boolean is_Search_Bar_Visible() {
        return isElementVisible(searchBar);
    }

    public boolean is_Search_Bar_result_Visible() {
        return isElementVisible(searchResult);
    }

    public void enter_Property_Name_In_Input_Field(String propertyName) {
        sendKeys(searchBar, propertyName);
    }

    public String get_Search_Bar_value() {
        return getAttributeValue(searchBar);
    }

    public boolean verify_Search_Value_Highlighted_In_Dropdown() {
        return isElementVisible(searchBar);
    }

    public String get_Dropdown_Search_value() {
        return getText(dropdownSearchValue);
    }

    public String verify_No_Search_Result_Found() {
        return getText(searchResultNotFound);
    }

    public void click_On_Close_Icon() {
        clickOnWebElement(closeIcon);
    }

    public boolean is_Property_Address_Visible() {
        return isElementVisible(addressOfProperty);
    }

    public boolean verify_Show_All_Result_Btn() {
        return isElementVisible(showAllResult);
    }

    public void click_On_Show_All_Result() {
        clickOnWebElement(showAllResult);
    }

    public String get_Property_Name() {
        waitForElement(2);
        return getText(propertyName);
    }

    public void verify_Column_Name_Headings() {
        for (int i = 0; i < columnHeading.size(); i++) {
            Assert.assertTrue(isElementVisible(columnHeading.get(i)));
        }
    }

    public boolean click_On_Name_Filter() {
        try {
            waitForElement(2);
            clickOnWebElement(nameLabel);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public void verify_Dropdown_Option_Of_Name_Filter() {
        for (int i = 0; i < nameFilterDropdownOptions.size(); i++) {
            Assert.assertTrue(isElementVisible(nameFilterDropdownOptions.get(i)));
        }
    }

    public boolean verify_Name_Dropdown(){
        return isElementVisible(nameDropdown);
    }

    public boolean is_Newest_To_Oldest_Filter_Selected(){
        return isElementVisible(defaultNewestToOldest);
    }


    public void  click_On_A_To_Z_Filter(){
        clickOnWebElement(aToZFilter);
    }

    public boolean verify_A_To_Z_Filter(){
        return isElementVisible(filterIcoAToZ);
    }

    public void verify_Pending_Properties_Column_Name(){
        for(int i=0; i<pendingPropertiesColumnName.size(); i++){
            Assert.assertTrue(isElementVisible(pendingPropertiesColumnName.get(i)));
        }
    }

    public boolean verify_Draft_Functionality(){
        return isElementVisible(draft);
    }

    public boolean verify_Review_Btn(){
        return isElementVisible(reviewBtn);
    }

  public String get_Document_Value(){
         return getText(documentCount).replace("0", "").replace("/", "").trim();
  }

  public String  is_Attention_Required_Visible(){
        return getText(errorStatus);
  }


}


