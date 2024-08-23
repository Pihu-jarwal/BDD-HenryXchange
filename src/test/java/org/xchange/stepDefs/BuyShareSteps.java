package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.BuySharePage;
import utils.PropertiesUtil;

public class BuyShareSteps {

    BuySharePage buySharePage = new BuySharePage();

    @When("^User clicks on buy button over any property card on market page$")
    public void user_clicks_on_buy_button_over_any_property_card_on_market_page() {
        buySharePage.click_On_Market_Buy_Btn();
    }

    @When("^User clicks on buy button over property card on market page$")
    public void user_clicks_on_buy_button_over_property_card_on_market_page() {
        buySharePage.click_On_Level_2_Market_Buy();
    }

    @Then("^Verify user should be able to navigate to Buy Shares Page$")
    public void verify_user_should_be_able_to_navigate_to_Buy_Shares_Page() {
        Assert.assertEquals("Buy share page is not visible", "Market\n" + "/\n" + "Property Details\n" + "/\n" + "Buy", buySharePage.verify_Buy_Page());
    }

    @When("^User clicks on Buy button in Right side section just below the Market Estimate on property detail page$")
    public void user_clicks_on_Buy_button_in_Right_side_section_just_below_the_Market_Estimate() {
        buySharePage.click_On_Property_Buy_Btn();
    }

    @Then("^User scroll down to the bottom on property detail page$")
    public void user_scroll_down_to_the_bottom_on_property_detail_page() {
        buySharePage.scroll_Property_Page();
    }

    @Then("^User clicks on Buy Button in Similar properties on property detail page$")
    public void User_clicks_on_Buy_Button_in_Similar_properties() {
        buySharePage.click_On_similar_Property_Buy_Btm();
    }

    @And("^Verify user should be able to view all Available shares are grayed out on buy share page$")
    public void verify_user_should_be_able_to_view_all_Available_shares_are_grayed_out() {
        buySharePage.verify_Available_Share();
    }

    @And("^Verify user entered a valid value (.+) for Shares or USD over respective field on buy share page$")
    public void verify_user_entered_a_valid_value_for_Shares_or_USD_over_respective_field(String shareValue) {
        buySharePage.enter_Shares_In_Input_Field(shareValue);
    }

    @And("^Verify entered valid value for shares or USD on buy share page$")
    public void verify_entered_valid_value_for_shares_or_USD_on_buy_share_page() {
        buySharePage.verify_Share_Value();
    }

    @When("^User hover the cursor on Market Estimate Text on buy share page$")
    public void user_hover_the_cursor_on_Market_Estimate_Text_on_buy_share_page() {
        buySharePage.click_On_Market_Estimate();
    }

    @Then("^Verify user able to view Tooltip with the following details on market estimate on buy share page$")
    public void verify_user_should_be_able_to_view_Tooltip_with_the_following_details() {
        Assert.assertTrue("Tooltip is not visible ", buySharePage.validate_Tooltip_Market_Estimate());
    }

    @When("^User clicks on the Toggle button on buy share page$")
    public void user_clicks_on_the_Toggle_button_on_buy_share_page() {
        buySharePage.click_On_Toggle_Btn();
    }

    @Then("^Verify should move to the USD option on buy share page$")
    public void verify_should_move_to_the_USD_option_on_buy_share_page() {
        Assert.assertTrue("USD option did not select", buySharePage.verify_USD_Toggle());
    }

    @Then("^Verify by default, the toggle button will be set to Shares Option$")
    public void verify_by_default_the_toggle_button_will_be_set_to_Shares_Option() {
        Assert.assertFalse("Share option does not set by default", buySharePage.verify_USD_Toggle());
    }

    @Then("^User enters shares (.+) in input field on buy share page$")
    public void user_enters_shares_in_input_field(String shareValue) {
        buySharePage.enter_Shares_Count_In_Input_Field(shareValue);
    }

    @Then("^Verify buy share button is enabled on buy share page$")
    public void verify_buy_share_button_is_enabled_on_buy_share_page() {
        Assert.assertTrue("Buy button is disable ", buySharePage.verify_Buy_Btn_Is_Enabled());
    }

    @Then("^Verify toolTip will show When user hovers on the Buy Shares Button on buy share page$")
    public void verify_toolTip_will_show_When_user_hovers_on_the_Buy_Share_Button_on_buy_share_page() {
        Assert.assertTrue("Tooltip is not visible ", buySharePage.validate_Tooltip());
    }

    @Then("^User enters a value greater than the share listed for Sale in enter share input field on buy share page$")
    public void user_enters_a_value_greater_than_the_share_listed_for_Sale_on_buy_share_page() {
        buySharePage.enter_Value_In_Share_Field();
    }

    @And("^User enters any valid amount in Enter USD dollar field on buy share page$")
    public void user_enters_any_valid_amount_in_Enter_USD_dollar_field_on_buy_share_page() {
        buySharePage.enter_Usd_In_Input_Field();
    }

    @Then("^Verify system will select shares no which can be buy in this amount calculate the total investment amount$")
    public void verify_system_will_select_no_of_shares_which_can_be_buy_in_this_amount() {
        buySharePage.verify_share_And_Investment_Data();
    }

    @Then("^User clicks on buy shares button on  buy share page$")
    public void user_clicks_on_buy_shares_button_on_buy_share_page() {
        buySharePage.click_On_Buy_Share_Btn();
    }

    @Then("^Verify user will be redirected to the “Fund Your Purchase” page$")
    public void verify_user_will_be_redirected_to_the_Fund_Your_Purchase_page() {
        Assert.assertEquals("Fund your purchase is not visible", "Fund Your Purchase", buySharePage.verify_Fund_Your_Purchase_Page());
    }

    @And("^User clicks on the Cancel Purchase button on fund your purchase page$")
    public void user_click_on_the_Cancel_Purchase_button_on_buy_share_page() {
        buySharePage.click_On_Cancel_Purchase();
    }

    @Then("^Verify user should be able to view cancel popup on fund your purchase page$")
    public void verify_user_should_be_able_to_view_Are_you_sure_you_want_to_cancel_the_purchase() {
        Assert.assertTrue("Cancel popup is not visible ", buySharePage.verify_Cancel_Popup());
    }

    @Then("^Verify user should be able to view cancel popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_cancel_popup_on_confirm_your_purchase_page() {
        Assert.assertTrue("Cancel popup is not visible ", buySharePage.verify_Cancel_Popup());
    }

    @And("^User clicks on Edit button on Fund your purchase page$")
    public void user_clicks_on_Edit_button_on_Fund_your_purchase_page() {
        buySharePage.click_On_Edit_Button();
    }

    @Then("^Verify User will show all the previous data entered on buy share page$")
    public void verify_user_will_show_all_the_previous_data_entered_on_buy_share_page() {
        Assert.assertTrue("Share value is 0", buySharePage.validate_Previous_Data_On_Buy_Page());
    }

    @Then("^Verify user should be able to  edit previous data on buy share page$")
    public void verify_user_can_edit_that_data_on_buy_share_page() {
        buySharePage.validate_User_Can_Edit_Data();
    }

    @Then("^User should be able to view cancel Pop-up with the following details on fund your purchase page$")
    public void user_should_be_able_to_view_Pop_up_with_the_following_details_on_buy_share_page() {
        Assert.assertEquals("Are you sure you want to\n" + "cancel the purchase?", buySharePage.verify_Cancel_Popup_Heading());
        Assert.assertEquals("Your selected shares will be released from hold\n" + "if you cancel the purchase.", buySharePage.verify_Cancel_Popup_Sub_Heading());
        Assert.assertTrue("Continue and cancel btn is not visible", buySharePage.validate_Cancel_Continue_Btn_On_Cancel_Popup());
    }

    @Then("^User clicks on the \"Yes,Cancel\" button on fund your purchase page$")
    public void user_clicks_on_the_Yes_Cancel_button_on_fund_your_purchase_page() {
        buySharePage.click_On_Yes_Cancel_Btn();
    }

    @Then("^User clicks on the \"Yes,Cancel\" button on confirm your purchase page$")
    public void user_clicks_on_the_Yes_Cancel_button_on_confirm_your_purchase_page() {
        buySharePage.click_On_Yes_Cancel_Btn();
    }

    @And("^Verify user should be able to navigate to \"Buy Shares” page. and, the purchase will be canceled$")
    public void verify_user_should_be_able_to_navigate_to_Buy_Shares_page_and_the_purchase_will_be_canceled() {
        Assert.assertEquals("Buy share page is not visible", "Market\n" + "/\n" + "Buy", buySharePage.verify_Buy_Page());
    }

    @When("^User clicks on the \"Confirm Purchase\" button on fund your purchase page$")
    public void user_clicks_on_the_Continue_Purchase_button_on_fund_your_purchase_page() {
        buySharePage.click_On_Confirm_Purchase_Btn();
    }

    @And("^Verify user should navigate to confirm your purchase page$")
    public void user_should_navigate_on_2FA_verification_page() {
        Assert.assertEquals("Confirm your purchase page is not visible", "Confirm Your Purchase", buySharePage.validate_Confirm_Your_Purchase());
    }

    @Then("^User clicks on the Cancel purchase button on confirm your purchase page$")
    public void user_clicks_on_the_Cancel_purchase_button_on_fund_your_purchase_page() {
        buySharePage.click_On_Cancel_Purchase();
    }

    @Then("^User should be able to view Are you sure you want to cancel the purchase? Pop-up$")
    public void user_should_be_able_to_view_Are_you_sure_you_want_to_cancel_the_purchase() {
        Assert.assertEquals("Are you sure you want to\n" + "cancel the purchase?", buySharePage.verify_Cancel_Popup_Heading());
        Assert.assertEquals("Your selected shares will be released from hold\n" + "if you cancel the purchase.", buySharePage.verify_Cancel_Popup_Sub_Heading());
        Assert.assertTrue("Continue and cancel btn is not visible on cancel popup", buySharePage.validate_Cancel_Continue_Btn_On_Cancel_Popup());
    }

    @Then("^User clicks on the \"Continue Purchase\" button over the popup on confirm purchase page$")
    public void user_clicks_on_the_Continue_Purchase_button_over_the_popup_on_confirm_purchase_page() {
        buySharePage.click_On_Continue_Purchase();
    }

    @Then("^Verify User should be able to view pop-up is dismissed and user stay's on Confirm your purchase page$")
    public void verify_user_should_be_able_to_view_pop_up_is_dismissed_and_user_stay_s_on_Confirm_your_purchase_page() {
        Assert.assertFalse("Cancel popup is visible ", buySharePage.verify_Cancel_Popup());
    }

    @And("^User clicks on the Continue button on confirm your purchase page$")
    public void user_clicks_on_the_Continue_button_on_confirm_your_purchase_page() {
        buySharePage.click_On_Continue_Btn();
    }

    @Then("^Verify user should be able to navigate to Two Factor Authentication popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_navigate_to_Two_Factor_Authentication_page() {
        Assert.assertTrue("Two factor authentication popup is not visible", buySharePage.validate_Verification_Popup());
    }

    @Then("^User should be able to view details on Two Factor Authentication popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_Following_details_on_verification_popup_on_confirm_your_purchase_page() {
        Assert.assertEquals("Actual and expected value are mismatch", "Choose the verification method to verify your identity.", buySharePage.verify_Text_On_Verification_Pop_Up());
        Assert.assertTrue("Two factor authentication popup is not visible", buySharePage.validate_Verification_Popup());
    }

    @And("^Verify SMS Text by-default selected on Two Factor Authentication popup on confirm your purchase page$")
    public void verify_SMS_Text_message_is_by_default_selected_on_confirm_your_purchase_page() {
        Assert.assertTrue("SMS is not by default selected", buySharePage.verify_Sms_Radio_Btn_Is_Selected());
        Assert.assertFalse("Email is by default selected", buySharePage.verify_email_Radio_Btn_Is_Selected());
    }

    @Then("^User clicks on \"Email\" option on Two Factor Authentication popup on confirm your purchase page$")
    public void user_clicks_on_Email_option_on_Two_Factor_Authentication_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Email_Radio_Btn();
    }

    @And("^User should be able to view Email option is selected and SMS Text option is deselected$")
    public void user_should_be_able_to_view_Email_option_is_selected_and_SMS_Text_option_is_deselected() {
        Assert.assertTrue("Email radio button is not selected", buySharePage.verify_email_Radio_Btn_Is_Selected());
        Assert.assertFalse("SMS radio button is selected", buySharePage.verify_Sms_Radio_Btn_Is_Selected());
    }

    @Then("^User clicks on \"SMS Text\" option on Two Factor Authentication popup on confirm your purchase page$")
    public void user_clicks_on_SMS_Text_option_on_Two_Factor_Authentication_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_SMS_Radio_Btn();
    }

    @And("^User should be able to view SMS Text option is selected and Email option is deselected$")
    public void user_should_be_able_to_view_SMS_Text_option_is_selected_and_Email_option_is_deselected() {
        Assert.assertTrue("SMS radio button is not selected", buySharePage.verify_Sms_Radio_Btn_Is_Selected());
        Assert.assertFalse("Email radio button is selected", buySharePage.verify_email_Radio_Btn_Is_Selected());
    }

    @Then("^User clicks on \"cancel Button\" on Two Factor Authentication popup on confirm your purchase page$")
    public void user_clicks_on_cancel_Button_on_Two_Factor_Authentication_popup() {
        buySharePage.click_On_Cancel_Btn();
    }

    @And("^User able to view email option is selected on Two Factor Authentication popup on confirm your purchase page$")
    public void Verify_user_should_be_able_to_view_email_option_is_selected() {
        Assert.assertTrue("Email radio button is not selected", buySharePage.verify_email_Radio_Btn_Is_Selected());
    }

    @Then("^User able to view SMS option is selected on Two Factor Authentication popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_SMS_Text_option_is_selected() {
        Assert.assertTrue("SMS radio button is not selected", buySharePage.verify_Sms_Radio_Btn_Is_Selected());
    }

    @Then("^User clicks outside the pop-up on Two Factor Authentication popup on confirm your purchase page$")
    public void user_clicks_outside_the_pop_up_on_Two_Factor_Authentication_popup() {
        buySharePage.click_On_Outside_The_Popup();
    }

    @Then("^Verify user should be able to navigate to Confirm your purchase page$")
    public void verify_user_should_be_able_to_navigate_to_Confirm_your_purchase_page() {
        Assert.assertTrue("Two factor authentication popup is visible", buySharePage.validate_Verification_Popup());
    }

    @When("^User must click on the Confirm button Two Factor Authentication popup on confirm your purchase page$")
    public void user_must_click_on_the_Confirm_button_Two_Factor_Authentication_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Confirm_Btn();
    }

    @Then("^User should be able to view Two Factor Auth verification Pop-up for Email OTP confirm your purchase page$")
    public void user_should_be_able_to_view_Two_Factor_Auth_verification_Pop_up() {
        Assert.assertTrue("Two factor auth popup is not visible", buySharePage.verify_Two_Factor_Auth_Popup());
    }

    @And("^User able to view details placeholder text, SMS text, OTP sent on auth popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_following_details() {
        buySharePage.validate_Two_Factor_Auth_UI();
    }

    @Then("^User enters 6 digit (.+) code in otp field on two factor auth popup on confirm your purchase page$")
    public void user_enters_6_digit_code_in_otp_field_on_two_factor_auth_popup_on_confirm_your_purchase_page(String otp) {
        buySharePage.set_OTP(otp);
    }

    @Then("^User should be able to view Two Factor Auth verification Pop-up for SMS OTP confirm your purchase page$")
    public void user_should_be_able_to_view_Two_Factor_Auth_verification_Pop_up_for_SMS_text() {
        Assert.assertTrue("Two factor auth popup is not visible", buySharePage.verify_Two_Factor_Auth_Popup());
    }

    @And("^Verify user should be able to view ID verified pop-up$")
    public void verify_user_should_be_able_to_view_ID_verified_pop_up() {
        Assert.assertTrue("Verified popup is not visible", buySharePage.verify_Id_Verified_PopUp());
    }

    @And("^User clicks on \"Confirm\" Button on two factor auth popup on confirm your purchase page$")
    public void user_clicks_on_Confirm_Button_on_two_factor_auth_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Confirm_Code_Btn();
    }

    @Then("^Verify user able to view Confirm Code button Disabled on two factor auth popup on confirm your purchase page$")
    public void verify_user_able_to_view_Confirm_Code_button_Disabled_on_auth_popup_on_confirm_your_purchase_page() {
        Assert.assertFalse("Confirm code button is not disable", buySharePage.is_Confirm_Btn_Disable());
    }

    @Then("^User removes code from otp box on two factor auth popup on confirm your purchase page$")
    public void user_removes_code_from_otp_box_on_two_factor_auth_popup_on_confirm_your_purchase_page() {
        buySharePage.remove_Code_From_Otp_Box();
    }

    @Then("^User should able to view error message when user failed due to more than three attempts$")
    public void verify_user_should_be_able_to_view_error_message_on_Two_Factor_Authentication_popup() {
        Assert.assertEquals("Actual and expected result are mismatched", "Verification failed due to more than three (3) attempts, please try again", buySharePage.validate_Code_Expired_Error());
    }

    @Then("^Verify user should be able to view error message when user entered incorrect otp on two factor auth popup$")
    public void verify_user_should_be_able_to_view_error_message_when_user_entered_incorrect_otp_in_otp_field() {
        Assert.assertEquals("Actual and expected result are mismatched", "The six (6) digit code you entered is incorrect, please be sure the code entered is exactly as it appears in your email/SMS", buySharePage.validate_Code_Expired_Error());
    }

    @When("^User clicks on resend code link on two Factor Auth verification popup on confirm your purchase page$")
    public void user_clicks_on_resend_code_link_on_two_Factor_Authentication_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Resend_Code_Link();
    }

    @Then("^User should able to get another code send to preferred method on two Factor Auth verification popup$")
    public void user_should_be_able_to_get_another_code_send_to_preferred_method_on_two_Factor_Authentication_popup_on_confirm_your_purchase_page() {
        buySharePage.validate_Resend_Code_Link_Msg();
    }

    @And("^User clicks on use another method link on two Factor Auth verification popup on confirm your purchase page$")
    public void user_clicks_on_use_another_method_link_on_two_Factor_Auth_verification_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Use_Another_Method_Link();
    }

    @Then("^Verify user should be able to view sub text on ID verified pop-up on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_header_id_and_sub_header_id_on_ID_verified_pop_up() {
        Assert.assertTrue("Sub text is not visible", buySharePage.verify_Sub_Heading_Of_Verification_Pop_Up());
    }

    @Then("^Verify ID verified popup should get closed in 3 seconds$")
    public void verify_ID_verified_popup_should_get_closed_in_3_seconds() {
        Assert.assertTrue("ID verified popup did not close in 3 seconds", buySharePage.verify_Closed_Verified_Popup());
    }

    @Then("^User clicks on cross icon at right top on ID verified pop-up on confirm your purchase page$")
    public void user_clicks_on_cross_icon_at_right_top_on_ID_verified_pop_up_on_confirm_your_purchase_page() {
        buySharePage.click_On_Close_Icon();
    }

    @Then("^Verify user should be able to navigate to \"Buy Shares>>Agree To Terms\" page$")
    public void verify_user_should_be_able_to_navigate_to_buy_shares_agree_to_terms_page() {
        Assert.assertEquals("Agree to terms popup is not visible", "Agree to Terms", buySharePage.verify_Terms_page());
    }

    @Then("^User should able to view confirm Your Purchase page with \"Preparing Contract\" Loader right side of page$")
    public void user_should_able_to_view_confirm_your_purchase_page_with_preparing_contract_loader_right_side_of_page() {
        Assert.assertTrue("Preparing contract is not visible", buySharePage.verify_Closed_Verified_Popup());
    }

    @Then("^Verify the UI of Agree to terms Pop-up on confirm your purchase page$")
    public void verify_the_UI_of_agree_to_terms_pop_up_on_confirm_your_purchase_page() {
        Assert.assertTrue("Property name is not visible", buySharePage.validate_Property_Name_On_Agree_To_terms());
        Assert.assertTrue("Download icon is not visible", buySharePage.verify_Download_Icon_Visible());
        Assert.assertTrue("Cross icon is not visible", buySharePage.verify_Close_Icon_Visible());
        Assert.assertTrue("Agreement section is not visible", buySharePage.verify_Agreement_Section());
    }

    @Then("^Verify user should able to view \"Enter Your Initials\" field disabled on agree to terms popup$")
    public void user_should_able_to_view_enter_your_initials_field_disabled_on_agree_to_terms_popup() {
        Assert.assertFalse("Enter your initials field is not disabled", buySharePage.validate_Enter_your_Initial_Field());
    }

    @When("^User scroll till the bottom of the Agreement popup on confirm your purchase$")
    public void user_scroll_till_the_bottom_of_the_agreement_popup_on_confirm_your_purchase() {
        buySharePage.Scroll_Pdf_On_Agree_To_Terms();
    }

    @Then("^Verify user should able to view \"Enter Your Initials\" field active on agree to terms popup$")
    public void user_should_able_to_view_enter_your_initials_field_active_on_agree_to_terms_popup() {
        Assert.assertTrue("Enter your initials field is disabled", buySharePage.validate_Enter_your_Initial_Field());
    }

    @And("^Verify Only allow caps alpha character in initials field on agree popup on confirm your purchase page$")
    public void verify_allow_caps_alpha_character_in_initials_field_on_agree_to_terms_popup() {
        Assert.assertFalse("Initial value is empty", buySharePage.check_Validation_In_Initial_Field().isEmpty());
        Assert.assertTrue("Alphabet is visible in small letter", buySharePage.check_Validation_In_Initial_Field().matches("[A-Z]+$"));
    }

    @And("^User removes initials value from initials field on agree to terms popup on confirm your purchase page$")
    public void user_removes_initials_value_from_initials_field_on_agree_to_terms_popup_on_confirm_your_purchase_page() {
        buySharePage.remove_Value_From_Initial_Field();
    }

    @And("^Verify validate minimum two character allowed in initials field on agree popup on confirm your purchase page$")
    public void verify_validate_minimum_character_allowed_in_enter_your_initials_field_on_agree_popup() {
        Assert.assertTrue("Initial value is less than 2", buySharePage.validate_Initial_Field() >= 2);
    }

    @When("^User enters value (.+) in enter your initials field on agree to terms popup on confirm your purchase page$")
    public void user_enters_value_in_enter_your_initials_field_on_agree_to_terms_popup_on_confirm_your_purchase_page(String initialValue) {
        buySharePage.set_Initial_Value(initialValue);
    }

    @Then("^Verify validate maximum three characters allowed in initials field on agree popup$")
    public void verify_validate_maximum_three_characters_allowed_in_initials_field_on_agree_popup() {
        Assert.assertFalse("Initial value is empty", buySharePage.check_Validation_In_Initial_Field().isEmpty());
        Assert.assertTrue("Initial value is More than 3", buySharePage.validate_Initial_Field() <= 3);
    }

    @And("^User clicks on agree to continue button on agree to terms popup on confirm your purchase page$")
    public void user_clicks_on_agree_to_continue_button_on_agree_to_terms_popup_on_confirm_your_purchase_page() {
        buySharePage.click_On_Agree_To_Terms_Btn();
    }

    @Then("^Verify character match the first name of First/middle/last name should same as user name in initial field$")
    public void verify_character_match_the_first_letter_of_the_first_middle_last_name_should_same_as_user_name() {
        Assert.assertTrue("value is mismatching", buySharePage.validate_Profile_First_Last_Name());
    }

    @And("Verify Input must be an Alpha character in initials field on agree popup on confirm your purchase page")
    public void verify_input_must_be_alpha_character_in_initials_field_on_agree_popup_on_confirm_your_purchase_page() {
        Assert.assertTrue("Initial value does not contain alpha character", buySharePage.check_Validation_In_Initial_Field().matches("[a-zA-Z]+$"));
    }

    @Then("^User should able to view error message below the initial field on agree terms popup on confirm your purchase page$")
    public void verify_user_should_be_able_to_view_error_message_below_the_initial_value() {
        Assert.assertEquals("Error msg is visible", "Your initials must match with the name you used to verify your ID.", buySharePage.validate_Error_Msg());
    }

    @Then("^Verify user will again be redirected to the Agree to Terms popup with some checkboxes in the description$")
    public void verify_user_will_again_be_redirected_to_the_popup_with_some_checkboxes_in_the_description() {
        Assert.assertTrue("Agree popup is not visible with checkbox", buySharePage.validate_Agree_To_Terms_Checkbox_Popup());
    }

    @And("^User able to view details like property name, placeholder on agree checkboxes popup on confirm purchase page$")
    public void user_able_to_view_details_like_property_name_placeholder_on_agree_checkbox_popup() {
        Assert.assertEquals("Agree to Terms", buySharePage.verify_Agree_To_Terms_Placeholder_Name());
        Assert.assertTrue("Property name is not visible on agree popup", buySharePage.validate_Property_Name_On_Agree_Popup());
    }

    @Then("Verify user able to view details like agreement description,agree btn, cross icon on agree checkbox popup")
    public void verify_user_able_to_view_details_like_agreement_description_agree_btn_cross_icon_on_agree_checkbox_popup() {
        Assert.assertTrue("Agreement description is not visible", buySharePage.validate_Agreement_Description());
        Assert.assertTrue("Cross icon is not visible", buySharePage.verify_Close_Icon_Visible());
        Assert.assertTrue("Agree to terms btn is not visible", buySharePage.check_Visibility_Of_Agree_Btn());
    }

    @When("^User clicks on cross icon at right top on agree popup with checkboxes on confirm your purchase page$")
    public void user_clicks_on_cross_icon_at_right_top_on_agree_popup_with_checkboxes_on_confirm_your_purchase_page() {
        buySharePage.click_On_Cross_Icon();
    }

    @Then("^User should be able to view pop-up will disappear over agree popup with checkbox on confirm your purchase page$")
    public void user_should_be_able_to_view_pop_up_will_disappear_over_agree_popup_with_checkbox() {
        Assert.assertEquals("Are you sure you want to\n" + "cancel the purchase?", buySharePage.verify_Cancel_The_Purchase_Popup());
    }

    @When("^User clicks on yes cancel button on cancel popup on agree popup with checkbox on confirm your purchase page$")
    public void user_clicks_on_yes_cancel_button_on_cancel_popup_on_agree_popup_with_checkbox_on_confirm_your_purchase_page() {
        buySharePage.click_On_Yes_Cancel_Btn();
    }

    @Then("^User able to view uncheck box on agree popup with checkbox on confirm your purchase page$")
    public void user_able_to_view_uncheck_box_on_agree_to_terms_popup_on_confirm_your_purchase_page() {
        Assert.assertFalse("Checkbox is checked", buySharePage.is_Checkbox_Uncheck());
    }

    @When("User check the checkbox over description on agree popup with checkbox on confirm your purchase page")
    public void user_check_the_checkbox_over_description_on_agree_popup_with_checkbox_on_confirm_your_purchase_page() {
        buySharePage.click_On_Checkbox();
    }

    @Then("^User able to view checkbox and make the checkbox on agree popup with checkbox on confirm your purchase page$")
    public void user_able_to_view_checkbox_and_make_the_checkbox_on_agree_popup_with_checkbox_on_confirm_purchase_page() {
        buySharePage.is_Checkbox_Uncheck();
    }

    @Then("^User able to click on checkbox again and make them uncheck box on agree checkbox popup on confirm page$")
    public void user_able_to_click_on_checkbox_again_and_make_them_uncheck_box_on_agree_checkbox_popup() {
        Assert.assertTrue("Did not click on checkbox", buySharePage.click_On_Checkbox());
        Assert.assertFalse("Checkbox is checked", buySharePage.is_Checkbox_Uncheck());
    }

    @And("User have to check all box to Continue the purchase on agree popup with checkbox on confirm your purchase page")
    public void user_have_to_check_all_box_to_continue_the_purchase_on_agree_popup_with_checkbox_on_confirm_your_purchase_page() {
        buySharePage.click_On_Checkboxes();
        Assert.assertTrue("Checkbox is checked", buySharePage.is_Checkbox_Uncheck());
    }

    @Then("Verify user should able to view Agree Continue button disabled on agree terms popup on confirm purchase page")
    public void user_should_able_to_view_agree_continue_button_disabled_on_agree_terms_popup_on_confirm_purchase_page() {
        Assert.assertFalse("Agree and continue btn is enabled", buySharePage.is_Agree_Btn_Enabled());
    }

    @And("Verify user should able to view agree continue button Active on agree terms popup on confirm purchase page")
    public void verify_user_able_to_view_agree_continue_button_active_on_agree_terms_popup_on_confirm_purchase_page() {
        Assert.assertTrue("Agree and continue btn is disabled", buySharePage.is_Agree_Btn_Enabled());
    }

    @Then("^Verify user should be able to navigate to the Purchase details page$")
    public void verify_user_should_be_able_to_navigate_to_the_purchase_details_page() {
        Assert.assertEquals("Purchase detail is not visible", "Your purchase is complete.", buySharePage.validate_Purchase_Detail());
    }

    @Then("Verify user clicks on view portfolio and should able to navigate to portfolio page with updated information")
    public void Verify_user_clicks_on_view_portfolio_and_should_able_to_navigate_to_the_portfolio_page() {
        Assert.assertTrue("", buySharePage.validate_Property_Name_On_Purchase_Detail());
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("URL") + "portfolio", buySharePage.verify_Portfolio_Page());
    }

    @And("^Verify user should be able to view purchase summary on purchase detail page$")
    public void verify_user_should_be_able_to_view_purchase_summary_on_purchase_detail_page() {
        Assert.assertTrue("Purchase summary is not visible", buySharePage.verify_Purchase_Summary_Data());
    }

    @And("^Verify user should be able to view transfer summary on purchase detail page$")
    public void verify_user_should_be_able_to_view_transfer_summary_on_purchase_detail_page() {
        Assert.assertTrue("Transfer summary is not visible", buySharePage.verify_Transfer_Summary_Data());
    }

    @And("^Verify user should be able to view balance summary on purchase detail page$")
    public void verify_user_should_be_able_to_view_balance_summary_on_purchase_detail_page() {
        Assert.assertTrue("Balance summary is not visible", buySharePage.verify_Balance_Summary_Data());
    }

    @And("^Verify User should be able to view breadcrumbs on purchase detail page$")
    public void verify_user_should_be_able_to_view_bread_crumbs_on_purchase_detail_page() {
        Assert.assertTrue("Breadcrumbs is not visible", buySharePage.verify_Breadcrumbs_On_Purchase_Detail());
    }

    @Then("^Verify breadcrumb user clicks on market then the user should redirect to the market page$")
    public void verify_bread_crumb_user_clicks_on_market_then_the_user_should_redirect_to_the_market_page() {
        Assert.assertEquals("Actual and expected are mismatched", PropertiesUtil.getEnvironmentKey("URL") + "market", buySharePage.verify_Market_BreadCrumb());
    }

    @And("^Verify breadcrumb user clicks on the Property details then user should redirect to the property details page$")
    public void verify_bread_crumb_user_clicks_on_property_detail_then_user_should_redirect_to_the_property_page() {
        Assert.assertEquals("Actual and expected are mismatched", "Property Details", buySharePage.verify_Property_Detail_BreadCrumb());
    }

    @When("User clicks on view portfolio on purchase detail page")
    public void user_clicks_on_view_portfolio_on_purchase_detail_page() {
        buySharePage.click_On_View_Portfolio();
    }

    @Then("Verify User should redirect to the Portfolio page")
    public void verify_user_should_redirect_to_the_portfolio_page() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("URL") + "portfolio", buySharePage.verify_Portfolio_Page());
    }

    @Then("Verify user should be navigate to Buy Shares Page")
    public void verify_user_should_be_navigate_to_buy_shares_page() {
        Assert.assertEquals("Buy share page is not visible", "Market\n" + "/\n" + "Buy", buySharePage.verify_Buy_Page());
    }

    @And("Verify available Dollars Available share*Share price from index {int} {int} {int} on buy share page")
    public void verify_available_Dollars_available_share_share_price_from_index_on_buy_share_page(int columnIndex0, int columnIndex1, int columnIndex3) {
        String availableShare = buySharePage.get_Share_Price_Value(columnIndex0);
        String sharePrice = buySharePage.get_Share_Price_Value(columnIndex1);
        String dollarValue = buySharePage.get_Share_Price_Value(columnIndex3);
        int shareAvailable = Integer.parseInt(availableShare);
        String replace$AndCommaToSpaceInSharePrice = sharePrice.replace("$", "").replace(",", "").trim();
        double convertStringToDoubleSharePrice = Double.parseDouble(replace$AndCommaToSpaceInSharePrice);
        int convertDoubleToIntSharePrice = (int) Math.floor(convertStringToDoubleSharePrice);
        String replace$AndCommaInDollarValue = dollarValue.replace("$", "").replace(",", "").trim();
        double convertStringToIntDollarValue = Double.parseDouble(replace$AndCommaInDollarValue);
        int convertDoubleToIntDollarValue = (int) Math.floor(convertStringToIntDollarValue);
        int multiplyOfAvailShareAndSharePrice = shareAvailable * convertDoubleToIntSharePrice;
        Assert.assertEquals("Multiplication of available share and share price are not same as available dollar ", multiplyOfAvailShareAndSharePrice, convertDoubleToIntDollarValue);
    }

    @And("Verify selected share will also display highlighted on buy share page")
    public void verify_selected_share_will_also_display_highlighted() {
        Assert.assertTrue("Share is not highlight", buySharePage.verify_Highlight_Share_Row());
    }

    @And("Verify remaining shares remain grayed by default on buy share page")
    public void verify_remaining_shares_remain_grayed_by_default_on_buy_share_page() {
        Assert.assertTrue("remaining share is not greyed", buySharePage.verify_Greyed_Out_Share());
    }

    @And("User enters alphabets and special character {string} in share field input on buy share page")
    public void user_enters_alphabets_and_special_character_abc_on_buy_share_Page(String specialCharacterAndAlphabet) {
        buySharePage.enter_Shares_Count_In_Input_Field(specialCharacterAndAlphabet);
    }

    @Then("Verify user is not allowed to Enter alphabets and special characters on buy share page")
    public void verify_user_is_not_allowed_to_enter_alphabets_and_special_characters_on_buy_share_page() {
        Assert.assertTrue("enter share field is not empty", buySharePage.get_Share_Value());
    }

    @And("User enters alphabets and special character {string} in USD input field on buy share page")
    public void user_enters_alphabets_and_special_character_in_USD_input_field_on_buy_share_page(String usdValue) {
        buySharePage.enter_USD_Value(usdValue);
    }

    @When("User enter amount as {string} in USD input field on buy share page")
    public void user_enter_amount_as_in_USD_input_field_on_buy_share_page(String numericUsdValue) {
        buySharePage.enter_USD_Value(numericUsdValue);
    }

    @Then("Verify user is not allowed to Enter alphabets and special characters in usd input field on buy share page")
    public void verify_user_is_not_allowed_to_enter_alphabets_and_special_characters_in_usd_input_field_0n_buy_share_age() {
        Assert.assertTrue("USD value is visible", buySharePage.get_USD_Value().isEmpty());
    }

    @Then("Verify system will arrange the values in USD input field on buy share page")
    public void verify_system_will_arrange_the_values_as_in_usd_input_field() {
        Assert.assertEquals("Dollar icon is not visible", "$", buySharePage.verify_Dollar_In_Usd_Field());
        Assert.assertEquals("Actual and expected value are mismatched", "123,456.78", buySharePage.get_USD_Value());
    }

    @When("User enters value less than the lowest share price in usd input field on buy share page")
    public void user_enters_value_less_than_the_lowest_share_price_in_usd_input_field_on_buy_share_page() {
        buySharePage.enter_Usd_Value_In_Input_Field();
    }

    @Then("Verify user should be able to view an error message below the usd input field on buy share page")
    public void verify_user_should_be_able_to_view_an_error_message_below_the_usd_input_field_on_buy_share_page() {
        Assert.assertTrue("Error msg is not visible", buySharePage.is_Validation_Msg_Visible());
    }

    @When("User removes usd value from usd input field on buy share page")
    public void userRemovedUsdValueFromUsdInputFieldOnBuySharePage() {
        buySharePage.remove_Data_In_Usd_Input_Field();
    }

    @And("Verify breadcrumbs on fund your purchase page")
    public void verify_breadcrumbs_on_fund_your_purchase_page() {
        Assert.assertEquals("Breadcrumbs is not visible", "Market\n" + "/\n" + "Property Details\n" + "/\n" + "Buy", buySharePage.verify_Buy_Page());
    }

    @And("Verify Total Investment Value : \\(# of Shares) * \\(Avg. per Share) on fund your purchase page")
    public void verify_total_investment_value_of_shares_avg_per_share_on_fund_your_purchase_page() {
        buySharePage.verify_Investment_Avg_Share_On_Fund_Page();
    }

    @And("Verify when there is no Linked account to purchase the Shares on fund your purchase page")
    public void verify_when_there_is_not_linked_account_to_purchase_the_shares_on_fund_your_purchase_page() {
        Assert.assertEquals("You haven’t linked an account to Henry.com. Please link a bank account to fund your purchase.", buySharePage.validate_No_Linked_Account());
    }

    @And("Verify user should be able to view total amount, henry account balance and funds needed on fund your page")
    public void verify_user_should_be_able_to_view_henry_account_balance_and_funds_needed_on_fund_your_page() {
        Assert.assertTrue("Total amount is not visible", buySharePage.verify_Total_Amount());
        Assert.assertTrue("Henry account balance and funds is not visible", buySharePage.verify_Henry_Account_And_Funds());
    }

    @And("Verify user should be able to view cancel and link account button on fund your purchase page")
    public void verify_user_should_be_able_to_view_cancel_and_link_account_button_on_fund_your_purchase_page() {
        Assert.assertTrue("Cancel and link account btn is not visible", buySharePage.verify_Cancel_And_Link_Btn());
    }

    @And("User should have to link account in case of insufficient fund in Henry wallet warning msg should prompt on fund your purchase page")
    public void user_should_have_to_link_account_in_case_of_insufficient_fund_in_henry_wallet() {
        Assert.assertEquals("No linked account text is not visible", "No Linked Accounts", buySharePage.verify_No_Linked_Account_Warning_Msg());
        Assert.assertEquals("You haven’t linked an account to Henry.com. Please link a bank account to fund your purchase.", buySharePage.validate_No_Linked_Account());
    }

    @Then("User should not be able to enter Alphabetic code in otp field on two factor auth popup on confirm your purchase page")
    public void user_should_not_be_able_to_enter_alphabetic_code_in_otp_field_on_two_factor_auth_popup() {
        Assert.assertTrue("OTP field is not empty", buySharePage.get_OTP_Value().isEmpty());
    }

    @Then("Verify user should not allowed enter space in initials field on agree terms popup on confirm purchase page")
    public void verify_user_should_not_allowed_to_enter_space_in_initials_field_on_agree_terms_popup_on_confirm_purchase_page() {
        Assert.assertTrue("Initial value is not empty", buySharePage.get_Enter_Initial_Value().isEmpty());
    }

    @Then("Verify user should not allowed enter numeric digit in initials field on agree terms popup on confirm page")
    public void verify_user_should_not_allowed_enter_numeric_digit_in_initials_field_on_agree_terms_popup_on_confirm_page() {
        Assert.assertTrue("Initial value is not empty", buySharePage.get_Enter_Initial_Value().isEmpty());
    }

    @Then("Verify user able to view should changed lower to upper case character in initials field on agree terms popup")
    public void verify_user_able_to_view_should_be_changed_lower_to_upper_case_character_in_initials_field_on_agree_popup() {
        Assert.assertEquals("Actual and expected result are mismatched", "MT", buySharePage.get_Enter_Initial_Value());
    }

    @Then("Verify user should not allowed enter special characters in initials field on agree terms popup on confirm purchase page")
    public void verify_user_should_not_allowed_enter_special_characters_in_initials_field_on_agree_terms_popup_on_confirm_purchase_page() {
        Assert.assertTrue("Initial value is not empty", buySharePage.get_Enter_Initial_Value().isEmpty());
    }

    @Then("User should able to view error message when user enters value greater than share listed on buy share page")
    public void user_should_able_to_view_error_message_when_user_enters_value_greater_than_share_listed_on_buy_share_page() {
        Assert.assertEquals("The number of Shares you are requesting is greater than the number of shares listed for purchase. Please adjust the number of shares you want to purchase.", buySharePage.validate_Share_Error_Msg());
    }

    @When("User removes shares in enter share input field on buy shares page")
    public void user_removes_shares_in_enter_share_input_field_on_buy_shares_page() {
        buySharePage.remove_Share_In_Input_Field();
    }

    @Then("User will be able to continue purchase by using Henry account balance on fund your purchase page")
    public void user_will_be_able_to_continue_purchase_by_using_henry_account_balance_on_fund_your_purchase_page() {
        Assert.assertTrue("Henry amount balance is not visible", buySharePage.verify_Henry_Account_Balance());
    }

    @And("User didn't do any activity for minimum {int} min on confirm your purchase page")
    public void user_did_nt_do_any_activity_for_minimum_min_on_confirm_your_purchase_page(int min) {
        buySharePage.wait_In_Minutes(min);
    }

    @Then("User should be able to view Pop-up says Are you there? on confirm your purchase page")
    public void user_should_be_able_to_view_pop_up_says_on_confirm_your_purchase_page() {
        Assert.assertEquals("Are you there popup is not visible", "Are you there ?", buySharePage.validate_Are_You_There_Popup());
    }

    @And("Verify users should be able to view UI of Are you there? popup")
    public void verify_users_should_be_able_to_view_UI_of_are_you_there_Popup() {
        Assert.assertTrue("Continue purchase btn is not visible", buySharePage.verify_Continue_Purchase_Btn());
        Assert.assertTrue("Remaining time popup is not visible", buySharePage.verify_Remaining_Time_Popup());
        Assert.assertTrue("Sub heading is not visible on are you there popup", buySharePage.verify_Sub_Heading_Of_Are_You_There_Popup());
    }

    @And("User should be able to stay on Same page by clicking on “Continue Purchase” and pop-p is closed")
    public void user_should_be_able_to_stay_on_same_page_by_clicking_on_continue_purchase_and_popup_is_closed() {
        buySharePage.click_On_Continue_Purchase_Btn();
        Assert.assertFalse("Are you there popup is visible", buySharePage.is_Are_You_There_Popup_Visible());
    }

    @Then("User should be able to view Are you there? Pop-up is closed")
    public void user_should_be_able_to_view_are_you_there_popup_is_closed() {
        Assert.assertFalse("Are you there popup is visible", buySharePage.is_Are_You_There_Popup_Visible());
    }

    @When("User clicks outside the pop-up on Are you there? popup")
    public void user_clicks_out_side_the_pop_up_on_are_you_there_popup() {
        buySharePage.click_On_Fund_Your_Purchase_Title();
    }

    @And("User should navigate to Buy shares page if user didn't get active within 2:30 minutes of pop-up appearance")
    public void user_should_navigate_to_buy_shares_page_if_user_didnt_get_active_within_minutes_of_pop_up_appearance() {
        Assert.assertEquals("Buy share page is not visible", "Market\n" + "/\n" + "Buy", buySharePage.verify_Buy_Page());
    }


    @And("User enters all the available shares in Enter Shares field and click on Buy Shares button on buy share page")
    public void userEntersAllTheAvailableSharesInEnterSharesFieldAndClickOnBuySharesButtonFromUserOnBuySharePage() {
        buySharePage.enter_Shares_In_Share_Input_Field();
    }

    @And("User will be on Fund Your purchase screen, Hold on for minimum 10 minutes on that screen to active user")
    public void userWillBeOnFundYourPurchaseScreenHoldOnForMinimumMinutesOnThatScreenToActiveUser() {
        Assert.assertEquals("Fund your purchase is not visible", "Fund Your Purchase", buySharePage.verify_Fund_Your_Purchase_Page());
        buySharePage.wait_For_Minutes();
        buySharePage.click_On_Continue_Purchase_Btn();
        buySharePage.wait_For_Minutes();
        buySharePage.click_On_Continue_Purchase_Btn();
    }

    @And("Verify average share price = Sum of all Share Price divide by number of Shares on buy share page")
    public void verifyAverageSharePriceSumOfAllSharePriceDivideByNumberOfSharesOnBuySharePage() {
        int ValueOfTotalAvailableShare = buySharePage.enter_Shares_In_Share_Input_Field();
        int valueOfTotalSharePrice = buySharePage.get_Total_Share_Price();
        int totalAvgPerShare = valueOfTotalSharePrice / ValueOfTotalAvailableShare;
        Assert.assertEquals("Avg per share = Sum of all Share Price divide by number of Shares are not same as avg per share", totalAvgPerShare, buySharePage.validate_Avg_Per_Share());
    }

    @And("User enters all the available shares in Enter Shares field and click on Buy Shares button for user 1 on buy share page")
    public void userEntersAllTheAvailableSharesInEnterSharesFieldAndClickOnBuySharesButtonForUserOnBuySharePage() {
        buySharePage.enter_Shares_In_Share_Input_Field();
    }

    @And("Now from user 1 click on Confirm Purchase Button on fund your purchase page")
    public void nowFromUserClickOnConfirmPurchaseButtonOnFundYourPurchasePage() {
        buySharePage.click_On_Confirm_Purchase_Btn();
    }

    @Then("User should be able to view shares no longer available on confirm your page")
    public void userShouldBeAbleToViewSharesNoLongerAvailableOnConfirmYourPage() {
        Assert.assertEquals("Share No Longer Available", buySharePage.validate_No_Longer_Share_Available_Popup());
    }

    @And("User clicks on yes cancel button on Are you exit popup on fund page")
    public void userClicksOnYesCancelButtonOnAreYouExitPopupOnFundPage() {
        buySharePage.click_On_Yes_Cancel_Btn();
    }

    @And("User click on confirm purchase button on continue purchase popup on confirm your purchase page")
    public void userClickOnConfirmPurchaseButtonOnContinuePurchasePopupOnConfirmYourPurchasePage() {
        buySharePage.click_On_Confirm_Purchase_Btn();

    }
}


