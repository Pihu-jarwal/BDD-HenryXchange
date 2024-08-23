@sellSharePage
Feature: Sell submitted page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page
    Then User is on login page
    And User enters a email on login page in input field - anuj.kumar8+12@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on portfolio tab on market page


  @TC_M5_053 @TC_M5_054 @TC_M5_055
  Scenario: Verify the UI of Sell Order Submitted page on sell share page
    Then User view the investment text on portfolio page
    When click on Sell button on portfolio page
    Then User is navigate on sell share page
    And User views the share price text field on sell share page
    And User enters a numeric value "0.20" in the share price field on sell share page
    And User enters value in "1" # of Shares text field on sell share page
    When User able to clicks on continue button on sell share page
    Then User able to view two factor method verification pop-up on sell share page
    And User click on email option on two factor popup on sell share page
    When User clicks on confirm button on two factor popup on sell share page
    Then User enter the valid code "123456" in otp box two factor auth verification pop-up for SMS on sell share page
    And User clicks on confirm code button on two factor auth verification pop-up for SMS on sell share page
    When User clicks on cross icon on ID verified pop-up for SMS on sell share page
    Then User able to view Sell Share page with "Preparing Contract" Loader right of Segment tabs on sell share page
    And User should be able to navigate on agree to terms page to sell shares
    And User able to view enter your initials button active on agree to terms Pop-up on sell share page
    And User enter valid input "AK" in enter your initials field on agree to terms Pop-up on sell share page
    When User clicks on agree and continue button on agree to terms Pop-up on sell share page
    Then User able to view breadcrumbs on sell order submitted page
    And User able to view header: Sell Order Submitted on sell order submitted page
    And User able to view asset name on sell order submitted page
    And user able to view net amount to You on sell order submitted page
    And User able to view Share Price on sell order submitted page
    And User able to view Number of Shares on sell order submitted page
    And User able to view Total Amount on sell order submitted page
    And User able to view Gross Price on sell order submitted page
    And User able to view Fees on sell order submitted page
    And User able to view Portfolio button on sell order submitted page
    #TC_M5_054
    When User clicks on view Portfolio button on sell order submitted page
    Then User is on portfolio page
    #TC_M5_055
    And User clicks on profile icon on header
    When User clicks on account on profile menu on header
    Then Verify user is on account page
    And Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    Then User able to view Agreement in My agreement page

  @TC_M5_056 @TC_M5_057
  Scenario: Verify the UI of Property detail page when user have Sell order and Buy order submitted
    Then User is on portfolio page
    And User clicks on market tab on portfolio page
    And User clicks on typing cursor over search field on market page
    When User enters asset name "Oakwood Sarasota" in search field on market page
    Then User click on invested property on market page
    Then User is on property detail page
    And User view the header open orders with count on property detail page
    And User view the table which contain type , # OF SHARES , SHARE PRICE , FEE, TOTAL and manage on property detail page
    #TC_M5_057
    When User clicks on manage in open order on property detail page
    Then User is navigate on sell share page

  @TC_M5_058 @TC_M5_059
  Scenario: Verify the UI of Your Investment section
    Then User is on portfolio page
    And User clicks on market tab on portfolio page
    And User clicks on typing cursor over search field on market page
    When User enters asset name "Oakwood Sarasota" in search field on market page
    Then User click on invested property on market page
    Then User is on property detail page
    And User view the your investment section contains total investment, total shares in the property, view transactions, sell button on property detail page
    #TC_M5_059
    When User able to click on view transaction in your investment on property detail page
    Then Verify user should able to navigate to Transactions page


  @TC_M5_062 @TC_M5_063 @TC_M5_064 @TC_M5_066 @TC_M5_067 @TC_M5_068
  Scenario: Verify the functionality when user click on Cancel button for sell order submitted
    Then User is on portfolio page
    When User clicks on cancel button over sell orders table on portfolio page
    Then User should able to view cancel sell order popup on portfolio page
    #@TC_M5_063
    And User able to view header Withdraw sell order for property name on cancel sell order popup in portfolio page
    And User able to view subtext Your shares will be removed from the market place on cancel sell order popup in portfolio page
    And User able to view Return to Portfolio button on cancel sell order popup in portfolio page
    And User able to view Yes, Withdraw button on cancel sell order popup in portfolio page
    #TC_M5_064
    When User clicks on return to portfolio button on cancel sell order popup in portfolio page
    Then Verify user view the cancel sell order popup is closed
    And User is on portfolio page
    #TC_M5_067
    When User clicks on cancel button over sell orders table on portfolio page
    Then User clicks on yes withdraw button on cancel sell order popup in portfolio page
    And User able to view toast msg Your Sell Order has been successfully canceled on portfolio page
    #TC_M5_066
    And User is on portfolio page
    #TC_M5_068
    And User clicks on cancel button over sell orders table on portfolio page
    When User clicks outside the cancel sell order popup in portfolio page
    Then Verify user view the cancel sell order popup is closed
    And User is on portfolio page

  @TC_M5_070
  Scenario: Verify that user able to view Tooltip over Sell Share page
    Then User view the investment text on portfolio page
    When click on invest property Sell button on portfolio page
    Then User is navigate on sell share page
    When User does hover on tooltip of property name on sell share page
    Then Verify user should be able to view full property name as shown in design on sell share page
    When User does hover on tooltip of market estimate on sell share page
    Then Verify User should be able to view market estimate description on sell share page

  @TC_M5_065
  Scenario: Verify the functionality of Yes, Withdraw button on sell order cancel popup on portfolio page
    Then User is on portfolio page
    And User able to view sell order count before canceled sell order on portfolio page
    And User clicks on cancel button over sell orders table on portfolio page
    When User clicks on yes withdraw button on cancel sell order popup in portfolio page
    Then User able to view toast msg Your Sell Order has been successfully canceled on portfolio page
    And Verify user able to view the Shares are no longer listed for sale on the Exchange

