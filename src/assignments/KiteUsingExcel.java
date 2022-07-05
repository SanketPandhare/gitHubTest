package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Sanket\\\\Testing\\\\Automation Testing\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Data Reading using Excel
        File MyFile=new File("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Kite ID Reading\\Kite UserID.xlsx"); 
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		int LastRowNo = Mysheet.getLastRowNum();
		short LastCellNo = Mysheet.getRow(LastRowNo).getLastCellNum();
		System.out.println(LastRowNo);
		System.out.println(LastCellNo);
		for(int i=1;i<=LastRowNo;i++)
		{
		String UserID1 = Mysheet.getRow(i).getCell(1).getStringCellValue();
		String Password1=Mysheet.getRow(i).getCell(2).getStringCellValue();
		String Pin1=Mysheet.getRow(i).getCell(3).getStringCellValue();
		
		
		//Login Page
		driver.get("https://kite.zerodha.com/");//Launch kite
        WebElement UserID = driver.findElement(By.id("userid"));
        UserID.sendKeys(UserID1);
        Thread.sleep(2000);
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(Password1);
        Thread.sleep(2000);
        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginButton.click();
        
        //Pin Page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Pin = driver.findElement(By.id("pin"));
        Pin.sendKeys(Pin1);
        Thread.sleep(2000);
        WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
        ContinueButton.click();
        
        //userID
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
        String ActualID = ID.getText();
        String ExpectedID = UserID1;
        if(ActualID.equals(ExpectedID))
        {
        	System.out.println("Test Case"+i+ "th Passed");
        }
        else 
        {
        	System.out.println("Test Case"+i+ "th Failed");
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
		driver.findElement(By.linkText("Change user")).click();
		
			}
		
		//Quite Browser
		driver.quit();
	}

}
