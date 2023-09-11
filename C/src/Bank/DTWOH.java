package Bank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DTWOH {
	
	WebDriver driver;
	
	@Given("raj goto website")
	public void raj_goto_website() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	    
	}

	@When("raj enter uname and pwd")
	public void raj_enter_uname_and_pwd(DataTable dataTable) {
		
		List<List<String>> data=dataTable.asLists(String.class);
		String uname=data.get(0).get(0);
		String pwd=data.get(0).get(1);
	    driver.findElement(By.name("uid")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("raj click login")
	public void raj_click_login() {
		
		driver.findElement(By.name("btnLogin")).click();
	     
	}

	@Then("raj able to login")
	public void raj_able_to_login() {
		
		System.out.println("success");
		driver.quit();
	    
	}

}
