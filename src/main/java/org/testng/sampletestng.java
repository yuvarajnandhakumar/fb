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

public class sampletestng {



	public static WebDriver driver;


	By uname = By.xpath("//input[@id='email']");
	By Pwd = By.xpath("//input[@type='password']");

	
	
	@Parameters("url")
	@BeforeClass
	public static void launch1(String url) {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	@Test
	public void run1()
	{
	driver.findElement(Pwd).sendKeys("asdff123");
	System.out.println("pwd is entered");
}
	
	
	@Test ()
	public void run2()
	{
		driver.findElement(uname).sendKeys("yuva@gmail.com");
		System.out.println("test2");


	}
	
}

