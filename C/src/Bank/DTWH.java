package Bank;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DTWH {
	
	WebDriver driver;
	
	@Given("Aki goto website")
	public void aki_goto_website() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	     
	}

	@When("Aki enter uname and password as follows")
	public void aki_enter_uname_and_password_as_follows(DataTable dataTable) {
		
		List<Map<String, String>> data=dataTable.asMaps(String.class,String.class);
		
		String uname=data.get(0).get("uname");
		String pwd=data.get(0).get("pwd");
		
		driver.findElement(By.name("uid")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	     
	}

	@Then("Aki click login")
	public void aki_click_login() {
		driver.findElement(By.name("btnLogin")).click();

	}

	@Then("Aki goto login page")
	public void aki_goto_login_page() {
		
		System.out.println("success");
		driver.quit();
	     
	}

}
