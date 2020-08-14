package org.stepdefinition;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;

public class HtmlReporter {
	private ExtentReports extentreport;
	private ExtentHtmlReporter extendhtmlreports;

	public HtmlReporter(String location) {
		extendhtmlreports= new ExtentHtmlReporter(location);
		extentreport = new ExtentReports();
		extentreport.attachReporter(extendhtmlreports);

	}

	public void createTest(Scenario scenario)
	{
		if(scenario !=null)
		{
			String testName=scenariotitle(scenario);
					switch(scenario.getStatus())
					{

					case PASSED:
						extentreport.createTest(testName).pass("scenario passed");
						break;
						
					case FAILED:
						extentreport.createTest(testName).fail("scenario failed");
						break;
					default:
						extentreport.createTest(testName).skip("skipped");
						break;
					}	}
	}
	
	public void writetoreport(){
		if(extentreport !=null)
		{
			extentreport.flush();
		}
	}
	
	private String scenariotitle(Scenario scenario)
	{
		return scenario.getName().replaceAll(" ", "");
	}

}
