package pomWithExcelForloop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass_OneForLoop {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://kite.zerodha.com/");
		
		//excelReading
		File Myfile=new File("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Kite ID Reading\\Kite UserID.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		int TotalRowCount = Mysheet.getLastRowNum();
		System.out.println(TotalRowCount);
		
		for(int i=1;i<=TotalRowCount;i++)
		{
		String userid = Mysheet.getRow(i).getCell(1).getStringCellValue();
		String password = Mysheet.getRow(i).getCell(2).getStringCellValue();
		String kpin = Mysheet.getRow(i).getCell(3).getStringCellValue();
		System.out.println("=============================");
		System.out.println(i);
		//login Page
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserID(userid);
		login.sendpassWord(password);
		login.ClickOnLoginButton();
		
		
		//Pin Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KitePinPage pin=new KitePinPage(driver);
	    pin.SendPin(kpin);
	    pin.ClickContinueButton();
		
		//Home Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KiteHomePage home=new KiteHomePage(driver);
		home.UserIDValidation(userid);
		home.logout();
		
		//login Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Change user")).click();
		Thread.sleep(2000);
		
		}
		//close browser
		Thread.sleep(3000);
		driver.close();
				
	
	}
}
