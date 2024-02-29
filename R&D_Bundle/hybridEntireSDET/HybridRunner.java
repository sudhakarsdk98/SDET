package hybridEntireSDET;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "", 
		features = {
		"F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\FeatureFiles\\NCLoginTS.feature",
		"F:\\Eclipse workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\FeatureFiles\\NCLoginTS2.feature" },
		glue = "hybridEntireSDET",

		plugin = { "pretty", "html:TestNG-Cucumber-testReports.html" })

public class HybridRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
