Feature: This is the login feature for HRM
Scenario: This is login scenrio
	Given user is in login page
	When user enters valid username and password
	And clicks on login button
	Then user is navigated into Home page
	