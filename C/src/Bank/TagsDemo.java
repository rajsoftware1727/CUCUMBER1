package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsDemo {
	
	
	@Given("First")
	public void first() {
		
		System.out.println("first");
	    
	}

	@When("Second")
	public void second() {
		System.out.println("second");

	     
	}

	@Then("Third")
	public void third() {
		
		System.out.println("three");

	    
	}

	@Given("four")
	public void four() {
		
		System.out.println("four");

	     
	}

	@When("five")
	public void five() {
		
		System.out.println("five");

	    
	}

	@Then("six")
	public void six() {
		
		System.out.println("six");

	     
	}

	@Given("seven")
	public void seven() {
		
		System.out.println("seven");

	    
	}

	@When("eight")
	public void eight() {
		System.out.println("eight");

	}

	@Then("nine")
	public void nine() {
		
		System.out.println("nine");

	     
	}


}
