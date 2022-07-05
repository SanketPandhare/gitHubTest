package scrollingStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		System.out.println(driver.manage().window().getSize());
		
		//To set size--> use Dimension class and create object of Dimension class
		Dimension d=new Dimension(100,400);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

}
