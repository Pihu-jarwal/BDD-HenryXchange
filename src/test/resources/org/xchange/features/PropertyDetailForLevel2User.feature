@PropertyDetail
Feature: Property detail feature for level 2 user

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+27@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then User is on market page

  @TC_M3_010
  Scenario: Verify that level 2 user able to view documents to download on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    Then Verify that user able to view documents to download on property detail page

  @TC_M3_004
  Scenario: Verify the functionality of lock icon over document for level 2 user
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on lock icon on property detail page
    Then Verify user should be able to view error message when user clicks on lock icon on property detail page

  @TC_M3_014
  Scenario: Verify the functionality of Download document which have download icon
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on download icon over document on property detail page
    Then Verify user is on sign the confidentiality agreement on property detail page
    And Verify the functionality of terms and condition checkbox on property detail page
    And Verify the functionality of proceed button on property detail page
    And Verify the functionality of decline button on property detail page