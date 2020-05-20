Feature: Validating Sorted price products  

Description: The purpose of this feature is to test Sorted prices and Parameterization using Excel Files

#Data-Driven Testing in Cucumber using External Files 
 
Background: User is Logged In

	Given  User is on Chrome Browser 
	 When  Enter URL for the Website 
	 Then  Page Navigate to Home Page 	
	 Then  Move cursor to profile 
	 And  Click on login/Signup 
	 And  Enter mobile number and Click on Continue 
	 But  User credentials are wrong 
	Then  Click on Forgot PasswordLink 

	 And  Enter validEmail  
	 And  Enter validPassword 
	When  User Click on LOG IN 
	Then  Page Navigate to Home Page 
	
	When  User Move cursor to Essentials 
	 And  Click on any one category 
	Then  Page Navigate to Essentials Page 
	
	
@lowToHigh	
Scenario: Validating Low To High sorted prices 

    When  Place the cursor on SORT BY 
     And   Click on LOW TO HIGH
    Then   Validate Sorted prices
     
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
	
    When   User Click on CREDIT/DEBIT card field 
	Then  Enter valid CardNumber  
	 And  Enter valid CardName 
	 And  Click on Expiry month dropdown and Select month 
	 And  Click on Expiry year and Select year 
	  And  Enter valid Cvv 
	 And  Click on PAY NOW button
	Then  Page Navigate to Payment Processing Page
	
	Then  Navigate to Home Page and LogOut 

@HighToLow	
Scenario: Validating High To Low sorted prices 

    When  Place the cursor on SORT BY 
     And   Click on HIGH TO LOW
     And   Validate Sorted prices
     
     And  Move cursor to any product 
	When  Click WISHLIST
    And  Move cursor to Profile and Click on Wishlist
    And  Click on MOveToBag Select Size and Click on Done
    
	When  User Click on Bag
	Then  Page Navigate to Bag page
	 
	 And  Click on PLACE ORDER
	Then  Page Navigate to Address Page
	
	 And  Click on CONTINUE 
	Then  Page Navigate to Payment Page
	
    When   User Click on CREDIT/DEBIT card field 
	Then  Enter valid CardNumber  
	 And  Enter valid CardName 
	 And  Click on Expiry month dropdown and Select month 
	 And  Click on Expiry year and Select year 
	  And  Enter valid Cvv 
	 And  Click on PAY NOW button
	Then  Page Navigate to Payment Processing Page
	
	Then  Navigate to Home Page and LogOut 

		
    
    
