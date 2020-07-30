package org.Locators;

import org.commonfunction.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class fbpage extends Commonactions{
	
	public fbpage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement uname;

	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	
	}
	
	
	
