#------------------ SHRADHA --------------------
@Home_Decor
 Feature: Home Decor

@HomeDecor_Selector
  Scenario: Display Home Decor Drop Down List
    Given User is on the Asian Paints application
    When User hovers over Home Decor Tab
    Then Home Decor Drop down is displayed
    
    
@Explore_modular_kitchen
    Scenario: Click on explorer now 
    Given User is on modular kitchen page
    When User clicks on explore now tab 
    Then Explorer page is displayed

    
@Explore_Project
  Scenario: click on projects
    Given User is on explorer page
    When User clicks on project tab 
    Then project overview is displayed     
    
@Store_locator_explorer
   Scenario: Click on Store_locator  
    Given User is on project page
    When User clicks on store_locator
    Then Store locator page displayed
    
@stores_not_displaying_By_city
   Scenario: stores not displayed on given areas
   Given User is on Store_locator page
   When User clicks on city
    And User enters wrong city
    And Clicks on locator button
    Then Message displayed as Record not found
   
@store_displayed_by_city
   Scenario: stores displayed on given areas
   Given User is on Store_locator page
   When User clicks on city
   And User enters wrong city
    And User enters correct city
    And Clicks on locator button
    Then stores are shown on map    
     