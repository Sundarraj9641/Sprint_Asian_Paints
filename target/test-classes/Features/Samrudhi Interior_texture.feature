@Interior_Textures
Feature: Interior Textures

  @Drop_down_list4
  Scenario: Display of Paints and Texture Drop Down List
    Given User is on Home Page
    When User hovers over Paints and Texture Tab
    Then Paints and Texture Drop down is displayed

  @InteriorTexturepage
  Scenario: Interior Textures Page Navigation
    Given User is on Paints and Texture Drop Down List
    When User clicks Interior Textures  tab
    Then Interior Texture page is displayed

  @Productpage_Navigation_2
  Scenario: Interior Textures Product Page Navigation
    Given User is on Interior Textures Page
    When User clicks on the Interior Textures product
    Then Interior Textures Product page is displayed

  @close_browser
  Scenario: To close the browser after completion of the feature
    Given User is on Interior Textures Product Page
    Then Close the Browser
