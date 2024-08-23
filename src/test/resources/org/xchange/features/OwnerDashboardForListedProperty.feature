Feature: Owner dashboard for listed property

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    And User clicks on enter button on login page
    And User click on Owner tab on market page

  @TC_M7_116
  Scenario: Verify the functionality of count of Listed Properties when there are properties in Owner Dashboard
    Then Verify count listed properties should equal to number of properties in Listed Properties list on owner dashboard page

  @TC_M7_118 @TC_M7_119 @TC_M7_120 @TC_M7_121 @TC_M7_122
  Scenario: Verify the functionality of Sort by option displayed in Owner Dashboard
    And User click on sort by filter on owner dashboard page
    Then Verify drop down should opened on clicking on Sort by option on owner dashboard page
      #TC_M7_119
    And Verify user able to view UI details when clicked on Sort by on owner dashboard page
    #TC_M7_120
    And Verify user able to select any of option from drop down on owner dashboard page
    #TC_M7_121
    And Verify option selected will be displayed instead of Sort by on owner dashboard page
    And Verify option to be included below Listed Properties with cross icon on owner dashboard page
    #TC_M7_122
    When User click on cross icon on selected filters chip on owner dashboard page
    Then Verify option selected should removed on selected filters chip on owner dashboard page

  @TC_M7_124 @TC_M7_125
  Scenario: Verify the UI of search bar displayed in the Owner Dashboard
    Then Verify user should be able to view UI of search bar on owner dashboard page
    #TC_M7_125
    When User enter "MT" characters in search bar on owner dashboard page
    Then Verify no value of search result should displayed when less than 3 characters is searched on owner dashboard

  @TC_M7_126
  Scenario: Verify the search results when search input (valid value) is 3 or more than 3 characters in the Owner Dashboard.
    And User enter "Alston Arms" characters in search bar on owner dashboard page
    Then Verify result as per the typed value should be displayed in search drop down on owner dashboard page

  @TC_M7_127 @TC_M7_128
  Scenario: Verify the search results when search input (invalid value) is 3 or more than 3 characters in the Owner Dashboard
    And User enter "ttt" characters in search bar on owner dashboard page
    Then Verify search result not found should displayed when data searched is not in list on owner dashboard page
    #TC_M7_128
    When User click on close icon of search bar on owner dashboard page
    Then Verify searched input should be removed from search bar on owner dashboard page

  @TC_M7_130
  Scenario: Verify the UI of search results displayed in the drop down in the Owner Dashboard
    And User enter "The Winn @ 950" characters in search bar on owner dashboard page
    Then User able to view property name, address, show all results on search bar dropdown on owner dashboard page

  @TC_M7_131
  Scenario: Verify the highlighted search input displayed in the search result drop down in the Owner Dashboard
    And User enter "The Winn" characters in search bar on owner dashboard page
    Then Verify characters which user has typed, should highlighted in search dropdown on owner dashboard page

  @TC_M7_133
  Scenario: Verify the functionality when sorting is already applied and user search for specific property
    And User enter "The Winn @ 950" characters in search bar on owner dashboard page
    And User click on show all results below the search bar on owner dashboard page
    Then Verify property as per the search performed should filtered and displayed on owner dashboard page

  @TC_M7_135
  Scenario: Verify the UI of Listed Properties in the Owner Dashboard
    Then Verify user able to view listed property column heading on owner dashboard page

  @TC_M7_136 @TC_M7_137 @TC_M7_138 @TC_M7_139
  Scenario: Verify functionality of Sorting arrows displayed when clicked on Name column of Listed Properties in Owner Dashboard
    And User click on name filter on owner dashboard page
    Then Verify drop down should be displayed on clicking on sorting arrows on owner dashboard page
    #TC_M7_137
    And Verify name filter drop down, below options should be displayed on owner dashboard page
    #TC_M7_138
    And verify default Newest to Oldest should be selected on owner dashboard page
    #TC_M7_139
    When User click on a to z filter of sorting arrows on owner dashboard page
    Then Verify properties Should be sorted as per option selected from name sorting option on owner dashboard page

  @TC_M7_140 @TC_M7_141 @TC_M7_143
  Scenario: Verify the UI of Pending Properties in the Owner Dashboard
    Then Verify pending properties should include columns on owner dashboard page
      #TC_M7_141
    And Verify draft should displayed as default status of Pending Properties on owner dashboard page
    #TC_M7_143
    And Verify review should display when user has uploaded all documents on owner dashboard page

  @TC_M7_115
  Scenario: Verify the UI of Owner Dashboard has properties included
    Then Verify user able to view listed property column heading on owner dashboard page
    And Verify pending properties should include columns on owner dashboard page
    And Verify characters which user has typed, should highlighted in search dropdown on owner dashboard page

  @TC_M7_134
  Scenario: Verify the functionality when sorting is already applied and user search for specific property
    And User enter "The Winn @ 950" characters in search bar on owner dashboard page
    And User click on show all results below the search bar on owner dashboard page
    Then Verify list of Properties should sorted as per option selected on owner dashboard page

  @TC_M7_150
  Scenario: Verify the UI of documents in pending properties
    Then Verify "29" is number of required documents for pending properties on owner dashboard page

  @TC_M7_144
  Scenario: Verify functionality of Attention Required when there is a issue with documents uploaded in Pending Properties in Owner Dashboard
    Then Verify Attention Required should display when any uploaded document has been rejected by Henry Team on owner dashboard page

  @TC_M7_123
  Scenario: Verify the functionality of sorting as per the option selected
    And User click on sort by filter on owner dashboard page
    And Verify user able to select any of option from drop down on owner dashboard page
    Then Verify listed Properties should rearranged as per sorting option on owner dashboard page