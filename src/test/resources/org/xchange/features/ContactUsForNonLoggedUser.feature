@ContactUsPage

Feature: Contact Us for Non-logged User

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User is on homepage
    Then User able to scroll down the page and view the footer
    When User able to click on contact us on in about section on footer

  @TC_M8_001 @TC_M8_002 @TC_M8_018
  Scenario: Verify that user should able to navigate to contact us page when user is not logged in.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    #TC_M8_002
    And User able to view black background of contact us page for non-logged user
    And User able to view header text "Contact Us" on contact us page before login
    And User able to view placeholder text How Can We Help? as "How Can We Help?" on contact us page before login
    And User able to view description below the how can help you text on contact us page before login
    And User able to view Henry phone number "(214) 444-5263" on contact us page before login
    And User able to view placeholder text Send a message as "Send a message" on contact us page before login
    And User able to view name field on contact us page before login
    And User able to view email field on contact us page before login
    And User able to view subject field on contact us page before login
    And User able to view message field on contact us page before login
      #TC_M8_018
    And User able to view Add attachments as "add attachments" on contact us page before login
    And User able to view placeholder hint text "(.jpg, .png, .pdf - 10MB, max. 3 attachments)" on contact us page before login
    And User able to view send message button on contact us page before login

  @TC_M8_003
  Scenario: Verify the functionality of Name field with valid input of contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    When User enter the valid input name as " John Albert" on contact us page before login
    Then Verify name field contains only characters and spaces include between the character on contact us page before login

  @TC_M8_004
  Scenario: Verify the functionality of Name field when no input is entered in the field of contact us page.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User no input enter in name field as "" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User should able to view name validation message "Name is required" on contact us page before login

  @TC_M8_005
  Scenario: Verify the functionality of Name field with invalid input of contact us page.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the invalid input in name field as "#$%^, 4567" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User able to view name validation msg on contact us page before login

  @TC_M8_006
  Scenario: Verify the functionality of Name field when less than 2 characters are included in the input field of contact us page.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter less than two character input in name field as "a" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User able to view name validation message "Your name must contain at least 2 characters." on contact us page before login

  @TC_M8_007
  Scenario: Verify the functionality of Email field with valid input of Contact us Page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    When User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    Then Verify user should be able to type valid email address having @ and a domain (.com, .org) on contact us page before login

  @TC_M8_008
  Scenario: Verify the functionality of Email field when input is left blank of Contact Page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User no input enter in email field as "" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User should able to view email validation message "Email is required" on contact us page before login

  @TC_M8_009
  Scenario: Verify the functionality of Email field with invalid input of Contact Page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the invalid input in email field as "test.com@" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User able to view email validation msg "Please be sure a valid email is entered" on contact us page before login

  @TC_M8_010
  Scenario: Verify the functionality of Subject field with valid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    When User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    Then Verify user should able to type valid subject more than one character on contact us page before login

  @TC_M8_011
  Scenario: Verify the functionality of Subject field with invalid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the invalid input subject less than two characters "A" in subject field on contact us page before login
    When  User click outside the field on contact us page before login
    Then Verify user should able to view subject validation msg "The subject must contain at least 2 characters" on contact us page before login

  @TC_M8_012
  Scenario: Verify the functionality of Subject field when field is left blank on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User no input enter in subject field as "" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User should able to view subject validation message "Subject is required" on contact us page before login

  @TC_M8_013
  Scenario: Verify the functionality of Message field with valid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    When User enter the valid input message "ABS!@#23" in message field on contact us page before login
    Then Verify user should able to type valid message more than one character on contact us page before login

  @TC_M8_014
  Scenario: Verify the functionality of Word count of Message field with valid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "A" in message field on contact us page before login
    When  User click outside the field on contact us page before login
    Then Verify user observe the character count type 1 character in message field on contact us page before login

  @TC_M8_015
  Scenario: Verify the functionality of limit of Word count of Message field with valid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    When User enter the valid input 250 character message in message field on contact us page before login
    Then Verify user observe the character count type 250 characters in message field on contact us page before login

  @TC_M8_016
  Scenario: Verify the functionality of Message field with invalid input on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the invalid input message "A" in message field on contact us page before login
    When User click outside the field on contact us page before login
    Then User should able to view message validation message "Message must contain at least 2 characters" on contact us page before login

  @TC_M8_017
  Scenario: Verify the functionality of Message field when field is left blank on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User no input enter in message field as "" on contact us page before login
    When  User click outside the field on contact us page before login
    Then User should able to view message validation msg "Message is required" on contact us page before login

  @TC_M8_0019 @TC_M8_0020
  Scenario: Verify the functionality of Add Attachments link during contact us process on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page before login
    And User should be able to select from the internal files of the system on contact us page before login

  @TC_M8_0021 @TC_M8_0022
  Scenario: Verify the functionality of maximum 3 documents uploading after clicking Add Attachments link during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    When User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
    And User should be able to select maximum 3 files collectively at a time from the internal files of the system on contact us page before login

  @TC_M8_0024
  Scenario: Verify the functionality of files if uploaded more than 10 MB after clicking Add Attachments link during contact us process on contact us page
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    And User clicks on add attachment link on contact us page before login
    When User able to upload more than 10mb file "SampleJPGImage_15mb.jpg" on contact page before login
    Then User able to view validation message "Please be sure your attachment is 10 MB or less" on contact us page before login

  @TC_M8_0025
  Scenario: Verify the functionality of cross icon displayed along the attachment name when attachment is uploaded successfully during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    And User clicks on add attachment link on contact us page before login
    When User able to upload the file "SamplePNGImage_10mb.PNG" on contact page before login
    Then User should be able to select from the internal files of the system on contact us page before login
    When User clicks on cross icon on file attachment on contact us page before login
    Then User able to view uploaded file should be removed successfully on contact us page before login

  @TC_M8_023
  Scenario: Verify the UI of files after uploaded successfully  after clicking Add Attachments link during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page before login
    And User should be able to select from the internal files of the system on contact us page before login
    And User able to view image, name, size, cross icon, and white tick with green circle on contact us page before login

  @TC_M8_026
  Scenario: Verify the functionality of Add Attachments when 3 files are successfully uploaded during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to view validation msg "Maximum attachment limit exceeded." on contact us page before login

  @TC_M8_027
  Scenario: Verify the functionality of Send Message button if all the mandatory fields are filled with valid details during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
    And Verify User able to view Send Message button should be enabled on contact us page before login

  @TC_M8_028
  Scenario: Verify the functionality of Send Message button if all the mandatory fields are unfilled during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User able to view send message button is disabled on contact us page before login

  @TC_M8_029
  Scenario: Verify the functionality of Send Message button if all the mandatory fields are filled with invalid details during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the invalid input in name field as "#$%^, 4567" on contact us page before login
    And User enter the invalid input in email field as "test.com@" on contact us page before login
    And User enter the invalid input subject less than two characters "A" in subject field on contact us page before login
    When User enter the invalid input message "A" in message field on contact us page before login
    Then User able to view send message button is disabled on contact us page before login

  @TC_M8_030
  Scenario: Verify the functionality of toast message displayed on clicking on Send Message button during contact us process.
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
    When User should able to clicks on send message button on contact us page before login
    Then Verify user able to view toast message on contact us page before login

  @TC_M8_031
  Scenario: Verify the functionality when user successfully submitted contact us form
    Then User should able to navigate to "contact-us#About-list" contact us page before login
    And User enter the valid input name as " John Albert" on contact us page before login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page before login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page before login
    And User enter the valid input message "ABS!@#23" in message field on contact us page before login
    When User clicks on add attachment link on contact us page before login
    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
    When User should able to clicks on send message button on contact us page before login
    Then User able to view field data should refreshed on contact us page before login
    And User stay back on the contact us page before login
