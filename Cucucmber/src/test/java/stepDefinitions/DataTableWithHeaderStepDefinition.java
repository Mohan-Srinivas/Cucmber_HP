package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderStepDefinition 
{
	WebDriver driver;
	@Given("^Go to login page$")
	public void go_to_login_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^enter below credentials$")
	public void enter_below_credentials(DataTable dataTable) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> keyValuePair=dataTable.asMaps(String.class, String.class);
		String userName=keyValuePair.get(0).get("Username");
		String passWord=keyValuePair.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

	}

	@When("^click login button$")
	public void click_login_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}


}
