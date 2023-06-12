#-------------------- SUNDARRAJ --------------------
@Exterior_Paints 
Feature: Exterior Paints 

@Select_Exterior_paint 
Scenario: View Details of One Exterior Paint 
	Given User is on the Exterior paints page 
	When User click on Wall textures category 
	When User click on View Catalogue of product 
	And User select the colour 
	Then User able to see the description of the product

@Search_the_Products
Scenario Outline: Search the Products
	Given User is in the Home Page
	When User click on search box
	When User enter the product name <product_name>
	And Click on search button
	Then User able to see the searched product
	
Examples:
| product_name       |
| Ultima floor guard |
| Apex floor guard   |

@Search_the_Invalid_Products
Scenario Outline: Search the Products using invalid product name
	Given User is in the Home Page
	When User click on search box
	When User enter the product name <product_name>
	And Click on search button
	Then User able to see the error message
	
Examples:
| product_name       |
| 1122334455         |
| Capgemini          |
