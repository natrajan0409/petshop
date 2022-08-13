package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedtestcase.txt",
dryRun=false,
monochrome=true,
plugin= {"pretty","rerun:target1/failedtestcase.txt","junit:tagre1/cucumber.xml"}
,glue= {"src\\test\\java\\Stepsdef"})

public class failedrerun {

}
