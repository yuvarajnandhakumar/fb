package org.commonfunction;

import org.Locators.DataInputProvider;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;


public class Commonactions {
	
	public static WebDriver driver;
	public String wbname;

	public static void launch(String url) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	public void insertText(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public void button(WebElement element) {
        		
        element.click();
		
	}

	
	public void eletobewait() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	@DataProvider(name="fetchDatas")
	public String[][] getData() 
	{
	return DataInputProvider.getSheet(wbname);
	}
			
	
}
