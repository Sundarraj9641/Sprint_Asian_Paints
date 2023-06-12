@Exterior_Textures
Feature: Exterior Textures

  @Drop_down_list3
  Scenario: Display of Paints and Texture Drop Down List
    Given User is on Home Page
    When User hovers over Paints and Texture Tab
    Then Paints and Texture Drop down is displayed

  @ExteriorTexturepage
  Scenario: Exterior Textures Page Navigation
    Given User is on Paints and Texture Drop Down List
    When User clicks Exterior Textures  tab
    Then Exterior Texture page is displayed

  @Productpage_Navigation_3
  Scenario: Exterior Product Page Navigation
    Given User is on Exterior Textures Page
    When User clicks on the Exteriorproduct
    Then Exterior Product page is displayed

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Exterior Product Page
    Then Close the Browser
