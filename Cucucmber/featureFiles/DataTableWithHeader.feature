@DataDriven
Feature: DataTable with header
Scenario: This is login scenario
	Given Go to login page
	When enter below credentials 
	|Username|Password|
	|Admin   |admin123|
	And click login button
	