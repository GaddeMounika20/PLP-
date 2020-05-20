Feature: Ordering a product using different Payment Methods 

Description: The purpose of this feature is to test Payment Methods using Data-Driven Testing
	
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
	
	# Parameterization using Data Tables
	
	And  Enter valid Email and valid Password 
		|      Email             | Password  |
		|vvnarayana2503@gmail.com|Narayana@98|
		
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
	
@CreditCard 
Scenario Outline: Order placement using CREDIT/DEBIT card payment option 

	When  User Click on CREDIT/DEBIT card field     
	
	 # Parameterization with Example Keyword
	Then  Enter validCardNumber "<cardNumber>" 
	And  Enter validCardName "<cardName>" 
	And  Click on Expiry month dropdown and Select month 
	And  Click on Expiry year and Select year 
	And  Enter validCvv "<Cvvnumber>" 
	And  Click on PAY NOW button 
	Then  Page Navigate to Payment Processing Page 
	Then  Navigate to Home Page and LogOut 
	
	Examples: 
		| cardNumber          | cardName |Cvvnumber|
		| 4199 8100 0355 1350 | Gowtham  |654|
	#   | 4199 8100 0355 1350 | GowthamSai  |754|
		
		
@NetBanking 
Scenario: Order placement using NET BANKING payment option 
		
	When  User Click on NET BANKING 
	And  Select any one bank 
	And  Click on Net Banking PAY NOW button 
	Then  Page Navigate to Bank Page 
	Then  Navigate to Home Page and LogOut 
			
@PhonePe 
Scenario: Order placement using PHONEPE payment option 
		
	When  User Click on PHONEPE 
	And  Select Phonepe option 
	And  Click on PHONEPE PAY NOW button 
	Then  page Navigate to Phonepe page 
	Then  Navigate to Home Page and LogOut 
					
			
