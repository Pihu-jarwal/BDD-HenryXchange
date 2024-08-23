@UploadPropertyDocument
Feature: Upload Document feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User click on owner tab on market page

  @TC_M9_081
  Scenario: Verify the functionality when user click on "View Issue" link over error Message for Attention Required
    And User click on resolve button in pending listing on upload property document page
    And User click on view issue link on upload property document page
    Then User able to view Sorted list of Document which have Attention required Status on upload property document page


