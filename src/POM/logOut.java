package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut {
	
	
	//element
	@FindBy(xpath="//span[@class='user-id']") private WebElement UID;
	@FindBy (xpath="//a[@target='_self']") private WebElement logout;
	
	//constructor
	public logOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void validateUID()
	{
		String ActualUID = UID.getText();
		String ExpectedUID = "OZ0054";
		if(ActualUID.equals(ExpectedUID))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
	}
	
	public void UID()
	{
		UID.click();
	}
	public void logout() 
	{
		logout.click();
	}
	
	
	
	
	

}
