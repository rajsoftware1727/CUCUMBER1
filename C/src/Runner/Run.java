package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/Background.feature",glue={"Bank","HookDemo"}
 
		)


public class Run {
	
	

}


/*plugin= {"pretty", "json:target/cucumber-reports/Cucumber.json",
"junit:target/cucumber-reports1/Cucumber.xml",
"html:target/cucumber-reports2"}*/