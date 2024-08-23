package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.xchange.pom.UsersPage;
import org.xchange.pom.portfolioYourSellOrderPage;
import utils.Helper;
import utils.PropertiesUtil;

import java.util.List;

public class portfolioYourSellOrderPageSteps extends Helper {
    portfolioYourSellOrderPage portfolioYourSellOrder = new portfolioYourSellOrderPage();

    UsersPage userPage = new UsersPage();


    @Then("User navigate on sell order page")
    public void userNavigateOnSellOrderPage() {
        Assert.assertEquals("User is not sell order page", PropertiesUtil.getEnvironmentKey("URL")+"portfolio/sellOrders",portfolioYourSellOrder.verify_Navigate_On_Sell_Order_Page());
    }

    @And("User verify the breadcrumbs on sell order page")
    public void userVerifyTheBreadcrumbsOnSellOrderPage() {
        Assert.assertNotEquals("Actual and unexpected value are matching","Portfolio", portfolioYourSellOrder.verify_Breadcrumbs_Your_Sell_Order());
    }

    @And("User verify the your sell orders text on sell order page")
    public void userVerifyTheYourSellOrdersTextOnSellOrderPage() {
        portfolioYourSellOrder.verify_Your_Sell_Order_Text();

    }

    @And("User verify the list name, shares, share price, gross total, platform fee, net total on sell order page")
    public void userVerifyTheListNameSharesSharePriceGrossTotalPlatformFeeNetTotalOnSellOrderPage() {
        portfolioYourSellOrder.list_Of_All_Sell_Orders_Which_Contains_Details();
    }

    @When("User click on any sell order on sell order page")
    public void userClickOnAnySellOrderOnSellOrderPage() {
        portfolioYourSellOrder.click_On_Any_Sell_Order();
    }

    @And("Verify user able to view the your sell orders popup on sell order page")
    public void verifyUserAbleToViewTheYourSellOrdersPopupOnPortfolioPage() {
        portfolioYourSellOrder.view_PlaceHolder_Text_On_Popup();
    }

    @And("User able to view placeholder text on your sell orders popup on sell order page")
    public void userAbleToViewPlaceholderTextOnYourSellOrdersPopupOnSellOrderPage() {
        Assert.assertEquals("Your Sell Orders",portfolioYourSellOrder.view_PlaceHolder_Text_On_Popup());
    }

    @And("User able to view Asset name on your sell orders popup on sell order page")
    public void userAbleToViewAssetNameOnYourSellOrdersPopupOnSellOrderPage() {
        Assert.assertEquals("Oakwood Sarasota",portfolioYourSellOrder.view_Asset_Name_On_Popup());
    }

    @And("User able to view original order details on your sell orders popup on sell order page")
    public void userAbleToViewOriginalOrderDetailsOnYourSellOrdersPopupOnSellOrderPage() {
        Assert.assertEquals("Original Order",portfolioYourSellOrder.view_Original_Text_In_Popup());
        portfolioYourSellOrder.view_Original_Details_In_Popup();
    }

    @And("User able to view Transactions details on your sell orders popup on sell order page")
    public void userAbleToViewTransactionsDetailsOnYourSellOrdersPopupOnSellOrderPage() {
        portfolioYourSellOrder.view_Transaction_Details_In_Popup();
    }

    @And("User able to view Balance details on your sell orders popup on sell order page")
    public void userAbleToViewBalanceDetailsOnYourSellOrdersPopupOnSellOrderPage() {
        portfolioYourSellOrder.view_Balance_Details_In_Popup();
    }

    @Then("User able to view cross icon on your sell orders popup on sell order page")
    public void userAbleToViewCrossIconOnYourSellOrdersPopupOnSellOrderPage() {
        Assert.assertTrue("Cross icon is not visible on your sell orders popup ",portfolioYourSellOrder.view_Cross_Icon_On_Popup());
    }

    @Then("User click on cross icon on your sell orders popup on sell order page")
    public void userClickOnCrossIconOnYourSellOrdersPopupOnSellOrderPage() {
        portfolioYourSellOrder.click_Cross_Icon();
    }

    @And("User verify the name filter on sell order page")
    public void userVerifyTheNameFilterOnSellOrderPage() {
        Assert.assertEquals("NAME",portfolioYourSellOrder.verify_Name_Filter_Text());
    }

    @When("User click on name filter on sell order page")
    public void userClickOnNameFilterOnSellOrderPage() {
        Assert.assertTrue("No name filter enabled", portfolioYourSellOrder.click_On_Name_Filter());
    }

    @Then("User verify the name filter dropdown option on sell order page")
    public void userVerifyTheNameFilterDropdownOptionOnSellOrderPage() {
        portfolioYourSellOrder.verify_Name_Filter_Dropdown_Options();
    }

    @And("User verify the default selected newest to oldest option on name filter dropdown in sell order page")
    public void userVerifyTheDefaultSelectedNewestToOldestOptionOnNameFilterDropdownInSellOrderPage() {
        portfolioYourSellOrder.verify_Default_Select_Newest_To_Oldest_Option();
    }

    @When("User click on A-Z option on name filter dropdown in sell order page")
    public void userClickOnAZOptionOnNameFilterDropdownInSellOrderPage() {
        portfolioYourSellOrder.click_On_A_To_Z_Option();
    }

    @Then("User verify the sorting list according to A-Z option on sell order page")
    public void userVerifyTheSortingListAccordingToAZOptionOnSellOrderPage() {
        List<WebElement> dataElement = portfolioYourSellOrder.getNameElements();
        String preValue = portfolioYourSellOrder.getText(dataElement.get(0));
        for (int i = 1; i < dataElement.size(); i++) {
            String nextValue = portfolioYourSellOrder.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in accessing order with prev row no: " + (i - 1),
                    isSorted(preValue, nextValue));
            preValue = nextValue;
        }
    }

    @And("User click on Z-A option on name filter dropdown in sell order page")
    public void userClickOnZAOptionOnNameFilterDropdownInSellOrderPage() {
        portfolioYourSellOrder.click_On_Z_To_A_Option();
    }

    @Then("User verify the sorting list according to Z-A option on sell order page")
    public void userVerifyTheSortingListAccordingToZAOptionOnSellOrderPage() {
        List<WebElement> dataElement = portfolioYourSellOrder.getNameElements();
        String preValue = portfolioYourSellOrder.getText(dataElement.get(0));
        for (int i = 1; i < dataElement.size(); i++) {
            String nextValue = portfolioYourSellOrder.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in reverse order with prev row no: " + (i - 1),
                    isReverseSorted(preValue, nextValue));
            preValue = nextValue;
        }
    }

    @And("User able to view shares count when no shares are sold on sell order page")
    public void userAbleToViewSharesCountWhenNoSharesAreSoldOnSellOrderPage() {
        portfolioYourSellOrder.verify_Shares_Count_No_Share_Sold();
    }

    @And("User verify the few shares are sold on sell order page")
    public void userVerifyTheFewSharesAreSoldOnSellOrderPage() {
        portfolioYourSellOrder.verify_Share_Count_Few_Shares_Sold_In_Table();
    }

    @Then("Verify that user able to close the Your Sell Orders Summary pop-up on sell order page")
    public void verifyThatUserAbleToCloseTheYourSellOrdersSummaryPopUpOnSellOrderPage() {
        Assert.assertFalse(portfolioYourSellOrder.verify_Cross_Btn_Functionality());
    }

    @Then("User able to click on outside the your sell orders popup on sell order page")
    public void userAbleToClickOnOutsideTheYourSellOrdersPopupOnSellOrderPage() {
        portfolioYourSellOrder.verify_click_Outside_The_Sell_Order_Popup();
    }
}
