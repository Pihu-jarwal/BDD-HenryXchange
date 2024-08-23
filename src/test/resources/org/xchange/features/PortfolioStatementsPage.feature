@Portfolio
Feature: Portfolio statement page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User is on market page
    And User clicks on portfolio tab on market page
    And User clicks on statements button on portfolio page
    Then User is on statement page

  @TC_M4_043
  Scenario: Verify the UI of Statement page
    And Verify breadcrumbs on statement page
    And Verify list on statement page
    And Verify filter text on statement page

  @TC_M4_047
  Scenario: Verify the functionality of date filter on statement page
    When User clicks on date label on statement page
    Then User should able to view drop down with following options on statement page
    When User clicks on oldest to newest one filter on statement page
    Then Verify oldest to newest filter is selected on statement page
    And Verify user should be able to view list on statement page

  @TC_M4_048
  Scenario: Verify the functionality of All type filter on statement page
    When User clicks on default filter of all type on statement page
    Then User should able to view drop down with following options on statement page
    When User clicks on purchase on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on account on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on sell on statement page
    Then Verify user should be able to view list on statement page

  @TC_M4_053
  Scenario: Verify the functionality of Custom date on statement page
    When User clicks on this month filter on statement page
    And User clicks on custom filter of this month on statement page
    And User clicks on select date filter on statement page
    And User select start Date must be Today or earlier, all future dates are grayed out on statement page
    Then Verify end date calendar should automatically appear after selection of Start date on statement page

  @TC_M4_049
  Scenario: Verify the functionality of "This Month" filter on statement page
    Then Verify this Month is set by-default on statement page
    And Verify user should be able to view list on statement page
    When User clicks on this month filter on statement page
    Then User should be able to view drop down with following options
    When User clicks on last month on statement page
    And Verify last month filter is selected on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on this year on statement page
    And Verify this year filter is selected on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on custom filter of this month on statement page
    And Verify custom filter is selected on statement page
    And User clicks on select date filter on statement page
    And User select start data from date filter on statement page
    And User select end data from date filter on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last year on statement page
    And Verify last year filter is selected on statement page
    Then Verify user should be able to view list on statement page

  @TC_M4_056  @TC_M4_066  @TC_M4_062 @TC_M4_070
  Scenario: Verify the functionality of View button on statement page
    When User clicks on all type filter on statement page
    And User clicks on purchase on statement page
    Then Verify purchase filter is selected on statement page
    When User clicks on View button on statement page
    Then User should be redirected to the corresponding Statement detail PDF viewer
    #TC_M4_066
    And Verify that user able to close the pop-up of pdf on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on sell on statement page
    Then Verify sell filter is selected on statement page
    When User clicks on View button on statement page
    Then User should be redirected to the corresponding Statement detail PDF viewer
    #TC_M4_070
    And Verify that user able to close the pop-up of pdf on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on account on statement page
    Then Verify account filter is selected on statement page
    When User clicks on View button on statement page
    Then User should be redirected to the corresponding Statement detail PDF viewer
    #TC_M4_062
    And Verify that user able to close the pop-up of pdf on statement page

  @TC_M4_061
  Scenario: Verify the functionality of Download button for account statement on pdf viewer on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on account on statement page
    Then Verify account filter is selected on statement page
    When User clicks on View button on statement page
    And User clicks on download button on pdf viewer on statement page
    Then Verify user should be able to Download the Statement in pdf format on statement page

  @TC_M4_069
  Scenario: Verify the functionality of Download button for sell statement on pdf viewer on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on sell on statement page
    Then Verify sell filter is selected on statement page
    When User clicks on View button on statement page
    And User clicks on download button on pdf viewer on statement page
    Then Verify user should be able to Download the Statement in pdf format on statement page

  @TC_M4_065
  Scenario: Verify the functionality of Download button for purchase statement on pdf viewer on statement page
    When User clicks on default filter of all type on statement page
    And User clicks on purchase on statement page
    Then Verify purchase filter is selected on statement page
    When User clicks on View button on statement page
    And User clicks on download button on pdf viewer on statement page
    Then Verify user should be able to Download the Statement in pdf format on statement page


  @TC_M4_050
  Scenario: Verify the functionality When user have Purchase type and Month filter on statement page
    When User clicks on all type filter on statement page
    And User clicks on purchase on statement page
    Then Verify purchase filter is selected on statement page
    And Verify this Month is set by-default on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last month on statement page
    Then Verify last month filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on this year on statement page
    Then Verify this year filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on custom filter of this month on statement page
    Then Verify custom filter is selected on statement page
    When User clicks on select date filter on statement page
    And User select start data from date filter on statement page
    And User select end data from date filter on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last year on statement page
    Then Verify last year filter is selected on statement page
    And Verify user should be able to view list on statement page

  @TC_M4_051
  Scenario: Verify the functionality When user have Sell type and Month filter on statement page
    When User clicks on all type filter on statement page
    And User clicks on sell on statement page
    Then Verify sell filter is selected on statement page
    And Verify this Month is set by-default on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last month on statement page
    Then Verify last month filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on this year on statement page
    Then Verify this year filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on custom filter of this month on statement page
    Then Verify custom filter is selected on statement page
    When User clicks on select date filter on statement page
    And User select start data from date filter on statement page
    And User select end data from date filter on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last year on statement page
    Then Verify last year filter is selected on statement page
    And Verify user should be able to view list on statement page

  @TC_M4_052
  Scenario: Verify the functionality When user have Account type and Month filter on statement page
    When User clicks on all type filter on statement page
    And User clicks on account on statement page
    Then Verify account filter is selected on statement page
    And Verify this Month is set by-default on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last month on statement page
    Then Verify last month filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on this year on statement page
    Then Verify this year filter is selected on statement page
    And Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on custom filter of this month on statement page
    Then Verify custom filter is selected on statement page
    When User clicks on select date filter on statement page
    And User select start data from date filter on statement page
    And User select end data from date filter on statement page
    Then Verify user should be able to view list on statement page
    When User clicks on default filter of this month on statement page
    And User clicks on last year on statement page
    Then Verify last year filter is selected on statement page
    And Verify user should be able to view list on statement page

  @TC_M4_057
  Scenario: Verify the functionality of Download button on statement page
    When User clicks on Download button over any statement
    Then User should be able to download Statement for which the user tries to download the statement

  @TC_M4_055
  Scenario: Verify the functionality of Export button on statement page
    When User clicks on export button on statement page
    Then User should be able to download All Statements corresponding to filters

  @TC_M4_054
  Scenario: Verify the functionality when user apply custom filter which have no data on statement page
    When User clicks on this month filter on statement page
    And User clicks on custom filter of this month on statement page
    And User clicks on select date filter on statement page
    And User select start date in which no data found on statement page
    And User select end date in which no data found on statement page
    Then Verify user should be able to view blank list with text says "No Data Available"

