Feature: Validating Card number Textfield by entering Invalid Data in Payment Page 

Description: The purpose of this feature is to test Card Number Textfield
 
#Data-Driven Testing in Cucumber using Scenario Outline  

Background: User is Logged In and Add product to bag 

	Given  User is on Chrome Browser 
	 When  Enter URL for the Website 
	 Then  Page Navigate to Home Page 
	
	Then  Move cursor to profile 
	 And  Click on login/Signup 
	 And  Enter mobile number and Click on Continue 
	 But  User credentials are wrong 
	Then  Click on Forgot PasswordLink            
	
	# Parameterization without Example Keyword
	
     And  Enter validEmail "vvnarayana2503@gmail.com" 
	 And  Enter validPassword "Narayana@98" 
	When  User Click on LOG IN 
	Then  Page Navigate to Home Page 
	
	When  User Move cursor to Essentials 
	 And  Click on any one category 
	Then  Page Navigate to Essentials Page 
	
	 And   Move cursor to any one product 
    When  Click on WISHLIST
    And  Move cursor to Profile and Click on Wishlist
    And  Click on MOveToBag Select Size and Click on Done
    
	When  User Click on Bag
	Then  Page Navigate to Bag page
	 
	 And  Click on PLACE ORDER
	Then  Page Navigate to Address Page
	
	 And  Click on CONTINUE 
	Then  Page Navigate to Payment Page
	
@InvalidCreditCard
Scenario Outline: Order placement using CREDIT/DEBIT card payment option 

    When  User Click on CREDIT/DEBIT card field  
          
     # Parameterization with Example Keyword
     
	Then  Enter InvalidCardNumber "<cardNumber>" 
	 And  Enter validCardName "<cardName>" 
	Then  Error Message should display under CardNumber Textfield
	 
	Examples:
    | cardNumber                            | cardName    |Cvvnumber|
    | 9871 3122 3143 4342 354               | Gowthamsai  |456      | 
    | 9876 1354 2734 5682 1452 14           | Gowthamsai  |456      |  
    
   # Bug found in 2nd Invalid input data
    
    
    
    