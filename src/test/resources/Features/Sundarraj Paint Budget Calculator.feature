#-------------------- SUNDARRAJ --------------------
@Paint_Budget_Calculator 
Feature: Paint Budget Calculator 

Background: Navigate to the Calculator page
	Given user in the Home page 
	When User hover the mouse on Paints and Colours 
	And Click on Paint Budget Calculator 
	Then Calculator page is Visible 
	
@Quick_Calculator 
Scenario: Quick Calculator 
	When User select the Specification of Home 
	When User enter the Carpet Area 
	And Click on Calculate Now Button 
	Then User able to see litres of Paint and Price of Paint
	
@Advanced_Calculator
Scenario: Advanced Calculator
	When User Select the advanced calculator
	When User enter the measurements of the home
	And Click on Calculate Button
	Then User able to see the total price to paint their home