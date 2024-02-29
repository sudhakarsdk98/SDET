package cucumberXserenityStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		
//		features = {"F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\CucumberXserenityFeatures"},
//		glue = "",
//		plugin = {"pretty","html:cucumber-reportNew.html"}
//		
//		)

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = {"F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\CucumberXserenityFeatures"},
		glue = "cucumberXserenityStepDef",
		plugin = {"pretty"}
		
		)

// RUN AS mvn clean verify ///CMD project directory


public class CucumberXserenityRunner {

}
