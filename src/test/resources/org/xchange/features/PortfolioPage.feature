@Portfolio
Feature: Portfolio page feature

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - abhishek.kumar1+10@appinventiv.com
    And User enters a password on login page in input field - Qwerty@123
    And User clicks on enter button on login page
    And User is on market page
    Then User clicks on portfolio tab on market page

  @TC_M4_001
  Scenario: Verify that user navigate to PORTFOLIO page
    And User is on portfolio page

  @TC_M4_007
  Scenario: Verify the Graph view just after first investment on portfolio page
    When User is on portfolio page
    Then Verify user should be able to view blank graph with text on portfolio page

  @TC_M4_009 @TC_M4_015
  Scenario: Verify the functionality of sort filter over Name column in investments table on portfolio page
    When User is on portfolio page
    Then Verify newest investment should always be in top of the list on portfolio page
    #TC_M4_015
    When User clicks on name filter on investment section on portfolio page
    Then Verify Newest to oldest filter set by-default on investment listing on portfolio page
    And User should able to view drop down with following sorting option on investment section on portfolio page
    When User clicks on A to Z filter of name filter on investment listing
    Then Verify A to Z filter of investing listing on portfolio page
    And Verify sort the list basis of alphabetic order on investment listing on portfolio page
    When User clicks on name filter on investment section on portfolio page
    And User clicks on Z to A filter of name filter on investment listing
    Then Verify Z to A filter of investing listing on portfolio page
    And Verify sort the list basis of alphabetic order on investment listing on portfolio page

  @TC_M4_016
  Scenario: Verify that user able to view "Sell order active" icon in Investment listing on Portfolio page
    When User clicks on active sell icon on in investment list on portfolio page
    Then User should be able to view "Sell order icon " in shares column on portfolio page

  @TC_M4_017
  Scenario: Verify the functionality when user buy shares in property and settlement is not done on portfolio page
    When User is on portfolio page
    Then User should able to view "Processing" tag over specific investment and "Sell" button is not active "Grayed out" in investing listing of portfolio page

  @TC_M4_022 @TC_M4_024 @TC_M4_023
  Scenario: Verify the functionality of "View All" button over Your Sell Orders listing on portfolio page
    When User must have more than 10 Sell order on portfolio page
    And User clicks on view all button of sell order on portfolio page
    Then Verify user should be able to redirect to "Your Sell order " page with all List of Sell order
    #TC_M4_023
    And Verify user should able to view list in order to latest action performed that is newest at the top to oldest on sell order page
    #TC_M4_024
    When User clicks on name filter on sell order page
    Then Verify Newest to oldest filter set by-default on sell order page
    When User clicks on A to Z filter of name filter on sell order page
    Then Verify A to Z filter on sell order page
    And Verify sort the list basis of alphabetic order on sell order page
    When User clicks on name filter on sell order page
    And User clicks on Z to A filter of name filter on sell order page
    Then Verify Z to A filter on sell order page
    And Verify sort the list basis of alphabetic order on sell order page

  @TC_M4_020 @TC_M4_021
  Scenario: Verify that user able to view Your Sell Orders Summary pop-up when click on any sell order on Portfolio or sell order page
    When User clicks on any sell order on portfolio page
    Then Verify user should be able to view Sell Order summary pop-up on portfolio page
    And Verify asset name on sell order popup view on portfolio page
    And Verify user should be able to view sell Order summary pop-up which contain following data like origin order, transaction, balance on sell order popup
    When User clicks on close btn of sell order popup view on portfolio page
    #TC_M4_021
    Then Verify that user able to close the Your Sell Orders Summary pop-up on portfolio page

  @TC_M4_025
  Scenario: Verify the functionality of "View All" Button over Transactions table on portfolio page
    When User must have more than ten transactions on portfolio page
    And User clicks on view all over transaction on portfolio page
    Then Verify user should able to navigate to Transactions page
    And Verify list should be sorted on the basis of the latest action performed that is newest at the top to oldest on transaction page

  @TC_M4_003
  Scenario: Verify the UI of PORTFOLIO page
    When User should be able to view account section value on portfolio page
    Then Verify user should be able to view Account value section on portfolio page
    And Verify User should be able to view transfer funds on statement page
    And Verify User should be able to view tax document on statement page
    When User scroll the page of market
    Then Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links

  @TC_M4_072
  Scenario: Verify user able to get tooltip when user hover truncated text on portfolio page
    When User does hover on tooltip of transaction fee on portfolio page
    Then Verify should be able to view Fee description as shown in design on portfolio page
    When User clicks on active sell icon on in investment list on portfolio page
    Then User should be able to view "Sell order icon " in shares column on portfolio page

