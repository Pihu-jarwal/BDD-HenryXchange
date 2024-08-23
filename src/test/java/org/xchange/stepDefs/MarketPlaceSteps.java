package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.xchange.pom.LoginPage;
import org.xchange.pom.MarketPlace;
import utils.Helper;
import utils.PropertiesUtil;

public class MarketPlaceSteps extends Helper {

    public MarketPlaceSteps() {
        PageFactory.initElements(driver, this);
    }

    LoginPage loginPage = new LoginPage();
    MarketPlace marketPage = new MarketPlace();

    @Then("^Verify user navigation to market page, when user logged in with valid credential$")
    public void verify_user_navigation_when_user_logged_in_with_valid_credential() {
        Assert.assertEquals("Market", loginPage.user_Navigate_To_Market_Screen());
    }

    @When("^User clicks on profile icon on market page")
    public void user_clicks_on_profile_icon() {
        marketPage.click_On_User_Profile_Icon();
    }

    @Then("^Verify user should be able to view two options in popup$")
    public void verify_Able_To_View_Two_Options() {
        marketPage.verify_User_Should_Be_Able_To_View_Two_Popup();
    }

    @And("^User clicks on account on market page")
    public void user_clicks_on_account_of_Market_Page() {
        marketPage.click_On_Account();
    }

    @Then("^Verify User is on account page$")
    public void verify_user_is_on_account_page() {
        Assert.assertEquals("Account page is not visible ", "Account", marketPage.verify_Account_Page());
    }

    @And("^User clicks on logout button on account page$")
    public void user_clicks_on_logout_button_on_account_page() {
        marketPage.click_On_Logout_Button();
    }

    @Given("^User is on market page$")
    public void user_is_on_market_screen() {
        Assert.assertEquals("Market", loginPage.user_Navigate_To_Market_Screen());
    }

    @When("^User clicks on newest filter on market page$")
    public void user_clicks_on_newest_filter_on_market_screen() {
        marketPage.verify_Filters_Of_Newest();
    }

    @And("^User clicks on featured filter on market page$")
    public void user_clicks_on_featured_filter_on_market_page() {
        marketPage.verify_Featured_Option();
    }

    @Then("^Verify user should be able to view 3 options$")
    public void verify_user_should_be_able_to_view_3_options() {
        marketPage.verify_Filter_Options_Of_AllFilter();
    }

    @Then("^Verify user should be able to view List of property name on market page$")
    public void verify_user_should_be_able_to_view_list_of_property_name() {
        marketPage.verify_Property_Name_Of_AllFilters();
    }

    @And("^User clicks on most popular on market page")
    public void user_clicks_on_most_popular_on_market_page() {
        marketPage.verify_Most_Popular_Filter();
    }

    @Then("^User is on property detail page$")
    public void user_is_on_property_detail_screen() {
        marketPage.verify_Property_Detail_Page();
    }

    @When("^User clicks on owner filter on market page$")
    public void user_clicks_on_owner_filter_on_market_page() {
        marketPage.verify_Owner_Filter();
    }

    @Then("^Verify that user should be able to view dropdown list of owner$")
    public void Verify_that_user_should_be_able_to_view_dropdown_list_of_owner() {
        marketPage.verify_Owner_Filter_Options();
    }

    @And("^User clicks on owner option$")
    public void user_clicks_on_owner_option() {
        marketPage.click_On_Owner_Option();
    }

    @Then("^Verify that list should be refresh according to selected owner on market page$")
    public void verify_that_list_should_be_refresh_according_to_selected_owner() {
        marketPage.verify_Should_Be_Refresh_According_To_Selected_Owner();
    }

    @When("^User check the checkbox of owner option on market page$")
    public void user_check_the_checkbox_of_owner_option() {
        marketPage.verify_Check_The_Checkbox_Of_Owner();
    }

    @Then("^Verify user should be able to click on reset filter of owner option on market page$")
    public void Verify_user_should_be_able_to_click_on_reset_filter_of_owner_option() {
        marketPage.verify_Reset_Filter();
    }

    @When("^User clicks on typing cursor over search field on market page$")
    public void user_should_be_able_to_view_typing_cursor_over_search_field() {
        marketPage.verify_Search_Field();
    }

    @Then("^Verify that user should be able to view data at top of list which have same data entered by user in market page search field$")
    public void verify_that_user_should_be_able_to_view_property_at_top_of_list_which_have_same_property_entered_by_user() {
        marketPage.verify_Data_is_Coming_According_To_Search_Keyword();
    }

    @And("^User enter property name on search bar on market page - (.+)$")
    public void user_enters_property_name(String propertyName) {
        marketPage.verify_Enter_Property_Name_On_Search_Field(propertyName);
    }

    @Then("^User should be able to view owner at top of list which have same owner entered by user in market search field$")
    public void user_should_be_able_to_view_owner_at_top_of_list_which_have_same_owner_entered_by_user() {
        marketPage.verify_Owner_Is_Coming_According_To_Search_keyword();
    }

    @And("^User enters address name on search bar on market page - (.+)$")
    public void user_enters_address_name(String address) {
        marketPage.verify_Enter_Address_Name_On_Search_Field(address);
    }

    @Then("^User should be able to view address at top of list which have same address entered by user$")
    public void user_should_be_able_to_view_address_at_top_of_list_which_have_same_address_entered_by_user() {
        marketPage.verify_Address_Is_Coming_According_To_Search_keyword();
    }

    @And("^User enter owner name on search bar on market page - (.+)$")
    public void user_enters_owner_name(String owner) {
        marketPage.verify_Enter_Owner_Name_On_Search_Field(owner);
    }

    @And("^Enter random word which didn't matched Owner name, Property name, Address of Property on market search field - (.+)$")
    public void enter_random_word_which_didnt_matched_owner_name_property_name_address_of_property(String searchAsset) {
        marketPage.verify_Enter_Random_Word_On_Search(searchAsset);
    }

    @Then("^Verify the functionality when we enter random word in property page search field$")
    public void verify_the_functionality_when_we_enter_random_word() {
        Assert.assertEquals("Search result not found.", marketPage.verify_Search_If_We_Enter_Random_Word());
    }

    @Then("^Verify user should be able to view asset listing data like location, asset class, units ,shares on market page$")
    public void verify_user_should_be_able_to_view_asset_listing_data_like_location_asset_class_units_shares_on_market_page() {
        marketPage.verify_Asset_Listing_Data();
    }

    @Then("^Verify user should be able to view target returns data like IRR , AAR , Equity Multiple on market page$")
    public void verify_user_should_be_able_to_view_target_returns_data_like_IRR_AAR_Equity_Multiple_on_market_page() {
        marketPage.verify_Target_Returns_Data();
    }

    @When("^User navigate to market page$")
    public void user_navigate_to_market_page() {
        loginPage.user_Navigate_To_Market_Screen();
    }

    @Then("^Verify that user should be able to view asset listing, terms data like purchase date, dividends, Depreciation on market page$")
    public void verify_that_user_should_be_able_to_view_asset_listing_terms_data_like_purchase_date_dividends_depreciation_on_market_page() {
        marketPage.verify_Terms_Data();

    }

    @And("^Again click on newest option of newest dropdown on market page$")
    public void again_click_on_newest_option() {
        marketPage.click_On_Newest_Option();
    }

    @Then("^Verify user should be able to view portfolio on market page$")
    public void verify_user_should_be_able_to_view_portfolio_on_market_page() {
        Assert.assertEquals("Portfolio tab is not visible on market page", "PORTFOLIO", marketPage.verify_User_Should_Be_Able_To_View_Portfolio());
    }

    @And("^Verify user should be able to view owner on market page$")
    public void verify_user_should_be_able_to_view_owner() {
        Assert.assertEquals("Owner tab is not visible on market page", "OWNER", marketPage.verify_User_Should_Be_Able_To_View_Owner());
    }

    @And("^Verify user should be able to view account setup on market page$")
    public void verify_user_should_be_able_to_view_account_setup() {
        Assert.assertTrue("Account setup is not visible ", marketPage.verify_Should_Be_Able_To_View_Account_Setup());
    }

    @Then("^Verify user should be able to view footer headings like resource , about on all the pages$")
    public void verify_user_should_be_able_to_view_footer_heading() {
        marketPage.verify_Should_Be_Able_To_View_Resource_And_About();
    }

    @When("^User scroll the page of market$")
    public void user_scroll_the_page_of_market() {
        marketPage.verify_Scroll_Page();
    }

    @And("^Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages$")
    public void verify_user_should_be_able_to_view_footer_hyperlinks() {
        marketPage.verify_Should_Be_Able_To_View_footer_Hyper_Links();
    }

    @Then("^Verify user should be able to view the social platform hyper links and bottom section hyper links$")
    public void verify_user_should_be_able_to_view_the_social_platform_hyper_links_and_bottom_section_hyper_links() {
        marketPage.verify_Social_Platform_And_Bottom_Links();
    }

    @When("^User clicks on other owner option on market page$")
    public void user_clicks_on_other_owner_option() {
        marketPage.verify_The_Other_Owner_Functionality();
    }

    @Then("^Verify user should be able to view owner name on property detail page$")
    public void verify_user_should_be_able_to_view_owner_name() {
        marketPage.verify_User_Should_Be_Able_To_View_Other_Owner();
    }

    @When("User clicks on asset name as {string} on market page")
    public void userClicksOnAssetNameAsOnMarketPage(String assetName) {
        marketPage.click_On_Property_Name(assetName);
    }

    @When("User click on cross icon on search bar on market page")
    public void userClickOnCrossIconOnSearchBarOnMarketPage() {
        marketPage.click_On_Cross_Icon();
    }

    @Then("Verify user should be able to navigate to home page")
    public void verifyUserShouldBeAbleToNavigateToHomePage() {
        Assert.assertEquals("User is not on home page",PropertiesUtil.getEnvironmentKey("URL"), marketPage.get_Current_URL());
    }
}
