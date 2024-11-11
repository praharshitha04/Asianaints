package runners;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepDefinitions","hook"},
               features={"./src/test/java/features"},
                 plugin={"rerun:target/rerun.txt",
		                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		                 "junit:reports/Cucumber.xml"})
public class ParallelRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount","2");
		return super.scenarios();
	}

}
