package org.stepdefinition;

import java.util.List;

import org.commonfunction.Commonactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MakeMyTrip extends Commonactions{
	
	@Given("Launch Makemytrip")
	public void launch_Makemytrip() {
	    driver.manage().window().maximize();
	    System.out.println("chrome maximized");
	}

	@Then("Fetch the values of Location, Flight details and Print in console")
	public void fetch_the_values_of_Location_Flight_details_and_Print_in_console() {
		
		List<WebElement> listofele = driver.findElements(By.xpath("//main[@class='landingContainer']/div[3]//div/p/p"));
		for (WebElement eachvalue : listofele) {
			String text = eachvalue.getText();
			if(text.contains("Flights"))
			{
			String[] split = text.split(",");
			System.out.print(split[1]+"-");
			System.out.print(split[2]+"");
			System.out.println();
			}
			else
			{
			System.out.print(text+"-");
			}
		}
	
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		driver.quit();
	  
	}

}
