package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
	features = {".\\src\\test\\java\\Features"},
	glue = { "StepDefinitions" }, // path of step definition
	plugin = { "pretty", "html:test-output", "junit:junit_xml/junit.xml",
    "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html "  },
	monochrome = true,
	dryRun = false, // check all the steps have the definitions and will not execute
	strict = true, // check if any step is not defined in step definition file
	tags = {"@ADD"}
)

/*
 * to run addition : @ADD
 * to run subtraction : @SUB
 * to run all : @Regression
 * */


public class RunnerClass extends AbstractTestNGCucumberTests {

}
