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


	@Given("launching chrome browser")
	public void launching_chrome_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	

	}



	@Given("User launches fb")
	public void user_launches_fb() throws InterruptedException 
	{

		driver.get("https://www.facebook.com/");


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
		driver.quit();
	}

	@Given("User launches Flipkart site")
	public void User_launches_Flipkart_site() {
		driver.get("http://flipkart.com");	
		System.out.println("flipkart launched");
		driver.quit();
	}
	
	
	@Then("user enter username as {string} and password {string}")
	public void user_enter_username_as_and_password(String uname, String pwd) throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		
	}




}
