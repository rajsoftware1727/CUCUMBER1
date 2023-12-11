package Bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo {
	
	WebDriver driver;
	
	@Given("aki goto bank website")
	public void aki_goto_bank_website() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demo.guru99.com/V4/");
 	     
	}

	@When("aki enter valid uname as {string} and valid pwd as {string}")
	public void aki_enter_valid_uname_as_and_valid_pwd_as(String string, String string2) {
		
		driver.findElement(By.name("uid")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	     
	}

	@Then("aki click enter button")
	public void aki_click_enter_button() {
		
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("aki goto login page")
	public void aki_goto_login_page() {
		
		System.out.println("success");
	     
	}


}
