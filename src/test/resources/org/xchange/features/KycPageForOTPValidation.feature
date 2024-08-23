@KycPageForOTP
  Feature: Kyc page for OTP validation wait for 15 min

    Background:
      Given User navigate to "https://qaapp.firemountains.co/"
      When User clicks on login button on home page
      And User enters a email on login page in input field - muskan.trivedi8+21@appinventiv.com
      And User enters a password on login page in input field - Muskan@12345
      And User clicks on enter button on login page

    @TC_M7_038 @TC_M7_039 @TC_M7_037
    Scenario: Verify the functionality of Resend Code link after 15-minutes while completing KYC process
      And User enter "8295701202" digit mobile number in mobile input field on kyc page
      And User enter address "17 Terrace Drive, Plainfield, CT, USA" in residential address input field on kyc page
      And User click on address from address dropdown on kyc page
      And User clicks on continue button on kyc page
      And User enter 6-digit valid code 646466 in otp input field on kyc page
      And User click on confirm code button on OTP popup on kyc page
      And User remove code from otp box on OTP popup on kyc page
      And User enter 6-digit valid code 774747 in otp input field on kyc page
      And User click on confirm code button on OTP popup on kyc page
      And User remove code from otp box on OTP popup on kyc page
      And User enter 6-digit valid code 029182 in otp input field on kyc page
      And User click on confirm code button on OTP popup on kyc page
      And User remove code from otp box on OTP popup on kyc page
      #TC_M7_037
      Then verify timer should start with 14:59 for OTP on kyc page
      When User will wait for 15 minutes on OTP popup on kyc page
      And User click on cross icon on OTP popup on kyc page
      And User clicks on continue button on kyc page
      And After 15-minutes if user re-enters 483487 invalid OTP on OTP popup on kyc page
      And User click on confirm code button on OTP popup on kyc page
      Then User should be able to view validation message on OTP popup on kyc page
      #TC_M7_039
      When User remove code from otp box on OTP popup on kyc page
      And User enter 6-digit valid code 913821 in otp input field on kyc page
      And User click on confirm code button on OTP popup on kyc page
      Then Verify user able to view KYC process disrupted error message on OTP popup on kyc page






