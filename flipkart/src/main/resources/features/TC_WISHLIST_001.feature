Feature: User WISHLIST 
Scenario: AddToCart From Wishlist 
	Given Open the Browser 
	When Enter the URL 
	And Get the Title of the page 
	Then User Navigates to Home Page 
	And  User click on loginlink 
	Then User Navigated to login popup 
	Then User enter UserName and Password 
	And Click on Login Button 
	Then User Navigates to User Home Page 
	When User Mouse Hover On MyAccount 
	And  User click On Wishlistlink 
	Then User Navigates to WishlistPage 
	When User Click On Product In WishlistPage 
	Then User Navigates to Product Page 
	When User Click On AddToCart 
	Then Product should be displayed to AddToCartPage 
	Then User Logout 
	Then close browser