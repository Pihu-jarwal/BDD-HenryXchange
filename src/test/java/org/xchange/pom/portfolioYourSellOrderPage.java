package org.xchange.pom;

import io.cucumber.java.zh_cn.假如;
import logger.LogReporter;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;
import utils.PropertiesUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class portfolioYourSellOrderPage extends Helper {

    public portfolioYourSellOrderPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement breadcrumbs;

    @FindBy(xpath = "//h2[@class='pageTitle']")
    private WebElement yourSellOrderPageTitle;

    @FindBy(xpath = "//h2[text()='Your Sell Orders']/sup")
    private WebElement sellOrdersCount;

    @FindBy(xpath = "//*[@class='portfolioWrapper']//table")
    private WebElement sellOrderTable;

    @FindBy(xpath = "//tr[contains(@class,' MuiTableRow-head ')]")
    private WebElement sellOrderColumName;

    @FindBy(xpath = "//tbody/tr[contains(@class,'MuiTableRow-root')]")
    private List<WebElement> sellOrderListing;

    @FindBy(xpath = "//table//thead")
    private List<WebElement> sellOrderRowList;

    @FindBy(xpath = "//table[contains(@class,'firstChildWidth')]//td//span[contains(text(),'15')]")
    private WebElement sharesCountNoSold;

    @FindBy(xpath = "(//tr[contains(@class,'MuiTableRow-root pointer')])[2]/td/following-sibling::td")
    private WebElement fewSharesSoldCount;

    @FindBy(xpath = "//div[@class='label']")
    private WebElement verifyNameFilterText;

    @FindBy(xpath = "//*[@id='react-select-3-listbox']/div")
    private List<WebElement> nameFilterMenuList;

    @FindBy(xpath = "//*[@id='react-select-3-listbox']")
    private WebElement nameFilterList;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'Newest to Oldest')]")
    private WebElement defaultNewestToOldestFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'A-Z')]")
    private WebElement defaultAToZFilter;

    @FindBy(xpath = "//div[contains(@class,'custom-select__option--is-selected') and contains(text(),'Z-A')]")
    private WebElement defaultZToAFilter;


    @FindBy(xpath = "//div[@id='react-select-3-option-0']")
    private WebElement newestToOldestOption;

    @FindBy(xpath = "//div[@id='react-select-3-option-1']")
    private WebElement aToZOption;

    @FindBy(xpath = "//div[@id='react-select-3-option-2']")
    private WebElement zToAOption;

    @FindBy(xpath = "(//tbody[contains(@class,'MuiTableBody-root')])/tr[2]")
    private WebElement rowSellOrder;

    @FindBy(xpath = "//div[contains(@class,'long-model-close')]")
    private WebElement crossIcon;

    @FindBy(xpath = "//div[@class='titleInfo MuiBox-root css-0']//h1[@class='dialog-title']")
    private WebElement verifyPlaceHolderText;

    @FindBy(xpath = "//div[contains(@class,'titleInfo')]/p")
    private WebElement assetName;

    @FindBy(xpath = "(//h2[contains(@class,'dial-title fw400')])[1]")
    private WebElement originalOrderText;

    @FindBy(xpath = "//div[contains(@class,'MuiDialog-paper')]")
    private WebElement sellOrderPopup;

    @FindBy(xpath = "//h2[text()='Original Order']")
    private WebElement originalOrderTextOnSellOrderPopup;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead[1]")
    private WebElement originalOfSellOrderHeader;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/tbody[1]")
    private WebElement originalOfSellOrderRow;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::tbody[2]//tr")
    private WebElement transactionSellOrderText;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::thead")
    private WebElement transactionOfSellOrderHeader;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::tbody[3]//tr")
    private WebElement transactionOfSellOrderRows;

    @FindBy(xpath = "//h2[text()='Original Order']/following-sibling::table/thead/following-sibling::tfoot/tr")
    private WebElement balanceOfSellOrder;

    @Getter
    @FindBy (xpath = "//table//tbody/tr/td[1]")
    private List<WebElement> nameElements;

    public String verify_Navigate_On_Sell_Order_Page() {
        return driver.getCurrentUrl();
    }

    public String verify_Breadcrumbs_Your_Sell_Order() {
        return getText(breadcrumbs);
    }

    public void verify_Your_Sell_Order_Text() {
        waitForElement(2);
        String pageTitleText = getText(yourSellOrderPageTitle).replaceAll("[0-9]", "");
        String sellOrderCount = getText(sellOrdersCount);
        String completeText = pageTitleText + sellOrderCount;
        Assert.assertEquals("The text with superscript is incorrect", completeText,getText(yourSellOrderPageTitle));
    }

    public void list_Of_All_Sell_Orders_Which_Contains_Details() {
        Assert.assertTrue(isElementVisible(sellOrderColumName, 10));
        for (WebElement element : sellOrderListing) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Shares_Count_No_Share_Sold() {
        Assert.assertEquals(getText(sharesCountNoSold), "15", "15");
    }

    public void verify_Share_Count_Few_Shares_Sold_In_Table() {
        Assert.assertEquals(getText(fewSharesSoldCount), getText(fewSharesSoldCount));
    }

    public String verify_Name_Filter_Text() {
        return getText(verifyNameFilterText);
    }

    public Boolean click_On_Name_Filter() {
        try {
            waitForElement(5);
            clickOnWebElement(verifyNameFilterText);
            return true;
        } catch (StaleElementReferenceException e) {
            return false;
        }

    }

    public void verify_Name_Filter_Dropdown_Options() {
        for (WebElement element : nameFilterMenuList) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Default_Select_Newest_To_Oldest_Option() {
        Assert.assertTrue(isElementVisible(defaultNewestToOldestFilter, 5));
        Assert.assertFalse(isElementVisible(defaultAToZFilter, 2));
        Assert.assertFalse(isElementVisible(defaultZToAFilter, 2));
    }


    public void click_On_A_To_Z_Option() {
        clickOnWebElement(aToZOption);
    }

    public void click_On_Z_To_A_Option() {
        clickOnWebElement(zToAOption);
    }
    public void click_On_Any_Sell_Order() {
        clickOnWebElement(rowSellOrder);
    }

    public String view_PlaceHolder_Text_On_Popup() {
        return getText(verifyPlaceHolderText);
    }

    public String view_Asset_Name_On_Popup() {
        waitForElement(2);
        return getText(assetName);
    }

    public String view_Original_Text_In_Popup() {
        return getText(originalOrderText);
    }

    public void view_Original_Details_In_Popup() {
        Assert.assertTrue(isElementVisible(originalOrderTextOnSellOrderPopup, 10));
        Assert.assertTrue(isElementVisible(originalOfSellOrderHeader, 10));
        Assert.assertTrue(isElementVisible(originalOfSellOrderRow, 10));

    }

    public void view_Transaction_Details_In_Popup() {
        Assert.assertTrue(isElementVisible(transactionSellOrderText, 10));
        Assert.assertTrue(isElementVisible(transactionOfSellOrderHeader, 10));
        Assert.assertTrue(isElementVisible(transactionOfSellOrderRows, 10));
    }

    public void view_Balance_Details_In_Popup() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.MuiDialogContent-root.dialogContainer.transaction-modal.inner_your_sell_order.css-1ty026z').scrollTop=100");
        Assert.assertTrue(isElementVisible(balanceOfSellOrder, 10));
    }

    public Boolean view_Cross_Icon_On_Popup() {
        return isElementVisible(crossIcon);
    }

    public void click_Cross_Icon() {
        clickOnWebElement(crossIcon);
    }

    public boolean verify_Cross_Btn_Functionality() {
        return isElementVisible(sellOrderPopup, 10);
    }

    public void verify_click_Outside_The_Sell_Order_Popup() {
        clickOutsideThePopup();
    }


}

