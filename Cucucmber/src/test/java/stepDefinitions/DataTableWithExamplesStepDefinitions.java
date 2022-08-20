package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExamplesStepDefinitions 
{
	WebDriver driver;
	@Given("^Proceed to login page$")
	public void proceed_to_login_page() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Give Datatable credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void give_Datatable_credentials_and(String userName, String passWord) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

	}

	@When("^click the button named as Login$")
	public void click_the_button_named_as_Login() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}


}
