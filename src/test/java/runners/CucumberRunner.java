package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepDefinitions","hook"},
              features= {"./src/test/java/features"},
                 plugin={"rerun:target/rerun.txt",
		                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	                     "junit:reports/Cucumber.xml"})
public class CucumberRunner extends AbstractTestNGCucumberTests
{

}
