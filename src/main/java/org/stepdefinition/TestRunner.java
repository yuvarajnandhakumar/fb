package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//main//resources//Feature/fb.feature",
                  glue="org.stepdefinition",
                  dryRun=false,
                  plugin={"html:target//Cucumber-html-reports","json:target/reports.json"},
                  monochrome=true
                  )


public class TestRunner {

	
	
}
