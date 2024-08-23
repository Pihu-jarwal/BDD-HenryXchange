package org.xchange.pom;

import logger.LogReporter;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DateUtil;
import utils.Helper;

import java.util.List;

public class UsersPage extends Helper {
    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Users')]")
    private WebElement userTab;

    @FindBy(xpath = "//div[@class='filterIco old']")
    private WebElement aToZListing;

    @FindBy(xpath = "//div[@class='filterIco new']")
    private WebElement zToAListing;

    @FindBy(id = "react-select-3-option-0")
    private WebElement userSinceAToZOption;

    @Getter
    @FindBy(xpath = "//table//tbody/tr/td[7]")
    private List<WebElement> levelsData;
    @FindBy(id = "react-select-3-option-1")
    private WebElement userSinceZToAOption;

    @FindBy(xpath = "//div[contains(text(),'Sort Ascending')]")
    private WebElement aToZOption;

    @FindBy(xpath = "//div[contains(text(),'Sort Descending')]")
    private WebElement zToAOption;

    @FindBy(id = "react-select-5-option-0")
    private WebElement lastLoginAToZOption;

    @FindBy(id = "react-select-5-option-1")
    private WebElement lastLoginZToAOption;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__dropdown-indicator')])[2]")
    private WebElement userSinceLabel;

    @FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(/preceding-sibling::th)+1+1+1]")
    private List<WebElement> mobileNumberColumn;

    @FindBy(xpath = "//table[contains(@class,'MuiTable-root')]/tbody/tr/td[count(/preceding-sibling::th)+1+1]")
    private List<WebElement> emailColumn;

    @Getter
    @FindBy(xpath = "//table//tbody/tr/td[9]")
    private List<WebElement> lastLoginCellDate;

    @Getter
    @FindBy(xpath = "//table//tbody/tr/td[5]")
    private List<WebElement> userID;

    @FindBy(xpath = "//button[@type='button']")
    private List<WebElement> paginationNumber;

    @FindBy(xpath = "//table//tbody/tr/td[4]/div")
    private List<WebElement> entitiesNameColumn;

    @FindBy(xpath = "//div[text()='LAST LOGIN']")
    private WebElement lastLogin;

    @FindBy(xpath = "//div[@class=\"label\" and contains(text(),'LEVELS')]")
    private WebElement levelsDropdown;

    @FindBy(xpath = "//input[@class='FilterSearch']")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(text(),'Showing')]")
    private WebElement showingMatchingResult;

    @FindBy(xpath = "//span[text()='active']")
    private List<WebElement> userDetailRow;

    @FindBy(xpath = "//p[contains(@class,'MuiTypography') and contains(text(),'User Details')]")
    private WebElement userDetailPage;

    @FindBy(xpath = "//p[text()=' Name ']/following-sibling::p[contains(@class,'value')]")
    private WebElement userName;

    @FindBy(xpath = "//p[text()=' Email ']/following-sibling::p[contains(@class,'value')]")
    private WebElement userEmail;

    @FindBy(xpath = "//p[text()=' Mobile Number ']/following-sibling::p[contains(@class,'value')]")
    private WebElement userMobileNumber;

    @FindBy(xpath = "//p[text()=' SSN ']/following-sibling::p[contains(@class,'value')]")
    private WebElement valueOfSSN;

    @FindBy(xpath = "//p[text()=' Address ']/following-sibling::p[contains(@class,'value')]")
    private WebElement userAddress;

    @FindBy(xpath = "//p[text()=' User ID ']/following-sibling::p[contains(@class,'value')]")
    private WebElement userUserID;

    @FindBy(xpath = "//span[contains(@class,'MuiTouchRipple-root')]")
    private List<WebElement> segmentTabs;

    @FindBy(xpath = "//button[contains(@class,'Mui-selected ') and text()='User Details']")
    private WebElement userDetailTabHighLighted;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol ')]")
    private WebElement breadCrumbs;

    @FindBy(xpath = "//p[text()=' DOB ']/following-sibling::p[contains(@class,'value')]")
    private WebElement dateOfBirth;

    @FindBy(xpath = "(//p[contains(@class,'paragraph')])[1]")
    private WebElement linkedExternalAccount;

    @FindBy(xpath = "(//p[contains(@class,'paragraph')])[2]")
    private WebElement linkedEntities;

    @FindBy(xpath = "//button[text()='Investments']")
    private WebElement investmentTab;

    @FindBy(xpath = "//p[contains(@class,'MuiTypography') and contains(text(),'Investments')]")
    private WebElement investmentSection;

    @FindBy(xpath = "//div[contains(@class,'transactions')]")
    private WebElement transactionTab;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__control')]")
    private WebElement timeSortingFilter;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__menu-lis')]")
    private WebElement filterOptions;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'All Time')] ")
    private WebElement allTimeOption;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'This Month')] ")
    private WebElement thisMonthOption;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__single-value') and contains(text(),'This Month')]")
    private WebElement thisMonthFilter;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'This Year')] ")
    private WebElement thisYearOption;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'Last Year')] ")
    private WebElement lastYearOption;
    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'Last Month')] ")
    private WebElement lastMonthOption;

    @FindBy(xpath = "//div[contains(@class,'FilterForTime__option') and contains(text(),'Custom')] ")
    private WebElement customOption;
    @FindBy(xpath = "//table//tbody/tr/td[1]")
    private List<WebElement> dateCellElements;

    @FindBy(xpath = "//table//tbody/tr/td[3]")
    private List<WebElement> propertyName;

    @FindBy(xpath = "//div[contains(text(),'No result found')]")
    private WebElement noResultFound;

    @FindBy(xpath = "//div[contains(@class,'flexalign')]/span")
    private WebElement copyIcon;

    @FindBy(xpath = "//span[contains(@aria-labelledby,'mui')]")
    private WebElement toolTip;

    @FindBy(xpath = "//button[@type=\"button\" and text()='Print']")
    private WebElement printButton;

    @FindBy(xpath = "//button[text()='Transactions']")
    private WebElement transactionSection;

    @FindBy(id = "pdf-viewer")
    private WebElement printPdf;

    @FindBy(xpath = "//input[@placeholder=\"Select Date\"]")
    private WebElement selectStartDate;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day--today')]")
    private WebElement todayDate;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day--')]")
    private List<WebElement> startDate;

    @FindBy(xpath = "(//input[@placeholder='Select Date'])[1]")
    private WebElement selectedDate;

    @FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
    private WebElement selectedEndDate;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']")
    private WebElement datePicker;

    @FindBy(xpath = "(//div[contains(@class,'flexalign')])[1]")
    private WebElement transactionId;

    @FindBy(xpath = "//tbody[contains(@class,'MuiTableBody-root')]/tr")
    private List<WebElement> transactionListing;

    @FindBy(xpath = "(//tbody[contains(@class,'MuiTableBody-root')]/tr)[1]")
    private WebElement transactionList;

    @FindBy(xpath = "//div[contains(text(),'Showing ')]")
    private WebElement matchingResultCount;

    @FindBy(xpath = "//div[contains(@class,'FilterForNumber__menu-list')]")
    private WebElement byFilterMenu;

    @FindBy(xpath = "//div[contains(@class,'FilterForNumber__placeholder')]")
    private WebElement byFilter;

    @FindBy(xpath = "//div[contains(@class,'FilterForNumber__option--is-focused')  and text()='All']")
    private WebElement allFilterSelected;

    @FindBy(xpath = "(//tbody[contains(@class,'MuiTableBody-root')]/tr)[1]")
    private WebElement transactionRow;

    @Getter
    @FindBy (xpath = "//table//tbody/tr/td[2]")
    private List<WebElement> nameCellData;

    @Getter
    @FindBy (xpath = "//table//tbody/tr/td[1]")
    private List<WebElement> nameColumnValue;

    @FindBy(xpath = "//p[contains(@class,'MuiTypography-root') and text()='Transaction Details']")
    private WebElement propertyDetail;

    @Getter
    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-head ')]/th")
    private List<WebElement> transactionColumnName;

    @FindBy(xpath = "//p[contains(text(),'TOTAL Target IRR')]/following-sibling::p")
    private WebElement totalTargetIRR;

    @FindBy(xpath = "//p[contains(text(),'TOTAL Target AAR')]/following-sibling::p")
    private WebElement totalTargetAAR;

    @FindBy(xpath = "//p[contains(text(),'EQUITY MULTIPLE')]/following-sibling::p")
    private WebElement equityMultiple;

    @FindBy(xpath = "//p[contains(text(),'SHARES')]/following-sibling::p")
    private WebElement shares;

    @FindBy(xpath = "//p[contains(text(),'Average share cost')]/following-sibling::p")
    private WebElement avgShareCost;

    @FindBy(xpath = "//p[contains(text(),'Total value')]/following-sibling::p")
    private WebElement totalValue;

    @Getter
    @FindBy(xpath = "//p[contains(text(),' User Since ')]/following-sibling::p")
    private WebElement userSinceDate;

    @Getter
    @FindBy(xpath = "//table//tbody/tr/td[6]")
    private List<WebElement> userSinceDates;

    public void click_On_User_Tab() {
        waitForElement(6);
        clickByAction(userTab);
    }

    public boolean verify_A_To_Z_Filter_Selected() {
        return isElementVisible(aToZListing);
    }

    public void click_On_User_Since() {
        waitForElement(3);
        waitforElementClickable(userSinceLabel, 30);
        clickByAction(userSinceLabel);
    }

    public void click_On_User_Since_A_To_Z_Option() {
        waitForElement(2);
        clickByAction(userSinceAToZOption);
    }

    public void click_On_User_Since_Z_To_A_Option() {
        clickByAction(userSinceZToAOption);
    }

    public void verify_Email_Column() {
        for (WebElement element : emailColumn) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void verify_Mobile_Number_Column() {
        for (WebElement element : mobileNumberColumn) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public String verify_Kyc_Process_Is_Not_Done(String specialCharacter) {
        String mobileNumber = "";
        for (int i = 0; i < mobileNumberColumn.size(); i++) {
            if (getText(mobileNumberColumn.get(i)).equals(specialCharacter)) {
                mobileNumber = getText(mobileNumberColumn.get(i));
                break;
            }
        }
        return mobileNumber;
    }

    public String verify_Entities_Value(String specialCharacter) {
        String entitiesValue = "";
        for (int i = 0; i < entitiesNameColumn.size(); i++) {
            if (getText(entitiesNameColumn.get(i)).equals(specialCharacter)) {
                entitiesValue = getText(entitiesNameColumn.get(i));
                break;
            }
        }
        return entitiesValue;
    }


    public void click_On_Levels_Dropdown() {
        try {
            waitForElement(5);
            clickOnWebElement(levelsDropdown);
        } catch (Exception e) {
        }
    }

    public void click_on_Last_Login() {
        waitForElement(4);
        clickByAction(lastLogin);
    }

    public void click_On_A_To_Z_Option() {
        waitForElement(2);
        clickByAction(aToZOption);
    }

    public void click_On_Z_To_A_Option() {
        clickByAction(zToAOption);
        waitForElement(5);
    }

    public void enter_Search_Field_Data(String searchData) {
        sendKeys(searchField, searchData);
    }

    public boolean is_Search_Field_Visible() {
        return isElementVisible(searchField);
    }

    public boolean is_Showing_Matching_Result_Visible() {
        return isElementVisible(showingMatchingResult);
    }


    public void click_On_User_Detail_Row() {
        for (int i = 0; i < userDetailRow.size(); i++) {
            if (i == 0)
                waitForElement(2);
            hoverByAction(userDetailRow.get(i));
            clickByAction(userDetailRow.get(i));
        }
    }

    public boolean is_User_Detail_Page_Visible() {
        return isElementVisible(userDetailPage);
    }

    public boolean verify_User_Name() {
        return isElementVisible(userName);
    }

    public boolean verify_User_Email() {
        return isElementVisible(userEmail);
    }

    public String verify_User_Mobile_Number() {
        return getText(userMobileNumber);
    }

    public String verify_User_SSN_Value() {
        return getText(valueOfSSN);
    }

    public String verify_User_Address() {
        return getText(userAddress);
    }

    public boolean verify_User_ID() {
        return isElementVisible(userUserID);
    }

    public void verify_Segment_Tabs() {
        for (WebElement element : segmentTabs) {
            Assert.assertTrue("Segment tabs is not visible", isElementVisible(element));
        }
    }

    public boolean is_User_Detail_Tab_Highlighted() {
        return isElementVisible(userDetailTabHighLighted);
    }


    public boolean is_Bread_Crumbs_Visible() {
        return isElementVisible(breadCrumbs);
    }

    public String is_Date_Of_Birth_Visible() {
        return getText(dateOfBirth);
    }

    public String verify_External_Linked_Account() {
        return getText(linkedExternalAccount);
    }

    public String verify_Linked_Entities_Account() {
        return getText(linkedEntities);
    }

    public void click_On_Investments_Section() {
        clickByAction(investmentTab);
    }

    public boolean verify_Investment_Page() {
        return isElementVisible(investmentSection);
    }

    public void enter_Email_In_Search_Field(String email) {
        sendKeys(searchField, email);
    }

    public void click_On_Transaction_Tab() {
        waitForElement(5);
        clickByAction(transactionTab);
    }

    public boolean verify_Filter_Options() {
        return isElementVisible(filterOptions);
    }

    public void click_On_All_Time_Filter_Option() {
        waitForElement(3);
        clickByAction(timeSortingFilter);
    }

    public void click_On_All_Time_Option() {
        clickByAction(allTimeOption);
    }

    public boolean is_This_Month_Option_Visible() {
        return isElementVisible(thisMonthFilter);
    }

    public void click_On_This_Month_option() {
        waitForElement(1);
        clickByAction(thisMonthOption);
    }

    public String verify_This_Month_Listing() {
        String nextDate = "";
        for (int i = 1; i < dateCellElements.size(); i++) {
            nextDate = getText(dateCellElements.get(i)).trim();
        }
        return nextDate;
    }

    public void click_On_This_Year_Filter() {
        clickByAction(thisYearOption);
    }

    public void click_On_Last_Month_Filter() {
        clickByAction(lastMonthOption);
    }

    public void click_On_Last_Year_Filter() {
        clickByAction(lastYearOption);
    }

    public void click_On_Custom_Filter() {
        clickByAction(customOption);
    }

    public void click_On_Start_Date() {
        for (int i = 0; i < startDate.size(); i++) {
            if (i == 0) {
                clickByAction(startDate.get(i));
            }
        }
    }

    public void click_On_Select_Date() {
        clickByAction(selectStartDate);
    }

    public void click_On_End_Date() {
        clickByAction(todayDate);
    }

    public String verify_Date_In_Range() {
        String nextDate = "";
        for (int i = 1; i < dateCellElements.size(); i++) {
            nextDate = getText(dateCellElements.get(i)).trim();
        }
        return nextDate;
    }

    public String get_Selected_Start_Date() {
        return getAttributeValue(selectedDate);
    }

    public String get_Selected_End_Date() {
        return getAttributeValue(selectedEndDate);
    }

    public boolean is_Date_Picker_Visible() {
        return isElementVisible(datePicker);
    }

    public void enter_Transaction_ID_In_Search_Field() {
        String transactionID = getText(transactionId);
        sendKeys(searchField, transactionID);
    }

    public String get_Search_Field_Value() {
        return getAttributeValue(searchField);
    }

    public String get_Transaction_ID() {
        return getText(transactionId);
    }


    public String get_Showing_Matching_Count() {
        return getText(showingMatchingResult).replace("Showing ", "").replace(" matching results", "").trim();
    }

    public String get_Listing_Count() {
        waitForElement(1);
        int value = transactionListing.size();
        return String.valueOf(value);
    }


    public void enter_Property_Name_In_Search_Field(String propertyName) {
        sendKeys(searchField, propertyName);
    }

    public String verify_No_Result_Found() {
        return getText(noResultFound);
    }

    public void hover_On_Copy_Icon() {
        hoverByAction(copyIcon);
    }

    public void click_On_Copy_Icon() {
        clickByAction(copyIcon);
    }


    public boolean is_Copied_Tool_Tip_Visible() {
        LogReporter.INFO(getText(toolTip));
        return isElementVisible(toolTip);
    }

    public void click_On_Transaction_List_Row() {
        clickByAction(transactionList);
    }

    public void click_On_Print_Button() {
        waitForElement(1);
        clickByAction(printButton);
    }

    public boolean verify_Print_PDF() {
        LogReporter.INFO("Start PDF opening");
        driver.switchTo().frame(printPdf);
        waitForElement(1);
        LogReporter.INFO("PDF opening");
        return isElementVisible(printPdf);
    }

    public void click_On_Transaction_Section() {
        waitForElement(1);
        clickByAction(transactionSection);
    }

    public void click_On_By_Filter() {
        clickByAction(byFilter);
    }

    public boolean is_Filter_By_Visible() {
        return isElementVisible(byFilter);
    }


    public boolean verify_Filter_Options_Visible() {
        return isElementVisible(byFilterMenu);
    }

    public boolean Is_All_Selected() {
        return isElementVisible(allFilterSelected);
    }

    public void click_On_Transaction_Row() {
        clickByAction(transactionRow);
    }

    public String verify_Property_Detail() {
        return getText(propertyDetail);
    }

    public boolean is_Total_IRR_Visible() {
        return isElementVisible(totalTargetIRR);
    }

    public boolean is_Total_AAR_Visible() {
        return isElementVisible(totalTargetAAR);
    }

    public boolean is_Total_Shares_Visible() {
        return isElementVisible(shares);
    }

    public boolean is_Total_Avg_Share_Cost_Visible() {
        return isElementVisible(avgShareCost);
    }

    public boolean is_Total_Equity_Visible() {
        return isElementVisible(equityMultiple);
    }

    public boolean is_Total_Value_Visible() {
        return isElementVisible(totalValue);
    }

}


