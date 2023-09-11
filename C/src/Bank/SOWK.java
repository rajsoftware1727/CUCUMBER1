package Bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SOWK {
	WebDriver driver;
	@Given("Bharu goto website")
	public void bharu_goto_website() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	     
	}

	@When("Bharu enter {string} and {string}")
	public void bharu_enter_and(String string, String string2) {
		driver.findElement(By.name("uid")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string2);
	    
	}

	@Then("Bharu click login")
	public void bharu_click_login() {

		driver.findElement(By.name("btnLogin")).click();

	     
	}

	@Then("Bharu goto login page")
	public void bharu_goto_login_page() {
		

		System.out.println("success");
		driver.quit();
	    
	}

}
