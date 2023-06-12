#-------------------- SUNDARRAJ --------------------
@Login
Feature: Login on the Application
@Successfull_Login
Scenario: Successful login on the Application
Given User is on the Home Page
When User click on the the profile icon 
When User enter the mobile number
And User click on submit button
When User enter the OTP
And User click on submit
Then Account is login successfully