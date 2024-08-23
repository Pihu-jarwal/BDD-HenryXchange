package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.HomePage;
import utils.PropertiesUtil;

public class HomePageSteps {
    HomePage homepage = new HomePage();

    @When("User is on homepage")
    public void userIsOnHomepage() {
        Assert.assertEquals("User is not homepage",PropertiesUtil.getEnvironmentKey("URL"),homepage.verify_Redirection_Of_Home_Page());
    }

    @Then("^User able to view Henry logo on home page$")
    public void user_able_to_view_henry_logo_on_home_page() {
        Assert.assertTrue("Henry logo is not displayed.",homepage.verify_Henry_Logo());
    }

    @And("^User able to view Market selected by default on home page$")
    public void user_able_to_view_market_selected_by_default_on_home_page() {
        Assert.assertFalse("Market tab is not selected by default.", homepage.verify_Market_Tab_Default_Selected());
    }

    @And("^User able to view tab list button on home page$")
    public void user_able_to_view_tab_list_button_on_home_page() {
        homepage.verify_Tab_List_Button();
    }

    @Then("User able to view MARKET as {string} tab on homepage")
    public void userAbleToViewMARKETAsTabOnHomepage(String market) {
        Assert.assertEquals("Market text expect and actual are not same",market,homepage.view_Market_Tab());
    }

    @And("User able to view HOW IT WORKS as {string} on homepage")
    public void userAbleToViewHOWITWORKSAsOnHomepage(String howItWorks) {
        Assert.assertEquals("How it works text expect and actual are not same",howItWorks,homepage.view_How_It_Works_Tab());
    }

    @And("User able to view INVESTORS as {string} on homepage")
    public void userAbleToViewINVESTORSAsOnHomepage(String investors) {
        Assert.assertEquals(" Investors text expect and actual are not same",investors,homepage.view_Investors_Tab());
    }

    @And("User able to view SYNDICATORS as {string} on homepage")
    public void userAbleToViewSYNDICATORSAsOnHomepage(String syndicators) {
        Assert.assertEquals(" Syndicators text expect and actual are not same",syndicators,homepage.view_Syndicators_Tab());
    }

    @And("User able to view ABOUT as {string} on homepage")
    public void userAbleToViewABOUTAsOnHomepage(String about) {
        Assert.assertEquals(" About text expect and actual are not same",about,homepage.view_About_Tab());
    }

    @And("^User able to view login button on home page$")
    public void user_able_to_view_login_button_on_home_page() {
        Assert.assertTrue("Login button text is not displayed :-",homepage.login_Button_Text());
    }

    @And("^User able to view signup button on home page$")
    public void user_able_to_view_signup_button_on_home_page() {
        Assert.assertTrue("Signup button text is not displayed :-",homepage.signup_Button());
    }

    @And("^User able to view placeholder text on home page$")
    public void user_able_to_view_placeholder_text_on_home_page() {
        Assert.assertTrue("Placeholder text is not displayed :-",homepage.verify_Placeholder_Text());
    }

    @Then("^Verify user is on home page and view asset listing$")
    public void verify_user_is_on_home_page_and_view_asset_listing() {
        homepage.verify_Asset_Listing();
    }

    @And("^User able to view picture of asset on home page$")
    public void user_able_to_view_picture_of_asset_on_home_page() {
        homepage.verify_Asset_Picture();
    }

    @And("^User able to view asset name on home page$")
    public void user_able_to_view_asset_name_on_home_page() {
        Assert.assertTrue("Asset name is not displayed :-" ,homepage.asset_Name());
    }

    @And("^User able to view asset class on home page$")
    public void user_able_to_view_asset_class_on_home_page() {
        homepage.verify_Asset_Class();
    }

    @And("^User able to view asset owner on home page$")
    public void user_able_to_view_asset_owner_on_home_page() {
        Assert.assertTrue("Asset owner is not displayed :-",homepage.asset_Owner());
    }

    @And("^User able to view asset location on home page$")
    public void user_able_to_view_asset_location_on_home_page() {
        Assert.assertTrue("Asset location is not displayed :-",homepage.asset_Location());
    }

    @And("^User able to view number of unit on home page$")
    public void user_able_to_view_number_of_unit_on_home_page() {
        Assert.assertTrue("Asset number of units is not displayed :-",homepage.asset_Number_Of_Units());
    }

    @And("^User able to view share price on home page$")
    public void user_able_to_view_share_price_on_home_page() {
        Assert.assertTrue("Asset share price is not displayed :-",homepage.asset_Share_Price());
    }

    @And("^User able to view IRR in card on home page$")
    public void user_able_to_view_irr_in_card_on_home_page() {
        homepage.verify_IRR_Text();
    }

    @And("^User able to view AAR in card on home page$")
    public void user_able_to_view_aar_in_card_on_home_page() {
        homepage.verify_AAR_Text();
    }

    @And("^User able to view Equity Multiplier in card on home page$")
    public void user_able_to_view_equity_multiplier_in_card_on_home_page() {
        homepage.verify_Equity_Multiple_Text();
    }

    @And("^User able to view purchase date in card on home page$")
    public void user_able_to_view_purchase_date_in_card_on_home_page() {
        homepage.verify_PurchaseDate_Text();
    }

    @And("^User able to view dividends in card on home page$")
    public void user_able_to_view_dividends_in_card_on_home_page() {
        homepage.verify_Dividends_Text();
    }

    @And("^User able to view depreciation in card on home page$")
    public void user_able_to_view_depreciation_in_card_on_home_page() {
        homepage.verify_Depreciation_Text();
    }

    @And("^User clicks on buy button on homepage$")
    public void user_clicks_on_buy_button_on_homepage() {
        homepage.click_On_Buy_Button();
    }

    @When("^User is on home page and click on 2 others link$")
    public void user_is_on_home_page_and_click_on_2_others_link() {
        homepage.click_On_2_Others_link();
    }

    @Then("^User is on sign up page and verify get started text on signup page$")
    public void user_is_on_sign_up_page_and_verify_get_started_text_on_signup_page() {
        homepage.verify_Signup_Page();
    }

    @When("User is on home page and click on login button and navigate to login page")
    public void user_is_on_home_page_and_click_on_login_button_and_navigate_to_login_page() {
        homepage.click_Login_Button();
    }

    @And("User navigate back to home page")
    public void user_navigate_back_to_home_page() {
        homepage.navigate_To_Back();
    }

    @And("User clicks on sign up button on home page")
    public void userClicksOnSignUpButtonOnHomePage() {
        homepage.click_Signup_Button();
    }



}
