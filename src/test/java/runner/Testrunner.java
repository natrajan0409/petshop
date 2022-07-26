package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/petshop/feature",
glue= {"stepdefinition"},
monochrome=true,
dryRun=false,

tags= "@loginuser",
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"})

public class Testrunner   {
	
}