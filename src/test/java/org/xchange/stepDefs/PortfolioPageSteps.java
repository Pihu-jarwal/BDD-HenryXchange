package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.PortfolioPage;
import utils.PropertiesUtil;

public class PortfolioPageSteps {
    PortfolioPage page = new PortfolioPage();

    @Then("^Verify user should be able to view blank graph with text on portfolio page$")
    public void user_should_be_able_to_view_blank_graph_with_text_say_we_do_not_have_enough_data_to_showcase_the_graph() {
        Assert.assertEquals("We don't have enough data to showcase the graph.", page.get_Graph_Text());
    }

    @Then("^User clicks on name filter on investment section on portfolio page$")
    public void user_clicks_on_name_filter_on_investment_section_of_portfolio_page() {
        page.click_On_Investment_Name_Filter();
    }

    @Then("^User clicks on name filter on sell order page$")
    public void user_clicks_on_name_filter_on_sell_order_page() {
        page.click_On_Sell_Name_Filter();
    }

    @Then("^User clicks on A to Z filter of name filter on investment listing$")
    public void user_clicks_on_A_to_Z_filter_of_newest_to_oldest_filter() {
        page.click_On_Sort_Order_A_To_Z();
    }

    @Then("^User clicks on A to Z filter of name filter on sell order page$")
    public void user_clicks_on_A_to_Z_filter_of_newest_to_oldest_filter_on_Sell_page() {
        page.click_On_Sort_Order_A_To_Z();
    }

    @Then("^User clicks on Z to A filter of name filter on investment listing$")
    public void user_clicks_on_Z_to_A_filter_of_newest_to_oldest_filter() {
        page.click_On_Sort_Order_Z_To_A();
    }

    @Then("^User clicks on Z to A filter of name filter on sell order page$")
    public void user_clicks_on_Z_to_A_filter_of_newest_to_oldest_filter_on_Sell_order_page() {
        page.click_On_Sort_Order_Z_To_A();
    }

    @When("^User should able to view drop down with following sorting option on investment section on portfolio page$")
    public void user_should_able_to_view_drop_down_with_following_sorting_option() {
        page.validate_Dropdown_Options();
    }

    @Then("^Verify Newest to oldest filter set by-default on investment listing on portfolio page$")
    public void verify_Newest_to_oldest_filter_set_by_default() {
        page.validate_Default_NewestTo_Oldest_Filter();
    }

    @Then("^Verify Newest to oldest filter set by-default on sell order page$")
    public void verify_Newest_to_oldest_filter_set_by_default_on_Sell_order_page() {
        page.validate_Default_NewestTo_Oldest_Filter();
    }

    @Then("^Verify sort the list basis of alphabetic order on investment listing on portfolio page$")
    public void verify_sort_the_list_basis_of_alphabetic_order() {
        page.verify_The_Data_According_To_Sorting();
    }

    @Then("^Verify sort the list basis of alphabetic order on sell order listing on sell order page$")
    public void verify_sort_the_list_basis_of_alphabetic_order_sell_listing() {
        page.verify_The_Data_According_To_Sorting();
    }

    @Then("^Verify sort the list basis of alphabetic order on sell order page$")
    public void verify_sort_the_list_basis_of_alphabetic_order_on_sell_order() {
        page.validate_Sell_Order_Listing();
    }

    @Then("^User clicks on active sell icon on in investment list on portfolio page$")
    public void user_clicks_on_active_sell_icon_on_in_investment_list_on_portfolio_page() {
        page.click_On_Sell_Order_Icon();
    }

    @When("^User should be able to view \"Sell order icon \" in shares column on portfolio page$")
    public void user_should_be_able_to_view_Sell_order_icon_in_shares_column_on_portfolio_page() {
        Assert.assertEquals("Active sell order is not visible", "Active Sell Order", page.validate_Active_Sell_Order());
    }

    @Then("^User should able to view \"Processing\" tag over specific investment and \"Sell\" button is not active \"Grayed out\" in investing listing of portfolio page$")
    public void user_should_able_to_view_processing_tag_over_specific_investment_and_sell_button_is_not_active() {
        Assert.assertTrue(page.verify_Sell_Button_Is_Not_Active());
    }

    @When("^User must have more than 10 Sell order on portfolio page$")
    public void user_must_have_more_than_10_Sell_order_on_portfolio_page() {
        page.validate_Sell_Order_Count();
    }

    @Then("^User clicks on view all button of sell order on portfolio page$")
    public void user_clicks_on_view_all_button_of_sell_order_on_portfolio_page() {
        page.click_On_Sell_View_All_Button();
    }

    @Then("^Verify user should be able to redirect to \"Your Sell order \" page with all List of Sell order$")
    public void verify_user_should_be_able_to_redirect_to_Your_Sell_order_page_with_all_List() {
        Assert.assertNotEquals("Actual and unexpected values are equal", "PORTFOLIO", page.verify_Navigate_To_Sell_Order_Page());
    }

    @When("^User clicks on any sell order on portfolio page$")
    public void user_clicks_on_any_sell_order_on_portfolio_page() {
        page.click_On_Any_Sell_Order();
    }

    @Then("^Verify user should be able to view Sell Order summary pop-up on portfolio page$")
    public void verify_user_should_be_able_to_view_sell_order_summary_pop_up_on_portfolio_page() {
        Assert.assertTrue("Sell order popup is not visible", page.validate_Sell_Order_Popup());
    }

    @When("^User clicks on newest to oldest of investment listing on portfolio page$")
    public void user_clicks_on_newest_to_oldest_of_investment_listing_on_portfolio_page() {
        page.click_On_Newest_To_Oldest();
    }

    @When("^User clicks on newest to oldest on sell order page$")
    public void user_clicks_on_newest_to_oldest_on_sell_order_page() {
        page.click_On_Newest_To_Oldest();
    }

    @Then("^Verify asset name on sell order popup view on portfolio page$")
    public void verify_asset_name_on_sell_order_popup_view() {
        Assert.assertTrue("asset name is not visible", page.verify_Asset_Name());
    }

    @Then("^Verify user should be able to view sell Order summary pop-up which contain following data like origin order, transaction, balance on sell order popup$")
    public void verify_user_should_be_able_to_view_sell_Order_summary_pop_up_which_contain_following() {
        page.verify_Listing_Of_Original_Order();
    }

    @When("^User is on portfolio page$")
    public void user_is_on_portfolio_page() {
        Assert.assertEquals("Portfolio page is not visible", PropertiesUtil.getEnvironmentKey("URL") +"portfolio", page.verify_Portfolio_Page());
    }

    @When("^User clicks on close btn of sell order popup view on portfolio page$")
    public void user_clicks_on_close_btn_of_sell_order_popup_view() {
        page.click_On_Cross_Btn();
    }

    @Then("^Verify that user able to close the Your Sell Orders Summary pop-up on portfolio page$")
    public void verify_cross_button_functionality_of_sell_order_popup_view_on_portfolio_page() {
        Assert.assertFalse("Summary popup did not close", page.verify_Cross_Btn_Functionality());
    }

    @When("^User clicks on view all over transaction on portfolio page$")
    public void user_clicks_on_view_all_over_transaction_on_portfolio_page() {
        page.click_On_Transaction_View_All();
    }

    @Then("^Verify user should able to navigate to Transactions page$")
    public void verify_user_should_able_to_navigate_to_transactions_page() {
        Assert.assertNotEquals("Actual and unexpected values are equal", "PORTFOLIO", page.verify_Transaction_Breadcrumbs());
    }

    @And("^Verify list should be sorted on the basis of the latest action performed that is newest at the top to oldest on transaction page$")
    public void verify_list_should_be_sorted_on_the_basis_of_the_latest_action_performed() {
        page.verify_Listing_Of_Transaction_Page();
    }

    @Then("^User should be able to view account section value on portfolio page$")
    public void user_should_able_to_view_account_Section_value() {
        Assert.assertTrue("Account value is not visible", page.verify_Account_Value());
    }

    @And("^Verify user should be able to view investments, cash, crypto value is 0 when user didn't have any investments on portfolio page$")
    public void verify_user_should_be_able_to_view_investments_cash_crypto_value_is_0_when_user_did_not_have_any_investments() {
        Assert.assertEquals("Actual and expected value is mismatching", "$0.00", page.verify_Investment_Value());
        Assert.assertEquals("Actual and expected value is mismatching", "$0.00", page.verify_Cash_Value());
    }

    @And("^Verify graph is blurred out on portfolio page$")
    public void verify_graph_is_blurred_out_on_portfolio_page() {
        Assert.assertTrue("Graph is not blur :- ", page.verify_Blur_Graph());
    }

    @And("^Verify transfer funds Button over graph on portfolio page$")
    public void verify_transfer_funds_Button_over_graph_on_portfolio_page() {
        Assert.assertTrue("Transfer funds is not visible over graph", page.verify_Transfer_Funds_Btn_Over_Graph());
    }

    @Then("^Verify User should be able to view transfer funds on statement page$")
    public void verify_user_should_be_able_to_view_transfer_funds_on_statement_page() {
        Assert.assertTrue("Transfer funds is not visible", page.verify_Funds_Button());
    }

    @Then("^Verify User should be able to view tax document on statement page$")
    public void verify_user_should_be_able_to_view_tax_Documents_on_statement_page() {
        Assert.assertTrue("Tax document is not visible", page.verify_Tax_Documents());
    }

    @And("^Verify user should able to view full name of property and Fee description as shown in design$")
    public void user_should_able_to_view_full_name_of_property_and_Fee_description_as_shown_in_design() {
        Assert.assertTrue("Destination tool tip data is not visible", page.verify_Tooltip_Of_Destination());
    }

    @Then("Verify A to Z filter on sell order page")
    public void verify_A_To_Z_filter_on_sell_order_page() {
        Assert.assertTrue("A to Z filter is not visible", page.validate_A_To_Z_Filter());
    }

    @Then("Verify Z to A filter on sell order page")
    public void verify_Z_To_A_filter_on_sell_order_page() {
        Assert.assertTrue("Z to A filter is not visible", page.validate_Z_To_A_Filter());
    }

    @And("^User does hover on tooltip of transaction fee on portfolio page$")
    public void user_does_hover_on_tooltip_of_transaction_fee_on_portfolio_page() {
         page.click_On_Tooltip_Of_Fee_Transaction_Tooltip();
    }

    @Then("^Verify should be able to view Fee description as shown in design on portfolio page$")
    public void verify_should_be_able_to_view_Fee_description() {
        Assert.assertTrue("Fee tooltip data is not visible", page.verify_Tooltip_Of_Fee());
    }

    @Then("^Verify newest investment should always be in top of the list on portfolio page$")
    public void verify_newest_investment_should_always_be_in_top_of_the_list_on_portfolio_page() {
        page.verify_The_Data_According_To_Sorting();
    }

    @And("^Verify user should able to view list in order to latest action performed that is newest at the top to oldest on sell order page$")
    public void verify_user_should_able_to_view_list_in_order_to_latest_action_performed_that_is_newest_at_the_top_to_oldest() {
        page.validate_Sell_Order_Listing();
    }

    @Then("^Verify user should be able to view Account value section on portfolio page$")
    public void verify_user_should_be_able_to_view_Account_value_section_on_portfolio_page() {
        page.verify_Account_Value_On_Portfolio_page();
    }

    @Then("Verify A to Z filter of investing listing on portfolio page")
    public void verify_AToZ_filter_of_investing_listing_on_portfolio_page() {
        Assert.assertTrue("A to Z filter is not visible", page.validate_A_To_Z_Filter());
    }

    @Then("^Verify Z to A filter of investing listing on portfolio page$")
    public void verify_Z_To_A_filter_of_investing_listing_on_portfolio_page() {
        Assert.assertTrue("Z to A filter is not visible", page.validate_Z_To_A_Filter());
    }

    @When("User must have more than ten transactions on portfolio page")
    public void user_must_have_more_than_transactions_on_portfolio_page() {
        page.validate_View_ALl_Btn_Over_Transaction();
    }


}


