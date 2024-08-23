@UploadPropertyDocumentPage

Feature: Upload Property Document Page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - rahul.rana@appinventiv.com
    And User enters a password on login page in input field - Demo@1234567
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User click on owner tab on market page
    Then User navigate to owner dashboard page
    When User click on add property button on owner dashboard page
    Then User navigate to add property page
    When  User enter the property name "AlphaOak" on add property page
    And User click on address text field on add property page
    And User enter the address "413" on add property page on add property page
    And  User able to select option in address dropdown on add property page
    And User enter the character "This is Testing" in Apt,Suite field on add property page
    And User click on doors field on add property page
    And User enter doors "2" in doors field on add property page
    And User click on property class field on add property page
    Then User able to view property class dropdown options on add property page
    And User able to select option "A" in property class field on add property page
    When User click on year built field on add property page
    Then User able to view year built dropdown options on add property page
    And User able to select option "2023" in Year Built field on add property page
    When User click on owner entity field on add property page
    Then User able to view owner entity dropdown existing owner list on add property page
    And User able to select option "Agile Real Estate Group" in owner entity field on add property page
    When User click on continue button on add property page
    Then User able to view agree to terms popup on add property page
    When User scroll till the bottom of the Agreement description on agree to terms popup on add property page
    Then User should be able to view Enter Your Initials field Active on agree to terms popup on add property page
    When User enter "MT" Input in enter your initials field on agree to terms popup on add property page
    And User click on Agree and Continue button on agree to terms popup on add property page
    Then User should be able to navigate to Upload Property Documents page

  @TC_M9_049
  Scenario: Verify the UI of Upload Property Documents Page
    And User should able to view breadcrumbs "Upload Property Documents" on upload property document page
    And User should able to view four section on left side "General Info" "Owner Auth" "Purch. & Offer" "Financials" upload property document page
    And User should able to view Placeholder Text "Upload Property Documents" upload property document page
    And User should able to view Property name on upload property document page
    And User should able to view address, Apt, Suite ,city, State, zipcode on upload property document page
    And User should able to view property class on upload property document page
    And User should able to view year built on upload property document page
    And User should able to view # of Doors on upload property document page
    And User should able to view Owner Entity on upload property document page
    And User should able to view State of Entity on upload property document page
    And User should able to view EIN on upload property document page
    And Verify user should be able to view unique Ticker symbol at Upload property document page assigned by Henry team.
    And User should able to view four section in the pie chart Needed, In review, Approved, Attention Required on upload property document page
    And User should able to view save and exit button on upload property document page
    And User should able to view need Help? contact us link on upload property document page
    And User should able to view Last update contact us link on upload property document page

  @TC_M9_051 @TC_M9_063
  Scenario: Verify the Document acceptance format for all section
    When User able to upload document file "SampleExcel.xlsx" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    When User able to upload document file "SamplePNGImage.png" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    When User able to upload document file "JPGImage.jpeg" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    When User able to upload document file "SamplePDFFile_5mb.pdf" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    When User able to upload document file "document.docx" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    #TC_M9_063
    And Verify browse option should be removed for that section on upload property document page

  @TC_M9_050
  Scenario: Verify the functionality of clickable field or link to navigate
    And User able to view screen focus on General info section on upload property document page
    When User click on owner auth section on upload property document page
    Then User able to view screen focus on owner auth section on upload property document page
    When User click on offer section on on upload property document page
    Then User able to view screen focus on offer section on upload property document page
    When User click on financials section on upload property document page
    Then User able to view screen focus on financials section on upload property document page

  @TC_M9_062
  Scenario: Verify the Drop-down icon functionality over every section
    When User click on dropdown icon on upload document section on upload property document page
    Then Verify user able to Expand or collapse the section by clicking on Dropdown icon

  @TC_M9_064
  Scenario: Verify the functionality of edit/update when document is In - review status
    Then User able to upload document file "sample_5MB_JPG.jpg" on upload property document page
    And Verify file should upload successfully on upload property document page
    And Verify user able to view upload document with in review status on upload property document page

  @TC_M9_068
  Scenario: Verify the functionality when user hover mouse over info icon in each section
    When User click on info icon on upload property document page
    Then User should be able to view tooltip when clicking on info icon on upload property document page

  @TC_M9_075 @TC_M9_076
  Scenario: Verify that User able to view Sort option at right of Owner Authority section
    When User click on sorting option on upload property document page
    Then User should able to view Sort option with All option on upload property document page
    #TC_M9_076
    And Verify user able to view List of sorting option on upload property document page

  @TC_M9_077
  Scenario: Verify the functionality of sorting options
    When User able to upload document file "SamplePNGImage.png" on upload property document page
    Then User able to view All Listing of upload property documents section on upload property document page
    When User click on sorting option on upload property document page
    And User click on To Do sorting option on upload property document page
    Then Verify TO Do option should selected on upload property document page
    And  Verify user able to view Pending Listing of upload property documents section on upload property document page
    When User click on sorting option on upload property document page
    And User click on In Review sorting option on upload property document page
    Then Verify In Review option should selected on upload property document page
    And Verify user able to view in review Listing of upload property documents section on upload property document page
    When User click on sorting option on upload property document page
    And User click on Approved sorting option on upload property document page
    Then Verify approved option should selected on upload property document page
    And Verify user able to view in approved listing of upload property documents section on upload property document page
    When User click on sorting option on upload property document page
    And User click on Attention Required sorting option on upload property document page
    Then Verify attention required option should selected on upload property document page
    And Verify user able to view in attention required of upload property documents section on upload property document page

  @TC_M9_078
  Scenario: Verify the functionality of Unanimous Consent from the Control Party over Owner Authority Section
    When user scroll the page on upload property document page
    Then Verify user able to view Unanimous Consent section on upload property document page
    And Verify user should be able to view an Message for this document on upload property document page

  @TC_M9_072
  Scenario: Verify the toast message when user try to upload Document of greater than 10MB
    When User should able to upload document file "SamplePNGImage_10mb.PNG.png" on upload property document page
    Then Verify user should be able to view toast message on upload property document page

  @TC_M9_073
  Scenario: Verify that user able to view uploaded picture of property
    When User able to upload document file "SamplePNGImage.png" on upload property document page
    Then Verify user able to view Picture uploaded by user with X icon on upload property document page

  @TC_M9_074
  Scenario: Verify that user able to edit uploaded Picture when Picture Of The Property section status is In-Review or Attention Required
    When User able to upload document file "SamplePNGImage.png" on upload property document page
    And User click on close icon over already uploaded Picture on upload property document page
    Then User should be able to delete Picture from the already uploaded Pictures on upload property document page

  @TC_M9_067
  Scenario: Verify the functionality of drop-down icon over all section
    When User click on dropdown icon on upload document section on upload property document page
    Then Verify Collapsed view on upload document section on upload property document page
    When User click on dropdown icon on upload document section on upload property document page
    Then Verify Expanded view on upload document section on upload property document page

  @TC_M9_069
  Scenario: Verify the functionality when user hover mouse over info icon at Property images section
    When User will scroll the page on upload property document page
    And User click on info icon of picture property on upload property document page
    Then Verify user able to view tooltip over info icon at property images section on upload property document page

  @TC_M9_070
  Scenario: Verify the maximum limit of images upload in Picture Of The Property section
    When User will scroll the page on upload property document page
    And User able to upload maximum 25 images in picture of property section on upload property document page
    Then Verify browse option should be removed for that section on upload property document page

  @TC_M9_079
  Scenario: Verify the functionality when user first time navigate to Upload Property document page
    When User click on dropdown icon on upload document section on upload property document page
    Then Verify Collapsed view on upload document section on upload property document page
    When User click on dropdown icon on upload document section on upload property document page
    Then Verify Expanded view on upload document section on upload property document page
    And User able to upload document file "SamplePDFFile_5mb.pdf" on upload property document page

  @TC_M9_084
  Scenario: Verify the functionality of scrollbar over Upload property document page
    And User able to view screen focus on General info section on upload property document page
    When User click on owner auth section on upload property document page
    Then User able to view screen focus on owner auth section on upload property document page
    When User click on offer section on on upload property document page
    Then User able to view screen focus on offer section on upload property document page
    When User click on financials section on upload property document page
    Then User able to view screen focus on financials section on upload property document page

  @TC_M9_071
  Scenario: Verify the maximum size of Document allowed to upload
    When User able to upload document file "10MBImage.png" on upload property document page
    Then User should not be able to view image format error message on upload property document page
    When User able to upload document file "SamplePDFFile_5mb.pdf" on upload property document page
    Then User should not be able to view image format error message on upload property document page
