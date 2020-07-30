package org.stepdefinition;

import org.commonfunction.Commonactions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		
		ca.launch("http:fb.com");
		
		System.out.println(" before  hooks");

	}
	
	
	
	@After
	public void afterScenario() {
		
		System.out.println(" after  hooks");

	}

}
