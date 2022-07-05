package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchWebsite {
  @Test
  public void KiteLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  System.out.println("This is Kite Login");//Print statment on cosole window
  }
  @Test
  public void FlipkartLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  Reporter.log("This is Flipkart Login",true);//print Statment on cosole window as well as emailable and index report also
	  System.out.println("This is Flipkart Login");
  }
  @Test
  public void AmazonLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=6304124364617682133&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062089&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAjwtIaVBhBkEiwAsr7-c_yzxGHUphOr06tPrCsnoYwubvxGz7-fes3m7j0ypATVOn87DYNWnhoC9_gQAvD_BwE");
	  Reporter.log("This is amazon Login",true);
  }
}
