package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class openGoogleStepDefinitions 
{
	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://google.co.in");
	}

	@When("^user is type the Search term as \"([^\"]*)\"$")
	public void user_is_type_the_Search_term_as(String searchTerm) throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		
	}

	@When("^Enters return key$")
	public void enters_return_key() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("^user should see the Search Results$")
	public void user_should_see_the_Search_Results() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.partialLinkText("Thor")).isDisplayed();
		if(status)
		{
			System.out.println("Results Displayed");
		}
	} 
}
