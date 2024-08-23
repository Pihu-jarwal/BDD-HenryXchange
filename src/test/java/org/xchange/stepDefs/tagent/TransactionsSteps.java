package org.xchange.stepDefs.tagent;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xchange.pom.tagent.TransactionsPage;
import utils.DataUtils;
import utils.DateUtil;
import utils.StringUtils;

public class TransactionsSteps {
    private        TransactionsPage transactionsPage;
    private static String           prevDate;
    private static String           currentDate;
    private        String           userName;
    private        String           transactionId;
    private        String           sellerId;
    private        String           buyerId;

    @And ("Verify user should navigate to the Transactions page.")
    public void verifyUserShouldNavigateToTheTransactionsPage () {
        transactionsPage = new TransactionsPage ();
        Assert.assertEquals (transactionsPage.getPageHeading (), "Transactions");
        Assert.assertTrue ("Transaction page filter by time not displayed",
            transactionsPage.isFilterByTimeDisplayed ());
        Assert.assertTrue ("Transaction page search field not displayed", transactionsPage.isSearchTextDisplayed ());
    }

    @And ("Verify user should see the following objects on the Transactions page.")
    public void verifyUserShouldSeeTheFollowingObjectsOnTheTransactionsPage () {
        transactionsPage = new TransactionsPage ();
        Assert.assertEquals (transactionsPage.getPageHeading (), "Transactions");
        Assert.assertTrue ("Transaction page filter by time not displayed",
            transactionsPage.isFilterByTimeDisplayed ());
        Assert.assertTrue ("Transaction page search field not displayed", transactionsPage.isSearchTextDisplayed ());
        Assert.assertTrue ("Transaction page date column header not displayed",
            transactionsPage.isDateTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page transaction id column header not displayed",
            transactionsPage.isTransactionIdTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page property column header not displayed",
            transactionsPage.isPropertyTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page state column header not displayed",
            transactionsPage.isStateTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page seller column header not displayed",
            transactionsPage.isSellerTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page buyer column header not displayed",
            transactionsPage.isBuyerTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page time column header not displayed",
            transactionsPage.isTimeTableHeaderDisplayed ());
        Assert.assertTrue ("Transaction page amount column header not displayed",
            transactionsPage.isAmountTableHeaderDisplayed ());
        Assert.assertTrue ("Transactions page table pagination count element not displayed.",
            transactionsPage.isPaginationCountDisplayed ());
        String paginationLabel = transactionsPage.getPaginationCount ();
        String[] pagination = paginationLabel.split ("\n");
        pagination = pagination[0].split ("of");
        int totalTransactionsCount = Integer.parseInt (pagination[1].trim ());
        pagination = paginationLabel.split ("to");
        pagination = pagination[1].split ("of");
        int txnsFirstPageCount = Integer.parseInt (pagination[0].trim ());
        if (totalTransactionsCount > 10) {
            Assert.assertEquals (txnsFirstPageCount, 10);
            Assert.assertEquals (transactionsPage.getRowElements ()
                .size (), 10);
            Assert.assertFalse (transactionsPage.getPagesElements ()
                .isEmpty ());
        } else if (totalTransactionsCount > 0) {
            Assert.assertTrue (txnsFirstPageCount > 0);
            Assert.assertEquals (transactionsPage.getRowElements ()
                .size (), txnsFirstPageCount);
            Assert.assertFalse (transactionsPage.getPagesElements ()
                .isEmpty ());
        }
    }

    @And ("Verify that all the transactions dates will be displayed in the date column are in the format {string}")
    public void verifyThatAllTheTransactionsDatesWillBeDisplayedInTheDateColumnAreInTheFormat (String dateFormat) {
        transactionsPage = new TransactionsPage ();
        int row = 1;
        for (WebElement element : transactionsPage.getDateCellElements ()) {
            String dateCellText = transactionsPage.getText (element);
            Assert.assertTrue ("Date in row no : " + row + " is not in the expected format i.e., : " + dateFormat,
                DateUtil.isDateInGivenFormat (dateCellText, dateFormat));
            row++;
        }
    }

    @And ("Verify that by default the transactions are ordered by the descending dates")
    public void verifyThatByDefaultTheTransactionsAreOrderedByTheDescendingDates () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> dateElements = transactionsPage.getDateCellElements ();
        String prevDate = transactionsPage.getText (dateElements.get (0));
        for (int i = 1; i < dateElements.size (); i++) {
            String nextDate = transactionsPage.getText (dateElements.get (i));
            Assert.assertTrue ("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                DateUtil.isInputDateOlderThanOutputDate (prevDate, nextDate, "MMM dd, yyyy"));
            prevDate = nextDate;
        }
    }

    @And ("Verify the date header drop-down options on the transactions page")
    public void verifyTheDateHeaderDropDownOptionsOnTheTransactionsPage () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickDateTableHeader ();
        Assert.assertTrue ("Sort Ascending date drop-down option not displayed.",
            transactionsPage.isAscendingDateOptionDisplayed ());
        Assert.assertTrue ("Sort Descending date drop-down option not displayed.",
            transactionsPage.isDescendingDateOptionDisplayed ());
    }

    @And ("Verify if the user selects the option as ascending in the date dropdown")
    public void verifyIfTheUserSelectsTheOptionAsAscendingInTheDateDropdown () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickSortAscendingDateOption ();
        List<WebElement> dateElements = transactionsPage.getDateCellElements ();
        String prevDate = transactionsPage.getText (dateElements.get (0));
        for (int i = 1; i < dateElements.size (); i++) {
            String nextDate = transactionsPage.getText (dateElements.get (i));
            Assert.assertTrue ("Date in row no : " + i + " is not in ascending order with prev row no: " + (i - 1),
                DateUtil.isInputDateNewerThanOutputDate (prevDate, nextDate, "MMM dd, yyyy"));
            prevDate = nextDate;
        }
    }

    @And ("Verify if the user selects the option as descending in the date dropdown")
    public void verifyIfTheUserSelectsTheOptionAsDescendingInTheDateDropdown () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickDateTableHeader ();
        transactionsPage.clickSortDescendingDateOption ();
        List<WebElement> dateElements = transactionsPage.getDateCellElements ();
        String prevDate = transactionsPage.getText (dateElements.get (0));
        for (int i = 1; i < dateElements.size (); i++) {
            String nextDate = transactionsPage.getText (dateElements.get (i));
            Assert.assertTrue ("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                DateUtil.isInputDateOlderThanOutputDate (prevDate, nextDate, "MMM dd, yyyy"));
            prevDate = nextDate;
        }
    }

    @And ("Verify if the user is able to see alphanumeric transaction ID.")
    public void verifyIfTheUserIsAbleToSeeAlphanumericTransactionID () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> transactionsIdElements = transactionsPage.getTransactionIdCellElements ();
        int row = 1;
        for (WebElement element : transactionsIdElements) {
            String transactionId = transactionsPage.getText (element);
            Assert.assertFalse ("Transaction Id id empty at row: " + row, transactionId.isEmpty ());
            Assert.assertTrue ("Transaction Id format is not correct at row: " + row,
                StringUtils.isAlphanumericWithHyphen (transactionId));
            row++;
        }
    }

    @And ("Verify that the valid state abbreviation displayed in the state column.")
    public void verifyThatTheValidStateAbbreviationDisplayedInTheStateColumn () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> stateElements = transactionsPage.getStateCellElements ();
        int row = 1;
        for (WebElement element : stateElements) {
            String state = transactionsPage.getText (element);
            Assert.assertTrue ("State abbreviation is not correct at row: " + row, StringUtils.isStateValid (state));
            row++;
        }
    }

    @And ("Verify that the valid seller should displayed in the seller column.")
    public void verifyThatTheValidSellerShouldDisplayedInTheSellerColumn () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> sellerCellElements = transactionsPage.getSellerCellElements ();
        int row = 1;
        for (WebElement element : sellerCellElements) {
            String sellerColumnText = transactionsPage.getText (element);
            String sellerName = sellerColumnText.split ("\n")[0].trim ();
            String sellerID = sellerColumnText.split ("\n")[1].trim ();
            Assert.assertFalse ("Seller name is empty for the transaction at row: " + row, sellerName.isEmpty ());
            Assert.assertTrue ("Seller name is alphanumeric for the transaction at row: " + row,
                StringUtils.isAlphanumericWithSpace (sellerName));
            Assert.assertTrue ("Seller ID is empty for the transaction at row: " + row,
                StringUtils.isAlphanumericWithHyphen (sellerID));
            Assert.assertFalse ("Seller ID is empty for the transaction at row: " + row, sellerID.isEmpty ());
            row++;
        }
    }

    @And ("Verify that if there are multiple sellers for a property with {string} on the Transactions page.")
    public void verifyThatIfThereAreMultipleSellersForAPropertyWithOnTheTransactionsPage (String propertyName) {
        transactionsPage = new TransactionsPage ();
        transactionsPage.enterIntoSearchField (propertyName);
        List<WebElement> sellerCellElements = transactionsPage.getSellerCellElements ();
        transactionsPage.pause (1000);
        for (int i = 0; i < sellerCellElements.size (); i++) {
            By locator = By.xpath ("(//table//tbody/tr/td[5])[" + (i + 1) + "]/p[text()='+']");
            List<WebElement> addSignElement = transactionsPage.findElements (locator);
            if (!addSignElement.isEmpty ()) {
                transactionsPage.pause (500);
                transactionsPage.mouseHover (addSignElement.get (0));
                transactionsPage.pause (500);
                String sellerIDLabel = transactionsPage.getSellerIDLabelTooltip ();
                sellerIDLabel = sellerIDLabel.replaceAll ("\\s+", " ");
                String sellerIDValue = transactionsPage.getSellerIDValueTooltip ();
                Assert.assertEquals ("Seller ID text not matched.", "Seller ID", sellerIDLabel);
                Assert.assertFalse ("Seller is not alphanumeric with hyphen.",
                    sellerIDValue.split ("\n")[0].isEmpty ());
                Assert.assertTrue ("Seller ID is not alphanumeric with hyphen.",
                    StringUtils.isAlphanumericWithHyphen (sellerIDValue.split ("\n")[1]));
                break;
            }
        }
    }

    @And ("Verify that the valid buyer should displayed in the buyer column.")
    public void verifyThatTheValidBuyerShouldDisplayedInTheBuyerColumn () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> buyerCellElements = transactionsPage.getBuyerCellElements ();
        int row = 1;
        for (WebElement element : buyerCellElements) {
            String buyerColumnText = transactionsPage.getText (element);
            String buyerName = buyerColumnText.split ("\n")[0].trim ();
            String buyerID = buyerColumnText.split ("\n")[1].trim ();
            Assert.assertFalse ("Buyer name is empty for the transaction at row: " + row, buyerName.isEmpty ());
            Assert.assertTrue ("Buyer name is alphanumeric for the transaction at row: " + row,
                StringUtils.isAlphanumericWithSpace (buyerName));
            Assert.assertTrue ("Buyer ID is empty for the transaction at row: " + row,
                StringUtils.isAlphanumericWithHyphen (buyerID));
            Assert.assertFalse ("Buyer ID is empty for the transaction at row: " + row, buyerID.isEmpty ());
            row++;
        }
    }

    @And ("Verify that the time is displaying in the format as {string} on the transaction page.")
    public void verifyThatTheTimeIsDisplayingInTheFormatAsOnTheTransactionPage (String timeFormat) {
        transactionsPage = new TransactionsPage ();
        List<WebElement> timeCellElements = transactionsPage.getTimeCellElements ();
        int row = 1;
        for (WebElement element : timeCellElements) {
            String time = transactionsPage.getText (element);
            Assert.assertTrue ("Time format is not correct at row: " + row,
                DateUtil.isDateInGivenFormat (time, timeFormat));
            row++;
        }
    }

    @And ("Verify that the amount should displayed in the amount column.")
    public void verifyThatTheAmountShouldDisplayedInTheAmountColumn () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> amountCellElements = transactionsPage.getAmountCellElements ();
        int row = 1;
        for (WebElement element : amountCellElements) {
            String amount = transactionsPage.getText (element);
            Assert.assertTrue ("Currency code is not displaying at row: " + row, amount.contains ("$"));
            Assert.assertTrue ("Amount is not a valid double value at row: " + row,
                StringUtils.isValidDouble (amount.replace ("$", "")));
            row++;
        }
    }

    @And ("Verify the filter drop-down options on the transactions page.")
    public void verifyTheFilterDropDownOptionsOnTheTransactionsPage () {
        transactionsPage = new TransactionsPage ();
        List<String> filters = DataUtils.loadTransactionsData ()
            .getFilters ();
        int entry = 0;
        transactionsPage.clickFilterByTime ();
        List<WebElement> filterByTimeOptions = transactionsPage.getFilterDropDown ();
        for (WebElement element : filterByTimeOptions) {
            String actOption = transactionsPage.getText (element);
            String expOption = filters.get (entry);
            Assert.assertEquals ("Options are not matched at position: " + entry, expOption, actOption);
            entry++;
        }
    }

    @And ("User click on the transaction by time drop-down.")
    public void userClickOnTheTransactionByTimeDropDown () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickFilterByTime ();
    }

    @And ("User selects the All Time option in the transaction by time drop-down.")
    public void userSelectsTheAllTimeOptionInTheTransactionByTimeDropDown () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickAllTimeFilter ();
    }

    @And ("User selects the custom option in the transaction by time drop-down.")
    public void userSelectsTheCustomOptionInTheTransactionByTimeDropDown () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickCustomFilter ();
    }

    @And ("Verify the custom time filter options on the transactions page.")
    public void verifyTheCustomTimeFilterOptionsOnTheTransactionsPage () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> customDateSelector = transactionsPage.getCustomDateSelectors ();
        int entry = 1;
        for (WebElement element : customDateSelector) {
            Assert.assertTrue ("Select custom dates input is not displayed at: " + entry,
                transactionsPage.isDisplayed (element));
            entry++;
        }
    }

    @Then ("User click on the select date From picker.")
    public void userClickOnTheSelectDateFromPicker () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickOnWebElement (transactionsPage.getCustomDateSelectors ()
            .get (0));
    }

    @Then ("User click on the select date To picker.")
    public void userClickOnTheSelectDateToPicker () {
        transactionsPage = new TransactionsPage ();
        transactionsPage.clickOnWebElement (transactionsPage.getCustomDateSelectors ()
            .get (1));
    }

    @And ("Verify that user is able select date from while custom option is selected.")
    public void verifyThatUserIsAbleSelectDateFromWhileCustomOptionIsSelected () {
        transactionsPage = new TransactionsPage ();
        Assert.assertTrue (transactionsPage.isDisplayed (transactionsPage.getDatePicker ()));
        List<WebElement> monthRowsElement = transactionsPage.getMonthRows ();
        Assert.assertFalse (monthRowsElement.isEmpty ());
        // Select current date in from date picker
        prevDate = DateUtil.getBeforeDateFromCurrentDate (1, "MMMM dd, yyyy");
        prevDate = prevDate.replace (",", "th,");
        // Initialize date selector dynamically.
        String dateSelector = "div.react-datepicker__month > div > div[aria-label*='" + prevDate + "']";
        // Click the date selector
        transactionsPage.clickOnWebElement (transactionsPage.findElement (By.cssSelector (dateSelector)));
        // Check whether date is selected or not
        String dateFrom = transactionsPage.getAttribute (transactionsPage.getCustomDateSelectors ()
            .get (0), "value");
        dateFrom = DateUtil.convertIntoSpecificDateFormat (dateFrom, "MMM dd, yyyy", "MMMM dd, yyyy");
        dateFrom = dateFrom.replace (",", "th,");
        Assert.assertEquals (prevDate, dateFrom);
    }

    @And ("Verify that user is able select date to while custom option is selected.")
    public void verifyThatUserIsAbleSelectDateToWhileCustomOptionIsSelected () {
        transactionsPage = new TransactionsPage ();
        Assert.assertTrue (transactionsPage.isDisplayed (transactionsPage.getDatePicker ()));
        List<WebElement> monthRowsElement = transactionsPage.getMonthRows ();
        Assert.assertFalse (monthRowsElement.isEmpty ());
        // Select current date in from date picker
        currentDate = DateUtil.getCurrentSystemDate ("MMMM dd, yyyy");
        currentDate = currentDate.replace (",", "th,");
        // Initialize date selector dynamically.
        String dateSelector = "div.react-datepicker__month > div > div[aria-label*='" + currentDate + "']";
        // Click the date selector
        transactionsPage.clickOnWebElement (transactionsPage.findElement (By.cssSelector (dateSelector)));
        // Check whether date is selected or not
        String dateFrom = transactionsPage.getAttribute (transactionsPage.getCustomDateSelectors ()
            .get (1), "value");
        dateFrom = DateUtil.convertIntoSpecificDateFormat (dateFrom, "MMM dd, yyyy", "MMMM dd, yyyy");
        dateFrom = dateFrom.replace (",", "th,");
        Assert.assertEquals (currentDate, dateFrom);
    }

    @And ("Verify that the app is filtering transactions between the custom date selections.")
    public void verifyThatTheAppIsFilteringTransactionsBetweenTheCustomDateSelections () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> dateCellElements = transactionsPage.getDateCellElements ();
        for (WebElement element : dateCellElements) {
            String actDate = transactionsPage.getText (element);
            actDate = DateUtil.convertIntoSpecificDateFormat (actDate, "MMM dd, yyyy", "MMMM dd, yyyy");
            prevDate = prevDate.replace ("th", "");
            currentDate = currentDate.replace ("th", "");
            Assert.assertTrue (DateUtil.isInputDateNewerThanOutputDate (prevDate, actDate, "MMMM dd, yyyy"));
            Assert.assertTrue (DateUtil.isInputDateOlderThanOutputDate (currentDate, actDate, "MMMM dd, yyyy"));
        }
    }

    @Then ("User search with the username as {string} on the transaction page.")
    public void userSearchWithTheUsernameAsOnTheTransactionPage (String userName) {
        transactionsPage = new TransactionsPage ();
        transactionsPage.enterIntoSearchField (userName);
        this.userName = userName;
    }

    @And ("Verify that the transactions got filtered on the basis of username searched.")
    public void verifyThatTheTransactionsGotFilteredOnTheBasisOfUsernameSearched () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> sellerColumns = transactionsPage.getSellerCellElements ();
        for (WebElement element : sellerColumns) {
            String actUserName = transactionsPage.getText (element)
                .split ("\n")[0];
            Assert.assertEquals (userName, actUserName);
        }
    }

    @Then ("User search with the Transaction Id on the transaction page.")
    public void userSearchWithTheTransactionIdOnTheTransactionPage () {
        transactionsPage = new TransactionsPage ();
        WebElement transactionsId = transactionsPage.getTransactionIdCellElements ()
            .get (0);
        this.transactionId = transactionsId.getText ();
        transactionsPage.enterIntoSearchField (this.transactionId);
    }

    @And ("Verify that the transactions got filtered on the basis of Transaction Id searched.")
    public void verifyThatTheTransactionsGotFilteredOnTheBasisOfTransactionIdSearched () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> transactionsColumns = transactionsPage.getTransactionIdCellElements ();
        for (WebElement element : transactionsColumns) {
            String actTransactionId = transactionsPage.getText (element);
            Assert.assertEquals (transactionId, actTransactionId);
        }
    }

    @Then ("User search with the Buyer Id on the transaction page.")
    public void userSearchWithTheBuyerIdOnTheTransactionPage () {
        transactionsPage = new TransactionsPage ();
        WebElement buyerId = transactionsPage.getBuyerCellElements ()
            .get (0);
        this.buyerId = buyerId.getText ().split ("\n")[1];
        transactionsPage.enterIntoSearchField (this.buyerId);
    }

    @Then ("User search with the Seller Id Id on the transaction page.")
    public void userSearchWithTheSellerIdIdOnTheTransactionPage () {
        transactionsPage = new TransactionsPage ();
        WebElement sellerId = transactionsPage.getSellerIdCellElements ()
            .get (0);
        this.sellerId = sellerId.getText ().split ("\n")[1];
        transactionsPage.enterIntoSearchField (this.sellerId);
    }

    @And ("Verify that the transactions got filtered on the basis of Buyer Id searched.")
    public void verifyThatTheTransactionsGotFilteredOnTheBasisOfBuyerIdSearched () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> buyerColumns = transactionsPage.getBuyerCellElements ();
        for (WebElement element : buyerColumns) {
            String actBuyerId = transactionsPage.getText (element).split ("\n")[1];
            Assert.assertEquals (buyerId, actBuyerId);
        }
    }

    @And ("Verify that the transactions got filtered on the basis of Seller Id searched.")
    public void verifyThatTheTransactionsGotFilteredOnTheBasisOfSellerIdSearched () {
        transactionsPage = new TransactionsPage ();
        List<WebElement> sellerColumns = transactionsPage.getSellerIdCellElements ();
        for (WebElement element : sellerColumns) {
            String actSellerId = transactionsPage.getText (element).split ("\n")[1];
            Assert.assertEquals (sellerId, actSellerId);
        }
    }
}
