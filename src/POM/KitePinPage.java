package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	//element
	@FindBy(id="pin") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement continueButton;
	
	//constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void SendPin()
	{
		pin.sendKeys("228022");
	}
	
	public void ClickContinueButton ()
	{
		continueButton.click();
	}
	
	
	

}
