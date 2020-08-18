package org.stepdefinition;

import org.junit.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;

public class Reporter {
	private ExtentHtmlReporter extentHtmlReporters;
	private ExtentReports extentReporter;
	

	public Reporter(String location) {

		extentHtmlReporters = new ExtentHtmlReporter(location);
		extentReporter = new ExtentReports();
		extentReporter.attachReporter(extentHtmlReporters);
	}
	
	
	public void createTest(Scenario scenario) throws ClassNotFoundException
	{
		{
			if(scenario !=null)
			{

				String testname=scenariotitle(scenario);
				/*extentReporter.createTest(new GherkinKeyword("Given"), testname, "any").pass("m");
				extentReporter.createTest(new GherkinKeyword("And"), testname, "any").pass("m");
				extentReporter.createTest(new GherkinKeyword("Then"), testname, "any").pass("m");*/
				switch(scenario.getStatus())
				{

				case PASSED:
					extentReporter.createTest(testname).pass(" scenario get passed");
					//ExtentTest test = extentReporter.createTest("MyFirstTest");
					//test.pass("details");
					//ExtentTest feature1 = extentReporter.createTest(new GherkinKeyword("Feature"), "");
					//ExtentTest scenario1 = feature1.createNode(new GherkinKeyword("Scenario") , "");
					//ExtentTest scenario1=createNode(new GherkinKeyword("Given"), "").pass("pass");

					break;
				case FAILED:
					extentReporter.createTest(testname).fail(" scenario get failed");
					extentReporter.createTest(new GherkinKeyword("Given"), testname, "any").fail("m");

					break;
				default:
					extentReporter.createTest(testname).skip(" scenario get skipped/undefined");
					extentReporter.createTest(new GherkinKeyword("Given"), testname, "any").skip("m");

					break;

				}
			}



		}

	}



	

	public String scenariotitle(Scenario scenario)
	{
		return scenario.getName().replace(" ", "");		
	}
	
	public void writereport()
	{
		if(extentReporter !=null)
		{
			extentReporter.flush();
		}
		
	}

}
