@DataDriven
Feature: DataTable Without header
Scenario: This is login scenario
	Given You are in the login page
	When You enter the below credentials 
	|Admin|admin123|
	And You click the login button
	#Then You should navigated into the Home page
	