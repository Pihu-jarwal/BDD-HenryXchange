@homepage

Feature: Homepage

  @TC_M2_001 @TC_M2_002
  Scenario: Verify user should able to navigate home page
    Given User navigate to "https://qaapp.firemountains.co/"
    When User is on homepage
    Then User able to view Henry logo on home page
    And User able to view Market selected by default on home page
    When User able to view tab list button on home page
    Then User able to view MARKET as "MARKET" tab on homepage
    And User able to view HOW IT WORKS as "HOW IT WORKS" on homepage
    And User able to view INVESTORS as "INVESTORS" on homepage
    And User able to view SYNDICATORS as "SYNDICATORS" on homepage
    And User able to view ABOUT as "ABOUT" on homepage
    And User able to view login button on home page
    And User able to view signup button on home page
    And User able to view placeholder text on home page
    And User able to view picture of asset on home page
    And User able to view asset name on home page
    And User able to view asset class on home page
    And User able to view asset owner on home page
    And User able to view asset location on home page
    And User able to view number of unit on home page
    And User able to view share price on home page
    And User able to view IRR in card on home page
    And User able to view AAR in card on home page
    And User able to view Equity Multiplier in card on home page
    And User able to view purchase date in card on home page
    And User able to view dividends in card on home page
    And User able to view depreciation in card on home page
    Then User able to scroll down the page and view the footer
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


  @TC_M2_004
  Scenario: Verify that user able to view Asset listing on homepage
    Then Verify user is on home page and view asset listing

  @TC_M2_003
  Scenario: Verify the functionality of navigation when user click on any tab or clickable link on homepage
    When User is on home page and click on login button and navigate to login page
    Then User navigate back to home page
    When User clicks on sign up button on home page
    Then User navigate back to home page
    When User clicks on buy button on homepage
    Then User is on sign up page and verify get started text on signup page
    And User navigate back to home page
    When User is on home page and click on 2 others link
    Then User is on sign up page and verify get started text on signup page

  @TC_M2_008
  Scenario: Check for footer after whole list is scrolled on homepage
    Then User able to scroll down the page and view the footer
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



