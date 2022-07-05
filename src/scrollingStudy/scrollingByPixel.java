package scrollingStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingByPixel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		//JavascriptExecutor j= ((JavascriptExecutor)driver);
		// +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 

		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		
	    j.executeScript("window.scrollBy(80,2000)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-1500)");
		Thread.sleep(2000);
		driver.quit();
		
	//	j.executeScript("window.scrollBy(40,-2000)");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
