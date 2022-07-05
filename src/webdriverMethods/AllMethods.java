package webdriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sanket\\Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		
		//driver.close();
		Thread.sleep(3000);
		
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		String TitleOfPage = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(TitleOfPage);
		System.out.println(url);
		
	    String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String expectedUrl = "https://kite.zerodha.com/";
		
		if(TitleOfPage.equals(expectedTitle))
		{
			System.out.println("Title of the Page is Match");
		}
		else
		{
			System.out.println("Title of the Page is not Match");
		}
		
		if(url.equals(expectedUrl))
		{
			System.out.println("Current url is Match");
		}
		else
		{
			System.out.println("Current Url is not match");
		}
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		}
}

