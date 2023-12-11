package Bank;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DTWOH1 {
	
	@Given("k goto there")
	public void k_goto_there() {
		
		System.out.println("hai1");
	     
	}

	@When("l goto follows")
	public void l_goto_follows(DataTable dataTable) {
		
		List<String> data=dataTable.asList();
		String t1=data.get(0);
		String t2=data.get(1);
		System.out.println("first one "+t1+"and "+"Second one is "+t2);

		
	    
	}

	@Then("Everybody happy")
	public void everybody_happy() {
		System.out.println("hai2");

	}

	@Then("we are also happy")
	public void we_are_also_happy() {
		System.out.println("hai3");

	}



}
