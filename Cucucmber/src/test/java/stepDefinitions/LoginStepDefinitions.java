package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions 
{
	WebDriver driver;
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user is navigated into Home page$")
	public void user_is_navigated_into_Home_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		/*
		 * String currentUrl=driver.getCurrentUrl();
		 * if(currentUrl.contains("dashboard")) {
		 * System.out.println("user is in home screen"); } else
		 * System.out.println("user not in home screen");
		 */
		boolean status=driver.findElement(By.linkText("Welcome Muhammad")).isDisplayed();
		Assert.assertTrue(status);
	}
}
