package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.stepdefinition.RetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class priorityClass {

	public static WebDriver driver;


	By uname = By.xpath("//input[@id='email']");
	By Pwd = By.xpath("//input[@type='password']");

	
	
	//@Parameters("url")
	@BeforeClass
	public static void launch(String url) {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@BeforeMethod
	public void start()
	{
		System.out.println("start before method");
	}

	@Test()
	public void run1()
	{
		driver.findElement(Pwd).sendKeys("yuva");
		System.out.println("test1");

	}

	@Test (groups = { "dhana", "checkintest" })
	public void run2()
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.findElement(uname).sendKeys("yuva");
		System.out.println("test2");
	}
	
	/*@Test (dependsOnMethods="run1", groups = { "dhana", "checkintest" })
	public void run2()
	{
		driver.findElement(uname).sendKeys("yuva");
		System.out.println("test2");


	}*/
	
	/*@Test (retryAnalyzer = RetryAnalyzer.class,groups = { "yuva", "checkintest" })
	public void run3()
	{
		driver.findElement(By.xpath("sdf")).sendKeys("yuva");
		System.out.println("test3");
	}*/
	
	@AfterMethod
	public void end()
	{
		System.out.println("end after method");
	}

	@AfterClass
	public static void quit() {
		driver.quit();}
}
