@Property
Feature: Property detail feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    Then User is on market page

  @TC_M3_001
  Scenario: Verify that user navigate to Property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    Then User is on property detail page

  @TC_M3_002
  Scenario: Verify the UI of detail page on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    Then Verify user should be able to view property data like location , class , units, shares on property detail page
    And Verify user should be able to view target returns data of property on property detail page
    And Verify user should be able to view terms data of property on property detail page
    When User clicks on other owner of owners section on property detail page
    Then Verify user should be able to view owner name on property detail page
    And Verify cross button functionality of owner popup on property detail page
    And Verify user should be able to view the breadcrumb Market/Property Details
    And Verify user should be able to view financial details on property detail page
    And Verify user should be able to view count of owner on property detail page
    And Verify user should be able to view asset name on property detail page
    And Verify user should be able to view AUM and properties count on property detail page
    When User clicks on view map on property detail page
    Then Verify user should be able to view map which opens up a new browser window on property detail page

  @TC_M3_016
  Scenario: Verify the functionality of follow button over Owners section property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on follow button over Owners section on property detail page
    Then Verify user should be able to view Follow button changed to Following button on property detail page

  @TC_M3_006
  Scenario: Verify the functionality of navigation when user click on any tab or clickable link
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on view all button on property detail page
    Then Verify user should be able to view multiple owner of property on property detail page
    And Verify functionality of cross button on property detail page
    And Verify user should be able to view section in middle of user screen on property detail page

  @TC_M3_017
  Scenario: Verify the functionality of image viewer on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on view gallery on property detail page
    Then Verify user should be able to navigate to image viewer page
    And Verify user should be able to view previous image on image viewer page
    And Verify user should be able to view next image on image viewer page
    And Verify user should be able to view select image on image viewer page

  @TC_M3_008
  Scenario: Verify the functionality of read more and read less over property description
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on read more button on property detail page
    Then Verify the functionality of read more over property description on property detail page
    When User clicks on read less button on property detail page
    Then Verify the functionality of read less over property description on property detail page

  @TC_M3_018
  Scenario: Verify that user should be able to view similar property like property name, location, class, units, shares, owner on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User scroll the screen and go to the similar property on property detail page
    Then Verify user should be able to view similar property like property name, location, class, units on property detail page
    And Verify user should be able to view similar property like shares, owner on property detail page

  @TC_M3_011
  Scenario: Verify that level 2 user(Share holder) able to view documents to download on property detail page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    Then Verify that user able to view documents to download without lock icon on property detail page

