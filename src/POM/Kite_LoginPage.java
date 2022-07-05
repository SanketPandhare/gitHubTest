package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage 
{
	
	//data members/ Variables
	@FindBy(id="userid") private WebElement UserID1;//import FindBy,Webelement from selenium
	@FindBy(id="password") private WebElement Password1; 
	@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;
	
	//Constructor
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void sendUN()
	{
	UserID1.sendKeys("OZ0054");
	}
	public void sendPWD()
	{
	Password1.sendKeys("mitmitmit");
	}
	public void loginButton()
	{
	SubmitButton.click();
	}
	

}
