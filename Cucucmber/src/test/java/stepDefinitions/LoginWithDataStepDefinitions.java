package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWithDataStepDefinitions 
{
	WebDriver driver;
	@Given("^user is in  the login page$")
	public void user_is_in_the_login_page() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^user enters valid credentials \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_valid_credentials_and(String UserName, String Password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("^user is navigated into the Home page$")
	public void user_is_navigated_into_the_Home_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);
	}



}
