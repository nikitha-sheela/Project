Feature: User login
user should able to login with vaild data

#with using table
 Scenario: testing login with vaild data
Given user is on home page
When i have on login page
Then user enter username and password
|username|password|
|9182681329|nikitha123|
|sheela.nikitha@gmail.com|nikitha123|
And user click on login button
Then validate the scenario
 