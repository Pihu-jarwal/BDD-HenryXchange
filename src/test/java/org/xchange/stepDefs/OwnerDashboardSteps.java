package org.xchange.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xchange.pom.BuySharePage;
import org.xchange.pom.KycPage;
import org.xchange.pom.OwnerDashboard;
import utils.Helper;
import utils.PropertiesUtil;

public class OwnerDashboardSteps extends Helper {

    KycPage kycPage = new KycPage();
    OwnerDashboard ownerPage = new OwnerDashboard();

    BuySharePage buySharePage = new BuySharePage();

    String ownerNameValue = "";
    String ownerEmailValue = "";

    String ownerMobileNumber = "";


    @And("User click on Owner tab on market page")
    public void userClickOnOwnerTabOnMarketPage() {
        ownerPage.click_On_Owner_Tab();
    }

    @Then("Verify user should be redirected successfully to Owner Dashboard page")
    public void userShouldBeRedirectedSuccessfullyToOwnerDashboardPage() {
        Assert.assertEquals(PropertiesUtil.getEnvironmentKey("URL") + "owner", kycPage.get_Current_Url());
    }

    @And("User able to view placeholder text on owner dashboard page")
    public void userAbleToViewPlaceholderTextOnOwnerDashboardPage() {
        Assert.assertTrue("Placeholder text is not visible", ownerPage.is_Place_Holder_Text_Visible());
    }

    @And("User able to vie apply button on owner dashboard page")
    public void userAbleToVieApplyButtonOnOwnerDashboardPage() {
        Assert.assertTrue("Apply now button is not visible", ownerPage.is_Apply_Now_Btn_Visible());
    }

    @When("User click on apply now button on owner dashboard page")
    public void userClickOnApplyNowButtonOwnerDashboardPage() {
        ownerPage.click_On_Apply_Now_Btn();
    }

    @Then("User should be navigated to \"Submit Your Application\" page")
    public void userShouldBeNavigatedToPage() {
        Assert.assertEquals("Submit pge is not visible", "Submit Your Application", ownerPage.verify_Submit_your_Application_Page());
    }

    @When("User remove input field text {string} on submit your application page")
    public void userRemoveInputFieldTextOnSubmitYourApplicationPage(String value) {
        remove_Text_Field_Data(value);
    }

    @Then("Verify owner name field should be mandatory on submit your application page")
    public void verifyOwnerNameFieldShouldBeMandatoryOnSubmitYourApplicationPage() {
        Assert.assertEquals("Name field is not mandatory", "Name is required", ownerPage.validate_Owner_Name_Error_Msg());
    }

    @Then("Verify owner email field should be mandatory on submit your application page")
    public void verifyOwnerEmailFieldShouldBeMandatoryOnSubmitYourApplicationPage() {
        Assert.assertEquals("Email field is not mandatory", "Email is required", ownerPage.validate_Owner_Email_Error_Msg());
    }

    @Then("Verify owner contact field should be mandatory on submit your application page")
    public void verifyOwnerContactFieldShouldBeMandatoryOnSubmitYourApplicationPage() {
        Assert.assertEquals("Mobile field is not mandatory", "Mobile Number is required", ownerPage.validate_Owner_Contact_Error_Msg());
    }

    @When("User click on aum input field on submit your application page")
    public void userClickOnAumInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Aum_Input_Field();
    }

    @When("User click on number of properties input field on submit your application page")
    public void userClickOnNumberOfPropertiesInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Number_Of_Properties_Field();
    }

    @Then("Verify Aum input field should be mandatory on submit your application page")
    public void verifyAumInputFieldShouldBeMandatoryOnSubmitYourApplicationPage() {
        Assert.assertEquals("Aum field is not mandatory", "AUM is required", ownerPage.is_Aum_Required());
    }

    @When("User click on business name input field on submit your application page")
    public void userClickOnBusinessNameInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Business_name_Field();
    }

    @Then("Verify business name input field should be optional on submit your application page")
    public void verifyBusinessNameInputFieldShouldBeOptionalOnSubmitYourApplicationPage() {
        Assert.assertEquals("Business Name ( Optional )", ownerPage.validate_Business_Name_Field());
    }

    @When("User enter owner name {string} in input field on submit your application page")
    public void userEnterOwnerNameInInputFieldOnSubmitYourApplicationPage(String ownerName) {
        ownerPage.enter_Owner_Name_In_Input_Field(ownerName);
    }

    @Then("Verify characters UpTo 64 characters in name input field on submit your application page")
    public void verifyCharactersUpToCharactersInNameInputFieldOnSubmitYourApplicationPage() {
        Assert.assertEquals("Max length is not 64", "64", ownerPage.validate_Max_Character_Length());
        Assert.assertNotEquals("Max length is 65", "65", ownerPage.validate_Max_Character_Length());
    }

    @Then("Verify valid Name error message should displayed when invalid data entered in name field on submit your application page")
    public void verifyValidNameErrorMessageShouldDisplayedWhenInvalidDataEnteredInNameFieldOnSubmitYourApplicationPage() {
        Assert.assertEquals("Validation message is not visible", "Please enter a valid name", ownerPage.validate_Owner_Name_Error_Msg());
    }

    @And("User enter less than 2 character {string} in owner name input field on submit your application page")
    public void userEnterLessThanCharacterInOwnerNameInputFieldOnSubmitYourApplicationPage(String ownerName) {
        ownerPage.enter_Owner_Name_In_Input_Field(ownerName);
    }

    @Then("Verify name should be auto filled with same details as displayed in account page")
    public void verifyNameShouldBeAutoFilledWithSameDetailsAsDisplayedInAccountPage() {
        Assert.assertEquals("Actual and expected are mismatching", ownerNameValue, ownerPage.get_User_Name());
    }

    @And("User get the value of owner name input field on submit your application page")
    public void userGetTheValueOfOwnerNameInputFieldOnSubmitYourApplicationPage() {
        ownerNameValue = ownerPage.get_Owner_Name();
    }

    @Then("Verify name should be changed, auto filled name replaced with name on submit your application page")
    public void verifyNameShouldBeSuccessfullyChangedAutoFilledNameReplacedWithNameOnSubmitYourApplicationPage() {
        Assert.assertNotEquals("Auto filled and replaced name are same", ownerNameValue, ownerPage.get_Owner_Name());
    }

    @When("User click on owner name field on submit your application page")
    public void userClickOnOwnerNameFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Owner_Name();
    }

    @And("User click on owner email input field on submit your application page")
    public void userClickOnOwnerEmailInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Owner_Email_field();
    }

    @When("User click on mobile number input field on submit your application page")
    public void userClickOnMobileNumberInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Mobile_Field();
    }

    @Then("Verify number of properties field should be mandatory on submit your application page")
    public void verifyNumberOfPropertiesFieldShouldBeMandatoryOnSubmitYourApplicationPage() {
        Assert.assertEquals("Validation message is not visible", "Number Of Properties is required", ownerPage.verify_Number_Of_Properties_Field());
    }

    @When("User enter email {string} in input field on submit your application page")
    public void userEnterEmailInInputFieldOnSubmitYourApplicationPage(String email) {
        ownerPage.enter_Email_In_Input_Field(email);
    }

    @Then("User should be type valid email address in email field on submit your application page")
    public void userShouldBeTypeValidEmailAddressInEmailFieldOnSubmitYourApplicationPage() {
        String value = ownerPage.get_Owner_Email();
        validateEmail(value);
    }

    @Then("Verify error message should be displayed if any invalid email entered on submit your application page")
    public void verifyErrorMessageShouldBeDisplayedIfAnyInvalidEmailEnteredOnSubmitYourApplicationPage() {
        Assert.assertEquals("Email is not valid", "This is not a correct email address.", ownerPage.validate_Owner_Email_Error_Msg());
    }

    @And("User get the value of owner email input field on submit your application page")
    public void userGetTheValueOfOwnerEmailInputFieldOnSubmitYourApplicationPage() {
        ownerEmailValue = ownerPage.get_Owner_Email();
    }

    @Then("Verify email should be auto filled with same details as displayed in account page")
    public void verifyEmailShouldBeAutoFilledWithSameDetailsAsDisplayedInAccountPage() {
        Assert.assertEquals("Actual and expected are mismatching", ownerEmailValue, ownerPage.get_User_Email());
    }

    @Then("Verify email should be changed, auto filled email replaced with email on submit your application page")
    public void verifyNameShouldBeChangedAutoFilledEmailReplacedWithEmailOnSubmitYourApplicationPage() {
        Assert.assertNotEquals("Auto filled and replaced email are same", ownerEmailValue, ownerPage.get_Owner_Email());
    }

    @When("User enter mobile number {string} in input field on submit your application page")
    public void userEnterMobileNumberInInputFieldOnSubmitYourApplicationPage(String number) {
        ownerPage.enter_Mobile_Number_In_Input_Field(number);
    }

    @And("User able to view a green check mark in mobile number input field on submit your application page")
    public void userAbleToViewAGreenCheckMarkInMobileNumberInputFieldOnSubmitYourApplicationPage() {
        Assert.assertTrue("Green check is not visible", ownerPage.is_Green_Check_Visible());
    }

    @And("User get the mobile number in mobile number field on submit your application page")
    public void userGetTheMobileNumberInMobileNumberFieldOnSubmitYourApplicationPage() {
        ownerMobileNumber = ownerPage.get_Mobile_Number();
    }

    @Then("Verify phone number should auto filled with same number used by user while completing KYC on submit your application page")
    public void verifyPhoneNumberShouldAutoFilledWithSameNumberUsedByUserWhileCompletingKYCOnSubmitYourApplicationPage() {
        Assert.assertEquals("Mobile number is not same as account mobile number", ownerMobileNumber, ownerPage.get_Mobile_Number_Of_Account_Page());
    }

    @And("User enter business name {string} in input field on submit your application page")
    public void userEnterBusinessNameInInputFieldOnSubmitYourApplicationPage(String businessName) {
        ownerPage.enter_Business_Name(businessName);
    }

    @Then("Verify All input values should be accepted in business input field on submit your application page")
    public void verifyAllInputValuesShouldBeAcceptedInBusinessInputFieldOnSubmitYourApplicationPage() {
        Assert.assertEquals("All input did not accept in business field", "ABC, 123, $%^", ownerPage.get_Business_Name());
    }

    @Then("User should able to view validation message when enter less than 2 character in business field")
    public void userShouldAbleToViewValidationMessageWhenEnterLessThanCharacterInBusinessField() {
        Assert.assertEquals("Business name must have minimum 2 characters.", ownerPage.validate_business_name_Field_Error_Msg());
    }

    @Then("Verify aum dropdown should be visible when I click on aum field on submit your application page")
    public void verifyAumDropdownShouldBeVisibleWhenIClickOnAumFieldOnSubmitYourApplicationPage() {
        Assert.assertTrue("Aum dropdown is not visible", ownerPage.is_Aum_Dropdown_Visible());
    }

    @And("User should be able to view aum field dropdown options on submit your application page")
    public void userShouldBeAbleToViewAumFieldDropdownOptionsOnSubmitYourApplicationPage() {
        ownerPage.is_Aum_Options_Visible();
    }

    @When("User click on dropdown option from aum input field on submit your application page")
    public void userClickOnDropdownOptionFromAumInputFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Aum_Dropdown_Option();
    }

    @Then("Verify aum option should be selected and displayed in aum field on submit your application page")
    public void verifyAumOptionShouldBeSelectedAndDisplayedInAumFieldOnSubmitYourApplicationPage() {
        Assert.assertFalse("Aum option did not select", ownerPage.is_Aum_Option_Selected());
    }

    @Then("Verify number of properties dropdown should be visible on submit your application page")
    public void verifyNumberOfPropertiesDropdownShouldBeVisibleOnSubmitYourApplicationPage() {
        Assert.assertTrue("Number of properties dropdown is not visible", ownerPage.is_Number_Of_Properties_Dropdown_Visible());
    }

    @When("User click on dropdown option from number of properties field on submit your application page")
    public void userClickOnDropdownOptionFromNumberOfPropertiesFieldOnSubmitYourApplicationPage() {
        ownerPage.click_On_Aum_Dropdown_Option();
    }

    @And("User should be able to view number of properties option should be visible on submit your application page")
    public void userShouldBeAbleToViewNumberOfPropertiesOptionShouldBeVisibleOnSubmitYourApplicationPage() {
        ownerPage.is_Aum_Options_Visible();
    }

    @Then("Verify 6 options displayed in aum drop down on submit your application page")
    public void verifyAumDropdownOptionFromOptionsDisplayedInDropDownOnSubmitYourApplicationPage() {
        Assert.assertEquals("Aum field 6 option is not visible", 6, ownerPage.validate_Count_Of_Dropdown_Options());
    }

    @Then("Verify 4 options displayed in number of properties drop down on submit your application page")
    public void verifyOptionsDisplayedInNumberOfPropertiesDropDownOnSubmitYourApplicationPage() {
        Assert.assertEquals("Number of properties field 4 option is not visible", 4, ownerPage.validate_Count_Of_Dropdown_Options());

    }

    @Then("Verify number of properties option should be selected and displayed in field on submit your application page")
    public void verifyNumberOfPropertiesOptionShouldBeSelectedAndDisplayedInFieldOnSubmitYourApplicationPage() {
        Assert.assertFalse("Property option did not select", ownerPage.is_Number_Of_Property_Selected());

    }

    @Then("Verify apply Now button should remain disabled if all mandatory fields unfilled on submit your application page")
    public void verifyApplyNowButtonShouldRemainDisabledIfAllMandatoryFieldsUnfilledOnSubmitYourApplicationPage() {
        Assert.assertFalse("Apply now button is enabled", ownerPage.is_Apply_Number_Enabled());
    }


    @Then("Verify apply Now button should active once all the mandatory fields on submit your application page")
    public void verifyApplyNowButtonShouldActiveOnceAllTheMandatoryFieldsOnSubmitYourApplicationPage() {
        Assert.assertTrue("Apply now button is disabled", ownerPage.is_Apply_Number_Enabled());

    }

    @And("User enter name {string} in input field on submit your application page")
    public void userEnterNameInInputFieldOnSubmitYourApplicationPage(String name) {
        ownerPage.enter_Name_In_Input_Field(name);
    }

    @Then("Verify apply Now button should disabled if mandatory fields are invalid on submit your application page")
    public void verifyApplyNowButtonShouldDisabledIfMandatoryFieldsAreInvalidOnSubmitYourApplicationPage() {
        Assert.assertFalse("Apply now button is enabled", ownerPage.is_Apply_Number_Enabled());

    }

    @Then("Verify application is under review should displayed when application is submitted on owner dashboard page")
    public void verifyApplicationIsUnderReviewShouldDisplayedWhenApplicationIsSubmittedOnOwnerDashboardPage() {
        Assert.assertEquals("Application submitted message is not visible", "Your application is currently under Review.", ownerPage.get_Under_Reviewed_Text());
    }

    @Then("Verify User able to view placeholder text on owner dashboard page")
    public void verifyUserAbleToViewPlaceholderTextOnOwnerDashboardPage() {
        Assert.assertTrue("Owner dashboard text is not viisble", ownerPage.is_OwnerDashboard_Text_Visible());

    }

    @And("Verify User able to view listed placeholder text on owner dashboard page")
    public void verifyUserAbleToViewListedPlaceholderTextOnOwnerDashboardPage() {
        Assert.assertTrue("Listed property text is not visible", ownerPage.is_Listed_Property_Text_Visible());

    }

    @And("Verify don't have properties text on owner dashboard page")
    public void verifyDonTHavePropertiesTextOnOwnerDashboardPage() {
        Assert.assertTrue("Don't have property text is not visible", ownerPage.is_Owner_Placeholder_Text_Visible());
    }

    @Then("Verify application submitted form should be visible on owner dashboard page")
    public void verifyApplicationSubmittedFormShouldBeVisibleOnOwnerDashboardPage() {
        Assert.assertTrue("Application popup is not visible", ownerPage.is_Application_Form_Submitted_Popup_Visible());
    }

    @And("Verify application placeholder text should be visible on owner dashboard page")
    public void verifyApplicationPlaceholderTextShouldBeVisibleOnOwnerDashboardPage() {
        Assert.assertTrue("Placeholder text is not visible", ownerPage.is_Application_Placeholder_Text_Visible());

    }

    @When("User click on close btn of Application form on owner dashboard page")
    public void userClickOnCloseBtnOfApplicationFormOnOwnerDashboardPage() {
        buySharePage.click_On_Close_Icon();
    }

    @And("User click on apply now button on submit your application page")
    public void userClickOnApplyNowButtonOnSubmitYourApplicationPage() {
        ownerPage.click_On_Apply_Now_Btn();
    }

    @Then("Verify count listed properties should equal to number of properties in Listed Properties list on owner dashboard page")
    public void countForListedPropertiesShouldEqualToNumberOfPropertiesInListedPropertiesListOnOwnerDashboardPage() {
        Assert.assertEquals("Properties count are not same", ownerPage.get_Listed_Property_Count(), ownerPage.get_Listed_Property());
    }

    @And("User click on sort by filter on owner dashboard page")
    public void userClickOnSortByFilterOnOwnerDashboardPage() {
        ownerPage.click_On_Sort_By_Filter();
    }

    @Then("Verify drop down should opened on clicking on Sort by option on owner dashboard page")
    public void verifyDropDownShouldOpenedOnClickingOnSortByOptionOnOwnerDashboardPage() {
        ownerPage.is_Sort_By_Dropdown_Visible();
    }

    @And("Verify user able to view UI details when clicked on Sort by on owner dashboard page")
    public void userShouldAbleToViewUIDetailsWhenClickedOnSortByOnOwnerDashboardPage() {
        ownerPage.verify_Dropdown_List_Of_Sort_By_Filter();
    }

    @And("Verify user able to select any of option from drop down on owner dashboard page")
    public void userShouldAbleToSelectAnyOfOptionFromDropDownOnOwnerDashboardPage() {
        ownerPage.click_On_Sort_By_Option();
    }

    @And("Verify option selected will be displayed instead of Sort by on owner dashboard page")
    public void verifyOptionSelectedWillBeDisplayedInsteadOfSortByOnOwnerDashboardPage() {
        Assert.assertEquals("Both values are not equal", ownerPage.get_Filter_Option_Value(), ownerPage.get_Sort_By_Option_Value());

    }

    @When("User click on cross icon on selected filters chip on owner dashboard page")
    public void userClickOnCrossIconOnSelectedFiltersChipOnOwnerDashboardPage() {
        ownerPage.click_On_Cross_Icon();
    }

    @Then("Verify option selected should removed on selected filters chip on owner dashboard page")
    public void verifyOptionSelectedShouldRemovedOnSelectedFiltersChipOnOwnerDashboardPage() {
        Assert.assertFalse("Filter option is visible", ownerPage.verify_Filter_Option_Visible());

    }

    @Then("Verify user should be able to view UI of search bar on owner dashboard page")
    public void verifyUserShouldBeAbleToViewUIOfSearchBarOnOwnerDashboardPage() {
        Assert.assertTrue("Search bar is not visible", ownerPage.is_Search_Bar_Visible());
    }

    @When("User enter {string} characters in search bar on owner dashboard page")
    public void userEnterLessThanCharactersInSearchBarOnOwnerDashboardPage(String name) {
        ownerPage.enter_Property_Name_In_Input_Field(name);
    }

    @Then("Verify no value of search result should displayed when less than 3 characters is searched on owner dashboard")
    public void verifyNoValueOfSearchResultShouldDisplayedWhenLessThanCharactersIsSearchedOnOwnerDashboard() {
        Assert.assertFalse("search result is visible", ownerPage.is_Search_Bar_result_Visible());
    }

    @Then("Verify result as per the typed value should be displayed in search drop down on owner dashboard page")
    public void verifyResultAsPerTheTypedValueShouldBeDisplayedInSearchDropDownOnOwnerDashboardPage() {
        Assert.assertEquals("Dropdown value are not same", ownerPage.get_Search_Bar_value(), ownerPage.get_Dropdown_Search_value());
    }

    @Then("Verify search result not found should displayed when data searched is not in list on owner dashboard page")
    public void verifySearchResultNotFoundShouldDisplayedWhenDataSearchedIsNotInListOnOwnerDashboardPage() {
        Assert.assertEquals("Search result not found.", ownerPage.verify_No_Search_Result_Found());
    }

    @When("User click on close icon of search bar on owner dashboard page")
    public void userClickOnCloseIconOfSearchBarOnOwnerDashboardPage() {
        ownerPage.click_On_Close_Icon();
    }

    @Then("Verify searched input should be removed from search bar on owner dashboard page")
    public void verifySearchedInputShouldBeRemovedFromSearchBarOnOwnerDashboardPage() {
        Assert.assertTrue("Search bar field is not empty", ownerPage.get_Search_Bar_value().isEmpty());
    }

    @Then("User able to view property name, address, show all results on search bar dropdown on owner dashboard page")
    public void userShouldBeAbleToViewPropertyNameAddressShowAllResultsOnOwnerDashboardPage() {
        Assert.assertEquals("Dropdown value are not same", ownerPage.get_Search_Bar_value(), ownerPage.get_Dropdown_Search_value());
        Assert.assertTrue("Address is not visible", ownerPage.is_Property_Address_Visible());
        Assert.assertTrue("Show all result btn is not visible", ownerPage.verify_Show_All_Result_Btn());

    }

    @Then("Verify characters which user has typed, should highlighted in search dropdown on owner dashboard page")
    public void verifyCharactersWhichUserHasTypedShouldHighlightedInSearchDropdownOnOwnerDashboardPage() {
        Assert.assertTrue("Search value is not highlight", ownerPage.verify_Search_Value_Highlighted_In_Dropdown());
    }

    @And("User click on show all results below the search bar on owner dashboard page")
    public void userClickOnShowAllResultsBelowTheSearchBarOnOwnerDashboardPage() {
        ownerPage.click_On_Show_All_Result();
    }

    @Then("Verify property as per the search performed should filtered and displayed on owner dashboard page")
    public void verifyPropertyAsPerTheSearchPerformedShouldFilteredAndDisplayedOnOwnerDashboardPage() {
        Assert.assertEquals("Property name are mismatching", ownerPage.get_Search_Bar_value(), ownerPage.get_Property_Name());
    }

    @Then("Verify user able to view listed property column heading on owner dashboard page")
    public void verifyUserAbleToViewListedPropertyColumnHeadingOnOwnerDashboardPage() {
        ownerPage.verify_Column_Name_Headings();
    }

    @And("User click on name filter on owner dashboard page")
    public void userClickOnNameFilterOnOwnerDashboardPage() {
        ownerPage.click_On_Name_Filter();
    }

    @Then("Verify name filter drop down, below options should be displayed on owner dashboard page")
    public void verifyNameFilterDropDownBelowOptionsShouldBeDisplayedOnOwnerDashboardPage() {
        ownerPage.verify_Dropdown_Option_Of_Name_Filter();
    }

    @Then("Verify drop down should be displayed on clicking on sorting arrows on owner dashboard page")
    public void verifyDropDownShouldBeDisplayedOnClickingOnSortingArrowsOnOwnerDashboardPage() {
        ownerPage.verify_Name_Dropdown();
    }

    @And("verify default Newest to Oldest should be selected on owner dashboard page")
    public void verifyDefaultNewestToOldestShouldBeSelectedOnOwnerDashboardPage() {
        Assert.assertTrue("Newest to oldest default is not selected", ownerPage.is_Newest_To_Oldest_Filter_Selected());
    }

    @When("User click on a to z filter of sorting arrows on owner dashboard page")
    public void userClickOnAToZFilterOfSortingArrowsOnOwnerDashboardPage() {
        ownerPage.click_On_A_To_Z_Filter();
    }

    @Then("Verify properties Should be sorted as per option selected from name sorting option on owner dashboard page")
    public void verifyPropertiesShouldBeSortedAsPerOptionSelectedFromNameSortingOptionOnOwnerDashboardPage() {
        Assert.assertTrue("A to Z filter is not visible", ownerPage.verify_A_To_Z_Filter());
    }

    @And("Verify pending properties should include columns on owner dashboard page")
    public void verifyPendingPropertiesShouldIncludeColumnsOnOwnerDashboardPage() {
        ownerPage.verify_Pending_Properties_Column_Name();
    }

    @And("Verify draft should displayed as default status of Pending Properties on owner dashboard page")
    public void verifyDraftWillBeDisplayedAsDefaultStatusOfPendingProperties() {
        Assert.assertTrue("Draft is not visible", ownerPage.verify_Draft_Functionality());
    }

    @And("Verify review should display when user has uploaded all documents on owner dashboard page")
    public void verifyReviewShouldDisplayWhenUserHasUploadedAllDocumentsOnOwnerDashboardPage() {
        Assert.assertTrue("Review button is not visible", ownerPage.verify_Review_Btn());
    }

    @Then("Verify no error message should displayed on entering existing mobile number on submit your application page")
    public void verifyNoErrorMessageShouldDisplayedOnEnteringExistingMobileNumberOnSubmitYourApplicationPage() {
        Assert.assertFalse("Error message is visible", ownerPage.is_Error_Message_Visible());
    }

    @And("Verify option to be included below Listed Properties with cross icon on owner dashboard page")
    public void verifyOptionToBeIncludedBelowListedPropertiesWithCrossIconOnOwnerDashboardPage() {
        Assert.assertTrue("Filter option is not visible", ownerPage.verify_Filter_Option_Visible());
    }

    @Then("Verify list of Properties should sorted as per option selected on owner dashboard page")
    public void verifyListOfPropertiesShouldSortedAsPerOptionSelectedOnOwnerDashboardPage() {
        Assert.assertEquals("Property name are mismatching", ownerPage.get_Search_Bar_value(), ownerPage.get_Property_Name());

    }

    @Then("User able to view error message when enters less than 10 digit number in input field on submit your application page")
    public void userAbleToViewErrorMessageWhenEntersLessThanDigitNumberInInputFieldOnSubmitYourApplicationPage() {
        Assert.assertEquals("Please ensure a valid 10-digit phone number is entered.", ownerPage.verify_Error_Msg_On_Owner_Contact_Field());

    }

    @Then("Verify error message should displayed on entering invalid Mobile number on submit your application page")
    public void verifyErrorMessageShouldDisplayedOnEnteringInvalidMobileNumberOnSubmitYourApplicationPage() {
        Assert.assertEquals("This is not a valid mobile number", ownerPage.verify_Error_Msg_On_Owner_Contact_Field());
    }

    @Then("Verify {string} is number of required documents for pending properties on owner dashboard page")
    public void verifyIsNumberOfRequiredDocumentsForPendingPropertiesOnOwnerDashboardPage(String documentCount) {
        Assert.assertEquals("29 count is visible",documentCount, ownerPage.get_Document_Value());
    }

    @Then("Verify Attention Required should display when any uploaded document has been rejected by Henry Team on owner dashboard page")
    public void verifyAttentionRequiredShouldDisplayWhenAnyUploadedDocumentHasBeenRejectedByHenryTeamOnOwnerDashboardPage() {
    Assert.assertEquals("Attention required is not visible","Attention required", ownerPage.is_Attention_Required_Visible());
    }

    @Then("Verify No count should be displayed when there is no property included on owner dashboard")
    public void verifyNoCountShouldBeDisplayedWhenThereIsNoPropertyIncludedOnOwnerDashboard() {
        Assert.assertFalse("Property count is visible", ownerPage.verify_Listed_Property_Count_Visible());
    }

    @Then("Verify listed Properties should rearranged as per sorting option on owner dashboard page")
    public void verifyListedPropertiesShouldRearrangedAsPerSortingOptionOnOwnerDashboardPage() {
        Assert.assertTrue("Filter option is not visible", ownerPage.verify_Filter_Option_Visible());
    }



}
