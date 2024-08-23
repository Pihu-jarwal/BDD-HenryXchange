package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class PortfolioPage extends Helper {

    public PortfolioPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='text-graph']")
    private WebElement graphText;

    @FindBy(xpath = "(//div[contains(@class,'custom-select__indicator')])[2]")
    private WebElement sellNameFilter;

    @FindBy(xpath = "(//div[text()='NAME'])[1]")
    private WebElement investmentNameFilter;

    @FindBy(xpath = "//div[text()='A-Z']")
    private WebElement sortOrderAtoZ;

    @FindBy(xpath = "//div[text()='Z-A']")
    private WebElement sortOrderZtoA;

    @FindBy(xpath = "//div[@class='name-flex']")
    private List<WebElement> propertyName;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'Newest to Oldest')]")
    private WebElement defaultNewestToOldestFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'A-Z')]")
    private WebElement defaultAToZFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'Z-A')]")
    private WebElement defaultZToAFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option')]")
    private List<WebElement> dropdownOptionsOfFilters;

    @FindBy(xpath = "//div[@class='tooltip ml share-tip']")
    private WebElement sellOrderIcon;

    @FindBy(xpath = "//p[text()='Active Sell Order']")
    private WebElement activeSellOrder;

    @FindBy(xpath = "//button[contains(@class,'investment-disabled-button')]")
    private WebElement disabledSellButton;

    @FindBy(xpath = "//h2[text()='Your Sell Orders']/sup")
    private WebElement sellOrdersCount;

    @FindBy(xpath = "//h2[text()='Your Sell Orders']/following-sibling::div")
    private WebElement sellViewAllBtn;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement breadCrumbs;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root pointer ')]")
    private List<WebElement> sellOrderListing;

    @FindBy(xpath = "//tr[contains(@class,' MuiTableRow-head ')]")
    private WebElement sellColumName;

    @FindBy(xpath = "(//tr[contains(@class,'MuiTableRow-root pointer')])[1]")
    private WebElement sellOrder;

    @FindBy(xpath = "//div[contains(@class,'MuiDialogContent-root')]")
    private WebElement sellOrderPopup;

    @FindBy(xpath = "//div[text()='Newest to Oldest']")
    private WebElement newestToOldest;

    @FindBy(xpath = "//h1[text()='Your Sell Orders']/following-sibling::p")
    private WebElement sellOrderPropertyName;

    @FindBy(xpath = "//h2[contains(text(),'Original Order')]/following-sibling::table/thead/tr")
    private WebElement sellOrderHeaderValue;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::tbody/tr")
    private WebElement sellOriginOrder;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::tfoot/tr")
    private WebElement balanceOfSellOrder;

    @FindBy(xpath = "//div[contains(@class,'long-model-close')]")
    private WebElement closeBtn;

    @FindBy(xpath = "//h1[@class='page_title']")
    private WebElement portfolioPageTitle;

    @FindBy(xpath = "//h2[text()='Transactions']/following-sibling::div")
    private WebElement transactionViewAll;

    @FindBy(xpath = "//table[contains(@class,'transaction-table-unique')]/tbody/tr")
    private List<WebElement> transactionListCount;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement transactionBreadcrumb;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root')]")
    private List<WebElement> transactionListing;

    @FindBy(xpath = "//table[contains(@class,'transaction-table-unique')]/tbody/tr")
    private  List<WebElement> transactionCount;

    @FindBy(xpath = "//h3[text()='Account Value']/following-sibling::p")
    private WebElement accountValue;

    @FindBy(xpath = "//div[@class='portfolio-splitamount']/p")
    private List<WebElement> portfolioData;

    @FindBy(xpath = "//figure[@class='blur']")
    private WebElement blurGraph;

    @FindBy(xpath = "//figure[@class='blur']/following-sibling::div/button")
    private WebElement transferFunds;

    @FindBy(xpath = "//button[text()='Tax Documents']")
    private WebElement taxDocuments;

    @FindBy(xpath = "//button[text()='Transfer Funds']")
    private WebElement funds;

    @FindBy(xpath = "//div[@class=\"tooltip\"]")
    private WebElement destinationTooltip;

    @FindBy(xpath = "//div[@aria-labelledby='mui-2']")
    private WebElement getDestinationTooltip;

    @FindBy(xpath = "(//u[@class=\"dotted\"])[1]")
    private WebElement feeTooltip;

    @FindBy(xpath = "(//div[@class=\"tooltip bottom multiple\"]/div)[1]")
    private WebElement feeTooltipValue;

    @FindBy(xpath = "//button[text()='Portfolio ']")
    private WebElement portfolio;

    @FindBy(xpath = "//p[text()='Investments']/span")
    private WebElement investmentValue;

    @FindBy(xpath = "//p[text()='Cash']/span")
    private WebElement cashValue;

    @FindBy(xpath = "//p[text()='Crypto (USD)']/span")
    private WebElement cryptoValue;

    @FindBy(xpath = "//div[@class='filterIco atoz']")
    private WebElement filterAToZ;

    @FindBy(xpath = "//div[@class='filterIco ztoa']")
    private WebElement filterZToA;

    @FindBy(xpath = "//button[text()='MARKET']")
    private WebElement marketTab;

    @FindBy(xpath = "//h2[contains(text(),'Investments')]")
    private WebElement investment;

    @FindBy(xpath = "(//button[text()='Sell'])[1]")
    private WebElement sellBtn;

    @FindBy(xpath = "(//button[text()='Sell'])[1]")
    private WebElement sellBtnNoSharesSold;

    @FindBy(xpath = "((//tbody[contains(@class,'MuiTableBody-root')])[2]/tr[1]/td[7])//button[1]")
    private WebElement cancelButtonSellOrder;

    @FindBy(xpath = "//div[contains(@class,'basic-modal')]")
    private WebElement cancelSellOrderPopup;

    @FindBy(xpath = "//div[contains(@class,'basic-modal')]//h2")
    private WebElement headerTextCancelSellOrderPopup;

    @FindBy(xpath = "//div[contains(@class,'basic-modal')]//p")
    private WebElement subTextCancelSellOrderPopup;

    @FindBy(xpath = "//div[contains(@class,'common_btn')]/button[1]")
    private WebElement returnToPortfolioButtonCancelSellOrderPopup;

    @FindBy(xpath = "//div[contains(@class,'common_btn')]/button[2]")
    private WebElement yesWithdrawButtonCancelSellOrderPopup;

    @FindBy(xpath = "//div[contains(@id,'Your Sell Order has been successfully canceled')]")
    private WebElement toastMsgSellOrderCancel;

    @FindBy(xpath = "(//button[text()='Sell'])[2]")
    private WebElement sellBtnInvestProperty;

    @FindBy(xpath = "//h2[text()='Investments']/sup")
    private WebElement investmentCount;

    @FindBy(xpath = " //li[@class=\"MuiBreadcrumbs-li\"]//a[text() = 'Portfolio']")
    private WebElement portfolioBreadcrumb;

    static Integer beforeOrderCount = null;

    public String get_Graph_Text() {
        return getText(graphText);
    }

    public void click_On_Investment_Name_Filter() {
        clickOnWebElement(investmentNameFilter);
    }

    public boolean click_On_Sell_Name_Filter() {
        try {
            waitForElement(2);
            clickByAction(sellNameFilter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void validate_Dropdown_Options() {
        for (WebElement element : dropdownOptionsOfFilters) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void click_On_Sort_Order_A_To_Z() {
        clickOnWebElement(sortOrderAtoZ);
    }

    public boolean click_On_Sort_Order_Z_To_A() {
        try {
            clickOnWebElement(sortOrderZtoA);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void verify_The_Data_According_To_Sorting() {
        waitForElement(4);
        for (WebElement element : propertyName) {
            Assert.assertTrue(isElementVisible(element, 5));
        }
    }

    public void validate_Default_NewestTo_Oldest_Filter() {
        Assert.assertTrue("Default newest filter is not visible ", isElementVisible(defaultNewestToOldestFilter, 4));
        Assert.assertFalse("Default A to Z filter is visible", isElementVisible(defaultAToZFilter, 2));
        Assert.assertFalse("Default Z to A filter is visible", isElementVisible(defaultZToAFilter, 2));
    }

    public void click_On_Sell_Order_Icon() {
        clickByAction(sellOrderIcon);
    }

    public String validate_Active_Sell_Order() {
        return getText(activeSellOrder);
    }

    public Boolean verify_Sell_Button_Is_Not_Active() {
        return disabledSellButton.isDisplayed();
    }

    public void validate_Sell_Order_Count() {
        String sellCount = getText(sellOrdersCount);
        int count = Integer.parseInt(sellCount);
        Assert.assertTrue("Sell order count is less than 10", count > 10);
    }

    public void click_On_Sell_View_All_Button() {
        clickOnWebElement(sellViewAllBtn);
    }

    public String verify_Navigate_To_Sell_Order_Page() {
        return getText(breadCrumbs);
    }

    public void validate_Sell_Order_Listing() {
        waitForElement(2);
        Assert.assertTrue(isElementVisible(sellColumName, 10));
        for (WebElement element : sellOrderListing) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void click_On_Any_Sell_Order() {
        clickOnWebElement(sellOrder);
    }

    public boolean validate_Sell_Order_Popup() {
        return isElementVisible(sellOrderPopup, 10);
    }

    public void click_On_Newest_To_Oldest() {
        clickOnWebElement(newestToOldest);
    }

    public boolean verify_Asset_Name() {
        return isElementVisible(sellOrderPropertyName, 10);
    }

    public void verify_Listing_Of_Original_Order() {
        Assert.assertTrue("Sell order header value is not visible",isElementVisible(sellOrderHeaderValue, 10));
        Assert.assertTrue(isElementVisible(sellOriginOrder, 10));
        Assert.assertTrue(isElementVisible(balanceOfSellOrder, 10));
    }

    public boolean click_On_Cross_Btn() {
        try {
            clickOnWebElement(closeBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verify_Cross_Btn_Functionality() {
        return isElementVisible(sellOrderPopup, 10);
    }

    public void click_On_Transaction_View_All() {
        clickOnWebElement(transactionViewAll);
    }

    public String verify_Transaction_Breadcrumbs() {
        return getText(transactionBreadcrumb);
    }

    public void verify_Listing_Of_Transaction_Page() {
        for (int i = 0; i < transactionListing.size(); i++) {
            Assert.assertTrue(isElementVisible(transactionListing.get(i), 10));
        }
    }

    public boolean verify_Account_Value() {
        return isElementVisible(accountValue);
    }

    public String verify_Investment_Value() {
        return getText(investmentValue);
    }

    public String verify_Cash_Value() {
        return getText(cashValue);
    }

    public String verify_Crypto_Value() {
        return getText(cryptoValue);
    }


    public void verify_Account_Value_On_Portfolio_page() {
        for (int i = 0; i < portfolioData.size(); i++) {
            Assert.assertTrue(isElementVisible(portfolioData.get(i), 10));
        }
    }

    public boolean verify_Blur_Graph() {
        return blurGraph.isDisplayed();
    }

    public boolean verify_Transfer_Funds_Btn_Over_Graph() {
        return transferFunds.isDisplayed();
    }

    public boolean verify_Funds_Button() {
        return funds.isDisplayed();
    }

    public boolean verify_Tax_Documents() {
        return taxDocuments.isDisplayed();
    }

    public boolean verify_Tooltip_Of_Destination() {
        return isElementVisible(getDestinationTooltip, 10);
    }

    public void click_On_Tooltip_Of_Fee_Transaction_Tooltip() {
        clickByAction(feeTooltip);
    }

    public boolean verify_Tooltip_Of_Fee() {
        return feeTooltipValue.isDisplayed();
    }

    public String verify_Portfolio_Page() {
        return driver.getCurrentUrl();
    }

    public boolean validate_A_To_Z_Filter() {
        return isElementVisible(filterAToZ, 10);
    }

    public boolean validate_Z_To_A_Filter() {
        return isElementVisible(filterZToA, 10);
    }

    public void validate_View_ALl_Btn_Over_Transaction(){
        scrollByVisibilityOfElement(driver, sellViewAllBtn);
        for (int i=0; i<transactionListCount.size(); i++){
            int t=transactionListCount.size();
            Assert.assertTrue(t >= 10);
        }
    }


    public void click_On_Market_Tab() {
        clickOnWebElement(marketTab);
    }

    public void verify_View_Investment_Text() {
        waitForElement(2);
        Assert.assertTrue(isElementVisible(investment,10));
        String investmentText = investment.getText().replaceAll("[0-9]", "");
        String investmentCountNumber = investmentCount.getText();
        String completeText = investmentText + investmentCountNumber;
        Assert.assertEquals("The text with superscript is incorrect", completeText, investment.getText());
    }

    public void click_On_Sell_Button() {
        clickOnWebElement(sellBtn);
    }


    public void click_On_Cancel_Button_Sell_Order() {
        try {
            waitForElement(5);
            clickOnWebElement(cancelButtonSellOrder);
        } catch (StaleElementReferenceException e) {

        }
    }

    public boolean verify_Cancel_Order_Popup() {
        return isElementVisible(cancelSellOrderPopup);
    }

    public boolean view_Header_Text_On_Cancel_Order_Popup() {
        return isElementVisible(headerTextCancelSellOrderPopup);
    }

    public String view_SubText_On_Cancel_Order_Popup() {
        return getText(subTextCancelSellOrderPopup);
    }

    public boolean view_Return_To_Portfolio_Button_On_Cancel_Order_Popup() {
        return isElementVisible(returnToPortfolioButtonCancelSellOrderPopup);
    }

    public boolean view_Yes_Withdraw_Button_On_Cancel_Order_Popup() {
        return isElementVisible(yesWithdrawButtonCancelSellOrderPopup);
    }

    public void click_On_Return_To_Portfolio_Button_On_Cancel_Order_Popup() {
        clickOnWebElement(returnToPortfolioButtonCancelSellOrderPopup);
    }

    public boolean verify_Return_To_Portfolio_Btn_Functionality() {
        return isElementVisible(cancelSellOrderPopup, 10);
    }

    public void click_On_Yes_Withdraw_Button_On_Cancel_Order_Popup() {
        clickOnWebElement(yesWithdrawButtonCancelSellOrderPopup);
    }

    public String view_Toast_Msg_Sell_Order_Cancelled() {
        return getText(toastMsgSellOrderCancel);
    }

    public void click_Outside_Cancel_Sell_Order_Popup() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    public void click_On_Invest_Property_Sell_Button() {
        clickOnWebElement(sellBtnInvestProperty);
    }

    public void view_Sell_Order_List_Before_Cancel_Sell_Order() {
        beforeOrderCount = Integer.parseInt(getText(sellOrdersCount));
    }

    public void validate_Sell_Order_Canceled() {
        waitForElement(2);
        int afterOrderCancelCount = Integer.parseInt(getText(sellOrdersCount));
        Assert.assertEquals(beforeOrderCount - 1, afterOrderCancelCount);
    }

    public void click_On_Portfolio_Over_Breadcrumbs() {
        waitForElement(2);
        clickOnWebElement(portfolio);
    }

    public void click_On_Sell_Button_No_Shares_Sold_In_Property() {
        clickOnWebElement(sellBtnNoSharesSold);
    }
}
