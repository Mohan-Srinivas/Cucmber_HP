package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionStepDefinitions 
{
	@Given("I have (\\d+) Laptop")
	public void I_have_1_Laptop(int count)
	{
		System.out.println("Laptop Count "+count);
	}
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float cgpa) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("CGPA scored "+cgpa);
	}

	@Given("\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1 +" is elder to "+arg2+" and "+arg3);
	}

	

}
