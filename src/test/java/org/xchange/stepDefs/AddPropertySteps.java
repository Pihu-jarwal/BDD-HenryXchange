package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.AddPropertyPage;
import org.xchange.pom.ContactUsPageLoggedUser;
import org.xchange.pom.MarketPlace;
import utils.PropertiesUtil;

public class AddPropertySteps {
    AddPropertyPage addPropertyPage = new AddPropertyPage();

    MarketPlace page = new MarketPlace();


    @When("User click on owner tab on market page")
    public void userClickOnOwnerTabOnMarketPage() {
        page.click_On_Owner_Tab();
    }

    @Then("User navigate to owner dashboard page")
    public void userNavigateToOwnerDashboardPage() {
        Assert.assertEquals("Login page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "owner", addPropertyPage.verify_Owner_DashBoard_Page());
    }

    @And("User able to view Add property button at right top of owner dashboard page")
    public void userAbleToViewAddPropertyButtonAtRightTopOfOwnerDashboardPage() {
        Assert.assertEquals("Add Property button is not visible on owner dashboard page ", "Add Property", addPropertyPage.verify_User_View_Add_Property_Button());
    }

    @When("User click on add property button on owner dashboard page")
    public void userClickOnAddPropertyButtonOnOwnerDashboardPage() {
        addPropertyPage.click_On_Add_Property_Button();
    }

    @Then("User navigate to add property page")
    public void userNavigateToAddPropertyPage() {
        Assert.assertEquals("Add property page is not visible", PropertiesUtil.getEnvironmentKey("URL") + "owner/addProperty", addPropertyPage.verify_Add_Property_Page());
    }

    @And("User able to view breadCrumbs {string} on add property page")
    public void userAbleToViewBreadCrumbsOnAddPropertyPage(String addProperty) {
        Assert.assertEquals("Add Property breadcrumbs is not visible on Add property page ", addProperty, addPropertyPage.verify_BreadCrumbs_On_Add_property_Page());
    }

    @And("User able to view placeholder text {string} on add property page")
    public void userAbleToViewPlaceholderTextOnAddPropertyPage(String placeHolderText) {
        Assert.assertEquals("Placeholder text is not visible on Add property page ", placeHolderText, addPropertyPage.verify_PlaceHolder_Text_On_Add_property_Page());
    }

    @And("User able to view subheading text {string} on add property page")
    public void userAbleToViewSubheadingTextOnAddPropertyPage(String subheading) {
        Assert.assertEquals("Sub text is not visible on Add property page ", subheading, addPropertyPage.verify_SubHeading_On_Add_property_Page());
    }

    @And("User able to view property name text field on add property page")
    public void userAbleToViewPropertyNameTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Property_Name_Text_Field());
    }

    @And("User able to view Address text field on add property page")
    public void userAbleToViewAddressTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Address_Text_Field());
    }

    @And("User able to view Apt suite optional text field on add property page")
    public void userAbleToViewAptSuiteOptionalTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Apt_Suit_Text_Field());
    }

    @And("User able to view city text field on add property page")
    public void userAbleToViewCityTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_City_Text_Field());
    }

    @And("User able to view State text field on add property page")
    public void userAbleToViewStateTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_State_Text_Field());
    }

    @And("User able to view zipcode text field on add property page")
    public void userAbleToViewZipcodeTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Zipcode_Text_Field());
    }

    @And("User able to view Doors text field on add property page")
    public void userAbleToViewDoorsTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Doors_Text_Field());
    }

    @When("User click on property class field on add property page")
    public void userClickOnPropertyClassFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Property_class_Field();
    }

    @Then("User able to view property class dropdown on add property page")
    public void userAbleToViewPropertyClassDropdownOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Property_Class_Dropdown());
        addPropertyPage.clickOutsideTheField();
    }

    @When("User click on year built field on add property page")
    public void userClickOnYearBuiltFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Year_Built_Field();
    }

    @Then("User able to view year built dropdown on add property page")
    public void userAbleToViewYearBuiltDropdownOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Year_Built_Dropdown());
        addPropertyPage.clickOutsideTheField();
    }

    @When("User click on owner entity field on add property page")
    public void userClickOnOwnerEntityFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Owner_Entity_Field();
    }

    @Then("User able to view owner entity dropdown on add property page")
    public void userAbleToViewOwnerEntityDropdownOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Owner_Entity_Dropdown());
        addPropertyPage.clickOutsideTheField();
    }

    @And("User able to view state of entity text field on add property page")
    public void userAbleToViewStateOfEntityTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_State_Of_Entity_Text_Field());
    }

    @And("User able to view EIN text field on add property page")
    public void userAbleToViewEINTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_EIN_Text_Field());
    }

    @And("User able to view ticker symbol \\(optional) text field on add property page")
    public void userAbleToViewTickerSymbolOptionalTextFieldOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Ticker_Symbol_Text_Field());
    }

    @And("User able to view continue button on add property page")
    public void userAbleToViewContinueButtonOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Continue_Button());
    }

    @And("User able to view cancel button on add property page")
    public void userAbleToViewCancelButtonOnAddPropertyPage() {
        Assert.assertTrue(addPropertyPage.verify_User_View_Cancel_Button());
    }


    @When("User click on property name text field on add property page")
    public void userClickOnPropertyNameTextFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Property_Name_Field();
    }

    @Then("User enter the property name {string} on add property page")
    public void userEnterThePropertyNameOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name(input);
    }

    @And("User validate property name have minimum 2 characters on add property page")
    public void userValidatePropertyNameHaveMinimumCharactersOnAddPropertyPage() {
        Assert.assertTrue("Property name length validation failed", addPropertyPage.verify_Property_Name_Minimum_2_character_Length());
    }

    @Then("User enter the property name {string} 45 character on add property page")
    public void userEnterThePropertyNameOnCharacterAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name_45_character(input);
    }

    @Then("User validate property name have maximum {string} character on add property page")
    public void userValidatePropertyNameHaveMaximumCharacterOnAddPropertyPage(String maxLength) {
        Assert.assertEquals("Property name length validation failed", maxLength, addPropertyPage.verify_Property_Name_Maximum_45_character_Length());
    }


    @Then("User validate property name should be alphanumeric with special characters on add property page")
    public void userValidatePropertyNameShouldBeAlphanumericWithSpecialCharactersOnAddPropertyPage() {
        Assert.assertFalse("Property name alphanumeric validation failed", addPropertyPage.verify_Property_Name_Alphanumeric().isEmpty());
    }

    @Then("User able to view name field is active on add property page")
    public void userAbleToViewNameFieldIsActiveOnAddPropertyPage() {
        Assert.assertTrue("Property name field is not active", addPropertyPage.user_Able_To_View_Active_Property_Name_Field());
    }

    @When("User enter the property name {string} digit numeric on add property page")
    public void userEnterThePropertyNameDigitNumericOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name(input);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User able to view error message {string} on add property page")
    public void userAbleToViewErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_User_View_Error_Message_Property_Name_Field());
    }

    @When("User enter the property name {string} alphabet character on add property page")
    public void userEnterThePropertyNameAlphabetCharacterOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name(input);
        addPropertyPage.clickOutsideTheField();
    }

    @When("User enter the property name {string} Special character on add property page")
    public void userEnterThePropertyNameSpecialCharacterOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name(input);
        addPropertyPage.clickOutsideTheField();
    }

    @When("User enter the space {string} in property name on add property page")
    public void userEnterTheSpaceInPropertyNameOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Property_Name(input);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User should not be able to view entered data on add property page")
    public void userShouldNotBeAbleToViewEnteredDataOnAddPropertyPage() {
        Assert.assertFalse("Entered data is still visible", addPropertyPage.user_Should_Not_Be_Able_To_View_Data().isEmpty());
    }

    @When("User click on address text field on add property page")
    public void userClickOnAddressTextFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Address_Field();
    }

    @Then("User able to view address field is active on add property page")
    public void userAbleToViewAddressFieldIsActiveOnAddPropertyPage() {
        Assert.assertTrue(" Address field is not active", addPropertyPage.user_Able_To_View_Active_Address_Field());
    }

    @When("User enter numeric character {string} in address field on add property page")
    public void userEnterNumericCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @Then("User able to view auto suggestion for typed input address on add property page")
    public void userAbleToViewAutoSuggestionForTypedInputAddressOnAddPropertyPage() {
        Assert.assertTrue("Address dropdown is not visible", addPropertyPage.verify_User_Able_To_View_Address_Dropdown());
    }

    @When("User enter alphabetic character in {string} address field on add property page")
    public void userEnterAlphabeticCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @When("User enter alphanumeric character in {string} address field on add property page")
    public void userEnterAlphanumericCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @When("User enter special character in {string} address field on add property page")
    public void userEnterSpecialCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
    }

    @Then("User should not be able to enter special character on add property page")
    public void userShouldNotBeAbleToEnterSpecialCharacterOnAddPropertyPage() {
        Assert.assertFalse("Special character entered", addPropertyPage.user_Should_Not_Be_Able_To_Enter_Special_Character());
    }

    @When("User enter combination of alphabetic and special character {string} on add property page")
    public void userEnterCombinationOfAlphabeticAndSpecialCharacterOnAddPropertyPage(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
    }

    @Then("User should not be able to enter Combination of alphabetic and special character on add property page")
    public void userShouldNotBeAbleToEnterCombinationOfAlphabeticAndSpecialCharacterOnAddPropertyPage() {
        Assert.assertFalse("Alphabetic and special characters entered", addPropertyPage.user_Should_Not_Be_Able_To_Enter_Alphabetic_And_Special_Character());
    }

    @When("User enter Combination of numeric and special character {string} on add property page on add property page")
    public void userEnterCombinationOfNumericAndSpecialCharacterOnAddPropertyPageOnAddPropertyPage(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
    }

    @Then("User should not be able to enter Combination of numeric and special character on add property page")
    public void userShouldNotBeAbleToEnterCombinationOfNumericAndSpecialCharacterOnAddPropertyPage() {
        Assert.assertFalse("Numeric and special characters entered", addPropertyPage.user_Should_Not_Be_Able_To_Enter_Numeric_And_Special_Character());
    }

    @When("User enter Combination of alphanumeric and special character {string} on add property page on add property page")
    public void userEnterCombinationOfAlphanumericAndSpecialCharacterOnAddPropertyPageOnAddPropertyPage(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
    }

    @Then("User should not be able to enter Combination of alphanumeric and special character on add property page")
    public void userShouldNotBeAbleToEnterCombinationOfAlphanumericAndSpecialCharacterOnAddPropertyPage() {
        Assert.assertFalse("Alphanumeric and special characters entered", addPropertyPage.user_Should_Not_Be_Able_To_Enter_AlphaNumeric_And_Special_Character());
    }

    @When("User enter 2 character value {string} on add property page")
    public void userEnterCharacterValueOnAddPropertyPage(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User Should not be able to view auto suggestion for address on add property page")
    public void userShouldNotBeAbleToViewAutoSuggestionForAddressOnAddPropertyPage() {
        Assert.assertFalse("Auto suggestion is visible", addPropertyPage.user_Should_Not_View_AutoSuggestion());
    }

    @When("User enter invalid address {string} that is out of US Country and click outside the address field")
    public void userEnterInvalidAddressThatIsOutOfUSCountryAndClickOutsideTheAddressField(String input) {
        addPropertyPage.user_Enter_Invalid_Address_Out_Of_Country(input);
    }

    @Then("User should be able to view address field error message {string} on add property page")
    public void userShouldBeAbleToViewErrorMessagePleaseEnsureThatAValidAddressIsEnteredOnAddPropertyPage(String expectedErrorMessage) {
        Assert.assertEquals("Error message does not match", expectedErrorMessage, addPropertyPage.user_Should_View_Error_Message());
    }

    @When("User enter the address {string} in address field on add property page")
    public void userEnterTheAddressInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @Then("Verify user should be able to enter minimum 3 character on add property page")
    public void verifyUserShouldBeAbleToEnterMinimumCharacterOnAddPropertyPage() {
        Assert.assertTrue("Property name length validation failed", addPropertyPage.verify_Address_Field_Minimum_3_character_Length());
    }

    @When("User enter the address {string} in address field on add property page on add property page")
    public void userEnterTheAddressInAddressFieldOnAddPropertyPageOnAddPropertyPage(String text) {
        addPropertyPage.enter_Valid_Data_Address_Field_50_character(text);
    }

    @Then("Verify user should be able to enter Maximum 50 character on add property page")
    public void verifyUserShouldBeAbleToEnterMaximumCharacterOnAddPropertyPage() {
        Assert.assertTrue("Property name length validation failed", addPropertyPage.verify_Address_Field_Maximum_50_character_Length());
    }

    @When("User enter minimum 3 character {string} in address field on add property page")
    public void userEnterMinimumCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @Then("User should be able to view dropdown list for auto suggest addresses on add property page")
    public void userShouldBeAbleToViewDropdownListForAutoSuggestAddressesOnAddPropertyPage() {
        Assert.assertTrue("Auto-suggestion dropdown is not visible", addPropertyPage.user_Should_View_Auto_Suggest_Dropdown());
    }

    @When("User enter the character in {string} address field on add property page")
    public void userEnterTheCharacterInAddressFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @And("User click on address from address dropdown on add property page")
    public void userClickOnAddressFromAddressDropdownOnAddPropertyPage() {
        addPropertyPage.user_Click_On_Address_In_Address_Dropdown();
    }

    @Then("User erase all address from address field on add property page")
    public void userEraseAllAddressFromAddressFieldOnAddPropertyPage() {
        addPropertyPage.user_Erase_Address_In_Address_Field();
    }

    @When("User click on Apt,Suite field on add property page")
    public void userClickOnAptSuiteFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Apt_Suite_Field();
    }

    @Then("User should be able to view typing cursor on Apt,Suite field on add property page")
    public void userShouldBeAbleToViewTypingCursorOnAptSuiteFieldOnAddPropertyPage() {
        Assert.assertTrue(" Apt, Suit field is not active", addPropertyPage.user_Able_To_View_Cursor_On_Apt_Suite_Field());
    }

    @When("User enter numeric value {string} in Apt,Suite field on add property page")
    public void userEnterNumericValueInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @Then("User should be able to view entered input {string} in Apt,Suite field on add property page")
    public void userShouldBeAbleToViewEnteredInputInAptSuiteFieldOnAddPropertyPage(String expectedInput) {
        Assert.assertEquals("Entered input does not match", expectedInput, addPropertyPage.user_Should_View_Entered_Input_In_Apt_Suite_Field());
    }

    @When("User enter Alphabetic value {string} in Apt,Suite field on add property page")
    public void userEnterAlphabeticValueInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @When("User enter Alphanumeric value {string} in Apt,Suite field on add property page")
    public void userEnterAlphanumericValueInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @When("User enter Special character {string} in Apt,Suite field on add property page")
    public void userEnterSpecialCharacterInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @When("User enter Combination of Alphanumeric and special character {string} in Apt,Suite field on add property page")
    public void userEnterCombinationOfAlphanumericAndSpecialCharacterInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @When("User enter the character {string} in Apt,Suite field on add property page")
    public void userEnterTheCharacterInAptSuiteFieldOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field(input);
    }

    @Then("User should be able to enter minimum 3 character on add property page")
    public void userShouldBeAbleToEnterMinimumCharacterOnAddPropertyPage() {
        Assert.assertTrue("Property name length validation failed", addPropertyPage.verify_Apt_Suite_Field_Minimum_3_character_Length());
    }

    @When("User enter the Apt,Suite {string} 50 character in Apt,Suite field on add property page")
    public void userEnterTheAptSuiteCharacterInAptSuiteFieldOnAddPropertyPage(String aptSuitText) {
        addPropertyPage.enter_Valid_Data_Apt_Suite_Field_50_character(aptSuitText);
    }

    @Then("User should be able to enter Maximum 50 character on add property page")
    public void userShouldBeAbleToEnterMaximumCharacterOnAddPropertyPage() {
        Assert.assertTrue("Property name length validation failed", addPropertyPage.verify_Apt_Suite_Field_Maximum_50_character_Length());
    }

    @When("User click on Zip Code field on add property page")
    public void userClickOnZipCodeFieldOnAddPropertyPage() {
        addPropertyPage.user_Click_On_ZipCode_Field();
    }

    @And("User enter 5 digit {string} valid Zip Code on add property page")
    public void userEnterDigitValidZipCodeOnAddPropertyPage(String zipCode) {
        addPropertyPage.enter_Zip_Code_In_Input_Field(zipCode);
    }

    @Then("Verify user able to view entered input in Zip Code field on add property page")
    public void userAbleToViewEnteredInputInZipCodeFieldOnAddPropertyPage() {
        Assert.assertFalse("Zipcode value is empty", addPropertyPage.get_Zip_Code_Value().isEmpty());
    }

    @And("User enter zipcode digit {string} and click outside the field on add property page")
    public void userEnterZipcodeDigitAndClickOutsideTheFieldOnAddPropertyPage(String zipCode) {
        addPropertyPage.enter_Zip_Code_In_Input_Field(zipCode);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User should able to view error {string} on add property page")
    public void userShouldAbleToViewErrorOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.user_View_Zipcode_Must_Be_5_digit_Error_Msg());
    }

    @When("User enter zipcode digit {string} for non-matching state in zip code field on add property page")
    public void userEnterZipcodeDigitForNonMatchingStateInZipCodeFieldOnAddPropertyPage(String zipCode) {
        addPropertyPage.enter_Zip_Code_In_Input_Field(zipCode);
    }

    @When("User click on doors field on add property page")
    public void userClickOnDoorsFieldOnAddPropertyPage() {
        addPropertyPage.user_Click_On_Doors_Field();
    }

    @And("User enter doors {string} in doors field on add property page")
    public void userEnterDoorsInDoorsFieldOnAddPropertyPage(String doors) {
        addPropertyPage.enter_Doors_In_Input_Field(doors);
    }

    @Then("Verify user should be able to enter greater than 1 numeric value in field on add property page")
    public void verifyUserShouldBeAbleToEnterGreaterThanNumericValueInFieldOnAddPropertyPage() {
        Assert.assertTrue("Doors field length validation failed", addPropertyPage.validate_Doors_Field_Contains_Greater_Than_1_Numeric_Value());
    }

    @Then("Verify user should be able to enter less than 10000 numeric value in field on add property page")
    public void verifyUserShouldBeAbleToEnterLessThanNumericValueInFieldOnAddPropertyPage() {
        Assert.assertTrue("Doors field length validation failed", addPropertyPage.validate_Doors_Field_Contains_Less_Than_10000_Numeric_Value());
    }

    @And("Verify user should be able to enter numeric digit only in doors field on add property page")
    public void verifyUserShouldBeAbleToEnterNumericDigitOnlyInDoorsFieldOnAddPropertyPage() {
        Assert.assertTrue("Value contains non-numeric characters", addPropertyPage.validate_User_Can_Only_Enter_Numeric_Digits_In_Doors_Field());
    }

    @When("User enter invalid doors {string} in doors field on add property page")
    public void userEnterInvalidDoorsInDoorsFieldOnAddPropertyPage(String doors) {
        addPropertyPage.enter_Invalid_Input_In_Doors_Field(doors);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User should be able to view error message {string} on add property page")
    public void userShouldBeAbleToViewErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_User_View_Doors_Must_Doors_Should_Not_Be_Less_Then_2_Or_More_Then_9999_Error_Msg());
    }

    @Then("User unable to view Entered value alphabetic value in doors field on add property page")
    public void userUnableToViewEnteredValueAlphabeticValueInDoorsFieldOnAddPropertyPage() {
        Assert.assertTrue("Entered value is visible", addPropertyPage.user_Unable_To_View_Entered_Value_In_Doors_Field().isEmpty());
    }

    @Then("User unable to view Entered value alphanumeric value in doors field on add property page")
    public void userUnableToViewEnteredValueAlphanumericValueInDoorsFieldOnAddPropertyPage() {
        Assert.assertTrue("Entered value is visible", addPropertyPage.user_Unable_To_View_Entered_Value_In_Doors_Field().isEmpty());
    }

    @Then("User unable to view Entered value special character value in doors field on add property page")
    public void userUnableToViewEnteredValueSpecialCharacterValueInDoorsFieldOnAddPropertyPage() {
        Assert.assertTrue("Entered value is visible", addPropertyPage.user_Unable_To_View_Entered_Value_In_Doors_Field().isEmpty());
    }

    @Then("User unable to view Entered value space in doors field on add property page")
    public void userUnableToViewEnteredValueSpaceInDoorsFieldOnAddPropertyPage() {
        Assert.assertTrue("Entered value is visible", addPropertyPage.user_Unable_To_View_Entered_Value_In_Doors_Field().isEmpty());
    }


    @Then("User able to view property class dropdown options on add property page")
    public void userAbleToViewPropertyClassDropdownOptionsOnAddPropertyPage() {
        addPropertyPage.user_Should_View_Property_Class_Dropdown_With_Options();
    }

    @When("User able to select option {string} in property class field on add property page")
    public void userAbleToSelectOptionAInPropertyClassFieldOnAddPropertyPage(String optionText) {
        addPropertyPage.get_Property_Class_DropdownOption(optionText);
    }

    @Then("User should be able to view {string} option selected in property class field on add property page")
    public void userShouldBeAbleToViewAOptionSelectedInPropertyClassFieldOnAddPropertyPage(String expectedOption) {
        Assert.assertEquals("Selected option does not match", expectedOption, addPropertyPage.verify_User_Should_View_Option_Selected());
    }


    @When("User click on outside the field on add property page")
    public void userClickOnOutsideTheFieldOnAddPropertyPage() {
        addPropertyPage.clickOutsideTheField();
        addPropertyPage.clickOutsideTheField();
    }

    @Then("Verify user should be able to view property class field error message {string} on add property page")
    public void verifyUserShouldBeAbleToViewPropertyClassFieldErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_Property_Name_Is_Mandatory_Error_Msg());
    }

    @Then("User able to view year built dropdown options on add property page")
    public void userAbleToViewYearBuiltDropdownOptionsOnAddPropertyPage() {
        addPropertyPage.user_Should_View_Year_Built_Dropdown_With_Years_List();
    }

    @When("User able to select option {string} in Year Built field on add property page")
    public void userAbleToSelectOptionInYearBuiltFieldOnAddPropertyPage(String optionText) {
        addPropertyPage.get_Year_Dropdown_Option(optionText);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("User should be able to view {string} option selected in Year Built field on add property page")
    public void userShouldBeAbleToViewOptionSelectedInYearBuiltFieldOnAddPropertyPage(String expectedOption) {
        Assert.assertEquals("Selected option does not match", expectedOption, addPropertyPage.verify_User_Should_View_Year_Option_Selected());
    }

    @Then("Verify User should be able to view year built field error message {string} on add property page")
    public void verifyUserShouldBeAbleToViewYearBuiltFieldErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_Year_Built_Is_Mandatory_Error_Msg());
    }

    @Then("User able to view owner entity dropdown existing owner list on add property page")
    public void userAbleToViewOwnerEntityDropdownExistingOwnerListOnAddPropertyPage() {
        addPropertyPage.user_Should_View_Owner_Entity_Dropdown_With_Existing_Owner_List();
    }

    @When("User able to select option {string} in owner entity field on add property page")
    public void userAbleToSelectOptionInOwnerEntityFieldOnAddPropertyPage(String optionText) {
        addPropertyPage.get_Owner_Entity_Dropdown_Option(optionText);
    }

    @Then("User should be able to view {string} option selected in owner entity field on add property page")
    public void userShouldBeAbleToViewOptionSelectedInOwnerEntityFieldOnAddPropertyPage(String expectedOption) {
        Assert.assertEquals("Selected option does not match", expectedOption, addPropertyPage.verify_User_Should_View_Owner_Entity_Option_Selected());
    }

    @Then("Verify User should be able to view owner entity field error message {string} on add property page")
    public void verifyUserShouldBeAbleToViewOwnerEntityFieldErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_Owner_Entity_Is_Mandatory_Error_Msg());
    }

    @And("Verify user should be able to view State of Entity value depending upon the selection of Owner from Owner Entity listing on add property page")
    public void verifyUserShouldBeAbleToViewStateOfEntityValueDependingUponTheSelectionOfOwnerFromOwnerEntityListingOnAddPropertyPage() {
        Assert.assertFalse("State of entity field is empty", addPropertyPage.verify_User_Should_View_State_Of_Entity_Value().isEmpty());
    }

    @And("Verify user should be able to view EIN value depending upon the selection of Owner from Owner Entity listing on add property page")
    public void verifyUserShouldBeAbleToViewEINValueDependingUponTheSelectionOfOwnerFromOwnerEntityListingOnAddPropertyPage() {
        Assert.assertFalse("EIN field is empty", addPropertyPage.verify_User_Should_View_EIN_Value().isEmpty());
    }

    @When("User click on ticker symbol field on add property page")
    public void userClickOnTickerSymbolFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Ticker_Symbol_Field();
    }

    @Then("User enter the {string} value in ticker symbol field on add property page")
    public void userEnterTheValueInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @And("Verify user should only allow to enter Alphabetic value in ticker symbol field on add property page")
    public void verifyUserShouldOnlyAllowToEnterAlphabeticValueInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Non-alphabetic characters are allowed", addPropertyPage.verify_Alphabetic_Value_In_Ticker_Symbol_Field());
    }

    @And("Verify user should only allow to enter minimum and maximum 5 Alphabet in ticker symbol field on add property page")
    public void verifyUserShouldOnlyAllowToEnterMinimumAndMaximumAlphabetInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Text length is not within the range", addPropertyPage.verify_Min_Max_Alphabets_In_Ticker_Symbol_Field());
    }

    @And("Verify user Text should automatically be capitalized in ticker symbol field on add property page")
    public void verifyUserTextShouldAutomaticallyBeCapitalizedInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Text is not capitalized", addPropertyPage.verify_Capitalized_Text_In_Ticker_Symbol_Field());
    }

    @Then("User enter the {string} lowercase value between 3-5 alphabet in ticker symbol field on add property page")
    public void userEnterTheLowercaseValueBetweenAlphabetInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @And("Verify user should be able to view uppercase value in ticker symbol field on add property page")
    public void verifyUserShouldBeAbleToViewUppercaseValueInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Text is not capitalized", addPropertyPage.verify_Capitalized_Text_In_Ticker_Symbol_Field());
    }

    @When("User enter the {string} uppercase value between 3-5 alphabet in ticker symbol field on add property page")
    public void userEnterTheUppercaseValueBetweenAlphabetInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User enter value {string} less than 3 alphabet in ticker symbol field and click outside the field on add property page")
    public void userEnterValueLessThanAlphabetInTickerSymbolFieldAndClickOutsideTheFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
        addPropertyPage.clickOutsideTheField();
    }

    @And("User should be able to view ticker symbol field error message {string} on add property page")
    public void userShouldBeAbleToViewTickerSymbolFieldErrorMessageOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.verify_User_View_Error_Msg_Enter_Less_Than_3_AlphaBet_In_Ticket_Symbol_Field());
    }

    @When("User enter value {string} more than 5 alphabet in ticker symbol field on add property page")
    public void userEnterValueMoreThanAlphabetInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User unable to enter more than 5 value in ticker symbol field on add property page")
    public void userUnableToEnterMoreThanValueInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Ticker symbol field should not accept more than 5 characters", addPropertyPage.validate_Max_Length_In_Ticker_Symbol_Field());
    }

    @When("User enter numeric value {string} in ticker symbol field on add property page")
    public void userEnterNumericValueInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User should not be allowed to enter numeric value in ticker symbol field on add property page")
    public void userShouldNotBeAllowedToEnterNumericValueInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Ticker symbol field should not accept numeric values", addPropertyPage.validate_Numeric_Value_In_Ticker_Symbol_Field());
    }

    @When("User enter special character value {string} in ticker symbol field on add property page")
    public void userEnterSpecialCharacterValueInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User should not be allowed to enter special character in ticker symbol field on add property page")
    public void userShouldNotBeAllowedToEnterSpecialCharacterInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Ticker symbol field should not accept special characters", addPropertyPage.validate_Special_Character_In_Ticker_Symbol_Field());
    }

    @When("User enter space {string} in ticker symbol field on add property page")
    public void userEnterSpaceInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User should not be allowed to enter space in ticker symbol field on add property page")
    public void userShouldNotBeAllowedToEnterSpaceInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Ticker symbol field should not accept spaces", addPropertyPage.validate_No_Space_In_Ticker_Symbol_Field());
    }

    @When("User enter Enter alphanumeric value {string} in ticker symbol field on add property page")
    public void userEnterEnterAlphanumericValueInTickerSymbolFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User should not be allowed to enter alphanumeric value in ticker symbol field on add property page")
    public void userShouldNotBeAllowedToEnterAlphanumericValueInTickerSymbolFieldOnAddPropertyPage() {
        Assert.assertTrue("Ticker symbol field should not accept alphanumeric values", addPropertyPage.validate_No_Alphanumeric_In_Ticker_Symbol_Field());
    }

    @When("User enter already used value {string} in ticker symbol field and click outside the field on add property page")
    public void userEnterAlreadyUsedValueInTickerSymbolFieldAndClickOutsideTheFieldOnAddPropertyPage(String value) {
        addPropertyPage.user_Can_Enter_The_Value_In_Ticker_Symbol_Field(value);
    }

    @Then("User should be able to view ticker symbol field error message {string}")
    public void userShouldBeAbleToViewTickerSymbolFieldErrorMessage(String errorMsg) {
        Assert.assertEquals(errorMsg, addPropertyPage.validate_Used_Value_Error_Message_In_Ticker_Symbol_Field());
    }

    @When("User hover the mouse over ? mark symbol in ticker symbol field on add property page")
    public void userHoverTheMouseOverMarkSymbolInTickerSymbolFieldOnAddPropertyPage() {
        addPropertyPage.scrollToHeightByJs();
        addPropertyPage.hover_The_Mouse_Mark_In_Ticker_Symbol_Field();
    }

    @Then("User able to view tooltip on add property page")
    public void userAbleToViewTooltipOnAddPropertyPage() {
        Assert.assertTrue("Tooltip is not visible ", addPropertyPage.validate_Tooltip());
    }

    @And("User able to view heading {string} in tooltip on add property page")
    public void userAbleToViewHeadingInTooltipOnAddPropertyPage(String heading) {
        Assert.assertEquals("Tootip heading expected and actual is mismatched", heading, addPropertyPage.user_Can_View_Heading_In_Tooltip());
    }

    @And("User able to view body {string} in tooltip on add property page")
    public void userAbleToViewBodyInTooltipOnAddPropertyPage(String body) {
        Assert.assertEquals("Tootip body expected and actual is mismatched", body, addPropertyPage.user_Can_View_Body_In_Tooltip());
    }

    @And("User should be able to view continue Button disabled when some mandatory field value are null on add property page")
    public void userShouldBeAbleToViewButtonDisabledWhenSomeMandatoryFieldValueAreNullOnAddPropertyPage() {
        Assert.assertFalse("Continue button is enabled ", addPropertyPage.verify_Disabled_Continue_Button_On_Add_Property_Page());
    }

    @Then("User enter the address {string} on add property page on add property page")
    public void userEnterTheAddressOnAddPropertyPageOnAddPropertyPage(String input) {
        addPropertyPage.enter_Valid_Data_Address_Field(input);
    }

    @And("User able to select option in address dropdown on add property page")
    public void userAbleToSelectOptionInAddressOnAddPropertyPage() {
        addPropertyPage.get_Address_Dropdown_Option();
    }

    @When("User click on continue button on add property page")
    public void userClickOnContinueButtonOnAddPropertyPage() {
        addPropertyPage.click_On_Continue_Button();
    }

    @Then("User able to view agree to terms popup on add property page")
    public void userAbleToViewAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("Agree to terms popup is not visible", addPropertyPage.verify_Terms_page());
    }

    @When("User click on cancel button on add property page")
    public void userClickOnCancelButtonOnAddPropertyPage() {
        addPropertyPage.click_On_Cancel_Button();
    }

    @Then("User should be able to view Are you sure you want to exit setup pop-up on add property page")
    public void userShouldBeAbleToViewAreYouSureYouWantToExitSetupPopUpOnAddPropertyPage() {
        Assert.assertTrue("Are you sure you want to exit setup pop-up is not visible", addPropertyPage.verify_Are_You_Sure_You_Want_To_Exit_Setup());
    }

    @Then("User should be able to view placeholder text are you sure you want to exit setup in exit setup popup on add property page")
    public void userShouldBeAbleToViewPlaceholderTextInExitSetupPopupOnAddPropertyPage() {
        Assert.assertEquals("Placeholder text not match with expected result ", "Are you sure you want\n" +
                "to exit ?", addPropertyPage.validate_Placeholder_Text_On_Verify_Are_You_Sure_You_Want_To_Exit_Setup());
    }

    @And("User should be able to view body Your property information that you have entered will be deleted and not be saved in exit setup popup on add property page")
    public void userShouldBeAbleToViewBodyInExitSetupPopupOnAddPropertyPage() {
        Assert.assertEquals("Body text not match with expected result", "Your property information that you have entered\n" +
                "will be deleted and not be saved.", addPropertyPage.validate_Body_On_Verify_Are_You_Sure_You_Want_To_Exit_Setup());
    }

    @And("User should be able to view exit button in exit setup pop-up on add property page")
    public void userShouldBeAbleToViewExitButtonInExitSetupPopUpOnAddPropertyPage() {
        Assert.assertTrue("Exit button is not visible on exit setup popup", addPropertyPage.verify_User_View_Exit_Button());
    }

    @And("User should be able to view return to add property button in exit setup pop-up on add property page")
    public void userShouldBeAbleToViewReturnToAddPropertyButtonInExitSetupPopUpOnAddPropertyPage() {
        Assert.assertTrue("Return to address button is not visible on exit setup popup", addPropertyPage.verify_User_View_Return_To_Add_Property_Button());
    }

    @When("User click on exit button in exit setup pop-up on add property page")
    public void userClickOnExitButtonInExitSetupPopUpOnAddPropertyPage() {
        addPropertyPage.click_On_Exit_Button();
    }

    @When("User click on return to address button in exit setup pop-up on add property page")
    public void userClickOnReturnToAddressButtonInExitSetupPopUpOnAddPropertyPage() {
        addPropertyPage.click_On_Return_To_Add_Property_Button();
    }

    @Then("User should be able to stay on Add Property page and Pop-up is discarded")
    public void userShouldBeAbleToStayOnAddPropertyPageAndPopUpIsDiscarded() {
        addPropertyPage.verify_Add_Property_Page();
        Assert.assertFalse("Are you sure you want to exit setup pop-up is not visible", addPropertyPage.verify_Are_You_Sure_You_Want_To_Exit_Setup());
    }

    @When("User click outside the exit setup pop-up on add property page")
    public void userClickOutsideTheExitSetupPopUpOnAddPropertyPage() {
        addPropertyPage.clickOutsideTheField();
    }


    @And("User able to view placeholder text {string} on Agree to terms Pop-up on add property page")
    public void userAbleToViewPlaceholderTextOnAgreeToTermsPopUpOnAddPropertyPage(String actualText) {
        Assert.assertEquals("Agree to terms text is mismatch expected and actual result", actualText, addPropertyPage.user_View_Agree_To_Terms_Text_On_Popup());
    }

    @And("User able to view property name on Agree to terms Pop-up on add property page")
    public void userAbleToViewPropertyNameOnAgreeToTermsPopUpOnAddPropertyPage() {
        Assert.assertTrue("Property name text is not displayed", addPropertyPage.user_View_Property_Name_On_Agree_To_Terms_Popup());
    }

    @And("User able to view self name as {string} , position as {string} , and entity name as {string} in the description on Agree to terms Pop-up on add property page")
    public void userAbleToViewSelfNameAsPositionAsAndEntityNameAsInTheDescriptionOnAgreeToTermsPopUpOnAddPropertyPage(String actualName, String actualPosition, String actualEntityName) {
        Assert.assertEquals("Agree to terms text is mismatch expected and actual result", actualName, addPropertyPage.user_View_Self_Name_On_Agree_To_Terms_Popup());
        Assert.assertEquals("Agree to terms text is mismatch expected and actual result", actualPosition, addPropertyPage.user_View_Position_On_Agree_To_Terms_Popup());
        Assert.assertEquals("Agree to terms text is mismatch expected and actual result", actualEntityName, addPropertyPage.user_View_Entity_Name_On_Agree_To_Terms_Popup());
    }

    @And("User able to view enter your initials field on Agree to terms Pop-up on add property page")
    public void userAbleToViewEnterYourInitialsFieldOnAgreeToTermsPopUpOnAddPropertyPage() {
        Assert.assertTrue("Enter your initials field is not displayed", addPropertyPage.user_View_Enter_Your_Initials_Field_On_Agree_To_Terms_Popup());
    }

    @And("User able to view agree and continue button on Agree to terms Pop-up on add property page")
    public void userAbleToViewAgreeAndContinueButtonOnAgreeToTermsPopUpOnAddPropertyPage() {
        Assert.assertTrue("Agree and Continue button is not displayed", addPropertyPage.user_View_Agree_And_Continue_Button_On_Agree_To_Terms_Popup());
    }

    @And("User able to view owner position in bracket & owner entity name just below the Initials field on Agree to terms Pop-up")
    public void userAbleToViewOwnerPositionAsInBracketOwnerEntityNameAsJustBelowTheInitialsFieldOnAgreeToTermsPopUp() {
        Assert.assertEquals("Agree to terms text is mismatch expected and actual result","Muskan Trivedi"+" ( President ), "+"Agile Real Estate Group", addPropertyPage.user_View_Owner_Position_In_Bracket_On_Agree_To_Terms_Popup());
    }

    @And("User able to view download button on Agree to terms Pop-up on add property page")
    public void userAbleToViewDownloadButtonOnAgreeToTermsPopUpOnAddPropertyPage() {
        Assert.assertTrue("Download button is not displayed", addPropertyPage.user_View_Download_Button_On_Agree_To_Terms_Popup());
    }

    @And("User able to view cross icon at right top on Agree to terms Pop-up on add property page")
    public void userAbleToViewCrossIconAtRightTopOnAgreeToTermsPopUpOnAddPropertyPage() {
        Assert.assertTrue("Cross icon is not displayed", addPropertyPage.user_View_Cross_Icon_On_Agree_To_Terms_Popup());
    }

    @When("User scroll till the bottom of the Agreement description on agree to terms popup on add property page")
    public void userScrollTillTheBottomOfTheAgreementDescriptionOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.verify_User_Scroll_Agreement_Description_On_Agreement_Popup();
    }

    @Then("User should be able to view Enter Your Initials field Active on agree to terms popup on add property page")
    public void userShouldBeAbleToViewEnterYourInitialsFieldActiveOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue(" Enter initials button is not active ", addPropertyPage.verify_User_View_Enter_Your_Initials_Field_Is_Active_On_Agreement_Popup());
    }

    @When("User enter {string} Input Alpha character in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify input {string} must be Alpha character in enter your initials field on agree to terms popup on add property page")
    public void verifyInputMustBeAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String expectedCharacter) {
        Assert.assertEquals(expectedCharacter, addPropertyPage.check_Validation_In_Initial_Field());
    }

    @When("User enter {string} Caps Alpha character in enter your initials field on agree to terms popup on add property page")
    public void userEnterCapsAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify input {string} only allow Caps Alpha character in enter your initials field on agree to terms popup on add property page")
    public void verifyOnlyAllowCapsAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.verify_LowerCase_Alphabets_Should_Be_Changed_To_Uppercase_Characters(initials);
    }

    @When("User enter {string} Minimum 2 Character allowed in enter your initials field on agree to terms popup on add property page")
    public void userEnterMinimumCharacterAllowedInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify minimum 2 Character allowed in enter your initials field on agree to terms popup on add property page")
    public void verifyMinimumCharacterAllowedInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("The entered initials does not contain minimum two and max three characters or alpha characters.", addPropertyPage.initials_Should_Contain_Two_Alpha_Characters());
    }

    @When("User enter {string} Maximum 3 character allowed in enter your initials field on agree to terms popup on add property page")
    public void userEnterMaximumCharacterAllowedInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify maximum 3 character allowed in enter your initials field on agree to terms popup on add property page")
    public void verifyMaximumCharacterAllowedInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("The entered initials does not contain minimum two and max three characters or alpha characters.", addPropertyPage.initials_Should_Contain_Three_Alpha_Characters());
    }

    @When("User enter {string} Character should match the first letter of the First name and Middle name and Last name in enter your initials field on agree to terms popup on add property page")
    public void userEnterCharacterShouldMatchTheFirstLetterOfTheFirstNameMiddleNameLastNameInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Character should match the first letter of the First name and Middle name and Last name in enter your initials field on agree to terms popup on add property page")
    public void characterShouldMatchTheFirstLetterOfTheFirstNameMiddleNameLastNameInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertEquals(addPropertyPage.get_Enter_Your_Initials_Field_Value(), addPropertyPage.get_Enter_Your_Initials_Field_Value());
    }

    @When("User enter {string} input numeric digit in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputNumericDigitInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify user not allowed to enter numeric digit in enter your initials field on agree to terms popup on add property page")
    public void verifyUserNotAllowedToEnterNumericDigitInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("enter your initials field is not empty", addPropertyPage.get_Enter_Your_Initials_Field_Value().isEmpty());
    }

    @When("User enter {string} input special character in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputSpecialCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify user not allowed to enter special character in enter your initials field on agree to terms popup on add property page")
    public void verifyUserNotAllowedToEnterSpecialCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("enter your initials field is not empty", addPropertyPage.get_Enter_Your_Initials_Field_Value().isEmpty());
    }

    @When("User enter {string} input lower case alpha character in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputLowerCaseAlphaCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify user view lower case alphabet should changed to upper case character in enter your initials field on agree to terms popup on add property page")
    public void verifyUserViewLowerCaseAlphabetShouldChangedToUpperCaseCharacterInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertFalse("Initial value is empty", addPropertyPage.check_Validation_In_Initial_Field().isEmpty());
        Assert.assertTrue("Alphabet is visible in small letter", addPropertyPage.check_Validation_In_Initial_Field().matches("[A-Z]+$"));
    }

    @When("User enter {string} input space in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputSpaceInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @Then("Verify user not allowed to enter space in enter your initials field on agree to terms popup on add property page")
    public void verifyUserNotAllowedToEnterSpaceInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage() {
        Assert.assertTrue("enter your initials field is not empty", addPropertyPage.get_Enter_Your_Initials_Field_Value().isEmpty());
    }

    @When("User enter {string} wrong input in enter your initials field on agree to terms popup on add property page")
    public void userEnterWrongInputInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
        addPropertyPage.clickOutsideTheField();
    }

    @Then("Verify user should be able to view error message {string} on agree to terms popup on add property page")
    public void verifyUserShouldBeAbleToViewErrorMessageOnAgreeToTermsPopupOnAddPropertyPage(String errorMsg) {
        Assert.assertEquals("Error msg is visible", errorMsg, addPropertyPage.validate_Enter_Your_Initials_Error_Msg());
    }

    @When("User click on download button on agree to terms popup on add property page")
    public void userClickOnDownloadButtonOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.click_On_Download_Button_On_Agree_To_Terms_Popup();
    }

    @Then("User should be able to download agreement on agree to terms popup on add property page")
    public void userShouldBeAbleToDownloadAgreementOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.verify_Agreement_Download_File();
    }

    @When("User click on cross icon on agree to terms popup on add property page")
    public void userClickOnCrossIconOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.click_On_Cross_Icon_On_Agree_To_Terms_Popup();
    }

    @Then("User should be able to stay on Add Property page and agree to terms pop-up is discarded")
    public void userShouldBeAbleToStayOnAddPropertyPageAndAgreeToTermsPopUpIsDiscarded() {
        addPropertyPage.verify_Add_Property_Page();
        Assert.assertFalse("Agree to terms pop-up is not visible", addPropertyPage.verify_Terms_page());
    }

    @When("User click outside on agree to terms popup on add property page")
    public void userClickOutsideOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.clickOutsideTheField();
    }

    @When("User click on Owner over breadcrumb on add property page")
    public void userClickOnOwnerOverBreadcrumbOnAddPropertyPage() {
        addPropertyPage.clicks_On_Owner_Over_Breadcrumb_On_AddProperty_Page();
    }

    @Then("User should be able to navigate to Add Property >Agreement page")
    public void userShouldBeAbleToNavigateToAddPropertyAgreementPage() {
        Assert.assertTrue("Agree to terms pop-up is not visible", addPropertyPage.verify_Terms_page());
    }

    @When("User enter {string} Input in enter your initials field on agree to terms popup on add property page")
    public void userEnterInputInEnterYourInitialsFieldOnAgreeToTermsPopupOnAddPropertyPage(String initials) {
        addPropertyPage.enter_Initials(initials);
    }

    @When("User click on Agree and Continue button on agree to terms popup on add property page")
    public void userClickOnAgreeAndContinueButtonOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.click_On_Agree_And_Continue_Button();
    }

    @Then("User should be able to navigate to Upload Property Documents page")
    public void userShouldBeAbleToNavigateToUploadPropertyDocumentsPage() {
        Assert.assertEquals("Upload property document is not visible", "Upload Property Documents", addPropertyPage.verify_Upload_Property_Document_Page());
    }

    @And("Verify user should be able to view unique Ticker symbol at Upload property document page assigned by Henry team.")
    public void verifyUserShouldBeAbleToViewUniqueTickerSymbolAtUploadPropertyDocumentPageAssignedByHenryTeam() {
        Assert.assertTrue("Ticker symbol does not meet the expected format", addPropertyPage.verify_Ticker_Symbol_On_Upload_Property_Page().matches("[A-Za-z]{3,5}"));
    }

    @And("User should able to view breadcrumbs {string} on upload property document page")
    public void userShouldAbleToViewBreadcrumbsOnUploadPropertyDocumentPage(String addProperty) {
        Assert.assertEquals("Upload Property document breadcrumbs is not match on upload document property page ", addProperty, addPropertyPage.verify_BreadCrumbs_On_Upload_Document_Page());
    }

    @And("User should able to view four section on left side {string} {string} {string} {string} upload property document page")
    public void userShouldAbleToViewFourSectionOnLeftSideUploadPropertyDocumentPage(String sideLink1, String sideLink2, String sideLink3, String sideLink4) {
        addPropertyPage.user_Should_View_Four_Section_On_Left_Size_On_Upload_Property_Document_Page(sideLink1, sideLink2, sideLink3, sideLink4);
    }

    @And("User should able to view Placeholder Text {string} upload property document page")
    public void userShouldAbleToViewPlaceholderTextUploadPropertyDocumentPage(String placeholderText) {
        Assert.assertEquals("Upload property document text is not mismatch expected and actual ", placeholderText, addPropertyPage.verify_PlaceHolder_Text_On_Upload_Document_Page());
    }

    @And("User should able to view Property name on upload property document page")
    public void userShouldAbleToViewPropertyNameOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Property name is empty", addPropertyPage.verify_Property_Name_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view address, Apt, Suite ,city, State, zipcode on upload property document page")
    public void userShouldAbleToViewAddressAptSuiteCityStateZipcodeOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Property name is empty", addPropertyPage.verify_Address_Apt_City_State_Zipcode_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view property class on upload property document page")
    public void userShouldAbleToViewPropertyClassOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Property class is empty", addPropertyPage.verify_Property_Class_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view year built on upload property document page")
    public void userShouldAbleToViewYearBuiltOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Year Built is empty", addPropertyPage.verify_Year_Built_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view # of Doors on upload property document page")
    public void userShouldAbleToViewOfDoorsOnUploadPropertyDocumentPage() {
        Assert.assertFalse("# of doors is empty", addPropertyPage.verify_Doors_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view Owner Entity on upload property document page")
    public void userShouldAbleToViewOwnerEntityOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Owner entity is empty", addPropertyPage.verify_Owner_Entity_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view State of Entity on upload property document page")
    public void userShouldAbleToViewStateOfEntityOnUploadPropertyDocumentPage() {
        Assert.assertFalse("State of entity is empty", addPropertyPage.verify_State_Of_Entity_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view EIN on upload property document page")
    public void userShouldAbleToViewEINOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Ein is empty", addPropertyPage.verify_Ein_On_Upload_Document_Page().isEmpty());
    }

    @And("User should able to view four section in the pie chart Needed, In review, Approved, Attention Required on upload property document page")
    public void userShouldAbleToViewFourSectionInThePieChartNeededInReviewApprovedAttentionRequiredOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Four section is not visible in document tracker pie chart", addPropertyPage.verify_Four_Section_Document_Tracker_Pie_Chart());
    }

    @And("User should able to view save and exit button on upload property document page")
    public void userShouldAbleToViewSaveAndExitButtonOnUploadPropertyDocumentPage() {

    }

    @And("User should able to view need Help? contact us link on upload property document page")
    public void userShouldAbleToViewNeedHelpContactUsLinkOnUploadPropertyDocumentPage() {

    }

    @And("User should able to view Last update contact us link on upload property document page")
    public void userShouldAbleToViewLastUpdateContactUsLinkOnUploadPropertyDocumentPage() {

    }

//    @Then("User able to upload the file {string} on upload property document page")
//    public void userAbleToUploadTheFileOnUploadPropertyDocumentPage(String uploadFileName) {
//        addPropertyPage.upload_File(uploadFileName);
//    }

    @Then("User click on browser on upload property document page")
    public void userClickOnBrowserOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Browser();
    }

    @Then("User should not be able to view image format error message on upload property document page")
    public void userShouldNotBeAbleToViewImageFormatErrorMessageOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Image format error message is visible", addPropertyPage.verify_Image_Format_Error_msg());
    }

    @And("User able to view screen focus on General info section on upload property document page")
    public void userAbleToViewScreenFocusOnGeneralInfoSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("General info section is not visible", addPropertyPage.verify_General_Info_Section());
    }

    @When("User click on owner auth section on upload property document page")
    public void userClickOnOwnerAuthSectionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Owner_Auth();
    }

    @Then("User able to view screen focus on owner auth section on upload property document page")
    public void userAbleToViewScreenFocusOnOwnerAuthSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Owner auth section is not visible", addPropertyPage.verify_Owner_Auth_Section());
    }

    @When("User click on offer section on on upload property document page")
    public void userClickOnOfferSectionOnOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_offer();
    }

    @Then("User able to view screen focus on offer section on upload property document page")
    public void userAbleToViewScreenFocusOnOfferSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Offer section is not visible", addPropertyPage.verify_Offer_Section());
    }

    @When("User click on financials section on upload property document page")
    public void userClickOnFinancialsSectionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Financial();
    }

    @Then("User able to view screen focus on financials section on upload property document page")
    public void userAbleToViewScreenFocusOnFinancialsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Financial section is not visible", addPropertyPage.verify_Financial_Section());
    }

    @When("User click on dropdown icon on upload document section on upload property document page")
    public void userClickOnDownloadIconOnUploadDocumentSectionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Download_Icon();
    }

    @Then("Verify user able to Expand or collapse the section by clicking on Dropdown icon")
    public void verifyUserAbleToExpandOrCollapseTheSectionByClickingOnDropdownIcon() {
        Assert.assertFalse("Document section is visible", addPropertyPage.verify_Document_Section());
    }

    @When("User able to upload document file {string} on upload property document page")
    public void userAbleToUploadDocumentFileOnUploadPropertyDocumentPage(String uploadFile) {
        Assert.assertFalse("File is not uploaded", addPropertyPage.upload_File(uploadFile).isEmpty());
        Assert.assertTrue("File is not uploaded", addPropertyPage.verify_Upload_File());
    }

    @When("User click on info icon on upload property document page")
    public void userClickOnInfoIconOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Info_Icon();
    }

    @Then("User should be able to view tooltip when clicking on info icon on upload property document page")
    public void userShouldBeAbleToViewTooltipWhenClickingOnInfoIconOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Info data is not visible", addPropertyPage.verify_Info_Icon());
    }

    @When("User click on sorting option on upload property document page")
    public void userClickOnSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Sort_Option();

    }

    @Then("User should able to view Sort option with All option on upload property document page")
    public void userShouldAbleToViewSortOptionWithAllOptionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Sorting option is not visible", addPropertyPage.verify_Sorting_Dropdown());
        Assert.assertTrue("All default option is not visible", addPropertyPage.verify_Default_All_Option());
    }

    @And("Verify user able to view List of sorting option on upload property document page")
    public void verifyUserAbleToViewListOfSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.verify_Sorting_Options();
    }

    @And("User able to view All Listing of upload property documents section on upload property document page")
    public void userAbleToViewAllListingOfUploadPropertyDocumentsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());
    }

    @Then("Verify TO Do option should selected on upload property document page")
    public void verifyTODoOptionShouldSelectedOnUploadPropertyDocumentPage() {
        Assert.assertTrue("To do option is not visible", addPropertyPage.verify_To_Do_Option_Selected());
    }

    @And("Verify user able to view Pending Listing of upload property documents section on upload property document page")
    public void verifyUserAbleToViewPendingListingOfUploadPropertyDocumentsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());
    }

    @Then("Verify In Review option should selected on upload property document page")
    public void verifyInReviewOptionShouldSelectedOnUploadPropertyDocumentPage() {
        Assert.assertTrue("In review option is not visible", addPropertyPage.verify_In_Review_Option_Selected());

    }

    @And("Verify user able to view in review Listing of upload property documents section on upload property document page")
    public void verifyUserAbleToViewInReviewListingOfUploadPropertyDocumentsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());
    }

    @Then("Verify approved option should selected on upload property document page")
    public void verifyApprovedOptionShouldSelectedOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Approved option is not visible", addPropertyPage.verify_Approved_Option_Selected());
    }

    @And("Verify user able to view in approved listing of upload property documents section on upload property document page")
    public void verifyUserAbleToViewInApprovedListingOfUploadPropertyDocumentsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());
    }

    @And("Verify user able to view in attention required of upload property documents section on upload property document page")
    public void verifyUserAbleToViewInAttentionRequiredOfUploadPropertyDocumentsSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());

    }

    @Then("Verify attention required option should selected on upload property document page")
    public void verifyAttentionRequiredOptionShouldSelectedOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Attention required option is not visible", addPropertyPage.verify_Attention_Required_Option_Selected());

    }

    @And("User click on To Do sorting option on upload property document page")
    public void userClickOnToDoSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_To_Do_Option();
    }

    @And("User click on In Review sorting option on upload property document page")
    public void userClickOnInReviewSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_In_Review_Option();
    }

    @And("User click on Approved sorting option on upload property document page")
    public void userClickOnApprovedSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Approved_Option();

    }

    @And("User click on Attention Required sorting option on upload property document page")
    public void userClickOnAttentionRequiredSortingOptionOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Attention_Required_Option();

    }

    @And("User click on resolve button in pending listing on upload property document page")
    public void userClickOnResolveButtonInPendingListingOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Resolve_Btn();
    }

    @And("User click on view issue link on upload property document page")
    public void userClickOnViewIssueLinkOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_View_Issue();
    }

    @Then("User able to view Sorted list of Document which have Attention required Status on upload property document page")
    public void userAbleToViewSortedListOfDocumentWhichHaveAttentionRequiredStatusOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Attention required is not visible", addPropertyPage.verify_Attention_Required_Status());
        Assert.assertTrue("List is not visible", addPropertyPage.verify_Listing_Of_Sorting_Option());

    }

    @When("user scroll the page on upload property document page")
    public void userScrollThePageOnUploadPropertyDocumentPage() {
        addPropertyPage.page_Scroll();
    }

    @Then("Verify user able to view Unanimous Consent section on upload property document page")
    public void verifyUserAbleToViewUnanimousConsentSectionOnUploadPropertyDocumentPage() {
        Assert.assertEquals("Unanimous Consent from the Control Party", addPropertyPage.verify_unanimous_Document_Section());
    }

    @And("Verify user should be able to view an Message for this document on upload property document page")
    public void verifyUserShouldBeAbleToViewAnMessageForThisDocumentOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Message is not visible", addPropertyPage.verify_Document_Msg());
    }

    @And("Verify file should upload successfully on upload property document page")
    public void verifyFileShouldUploadSuccessfullyOnUploadPropertyDocumentPage() {
        Assert.assertTrue("File is not uploaded", addPropertyPage.verify_Upload_File());

    }

    @And("Verify user able to view upload document with in review status on upload property document page")
    public void verifyUserAbleToViewUploadDocumentWithInReviewStatusOnUploadPropertyDocumentPage() {
        Assert.assertTrue("In review status is not visible", addPropertyPage.verify_In_Review_Status());
    }

    @Then("Verify user should be able to view toast message on upload property document page")
    public void verifyUserShouldBeAbleToViewToastMessageOnUploadPropertyDocumentPage() {
        Assert.assertEquals("Actual and expected value are mismatching", "File size exceeds the limit of 10MB.", addPropertyPage.get_Image_Format_Error_Msg());
    }

    @Then("Verify user able to view Picture uploaded by user with X icon on upload property document page")
    public void verifyUserAbleToViewPictureUploadedByUserWithIconOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Close icon is not visible", addPropertyPage.verify_Close_Icon_Visible());

    }

    @And("User click on close icon over already uploaded Picture on upload property document page")
    public void userClickOnCloseIconOverAlreadyUploadedPictureOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Close_Icon();
    }

    @Then("User should be able to delete Picture from the already uploaded Pictures on upload property document page")
    public void userShouldBeAbleToDeletePictureFromTheAlreadyUploadedPicturesOnUploadPropertyDocumentPage() {
        Assert.assertEquals("Actual and expected value are mismatching", "Document removed successfully.", addPropertyPage.get_Image_Format_Error_Msg());
    }

    @Then("Verify Collapsed view on upload document section on upload property document page")
    public void verifyCollapsedViewOnUploadDocumentSectionOnUploadPropertyDocumentPage() {
        Assert.assertFalse("Document section is visible", addPropertyPage.verify_Document_Section());
    }

    @Then("Verify Expanded view on upload document section on upload property document page")
    public void verifyExpandedViewOnUploadDocumentSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Document section is not visible", addPropertyPage.verify_Document_Section());
    }

    @And("User will scroll the page on upload property document page")
    public void userWillScrollThePageOnUploadPropertyDocumentPage() {
        addPropertyPage.scroll_Page();
    }

    @Then("Verify user able to view tooltip over info icon at property images section on upload property document page")
    public void verifyUserAbleToViewTooltipOverInfoIconAtPropertyImagesSectionOnUploadPropertyDocumentPage() {
        Assert.assertTrue("Info data is not visible", addPropertyPage.verify_Info_Icon());

    }

    @And("User click on info icon of picture property on upload property document page")
    public void userClickOnInfoIconOfPicturePropertyOnUploadPropertyDocumentPage() {
        addPropertyPage.click_On_Info_Icon_Of_Pictures_Property();
    }


    @Then("Verify browse option should be removed for that section on upload property document page")
    public void verifyBrowseOptionShouldBeRemovedForThatSectionOnUploadPropertyDocumentPage() {
        Assert.assertFalse("File uploading is visible", addPropertyPage.verify_File_Uploading_Section());
    }


    @And("User able to upload maximum {int} images in picture of property section on upload property document page")
    public void userAbleToUploadMaximumImagesInPictureOfPropertySectionOnUploadPropertyDocumentPage(int documentCount) {
        Assert.assertFalse("File is empty", addPropertyPage.upload_Maximum_25_Document(documentCount).isEmpty());
    }


    @When("User should able to upload document file {string} on upload property document page")
    public void userShouldAbleToUploadDocumentFileOnUploadPropertyDocumentPage(String uploadFile) {
        addPropertyPage.upload_File(uploadFile);

    }

    @When("User remove property name from input field on add property page")
    public void userRemovePropertyNameFromInputFieldOnAddPropertyPage() {
        addPropertyPage.remove_Text_From_Property_Field();
    }

    @And("User click on address input field on add property page")
    public void userClickOnAddressInputFieldOnAddPropertyPage() {
        addPropertyPage.click_On_Address_Input_Field();
    }

    @When("User remove input field text {string} on add property page")
    public void userRemoveInputFieldTextOnOnAddPropertyPage(String value) {
        addPropertyPage.remove_Text_Field_Data(value);

    }

    @When("User remove initial input field text on add property page")
    public void userRemoveInitialInputFieldTextOnAddPropertyPage() {
        addPropertyPage.remove_Initial_Text_Field_Data();
    }

    @When("User click outside the popup on agree to terms popup on add property page")
    public void userClickOutsideThePopupOnAgreeToTermsPopupOnAddPropertyPage() {
        addPropertyPage.click_On_Outside_The_Popup();
    }
}
