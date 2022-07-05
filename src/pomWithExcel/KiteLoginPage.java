package pomWithExcel;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//Define Element-3Elements
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void sendUserID(String Userid)
	{
		UserID.sendKeys(Userid);
	
	}
	
	public void sendpassWord(String PassWord)
	{
		passWord.sendKeys(PassWord);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	

}
