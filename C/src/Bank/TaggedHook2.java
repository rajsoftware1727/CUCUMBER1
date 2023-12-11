package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHook2 {
	
	@Given("rajesh")
	public void rajesh() {
		
		System.out.println("am rajesh");
	     
	}

	@When("rajesh1")
	public void rajesh1() {
		
		System.out.println("am rajesh1");

	     
	}

	@Then("rajesh2")
	public void rajesh2() {
		
		System.out.println("am rajesh2");

	     
	}

	@Given("akila")
	public void akila() {
		
		System.out.println("am akila");

	     
	}

	@When("akila1")
	public void akila1() {
		
		System.out.println("am akila1");

	     
	}

	@Then("akila2")
	public void akila2() {
		
		System.out.println("am akila2");

	    
	}

	@Given("nishavu")
	public void nishavu() {
		
		System.out.println("am nishavu");

	     
	}

	@When("nishavu1")
	public void nishavu1() {
		System.out.println("am nishavu1");

	     
	}

	@Then("nishavu2")
	public void nishavu2() {
		
		System.out.println("am nishavu2");

	     
	}


}
