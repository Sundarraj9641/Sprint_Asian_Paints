#-------------------- SAMARTH --------------------
@2200_Colour
Feature: Colours

  @Drop_down_list1
  Scenario: Display of Paints and Texture Drop Down List
    Given User is on Home Page
    When User hovers over Paints and Texture Tab
    Then Paints and Texture Drop down is displayed

  @2200Colour_page_navigation
  Scenario: Ctiolours Page Navigaon
    Given User is on Paints and Texture Drop Down List
    When User clicks Colours tab
    Then Colour page is displayed

  @Enquire
  Scenario: Enquire Now Form Navigation
    Given User is on Colours Page
    When User clicks Enquire Now  tab
    Then Enquire Now form is displayed

  @Succesful_Enquiry
  Scenario Outline: Succesful Enquiry
    Given User is on Enquire Now form
    When User enters Name <Name>
    And User enters Email <Email_ID>
    And User enters Mobilenumber <Mobile_Number>
    And User enters Pincode <Pincode>
    And User clicks on Enquire Tab
    Then Succesful Completion page is displayed

    Examples: 
      | Name    | Email_ID                             | Mobile_Number | Pincode |
      | samarath  | samarth.bhosale147@gmail.com |    9994460184 |     123 |
      | samarthB | rahul.18ee@kct.ac.in             |    6369501003 |   12333 |

  @Unsuccesful_Enquiry
  Scenario Outline: Unsuccesful Enquiry
    Given User is on Enquire Now form
    When User enters Name <Name>
    And User enters Email <Email_ID>
    And User enters Mobilenumber <Mobile_Number>
    And User enters Pincode <Pincode>
    And User clicks on Enquire Tab
    Then Unsuccesful Error Message is displayed

    Examples: 
      | Name    | Email_ID         | Mobile_Number | Pincode |
      | rahulm  | rahul@gmail.com  |   98389392292 |     123 |
      | rahulmW | rahuWl@gmail.com |  938389392292 |   12333 |

  @ProductNavigation_1
  Scenario: Colours Product Page Navigation
    Given User is on Colours Page
    When User clicks on the Colours product
    Then Colours Product page is displayed

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Colours Product Page
    Then Close the Browser
