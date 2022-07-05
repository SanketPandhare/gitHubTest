package pomWithExcel;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//element
	@FindBy(xpath="//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOut;
	
	//constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void UserIDValidation(String ExpectedUserID)
	{
		String ActualUID = UID.getText();
		String ExpectedUID = ExpectedUserID;
		
		if (ActualUID.equals(ExpectedUID))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	}
	
	public void logout() throws InterruptedException
	{
		UID.click();
		Thread.sleep(1000);
		logOut.click();
	}

}
