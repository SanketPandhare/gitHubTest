package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
		
		//print Header
		List<WebElement> totalRow = driver.findElements(By.xpath("//tr"));
		int totalNoRow = totalRow.size();
		System.out.println("Total No. of Rows= "+totalNoRow);
		List<WebElement> totalRow1 = driver.findElements(By.xpath("//tr[4]"));
		for(WebElement R:totalRow1) 
		{
			System.out.println(R.getText()+" || ");
		}
		
		//Header
		List<WebElement> header = driver.findElements(By.xpath("//tr[1]//td"));
		int totalNoCl = header.size();
		System.out.println("Total No. of columns= "+totalNoCl);
		for(WebElement h:header)
		{
			System.out.print(h.getText()+" || ");
		}
		System.out.println();
		System.out.println("================================");
		//print full Table
		for(int i=1;i<=totalNoRow;i++)
		{
			for(int j=1;j<=totalNoCl;j++)
			{
				System.out.print(driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText()+" || ");
			}
			System.out.println();
		}
		System.out.println("=========================================================");
		//find element refer to Public APIs
		for (int i=1;i<=totalNoRow;i++)
		{
			String text = driver.findElement(By.xpath("//tr["+i+"]/td[1]")).getText();
			if(text.equals("Public APIs"))
			{
				 String Type = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
				 String Description = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
				 System.out.print(text+" || "+Type+" || "+Description+" || ");
				 	 
			}
		}
		
		driver.quit();
	}

}
