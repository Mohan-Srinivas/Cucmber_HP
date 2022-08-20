package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IAmInevitable_hookStepDefinition 
{
	@Given("^Thanos has infinity Stones$")
	public void thanos_has_infinity_Stones() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos has infinity Stones");
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos snaps his fingers");
	}

	@Then("^Half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Half of the living things died");
	}


}
