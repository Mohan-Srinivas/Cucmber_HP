package hooksPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class IamInevitableHooksThanos {
	
	  @Before public void beforeScenario() 
	  {
		  System.out.println("This will run before the every Scenario"); 
	  }
	  
	  @After public void afterScenario() 
	  {
		  System.out.println("This will run after the every Scenario"); 
	  }
	  
	  @Before("@First") 
	  public void beforeFirst()
	  {
		  System.out.println("This will run only before the First Scenario"
	  ); 
	 }
	  
	 @Before("@Second") public void beforeSecond() 
	 {
	  System.out.println("This will run only before the Second Scenario"); 
	  }
	  
	  @After("@First")
	 public void afterFirst()
	  {
		  System.out.println("This will run only after the First Scenario");
	  }
	  
	@After("@Second") public void afterSecond() {
	  System.out.println("This will run only after the Second Scenario"); }
	 }


  
  
  /*@Before(order=1) public void beforeSnap() {
  System.out.println("Thanos collecting the Infinity Stones"); }
  
  @After(order=1) public void afterSnap() {
  System.out.println("After killing half of the living things,taking rest"); }
  
  @Before(order=0) public void beforeBeforeSnap() {
  System.out.println("Thanos has to be born"); }
  
  @After(order=0) public void afterAfterSnap() {
  System.out.println("Finally Thanos is also dying "); } }
 */