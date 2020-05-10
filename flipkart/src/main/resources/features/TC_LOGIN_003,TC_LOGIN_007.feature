Feature: User login 
Scenario Outline: user should able to login with vaild data(phonenumber,email) 
	Given Open the Browser 
	When Enter the URL 
	And Get the Title of the page 
	Then User Navigates to Home Page 
	And  User click on loginlink 
	Then User Navigated to login popup 
	Then user enter "<username>" and "<password>" 
	And  Click on Login Button 
	Then user click on logout 
	Then close browser 
	
	
	Examples: 
	
		|username                 | password|
		|9182681329               |nikitha123|
		|sheela.nikitha@gmail.com |nikitha123| 
		
		
		
		