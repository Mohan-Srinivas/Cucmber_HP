@SimpleLogin
Feature: Simple Login Feature

@Positive @DataDriven
Scenario: Positive Tesing
	Given user is entering google.co.in
	When user is type the Search term as "Thor"
	And Enters return key
	Then user should see the Search Results
@Negative	
Scenario: Negative Testing
	Given user is entering google.co.in
	When user is type the Search term as "Thor"
	And Enters return key
	Then user should see the Search Results