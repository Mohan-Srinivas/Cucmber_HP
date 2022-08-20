package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroungStepDefinitions
{


	@Given("^Student has finished high school$")
	public void student_has_finished_high_school() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Student finished high school");
	}
	@Given("^Student has finished higher Secondary  school$")
	public void student_has_finished_higher_Secondary_school() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Student finished higher Secondary school");
	}
	@Given("^The Student applies for the medical course$")
	public void the_Student_applies_for_the_medical_course() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The Student applies for the medical course");
	}

	@When("^the Student cleared the Entrance Exam$")
	public void the_Student_cleared_the_Entrance_Exam() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the Student cleared the Entrance Exam");
	}

	@Then("^the Student is elligible for joining any medical Institute$")
	public void the_Student_is_elligible_for_joining_any_medical_Institute() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the Student is elligible for joining any medical Institute");
	}

	@Given("^The Student applied for the Engineering course$")
	public void the_Student_applied_for_the_Engineering_course() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The Student applied for the Engineering course");
	}

	@When("^the Student has a sayable cut off$")
	public void the_Student_has_a_sayable_cut_off() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the Student has a sayable cut off");
	}

	@Then("^the Student is elligible for joining any Engineering Institute$")
	public void the_Student_is_elligible_for_joining_any_Engineering_Institute() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the Student is elligible for joining any Engineering Institute");
	}



}
