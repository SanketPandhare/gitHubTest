package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplorer {

	public static void main(String [] args) {
		
		System.setProperty("webdriver.ie.driver", "");
		WebDriver driver =new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}

}
