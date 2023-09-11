package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemo {
	
	
	@Given("machi good")
	public void machi_good() {
	     System.out.println("machi good");
	}

	@Then("machi semma")
	public void machi_semma() {
	     System.out.println("machi semma");
	}

	@Given("Hai")
	public void hai() {
		
		System.out.println("hai");
	     
	}

	@When("Oii")
	public void oii() {
	     System.out.println("oii");
	}

	@Then("wow")
	public void wow() {
		System.out.println("wow");
	     
	}

	@Given("super")
	public void super1() {
	    System.out.println("super");
	}

	@When("good")
	public void good() {
	     System.out.println("good");
	}

	@Then("very good")
	public void very_good() {
	     System.out.println("very good");
	}

}
