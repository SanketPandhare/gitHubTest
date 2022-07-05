package scrollingStudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		System.out.println(driver.manage().window().getPosition());
		
		//To set Position--> use Point class and create object of Point class
		Point p=new Point(-800,500);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
	
	}

}
