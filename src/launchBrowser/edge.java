package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Sanket\\Testing\\Automation Testing\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}

}
