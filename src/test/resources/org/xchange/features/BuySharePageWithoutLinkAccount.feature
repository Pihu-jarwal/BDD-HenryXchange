@BuyShare
Feature: Buy share feature without link account

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+18@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User is on market page

  @TC_M6_020 @TC_M6_021 @TC_M6_023
  Scenario: Verify the UI of Fund Your Purchase Page
    And User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify user should be able to navigate to Buy Shares Page
    When User enters shares "1" in input field on buy share page
    And User clicks on buy shares button on  buy share page
    Then Verify user will be redirected to the “Fund Your Purchase” page
    And Verify breadcrumbs on fund your purchase page
    And Verify Total Investment Value : (# of Shares) * (Avg. per Share) on fund your purchase page
    And Verify when there is no Linked account to purchase the Shares on fund your purchase page
    And Verify user should be able to view total amount, henry account balance and funds needed on fund your page
    And Verify user should be able to view cancel and link account button on fund your purchase page
    And Verify user should be able to view footer headings like resource , about on all the pages
    And Verify user should be able to view footer hyperlinks like About, Resource, Support, About us, Contact us, Careers on all the pages
    And Verify user should be able to view the social platform hyper links and bottom section hyper links
    #TC_M6_023
    And User should have to link account in case of insufficient fund in Henry wallet warning msg should prompt on fund your purchase page
    #TC_M6_021
    And Verify breadcrumb user clicks on market then the user should redirect to the market page
    When User enter property name on search bar on market page - Oakwood Sarasota
    And User clicks on asset name as "Oakwood" on market page
    And User clicks on Buy button in Right side section just below the Market Estimate on property detail page
    Then Verify breadcrumb user clicks on the Property details then user should redirect to the property details page