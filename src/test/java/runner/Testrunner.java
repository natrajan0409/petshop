package runner;
import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import com.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/petshop/feature",
glue= "stepdefinition",
monochrome=true,
dryRun=false,
tags= "@smoke",
plugin= {"pretty","html:target/site/cucumber-pretty",
		"json:target/cucumber.json","rerun:target/failedtestcase.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"ne:test-output-thread/"})

public class Testrunner extends  AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][]scenarios(){
		return super.scenarios();
	}
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/extent-config.xml"));
    } 
}