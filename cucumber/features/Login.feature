Feature: Leaftaps login functionality 

Scenario: TC001 Test login with positive credentials
Given open the chrome browser
And load the application url
And Enter the username Demosalesmanager 
And Enter the password crmsfa 
When click login button
Then HomePage should be displayed


Scenario: TC002 Test login with positive credentials
Given open the chrome browser
And load the application url
And Enter the username DemoCSR
And Enter the password crmsfa
When click login button
Then HomePage should be displayed