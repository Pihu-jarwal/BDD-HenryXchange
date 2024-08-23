package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.PortfolioStatementsPage;

public class PortfolioStatementsPageSteps {

    PortfolioStatementsPage page = new PortfolioStatementsPage();

    @When("^User clicks on portfolio tab on market page$")
    public void user_clicks_on_portfolio_tab_on_market_page() {
        page.click_On_Portfolio();
    }

    @And("^User clicks on statements button on portfolio page$")
    public void user_clicks_on_statements_button_on_portfolio_page() {
        page.click_On_Statement_Button();
    }

    @Then("^Verify breadcrumbs on statement page$")
    public void verify_breadcrumbs_on_statement_page() {
        Assert.assertTrue("breadcrumbs is not visible", page.verify_Breadcrumbs_On_Statement_Page());
    }

    @And("^Verify list on statement page$")
    public void verify_List_On_Statement_Page() {
        Assert.assertTrue("Title description is not visible ", page.verify_Title_Description());
    }

    @And("^Verify filter text on statement page$")
    public void verify_Filter_Text() {
        Assert.assertTrue("Filter text is not visible", page.verify_Filter_Text());
    }

    @And("^User clicks on date label on statement page$")
    public void user_clicks_on_date_label_on_statement_page() {
        page.click_On_Date_Label();
    }

    @And("^User should able to view drop down with following options on statement page$")
    public void user_should_able_to_view_drop_down_with_following_options() {
        page.verify_Date_Menu_List();
    }

    @Then("^User clicks on oldest to newest one filter on statement page$")
    public void user_clicks_on_newest_to_oldest_one_filter_on_statement_page() {
        page.click_On_Newest_To_Oldest();
    }

    @Then("^Verify user should be able to view list on statement page$")
    public void verify_user_should_be_able_to_view_list_with_oldest_at_top_of_Newest() {
        page.verify_Listing_Data_On_Statement_Page();
    }

    @When("^User clicks on all type filter on statement page$")
    public void user_clicks_on_all_type_filter_on_statement_page() {
        page.click_On_All_Type_Filter();
    }

    @When("^User clicks on purchase on statement page$")
    public void user_clicks_on_purchase_on_statement_page() {
        page.click_On_Purchase();
    }

    @When("^User clicks on account on statement page$")
    public void user_clicks_on_account_on_statement_page() {
        page.click_On_Account();
    }

    @When("^User clicks on sell on statement page$")
    public void user_clicks_on_sell_on_statement_page() {
        page.click_On_Sell();
    }

    @When("^User clicks on this month filter on statement page$")
    public void user_clicks_on_this_month_filter() {
        page.click_on_This_Month();
    }

    @And("^User clicks on custom filter of this month on statement page$")
    public void user_clicks_on_custom_filter() {
        page.verify_Custom_Date();
    }

    @And("^User clicks on select date filter on statement page$")
    public void user_clicks_on_select_date_filter() {
        page.click_On_Select_Date();
    }

    @And("^User select start data from date filter on statement page$")
    public void user_select_start_data_from_date_filter_on_statement_page() {
        page.verify_Select_Start_Date();
    }

    @And("^User select end data from date filter on statement page$")
    public void user_select_end_data_from_date_filter_on_statement_page() {
        page.verify_Select_End_Date();
    }

    @And("^Verify end date calendar should automatically appear after selection of Start date on statement page$")
    public void verify_end_Date_calendar_should_automatically_appear_after_selection_of_Start_date() {
        Assert.assertTrue("End date calendar is not visible", page.validate_End_Date_Calender());
    }

    @Then("^User should be able to view drop down with following options$")
    public void user_should_be_able_to_view_drop_down_with_following_options() {
        page.verify_This_Month_Filter();
    }

    @And("^Verify this Month is set by-default on statement page$")
    public void verify_this_Month_is_set_by_default() {
        page.verify_This_Month_Set_By_Default();
    }

    @And("^User select start Date must be Today or earlier, all future dates are grayed out on statement page$")
    public void user_select_current_date_from_date_filter_on_statement_page() {
        Assert.assertTrue("Disable date is not visible", page.click_On_Current_Date());
    }

    @And("^User clicks on last month on statement page$")
    public void user_clicks_on_last_month_on_statement_page() {
        page.click_On_Last_Month();
    }

    @And("^User clicks on this year on statement page$")
    public void user_clicks_on_this_year_on_statement_page() {
        page.click_On_This_Year();
    }

    @And("^User clicks on last year on statement page$")
    public void user_clicks_on_last_year_on_statement_page() {
        page.click_On_Last_Year();
    }

    @When("^User clicks on default filter of this month on statement page$")
    public void user_clicks_on_default_filter_of_this_month_on_statement_page() {
        page.click_On_Default_Filter();
    }


    @When("^User clicks on View button on statement page$")
    public void user_clicks_on_View_button_on_statement_page() {
        Assert.assertTrue("No view button enabled", page.is_Any_View_Btn_Enabled());
    }

    @Then("^User should be redirected to the corresponding Statement detail PDF viewer$")
    public void user_should_be_redirected_to_the_corresponding_Statement_detail_PDF_viewer() {
        Assert.assertTrue("Pdf is not visible", page.verify_Pdf_Title());
    }

    @When("^User clicks on Download button over any statement$")
    public void user_clicks_on_Download_button_over_any_statement() {
        Assert.assertTrue("No download button enabled", page.is_Any_Download_Btn_Enabled());
    }

    @And("^User select start date in which no data found on statement page$")
    public void user_select_date_in_which_no_data_found() {
        page.click_On_Start_Date_Which_Have_No_Data();
    }

    @And("^User select end date in which no data found on statement page$")
    public void user_select_end_in_which_no_data_found() {
        page.click_On_End_Date_Which_Have_No_Data();
    }

    @Then("^Verify user should be able to view blank list with text says \"No Data Available\"$")
    public void verify_user_should_be_able_to_view_blank_list() {
        Assert.assertEquals("No Data Available", page.verify_Custom_Filter_Which_Have_No_Data());
    }

    @When("^User clicks on export button on statement page$")
    public void user_clicks_on_export_button_on_statement_page() {
        page.click_On_Export_Button();
    }

    @Then("^User should be able to download Statement for which the user tries to download the statement$")
    public void user_should_be_able_to_download_Statement_for_which_the_user_tries_to_download_the_statement() {
        page.verify_Download_File();
    }

    @Then("^User should be able to download All Statements corresponding to filters$")
    public void user_should_be_able_to_download_All_Statements_corresponding_to_filters() {
        page.verify_Download_File();
    }

    @And("^Verify that user able to close the pop-up of pdf on statement page$")
    public void verify_that_user_able_to_close_the_pop_up() {
        page.click_On_Cross_Button();
    }

    @And("^User clicks on default filter of all type on statement page$")
    public void user_clicks_on_default_filter_of_all_type_on_statement_page() {
        page.click_On_Default_All_Type_Filter();
    }

    @And("^Verify user should be able to Download the Statement in pdf format on statement page$")
    public void verify_user_should_be_able_to_Download_the_Statement_in_pdf_format_on_statement_page() {
        page.verify_Download_File();
    }

    @When("^User clicks on download button on pdf viewer on statement page$")
    public void user_clicks_on_download_button_on_pdf_viewer_on_statement_page() {
        page.click_On_Pdf_download_Btn();
    }

    @Then("^Verify oldest to newest filter is selected on statement page$")
    public void verify_oldest_to_newest_filter_on_statement_page() {
        Assert.assertTrue("oldest to newest filter is not selected", page.validate_Oldest_To_Newest_Filter());
    }

    @Then("^Verify newest to oldest filter is selected on statement page$")
    public void verify_newest_to_oldest_filter_on_statement_page() {
        Assert.assertTrue("newest to oldest filter is not selected", page.validate_Newest_To_Oldest_Filter());
    }

    @And("Verify last month filter is selected on statement page")
    public void verify_last_month_filter_is_selected_on_statement_page() {
        Assert.assertTrue("Last month filter is not visible",page.validate_Last_Month_Filter());
    }

    @And("Verify this year filter is selected on statement page")
    public void verify_this_year_filter_is_selected_on_statement_page() {
        Assert.assertTrue("This year filter is not visible",page.validate_This_Year_Filter());
    }

    @And("Verify custom filter is selected on statement page")
    public void verify_custom_filter_is_selected_on_statement_page() {
        Assert.assertTrue("custom filter is not visible",page.validate_Custom_Filter());
    }

    @And("Verify last year filter is selected on statement page")
    public void verify_last_year_filter_is_selected_on_statement_page() {
        Assert.assertTrue("Last year filter is not visible",page.validate_Last_Year_Filter());
    }

    @Then("Verify purchase filter is selected on statement page")
    public void verify_purchase_filter_is_selected_on_statement_page() {
        Assert.assertTrue("Purchase filter is not visible",page.validate_default_Purchase_Filter());
    }
    @Then("Verify sell filter is selected on statement page")
    public void verify_sell_filter_is_selected_on_statement_page() {
        Assert.assertTrue("Sell filter is not visible",page.validate_default_Sell_Filter());

    }
    @Then("Verify account filter is selected on statement page")
    public void verify_account_filter_is_selected_on_statement_page() {
        Assert.assertTrue("Account filter is not visible",page.validate_default_Account_Filter());
    }

    @Then("User is on statement page")
    public void user_is_on_statement_page() {
        Assert.assertTrue("breadcrumbs is not visible", page.verify_Breadcrumbs_On_Statement_Page());
    }

}
