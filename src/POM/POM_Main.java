package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://kite.zerodha.com/");//Launch kite
		
		//login page
		Kite_LoginPage login=new Kite_LoginPage(driver);
		login.sendUN();
		login.sendPWD();
		login.loginButton();
		
		//Pin Page-2 elements
		pin_page pin1=new pin_page(driver);
		pin1.pin();
		pin1.button();
		
		//Home/Logout Page-3 elements
		logOut logOut1=new logOut(driver);
		logOut1.validateUID();
		logOut1.UID();
		logOut1.logout();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
