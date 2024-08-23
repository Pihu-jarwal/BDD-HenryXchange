@UserPage

Feature: User page feature

  Background:
    Given User navigate to "https://qaapp.drylakes.co/"

  @TC_M11.1_001
  Scenario: Verify that Admin/Agent able to navigate to Users page
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on User tab at side bar
    Then Verify user should be able to navigate to Users page

  @TC_M11.1_005
  Scenario: Verify the functionality of Name column
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on User tab at side bar
    Then Verify by default Sort Ascending (A-Z) is selected on user page
    When User click on name label on user page
    Then Verify user able to view name column options on user page

#  @TC_M11.1_006
#  Scenario: Verify the list when Admin/Agent select option. Sort Ascending (A-Z)  over Name field
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on name label on user page
#    And User click on sort ascending (A-Z) option over name label on user page
#    Then Verify user should be able to view list in A to Z alphabetical order on user detail page
#
#  @TC_M11.1_007
#  Scenario: Verify the list when Admin/Agent select Sort Descending  (Z-A) option  over Name field
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on name label on user page
#    And User click on sort descending (Z-A) option over name label on user page
#    Then Verify user should be able to view list in z to A alphabetical order on user detail page
#
#  @TC_M11.1_017
#  Scenario: Verify the sort options for User since column
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on user since label on user page
#    Then Verify user able to view name column options on user page
#
#  @TC_M11.1_018
#  Scenario: Verify that user able to view user since in Sort Ascending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on user since label on user page
#    And User click on sort ascending option over user since label on user page
#    Then Verify user should be able to view list ascending in a order on user page
#
#  @TC_M11.1_019
#  Scenario: Verify that user able to view user since in Sort Descending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on user since label on user page
#    And User click on sort Descending option over user since label on user page
#    Then Verify user should be able to view list in Descending order on user page
#
#  @TC_M11.1_008
#  Scenario: Verify the functionality of Email over user list
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view Email column with register email on user page
#
#  @TC_M11.1_009
#  Scenario: Verify the functionality of Mobile Number over user list
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view mobile number column with register email on user page
#
#  @TC_M11.1_010
#  Scenario: Verify the value of Mobile number when KYC Process is not done by user
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view "--" special character in mobile number field on user page
#
#  @TC_M11.1_014
#  Scenario: Verify that Admin/Agent able to view Entities value when no entities is linked
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view "--" special character in entities value on user page
#
#  @TC_M11.1_015
#  Scenario: Verify that Admin/Agent able to view User Id for all user in the list
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view Unique user ID on user page
#
#  @TC_M11.1_021
#  Scenario: Verify that user able to view Level sorting in Sort Ascending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on Levels dropdown on users page
#    Then Verify user should be able to view sorting option of Levels dropdown on users page
#
#  @TC_M11.1_022
#  Scenario: Verify that user able to view Level sorting in Sort Ascending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on Levels dropdown on users page
#    And User click on sort ascending option over Levels label on user page
#    Then Verify user should be able to view list ascending order according to level on user page
#
#  @TC_M11.1_023
#  Scenario: Verify that user able to view Level sorting in  Sort Descending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User click on Levels dropdown on users page
#    And User click on sort descending option over Levels label label on user page
#    Then Verify user should be able to view list descending order according to level on user page
#
#  @TC_M11.1_027
#  Scenario: Verify user able to view sort options over Last login Column
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on Last login dropdown on users page
#    Then Verify user should be able to view sorting option of Levels dropdown on users page
#
#  @TC_M11.1_028
#  Scenario: Verify that user able to view Last login in Sort Ascending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on Last login dropdown on users page
#    And User click on sort ascending option over Last login label on user page
#    Then Verify user able to view list in ascending order according to last login  on user page
#
#  @TC_M11.1_029
#  Scenario: Verify that user able to view Last login in Sort Descending order
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on Last login dropdown on users page
#    And User click on sort descending option over Last login label on user page
#    Then Verify user able to view list in descending order according to last login  on user page
#
#  @TC_M11.1_030
#  Scenario: Verify the functionality of search bar
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    Then Verify user should be able to view search field on user page
#
#  @TC_M11.1_031
#  Scenario: Verify the functionality when user able to view Matching result
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User enter "abcd" in search input field on user page
#    Then Verify user should be able to view placeholder text on user page
#
#  @TC_M11.1_034
#  Scenario: Verify that user able to navigate to User detail page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on user detail row on users page
#    Then Verify user should be able to navigate to User details page
#
#  @TC_M11.1_036 @TC_M11.1_037 @TC_M11.1_038 @TC_M11.1_040 @TC_M11.1_043 @TC_M11.1_045
#  Scenario: Verify the functionality of Name
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    Then Verify user able to view name of user on user detail page
#      #TC_M11.1_037
#    And Verify user able to view Registered Email of the User on user detail page
#      #TC_M11.1_038
#    And Verify user able to view Registered mobile number "--" of User on user detail page
#      #TC_M11.1_040
#    And Verify user able to view user's full SSN value "--" of User on user detail page
#    #TC_M11.1_043
#    And Verify user able to view user's full address "--" of User on user detail page
#    #TC_M11.1_045
#    And Verify user able to view User ID of User on user detail page
#
#  @TC_M11.1_035
#  Scenario: Verify the UI of User Detail page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on user detail row on users page
#    Then Verify user able to view breadcrumbs on user detail page
#    And Verify Segment tabs on user detail page on users page
#    And Verify user able to view user detail tab highlighted on user detail page
#    And Verify user able to view name of user on user detail page
#    And Verify user able to view Registered Email of the User on user detail page
#    And Verify user able to view Registered mobile number of User on user detail page
#    And Verify user able to view user's full SSN value of User on user detail page
#    And Verify user able to view User ID of User on user detail page
#
##  @TC_M11.1_047
#  Scenario: Verify the functionality of DOB
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on user detail row on users page
#    Then Verify user able to view DOB "--" of the user detail page
#
#  @TC_M11.1_050 @TC_M11.1_051
#  Scenario: Verify the functionality of Linked Externals Accounts
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on user detail row on users page
#    Then Verify user able to view Sub text "No external account has been linked yet!" on user detail page
#        #TC_M11.1_051
#    And Verify user able to view sub-text "No entities has been linked yet!" on user detail page
#
#  @TC_M11.1_052
#  Scenario: Verify that user able to view Investment page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And user click on user detail row on users page
#    And User click on investment section on user detail page
#    Then Verify user should be able to view Investment page
#
#  @TC_M11.1_060
#  Scenario: Verify that user able to view Sorting options
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on investment section on user detail page
#    And User click on name label on user detail page
#    Then Verify user able to view name column options on user detail page
#
#  @TC_M11.1_061
#  Scenario: Verify the sorting functionality of sort Ascending (A-Z)
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on investment section on user detail page
#    And User click on name label on user detail page
#    And User click on sort ascending A-Z option over user name label on user detail page
#    Then Verify user should be able to view list in A to Z alphabetical order on user detail page
#
#  @TC_M11.1_062
#  Scenario: Verify the sorting functionality of sort Ascending (Z-A)
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on investment section on user detail page
#    And User click on name label on user detail page
#    And User click on sort descending (Z-A) option over name label on user detail page
#    Then Verify user should be able to view list in z to A alphabetical order on user detail page
#
#  @TC_M11.1_065
#  Scenario: Verify that user able to view Transaction page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    Then Verify user should be able to view Transaction page
#
#  @TC_M11.1_067
#  Scenario: Verify that user able to view "Time Sorting " Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    Then Verify user able to view option of Time sorting option on transaction page
#
#  @TC_M11.1_068
#  Scenario: Verify the functionality of "All Time" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on All Time option over time sorting filter on transaction page
#    Then Verify user able to view All time transaction listing on transaction page
#
#  @TC_M11.1_069
#  Scenario: Verify the functionality of "This Month" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on This Month filter over time sorting filter on transaction page
#    Then Verify User should be able to view Current month transaction listing on transaction page
#
#  @TC_M11.1_071
#  Scenario: Verify the functionality of "This Year" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on This Year filter over time sorting filter on transaction page
#    Then Verify User should be able to view This year transaction listing on transaction page
#
#  @TC_M11.1_070
#  Scenario: Verify the functionality of "Last Month" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on Last Month filter over time sorting filter on transaction page
#    Then Verify User should be able to view Last Month transaction listing on transaction page
#
#  @TC_M11.1_072
#  Scenario: Verify the functionality of "Last Year" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on Last Year filter over time sorting filter on transaction page
#    Then Verify User should be able to view Last Year transaction listing on transaction page
#
#  @TC_M11.1_073
#  Scenario: Verify the functionality of "Custom" Option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on custom filter over time sorting filter on transaction page
#    And User click on select date over of custom filter on time sorting filter on transaction page
#    And User click on start date over of custom filter on time sorting filter on transaction page
#    And User click on End date over of custom filter on time sorting filter on transaction page
#    Then Verify User should be able to view custom date range transaction listing on transaction page
#
#  @TC_M11.1_074
#  Scenario: Verify that user able to select date range using Custom option
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on Time sorting filter on transaction page
#    And User click on custom filter over time sorting filter on transaction page
#    And User click on select date over of custom filter on time sorting filter on transaction page
#    Then Verify user should be able to view Date Picker on transaction page
#    When User click on start date over of custom filter on time sorting filter on transaction page
#    Then Verify user should be able to view selected date on transaction page
#    When User click on End date over of custom filter on time sorting filter on transaction page
#    Then Verify User should be able to view custom date range transaction listing on transaction page
#
#  @TC_M11.1_079
#  Scenario: Verify the functionality of Search bar with valid data
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User enter Transaction ID in search input field on transaction page
#    Then Verify user able to view matching result in transaction listing on transaction page
#
#  @TC_M11.1_080
#  Scenario: Verify the functionality of Search bar with Invalid data
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User enter wrong property name "Test property" in search input field on transaction page
#    Then Verify User able to view "No result found" in transaction listing on transaction page
#    When User enter wrong Transaction ID "e6c329c1-14aa9-44d5" in search input field on transaction page
#    Then Verify User able to view "No result found" in transaction listing on transaction page
#
#  @TC_M11.1_081
#  Scenario: Verify that user able to copy Transaction/Seller/Buyer ID
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    When User hover copy icon over transaction ID on transaction page
#    Then Verify user able to view tooltip with copy text on transaction page
#    When User click on copy icon over transaction ID on transaction page
#    Then Verify user able to view tooltip with copied on transaction page
#
#  @TC_M11.1_083
#  Scenario: Verify that user able to view Transaction detail page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on Transactions tab on user page
#    And User click on transaction listing row on transaction page
#    Then Verify user should be able to view Transaction Details page
#
#  @TC_M11.1_075
#  Scenario: Verify that user able to view Filter By options
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on Transaction section on user detail page
#    And User click on By filter in Transaction section on user detail page
#    Then Verify By default All is selected in transaction section on user detail page
#    And Verify user should be able to view By filter options on user detail page
#
#  @TC_M11.1_087
#  Scenario: Verify the functionality of copy icon over Share/Buyer/Seller ID
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on Transaction section on user detail page
#    And User hover on copy icon over seller ID on user detail page
#    Then Verify user able to view tooltip with copy text on transaction page
#    When User click on copy icon over seller ID on transaction page
#    Then Verify user able to view tooltip with copied on transaction page
#
#  @TC_M11.1_089
#  Scenario: Verify the functionality when user click on Property name
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on Transaction section on user detail page
#    And User click on Property name in Transaction section on user detail page
#    Then Verify user should be able to navigate to Property detail page
#
#  @TC_M11.1_066
#  Scenario: Verify the UI of Transaction page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on Transaction section on user detail page
#    Then Verify Segment tabs on user detail page on users page
#    And Verify Transaction table with column names in transaction section on user detail page
#    And Verify user should be able to view By filter in transaction section on user detail page
#    And Verify user should be able to view search field on user page
#
#  @TC_M11.1_053
#  Scenario: Verify the UI of Investment page
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+18@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And User click on Transaction section on user detail page
#    Then Verify Segment tabs on user detail page on users page
#    When User click on investment section on user detail page
#    And Verify user able to view Total IRR on transaction section on user detail page
#    And Verify user able to view Total AAR on transaction section on user detail page
#    And Verify user able to view Avg share cost on transaction section on user detail page
#    And Verify user able to view Equity multiple on transaction section on user detail page
#    And Verify user able to view Total Shares on transaction section on user detail page
#    And Verify user able to view Total value on transaction section on user detail page
#
#
#  @TC_M11.1_041
#  Scenario: Verify the functionality of SSN when KYC is not done
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+19@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    And Verify user able to view user's SSN value "--" when KYC is not done of User on user detail page
#
#  @TC_M11.1_039
#  Scenario: Verify the functionality of  Mobile Number when KYC is not done
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+19@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    Then Verify user able to view Registered mobile number "--" when KYC is not done of User on user detail page
#
#  @TC_M11.1_044
#  Scenario: Verify the functionality of Address when KYC is not done
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+19@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    Then Verify user able to view full address "--" when KYC is not done of User on user detail page
#
#  @TC_M11.1_042
#  Scenario: Verify the functionality of  User Since
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+19@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    Then Verify that user since date should be displayed in the format "MMM dd, yyyy" on user detail page
#
#  @TC_M11.1_048
#  Scenario: Verify the functionality of DOB when KYC is not done
#    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
#    And User enter password "@Abcde12345678" in input field on login page
#    And User click on enter button on login page
#    And User enter otp "123456" in input field on OTP page
#    And User click on confirm code button on OTP verify page
#    And User click on User tab at side bar
#    And User search the email "muskan.trivedi8+19@appinventiv.com" in search input field on users page
#    And user click on user detail row on users page
#    Then Verify user able to view DOB "--" when KYC is not done of the user detail page
#
  @TC_M11.1_016
  Scenario: Verify that Admin/Agent able to view User since value for all user
    When User enter email "atul.katare+250@appinventiv.com" in input field on login page
    And User enter password "@Abcde12345678" in input field on login page
    And User click on enter button on login page
    And User enter otp "123456" in input field on OTP page
    And User click on confirm code button on OTP verify page
    And User click on User tab at side bar
    Then Verify that user since time is displaying in format as "MMM dd, yyyy" on user page


