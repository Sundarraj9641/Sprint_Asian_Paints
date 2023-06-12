@PaintBudgetCalaculator
Feature: Paint Budget Calculator

  @Drop_down_list
  Scenario: Display of Paints and Texture Drop Down List
    Given User is on Home Page
    When User hovers over Paints and Texture Tab
    Then Paints and Texture Drop down is displayed

  @PaintBudgetCalculatorpage
  Scenario: Paint Budget Calculator Page Navigation
    Given User is on Paints and Texture Drop Down List
    When User clicks Paint Budget Calculator tab
    Then Paint Budget Calculator is displayed

  @Quick_Calculator_Successful
  Scenario Outline: Quick Budget Calculation
    Given User is on Paint Budget Calculator page
    When User clicks Re-painting radio button
    And User clicks Exterior radio button
    And User enters Carpet Area <carpet_Area>
    And User clicks Calculate button
    Then Budget calculated is displayed

    Examples: 
      | carpet_Area |
      |        1200 |
      |1300|

  @Quick_Calculator_unsuccessful
  Scenario Outline: Quick Budget error Calculation
    Given User is on Paint Budget Calculator page
    When User clicks Re-painting radio button
    And User clicks Exterior radio button
    And User enters Carpet Area <carpet_Area>
    And User clicks Calculate button
    Then Error Message is displayed

    Examples: 
      | carpet_Area |
      | a           |

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Paint Budget Calculator Page
    Then Close the Browser
