package org.stepdefinition;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//main//resources//Feature/MakemyTrip.feature",
glue="org.stepdefinition",
dryRun=false,
plugin={"html:target//Cucumber-html-reports","json:target//reports.json"},
monochrome=true)


public class TestRunner{


}