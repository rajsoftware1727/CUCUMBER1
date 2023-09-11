package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookDemo2 {
	
	@Given("tomato")
	public void tomato() {
	     System.out.println("am tomato");
	}

	@Then("brinjal")
	public void brinjal() {
	     System.out.println("am brinjal");

	}

	@Then("beans")
	public void beans() {
	     System.out.println("am beans");

	}

	@Given("Lilly")
	public void lilly() {
	     System.out.println("am lilly");

	     
	}

	@When("jasmin")
	public void jasmin() {
	     System.out.println("am jasmin");

	}

	@Then("lotus")
	public void lotus() {
	     System.out.println("am lotus");

	}

	@Given("fishfry")
	public void fishfry() {
	     System.out.println("am fishfry");

	}

	@When("chicken fry")
	public void chicken_fry() {
		
	     System.out.println("am chickenfry");

	     
	}

	@Then("sambar")
	public void sambar() {
		
	     System.out.println("am sambar");

	     
	}



}
