#-------------------- SAMARTH --------------------
@Paint_Selector
Feature: Paint selector

  @Drop_down_list3
  Scenario: Display of Paints and Texture Drop Down List
    Given User is on Home Page
    When User hovers over Paints and Texture Tab
    Then Paints and Texture Drop down is displayed

  @Paint_Selector_page
  Scenario: Paint Selector Page Navigation
    Given User is on Paints and Texture Drop Down List
    When User clicks Paint Selector  tab
    Then Paint Selector page is displayed

  @Productpage_Navigation_4
  Scenario: Paint Selector Product Page Navigation
    Given User is on Paint Selector Page
    When User clicks on the Paint Selector product
    Then Paint Selector product  page is displayed

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Paint Selector product Page
    Then Close the Browser
