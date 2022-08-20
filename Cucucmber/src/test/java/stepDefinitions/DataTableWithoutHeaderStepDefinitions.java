package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderStepDefinitions 
{
	WebDriver driver;
	@Given("^You are in the login page$")
	public void you_are_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^You enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable dataTable) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> credentials=dataTable.asList(String.class);
		String userName=credentials.get(0);
		String passWord=credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

	}
	@When("^You click the login button$")
	public void you_click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	/*
	 * @Then("^You should navigated into the Home page$") public void
	 * you_should_navigated_into_the_Home_page() throws Throwable { // Write code
	 * here that turns the phrase above into concrete actions
	 * 
	 * }
	 */
}
