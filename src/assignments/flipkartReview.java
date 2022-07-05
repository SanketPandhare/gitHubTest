package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartReview {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Sanket\\Testing\\Automation Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();  
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://www.flipkart.com/");
        
        //sign in 
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9527952784");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mitmitmit");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        //Search I-Phone13 Pro
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("I-Phone 13 Pro");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //scroll upto 3rd Element
        WebElement productpath = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[1]/div[2]/div/label/span"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView;" ,productpath);
        
        //screenshot
        Thread.sleep(10000);
        File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.openqa.selenium.io.FileHandler.copy(scr1, new File ("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Flipkart Review\\Product Name.png") );
        
        //select 3rd element from Page
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro (Graphite, 1 TB)']")).click();
        
        //selection on Product
        //Switch focus of the selenium
        Set<String> IDs = driver.getWindowHandles();
        Iterator<String> it = IDs.iterator();
        String idMainPage = it.next();
        String idProductPage = it.next();
        System.out.println("Title of the Current Page is "+driver.getTitle());
        driver.switchTo().window(idProductPage);
        System.out.println("Title of the Current Page is "+driver.getTitle());
        
        //click on product
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        //TakeScreenshot
        Thread.sleep(3000);
        File reviewScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(reviewScreenshot);
        org.openqa.selenium.io.FileHandler.copy(reviewScreenshot, new File("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Flipkart Review\\review.png"));
        
        //TakeScreenshot of Element Set
        Thread.sleep(3000);
        WebElement ReviewSet = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]"));
        File scr = ReviewSet.getScreenshotAs(OutputType.FILE);
        org.openqa.selenium.io.FileHandler.copy(scr,new File("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Flipkart Review\\review set.png") );
       
        //Logout
        Actions act=new Actions(driver);
        WebElement myaccount = driver.findElement(By.xpath("//div[text()='My Account']"));
        act.moveToElement(myaccount).perform();
        Thread.sleep(3000);
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[10]/a/div"));
        act.moveToElement(logout).click().perform();
        
        //Close Browser
        driver.close();
        driver.quit();

		
	}

}
