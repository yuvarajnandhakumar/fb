package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.Locators.fbpage;
import org.commonfunction.Commonactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class facebook  extends Commonactions{

	Commonactions ca = new Commonactions();
	fbpage fb = new fbpage();

	By uname = By.xpath("//input[@id='email']");
	By Pwd = By.xpath("//input[@type='password']");

	
	@Given("User launch fb")
	public void user_launch_fb() throws InterruptedException {
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	
	}

	@And("user enters {string} and {string}")
	public void user_enters_and(String unaming, String securedpwd) throws InterruptedException {

		//driver.findElement(uname).sendKeys(unaming);
		ca.insertText(fb.getUname(), unaming);
		ca.eletobewait();
		ca.insertText(fb.getPwd(), securedpwd);	
		ca.eletobewait();
	}


	@Then("user click submit button")
	public void user_click_submit_button() {

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login button clicked");
		driver.quit();
	}
	
	
	
	/*
	@Given("launching chrome browser")
	public void launching_chrome_browser() throws InterruptedException {

		launch("https://fb.com");
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);


	}

	@Given("User launches fb")
	public void user_launches_fb() throws InterruptedException {
		launch("https://fb.com");
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	
	}

	
	@And("Verify the Title")
	public void verify_the_Title() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();
	}

	@When("User enters uname")
	public void user_enters_uname() throws InterruptedException {
		//driver.findElement(uname).sendKeys("yuvarajnandhak@gmail.com");
		Thread.sleep(1000);

	}

	@And("user enters pwd")
	public void user_enters_pwd() throws InterruptedException {
		//driver.findElement(Pwd).sendKeys("passwordone");
		Thread.sleep(1000);
	}

	
	@Given("User launches Flipkart site")
	public void User_launches_Flipkart_site() {
		launch("http://flipkart.com");
		System.out.println("flipkart launched");
		driver.quit();
	}


	@Then("user enter username as {string} and password {string}")
	public void user_enter_username_as_and_password(String uname1, String pwd) throws InterruptedException {

		//driver.findElement(uname).sendKeys(uname1);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(1000);

	}

	@Then("user enter username and password")
	public void user_enter_username_and_password(DataTable twomap) throws InterruptedException {
		List<Map<String, String>> MM = twomap.asMaps();



		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(MM.get(1).get("uname"));   
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(MM.get(0).get("pwd")); 
		Thread.sleep(1000);

	}*/







}
