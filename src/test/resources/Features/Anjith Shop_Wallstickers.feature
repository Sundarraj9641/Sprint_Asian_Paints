#-------------------- ANJITH --------------------
@Wall_Stickers
Feature: Wall Stickers

  @Login_Logout
  Scenario: Loging into the application
    Given User is on the Asian Paints application
    When User clicks on profile button
    When User clicks and enters mobile and clicks on submit
    When User clicks on and enters otp and clicks on submit
    And Clicks on Myprofile
    Then User able to see the profile

  @Shop_options
  Scenario: Displaying Shop options
    Given User is on the Asian Paints application
    When user hovers  mouse on shop
    And click on wallstickers
    Then Sould able to navigate and display wall stickers name

  @Wall_Sticker_Page
  Scenario: Exploring Wall Sticker page
    Given User is on the Asian Paints application
    When user hovers  mouse on shop
    And click on wallstickers
    And clicks on loadmore
    Then Displays all the stickers in that page

  @Apply_Filters
  Scenario: Apply the filter
    Given User is on the Asian Paints application
    When user hovers  mouse on shop
    And click on wallstickers
    And clicks on filters and selects
    And clicks on sortby and select one
    Then User able to see the filtered products

  @Invalid_Pincode
  Scenario: Buy now unsuccessful
    Given User is on the Wall Stickers page
    When User click on wall sticker
    When User enter the pincode
    And Click on buy now button
    Then Error message is displayed

  @Buy_Product
  Scenario Outline: Buy the product
    Given User is on the Wall Stickers page
    When User click on wall sticker
    When User enters the pincode <pincode>
    And Click on buy now button
    Then User able to see the payment page

    Examples: 
      | pincode |
      |  534305 |
      |  534306 |

  @WishList
  Scenario: Add product to wishlist
    Given User is on the Wall Stickers page
    When User click on wall sticker
    When User click on wishlist button
    And Click on WishList Icon on the top
    Then User able to see the product is added to the wishlist

  @getLatestNews
  Scenario Outline: Get the latest news
    Given User is on the Asian Paints application
    When User enter mail in textbox <mail>
    When User click on Subscribe button
    Then Successful Message is shown

    Examples: 
      | mail                 |
      | anjith12@mail.com    |
      | anjith3455@gmail.com |

  @Shop_clciking
  Scenario: clicking on shop catlouge
    Given User is on the Asian Paints application
    When User clciks on shop option
    And User clciks on EXPLORE NOW and displays Mechanized Tools & Spares
    And user clicks on Terms & Conditions
    Then displays terms and conditions

    
    @Logout
    Scenario: Loging out
    Given User is on the Asian Paints application
    When User clicks on profile button
    And clicks on signout 
    Then able to sign out
    
    
    @Chrome_options
    Scenario: Scrolling page
     Given User is on the Asian Paints application
     When User clciks on shop option
     And able to go to previous page,nexr page,refresh
     Then able to show user functions are working
     
   
    