package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\FeatureFiles",
		glue = "cucumber",
		
		plugin = {"pretty", "html:NCReports.html"}
		
		)









public class TestFeatureRunner {

}
