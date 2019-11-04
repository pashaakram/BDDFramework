package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Edge_Networks\\EdgeNetworks\\src\\test\\java\\DMSFeatures\\07_iwoValidation.feature", //the path of the feature files
			glue={"StepDefinitions"}, //the path of the step definition files
			plugin = {"pretty:STDOUT","html:target/cucumber-pretty","json:target/cucumber.json","junit:target/cucumber.xml"}, //to generate different types of reporting
			//format= {"pretty:STDOUT","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
			tags = {"@ta","@dms"}			
			)
	 
	public class IWO_UST_TestRunner 
	{
		
		private TestNGCucumberRunner testNGCucumberRunner;
		   
		@BeforeClass(alwaysRun = true)
		public void setUpClass() {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}

		@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
		public void feature(CucumberFeatureWrapper cucumberFeature) {
			testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		}

		@DataProvider
		public Object[][] features() {
			return testNGCucumberRunner.provideFeatures();
		}

		@AfterClass(alwaysRun = true)
		public void testDownClass() {
			testNGCucumberRunner.finish();
		}
		
	}
	