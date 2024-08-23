@agreement

Feature: Agreement page

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User clicks on login button on home page

  @TC_M3_021
  Scenario: Verify that user able to view My Agreements section over Account page
    And User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Verify the my agreements section below the communication references and which have > icon at extreme right on account page

  @TC_M3_022
  Scenario: Verify that user not be able to navigate to my agreements page when no agreements signed on account page
    And User enters a email on login page in input field - anuj.kumar8+4@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user is navigate to kyc page
    When User click on market tab on kyc page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Scroll the page and User should not be able to view My Agreement section over Account Page

  @TC_M3_023
  Scenario: Verify that user able to view "My agreements" page on agreement page
    And User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    Then User is on my agreements listing page and verify my agreement page
    And User should able to see breadcrumbs on agreement page
    And User should able to see table format all listing signed agreements
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

  @TC_M3_024
  Scenario: Verify that user able to view all list of document when user signed the Confidentiality agreements on agreement page
    And User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    Then User should able to verify all list of document when user signed the confidentiality agreements on agreement page

  @TC_M3_026
  Scenario: Verify that user able to view full list of document on agreement page
    And User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    Then User should be able to scroll page vertically to view full list of document

  @TC_M3_025
  Scenario: Verify that user able to view document on agreement page
    And User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    And Verify user is on account page
    Then Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    And User able to clicks on document view button on agreement page
    Then User able to view "Oakwood Sarasota" agreement document on agreement page

  @TC_M3_027
  Scenario: Verify that user able to download document on agreement page
    When User enters a email on login page in input field - anuj.kumar8+3@appinventiv.com
    And User enters a password on login page in input field - Anuj@1234567
    And User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    When User clicks on profile icon on header
    And User clicks on account on profile menu on header
    Then Verify user is on account page
    And Verify the my agreements section below the communication references and which have > icon at extreme right on account page
    When User able to clicks on angle bracket icon on account page
    Then User is on my agreements listing page and verify my agreement page
    When User clicks on document download button on my agreement page
    Then User should be able to download agreement in pdf on agreement page