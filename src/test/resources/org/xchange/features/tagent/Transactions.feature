@owner:rahulrana
@parentSuite:HenryXchange
@suite:TransferAgent
@subSuite:Transactions
@Transactions
Feature: Transfer agent transactions

  Background:
    Given User navigate to "https://qaapp.drylakes.co/"
    When  User enter email "atul.katare+250@appinventiv.com" in input field on login page
    Then  User enter password "@Abcde12345678" in input field on login page
    And   User click on enter button on login page
    Then  User enter otp "123456" in input field on OTP page
    And   User click on confirm code button on OTP verify page

  @Smoke @Regress @TC_M11.2_001 @TC_M11.2_002
  Scenario: Verify that Admin/Agent able to navigate to Transaction page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify user should navigate to the Transactions page.

  @Smoke @Regress @TC_M11.2_003 @TC_M11.2_025
  Scenario: Verify the UI of Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify user should see the following objects on the Transactions page.

  @Regress @TC_M11.2_004 @TC_M11.2_005
  Scenario: Verify the functionality of Date column displayed in Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that all the transactions dates will be displayed in the date column are in the format "MMM dd, yyyy"
    And  Verify that by default the transactions are ordered by the descending dates

  @Regress @TC_M11.2_006 @TC_M11.2_008 @TC_M11.2_009
  Scenario: Verify the functionality of Date header drop-down options.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify the date header drop-down options on the transactions page
    And  Verify if the user selects the option as ascending in the date dropdown
    And  Verify if the user selects the option as descending in the date dropdown

  @Regress @TC_M11.2_010
  Scenario: Verify the functionality of Transactions ID displayed on the Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify if the user is able to see alphanumeric transaction ID.

  @Regress @TC_M11.2_012
  Scenario: Verify the State option displayed on the Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that the valid state abbreviation displayed in the state column.

  @Regress @TC_M11.2_013
  Scenario: Verify that the valid seller should displayed in the seller column.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that the valid seller should displayed in the seller column.

  @Regress @TC_M11.2_015 @TC_M11.2_016 @TC_M11.2_017 @TC_M11.2_018
  Scenario Outline: Verify the functionality if there are more than one Seller for the property.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that if there are multiple sellers for a property with "<propertyName>" on the Transactions page.

    Examples:
      | propertyName |
      | Burj Khalifa |

  @Regress @TC_M11.2_020 @TC_M11.2_022
  Scenario: Verify that the valid buyer should displayed in the buyer column.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that the valid buyer should displayed in the buyer column.

  @Regress @TC_M11.2_023
  Scenario: Verify the Time displayed on the Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that the time is displaying in the format as "HH:mm:ss a" on the transaction page.

  @Regress @TC_M11.2_024
  Scenario: Verify the amount displayed on the Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify that the amount should displayed in the amount column.

  @Regress @TC_M11.2_026
  Scenario: Verify the filter drop-down options on the Transactions page.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  Verify the filter drop-down options on the transactions page.

  @Regress @TC_M11.2_032
  Scenario: Verify the UI when clicked on custom filter option displayed when clicked on time filter option.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    Then User click on the transaction by time drop-down.
    And  User selects the custom option in the transaction by time drop-down.
    And  Verify the custom time filter options on the transactions page.

  @Regress @TC_M11.2_033 @TC_M11.2_034
  Scenario: Verify the calendar displayed when clicked on Select Date (From) during Custom filter.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    Then User click on the transaction by time drop-down.
    And  User selects the custom option in the transaction by time drop-down.
    Then User click on the select date From picker.
    And  Verify that user is able select date from while custom option is selected.
    Then User click on the select date To picker.
    And  Verify that user is able select date to while custom option is selected.
    And  Verify that the app is filtering transactions between the custom date selections.

  @Regress @TC_M11.2_038
  Scenario: Verify that user should be able to type User Name in the search bar successfully.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  User click on the transaction by time drop-down.
    And  User selects the All Time option in the transaction by time drop-down.
    Then User search with the username as "Abhishek Kumar" on the transaction page.
    And  Verify that the transactions got filtered on the basis of username searched.

  @Regress @TC_M11.2_039
  Scenario: Verify that user should be able to search transaction ID successfully.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  User click on the transaction by time drop-down.
    And  User selects the All Time option in the transaction by time drop-down.
    Then User search with the Transaction Id on the transaction page.
    And  Verify that the transactions got filtered on the basis of Transaction Id searched.

  @Regress @TC_M11.2_040
  Scenario: Verify that user should be able to search seller ID successfully.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  User click on the transaction by time drop-down.
    And  User selects the All Time option in the transaction by time drop-down.
    Then User search with the Seller Id Id on the transaction page.
    And  Verify that the transactions got filtered on the basis of Seller Id searched.

  @Regress @TC_M11.2_041
  Scenario: Verify that user should be able to search buyer ID successfully.
    When User lands on the dashboard page on which properties tab is selected by default
    Then Verify user is able to see the transactions tab.
    And  User click on the transaction tab.
    And  User click on the transaction by time drop-down.
    And  User selects the All Time option in the transaction by time drop-down.
    Then User search with the Buyer Id on the transaction page.
    And  Verify that the transactions got filtered on the basis of Buyer Id searched.