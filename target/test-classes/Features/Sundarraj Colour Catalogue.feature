#-------------------- SUNDARRAJ --------------------
@Colour_Catalogue 
Feature: Colour Catalogue 

@Display_the_list 
Scenario: Display the Paints and colours 
	Given User is on the Home Page of Asian Paints 
	When User hover the mouse on paints and colour 
	Then Paints and colours list is displayed 
	
@Add_product_to_wishlist 
Scenario: Add the Paint Product to the Wishlist 
	Given User is on the paints and colours List 
	When User click on the colour catalogue 
	When user click on colour 
	And Click on wishlist icon 
	Then Paint catalogue is added to the wishlist 
	
@Log_Out 
Scenario: Log Out of the Application
	Given User is on the Home Page of Asian Paints 
	When User click on the profile icon 
	And Click on sign out 
	Then Account is Log Out Successfully 
	
@Buy_Now 
Scenario: Buy the paint product 
	Given User is on the Home Page of Asian Paints 
	When User login to the application 
	When Click on Wishlist icon 
	When User click on the product 
	When User enter the pincode 
	And Click on buy now button 
	Then User able to see the delivery address page
		
@Filter_the_Products
Scenario: Filter the products
	Given User is on the Colours Catalogue page
	When User apply the filters
	Then User able to see the filtered products 
	
@Enquiry_Now 
Scenario Outline: Enquire the Product 
	Given User is on the Home Page of Asian Paints 
	When User Enters the Name <Name> 
	When User Enter Email <Email> 
	When User Enter Mobile Number <Mobile_Number> 
	When User Enter Pincode <Pincode> 
	And Click on Enquire Now button 
	Then Successful Completion message is displayed 
	
	Examples: 
		| Name   | Email                   | Mobile_Number | Pincode |
		| Sundar | sundarraj1234@gmail.com | 9876543212    | 639001  |
		| Raj    | rajsundar4321@gmail.com | 8976543213    | 534305  |
		
@Enquiry_Now_Unsuccessful 
Scenario Outline: Enquire the Product with Invalid details
	Given User is on the Home Page of Asian Paints 
	When User Enters the Name <Name> 
	When User Enter Email <Email> 
	When User Enter Mobile Number <Mobile_Number> 
	When User Enter Pincode <Pincode> 
	And Click on Enquire Now button 
	Then Error message is displayed 
	
	Examples: 
		| Name      | Email                      | Mobile_Number     | Pincode |
		| Sundarraj | sundarraj3243@gmail.com    | 7796543212        | 639     |
		