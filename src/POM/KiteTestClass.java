package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://kite.zerodha.com/");
		
		//login Page
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendpassWord();
		login.sendUserID();
		login.ClickOnLoginButton();
		
		//Pin Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KitePinPage pin=new KitePinPage(driver);
		pin.SendPin();
		pin.ClickContinueButton();
		
		//Home Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KiteHomePage home=new KiteHomePage(driver);
		home.UserIDValidation();
		home.logout();
		
		//close browser
		driver.close();
				
	}

}
