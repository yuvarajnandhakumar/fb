package org.Locators;

import java.util.List;

import org.commonfunction.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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


	@FindBy(xpath = "//a[@class='fNiv' and contains(text(), 'Home')]")
	public static WebElement Tab_Home;

	@FindBys(@FindBy(xpath="//a[@class='fNiv' and contains(text(), 'Home')]"))
	List<WebElement> allElements;

	@FindAll({@FindBy(id="email"),@FindBy(id="email1")})
	private List<WebElement> uname1;


	public List<WebElement> getUname1() {
		return uname1;
	}

	public static WebElement getTab_Home() {
		return Tab_Home;
	}

	public List<WebElement> getAllElements() {
		return allElements;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}


}



