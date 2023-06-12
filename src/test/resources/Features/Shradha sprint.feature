#------------------ SHRADHA --------------------
@Asian_paint
Feature: Asian paints


@Login
Scenario: Successful Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters UserName 
And User click on submit button
Then User enters otp and clicks on otp_submit button
And Login Successfully
 
@Logout
Scenario: Successful Logout
Given User is on Home Page
When User Clicks on SignOut  
Then User Logout Successfully   
 
 
@Find_Contractor_page_navigation
Scenario: Display Find a Contractor page
    Given User is on Home Page
    When User clicks on Find a Contractor icon
    Then Find a Contractor page is displayed


# @Unsuccessful_pin
#Scenario Outline: Unsuccesful Pincode Entry
#    Given User is on Find a Contractor page
#    When User enters pincode <Pincode>
#    And user clicks Search button
#    Then Unsuccesful pin Error Message is displayed
#    And Contractor Unsuccessful Error Message must be <Expected_Message>
#
#    Examples: 
#      | Pincode | Expected_Message               |
#      |     600 | Enter a valid 6 digit Zip Code |
#      |      60007 | Enter a valid 6 digit Zip Code |
#      
#@Successful_pin
#Scenario Outline: Succesful Pincode Entry   
#    Given User is on Find a Contractor page
#    When User enters pincode <Pincode>
#    And user clicks Search button
#    Then Contractor Page is displayed
#
#    Examples: 
#      | Pincode |
#      |  413512 |
#      |  560066 | 
#    
#  
#      