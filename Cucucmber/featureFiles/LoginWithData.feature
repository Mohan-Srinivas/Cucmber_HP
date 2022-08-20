Feature: This is the login feature for HRM
Scenario: This is login scenario
	Given user is in  the login page
	When user enters valid credentials "Admin" and "admin123"
	And clicks on the login button
	Then user is navigated into the Home page
	