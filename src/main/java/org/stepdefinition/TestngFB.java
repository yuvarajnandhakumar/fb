package org.stepdefinition;

import org.commonfunction.Commonactions;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;

public class TestngFB extends Commonactions{
	Commonactions ca = new Commonactions();
	
	
	@BeforeClass(groups="common")
	public void setData() 
	{
		wbname="Vipin";
	}
	
	
	@Test(dataProvider="fetchDatas")
	public  void createLead(String uname, String pwd) throws InterruptedException   {
		
		ca.launch("https://fb.com");
		System.out.println("browser maximized");
		Thread.sleep(2000);	
	
		ca.insertText(driver.findElement(By.id("email")), uname);
		ca.eletobewait();
		ca.insertText(driver.findElement(By.xpath("//input[@type='password']")),pwd);	
		ca.eletobewait();
		
	}

}
