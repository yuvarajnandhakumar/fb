package org.stepdefinition;

import org.commonfunction.Commonactions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	private static HtmlReporter HtmlReporter;
	private static boolean isreporterrunning;
	
	@Before
	public void beforeScenario() {
		
		
		ca.launch("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		System.out.println(" before  hooks");

	}
		
	@After
	public void afterScenario() {
		
		System.out.println(" after  hooks");

	}
	
	@Before
	public void beforescenario(Scenario scenario)
	{
		if(!isreporterrunning)
		{
			HtmlReporter = new HtmlReporter(".\\target\\extentreport.html");
			isreporterrunning = true;
		}
	}
	
	@Before
	public void afterscenario(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			System.out.println("take screenshot");
		}
		HtmlReporter.createTest(scenario);
		HtmlReporter.writetoreport();
	}

}
