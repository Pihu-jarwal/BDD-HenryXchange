@footer

Feature: Footer

  @TC_M8_067 @TC_M8_068
  Scenario: To verify navigation to the footer in the complete website
    Given User navigate to "https://qaapp.firemountains.co/"
    When User is on homepage
    Then User able to scroll down the page and view the footer
    #TC_M8_068
    And User should able to view full disclosure as "Full Disclosure" on footer
    And User should able to view privacy policy as "Privacy Policy" on footer
    And User should able to view data security  as "Data Security" on footer
    And User should able to view terms of use  as "Terms of Use" on footer
    And User should able to view website data collection process as "Website Data Collection Process" on footer


  @TC_M8_069 @TC_M8_070
  Scenario: To verify the click of Full Disclosure link.
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User clicks on full disclosure link on footer
    Then User should be successfully redirected to "full disclosure" link "HENRY%20Full%20Disclosure.pdf" separate tab
    #TC_M8_070
    And User should be viewed successfully full disclosure link in the separate tab

  @TC_M8_071 @TC_M8_072
  Scenario: To verify the click of Privacy Policy link.
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User clicks on privacy policy link on footer
    Then User should be successfully redirected to "privacy policy" link "HENRY%20Privacy%20Policy.pdf" separate tab
    #TC_M8_072
    And User should be viewed successfully privacy policy link in the separate tab

  @TC_M8_073 @TC_M8_074
  Scenario: To verify the click of Data Security link.
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User clicks on data security link on footer
    Then User should be successfully redirected to "Data Security" link "HENRY%20Data%20Security.pdf" separate tab
    #TC_M8_074
    And User should be viewed successfully data security link in the separate tab

  @TC_M8_075 @TC_M8_076
  Scenario: To verify the click of Terms of Use link.
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User clicks on Terms of Use link on footer
    Then User should be successfully redirected to "Terms of Use" link "HENRY%20Terms%20of%20Use.pdf" separate tab
    #TC_M8_076
    And User should be viewed successfully Terms of Use link in the separate tab

  @TC_M8_077 @TC_M8_078
  Scenario: To verify the click of Website Data Collection Process link.
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User clicks on website data collection process link on footer
    Then User should be successfully redirected to "website data collection process" link "HENRY%20Data%20Collection%20Process.pdf" separate tab
    #TC_M8_078
    And User should be viewed successfully website data collection process link in the separate tab

