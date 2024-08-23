package org.xchange.pom.tagent;

import java.util.List;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

@Getter
public class TransactionsPage extends Helper {
    public TransactionsPage () {
        PageFactory.initElements (driver, this);
    }

    private final By multipleSellerPlus = By.xpath ("//p[text()='+']");

    @FindBy (xpath = "//p[text()='Transactions']")
    private WebElement transactionPageHeading;

    @FindBy (css = ".FilterForTime__control")
    private WebElement filterByTime;

    @FindBy (css = ".FilterSearchField input")
    private WebElement searchText;

    @FindBy (xpath = "//div[text()='DATE']")
    private WebElement dateTableHeader;

    @FindBy (xpath = "//th[text()='TRANSACTION ID']")
    private WebElement transactionIdTableHeader;

    @FindBy (xpath = "//th[text()='PROPERTY']")
    private WebElement propertyTableHeader;

    @FindBy (xpath = "//th[text()='STATE']")
    private WebElement stateTableHeader;

    @FindBy (xpath = "//th[text()='SELLER']")
    private WebElement sellerTableHeader;

    @FindBy (xpath = "//th[text()='BUYER']")
    private WebElement buyerTableHeader;

    @FindBy (xpath = "//th[text()='TIME']")
    private WebElement timeTableHeader;

    @FindBy (xpath = "//th[text()='AMOUNT']")
    private WebElement amountTableHeader;

    @FindBy (xpath = "//table//tbody/tr")
    private List<WebElement> rowElements;

    @FindBy (xpath = "//div[contains(text(), 'Showing data')]")
    private WebElement paginationCount;

    @FindBy (xpath = "//nav[@aria-label='pagination navigation']/ul/li")
    private List<WebElement> pagesElements;

    @FindBy (xpath = "//table//tbody/tr/td[1]")
    private List<WebElement> dateCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[2]/div")
    private List<WebElement> transactionIdCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[4]")
    private List<WebElement> stateCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[5]")
    private List<WebElement> sellerCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[5]/div")
    private List<WebElement> sellerIdCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[6]")
    private List<WebElement> buyerCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[7]")
    private List<WebElement> timeCellElements;

    @FindBy (xpath = "//table//tbody/tr/td[8]")
    private List<WebElement> amountCellElements;

    @FindBy (css = "#react-select-2-listbox div")
    private List<WebElement> filterDropDown;

    @FindBy (css = "#react-select-2-option-5")
    private WebElement customFilter;

    @FindBy (css = "#react-select-2-option-0")
    private WebElement allTimeFilter;

    @FindBy (css = "input[placeholder='Select Date']")
    private List<WebElement> customDateSelectors;

    @FindBy (xpath = "//*[text()='Sort Ascending']")
    private WebElement ascendingDateOption;

    @FindBy (xpath = "//*[text()='Sort Descending']")
    private WebElement descendingDateOption;

    @FindBy (css = "input.FilterSearch")
    private WebElement searchTxtField;

    @FindBy (xpath = "//div[@role='tooltip']")
    private WebElement tooltipMultipleSeller;

    @FindBy (css = ".tooltipBox p:first-child")
    private WebElement tooltipSellerIDLabel;

    @FindBy (css = ".tooltipBox p:nth-child(2)")
    private WebElement tooltipSellerIDValue;

    @FindBy (css = "div.react-datepicker__month")
    private WebElement datePicker;

    @FindBy(css = "div.react-datepicker__month > div")
    private List<WebElement> monthRows;

    @FindBy(xpath = "//div[text()='No result found']")
    private WebElement noResultFoundLbl;

    public String getPageHeading () {
        return getText (transactionPageHeading);
    }

    public boolean isFilterByTimeDisplayed () {
        return isDisplayed (filterByTime);
    }

    public void clickFilterByTime () {
        clickOnWebElement (filterByTime);
        pause (1000);
    }

    public boolean isSearchTextDisplayed () {
        return isDisplayed (searchText);
    }

    public boolean isDateTableHeaderDisplayed () {
        return isDisplayed (dateTableHeader);
    }

    public void clickDateTableHeader () {
        clickOnWebElement (dateTableHeader);
        pause (500);
    }

    public boolean isTransactionIdTableHeaderDisplayed () {
        return isDisplayed (transactionIdTableHeader);
    }

    public boolean isPropertyTableHeaderDisplayed () {
        return isDisplayed (propertyTableHeader);
    }

    public boolean isStateTableHeaderDisplayed () {
        return isDisplayed (stateTableHeader);
    }

    public boolean isSellerTableHeaderDisplayed () {
        return isDisplayed (sellerTableHeader);
    }

    public boolean isBuyerTableHeaderDisplayed () {
        return isDisplayed (buyerTableHeader);
    }

    public boolean isTimeTableHeaderDisplayed () {
        return isDisplayed (timeTableHeader);
    }

    public boolean isAmountTableHeaderDisplayed () {
        return isDisplayed (amountTableHeader);
    }

    public boolean isPaginationCountDisplayed () {
        return isDisplayed (paginationCount);
    }

    public String getPaginationCount () {
        return getText (paginationCount);
    }

    public boolean isAscendingDateOptionDisplayed () {
        return isDisplayed (ascendingDateOption);
    }

    public void clickSortAscendingDateOption () {
        clickOnWebElement (ascendingDateOption);
        pause (1000);
    }

    public boolean isDescendingDateOptionDisplayed () {
        return isDisplayed (descendingDateOption);
    }

    public void clickSortDescendingDateOption () {
        clickOnWebElement (descendingDateOption);
        pause (1000);
    }

    public void enterIntoSearchField (String query) {
        sendKeys (searchTxtField, query);
        pause (1000);
    }

    public String getTooltipMultipleSellerAttr (String attribute) {
        return getAttribute (tooltipMultipleSeller, attribute);
    }

    public String getSellerIDLabelTooltip () {
        return getText (tooltipSellerIDLabel);
    }

    public String getSellerIDValueTooltip () {
        return getText (tooltipSellerIDValue);
    }

    public void clickCustomFilter () {
        clickOnWebElement (customFilter);
        pause (500);
    }

    public void clickAllTimeFilter() {
        clickOnWebElement(allTimeFilter);
        pause (500);
    }
}
