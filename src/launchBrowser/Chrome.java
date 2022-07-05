package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sanket\\Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//To call methods,Where browser driver present.It is method to define path for driver.
		WebDriver driver=new ChromeDriver();//To Launch Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.co.in/");
		driver.close();
	}

}
