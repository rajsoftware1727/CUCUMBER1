package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {
	
	@Given("am raj")
	public void am_raj() {
		
		System.out.println("raj");
	    
	}

	@When("am raj1")
	public void am_raj1() {
		
		System.out.println("raj");

	     
	}

	@Then("am raj2")
	public void am_raj2() {
		System.out.println("raj");

	}

	@Then("raj3")
	public void raj3() {
		
		System.out.println("raj");

	     
	}


}
