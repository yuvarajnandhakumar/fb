package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features/fb.feature",
                  glue="com.telecom.stepdefinition",
                  dryRun=false,
                  plugin={"html:target//Cucumber-html-reports","json:target/reports.json"},
                  monochrome=true
                  )


public class TestRunner {

	
	
}
