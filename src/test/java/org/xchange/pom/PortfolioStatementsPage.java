package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class PortfolioStatementsPage extends Helper {

    public PortfolioStatementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Portfolio ']")
    private WebElement portfolio;

    @FindBy(xpath = "//button[text()='Statements']")
    private WebElement statements;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement portfolioBreadcrumb;

    @FindBy(xpath = "//p[text()='Statements']")
    private WebElement statementBreadcrumb;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-head')]")
    private WebElement titleDescription;

    @FindBy(xpath = "//div[contains(@class,'value-container')]")
    private List<WebElement> filterText;

    @FindBy(xpath = "//div[text()='DATE']")
    private WebElement date;

    @FindBy(xpath = "//div[contains(@class,'custom-select__menu-list')]")
    private List<WebElement> menuList;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root')]/td")
    private List<WebElement> listingData;

    @FindBy(xpath = "//div[text()='Oldest to Newest']")
    private WebElement oldestToNewest;

    @FindBy(xpath = "//div[text()='All Types']")
    private WebElement allTypes;

    @FindBy(xpath = "//div[contains(@Id,'option')]")
    private List<WebElement> allTypesOptions;

    @FindBy(xpath = "//div[text()='Purchase']")
    private WebElement purchase;

    @FindBy(xpath = "//div[text()='Sell']")
    private WebElement sell;

    @FindBy(xpath = "//div[text()='Account']")
    private WebElement account;

    @FindBy(xpath = "//div[text()='This Month']")
    private WebElement thisMonth;

    @FindBy(xpath = "//div[text()='Custom']")
    private WebElement custom;

    @FindBy(xpath = "//div[@class=\"react-datepicker\"]")
    private WebElement endDateCalendar;

    @FindBy(xpath = "(//input[@placeholder=\"Select Date\"])[1]")
    private WebElement selectDate;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> selectCalendarDate;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__value-container')])[1]")
    private WebElement filter;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__value-container')])[2]")
    private WebElement defaultThisMonthFilter;

    @FindBy(xpath = "//div[@class='no-data']/span")
    private WebElement noDataAvailable;

    @FindBy(xpath = "//div[contains(@id,'option')]")
    private List<WebElement> thisMonthFilterOptions;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='This Month')]")
    private WebElement defaultThisMonth;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Last Month')]")
    private WebElement defaultLastMonth;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='This Year')]")
    private WebElement defaultThisYear;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Last Year')]")
    private WebElement defaultLastYear;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Custom')]")
    private WebElement defaultCustom;

    @FindBy(xpath = "//div[text()='Last Month']")
    private WebElement lastMonth;

    @FindBy(xpath = "//div[text()='This Year']")
    private WebElement thisYear;

    @FindBy(xpath = "//div[text()='Last Year']")
    private WebElement lastYear;

    @FindBy(xpath = "(//td[text()='Purchase Statment']/following-sibling::td/div/button[(text()='View')])[1]")
    private WebElement purchaseView;

    @FindBy(xpath = "(//td[text()='Sell Statement']/following-sibling::td/div/button[(text()='View')])[1]")
    private WebElement sellView;

    @FindBy(xpath = "//button[text()='View']")
    private List<WebElement> viewBtn;

    @FindBy(xpath = "//div[@id='alert-dialog-title']/p")
    private WebElement pdfTitle;

    @FindBy(xpath = "//td[text()='Purchase Statment']")
    private WebElement purchaseStatement;

    @FindBy(xpath = "//td[text()='Sell Statement']")
    private List<WebElement> sellStatement;

    @FindBy(xpath = "//td[text()='Account Statment']")
    private List<WebElement> accountStatement;

    @FindBy(xpath = "(//div[@class=\"action-buttons\"]/button)[2]")
    private WebElement crossButton;

    @FindBy(xpath = "//div[@class=\"react-pdf__Document\"]")
    private WebElement pdfViewer;

    @FindBy(xpath = "(//div[contains(@class,'pdf-view')])[3]")
    private WebElement pdfWindow;

    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')]/button/following-sibling::button)[1]")
    private WebElement previousBtn;

    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')]/button/following-sibling::button)[2]")
    private WebElement nextBtn;

    @FindBy(xpath = "//div[@class='react-datepicker__header react-datepicker__header--custom']")
    private WebElement monthYear;

    @FindBy(xpath = "//p[contains(text(),'Jun 2023')]")
    private WebElement month;

    @FindBy(css = "button[class='download']")
    private List<WebElement> downloadBtn;

    @FindBy(xpath = "//p[text()='May 2023']")
    private WebElement mayMonth;

    @FindBy(xpath = "//p[text()='Jun 2023']")
    private WebElement junMonth;

    @FindBy(xpath = "//button[contains(@class,'exportBtn ')]")
    private WebElement export;

    @FindBy(xpath = "//h1[text()='Portfolio']")
    private WebElement portfolioPage;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__value-container')])[1]")
    private WebElement defaultAllTypeFilter;

    @FindBy(xpath = "//i[@class=\"download-pdf-icon gray\"]")
    private WebElement pdfDownloadBtn;

    @FindBy(xpath = "//div[@aria-current=\"date\"]")
    private WebElement currentDate;

    @FindBy(xpath = "//div[contains(@class,'day--disabled')]")
    private WebElement disableDate;

    @FindBy(xpath = "//div[@class='filterIco old']")
    private WebElement oldestToNewestFilter;

    @FindBy(xpath = "//div[@class='filterIco new']")
    private WebElement newestToOldestFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Purchase')]")
    private WebElement defaultPurchaseFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Account')]")
    private WebElement defaultAccountFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text()='Sell')]")
    private WebElement defaultSellFilter;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day--008')] ")
    private WebElement startDate;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day--today')]")
    private WebElement endDate;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day--017')]")
    private WebElement endDateForNoDate;


    public void click_On_Portfolio() {
        waitForElement(5);
        clickOnWebElement(portfolio);
    }

    public void click_On_Statement_Button() {
        clickOnWebElement(statements);
    }

    public boolean verify_Breadcrumbs_On_Statement_Page() {
        return isElementVisible(portfolioBreadcrumb, 10);
    }

    public boolean verify_Title_Description() {
        return titleDescription.isDisplayed();
    }

    public boolean verify_Filter_Text() {
        for (int i = 0; i < filterText.size(); i++) {
            if (isElementVisible(filterText.get(i), 10)) {
                return true;
            }
        }
        return false;
    }

    public void click_On_Date_Label() {
        waitForElement(3);
        clickByAction(date);
    }

    public void verify_Date_Menu_List() {
        for (WebElement element : menuList) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void click_On_Newest_To_Oldest() {
        clickOnWebElement(oldestToNewest);
    }

    public void verify_Listing_Data_On_Statement_Page() {
        waitForElement(2);
        for (WebElement element : listingData) {
            Assert.assertTrue(isElementVisible(element, 5));
        }
        Assert.assertFalse(isElementVisible(noDataAvailable, 1));
    }

    public void click_On_All_Type_Filter() {
        clickOnWebElement(allTypes);
    }

    public void click_On_Purchase() {
        clickOnWebElement(purchase);
    }

    public void click_On_Sell() {
        clickOnWebElement(sell);
    }

    public void click_On_Account() {
        clickOnWebElement(account);
    }

    public void click_on_This_Month() {
        clickOnWebElement(thisMonth);
    }

    public void verify_Custom_Date() {
        clickOnWebElement(custom);
    }

    public void click_On_Select_Date() {
        clickOnWebElement(selectDate);
    }

    public void verify_Select_Start_Date() {
        clickOnWebElement(previousBtn);
        clickOnWebElement(startDate);
    }

    public boolean click_On_Current_Date() {
        clickOnWebElement(currentDate);
        return isElementVisible(disableDate, 5);
    }

    public void verify_Select_End_Date() {
        clickOnWebElement(endDate);
    }

    public void verify_This_Month_Filter() {
        for (int i = 0; i < thisMonthFilterOptions.size(); i++) {
            Assert.assertTrue(isElementVisible(thisMonthFilterOptions.get(i)));
        }
    }

    public void verify_This_Month_Set_By_Default() {
        Assert.assertTrue(isElementVisible(defaultThisMonth, 5));
        Assert.assertFalse(isElementVisible(defaultLastMonth, 1));
        Assert.assertFalse(isElementVisible(defaultLastYear, 1));
        Assert.assertFalse(isElementVisible(defaultCustom, 1));
        Assert.assertFalse(isElementVisible(defaultThisYear, 1));
    }

    public void click_On_Last_Month() {
        clickOnWebElement(lastMonth);
        waitForElement(2);
    }

    public void click_On_This_Year() {
        clickOnWebElement(thisYear);
    }

    public void click_On_Last_Year() {
        clickOnWebElement(lastYear);
    }

    public void click_On_Default_Filter() {
        waitforElementClickable(defaultThisMonthFilter, 5);
        clickByAction(defaultThisMonthFilter);
    }

    public boolean is_Any_View_Btn_Enabled() {
        waitForElement(2);
        for (WebElement button : viewBtn) {
            if (button.isEnabled()) {
                clickOnWebElement(button);
                return true; // Return true if any button is enabled
            }
        }
        return false; // Return false if no button is enabled
    }

    public boolean verify_Pdf_Title() {
        return isElementVisible(pdfTitle, 10);
    }

    public void click_On_Cross_Button() {
        Assert.assertTrue(isElementVisible(crossButton, 10));
        clickOnWebElement(crossButton);
        Assert.assertFalse(isElementVisible(pdfViewer));
    }

    public void click_On_Start_Date_Which_Have_No_Data() {
       clickOnWebElement(previousBtn);
        clickOnWebElement(startDate);

    }

    public void click_On_End_Date_Which_Have_No_Data() {
        clickOnWebElement(previousBtn);
         clickOnWebElement(endDateForNoDate);
    }

    public boolean is_Any_Download_Btn_Enabled() {
        for (WebElement button : downloadBtn) {
            if (button.isEnabled()) {
                clickOnWebElement(button);
                waitForElement(2);
                return true; // Return true if any button is enabled
            }
        }
        return false; // Return false if no button is enabled
    }

    public void verify_Download_File() {
        validateDownloadedFile();
    }

    public String verify_Custom_Filter_Which_Have_No_Data() {
        return getText(noDataAvailable);
    }

    public void click_On_Export_Button() {
        waitforElementClickable(export, 10);
        clickByAction(export);
        waitForElement(5);
    }

    public void click_On_Default_All_Type_Filter() {
        clickOnWebElement(defaultAllTypeFilter);
    }

    public void click_On_Pdf_download_Btn() {
        clickOnWebElement(pdfDownloadBtn);
        waitForElement(3);
    }

    public boolean validate_End_Date_Calender() {
        return isElementVisible(endDateCalendar, 5);
    }

    public boolean validate_Oldest_To_Newest_Filter(){
        return isElementVisible(oldestToNewestFilter,10);
    }

    public boolean validate_Newest_To_Oldest_Filter(){
        return isElementVisible(newestToOldestFilter);
    }

    public boolean validate_Last_Month_Filter(){
        return isElementVisible(defaultLastMonth,10);
    }

    public boolean validate_This_Year_Filter(){
        return defaultThisYear.isSelected();
    }

    public boolean validate_Last_Year_Filter(){
        return isElementVisible(defaultLastYear,10);
    }

    public boolean validate_Custom_Filter(){
        return isElementVisible(defaultCustom,10);
    }

    public boolean validate_default_Purchase_Filter(){
        return isElementVisible(defaultPurchaseFilter,10);
    }

    public boolean validate_default_Account_Filter(){
        return isElementVisible(defaultAccountFilter,10);
    }

    public boolean validate_default_Sell_Filter(){
        return isElementVisible(defaultSellFilter,10);
    }
}
