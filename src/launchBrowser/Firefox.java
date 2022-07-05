package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Sanket\\Testing\\Automation Testing\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.google.co.in/");
		driver.close();
		

	}

}
