@yourSellOrderPage

Feature: Portfolio - Sell Order Page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User is on login page
    And User enters a email on login page in input field - anuj.kumar8+8@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    When User must have more than 10 Sell order on portfolio page
    And User clicks on view all button of sell order on portfolio page

  @TC_M4_033
  Scenario: Verify the UI of Your Sell Orders Page
    Then User navigate on sell order page
    And User verify the breadcrumbs on sell order page
    And User verify the your sell orders text on sell order page
    And User verify the list name, shares, share price, gross total, platform fee, net total on sell order page
    Then User should able to view resources as "Resources" and about as "About" headings on footer
    And User should able to view resources subheadings "How It Works" "Resources" "Support"  on footer
    And User should able to view about subheadings "About Us" "Contact Us" "Careers"  on footer
    And User should able to view social platform like "LinkedIn" "Twitter" "Facebook" on footer
    And User should able to view full disclosure as "Full Disclosure" on footer
    And User should able to view henry overview on footer
    And User should able to view privacy policy as "Privacy Policy" on footer
    And User should able to view data security  as "Data Security" on footer
    And User should able to view terms of use  as "Terms of Use" on footer
    And User should able to view website data collection process as "Website Data Collection Process" on footer

  @TC_M4_035
  Scenario: Verify that user able to view Shares count when no shares are sold
    Then User navigate on sell order page
    And User able to view shares count when no shares are sold on sell order page

  @TC_M4_036
  Scenario: Verify that user able to view Shares count when few shares are sold
    Then User navigate on sell order page
    And User verify the few shares are sold on sell order page

  @TC_M4_038@TC_M4_039
  Scenario: Verify the functionality of sorting over name column
    Then User navigate on sell order page
    And User verify the name filter on sell order page
    When User click on name filter on sell order page
    Then User verify the name filter dropdown option on sell order page
    And User verify the default selected newest to oldest option on name filter dropdown in sell order page
    #TC_M4_039
    When User click on A-Z option on name filter dropdown in sell order page
    Then User verify the sorting list according to A-Z option on sell order page
    When User click on name filter on sell order page
    And User click on Z-A option on name filter dropdown in sell order page
    Then User verify the sorting list according to Z-A option on sell order page

  @TC_M4_042@TC_M4_043
  Scenario: Verify that user able to view Sell Order Summary pop-up when click on any sell order on Portfolio or sell order pagee
    Then User navigate on sell order page
    When User click on name filter on sell order page
    And User click on any sell order on sell order page
    Then  Verify user able to view the your sell orders popup on sell order page
    And User able to view placeholder text on your sell orders popup on sell order page
    And User able to view Asset name on your sell orders popup on sell order page
    And User able to view original order details on your sell orders popup on sell order page
    And User able to view Transactions details on your sell orders popup on sell order page
    And User able to view Balance details on your sell orders popup on sell order page
    And User able to view cross icon on your sell orders popup on sell order page
    #TC_M4_043
    When User click on cross icon on your sell orders popup on sell order page
    Then Verify that user able to close the Your Sell Orders Summary pop-up on sell order page
    When User click on any sell order on sell order page
    Then User able to click on outside the your sell orders popup on sell order page

