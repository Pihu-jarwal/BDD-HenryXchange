package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.PropertyDetailPage;

public class PropertyDetailSteps {

    PropertyDetailPage propertyDetailPage = new PropertyDetailPage();

    @Then("^user should be able to view owner name of property$")
    public void user_should_be_able_to_view_owner_name_of_property() {
        Assert.assertTrue("Owner name is not displayed ", propertyDetailPage.verify_Should_Be_Able_To_View_Owner());
    }

    @And("^Verify user should be able to view property data like location , class , units, shares on property detail page$")
    public void verify_user_should_be_able_to_view_property_data_like_location_class_units_shares() {
        propertyDetailPage.verify_User_Should_Be_Able_To_View_Asset_Data();
    }

    @And("^Verify cross button functionality of owner popup on property detail page$")
    public void verify_cross_button_functionality() {
        propertyDetailPage.verify_Cross_Button();
    }


    @When("^User clicks on other owner of owners section on property detail page$")
    public void user_clicks_on_other_owner() {
        propertyDetailPage.verify_Other_Owner_Functionality();
    }

    @Then("^Financial- not able to view Financial section, section got blurred and have locked icon on property detail page$")
    public void financial_not_able_to_view_financial_section_section_got_blurred_and_have_locked_icon() {
        Assert.assertTrue("Financial data is not visible", propertyDetailPage.verify_Functionality_Of_Financials_For_Level1_User());
    }

    @And("^Document- not able to view Document section, section got blurred and have locked icon on property detail page$")
    public void document_not_able_to_view_document_section_section_got_blurred_and_have_locked_icon() {
        Assert.assertTrue(propertyDetailPage.verify_Functionality_OF_Documents_For_Level1_User());
    }

    @And("^Similar property - Not able to view Similar property section, section got blurred and have locked icon on property detail page$")
    public void similar_property_not_able_to_view_similar_property_section_section_got_blurred_and_have_locked_icon() {
        Assert.assertTrue(propertyDetailPage.verify_Functionality_OF_Similar_Properties_For_Level1_User());
    }

    @And("^User enters a email in input field on login screen (.+)$")
    public void user_enters_a_email_in_input_field(String email) {
        propertyDetailPage.set_Email(email);
    }

    @And("^User enters a password in input field on login screen (.+)$")
    public void user_enters_a_password_on_login_page(String password) {
        propertyDetailPage.set_Password(password);
    }

    @When("^User clicks on download icon over document on property detail page$")
    public void user_clicks_on_download_icon() {
        propertyDetailPage.click_On_Download_Icon();
    }

    @Then("^Verify user is on sign the confidentiality agreement on property detail page$")
    public void verify_user_is_on_sign_the_confidentiality_agreement() {
        Assert.assertTrue("Sign the confidential agreement is not visible", propertyDetailPage.verify_Sign_The_Confidentiality_Agreement());
    }

    @When("^User clicks on follow button over Owners section on property detail page$")
    public void user_clicks_on_follow_button_over_owners_section() {
        propertyDetailPage.verify_Click_On_Follow_Button();
    }

    @Then("^Verify user should be able to view Follow button changed to Following button on property detail page$")
    public void verify_user_should_be_able_to_view_follow_button_changed_to_following_button() {
        Assert.assertNotEquals("Actual and unexpected value are matching ", "Follow", propertyDetailPage.user_Should_Be_Able_To_View_Following());
    }

    @Then("^Verify the functionality of checkbox and decline button on property detail page$")
    public void verify_the_functionality_of_checkbox_and_decline_button() {
        propertyDetailPage.verify_Check_Box_Is_Selected();
    }

    @Then("^Verify the functionality of terms and condition checkbox on property detail page$")
    public void verify_the_functionality_of_terms_and_condition_checkbox() {
        propertyDetailPage.verify_Check_Box_Is_Selected();
    }

    @And("^Verify the functionality of decline button on property detail page$")
    public void verify_the_functionality_of_decline_button() {
        propertyDetailPage.verify_Decline_Button();
    }

    @Then("^Verify that user able to view documents to download on property detail page$")
    public void verify_that_level_2_user_able_to_view_documents_to_download() {
        propertyDetailPage.verify_User_Should_be_Able_View_Documents();
    }

    @Then("^Verify that user able to view documents to download without lock icon on property detail page$")
    public void verify_that_level_2_user_able_to_view_documents_to_download_without_lock_icon() {
        propertyDetailPage.verify_User_Should_be_Able_View_Documents_Without_Lock_Icon();
    }

    @Then("^Verify user should be able to view the breadcrumb Market/Property Details$")
    public void verify_user_should_be_able_to_view_the_breadcrumb_market_property_details() {
        Assert.assertNotEquals("Actual and unexpected value are matching", "Market", propertyDetailPage.verify_Breadcrumbs_Functionality());
    }

    @Then("^Verify user should be able to view target returns data of property on property detail page$")
    public void verify_user_should_be_able_to_view_target_returns_data_of_property() {
        propertyDetailPage.verify_Target_Returns_Data();
    }

    @And("^Verify user should be able to view terms data of property on property detail page$")
    public void verify_user_should_be_able_to_view_terms_data_of_property() {
        propertyDetailPage.verify_Terms_Data();
    }

    @Then("^Verify user should be able to view financial details on property detail page$")
    public void verify_user_should_be_able_to_view_financial_details_on_property_detail_page() {
        propertyDetailPage.verify_Financials_Value();
    }

    @When("^User clicks on lock icon on property detail page$")
    public void user_clicks_on_lock_icon() {
        propertyDetailPage.verify_Lock_Icon_Over_Document();
    }

    @Then("^Verify user should be able to view error message when user clicks on lock icon on property detail page$")
    public void verify_user_should_be_able_to_view_error_message_when_user_clicks_on_lock_icon() {
        Assert.assertEquals("Document error message is not visible for locked document ", "This document cannot be viewed without being invested in the Asset", propertyDetailPage.verify_User_Should_Be_Able_To_View_Error());
    }

    @When("^User clicks on view all button on property detail page$")
    public void user_clicks_on_view_all_button() {
        propertyDetailPage.click_On_View_All_Btn();
    }

    @And("^Verify functionality of cross button on property detail page$")
    public void Verify_functionality_of_cross_button() {
        propertyDetailPage.verify_Cross_Btn_Functionality();
    }

    @Then("^Verify user should be able to view multiple owner of property on property detail page$")
    public void verify_user_should_be_able_to_view_multiple_owner_of_property() {
        propertyDetailPage.verify_Multiple_Owner_Of_Property();
    }

    @Then("^Verify user should be able to view count of owner on property detail page$")
    public void verify_user_should_be_able_to_view_count_of_owner() {
        propertyDetailPage.verify_Count_Of_Owner();
    }

    @And("^Verify user should be able to view asset name on property detail page$")
    public void verify_user_should_be_able_to_view_asset_name() {
        Assert.assertTrue("Property name is not visible", propertyDetailPage.verify_Asset_Name());
    }

    @And("^Verify user should be able to view AUM and properties count on property detail page$")
    public void verify_user_should_be_able_to_view_aum_and_properties_count() {
        propertyDetailPage.verify_Aum_And_Properties();
    }

    @Given("^User clicks on property name on market page$")
    public void user_clicks_on_property_name() {
        propertyDetailPage.verify_Property_Name();
    }

    @And("^User clicks on view gallery on property detail page$")
    public void user_clicks_on_view_gallery() {
        propertyDetailPage.click_On_Gallery_Image();
    }

    @Then("^Verify user should be able to navigate to image viewer page$")
    public void verify_user_should_be_able_to_navigate_to_image_viewer() {
        Assert.assertTrue(propertyDetailPage.verify_User_Navigate_To_Image_Viewer());
    }

    @Then("^Verify user should be able to view previous image on image viewer page$")
    public void verify_user_should_be_able_to_view_previous_image() {
        propertyDetailPage.verify_User_Should_Be_ABle_View_Previous_Image();
    }

    @And("^Verify user should be able to view next image on image viewer page$")
    public void verify_user_should_be_able_to_view_next_image() {
        propertyDetailPage.verify_User_Should_Be_ABle_View_Next_Image();
    }

    @Then("Verify user should be able to view select image on image viewer page$")
    public void verify_user_should_be_able_to_view_select_image() {
        propertyDetailPage.verify_User_Should_Be_ABle_To_Selected_Image();
    }

    @And("^User clicks on read more button on property detail page$")
    public void user_clicks_on_read_more_button() {
        propertyDetailPage.click_On_Read_More();
    }

    @Then("^Verify the functionality of read more over property description on property detail page$")
    public void verify_the_functionality_of_read_more_over_property_description() {
        Assert.assertTrue("Read less button is not visible", propertyDetailPage.verify_Read_More_Functionality());
    }

    @And("^User clicks on read less button on property detail page$")
    public void user_clicks_on_read_less_button() {
        propertyDetailPage.click_On_Read_Less();
    }

    @Then("^Verify the functionality of read less over property description on property detail page$")
    public void verify_the_functionality_of_read_less_over_property_description() {
        Assert.assertTrue("Read less button is not visible", propertyDetailPage.verify_Read_Less_Functionality());
    }

    @Then("^Verify user should be able to view map which opens up a new browser window on property detail page$")
    public void verify_user_should_be_able_to_view_map_which_opens_up_a_new_browser_window() {
        propertyDetailPage.verify_The_Functionality_Of_Map();
    }

    @And("^User clicks on view map on property detail page$")
    public void user_clicks_on_view_map() {
        propertyDetailPage.click_On_View_Map();
    }

    @Then("^Verify user should be able to view similar property like property name, location, class, units on property detail page$")
    public void verify_user_should_be_able_to_view_similar_property_like_property_name_location_class_units() {
        propertyDetailPage.verify_User_Should_Be_Able_To_View_Similar_Property_Data();
    }

    @And("^User scroll the screen and go to the similar property on property detail page$")
    public void user_scroll_the_screen_and_go_to_the_similar_property() {
        propertyDetailPage.verify_Similar_Property();
    }

    @Then("^Verify user should be able to view similar property like shares, owner on property detail page$")
    public void verify_user_should_be_able_to_view_similar_property_like_shares_owner() {
        propertyDetailPage.verify_User_Should_Be_Able_View_Similar_Property_Owner_Shares();
    }

    @Then("^Verify that user should be able to view document download in Pdf format on property detail page$")
    public void verify_that_user_should_be_able_to_view_document_download_in_Pdf_format() {
        Assert.assertTrue("Pdf title is not visible ", propertyDetailPage.verify_Pdf_Title());
    }

    @Then("^Verify user should be able to view section in middle of user screen on property detail page$")
    public void verify_user_should_be_able_to_view_section_in_middle_of_user_screen() {
        propertyDetailPage.verify_Menu_Tab_Should_Be_Clickable();
    }

    @And("^Verify the functionality of download the confidentiality agreement$")
    public void verify_Download_The_Confidential_Agreement() {
        propertyDetailPage.verify_Download_Confidential_Agreement();
    }

    @And("^Verify the functionality of proceed button on property detail page$")
    public void verify_The_Functionality_Of_Proceed_Button() {
        Assert.assertTrue("Proceed button is not visible ", propertyDetailPage.verify_Proceed_Button());
    }

    @And("^User clicks on market tab on KYC page$")
    public void user_clicks_on_market_tab_on_KYC_page() {
        propertyDetailPage.click_On_Market_Tab();
    }

    @Then("Verify A to Z filter of investing listing on sell order page")
    public void verifyAToZFilterOfInvestingListingOnSellOrderPage() {

    }


}



