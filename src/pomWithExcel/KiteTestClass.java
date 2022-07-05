package pomWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Sanket\\\\\\\\Testing\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://kite.zerodha.com/");
		
		//excelReading
		File Myfile=new File("C:\\Sanket\\Testing\\Automation Testing\\Assignment\\Kite ID Reading\\Kite UserID.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		String userid = Mysheet.getRow(1).getCell(1).getStringCellValue();
		String password = Mysheet.getRow(1).getCell(2).getStringCellValue();
		String kpin = Mysheet.getRow(1).getCell(3).getStringCellValue();
		
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
		
		//close browser
		Thread.sleep(5000);
		driver.close();
				
	}

}
