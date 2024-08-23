package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddPropertyPage extends Helper {

    public AddPropertyPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='portfolio-rytbtnwrap']")
    private WebElement addPropertyBtn;

    @FindBy(xpath = "//li[contains(@class,\"MuiBreadcrumbs-li\")]//p")
    private WebElement addPropertyBreadcrumb;

    @FindBy(xpath = "//li[contains(@class,\"MuiBreadcrumbs-li\")]//a")
    private WebElement ownerBreadcrumb;

    @FindBy(xpath = "//h1[contains(@class,\"pageTitle\")]")
    private WebElement placeHolderTextAddProperty;

    @FindBy(xpath = "//div[contains(@class,\"selectOption\")]//p")
    private WebElement subHeadingAddProperty;

    @FindBy(xpath = "//input[@name=\"propertyName\"]")
    private WebElement propertyNameTextField;

    @FindBy(xpath = "//input[@maxlength='45']")
    private WebElement maxLengthOfPropertyName;

    @FindBy(xpath = "//input[contains(@name,\"address\")]")
    private WebElement addressTextField;

    @FindBy(xpath = "//input[contains(@name,\"apt\")]")
    private WebElement aptSuitTextField;

    @FindBy(xpath = "//input[contains(@name,\"city\")]")
    private WebElement cityTextField;

    @FindBy(xpath = "//input[@name =\"state\"]")
    private WebElement state;

    @FindBy(xpath = "")
    private WebElement stateDropdown;

    @FindBy(xpath = "//input[contains(@name,\"zipcode\")]")
    private WebElement zipCodeTextField;

    @FindBy(xpath = "//input[@name =\"doors\"]")
    private WebElement doorsTextField;

    @FindBy(xpath = "//div[@id =\"property class\"]")
    private WebElement propertyClass;

    @FindBy(xpath = "//ul[@aria-labelledby =\"property class\"]")
    private WebElement propertyClassDropdown;

    @FindBy(xpath = "//div[@id =\"yearBuilt\"]")
    private WebElement yearBuilt;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,\"yearBuilt\")]")
    private WebElement yearBuiltDropdown;

    @FindBy(id = "ownerBuilt")
    private WebElement ownerEntity;

    @FindBy(xpath = "//ul[contains(@class,\"MuiMenu-list\")]")
    private WebElement ownerEntityDropdown;

    @FindBy(xpath = "//input[@id=\"stateOfEntity\"]")
    private WebElement stateOfEntityTextField;

    @FindBy(xpath = "//input[contains(@name,\"ein\")]")
    private WebElement einTextField;

    @FindBy(xpath = "//input[contains(@name,\"tickerSymbol\")]")
    private WebElement tickerSymbolTextField;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[contains(@class,\"doitbtn\")]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[contains(@class,'Normal')]//p")
    private WebElement errorMessagePropertyNameField;

    @FindBy(xpath = "//ul[@id=\"address-listbox\"]")
    private WebElement addressDropdown;

    @FindBy(xpath = "(//li[@role=\"option\"])[1]")
    private WebElement residentialAddressDropdown;

    @FindBy(xpath = "//div[text()='Enter valid address']")
    private WebElement validAddressErrorMsg;

    @FindBy(xpath = "//p[@id='zipcode-helper-text']")
    private WebElement zipCodeErrorMsg;

    @FindBy(xpath = "//p[@id='mui-4-helper-text']")
    private WebElement doorsErrorMsg;

    @FindBy(xpath = "//div[@helpertext=\"Property class is mandatory\"]/following-sibling::p")
    private WebElement propertyClassErrorMsg;

    @FindBy(xpath = "//div[@helpertext=\"Year Built is mandatory\"]/following-sibling::p")
    private WebElement yearBuiltErrorMsg;

    @FindBy(xpath = "//div[@helpertext=\"Owner Entity is mandatory\"]/following-sibling::p")
    private WebElement ownerEntityErrorMsg;

    @FindBy(xpath = "//p[@id=\"mui-6-helper-text\"]")
    private WebElement errorMsgLessThan3AlphabetTickerSymbol;

    @FindBy(xpath = "//div[contains(@class,'question_mark')]")
    private WebElement questionMarkInTickerSymbol;

    @FindBy(xpath = "//div[contains(@role,'tooltip')]")
    private WebElement toolTipTickerSymbol;

    @FindBy(xpath = "//div[contains(@class,'tooltip')]/p[1]")
    private WebElement toolTipHeading;

    @FindBy(xpath = "//div[contains(@class,'tooltip')]/p[2]")
    private WebElement toolTipBody;

    @FindBy(xpath = "//div[contains(@class,'terms-modal')]")
    private WebElement agreeToTermsPopup;

    @FindBy(xpath = "//div[contains(@class,'inner_exit')]")
    private WebElement areYouSureYouWantToExitPopup;

    @FindBy(xpath = "//div[contains(@class,'inner_exit')]/h3")
    private WebElement areYouSureYouWantToExitPlaceholderText;

    @FindBy(xpath = "//div[contains(@class,'inner_exit')]/p")
    private WebElement areYouSureYouWantToExitPopupBody;

    @FindBy(xpath = "//div[contains(@class,'btn_holder')]/button[1]")
    private WebElement exitButton;

    @FindBy(xpath = "//div[contains(@class,'btn_holder')]/button[2]")
    private WebElement returnToAddPropertyButton;

    @FindBy(xpath = "//div[@class=\"modal-inner\"]//div/h4")
    private WebElement placeholderTextAgreeToTermsPopup;

    @FindBy(xpath = "//div[@class=\"modal-inner\"]//div/p")
    private WebElement propertyNameAgreeToTermsPopup;

    @FindBy(xpath = "//button[@class=\"download\"]")
    private WebElement downloadBtnAgreeToTermsPopup;

    @FindBy(xpath = "//span[@class=\"heighted\"][1]")
    private WebElement selfNameAgreeToTermsPopup;

    @FindBy(xpath = "//span[@class=\"heighted\"][2]")
    private WebElement positionAgreeToTermsPopup;

    @FindBy(xpath = "//span[@class=\"heighted\"][3]")
    private WebElement entityNameAgreeToTermsPopup;

    @FindBy(xpath = "//span[@class='close-icon']")
    private WebElement agreeCloseIcon;

    @FindBy(css = "input[id='standard-basic error-message-text']")
    private WebElement enterYourInitials;

    @FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
    private WebElement profileText;

    @FindBy(xpath = "//span[@class=\"user_name\"]")
    private WebElement postionInBracket;

    @FindBy(xpath = "//span[@class=\"user_name\"]/b[2]")
    private WebElement ownerEntityNameAgreeOnPopup;

    @FindBy(xpath = "//p[@class=\"text-red terms_error_message\"]")
    private WebElement errorMsg;

    @FindBy(css = "button[class=\"agree-btn blue-btn-sm\"]")
    private WebElement agreeAndContinueBtn;

    @FindBy(xpath = "//h1[@class=\"main_heading\"]")
    private WebElement uploadPropertyDocuments;

    @FindBy(xpath = "//h3[contains(@class,'sub_heading')]")
    private WebElement ticketSymbolOnUploadPropertyPage;

    @FindBy(xpath = "//li[contains(@class,\"MuiBreadcrumbs-li\")]//p")
    private WebElement uploadPropertyDocumentsBreadcrumb;

    @FindBy(xpath = "//ul[@class=\"sidebar\"]")
    private WebElement fourSectionLeftSide;

    @FindBy(xpath = "//h3[contains(@class,'sub_heading')]")
    private WebElement propertyNameOnUploadPropertyPage;

    @FindBy(xpath = "//div[contains(@class,'address_panel')]/h4/span")
    private WebElement addressOnUploadPropertyPage;

    @FindBy(xpath = "//div[contains(@class,'properties_class')]/h4/span")
    private WebElement propertyClassOnUploadPropertyPage;

    @FindBy(xpath = "(//div[contains(@class,'TwoCoRowFlex')]/h4/span)[1]")
    private WebElement yearBuiltOnUploadPropertyPage;

    @FindBy(xpath = "(//div[contains(@class,'TwoCoRowFlex')]/h4/span)[2]")
    private WebElement doorsOnUploadPropertyPage;

    @FindBy(xpath = "//div[contains(@class,'owner_entity')]/h4/span")
    private WebElement ownerEntityOnUploadPropertyPage;

    @FindBy(xpath = "(//div[contains(@class,'TwoCoRowFlex')]/h4/span)[3]")
    private WebElement stateOfEntityOnUploadPropertyPage;

    @FindBy(xpath = "(//div[contains(@class,'TwoCoRowFlex')]/h4/span)[4]")
    private WebElement einOnUploadPropertyPage;

    @FindBy(xpath = "//ul[@class=\"LegendList\"]/li")
    private List<WebElement> fourSectionInPiachart;

    @FindBy(xpath = "//div[contains(@class,'save_btn')]/button")
    private WebElement saveAndExitButton;

    @FindBy(xpath = "//div[contains(@class,'save_btn')]/p[1]")
    private WebElement needHelp;

    @FindBy(xpath = "(//input[@type=\"file\"])[1]")
    private WebElement browse;

    @FindBy(xpath = "(//input[@type=\"file\"])[19]")
    private WebElement browseBTn;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter\"]/following-sibling::div")
    private WebElement imageFormatMsg;

    @FindBy(xpath = "//div[@role=\"progressbar\"]/..")
    private WebElement toastMsg;

    @FindBy(name = "ownerAuth")
    private WebElement ownerAuth;

    @FindBy(name = "purch&Offer")
    private WebElement offer;

    @FindBy(name = "financials")
    private WebElement financials;

    @FindBy(xpath = "//ul[@class='sidebar']/li[@class='side-link active']/a[@name='generalInfo']")
    private WebElement generalInfo;

    @FindBy(xpath = "//ul[@class='sidebar']/li[@class='side-link active']/a[@name='ownerAuth']")
    private WebElement ownerAuthActive;

    @FindBy(xpath = "//ul[@class='sidebar']/li[@class='side-link active']/a[@name='purch&Offer']")
    private WebElement offerActive;

    @FindBy(xpath = "//ul[@class='sidebar']/li[@class='side-link active']/a[@name='financials']")
    private WebElement financialsActive;

    @FindBy(xpath = "(//div[@id='panel1a-header']/div/following-sibling::div)[1]")
    private WebElement downloadIcon;

    @FindBy(xpath = "(//div[@id='panel1a-content'])[1]")
    private WebElement expandSection;

    @FindBy(xpath = "(//img[@alt=' info_img'])[1]")
    private WebElement infoIcon;

    @FindBy(xpath = "//img[contains(@aria-labelledby,'mui')]")
    private WebElement infoData;

    @FindBy(xpath = "//div[contains(@class,'custom-select__single-value ')]")
    private WebElement sorting;

    @FindBy(xpath = "//div[contains(@class,'custom-select__menu-list')]")
    private WebElement sortingDropdown;

    @FindBy(xpath = "//div[contains(@class,'option--is-focused') and text()='All']")
    private WebElement defaultAll;

    @FindBy(xpath = "//div[contains(@id,'react-select-5-option')]")
    private List<WebElement> sortingOptions;

    @FindBy(xpath = "//div[contains(@class,'custom-select__single-value') and text()='To Do']")
    private WebElement defaultToDo;

    @FindBy(xpath = "//div[contains(@class,'custom-select__single-value') and text()='In Review']")
    private WebElement defaultInReview;

    @FindBy(xpath = "//div[contains(@class,'custom-select__single-value') and text()='Approved']")
    private WebElement defaultApproved;

    @FindBy(xpath = "//div[contains(@class,'custom-select__single-value') and text()='Attention Required']")
    private WebElement defaultAttentionRequired;

    @FindBy(xpath = "//div[contains(@class,'accordion_list')]")
    private WebElement listingOfSortingOption;

    @FindBy(xpath = "//div[text()='To Do']")
    private WebElement toDo;

    @FindBy(xpath = "//div[text()='In Review']")
    private WebElement inReview;

    @FindBy(xpath = "//div[text()='Approved']")
    private WebElement approved;

    @FindBy(xpath = "//div[text()='Attention Required']")
    private WebElement attentionRequired;

    @FindBy(xpath = "//button[text()='Resolve']/span")
    private WebElement resolveBtn;

    @FindBy(xpath = "//h2[text()='Pending Properties']")
    private WebElement pendingProperties;

    @FindBy(xpath = "//a[text()='View Issues']")
    private WebElement viewIssue;

    @FindBy(xpath = "//span[@class=\"attention-required\"]")
    private WebElement attentionRequiredStatus;

    @FindBy(xpath = "//div[contains(@class,'learn_more')]")
    private WebElement documentMsg;

    @FindBy(xpath = "//div[contains(text(),'Unanimous Consent')]")
    private WebElement unanimousConsentDocumentSection;

    @FindBy(xpath = "//p[@class=\"uploaded successfully_uploaded\"]")
    private WebElement uploadFileSuccessfully;

    @FindBy(css = "span[class=\"in_review\"]")
    private WebElement inReviewStatus;

    @FindBy(xpath = "//span[@class=\"fileTypeName\"]/following-sibling::img")
    private WebElement closeIcon;

    @FindBy(xpath = "//div[contains(text(),'Pictures of')]/img")
    private WebElement picturesOfProperty;

    @FindBy(xpath = "//div[text()='3rd Party Reports']")
    private WebElement partyReport;

    @FindBy(xpath = "//p[contains(@class,'inner_file_uploading')]/../../../../../../../../../../div/div/h4/div/span[@class='in_review']")
    private WebElement imageUploaderSection;

    @FindBy(xpath = "//li[@role=\"option\"][2]")
    private WebElement agileRealState;


    public String verify_Owner_DashBoard_Page() {
        return driver.getCurrentUrl();
    }

    public String verify_User_View_Add_Property_Button() {
        return getText(addPropertyBtn);
    }

    public Boolean click_On_Add_Property_Button() {
        try {
            isElementVisible(addPropertyBtn,15);
            waitForElement(6);
            clickByAction(addPropertyBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String verify_Add_Property_Page() {
        return driver.getCurrentUrl();
    }

    public String verify_BreadCrumbs_On_Add_property_Page() {
        return getText(addPropertyBreadcrumb);
    }

    public String verify_PlaceHolder_Text_On_Add_property_Page() {
        return getText(placeHolderTextAddProperty);
    }

    public String verify_SubHeading_On_Add_property_Page() {
        return getText(subHeadingAddProperty);
    }

    public Boolean verify_User_View_Property_Name_Text_Field() {
        return isElementVisible(propertyNameTextField);
    }

    public Boolean verify_User_View_Address_Text_Field() {
        return isElementVisible(addressTextField);
    }

    public Boolean verify_User_View_Apt_Suit_Text_Field() {
        return isElementVisible(aptSuitTextField);
    }

    public Boolean verify_User_View_City_Text_Field() {
        return isElementVisible(cityTextField);
    }

    public Boolean verify_User_View_State_Text_Field() {
        return isElementVisible(state);
    }

    public Boolean verify_User_View_Zipcode_Text_Field() {
        return isElementVisible(zipCodeTextField);
    }

    public Boolean verify_User_View_Doors_Text_Field() {
        return isElementVisible(doorsTextField);
    }

    public void click_On_Property_class_Field() {
        clickOnWebElement(propertyClass);
    }

    public Boolean verify_User_View_Property_Class_Dropdown() {
        return isElementVisible(propertyClassDropdown);
    }

    public void click_On_Year_Built_Field() {
        clickOnWebElement(yearBuilt);
    }

    public Boolean verify_User_View_Year_Built_Dropdown() {
        return isElementVisible(yearBuiltDropdown);
    }

    public void click_On_Owner_Entity_Field() {
        waitforElementClickable(ownerEntity,20);
        clickByAction(ownerEntity);
        waitForElement(2);
        clickByAction(ownerEntity);
    }

    public Boolean verify_User_View_Owner_Entity_Dropdown() {
        return isElementVisible(ownerEntityDropdown);
    }

    public Boolean verify_User_View_State_Of_Entity_Text_Field() {
        return isElementVisible(stateOfEntityTextField);
    }

    public Boolean verify_User_View_EIN_Text_Field() {
        return isElementVisible(einTextField);
    }

    public Boolean verify_User_View_Ticker_Symbol_Text_Field() {
        return isElementVisible(tickerSymbolTextField);
    }

    public Boolean verify_User_View_Continue_Button() {
        return isElementVisible(continueButton);
    }

    public Boolean verify_User_View_Cancel_Button() {
        return isElementVisible(cancelButton);
    }

    public void click_On_Property_Name_Field() {
        waitForElement(3);
        clickOnWebElement(propertyNameTextField);
    }

    public void enter_Valid_Data_Property_Name(String input) {
        sendKeys(propertyNameTextField, input);
    }

    public Boolean verify_Property_Name_Minimum_2_character_Length() {
        int minLength = 2;
        String enteredText = getAttributeValue(propertyNameTextField);
        int length = enteredText.length();
        return length >= minLength;
    }

    public void enter_Valid_Data_Property_Name_45_character(String text) {
        String message = null;
        for (int i = 0; i < 12; i++) {
            message = message + text;
        }
        sendKeys(propertyNameTextField, message);
    }

    public String verify_Property_Name_Maximum_45_character_Length() {
        return maxLengthOfPropertyName.getAttribute("maxlength");
    }

    public String verify_Property_Name_Alphanumeric() {
        return getAttributeValue(propertyNameTextField);
    }

    public Boolean user_Able_To_View_Active_Property_Name_Field() {
        return isEnabled(propertyNameTextField);
    }


    public String verify_User_View_Error_Message_Property_Name_Field() {
        return getText(errorMessagePropertyNameField);
    }

    public String user_Should_Not_Be_Able_To_View_Data() {
        return getAttributeValue(propertyNameTextField);
    }

    public void click_On_Address_Field() {
        waitForElement(3);
        clickOnWebElement(addressTextField);
    }

    public Boolean user_Able_To_View_Active_Address_Field() {
        return isEnabled(addressTextField);
    }

    public void enter_Valid_Data_Address_Field(String input) {
        clearText(addressTextField);
        sendkeysOneByOne(addressTextField, input);
    }

    public Boolean verify_User_Able_To_View_Address_Dropdown() {
        return isElementVisible(addressDropdown);
    }

    public Boolean user_Should_Not_Be_Able_To_Enter_Special_Character() {
        String enteredText = getAttributeValue(addressTextField);
        return enteredText.matches(".*[@#$].*");
    }

    public Boolean user_Should_Not_Be_Able_To_Enter_Alphabetic_And_Special_Character() {
        String enteredText = getAttributeValue(addressTextField);
        return enteredText.matches(".*[a-zA-Z].*") && enteredText.matches(".*[@#$].*");
    }

    public Boolean user_Should_Not_Be_Able_To_Enter_Numeric_And_Special_Character() {
        String enteredText = getAttributeValue(addressTextField);
        return enteredText.matches(".*\\d.*") && enteredText.matches(".*[@#$].*");
    }

    public Boolean user_Should_Not_Be_Able_To_Enter_AlphaNumeric_And_Special_Character() {
        String enteredText = getAttributeValue(addressTextField);
        return enteredText.matches(".*[a-zA-Z].*") && enteredText.matches(".*\\d.*") && enteredText.matches(".*[@#$].*");
    }

    public Boolean user_Should_Not_View_AutoSuggestion() {
        return isElementVisible(addressDropdown);
    }

    public void user_Enter_Invalid_Address_Out_Of_Country(String input) {
        clearText(addressTextField);
        sendKeys(addressTextField, input);
    }

    public String user_Should_View_Error_Message() {
        return getText(validAddressErrorMsg);
    }

    public Boolean verify_Address_Field_Minimum_3_character_Length() {
        int minLength = 3;
        String enteredText = getAttributeValue(addressTextField);
        int length = enteredText.length();
        return length >= minLength;
    }

    public void enter_Valid_Data_Address_Field_50_character(String text) {
        clearText(addressTextField);
        String message = null;
        for (int i = 0; i < 3; i++) {
            message = message + text;
        }
        sendKeys(addressTextField, message);
    }

    public Boolean verify_Address_Field_Maximum_50_character_Length() {
        int maxLength = 50;
        String enteredText = getAttributeValue(addressTextField);
        int length = enteredText.length();
        return length <= maxLength;
    }

    public Boolean user_Should_View_Auto_Suggest_Dropdown() {
        return isElementVisible(addressDropdown);
    }

    public Boolean user_Click_On_Address_In_Address_Dropdown() {
        try {
            waitForElement(3);
            clickOnWebElement(residentialAddressDropdown);
            clickOnWebElement(residentialAddressDropdown);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void user_Erase_Address_In_Address_Field() {
        waitForElement(5);
        String value = getAttributeValue(addressTextField);
        clearOneByOne(addressTextField, value);
    }

    public void click_On_Apt_Suite_Field() {
        clickOnWebElement(aptSuitTextField);
    }

    public Boolean user_Able_To_View_Cursor_On_Apt_Suite_Field() {
        return isEnabled(aptSuitTextField);
    }


    public void enter_Valid_Data_Apt_Suite_Field(String input) {
        clearText(aptSuitTextField);
        sendKeys(aptSuitTextField, input);
    }

    public String user_Should_View_Entered_Input_In_Apt_Suite_Field() {
        String actualInput = getAttributeValue(aptSuitTextField);
        return actualInput;
    }

    public Boolean verify_Apt_Suite_Field_Minimum_3_character_Length() {
        int minLength = 3;
        String enteredText = getAttributeValue(aptSuitTextField);
        int length = enteredText.length();
        return length >= minLength;
    }

    public void enter_Valid_Data_Apt_Suite_Field_50_character(String aptSuitText) {
        clearText(aptSuitTextField);
        String message = null;
        for (int i = 0; i < 3; i++) {
            message = message + aptSuitText;
        }
        sendKeys(aptSuitTextField, message);
    }

    public Boolean verify_Apt_Suite_Field_Maximum_50_character_Length() {
        int maxLength = 50;
        String enteredText = getAttributeValue(aptSuitTextField);
        int length = enteredText.length();
        return length <= maxLength;
    }

    public void user_Click_On_ZipCode_Field() {
        clickOnWebElement(zipCodeTextField);
    }

    public void enter_Zip_Code_In_Input_Field(String zipCode) {
        waitForElement(2);
        clearText(zipCodeTextField);
        sendKeys(zipCodeTextField, zipCode);
    }

    public String get_Zip_Code_Value() {
        waitForElement(2);
        return getAttributeValue(zipCodeTextField);
    }

    public String user_View_Zipcode_Must_Be_5_digit_Error_Msg() {
        return getText(zipCodeErrorMsg);
    }

    public void user_Click_On_Doors_Field() {
        clickOnWebElement(doorsTextField);
    }

    public void enter_Doors_In_Input_Field(String doors) {
        waitForElement(2);
        clearText(doorsTextField);
        sendKeys(doorsTextField, doors);
    }

    public Boolean validate_Doors_Field_Contains_Greater_Than_1_Numeric_Value() {
        int greaterThan1Value = 1;
        int enteredText = Integer.parseInt(getAttributeValue(doorsTextField));
        return enteredText > greaterThan1Value;
    }

    public Boolean validate_Doors_Field_Contains_Less_Than_10000_Numeric_Value() {
        int LessThan10000Value = 10000;
        int enteredText = Integer.parseInt(getAttributeValue(doorsTextField));
        return enteredText < LessThan10000Value;
    }

    public void enter_Invalid_Input_In_Doors_Field(String doors) {
        waitForElement(2);
        clearText(doorsTextField);
        sendKeys(doorsTextField, doors);
    }

    public Boolean validate_User_Can_Only_Enter_Numeric_Digits_In_Doors_Field() {
        String value = getAttributeValue(doorsTextField);
        return value.matches("\\d+");
    }

    public String verify_User_View_Doors_Must_Doors_Should_Not_Be_Less_Then_2_Or_More_Then_9999_Error_Msg() {
        return getText(doorsErrorMsg);
    }

    public String user_Unable_To_View_Entered_Value_In_Doors_Field() {
        return getAttributeValue(doorsTextField);
    }

    public Boolean user_Should_View_Property_Class_Dropdown_With_Options() {
        String[] expectedOptions = {" ", "A", "B", "C", "D"};
        WebElement options = propertyClassDropdown;
        boolean allOptionsMatch = true;
        List<String> expectedOptionsList = new ArrayList<>(Arrays.asList(expectedOptions));
        expectedOptionsList.remove(0);
        expectedOptions = expectedOptionsList.toArray(new String[0]);
        List<WebElement> actualOptions = options.findElements(By.tagName("li"));
        for (int i = 1; i < actualOptions.size(); i++) {
            boolean match = false;
            for (String expectedOption : expectedOptions) {
                if ((actualOptions.get(i).getText()).equals(expectedOption)) {
                    match = true;
                    break;
                }
            }
            Assert.assertTrue(match);
        }
        return allOptionsMatch;
    }

    public void get_Property_Class_DropdownOption(String optionText) {
        WebElement option = driver.findElement(By.xpath("//ul[@aria-labelledby =\"property class\"]/li[text()='" + optionText + "']"));
        clickOnWebElement(option);
    }

    public String verify_User_Should_View_Option_Selected() {
        return getText(propertyClass);
    }

    public String verify_Property_Name_Is_Mandatory_Error_Msg() {
        return getText(propertyClassErrorMsg);
    }

    public void user_Should_View_Year_Built_Dropdown_With_Years_List() {
        int currentYear = java.time.Year.now().getValue();
        List<String> expectedYears = IntStream.rangeClosed(1870, currentYear)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        Collections.reverse(expectedYears);
        WebElement options = yearBuiltDropdown;
        List<WebElement> actualOptions = options.findElements(By.tagName("li"));
        for (int i = 1; i < actualOptions.size(); i++) {
            actualOptions.get(i).getText();
            for (String expectedOYearOption : expectedYears) {
                Assert.assertEquals("Year built dropdown options mismatch", expectedOYearOption, actualOptions.get(i).getText());
                i++;
            }
        }
    }

    public void get_Year_Dropdown_Option(String optionText) {
        WebElement option = driver.findElement(By.xpath("//ul[@aria-labelledby =\"yearBuilt\"]/li[text()='" + optionText + "']"));
        clickByAction(option);
    }

    public String verify_User_Should_View_Year_Option_Selected() {
        return getText(yearBuilt);
    }

    public String verify_Year_Built_Is_Mandatory_Error_Msg() {
        return getText(yearBuiltErrorMsg);
    }

    public void user_Should_View_Owner_Entity_Dropdown_With_Existing_Owner_List() {
        ArrayList<String> expectedOwnerList = new ArrayList<String>();
        expectedOwnerList.add("Add Owner Entity");
        expectedOwnerList.add("Agile Real Estate Group");
        expectedOwnerList.add("Beacon Homes LLC");
        expectedOwnerList.add("Equitable Property Group");
        expectedOwnerList.add("Finders Group Realty LA");
        expectedOwnerList.add("Genesis Properties");
        WebElement options = ownerEntityDropdown;
        waitForElement(3);
        List<WebElement> actualOptions = options.findElements(By.tagName("li"));
        for (int i = 0; i < actualOptions.size(); i++) {
            actualOptions.get(i).getText();
            for (String expectedOwnerOption : expectedOwnerList) {
                Assert.assertEquals("Owner entity dropdown options mismatch", expectedOwnerOption, actualOptions.get(i).getText());
                i++;
            }
        }
    }

    public void get_Owner_Entity_Dropdown_Option(String optionText) {
        WebElement option = driver.findElement(By.xpath("//ul[@aria-labelledby =\"ownerBuilt\"]/li[text()='" + optionText + "']"));
        clickByAction(option);
    }

    public String verify_User_Should_View_Owner_Entity_Option_Selected() {
        return getText(ownerEntity);
    }

    public String verify_Owner_Entity_Is_Mandatory_Error_Msg() {
        return getText(ownerEntityErrorMsg);
    }

    public String verify_User_Should_View_State_Of_Entity_Value() {
        scrollToHeightByJs();
        return getAttributeValue(stateOfEntityTextField);
    }

    public String verify_User_Should_View_EIN_Value() {
        scrollToHeightByJs();
        return getAttributeValue(einTextField);
    }

    public void click_On_Ticker_Symbol_Field() {
        clickOnWebElement(tickerSymbolTextField);
    }

    public void user_Can_Enter_The_Value_In_Ticker_Symbol_Field(String value) {
        sendKeys(tickerSymbolTextField, value);
    }

    public Boolean verify_Alphabetic_Value_In_Ticker_Symbol_Field() {
        String enteredText = getAttributeValue(tickerSymbolTextField);
        return enteredText.matches("[a-zA-Z]+");
    }

    public Boolean verify_Min_Max_Alphabets_In_Ticker_Symbol_Field() {
        String enteredText = getAttributeValue(tickerSymbolTextField);
        return (enteredText.length() >= 1 && enteredText.length() <= 5);
    }

    public Boolean verify_Capitalized_Text_In_Ticker_Symbol_Field() {
        String enteredText = getAttributeValue(tickerSymbolTextField);
        return (enteredText.equals(enteredText.toUpperCase()));
    }

    public String verify_User_View_Error_Msg_Enter_Less_Than_3_AlphaBet_In_Ticket_Symbol_Field() {
        return getText(errorMsgLessThan3AlphabetTickerSymbol);
    }

    public Boolean validate_Max_Length_In_Ticker_Symbol_Field() {
        String enteredText = getAttributeValue(tickerSymbolTextField);
        return enteredText.length() <= 5;
    }


    public Boolean validate_Numeric_Value_In_Ticker_Symbol_Field() {
        String enteredValue = getAttributeValue(tickerSymbolTextField);
        return !enteredValue.matches(".*\\d.*");
    }

    public Boolean validate_Special_Character_In_Ticker_Symbol_Field() {
        String enteredValue = getAttributeValue(tickerSymbolTextField);
        return !enteredValue.matches(".*[^a-zA-Z0-9].*");
    }

    public Boolean validate_No_Space_In_Ticker_Symbol_Field() {
        String enteredValue = getAttributeValue(tickerSymbolTextField);
        return !enteredValue.contains(" ");
    }

    public Boolean validate_No_Alphanumeric_In_Ticker_Symbol_Field() {
        String enteredValue = getAttributeValue(tickerSymbolTextField);
        return !enteredValue.matches(".*[^a-zA-Z].*");
    }

    public String validate_Used_Value_Error_Message_In_Ticker_Symbol_Field() {
        return getText(errorMsgLessThan3AlphabetTickerSymbol);
    }

    public void hover_The_Mouse_Mark_In_Ticker_Symbol_Field() {
        scrollToHeightByJs();
        hoverByAction(questionMarkInTickerSymbol);
    }

    public boolean validate_Tooltip() {
        return isElementVisible(toolTipTickerSymbol, 10);
    }

    public String user_Can_View_Heading_In_Tooltip() {
        return getText(toolTipHeading);
    }

    public String user_Can_View_Body_In_Tooltip() {
        return getText(toolTipBody);
    }

    public boolean verify_Disabled_Continue_Button_On_Add_Property_Page() {
        return continueButton.isEnabled();
    }

    public void get_Address_Dropdown_Option() {
        clickByAction(residentialAddressDropdown);
    }

    public void click_On_Continue_Button() {
//        waitForElement(3);
//        waitForVisibility(continueButton);
        waitforElementClickable(continueButton,20);
        clickOnWebElement(continueButton);
    }

    public Boolean verify_Terms_page() {
        return isElementVisible(agreeToTermsPopup);
    }

    public void click_On_Cancel_Button() {
        clickOnWebElement(cancelButton);
    }

    public Boolean verify_Are_You_Sure_You_Want_To_Exit_Setup() {
        return isElementVisible(areYouSureYouWantToExitPlaceholderText);
    }

    public String validate_Placeholder_Text_On_Verify_Are_You_Sure_You_Want_To_Exit_Setup() {
        return getText(areYouSureYouWantToExitPlaceholderText);
    }

    public String validate_Body_On_Verify_Are_You_Sure_You_Want_To_Exit_Setup() {
        return getText(areYouSureYouWantToExitPopupBody);
    }

    public Boolean verify_User_View_Exit_Button() {
        return isElementVisible(exitButton);
    }

    public Boolean verify_User_View_Return_To_Add_Property_Button() {
        return isElementVisible(returnToAddPropertyButton);
    }

    public void click_On_Exit_Button() {
        clickOnWebElement(exitButton);
    }

    public void click_On_Return_To_Add_Property_Button() {
        clickOnWebElement(returnToAddPropertyButton);
    }

    public String user_View_Agree_To_Terms_Text_On_Popup() {
        return getText(placeholderTextAgreeToTermsPopup);
    }

    public Boolean user_View_Property_Name_On_Agree_To_Terms_Popup() {
        return isElementVisible(propertyNameAgreeToTermsPopup);
    }

    public String user_View_Self_Name_On_Agree_To_Terms_Popup() {
        return getText(selfNameAgreeToTermsPopup);
    }

    public String user_View_Position_On_Agree_To_Terms_Popup() {
        return getText(positionAgreeToTermsPopup);
    }

    public String user_View_Entity_Name_On_Agree_To_Terms_Popup() {
        return getText(entityNameAgreeToTermsPopup);
    }

    public Boolean user_View_Enter_Your_Initials_Field_On_Agree_To_Terms_Popup() {
        return isElementVisible(enterYourInitials);
    }

    public Boolean user_View_Agree_And_Continue_Button_On_Agree_To_Terms_Popup() {
        return isElementVisible(agreeAndContinueBtn);
    }

    public String user_View_Owner_Position_In_Bracket_On_Agree_To_Terms_Popup() {
        return getText(postionInBracket);
    }

    public String user_View_Owner_Entity_Name_On_Agree_To_Terms_Popup() {
        return getText(ownerEntityNameAgreeOnPopup);
    }

    public Boolean user_View_Download_Button_On_Agree_To_Terms_Popup() {
        return isElementVisible(downloadBtnAgreeToTermsPopup);
    }

    public Boolean user_View_Cross_Icon_On_Agree_To_Terms_Popup() {
        return isElementVisible(agreeCloseIcon);
    }

    public void verify_User_Scroll_Agreement_Description_On_Agreement_Popup() {
        waitForElement(3);
        scrollPopUpByJs();
    }

    public Boolean verify_User_View_Enter_Your_Initials_Field_Is_Active_On_Agreement_Popup() {
        waitForVisibility(enterYourInitials);
        return enterYourInitials.isEnabled();
    }

    public void enter_Initials(String initials) {
        waitForElement(2);
        sendKeys(enterYourInitials, initials);
    }

    public String check_Validation_In_Initial_Field() {
        return getAttributeValue(enterYourInitials);
    }

    public Boolean verify_LowerCase_Alphabets_Should_Be_Changed_To_Uppercase_Characters(String initials) {
        return getAttributeValue(enterYourInitials).equals(initials.toUpperCase());
    }

    public Boolean initials_Should_Contain_Two_Alpha_Characters() {
        return (check_Validation_In_Initial_Field().length() >= 2 || check_Validation_In_Initial_Field().matches("^[a-zA-Z]*$"));
    }

    public Boolean initials_Should_Contain_Three_Alpha_Characters() {
        return (check_Validation_In_Initial_Field().length() <= 3 || check_Validation_In_Initial_Field().matches("^[a-zA-Z]*$"));
    }


    public boolean validate_Profile_First_Last_Name() {
        return check_Validation_In_Initial_Field().equals(getText(profileText));
    }


    public String get_Enter_Your_Initials_Field_Value() {
        return getAttributeValue(enterYourInitials);
    }

    public String validate_Enter_Your_Initials_Error_Msg() {
        return getText(errorMsg);
    }

    public void click_On_Download_Button_On_Agree_To_Terms_Popup() {
        createDownloadFolder();
        waitforElementVisible(downloadBtnAgreeToTermsPopup, 5);
        clickOnWebElement(downloadBtnAgreeToTermsPopup);
    }

    public void verify_Agreement_Download_File() {
        waitForElement(5);
        validateDownloadedFile();
    }

    public void click_On_Cross_Icon_On_Agree_To_Terms_Popup() {
        clickOnWebElement(agreeCloseIcon);
    }

    public void clicks_On_Owner_Over_Breadcrumb_On_AddProperty_Page() {
        clickOnWebElement(ownerBreadcrumb);
        waitForElement(2);
    }

    public void click_On_Agree_And_Continue_Button() {
        clickOnWebElement(agreeAndContinueBtn);
    }

    public String verify_Upload_Property_Document_Page() {
        return getText(uploadPropertyDocuments);
    }

    public String verify_Ticker_Symbol_On_Upload_Property_Page() {
        waitForVisibility(ticketSymbolOnUploadPropertyPage);
        return getText(ticketSymbolOnUploadPropertyPage).replaceAll(".*\\(([^)]+)\\).*", "$1");
    }

    public String verify_BreadCrumbs_On_Upload_Document_Page() {
        return getText(uploadPropertyDocumentsBreadcrumb);
    }

    public void user_Should_View_Four_Section_On_Left_Size_On_Upload_Property_Document_Page(String sideLink1, String sideLink2, String sideLink3, String sideLink4) {
        ArrayList<String> expectedSectionList = new ArrayList<String>();
        expectedSectionList.add(sideLink1);
        expectedSectionList.add(sideLink2);
        expectedSectionList.add(sideLink3);
        expectedSectionList.add(sideLink4);
        WebElement options = fourSectionLeftSide;
        waitForElement(3);
        List<WebElement> actualOptions = options.findElements(By.tagName("li"));
        for (int i = 0; i < actualOptions.size(); i++) {
            actualOptions.get(i).getText();
            for (String expectedOption : expectedSectionList) {
                Assert.assertEquals("Four Section options mismatch", expectedOption, actualOptions.get(i).getText());
                i++;
            }
        }
    }


    public String verify_PlaceHolder_Text_On_Upload_Document_Page() {
        return getText(uploadPropertyDocuments);
    }

    public String verify_Property_Name_On_Upload_Document_Page() {
        return getText(propertyNameOnUploadPropertyPage).split("\\s+")[0];
    }

    public String verify_Address_Apt_City_State_Zipcode_On_Upload_Document_Page() {
        return getText(propertyNameOnUploadPropertyPage);
    }

    public String verify_Property_Class_On_Upload_Document_Page() {
        return getText(propertyClassOnUploadPropertyPage);
    }

    public String verify_Year_Built_On_Upload_Document_Page() {
        return getText(yearBuiltOnUploadPropertyPage);
    }

    public String verify_Doors_On_Upload_Document_Page() {
        return getText(doorsOnUploadPropertyPage);
    }

    public String verify_Owner_Entity_On_Upload_Document_Page() {
        return getText(ownerEntityOnUploadPropertyPage);
    }

    public String verify_State_Of_Entity_On_Upload_Document_Page() {
        return getText(stateOfEntityOnUploadPropertyPage);
    }

    public String verify_Ein_On_Upload_Document_Page() {
        return getText(einOnUploadPropertyPage);
    }

    public Boolean verify_Four_Section_Document_Tracker_Pie_Chart() {
        for (WebElement element : fourSectionInPiachart) {
            isElementVisible(element, 10);
            return true;
        }
        return false;
    }

    public void click_On_Browser() {
        waitForElement(3);
        clickOnWebElement(browse);
        waitForElement(3);
    }

    public boolean verify_Image_Format_Error_msg() {
        waitForElement(4);
        return isElementVisible(imageFormatMsg, 3);
    }

    public String get_Image_Format_Error_Msg() {
        waitForElement(3);
        return getText(toastMsg);
    }


    public boolean verify_General_Info_Section() {
        return isElementVisible(generalInfo);
    }

    public void click_On_Owner_Auth() {
        clickOnWebElement(ownerAuth);
    }

    public void click_On_offer() {
        clickOnWebElement(offer);
    }

    public void click_On_Financial() {
        clickOnWebElement(financials);
    }

    public boolean verify_Owner_Auth_Section() {
        return isElementVisible(ownerAuthActive);
    }

    public boolean verify_Offer_Section() {
        return isElementVisible(offerActive);
    }

    public boolean verify_Financial_Section() {
        return isElementVisible(financialsActive);
    }

    public void click_On_Download_Icon() {
        clickOnWebElement(downloadIcon);
    }

    public boolean verify_Document_Section() {
        waitForElement(2);
        return isElementVisible(expandSection);
    }


    public String upload_File(String uploadFile) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", browse);
        browse.sendKeys(fileUploadPath(uploadFile));
        return browse.getAttribute("value");
    }

    public void click_On_Info_Icon() {
        clickByAction(infoIcon);
    }

    public boolean verify_Info_Icon() {
        return isElementVisible(infoData);
    }

    public void click_On_Sort_Option() {
        clickOnWebElement(sorting);
    }

    public boolean verify_Sorting_Dropdown() {
        waitForElement(2);
        return isElementVisible(sortingDropdown);
    }

    public boolean verify_Default_All_Option() {
        return isElementVisible(defaultAll);
    }

    public void verify_Sorting_Options() {
        for (WebElement element : sortingOptions) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public boolean verify_Listing_Of_Sorting_Option() {
        return isElementVisible(listingOfSortingOption);
    }

    public boolean verify_To_Do_Option_Selected() {
        return isElementVisible(defaultToDo);
    }

    public boolean verify_In_Review_Option_Selected() {
        return isElementVisible(defaultInReview);
    }

    public boolean verify_Approved_Option_Selected() {
        return isElementVisible(defaultApproved);
    }

    public boolean verify_Attention_Required_Option_Selected() {
        return isElementVisible(defaultAttentionRequired);
    }

    public void click_On_To_Do_Option() {
        clickOnWebElement(toDo);
    }

    public void click_On_In_Review_Option() {
        clickOnWebElement(inReview);
    }

    public void click_On_Approved_Option() {
        clickOnWebElement(approved);
    }

    public void click_On_Attention_Required_Option() {
        clickOnWebElement(attentionRequired);
    }

    public void click_On_Resolve_Btn() {
        scrollByVisibilityOfElement(driver, pendingProperties);
        waitForElement(3);
        clickByAction(resolveBtn);
    }

    public void click_On_View_Issue() {
        clickOnWebElement(viewIssue);
    }

    public boolean verify_Attention_Required_Status() {
        return isElementVisible(attentionRequiredStatus);
    }

    public String verify_unanimous_Document_Section() {
        return getText(unanimousConsentDocumentSection);
    }

    public void page_Scroll() {
        scrollByVisibilityOfElement(driver, unanimousConsentDocumentSection);
    }

    public boolean verify_Document_Msg() {
        return isElementVisible(documentMsg);
    }

    public boolean verify_Upload_File() {
        return isElementVisible(uploadFileSuccessfully);
    }

    public boolean verify_In_Review_Status() {
        return isElementVisible(inReviewStatus);
    }

    public boolean verify_Close_Icon_Visible() {
        return isElementVisible(closeIcon);
    }

    public void click_On_Close_Icon() {
        clickOnWebElement(closeIcon);
    }


    public void scroll_Page() {
        scrollByVisibilityOfElement(driver, partyReport);
    }

    public void click_On_Info_Icon_Of_Pictures_Property() {
        clickByAction(picturesOfProperty);
    }


    public String upload_Maximum_25_Document(int documentCount) {
        String imagePath = "";
        for (int i = 1; i <= documentCount; i++) {
            imagePath = fileUploadPath("image.png");
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", browseBTn);//        browser.sendKeys("(document.querySelectorAll('input[type=file]'))[1].value = '';");
            browseBTn.sendKeys(imagePath);
        }
        return imagePath;
    }

    public boolean verify_File_Uploading_Section() {
        waitForElement(4);
        return isElementVisible(imageUploaderSection, 10);
    }

    public void remove_Text_From_Property_Field() {
        clearText(propertyNameTextField);
    }

    public void click_On_Address_Input_Field() {
        clickOnWebElement(addressTextField);
    }

    public void remove_Text_Field_Data(String value) {
        WebElement locatorOf = driver.findElement(By.name(value));
        String value1 = getAttributeValue(locatorOf);
        clearOneByOne(locatorOf, value1);
    }

    public void remove_Initial_Text_Field_Data() {
        String value1 = getAttributeValue(enterYourInitials);
        clearOneByOne(enterYourInitials, value1);
    }

    public void click_On_Outside_The_Popup() {
        clickByAction(profileText);
    }
}
