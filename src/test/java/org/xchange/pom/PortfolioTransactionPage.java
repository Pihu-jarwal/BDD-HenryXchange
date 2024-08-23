package org.xchange.pom;

import com.github.javafaker.Bool;
import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.io.File;
import java.time.Duration;
import java.util.List;


public class PortfolioTransactionPage extends Helper {
    public PortfolioTransactionPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private List<WebElement> breadCrumbsPortfolioTransaction;

    @FindBy(xpath = "//tr[contains(@class,' MuiTableRow-head ')]")
    private WebElement transactionColumName;

    @FindBy(xpath = "//tbody/tr[contains(@class,'MuiTableRow-root')]")
    private List<WebElement> transactionListing;

    @FindBy(xpath = "//div[@class='custom-select__menu-list css-qr46ko']")
    private List<WebElement> dropdownList;

    @FindBy(xpath = "//*[@id='portfolio-container']/div[2]/div[2]/div/div[2]/h2")
    private WebElement pageTitleTransaction;

    @FindBy(xpath = "//div[contains(text(),'DATE')]")
    private WebElement date;

    @FindBy(xpath = "//div[@id='react-select-4-listbox']")
    private WebElement verifyDateDropdownList;

    @FindBy(xpath = "//div[@id='react-select-4-option-0']")
    private WebElement newestToOldest;

    @FindBy(xpath = "//div[contains(@class,'custom-select') and (text() = 'This Month')]")
    private WebElement thisMonthDropdown;

    @FindBy(xpath = "//div[text()='This Month']")
    private WebElement thisMonth;

    @FindBy(xpath = "(//div[contains(@class,'selectDropdown')])[1]")
    private WebElement defaultThisMonthFilter;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root')]/td")
    private List<WebElement> listingData;

    @FindBy(xpath = "//div[text() = 'Last Month']")
    private WebElement lastMonthOption;

    @FindBy(xpath = "//div[contains(@class,'no-data')]")
    private WebElement noDataAvailable;

    @FindBy(xpath = "//div[text() = 'This Year']")
    private WebElement thisYearOption;

    @FindBy(xpath = "//div[text() = 'Last Year']")
    private WebElement lastYearOption;

    @FindBy(xpath = "//div[text() = 'Custom']")
    private WebElement customOption;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement startSelectField;

    @FindBy(xpath = "//div[@aria-current=\"date\"]")
    private WebElement currentDate;

    @FindBy(xpath = "//div[contains(@class,'day--disabled')]")
    private WebElement disableDate;

    @FindBy(xpath = "//div[@class=\"react-datepicker\"]")
    private WebElement endDateCalendar;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> selectStartDate;

    @FindBy(xpath = "//p[contains(text(),'Jun 2023')]")
    private WebElement monthText;

    @FindBy(xpath = "//p[contains(text(),'May 2023')]")
    private WebElement mayMonth;

    @FindBy(xpath = "//div[@class='MuiBox-root css-110sbff']//div[1]//button[2]//*[name()='svg']")
    private WebElement calenderPreviousButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement endSelectField;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']//div[2]//button[1]//*[name()='svg']")
    private WebElement calenderNextButton;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> chooseEndDate;

    @FindBy(xpath = "//button[contains(@class,'exportBtn ')]")
    private WebElement exportButton;


    public String verify_Transaction_Page() {
        return getText(pageTitleTransaction);
    }

    public Boolean click_On_Date_For_Sorting() {
        try {
            waitForElement(2);
            clickOnWebElement(date);
            return true;
        } catch (StaleElementReferenceException e) {
            return false;
        }
    }

    public Boolean verify_Sorting_DateDropDown() {
        return isElementVisible(verifyDateDropdownList,10);
    }


    public void verify_The_List_Sorting_Newest_To_Oldest() {
        Assert.assertTrue(isElementVisible(transactionColumName, 10));
        for (WebElement element : transactionListing) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Breadcrumbs_Transaction_Page() {
        for (WebElement element : breadCrumbsPortfolioTransaction) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void list_Of_All_Transaction_Which_Contains_Details() {
        Assert.assertTrue(isElementVisible(transactionColumName, 10));
        for (WebElement element : transactionListing) {
            Assert.assertTrue(isElementVisible(element, 10));
        }

    }

    public void verify_This_Month_Set_By_Default() {
        Assert.assertTrue(isElementVisible(thisMonthDropdown, 2));
        Assert.assertFalse(isElementVisible(lastMonthOption, 1));
        Assert.assertFalse(isElementVisible(thisYearOption, 1));
        Assert.assertFalse(isElementVisible(lastYearOption, 1));
        Assert.assertFalse(isElementVisible(customOption, 1));
    }

    public void verify_Listing_Data_On_Transaction_Page() {
        waitForElement(2);
        for (WebElement element : listingData) {
            Assert.assertTrue(isElementVisible(element, 5));
        }
        Assert.assertFalse(isElementVisible(noDataAvailable, 5));
    }


    public Boolean verify_Last_Year_Listing_Data_On_Transaction_Page() {
        waitForElement(2);
        return isElementVisible(noDataAvailable, 10);
    }


    public void click_On_Default_Filter() {
        waitforElementClickable(defaultThisMonthFilter, 3);
        clickByAction(defaultThisMonthFilter);
    }

    public void click_This_Month_Dropdown_Filter() {
        clickOnWebElement(thisMonth);
    }

    public void verify_Dropdown_List() {
        for (WebElement element : dropdownList)
            Assert.assertTrue(isElementVisible(element));
    }

    public void click_Last_Month_Option() {
        clickOnWebElement(lastMonthOption);
        waitForElement(2);
    }

    public void click_This_Year_Option() {
        clickOnWebElement(thisYearOption);
    }

    public void click_Last_Year_Option() {
        clickOnWebElement(lastYearOption);
    }

    public void click_Custom_Option() {
        clickOnWebElement(customOption);
        waitForElement(2);
    }

    public void view_Start_Date_End_Date_Field() {
        Assert.assertTrue(isElementVisible(startSelectField,10));
        Assert.assertTrue(isElementVisible(endSelectField,10));
    }

    public void click_On_Select_Date() {
        clickByAction(startSelectField);
    }

    public boolean click_On_Current_Date() {
        clickOnWebElement(currentDate);
        return isElementVisible(disableDate, 5);
    }

    public boolean validate_End_Date_Calender() {
        return isElementVisible(endDateCalendar, 5);

    }

    public void select_Start_Date(String startDate) {
        date_Picker("Jun 2023", monthText, calenderPreviousButton);
        select_Date(startDate, selectStartDate);
    }

    public void select_End_Date(String endDate) {
        date_Picker("Jun 2023", monthText, calenderPreviousButton);
        select_Date(endDate, chooseEndDate);
    }

    public void select_Start_Date_No_Data_Available(String startDate) {
        date_Picker("May 2023", mayMonth, calenderPreviousButton);
        select_Date(startDate, selectStartDate);
    }


    public void select_End_Date_No_Data_Available(String endDate) {
        date_Picker("May 2023", mayMonth, calenderPreviousButton);
        select_Date(endDate, chooseEndDate);
    }

    public Boolean verify_No_Data_Available() {
        return isElementVisible(noDataAvailable);
    }

    public void click_Export_Button() {
        createDownloadFolder();
        clickOnWebElement(exportButton);
        waitForElement(10);
    }

    public void verify_Download_File() {
        waitForElement(5);
        validateDownloadedFile();
    }

    public Boolean view_Export_Button() {
        return isElementVisible(exportButton);
    }

}
