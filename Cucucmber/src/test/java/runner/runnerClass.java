package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "featureFiles/TaggedHook.feature",
			glue={"stepDefinitions","hooksPackage"} ,
			plugin = {"pretty", "html:target/cucumber-reports/"} ,
			strict=false ,
			dryRun=false ,
			monochrome=true 
			//tags={"@SimpleLogin","@DataDriven"}  //And Condition
			//tags= {"@SimpleLogin,@DataDriven"} Or Condition
			//tags= {"@BackgroundExample"}
		)
public class runnerClass 
{
	//It Should combine the feature file and Step definition 
	// need to define RunnerClass
	

}
