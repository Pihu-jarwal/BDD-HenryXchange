@LoggedUserContactUsPage

Feature: Contact Us for logged User

  Background:
    Given User navigate to "https://qaapp.firemountains.co/"
    When User is on homepage
    And User clicks on login button on home page
    Then User is on login page
    And User enters a email on login page in input field - muskan.trivedi8+15@appinventiv.com
    And User enters a password on login page in input field - Muskan@12345
    When User clicks on enter button on login page
    Then Verify user navigation to market page, when user logged in with valid credential
    And User able to scroll down the page and view the footer
    When User able to click on contact us on in about section on footer

#  @TC_M8_033 @TC_M8_034 @TC_M8_52
#  Scenario: Verify that user should able to navigate to contact us page when user is logged in.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    #TC_M8_034
#    And User able to view white background of contact us page for logged user
#    And User able to view header text "Contact Us" on contact us page after login
#    And User able to view placeholder text How Can We Help? as "How Can We Help?" on contact us page after login
#    And User able to view description below the how can help you text on contact us page after login
#    And User able to view Henry phone number "(214) 444-5263" on contact us page after login
#    And User able to view placeholder text Send a message as "Send a message" on contact us page after login
#    And User able to view name field on contact us page after login
#    And User able to view email field on contact us page after login
#    And User able to view subject field on contact us page after login
#    And User able to view message field on contact us page after login
#    #@TC_M8_52
#    And User able to view Add attachments as "Add Attachments" on contact us page after login
#    And User able to view placeholder hint text "(.jpg, .png, .pdf - 10MB, max. 3 attachments)" on contact us page after login
#    And User able to view send message button on contact us page after login
#
#  @TC_M8_035
#  Scenario: Verify the functionality of Name field with valid input of contact us page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    When User enter the valid input name as " John Albert" on contact us page after login
#    Then Verify name field contains only characters and spaces include between the character on contact us page after login
#
#  @TC_M8_036
#  Scenario: Verify the functionality of auto filled Name field displayed in the Contact us page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to view name is autofill display in name field on contact us page after login
#    And User clicks on profile icon on header
#    When User clicks on account on profile menu on header
#    Then Verify user able to view Name should be displayed auto filled same as displayed in the Account page.
#
#  @TC_M8_037
#  Scenario: Verify the functionality of Name field when no input is entered in the field of contact us page.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already name filled in name field on contact us page after login
#    And User no input enter in name field as "" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User should able to view name validation message "Name is required" on contact us page after login
#
#  @TC_M8_038
#  Scenario: Verify the functionality of Name field with invalid input of contact us page.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the invalid input in name field as "#$%^, 4567" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User able to view name validation msg on contact us page after login
#
#  @TC_M8_039
#  Scenario: Verify the functionality of Name field when less than 2 characters are included in the input field of contact us page .
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already name filled in name field on contact us page after login
#    And User enter less than two character input in name field as "a" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User able to view name validation message "Your name must contain at least 2 characters." on contact us page after login
#
#  @TC_M8_040
#  Scenario: Verify the functionality of Email field with valid input of Contact us Page.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already name filled in name field on contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    When User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    Then Verify user should be able to type valid email address having @ and a domain (.com, .org) on contact us page after login
#
#  @TC_M8_041
#  Scenario:Verify the functionality of auto filled Email field displayed in the Contact us page.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to view email is autofill display in email field on contact us page after login
#    And User clicks on profile icon on header
#    When User clicks on account on profile menu on header
#    Then Verify user is on account page
#    And Verify user able to view email should be displayed auto filled same as displayed in the Account page.
#
#  @TC_M8_042
#  Scenario: Verify the functionality of Email field when input is left blank of Contact Page
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already name filled in name field on contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User no input enter in email field as "" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User should able to view email validation message "Email is required" on contact us page after login
#
#  @TC_M8_043
#  Scenario: Verify the functionality of Email field with invalid input of Contact Page
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the invalid input in email field as "test.com@" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User able to view email validation msg "Please be sure a valid email is entered" on contact us page after login
#
#  @TC_M8_044
#  Scenario: Verify the functionality of Subject field with valid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    When User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    Then Verify user should able to type valid subject more than one character on contact us page after login
#
#  @TC_M8_045
#  Scenario: Verify the functionality of Subject field with invalid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the invalid input subject less than two characters "A" in subject field on contact us page after login
#    When User click outside the field on contact us page after login
#    Then Verify user should able to view subject validation msg "The subject must contain at least 2 characters" on contact us page after login
#
#  @TC_M8_046
#  Scenario: Verify the functionality of Subject field when field is left blank on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User no input enter in subject field as "" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User should able to view subject validation message "Subject is required" on contact us page after login
#
#  @TC_M8_047
#  Scenario: Verify the functionality of Message field with valid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    When User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    Then Verify user should able to type valid message more than one character on contact us page after login
#
#  @TC_M8_048
#  Scenario: Verify the functionality of Word count of Message field with valid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "A" in message field on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then Verify user observe the character count type 1 character in message field on contact us page after login
#
#  @TC_M8_049
#  Scenario: Verify the functionality of limit of Word count of Message field with valid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    When User enter the valid input 250 character message in message field on contact us page after login
#    Then Verify user observe the character count type 250 characters in message field on contact us page after login
#
#  @TC_M8_050
#  Scenario: Verify the functionality of Message field with invalid input on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the invalid input message "A" in message field on contact us page after login
#    When User click outside the field on contact us page after login
#    Then User should able to view message validation message "Message must contain at least 2 characters" on contact us page after login
#
#  @TC_M8_051
#  Scenario: Verify the functionality of Message field when field is left blank on contact page after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User no input enter in message field as "" on contact us page after login
#    When  User click outside the field on contact us page after login
#    Then User should able to view message validation msg "Message is required" on contact us page after login

  @TC_M8_053 @TC_M8_054
  Scenario: Verify the functionality of Add Attachments link during contact us process after login
    Then User should able to navigate to "contact" contact us page after login
    And User enter the valid input name as " John Albert" on contact us page after login
    And User able to delete the already email filled in email field on contact us page after login
    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
    When User clicks on add attachment link on contact us page after login
    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
    And User should be able to select from the internal files of the system on contact us page after login

#  @TC_M8_055 @TC_M8_056
#  Scenario: Verify the functionality of maximum 3 documents uploading after clicking Add Attachments link during contact us process after login
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page after login
#    And User should be able to select maximum 3 files collectively at a time from the internal files of the system on contact us page after login
#
#  @TC_M8_057
#  Scenario: Verify the UI of files after uploaded successfully after clicking Add Attachments link during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
#    And User should be able to select from the internal files of the system on contact us page after login
#    And User able to view image, name, size, cross icon, and white tick with green circle on contact us page after login
#
#  @TC_M8_058
#  Scenario: Verify the functionality of files if uploaded more than 10 MB after clicking Add Attachments link during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload more than 10mb file "SampleJPGImage_15mb.jpg" on contact page after login
#    And User able to view validation message "Please be sure your attachment is 10 MB or less" on contact us page after login
#
#  @TC_M8_059
#  Scenario: Verify the functionality of cross icon displayed along the attachment name when attachment is uploaded successfully during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
#    And User should be able to select from the internal files of the system on contact us page after login
#    When User clicks on cross icon on file attachment on contact us page after login
#    Then User able to view uploaded file should be removed successfully on contact us page after login
#
#  @TC_M8_060
#  Scenario: Verify the functionality of Add Attachments when 3 files are successfully uploaded during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the 3 files "SamplePNGImage_10mb.PNG" "sample_5MB_JPG.jpg" "SamplePDFFile_5mb.pdf" one time on contact us page before login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to view validation msg "Maximum attachment limit exceeded." on contact us page after login
#
#  @TC_M8_061
#  Scenario: Verify the functionality of Send Message button if all the mandatory fields are filled with valid details during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
#    And Verify User able to view Send Message button should be enabled on contact us page after login
#
#  @TC_M8_062
#  Scenario: Verify the functionality of Send Message button if all the mandatory fields are unfilled during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to view send message button is disabled on contact us page after login
#
#  @TC_M8_063
#  Scenario: Verify the functionality of Send Message button if all the mandatory fields are filled with invalid details during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User able to delete the already name filled in name field on contact us page after login
#    And User enter the invalid input in name field as "#$%^, 4567" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the invalid input in email field as "test.com@" on contact us page after login
#    And User enter the invalid input subject less than two characters "A" in subject field on contact us page after login
#    When User enter the invalid input message "A" in message field on contact us page after login
#    Then User able to view send message button is disabled on contact us page after login
#
#  @TC_M8_064
#  Scenario: Verify the functionality of toast message displayed on clicking on Send Message button during contact us process.
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
#    When User should able to clicks on send message button on contact us page after login
#    Then Verify user able to view toast message on contact us page after login
#
#  @TC_M8_065
#  Scenario: Verify the functionality when user successfully submitted contact us form on contact us page
#    Then User should able to navigate to "contact#About-list" contact us page after login
#    And User enter the valid input name as " John Albert" on contact us page after login
#    And User able to delete the already email filled in email field on contact us page after login
#    And User enter the valid email in email field as "anuj.kumar8+8@appinventiv.com" on contact us page after login
#    And User enter the valid input subject "ABS!@#23"  in subject field on contact us page after login
#    And User enter the valid input message "ABS!@#23" in message field on contact us page after login
#    When User clicks on add attachment link on contact us page after login
#    Then User able to upload the file "SamplePNGImage_10mb.PNG" on contact page after login
#    When User should able to clicks on send message button on contact us page after login
#    Then User able to view field data should refreshed on contact us page after login
#    And User stay back on the contact us page after login