package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OPtionsDemo {
	
	@Given("goto url")
	public void goto_url() {
		
		System.out.println("goto url");
	     
	}

	@When("enter hai")
	public void enter_hai() {
		System.out.println("hai");
	    
	}

	@Then("enter something")
	public void enter_something() {
	     System.out.println("hai1");
	}

	@Then("goto something")
	public void goto_something() {
		
		System.out.println("hai2");
	     
	}

}
