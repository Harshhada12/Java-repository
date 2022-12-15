package UpStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTestClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
                    Thread.sleep(1000);
             //reading data from excel 
         File myFile=new File("C:\\selenium\\excelsheetworkbook\\excelsheetworkbook.xlsx");
         Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet4");
         //Create object of logIN page
         UpstoxLoginPage login=new UpstoxLoginPage(driver);
         login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
         String pwd1=mySheet.getRow(0).getCell(1).getStringCellValue();
         login.sendPassword(pwd1);
         login.clickOnSignInButton();
         
          //Create an object of passcode page
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         UpStoxPasscodePge passcode=new UpStoxPasscodePge(driver);
         passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
         
         //create an object of Welcomepage
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
         UpStoxWelcomePage welcome=new UpStoxWelcomePage(driver);
         welcome.clickOnNoIamgoodButton();
         //create object of home page
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         UpStoxHomePage home=new UpStoxHomePage(driver);
         home.validateUserID(driver,mySheet.getRow(0).getCell(3).getStringCellValue());
         home.clickOnFunds();
         //Create object of funds page
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         UpStoxFundsPage funds=new UpStoxFundsPage(driver);
         funds.CheckFunds();
         home.logoutFromApplication();
         driver.close();
         
         
	}
	

}
