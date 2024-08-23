package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.LoginPage;
import utils.PropertiesUtil;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    @When("^User clicks on login button on home page$")
    public void user_clicks_on_login_button() {
        loginPage.clicks_On_Login();
    }

    @Given("^User is on login page$")
    public void user_is_on_login_page() {
        Assert.assertEquals("Login page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "login", loginPage.verify_Login_Screen());
    }

    @When("^User enters a email on login page in input field - (.+)$")
    public void user_enters_a_email_on_login_page_in_input_field(String email) {
        loginPage.set_Email(email);
    }

    @And("^User enters a password on login page in input field - (.+)$")
    public void user_enters_a_password_on_login_page_in_input_field(String password) {
        loginPage.set_Password(password);
    }

    @When("^User clicks on enter button on login page$")
    public void user_clicks_on_enter_button() {
        loginPage.click_On_Enter_Btn();
    }

    @Then("^Verify skip email and password fields on login page and click on Enter button$")
    public void verify_skip_email_and_password_fields_on_login_page_and_click_on_Enter_button() {
        Assert.assertFalse("Enter button is enabled ", loginPage.verify_Disabled_Enter_Button());
    }

    @Then("^Verify user should be successfully login and redirect to market page")
    public void verify_user_should_be_successfully_login_and_redirect_to_market_page() {
        loginPage.user_Navigate_To_Market_Screen();
    }

    @Then("^Verify that error message should be shown as account details are incorrect Please try again on login page$")
    public void verify_that_error_message_should_be_shown_as_account_details_are_incorrect_Please_try_again() {
        Assert.assertEquals("Account details are incorrect, please try again.", loginPage.verify_Popup_At_Login_With_Invalid_Credential());
    }

    @Then("^Verify Link should be clickable and user redirected to the terms page$")
    public void verify_Link_should_be_clickable_and_user_redirected_to_the_terms_page() {
        Assert.assertEquals("Terms page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "terms", loginPage.verify_Redirection_Of_Hyper_Links());
    }

    @Then("^verify Link should be clickable and user redirected to the legal page$")
    public void verify_Link_should_be_clickable_and_user_redirected_to_the_legal_page() {
        Assert.assertEquals("Legal page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "legal", loginPage.verify_Redirection_Of_Hyper_Links());
    }

    @When("^Users click on create one hyper link on login page$")
    public void users_click_on_create_one_hyper_link_on_login_page() {
        loginPage.click_On_Create_One_Hyper_Link();
    }

    @Then("^Verify the functionality when user click on hyper link Create a new account on login page$")
    public void verify_the_functionality_when_user_click_on_hyper_link_create_a_new_account() {
        Assert.assertEquals("Sign up page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "signUp", loginPage.verify_Redirection_Of_Hyper_Links());
    }

    @Then("^Verify functionality of eye icon over Password field on login page$")
    public void verify_functionality_of_eye_icon_over_password_field() {
        loginPage.verify_Password_Icon();
    }


    @When("^User clicks on legal hyper link on login page$")
    public void users_click_on_legal_hyper_link_on_login_page() {
        loginPage.click_On_Legal_Page();
    }

    @When("^User clicks on terms link on login page$")
    public void users_click_on_terms_page() {
        loginPage.click_On_terms_Page();
    }

    @When("^User clicks on forgot password on login page$")
    public void user_clicks_on_forgot_password_login_page() {
        loginPage.click_On_Forgot_Password();
    }

    @Then("^To verify that if blocked user try to login on login page$")
    public void to_verify_that_if_blocked_user_try_to_login() {
        Assert.assertEquals("Account Locked", loginPage.verify_If_Blocked_User_Try_To_Login());
    }

    @When("^Users enters a invalid format email on login page in input field - (.+)$")
    public void users_enters_a_invalid_format_email_on_login_page_in_input_field(String email) {
        loginPage.enter_Incorrect_Format_In_Email(email);
    }

    @Then("^User should able to enter max password by 12 on login page$")
    public void verify_Password_Validation() {
        loginPage.check_Validation_In_Password_Field();
    }

    @Then("^Verify error message should be visible below the email input field on login page$")
    public void verify_error_message_should_be_visible_below_the_field() {
        Assert.assertEquals("Please enter a valid Email Address.", loginPage.verify_Error_Message_Of_Email_Field());
    }

    @Then("^User removes email from email field on login page$")
    public void user_removes_email_from_email_field_on_login_page() {
        loginPage.remove_Email_From_Email_Field();
    }


}
