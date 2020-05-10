Feature: More Feature 
Background: 
	Given Open the Browser 
	When Enter the URL 
	And Get the Title of the page 
	Then User Navigates to Home Page 
	And  User click on loginlink 
	Then User Navigated to login popup 
	Then User enter UserName and Password 
	And  Click on Login Button 
	Then User Navigates to User Home Page 
	Then User Mouse Hover To More 
	
	
	#Scenario: user can see the Order issues  and status of Order 
	#	When User Click on Customer Care Link 
	#	Then User Navigates to CustomerCare Page 
	#	When User Click On Help with your order 
	#	Then User Click On product which user have a issue 
	#	Then User gets the status of the Order 
	#	Then user click on logout 
	#	Then close browser 
	#	
	#Scenario: user should be able to open FAQ's from help center 
	#	When User Click on Customer Care Link 
	#	Then User Navigates to CustomerCare Page 
	#	When User Click On Orders 
	#	Then User Click On Any FAQ's Question 
	#	Then User gets the Answer form the help center 
	#	Then user click on logout 
	#	Then close browser 
Scenario: In notification preferences  user can see the desktop notification 
	When User Click On Notification Link 
	Then User Navigates to Notifications Page 
	Then User Click On Desktop notification 
	Then User gets the desktop notification 
	Then user click on logout 
	Then close browser 
	
	
	
	