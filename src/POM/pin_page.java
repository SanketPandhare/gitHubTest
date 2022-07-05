package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pin_page {
	
	
	//elements
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement Button;
	
	//constructor
	public pin_page(WebDriver driver)//Webdriver import from selenium
	{
		PageFactory.initElements(driver, this);//driver creater parameter
	}
	
	//method
	public void pin()
	{
		pin.sendKeys("228022");
	}
	public void button()
	{
		Button.click();
	}
	
	
	
	
	
	

}
