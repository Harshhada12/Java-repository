package NeoStoxPOMClass;

import org.testng.annotations.Test;

import NeoStoxUtility.Base;
import NeoStoxUtility.UtilityClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateNeoStoxUserName extends Base {
	NeoStoxLogInPage login;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	
	  @BeforeClass
	  public void launchNeoStox() {
		  launchBrowser();
		  login=new NeoStoxLogInPage(driver);
		  password=new NeoStoxPasswordPage(driver);
		 home=new NeoStoxHomePage(driver);
	  }
  @BeforeMethod
  public void LoginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException {
	  login.sendMobileNumber(driver, UtilityClass.readDataFromExcel(1, 0));
	  login.ClickOnSignInButton(driver);
	  Thread.sleep(1000);
	  password.SendPassword(driver, UtilityClass.readDataFromExcel(1, 1));
	  password.ClickSubmitButton(driver);
	  Thread.sleep(3000);
	  home.handlePopUP(driver);
	  Thread.sleep(1000);
  }
  @Test
  public void ValidateUserName() throws InterruptedException, IOException {
	  Assert.assertEquals(home.getUserName(driver),UtilityClass.readDataFromExcel(1, 2),"TC failed,actual and excepted User Name are not matching");
	  UtilityClass.takeScreenshot(driver,home.getUserName(driver));
	 
  }

  @AfterMethod
  public void ClickOnLogOutButton() throws InterruptedException {
	  home.LogOutFromApplication(driver);
	  Thread.sleep(1000);
	  
  }

 
  @AfterClass
  public void CloseBrowser() throws InterruptedException {
	  ClosingBrowser(driver);
  }

	
}


