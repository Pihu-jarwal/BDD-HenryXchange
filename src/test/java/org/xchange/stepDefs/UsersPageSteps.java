package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.xchange.pom.*;
import utils.DateUtil;
import utils.Helper;
import utils.PropertiesUtil;

import java.util.List;

import static utils.DateUtil.isDateInSpecifiedRange;

public class UsersPageSteps extends Helper {
    UsersPage userPage = new UsersPage();

    MyAccountPage myAccount = new MyAccountPage();

    LoginPage loginPage = new LoginPage();

    portfolioYourSellOrderPage portfolioYourSellOrder = new portfolioYourSellOrderPage();

    TransferAgentLoginPage transferAgentLoginPage = new TransferAgentLoginPage();


    @Then("Verify user should be able to navigate to Users page")
    public void verifyUserShouldBeAbleToNavigateToUsersPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("TAURl") + "users", myAccount.verify_Navigate_To_Kyc_Page());
    }

    @And("User click on User tab at side bar")
    public void userClickOnUserTabAtSideBar() {
        userPage.click_On_User_Tab();
    }

    @And("User click on name label on user page")
    public void userClickOnNameLabelOnUserPage() {
        transferAgentLoginPage.click_On_Name_Label();
    }

    @Then("Verify user able to view name column options on user page")
    public void verifyUserAbleToViewNameColumnOptionsOnUserPage() {
        transferAgentLoginPage.verify_Name_Label_options();
    }

    @And("Verify by default Sort Ascending \\(A-Z) is selected on user page")
    public void verifyByDefaultSortAscendingAZIsSelectedOnUserPage() {
        Assert.assertTrue("A to Z listing is not visible", userPage.verify_A_To_Z_Filter_Selected());
    }

    @And("User click on sort ascending \\(A-Z) option over name label on user page")
    public void userClickOnSortAscendingAZOptionOverNameLabelOnUserPage() {
        userPage.click_On_A_To_Z_Option();
    }


    @Then("Verify user should be able to view list ascending in a order on user page")
    public void verifyUserShouldBeAbleToViewListInAToZAlphabeticalOrderOnUserPage() {
        List<WebElement> dateElements = transferAgentLoginPage.getDateCellElements();
        String prevDate = transferAgentLoginPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = transferAgentLoginPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in ascending order with prev row no: " + (i - 1),
                    DateUtil.isNextDateNewerThanPrevDate(prevDate, nextDate, "MMM dd, yyyy"));
            prevDate = nextDate;
        }
    }

    @And("User click on sort descending \\(Z-A) option over name label on user page")
    public void userClickOnSortAscendingZAOptionOverNameLabelOnUserPage() {
        userPage.click_On_Z_To_A_Option();
    }

    @Then("Verify user should be able to view list in Descending order on user page")
    public void verifyUserShouldBeAbleToViewListInZToAAlphabeticalOrderOnUserPage() {
        List<WebElement> dateElements = transferAgentLoginPage.getDateCellElements();
        String prevDate = transferAgentLoginPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = transferAgentLoginPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                    DateUtil.isNextDateOlderThanPrevDate(prevDate, nextDate, "MMM dd, yyyy"));
            prevDate = nextDate;
        }
    }

    @And("User click on user since label on user page")
    public void userClickOnUserSinceLabelOnUserPage() {
        userPage.click_On_User_Since();
    }

    @And("User click on sort ascending option over user since label on user page")
    public void userClickOnSortAscendingAZOptionOverUserSinceLabelOnUserPage() {
        userPage.click_On_User_Since_A_To_Z_Option();
    }

    @And("User click on sort Descending option over user since label on user page")
    public void userClickOnSortAscendingZAOptionOverUserSinceLabelOnUserPage() {
        userPage.click_On_User_Since_Z_To_A_Option();
    }

    @Then("Verify user should be able to view Email column with register email on user page")
    public void verifyUserShouldBeAbleToViewEmailColumnWithRegisterEmailOnUserPage() {
        userPage.verify_Email_Column();
    }

    @Then("Verify user should be able to view mobile number column with register email on user page")
    public void verifyUserShouldBeAbleToViewMobileNumberColumnWithRegisterEmailOnUserPage() {
        userPage.verify_Mobile_Number_Column();
    }

    @Then("Verify user should be able to view {string} special character in mobile number field on user page")
    public void verifyUserShouldBeAbleToViewSpecialCharacterOnUserPage(String specialCharacter) {
        Assert.assertEquals("Special character is not displayed",specialCharacter, userPage.verify_Kyc_Process_Is_Not_Done(specialCharacter));
    }

    @Then("Verify user should be able to view {string} special character in entities value on user page")
    public void verifyUserShouldBeAbleToViewSpecialCharacterInEntitiesValueOnUserPage(String specialCharacter) {
       Assert.assertEquals("Special character is not displayed",specialCharacter,userPage.verify_Entities_Value(specialCharacter) );
    }

    @Then("Verify user should be able to view Unique user ID on user page")
    public void verifyUserShouldBeAbleToViewUniqueUserIDOnUserPage() {
        List<WebElement> dataElement = userPage.getUserID();
        String prevID = userPage.getText(dataElement.get(0));
        for (int i = 1; i < dataElement.size(); i++) {
            String nextID = userPage.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not unique ID with prev row no: " + (i - 1),
                    DateUtil.isUserIDUnique(prevID, nextID));
            prevID = nextID;
        }
    }

    @And("User click on Levels dropdown on users page")
    public void userClickOnLevelsDropdownOnUsersPage() {
        userPage.click_On_Levels_Dropdown();
    }

    @Then("Verify user should be able to view sorting option of Levels dropdown on users page")
    public void verifyUserShouldBeAbleToViewSortingOptionOfLevelsDropdownOnUsersPage() {
        transferAgentLoginPage.verify_Name_Label_options();
    }

    @And("User click on sort ascending option over Levels label on user page")
    public void userClickOnSortAscendingAZOptionOverLevelsLabelOnUserPage() {
        userPage.click_On_A_To_Z_Option();
    }

    @And("User click on sort descending option over Levels label label on user page")
    public void userClickOnSortAscendingZAOptionOverLevelsLabelLabelOnUserPage() {
        userPage.click_On_Z_To_A_Option();
    }

    @And("user click on Last login dropdown on users page")
    public void userClickOnLastLoginDropdownOnUsersPage() {
        userPage.click_on_Last_Login();
    }

    @And("User click on sort ascending option over Last login label on user page")
    public void userClickOnSortAscendingAZOptionOverLastLoginLabelOnUserPage() {
        userPage.click_On_A_To_Z_Option();
    }

    @And("User click on sort descending option over Last login label on user page")
    public void userClickOnSortAscendingZAOptionOverLastLoginLabelOnUserPage() {
        userPage.click_On_Z_To_A_Option();
    }

    @Then("Verify user should be able to view search field on user page")
    public void verifyUserShouldBeAbleToViewSearchFieldOnUserPage() {
        Assert.assertTrue("Search field is not visible", userPage.is_Search_Field_Visible());
    }

    @And("User enter {string} in search input field on user page")
    public void userEnterInSearchInputFieldOnUserPage(String searchData) {
        userPage.enter_Search_Field_Data(searchData);
    }

    @Then("Verify user should be able to view placeholder text on user page")
    public void verifyUserShouldBeAbleToViewPlaceholderTextOnUserPage() {
        Assert.assertTrue("Matching result is not visible", userPage.is_Showing_Matching_Result_Visible());
    }


    @And("user click on user detail row on users page")
    public void userClickOnUserDetailRowOnUsersPage() {
        userPage.click_On_User_Detail_Row();
    }

    @Then("Verify user should be able to navigate to User details page")
    public void verifyUserShouldBeAbleToNavigateToUserDetailsPage() {
        Assert.assertTrue("User detail page is not visible", userPage.is_User_Detail_Page_Visible());
    }

    @Then("Verify user able to view name of user on user detail page")
    public void verifyUserAbleToViewNameOfUserOnUsersPage() {
        Assert.assertTrue("User name is not visible", userPage.verify_User_Name());
    }

    @And("Verify user able to view Registered Email of the User on user detail page")
    public void verifyUserAbleToViewRegisteredEmailOfTheUserOnUsersPage() {
        Assert.assertTrue("User email is not visible", userPage.verify_User_Email());
    }

    @And("Verify user able to view Registered mobile number {string} of User on user detail page")
    public void verifyUserAbleToViewRegisteredMobileNumberOfUserOnUsersPage(String mobileNUmber) {
        Assert.assertNotEquals("Mobile number is not visible", mobileNUmber, userPage.verify_User_Mobile_Number());
    }

    @And("Verify user able to view user's full SSN value {string} of User on user detail page")
    public void verifyUserAbleToViewUserSFullSSNValueOfUserOnUsersPage(String ssnValue) {
        Assert.assertNotEquals("SSN value is not visible", ssnValue, userPage.verify_User_SSN_Value());
    }

    @And("Verify user able to view user's full address {string} of User on user detail page")
    public void verifyUserAbleToViewUserSFullAddressOfUserOnUsersPage(String address) {
        Assert.assertNotEquals("Address is not visible", address, userPage.verify_User_Address());
    }

    @And("Verify user able to view User ID of User on user detail page")
    public void verifyUserAbleToViewUserIDOfUserOnUsersPage() {
        Assert.assertTrue("User ID is not visible", userPage.verify_User_ID());
    }

    @Then("Verify Segment tabs on user detail page on users page")
    public void verifySegmentTabsOnUserDetailPageOnUsersPage() {
        userPage.verify_Segment_Tabs();
    }

    @And("Verify user able to view user detail tab highlighted on user detail page")
    public void verifyUserAbleToViewUserDetailTabHighlightedOnUserDetailPage() {
        Assert.assertTrue("User detail tab is not highlighted", userPage.is_User_Detail_Tab_Highlighted());
    }

    @And("Verify user able to view breadcrumbs on user detail page")
    public void verifyUserAbleToViewBreadcrumbsOnUserDetailPage() {
        Assert.assertTrue("Bread crumbs is not visible", userPage.is_Bread_Crumbs_Visible());
    }

    @Then("Verify user able to view DOB {string} of the user detail page")
    public void verifyUserAbleToViewDOBOfTheUserDetailPage(String DOB) {
        Assert.assertNotEquals("date of birth is not visible", DOB,userPage.is_Date_Of_Birth_Visible());
    }

    @Then("Verify user able to view Sub text {string} on user detail page")
    public void verifyUserAbleToViewSubTextOUserDetailPage(String linkedAccount) {
        Assert.assertEquals("External linked text is not visible", linkedAccount, userPage.verify_External_Linked_Account());
    }

    @And("Verify user able to view sub-text {string} on user detail page")
    public void verifyUserAbleToViewSubTextOnUserDetailPage(String entitiesLinkedText) {
        Assert.assertEquals("Entities linked text is not visible", entitiesLinkedText, userPage.verify_Linked_Entities_Account());

    }

    @And("User click on investment section on user detail page")
    public void userClickOnInvestmentSectionOnUserDetailPage() {
        userPage.click_On_Investments_Section();
    }

    @Then("Verify user should be able to view Investment page")
    public void verifyUserShouldBeAbleToViewInvestmentPage() {
        Assert.assertTrue("Investment page is not visible", userPage.verify_Investment_Page());

    }

    @And("User search the email {string} in search input field on users page")
    public void userSearchTheEmailInSearchInputFieldOnUsersPage(String email) {
        userPage.enter_Email_In_Search_Field(email);
    }

    @When("User click on name label on user detail page")
    public void userClickOnNameLabelOnUserDetailPage() {
        transferAgentLoginPage.click_On_Name_Label();

    }

    @Then("Verify user able to view name column options on user detail page")
    public void verifyUserAbleToViewNameColumnOptionsOnUserDetailPage() {
        transferAgentLoginPage.verify_Name_Label_options();
    }

    @And("User click on sort ascending A-Z option over user name label on user detail page")
    public void userClickOnSortAscendingAZOptionOverUserNameLabelOnUserDetailPage() {
        userPage.click_On_A_To_Z_Option();
    }

    @Then("Verify user should be able to view list in A to Z alphabetical order on user detail page")
    public void verifyUserShouldBeAbleToViewListInAToZAlphabeticalOrderOnUserDetailPage() {
        List<WebElement> dataElement = userPage.getNameColumnValue();
        String preValue = userPage.getText(dataElement.get(0));
        for(int i=1; i<dataElement.size(); i++){
            String nextValue = getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in ascending order with prev row no: " + (i - 1),
                    isSorted(preValue, nextValue));
            preValue = nextValue;
        }
    }

    @And("User click on sort descending \\(Z-A) option over name label on user detail page")
    public void userClickOnSortAscendingZAOptionOverNameLabelOnUserDetailPage() {
        userPage.click_On_Z_To_A_Option();

    }

    @Then("Verify user should be able to view list in z to A alphabetical order on user detail page")
    public void verifyUserShouldBeAbleToViewListInZToAAlphabeticalOrderOnUserDetailPage() {
        List<WebElement> dataElement = userPage.getNameColumnValue();
        String preValue = userPage.getText(dataElement.get(0));
        for(int i=1; i<dataElement.size(); i++){
            String nextValue = userPage.getText(dataElement.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                    isReverseSorted(preValue, nextValue));
            preValue = nextValue;
        }

    }

    @And("User click on Transactions tab on user page")
    public void userClickOnTransactionsTabOnUserPage() {
        userPage.click_On_Transaction_Tab();
    }

    @Then("Verify user should be able to view Transaction page")
    public void verifyUserShouldBeAbleToViewTransactionPage() {
        Assert.assertEquals("Login page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "transactions", loginPage.verify_Login_Screen());
    }

    @Then("User click on Time sorting filter on transaction page")
    public void userClickOnAllTimeFilterOnTransactionPage() {
        userPage.click_On_All_Time_Filter_Option();
    }

    @Then("Verify user able to view option of Time sorting option on transaction page")
    public void verifyUserAbleToViewOptionOfTimeSortingOptionOnTransactionPage() {
        Assert.assertTrue("Filter option is not visible", userPage.verify_Filter_Options());
    }

    @And("User click on All Time option over time sorting filter on transaction page")
    public void userClickOnAllTimeOptionOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_All_Time_Option();
    }

    @Then("Verify user able to view All time transaction listing on transaction page")
    public void verifyUserAbleToViewAllTimeTransactionListingOnTransactionPage() {
        Assert.assertTrue("This month filter is not visible", userPage.is_This_Month_Option_Visible());

    }

    @And("User click on This Month filter over time sorting filter on transaction page")
    public void userClickOnThisMonthFilterOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_This_Month_option();
    }

    @Then("Verify User should be able to view Current month transaction listing on transaction page")
    public void verifyUserShouldBeAbleToViewCurrentMonthTransactionListingOnTransactionPage() {
        Assert.assertTrue("Current month is not visible", DateUtil.isGivenDateIsOfCurrentMonth(userPage.verify_This_Month_Listing(), "MMM dd, yyyy"));
    }

    @And("User click on This Year filter over time sorting filter on transaction page")
    public void userClickOnThisYearFilterOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_This_Year_Filter();
    }

    @Then("Verify User should be able to view This year transaction listing on transaction page")
    public void verifyUserShouldBeAbleToViewThisYearTransactionListingOnTransactionPage() {
        Assert.assertTrue("This year is not visible", DateUtil.isGivenDateOfThisYear(userPage.verify_This_Month_Listing(), "MMM dd, yyyy"));
    }

    @And("User click on Last Month filter over time sorting filter on transaction page")
    public void userClickOnLastMonthFilterOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_Last_Month_Filter();
    }

    @Then("Verify User should be able to view Last Month transaction listing on transaction page")
    public void verifyUserShouldBeAbleToViewLastMonthTransactionListingOnTransactionPage() {
        Assert.assertTrue("Last month is not visible", DateUtil.isGivenDateOfLastMonth(userPage.verify_This_Month_Listing(), "MMM dd, yyyy"));
    }

    @And("User click on Last Year filter over time sorting filter on transaction page")
    public void userClickOnLastYearFilterOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_Last_Year_Filter();
    }

    @Then("Verify User should be able to view Last Year transaction listing on transaction page")
    public void verifyUserShouldBeAbleToViewLastYearTransactionListingOnTransactionPage() {
        Assert.assertTrue("Last year is not visible", DateUtil.isGivenDateOfLastYear(userPage.verify_This_Month_Listing(), "MMM dd, yyyy"));

    }

    @And("User click on custom filter over time sorting filter on transaction page")
    public void userClickOnCustomFilterOverTimeSortingFilterOnTransactionPage() {
        userPage.click_On_Custom_Filter();
    }

    @Then("Verify User should be able to view custom date range transaction listing on transaction page")
    public void verifyUserShouldBeAbleToViewCustomDateRangeTransactionListingOnTransactionPage() {
        Assert.assertTrue("Date is not in range", isDateInSpecifiedRange(userPage.verify_Date_In_Range(), userPage.get_Selected_Start_Date(), userPage.get_Selected_End_Date()));
    }

    @And("User click on select date over of custom filter on time sorting filter on transaction page")
    public void userClickOnStartDateOverOfCustomFilterOnTimeSortingFilterOnTransactionPage() {
        userPage.click_On_Select_Date();
    }

    @And("User click on End date over of custom filter on time sorting filter on transaction page")
    public void userClickOnEndDateOverOfCustomFilterOnTimeSortingFilterOnTransactionPage() {
        userPage.click_On_End_Date();
    }

    @And("User click on start date over of custom filter on time sorting filter on transaction page")
    public void userClickOnStartDateOverOfCustomFilterOnTimeSortingFilterOnTransactionPag() {
        userPage.click_On_Start_Date();
    }

    @Then("Verify user should be able to view Date Picker on transaction page")
    public void verifyUserShouldBeAbleToViewDatePickerOnTransactionPage() {
        Assert.assertTrue("Date picker is not visible", userPage.is_Date_Picker_Visible());
    }

    @Then("Verify user should be able to view selected date on transaction page")
    public void verifyUserShouldBeAbleToViewSelectedDateOnTransactionPage() {
        Assert.assertFalse("Selected date is not visible", userPage.get_Selected_Start_Date().isEmpty());
    }

    @And("User enter Transaction ID in search input field on transaction page")
    public void userEnterTransactionIDInSearchInputFieldOnTransactionPage() {
        userPage.enter_Transaction_ID_In_Search_Field();
    }

    @Then("Verify user able to view matching result in transaction listing on transaction page")
    public void verifyUserAbleToViewMatchingResultInTransactionListingOnTransactionPage() {
        Assert.assertEquals("Matching count is mismatching", userPage.get_Listing_Count(), userPage.get_Showing_Matching_Count());
        Assert.assertEquals("Both value are different", userPage.get_Search_Field_Value(), userPage.get_Transaction_ID());
    }

    @And("User enter wrong property name {string} in search input field on transaction page")
    public void userEnterPropertyNameInSearchInputFieldOnTransactionPage(String propertyName) {
        userPage.enter_Property_Name_In_Search_Field(propertyName);
    }

    @Then("Verify User able to view {string} in transaction listing on transaction page")
    public void verifyUserAbleToViewInTransactionListingOnTransactionPage(String noResultFoundText) {
        Assert.assertEquals("No result data is no visible", noResultFoundText, userPage.verify_No_Result_Found());
    }

    @When("User enter wrong Transaction ID {string} in search input field on transaction page")
    public void userEnterWrongTransactionIDInSearchInputFieldOnTransactionPage(String transactionID) {
        userPage.enter_Property_Name_In_Search_Field(transactionID);
    }

    @When("User hover copy icon over transaction ID on transaction page")
    public void userHoverCopyIconOverTransactionIDOnTransactionPage() {
        userPage.hover_On_Copy_Icon();
    }

    @Then("Verify user able to view tooltip with copy text on transaction page")
    public void verifyUserAbleToViewTooltipWithCopyTextAndCopiedOnTransactionPage() {
        Assert.assertTrue("Tool tip is not visible", userPage.is_Copied_Tool_Tip_Visible());
    }

    @Then("Verify user should be able to view Transaction Details page")
    public void verifyUserShouldBeAbleToViewTransactionDetailsPage() {
        Assert.assertEquals("Both the URl are mismatched", PropertiesUtil.getEnvironmentKey("TAURl") + "transactions" + "details", loginPage.verify_Login_Screen());
    }

    @And("User click on transaction listing row on transaction page")
    public void userClickOnTransactionListingRowOnTransactionPage() {
        userPage.click_On_Transaction_List_Row();
    }

    @And("User click on print button on Transaction Details page")
    public void userClickOnPrintButtonOnTransactionDetailsPage() {
        userPage.click_On_Print_Button();
    }

    @Then("Verify user should be able to print full page")
    public void verifyUserShouldBeAbleToPrintFullPage() {
        Assert.assertTrue("Print PDF is not visible", userPage.verify_Print_PDF());
    }

    @Then("Verify user should be able to view list ascending order according to level on user page")
    public void verifyUserShouldBeAbleToViewListAscendingOrderAccordingToLevelOnUserPage() {
        List<WebElement> dateElements = userPage.getLevelsData();
        waitForElement(1);
        String prevDate = userPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = userPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in ascending order with prev row no: " + (i - 1),
                    DateUtil.isNextNumberGreaterOrEqual(prevDate, nextDate));
            prevDate = nextDate;
        }
    }

    @Then("Verify user should be able to view list descending order according to level on user page")
    public void verifyUserShouldBeAbleToViewListDescendingOrderAccordingToLevelOnUserPage() {
        List<WebElement> dateElements = userPage.getLevelsData();
        waitForElement(1);
        String prevDate = userPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = userPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                    DateUtil.isNextNumberLessOrEqual(prevDate, nextDate));
            prevDate = nextDate;
        }
    }

    @Then("Verify user able to view list in ascending order according to last login  on user page")
    public void verifyUserAbleToViewListInAscendingOrderAccordingToLastLoginOnUserPage() {
        List<WebElement> dateElements = userPage.getLastLoginCellDate();
        waitForElement(1);
        String prevDate = userPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = userPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in ascending order with prev row no: " + (i - 1),
                    DateUtil.isNextDateNewerThanPrevDate(prevDate, nextDate, "MMM dd, yyyy"));
            LogReporter.INFO("prev date" + prevDate);
            LogReporter.INFO("Next date" + nextDate);
            prevDate = nextDate;
        }
    }

    @Then("Verify user able to view list in descending order according to last login  on user page")
    public void verifyUserAbleToViewListInDescendingOrderAccordingToLastLoginOnUserPage() {
        List<WebElement> dateElements = userPage.getLastLoginCellDate();
        waitForElement(1);
        String prevDate = userPage.getText(dateElements.get(0));
        for (int i = 1; i < dateElements.size(); i++) {
            String nextDate = userPage.getText(dateElements.get(i));
            Assert.assertTrue("Date in row no : " + i + " is not in descending order with prev row no: " + (i - 1),
                    DateUtil.isNextDateOlderThanPrevDate(prevDate, nextDate, "MMM dd, yyyy"));
            LogReporter.INFO("prev date" + prevDate);
            LogReporter.INFO("Next date" + nextDate);
            prevDate = nextDate;
        }
    }


    @And("User click on Transaction section on user detail page")
    public void userClickOnTransactionSectionOnUserDetailPage() {
        userPage.click_On_Transaction_Section();
    }

    @And("User click on By filter in Transaction section on user detail page")
    public void userClickOnByFilterInTransactionSectionOnUserDetailPage() {
        userPage.click_On_By_Filter();
    }

    @Then("Verify user should be able to view By filter options on user detail page")
    public void verifyUserShouldBeAbleToViewByFilterOptionsOnUserDetailPage() {
        Assert.assertTrue("Filter option is not visible", userPage.verify_Filter_Options_Visible());
    }

    @Then("Verify By default All is selected in transaction section on user detail page")
    public void verifyByDefaultAllIsSelectedInTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("All is not selected", userPage.Is_All_Selected());
    }

    @And("User hover on copy icon over seller ID on user detail page")
    public void userClickOnCopyIconOnSellerIDOnUserDetailPage() {
        userPage.hover_On_Copy_Icon();

    }

    @When("User click on copy icon over transaction ID on transaction page")
    public void userClickOnCopyIconOverTransactionIDOnTransactionPage() {
        userPage.click_On_Copy_Icon();
    }

    @Then("Verify user able to view tooltip with copied on transaction page")
    public void verifyUserAbleToViewTooltipWithCopiedOnTransactionPage() {
        Assert.assertTrue("Tool tip is not visible", userPage.is_Copied_Tool_Tip_Visible());
    }

    @When("User click on copy icon over seller ID on transaction page")
    public void userClickOnCopyIconOverSellerIDOnTransactionPage() {
        userPage.click_On_Copy_Icon();
    }

    @And("User click on Property name in Transaction section on user detail page")
    public void userClickOnPropertyNameInTransactionSectionOnUserDetailPage() {
        userPage.click_On_Transaction_Row();
    }

    @Then("Verify user should be able to navigate to Property detail page")
    public void verifyUserShouldBeAbleToNavigateToTransactionDetailPage() {
        Assert.assertEquals("Transaction Details", userPage.verify_Property_Detail());
    }

    @And("Verify Transaction table with column names in transaction section on user detail page")
    public void verifyTransactionTableWithColumnNamesInTransactionSectionOnUserDetailPage() {
        List<WebElement> columnName = userPage.getTransactionColumnName();
        for (int i = 0; i < columnName.size(); i++) {
            Assert.assertTrue("Column name is not visible", isElementVisible(columnName.get(i)));
        }
        Assert.assertTrue("Column name is more than 8", columnName.size() == 8);
    }

    @And("Verify user should be able to view By filter in transaction section on user detail page")
    public void verifyUserShouldBeAbleToViewByFilterInTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Filter by is not visible", userPage.is_Filter_By_Visible());
    }

    @And("Verify user able to view Total IRR on transaction section on user detail page")
    public void verifyUserAbleToViewTotalIRROnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Total IRR is not visible", userPage.is_Total_IRR_Visible());
    }

    @And("Verify user able to view Total AAR on transaction section on user detail page")
    public void verifyUserAbleToViewTotalAAROnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Total AAR is not visible", userPage.is_Total_AAR_Visible());
    }

    @And("Verify user able to view Avg share cost on transaction section on user detail page")
    public void verifyUserAbleToViewAvgShareCostOnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Avg cost is not visible", userPage.is_Total_Avg_Share_Cost_Visible());
    }

    @And("Verify user able to view Total Shares on transaction section on user detail page")
    public void verifyUserAbleToViewTotalSharesOnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Total share is not visible", userPage.is_Total_Shares_Visible());
    }

    @And("Verify user able to view Total value on transaction section on user detail page")
    public void verifyUserAbleToViewTotalValueOnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Total value is not visible", userPage.is_Total_Value_Visible());
    }

    @And("Verify user able to view Equity multiple on transaction section on user detail page")
    public void verifyUserAbleToViewEquityMultipleOnTransactionSectionOnUserDetailPage() {
        Assert.assertTrue("Equity multiple is not visible", userPage.is_Total_Equity_Visible());
    }

    @And("Verify user able to view user's SSN value {string} when KYC is not done of User on user detail page")
    public void verifyUserAbleToViewUserSSSNValueWhenKYCIsNotDoneOfUserOnUserDetailPage(String ssnValue) {
        Assert.assertEquals("SSN value is not visible", ssnValue, userPage.verify_User_SSN_Value());

    }

    @Then("Verify user able to view Registered mobile number {string} when KYC is not done of User on user detail page")
    public void verifyUserAbleToViewRegisteredMobileNumberWhenKYCIsNotDoneOfUserOnUserDetailPage(String mobileNUmber) {
        Assert.assertEquals("Mobile number is not visible", mobileNUmber, userPage.verify_User_Mobile_Number());
    }

    @Then("Verify user able to view full address {string} when KYC is not done of User on user detail page")
    public void verifyUserAbleToViewFullAddressWhenKYCIsNotDoneOfUserOnUserDetailPage(String address) {
        Assert.assertEquals("Address is not visible", address, userPage.verify_User_Address());
    }

    @Then("Verify that user since date should be displayed in the format {string} on user detail page")
    public void verifyThatUserSinceDateShouldBeDisplayedInTheFormatOnUserDetailPage(String dateFormat) {
        WebElement date = userPage.getUserSinceDate();
        String userSinceDate = getText(date);
        Assert.assertTrue("Date is not in the expected format: " + dateFormat,
                DateUtil.isDateInGivenFormat(userSinceDate, dateFormat));
    }

    @Then("Verify user able to view DOB {string} when KYC is not done of the user detail page")
    public void verifyUserAbleToViewDOBWhenKYCIsNotDoneOfTheUserDetailPage(String DOB) {
        Assert.assertEquals("date of birth is not visible", DOB,userPage.is_Date_Of_Birth_Visible());
    }

    @Then("Verify that user since time is displaying in format as {string} on user page")
    public void verifyThatUserSinceTimeIsDisplayingInFormatAsOnUserPage(String timeFormat) {
        List<WebElement>  userSinceDates = userPage.getUserSinceDates ();
        for (int i=0; i<userSinceDates.size(); i++) {
            String dates = getText (userSinceDates.get(i));
            if(getText(userSinceDates.get(i)).equals("--")){
                continue;
            }
            Assert.assertTrue ("Date format is not correct at row: " ,
                    DateUtil.isDateInGivenFormat (dates, timeFormat));
        }
    }
}
