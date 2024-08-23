@MarketPlace
Feature: Market Page feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - abhishek.kumar1+10@appinventiv.com
    And User enters a password on login page in input field - Qwerty@123
    And User clicks on enter button on login page
    Then User is on market page

  @TC_M2_009
  Scenario: Verify user navigation, when user logged in with valid credential
    And Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on market page
    Then Verify user should be able to view two options in popup
    When User clicks on account on market page
    Then Verify User is on account page
    When User clicks on logout button on account page
    Then Verify user should be able to navigate to home page

  @TC_M2_016
  Scenario: Verify the functionality of "Sort by " Filter on market page
    When User clicks on newest filter on market page
    Then Verify user should be able to view 3 options

  @TC_M2_018
  Scenario: Verify the functionality of featured filter on market page
    When User clicks on newest filter on market page
    And User clicks on featured filter on market page
    Then Verify user should be able to view List of property name on market page

  @TC_M2_017
  Scenario: Verify the functionality of newest filter on market page
    When User clicks on newest filter on market page
    And Again click on newest option of newest dropdown on market page
    Then Verify user should be able to view List of property name on market page

  @TC_M2_019
  Scenario: Verify the functionality of most popular filter on market page
    When User clicks on newest filter on market page
    And User clicks on most popular on market page
    Then Verify user should be able to view List of property name on market page

  @TC_M2_020
  Scenario: Verify the functionality of "Owner" filter on market page
    When User clicks on owner filter on market page
    Then Verify that user should be able to view dropdown list of owner

  @TC_M2_021
  Scenario: Verify that list should be refresh according to selected owner on market page
    When User clicks on owner filter on market page
    And User check the checkbox of owner option on market page
    Then Verify that list should be refresh according to selected owner on market page

  @TC_M2_023
  Scenario: Verify the functionality of  reset filter button on market page
    When User clicks on owner filter on market page
    And User check the checkbox of owner option on market page
    Then Verify user should be able to click on reset filter of owner option on market page

  @TC_M2_015
  Scenario: Verify the Functionality of Search field, user should be able to find owner, address, location  at top of list which have same name entered by user
    When User clicks on typing cursor over search field on market page
    And User enter owner name on search bar on market page - Think multi
    Then Verify that user should be able to view data at top of list which have same data entered by user in market page search field
    When User click on cross icon on search bar on market page
    And User enters address name on search bar on market page - Smithfield St,
    Then Verify that user should be able to view data at top of list which have same data entered by user in market page search field
    When User click on cross icon on search bar on market page
    And User enter property name on search bar on market page - Think
    Then Verify that user should be able to view data at top of list which have same data entered by user in market page search field
    When User click on cross icon on search bar on market page
    And Enter random word which didn't matched Owner name, Property name, Address of Property on market search field -  testtest
    Then Verify the functionality when we enter random word in property page search field

  @TC_M2_010
  Scenario: Verify UI when user logged in on market page
    When User navigate to market page
    Then Verify user should be able to view asset listing data like location, asset class, units ,shares on market page
    And Verify user should be able to view target returns data like IRR , AAR , Equity Multiple on market page
    And Verify that user should be able to view asset listing, terms data like purchase date, dividends, Depreciation on market page
    And Verify user should be able to view portfolio on market page
    And Verify user should be able to view owner on market page
    And Verify user should be able to view account setup on market page
    And Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links

  @TC_M2_012
  Scenario: Verify that user able to view Owner name when owner are Multiple on market page
    When User clicks on other owner option on market page
    Then Verify user should be able to view owner name on property detail page






















