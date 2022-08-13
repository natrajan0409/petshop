package runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/petshop/feature", 
glue = "stepdefinition", monochrome = true, dryRun = false,
tags= "@TEST001",
		plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json",
				"rerun:target/failedtestcase.txt" })

public class junitrunnerclass  {

	
	@AfterClass
	public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/extent-config.xml"));

}

}
