@portfolioTransaction

Feature: Portfolio transaction page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User enters a email on login page in input field - anuj.kumar8+8@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page
    Then User is on portfolio page
    When User clicks on view all over transaction on portfolio page

  @TC_M4_026
  Scenario: Verify the UI of Transaction page
    And User is on transaction page
    And User able to see the breadcrumbs and verify the breadcrumbs on transaction page
    Then User able to view list of all Transaction which contain following details on transaction page
    When User click on default this month filter on transaction page
    Then User able to see the dropdown list on transaction page
    And User clicks on last month on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on this year on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on custom filter of this month on transaction page
    And User able to view start date and end date field on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on last year on transaction page
    Then Verify user should be able to view last year list on transaction page
    When User should able to view export button on transaction page
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

  @TC_M4_028
  Scenario: Verify the sorting of list over transaction page
    Then User is on transaction page
    When User click on date for sorting the list on transaction page
    Then User able to view the option in date sorting dropdown on transaction page
    And Verify list should be sorted on the basis of the latest action performed that is newest at the top to oldest on transaction page
#
  @TC_M4_029
  Scenario: Verify the functionality of filter on transaction page
    And User is on transaction page
    Then Verify this Month is set by-default on transaction page
    And Verify user should be able to view list on transaction page
    When User click on this month text filter on transaction page
    Then User able to see the dropdown list on transaction page
    When User clicks on last month on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on this year on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on custom filter of this month on transaction page
    Then User able to view start date and end date field on transaction page
    And User clicks on select date filter on transaction page
    And User select start data '2' from date filter on transaction page
    And User select end data '29' from date filter on transaction page
    Then Verify user should be able to view list on transaction page
    When User click on default this month filter on transaction page
    And User clicks on last year on transaction page
    Then Verify user should be able to view last year list on transaction page

  @TC_M4_030
  Scenario: Verify the functionality to select Start and End date on transaction page
    Then User is on transaction page
    When User click on this month text filter on transaction page
    Then User able to see the dropdown list on transaction page
    And User clicks on custom filter of this month on transaction page
    And User clicks on select date filter on transaction page
    And User select start Date must be Today or earlier, all future dates are grayed out on transaction page
    Then Verify end date calendar should automatically appear after selection of Start date on transaction page

  @TC_M4_031
  Scenario: Verify the functionality when user apply custom filter which have no data on transaction page
    Then User is on transaction page
    When User click on this month text filter on transaction page
    Then User able to see the dropdown list on transaction page
    And User clicks on custom filter of this month on transaction page
    And User clicks on select date filter on transaction page
    And User enter the start date '2' which have no data on transaction page
    And User enter the end date '25' which have no data on transaction page
    Then User see the text no data available on transaction page

  @TC_M4_032
  Scenario: Verify the functionality of Export button on transaction page
    Then User is on transaction page
    When Verify user able to clicks on export button on transaction page
    Then User should be able to download transactions on transaction page

