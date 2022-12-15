package UpStoxPOMUsingExcel;

import org.testng.annotations.Test;

import CommonMethods.GenerelMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpStoxTestUsingTestNg {
	
	UpstoxLoginPage login;
	UpStoxPasscodePge passcode;
	UpStoxWelcomePage Welcome;
	UpStoxHomePage home;
	UpStoxFundsPage funds;
	Sheet mySheet;
	WebDriver driver;
	
	 @BeforeClass
	  public void launchBrowser() throws EncryptedDocumentException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login-v2.upstox.com/");
	        Reporter.log("Launching browser",true);
	        login=new UpstoxLoginPage(driver);
	        passcode=new UpStoxPasscodePge(driver);
	        Welcome=new UpStoxWelcomePage(driver);
	        home=new UpStoxHomePage(driver);
	        funds=new UpStoxFundsPage(driver);
 File myFile=new File("C:\\selenium\\excelsheetworkbook\\excelsheetworkbook.xlsx");
 mySheet=WorkbookFactory.create(myFile).getSheet("Sheet4");
 GenerelMethods.WaitTest(driver,1000);
 }
	 @BeforeMethod
  public void loginToUpstox() {
		 login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		 login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		 login.clickOnSignInButton();
		 Reporter.log("sending user id and password",true);
		 GenerelMethods.WaitTest(driver,2000);
		 passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		 Reporter.log("Sending passcode",true);
		GenerelMethods.WaitTest(driver,7000);
		 Welcome.clickOnNoIamgoodButton();
		 Reporter.log("clicking in I am good button",true);
		 GenerelMethods.WaitTest(driver,5000);
  }
  @Test
  public void validateUserID() throws IOException {
	  String expectedUID=mySheet.getRow(0).getCell(3).getStringCellValue();
	  String actualUserID=home.getActualUserID(driver);
Assert.assertEquals(actualUserID,expectedUID,"Actul user id is not equals to expected UserID,TCis failed");
Reporter.log("validating userName and taking screenshot",true);
GenerelMethods.takeScreenshot(driver,actualUserID);
  }

  @AfterMethod
  public void LogOutFromUpstox() throws InterruptedException {
	  home.logoutFromApplication();
	  Reporter.log("Logging out from application",true);
  }
 @AfterClass
  public void closeBrowser() {
	 driver.close();
	 Reporter.log("closing browser", true);
  }

}
