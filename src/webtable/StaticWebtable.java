package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vctcpune.com/selenium/practice.html");
		
        //print Title of the table
		List<WebElement> Title = driver.findElements(By.xpath("//table[@class='table-display']//tr/th"));
		int NoOfColumns = Title.size();
		System.out.println("No. of Columns are "+NoOfColumns);
		for (WebElement th:Title)
		{
			String Header = th.getText();
			System.out.print(Header+" || ");
		}
		System.out.println();
		//Print Rows
		List<WebElement> row4 = driver.findElements(By.xpath("//table[@class='table-display']//tr[4]"));
		for (WebElement r:row4)
		{
			System.out.println(r.getText()+ " || ");
		}
		
		//Find no. of Rows in Table
		 List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		 int TotalNoOfRows = rows.size();
		 System.out.println("Total No. of Rows are "+TotalNoOfRows);
		 
		 //total no. columns
		 List<WebElement> head = driver.findElements(By.xpath("//th"));
		 System.out.println("Total no. of columns are "+head.size());
		 
		 
		 //Print full table
		 for(int i=1;i<=TotalNoOfRows;i++)
		 {
			 for(int j=1;j<=NoOfColumns;j++)
			 {
				 if(i==1)
				 {
				 String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
				 System.out.print(text+" || ");
				 }
				 else
				 {
					 String text = driver.findElement(By.xpath("//table//tr["+i+"]/td["+j+"]")).getText();
					 System.out.print(text+ " || ");
				 }
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		driver.quit();
	}

}
