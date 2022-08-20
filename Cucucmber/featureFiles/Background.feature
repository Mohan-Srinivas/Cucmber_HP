@BackgroundExample
Feature: To explain the usage of Background
		
	Background: Student completed School Education
	Given Student has finished high school
	Given Student has finished higher Secondary  school
	
Scenario: To Study Medicine
	Given The Student applies for the medical course
	When the Student cleared the Entrance Exam
	Then the Student is elligible for joining any medical Institute
	
Scenario: To Study Engineering
	Given The Student applied for the Engineering course
	When the Student has a sayable cut off
	Then the Student is elligible for joining any Engineering Institute
	