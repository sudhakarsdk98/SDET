package cucumberRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		tags = "",
		features = "F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\FeatureFiles\\HybridNCLoginFn.feature",
		glue = "entireHybridSDET",
		
		plugin = {"pretty", "html:TestNG-Cucumber-testReports.html"}
				)


public class HybridTestRunner extends AbstractTestNGCucumberTests {

}
