package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Login Page
		driver.get("https://kite.zerodha.com/");//Launch kite
        WebElement UserID = driver.findElement(By.id("userid"));
        UserID.sendKeys("OZ0054");
        Thread.sleep(2000);
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("mitmitmit");
        Thread.sleep(2000);
        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginButton.click();
        
        //Pin Page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Pin = driver.findElement(By.id("pin"));
        Pin.sendKeys("228022");
        Thread.sleep(2000);
        WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
        ContinueButton.click();
        
        //userID
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
        String ActualID = ID.getText();
        String ExpectedID = "OZ0054";
        if(ActualID.equals(ExpectedID))
        {
        	System.out.println("Test Case Passed");
        }
        else 
        {
        	System.out.println("Test Case Failed");
        }
		
		//Logout
        ID.click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement logOut = driver.findElement(By.xpath("//a[@target='_self']"));
        Thread.sleep(2000);
		logOut.click();
		
		//Stop Page
		Thread.sleep(4000);
		
		//Quite Browser
		driver.quit();
			
	}

}
