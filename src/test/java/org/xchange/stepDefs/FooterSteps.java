package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.Footer;

public class FooterSteps {
    Footer footer = new Footer();

    @When("^User able to scroll down the page and view the footer$")
    public void user_able_to_scroll_down_the_page_and_view_the_footer() {
        footer.scroll_Till_Last_Property();
    }

    @Then("User should able to view resources as {string} and about as {string} headings on footer")
    public void userShouldAbleToViewResourcesAsAndAboutAsHeadingsOnFooter(String resources, String about) {
        Assert.assertEquals("Resources heading text is not matched on footer ", resources, footer.verify_Resources_Heading_Text());
        Assert.assertEquals("About heading text is not matched on footer ", about, footer.verify_About_Heading_Text());

    }

    @And("User should able to view resources subheadings {string} {string} {string}  on footer")
    public void userShouldAbleToViewResourcesSubheadingsOnFooter(String howItWorks, String resources, String support) {
        Assert.assertEquals("How it works subheading text is not matched on footer ", howItWorks, footer.verify_How_It_Works_SubHeading_Of_Resources());
        Assert.assertEquals("Resources subheading text is not matched on footer ", resources, footer.verify_Resources_SubHeading_Of_Resources());
        Assert.assertEquals("Support subheading text is not matched on footer ", support, footer.verify_Support_SubHeading_Of_Resources());
    }

    @And("User should able to view about subheadings {string} {string} {string}  on footer")
    public void userShouldAbleToViewAboutSubheadingsOnFooter(String aboutUs, String contactUs, String careers) {
        Assert.assertEquals("About us subheading text is not matched on footer ", aboutUs, footer.verify_About_Us_SubHeading_Of_About());
        Assert.assertEquals("Contact us subheading text is not matched on footer ", contactUs, footer.verify_Contact_Us_SubHeading_Of_About());
        Assert.assertEquals("Careers subheading text is not matched on footer ", careers, footer.verify_Careers_SubHeading_Of_About());
    }

    @And("User should able to view social platform like {string} {string} {string} on footer")
    public void userShouldAbleToViewSocialPlatformLikeOnFooter(String linkedIn, String twitter, String facebook) {
        Assert.assertEquals("LinkedIn text is not matched on footer ", linkedIn, footer.verify_LinkedIn_Social_Platform());
        Assert.assertEquals("Twitter text is not matched on footer ", twitter, footer.verify_Twitter_Social_Platform());
        Assert.assertEquals("Facebook text is not matched on footer ", facebook, footer.verify_Facebook_Social_Platform());
    }

    @And("^User should able to view henry overview on footer$")
    public void user_should_able_to_view_henry_overview_on_footer() {
        footer.verify_Henry_Overview_Text();
    }

    @And("User should able to view full disclosure as {string} on footer")
    public void userShouldAbleToViewFullDisclosureAsOnFooter(String fullDisclosure) {
        Assert.assertEquals("Full disclosure text is not matched on footer ", fullDisclosure, footer.verify_Full_Disclosure_On_Footer());
    }

    @And("User should able to view privacy policy as {string} on footer")
    public void userShouldAbleToViewPrivacyPolicyAsOnFooter(String privacyPolicy) {
        Assert.assertEquals("Privacy policy text is not matched on footer ", privacyPolicy, footer.verify_Privacy_Policy_On_Footer());
    }

    @And("User should able to view data security  as {string} on footer")
    public void userShouldAbleToViewDataSecurityAsOnFooter(String dataSecurity) {
        Assert.assertEquals("Data security text is not matched on footer ", dataSecurity, footer.verify_Data_Security_On_Footer());
    }

    @And("User should able to view terms of use  as {string} on footer")
    public void userShouldAbleToViewTermsOfUseAsOnFooter(String termsOfUse) {
        Assert.assertEquals("Terms of use text is not matched on footer ", termsOfUse, footer.verify_Terms_Of_Use_On_Footer());
    }

    @And("User should able to view website data collection process as {string} on footer")
    public void userShouldAbleToViewWebsiteDataCollectionProcessAsOnFooter(String websiteData) {
        Assert.assertEquals("Website data collection process text is not matched on footer ", websiteData, footer.verify_Website_Data_Collection_Process_On_Footer());
    }

    @When("User clicks on full disclosure link on footer")
    public void userClicksOnFullDisclosureLinkOnFooter() {
        footer.click_On_Full_Disclosure_link();
    }

    @Then("User should be successfully redirected to {string} link {string} separate tab")
    public void userShouldBeSuccessfullyRedirectedToLinkSeparateTab(String page ,String expectedEndPoint) {
        footer.verify_Redirection_Of_Bottom_Links(page,expectedEndPoint);
    }

    @And("User should be viewed successfully full disclosure link in the separate tab")
    public void userShouldBeViewedSuccessfullyFullDisclosureLinkInTheSeparateTab() {
        footer.verify_Full_Disclosure_Page();
    }

    @When("User clicks on privacy policy link on footer")
    public void userClicksOnPrivacyPolicyLinkOnFooter() {
        footer.click_On_Privacy_Policy_link();
    }

    @And("User should be viewed successfully privacy policy link in the separate tab")
    public void userShouldBeViewedSuccessfullyPrivacyPolicyLinkInTheSeparateTab() {
        footer.verify_Privacy_Policy_Page();
    }

    @When("User clicks on data security link on footer")
    public void userClicksOnDataSecurityLinkOnFooter() {
        footer.click_On_Data_Security_Link();
    }


    @And("User should be viewed successfully data security link in the separate tab")
    public void userShouldBeViewedSuccessfullyDataSecurityLinkInTheSeparateTab() {
        footer.verify_Data_Security_Page();
    }

    @When("User clicks on Terms of Use link on footer")
    public void userClicksOnTermsOfUseLinkOnFooter() {
        footer.click_On_Terms_Of_Use_Link();
    }


    @And("User should be viewed successfully Terms of Use link in the separate tab")
    public void userShouldBeViewedSuccessfullyTermsOfUseLinkInTheSeparateTab() {
        footer.verify_Terms_Of_Use_Page();
    }

    @When("User clicks on website data collection process link on footer")
    public void userClicksOnWebsiteDataCollectionProcessLinkOnFooter() {
        footer.click_On_Website_Data_Collection_Process_Link();
    }


    @And("User should be viewed successfully website data collection process link in the separate tab")
    public void userShouldBeViewedSuccessfullyWebsiteDataCollectionProcessLinkInTheSeparateTab() {
        footer.verify__Website_Data_Collection_Process_Page();
    }

    @When("User able to click on contact us on in about section on footer")
    public void userAbleToClickOnContactUsOnInAboutSectionOnFooter() {
        footer.click_On_ContactUs();
    }


}
