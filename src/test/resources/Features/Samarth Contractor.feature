#-------------------- SAMARTH --------------------
@Find_Contractor
Feature: Find a Contractor

  @Find_Contractor_page_navigation
  Scenario: Display Find a Contractor page
    Given User is on Home Page
    When User clics on Find a Contractor icon
    Then Find a Contractor page is displayed

  @successful_pin
  Scenario Outline: Succesful Pincode Entry
    Given User is on Find a Contractor page
    When User enters pincode <Pincode>
    And user clicks Search button
    Then Contractor Page is displayed

    Examples: 
      | Pincode |
      |  641025 |
      |  240000 |

  @Unsuccessful_pin
  Scenario Outline: Unsuccesful Pincode Entry
    Given User is on Find a Contractor page
    When User enters pincode <Pincode>
    And user clicks Search button
    Then Unsuccesful pin Error Message is displayed
    And Contractor Unsuccessful Error Message must be <Expected_Message>

    Examples: 
      | Pincode | Expected_Message               |
      |     641 | Enter a valid 6 digit Zip Code |
      |      24 | Enter a valid 6 digit Zip Code |

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Contractor Page
    Then Close the Browser
