package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.PortfolioTransactionPage;

public class portfolioTransactionSteps {
    PortfolioTransactionPage portfolioTransaction = new PortfolioTransactionPage();


    @And("User is on transaction page")
    public void user_is_on_transaction_page() {
        Assert.assertEquals("Transactions",portfolioTransaction.verify_Transaction_Page());
    }

    @Then("User able to see the breadcrumbs and verify the breadcrumbs on transaction page")
    public void user_able_to_see_the_breadcrumbs_and_verify_the_breadcrumbs_on_transaction_page() {
        portfolioTransaction.verify_Breadcrumbs_Transaction_Page();
    }

    @And("User click on date for sorting the list on transaction page")
    public void user_click_on_date_for_sorting_the_list_on_transaction_page() {
        portfolioTransaction.click_On_Date_For_Sorting();
    }

    @And("User able to view the option in date sorting dropdown on transaction page")
    public void user_able_to_view_the_option_in_date_sorting_dropdown_on_transaction_page() {
        Assert.assertTrue("Dropdown list is not visible ",portfolioTransaction.verify_Sorting_DateDropDown());
    }

    @And("User able to view the list on transaction page")
    public void user_able_to_view_the_list_on_transaction_page() {
        portfolioTransaction.verify_The_List_Sorting_Newest_To_Oldest();
    }

    @Then("User able to view list of all Transaction which contain following details on transaction page")
    public void user_able_to_view_list_of_all_transaction_which_contain_following_details_on_transaction_page() {
        portfolioTransaction.list_Of_All_Transaction_Which_Contains_Details();
    }

    @Then("Verify this Month is set by-default on transaction page")
    public void verifyThisMonthIsSetByDefaultOnTransactionPage() {
        portfolioTransaction.verify_This_Month_Set_By_Default();
    }

    @And("Verify user should be able to view list on transaction page")
    public void verifyUserShouldBeAbleToViewListOnTransactionPage() {
        portfolioTransaction.verify_Listing_Data_On_Transaction_Page();
    }

    @When("User click on default this month filter on transaction page")
    public void userClickOnDefaultThisMonthFilterOnTransactionPage() {
        portfolioTransaction.click_On_Default_Filter();
    }

    @And("User click on this month text filter on transaction page")
    public void user_click_on_this_month_text_filter_on_transaction_page() {
        portfolioTransaction.click_This_Month_Dropdown_Filter();
    }

    @And("User able to see the dropdown list on transaction page")
    public void user_able_to_see_the_dropdown_list_on_transaction_page() {
        portfolioTransaction.verify_Dropdown_List();
    }

    @When("User clicks on last month on transaction page")
    public void userClicksOnLastMonthOnTransactionPage() {
        portfolioTransaction.click_Last_Month_Option();
    }

    @And("User clicks on this year on transaction page")
    public void userClicksOnThisYearOnTransactionPage() {
        portfolioTransaction.click_This_Year_Option();
    }

    @And("User clicks on custom filter of this month on transaction page")
    public void userClicksOnCustomFilterOfThisMonthOnTransactionPage() {
        portfolioTransaction.click_Custom_Option();
    }

    @And("User select start data {string} from date filter on transaction page")
    public void userSelectStartDataFromDateFilterOnTransactionPage(String startDate) {
        portfolioTransaction.select_Start_Date(startDate);
    }

    @And("User select end data {string} from date filter on transaction page")
    public void userSelectEndDataFromDateFilterOnTransactionPage(String endDate) {
        portfolioTransaction.select_End_Date(endDate);
    }

    @And("User clicks on last year on transaction page")
    public void userClicksOnLastYearOnTransactionPage() {
        portfolioTransaction.click_Last_Year_Option();
    }

    @Then("Verify user should be able to view last year list on transaction page")
    public void verifyUserShouldBeAbleToViewLastYearListOnTransactionPage() {
        Assert.assertTrue("No data available text is not visible",portfolioTransaction.verify_Last_Year_Listing_Data_On_Transaction_Page());
    }


    @And("User able to view start date and end date field on transaction page")
    public void user_able_to_view_start_date_and_end_date_field_on_transaction_page() {
        portfolioTransaction.view_Start_Date_End_Date_Field();
    }

    @And("User clicks on select date filter on transaction page")
    public void userClicksOnSelectDateFilterOnTransactionPage() {
        portfolioTransaction.click_On_Select_Date();
    }

    @And("User select start Date must be Today or earlier, all future dates are grayed out on transaction page")
    public void userSelectStartDateMustBeTodayOrEarlierAllFutureDatesAreGrayedOutOnTransactionPage() {
        Assert.assertTrue("Disable date is not visible",portfolioTransaction.click_On_Current_Date());
    }

    @Then("Verify end date calendar should automatically appear after selection of Start date on transaction page")
    public void verifyEndDateCalendarShouldAutomaticallyAppearAfterSelectionOfStartDateOnTransactionPage() {
        Assert.assertTrue("End date calendar is not visible",portfolioTransaction.validate_End_Date_Calender());
    }

    @And("User enter the start date {string} which have no data on transaction page")
    public void userEnterTheStartDateWhichHaveNoDataOnTransactionPage(String startDate) {
        portfolioTransaction.select_Start_Date_No_Data_Available(startDate);
    }

    @And("User enter the end date {string} which have no data on transaction page")
    public void userEnterTheEndDateWhichHaveNoDataOnTransactionPage(String endDate) {
        portfolioTransaction.select_End_Date_No_Data_Available(endDate);
    }

    @Then("User see the text no data available on transaction page")
    public void userSeeTheTextNoDataAvailableOnTransactionPage() {
        Assert.assertTrue("no data available is not displayed ",portfolioTransaction.verify_No_Data_Available());
    }

    @And("Verify user able to clicks on export button on transaction page")
    public void verify_user_able_to_clicks_on_export_button_on_transaction_page() {
        portfolioTransaction.click_Export_Button();
    }

    @When("User should able to view export button on transaction page")
    public void userShouldAbleToViewExportButtonOnTransactionPage() {
        Assert.assertTrue("Export button is not visible ",portfolioTransaction.view_Export_Button());
    }

    @Then("User should be able to download transactions on transaction page")
    public void userShouldBeAbleToDownloadTransactionsOnTransactionPage() {
        portfolioTransaction.verify_Download_File();
    }
}
