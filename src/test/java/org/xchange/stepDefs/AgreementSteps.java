package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.AgreementPage;
import utils.PropertiesUtil;

import static org.xchange.base.BaseLib.driver;

public class AgreementSteps {
    AgreementPage agreementPage = new AgreementPage();

    @And("Scroll the page and User should not be able to view My Agreement section over Account Page")
    public void scroll_the_page_and_user_should_not_be_able_to_view_my_agreement_section_over_account_page() {
        agreementPage.verify_My_Agreement_Section_Not_View();
    }

    @Then("Verify the my agreements section below the communication references and which have > icon at extreme right on account page")
    public void verifyTheMyAgreementsSectionBelowTheCommunicationReferencesAndWhichHaveIconAtExtremeRightOnAccountPage() {
        Assert.assertTrue("My Agreement section with > icon is not displayed the communication references ",agreementPage.verify_My_Agreement_Section_On_Account_Page());
    }

    @And("^User able to clicks on angle bracket icon on account page$")
    public void user_able_to_clicks_on_angle_bracket_icon_on_account_page() {
        agreementPage.click_On_Angle_Bracket_Icon();
    }

    @Then("^User is on my agreements listing page and verify my agreement page$")
    public void user_is_on_my_agreements_listing_page_and_verify_my_agreement_page() {
        Assert.assertEquals("My Agreements", agreementPage.verify_My_Agreement_Page());
    }

    @And("^User should able to see breadcrumbs on agreement page$")
    public void user_should_able_to_see_breadcrumbs_on_agreement_page() {
        agreementPage.verify_Breadcrumbs();
    }

    @Then("User should able to see table format all listing signed agreements")
    public void user_should_able_to_see_table_format_all_listing_signed_agreements() {
        agreementPage.verify_Table_Format_All_Listing_Of_Signed_Agreement();
    }

    @And("^User should able to verify all list of document when user signed the confidentiality agreements on agreement page$")
    public void user_should_able_to_verify_all_list_of_document_when_user_signed_the_confidentiality_agreements_on_agreement_page() throws Throwable {
        agreementPage.verify_Agreement_List_On_Agreement_Page();
    }

    @And("User should be able to scroll page vertically to view full list of document")
    public void user_should_be_able_to_scroll_page_vertically_to_view_full_list_of_document() {
        agreementPage.scroll_Vertical_And_View_Full_List_Document();
    }

    @And("^User able to clicks on document view button on agreement page$")
    public void user_able_to_clicks_on_document_view_button_on_agreement_page() {
        agreementPage.click_On_Document_View_Button();
    }

    @Then("User able to view {string} agreement document on agreement page")
    public void userAbleToViewAgreementDocumentOnAgreementPage(String agreement) {
        Assert.assertEquals(agreement, agreementPage.verify_Pdf_View());
    }

    @And("^User clicks on document download button on my agreement page$")
    public void user_clicks_on_document_download_button_on_my_agreement_page() {
        agreementPage.click_On_Download_Button();
    }

    @Then("User should be able to download agreement in pdf on agreement page")
    public void userShouldBeAbleToDownloadAgreementInPdfOnAgreementPage() {
        agreementPage.verify_Agreement_Download_File();
    }
}
