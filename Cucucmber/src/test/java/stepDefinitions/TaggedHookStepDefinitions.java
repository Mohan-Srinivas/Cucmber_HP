package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHookStepDefinitions 
{
	@Given("^This is the First Step$")
	public void this_is_the_First_Step() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is the First Step");
	}

	@When("^This is the Second Step$")
	public void this_is_the_Second_Step() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is the second Step");
	}

	@Then("^This is the Third Step$")
	public void this_is_the_Third_Step() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is the Third Step");
	}
}
