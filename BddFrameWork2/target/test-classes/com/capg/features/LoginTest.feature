Feature: User login
user should able to login with vaild data
#this is withod examples keyword
#Scenario: testing login with vaild data
#Given user is on home page
#When i have on login page
#Then user enter "9182681329" and "nikitha123"
#And user click on login button
#Then validate the scenario



#with examples keyword
#Scenario Outline: testing login with vaild data
#Given user is on home page
#When i have on login page
#Then user enter "<username>" and "<password>"
#And user click on login button
#Then validate the scenario
#
#Examples:
#
#|username                 | password|
#|9182681329               |nikitha123|
#|sheela.nikitha@gmail.com |nikitha123|
 
 
 #with using table
 Scenario: testing login with vaild data
Given user is on home page
When i have on login page
Then user enter username and password
|9182681329|nikitha123|
And user click on login button
Then validate the scenario
 
