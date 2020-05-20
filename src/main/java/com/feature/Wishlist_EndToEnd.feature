Feature: Ordering a product by WISHLIST 

Description: The purpose of this feature is to test Wishlist using Data-Driven Testing
  
Background: User is Logged In

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
    
@Wishlist	
Scenario: Checking Wheather Wishlist is working or not
    
	When  Click on WISHLIST
    And  Move cursor to Profile and Click on Wishlist
    And  Click on MOveToBag Select Size and Click on Done
    
    When  User Click on Bag
	Then  Page Navigate to Bag page
	 
	 And  Click on PLACE ORDER
	Then  Page Navigate to Address Page
	
	 And  Click on CONTINUE 
	Then  Page Navigate to Payment Page
    
    When  User Click on NET BANKING 
	 And  Select any one bank 
	 And  Click on Net Banking PAY NOW button 
	Then  Page Navigate to Bank Page
   
    Then  Navigate to Home Page and LogOut