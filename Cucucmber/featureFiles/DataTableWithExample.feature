@DataDriven
Feature: DataTable With Examples Keyword
Scenario Outline: This is login scenario
Given Proceed to login page
When Give Datatable credentials "<Username>" and "<Password>"
And click the button named as Login

Examples: 
|Username | Password|
|Admin    | admin123|	
|Admin	  | admin   |