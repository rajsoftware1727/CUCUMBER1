package Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHook {
	
	@Given("raj")
	public void raj() {
	     
		System.out.println("raj");
	}

	@When("hr dept")
	public void hr_dept() {
	     System.out.println("hr dept");
	}

	@Then("manager")
	public void manager() {
		
		System.out.println("manager");
	     
	}

	@Given("mahi")
	public void mahi() {
		
		System.out.println("mahi");
	     
	}

	@When("it dept")
	public void it_dept() {
	     System.out.println("it dept");
	}

	@Then("deputy manager")
	public void deputy_manager() {
		
		System.out.println("deputy manager");
	     
	}

	@Given("aki")
	public void aki() {
		
		System.out.println("aki");
	     
	}

	@When("ground dept")
	public void ground_dept() {
		
		System.out.println("ground dept");
	     
	}

	@Then("Assistant manager")
	public void assistant_manager() {
		
		System.out.println("assitant manager");
	     
	}



}
