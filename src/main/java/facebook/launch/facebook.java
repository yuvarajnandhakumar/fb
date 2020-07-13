package facebook.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook {
	
	public static WebDriver driver;
	@Given("User launches ChromeBrowser")
	public void user_launches_ChromeBrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
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
	}

	@When("User enters uname")
	public void user_enters_uname() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yuvarajnandhak@gmail.com");
		Thread.sleep(1000);
		
	}

	@And("user enters pwd")
	public void user_enters_pwd() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passwordone");
		Thread.sleep(1000);
	}

	@Then("user click submit button")
	public void user_click_submit_button() {
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login button clicked");
	}


}
