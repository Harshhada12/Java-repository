package PropertiesNeoStox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NeoStoxValidateUserNameANDBalance extends BaseNew {
	NeoStoxSignLogin logIn;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	
	 @BeforeClass
	  public void launchNeoStox() throws IOException {
		 launchBrowser();
		 logIn=new NeoStoxSignLogin(driver);
		 password=new NeoStoxPasswordPage(driver);
		 home=new NeoStoxHomePage(driver);
		 
	  }
 @BeforeMethod
	  public void loginToNeoStox() throws IOException, InterruptedException {
	 logIn.sendMobileNumber(driver, UtilityNew.readDataFromPropertyFile("MobileNumber"));
	 logIn.clickOnSignInButton(driver);
	 Thread.sleep(1000);
	 password.sendPssword(driver, "Password");
	 password.clikOnSubmitButton(driver);
	 Thread.sleep(1000);
	 home.popUpHandle(driver);
	  }
  @Test
  public void validateUserName() throws IOException {
	Assert.assertEquals(home.getUserName(), UtilityNew.readDataFromPropertyFile("UserName"),"Tc failed,actual and expected user Name are not matching");
	UtilityNew.takeScreenshot(driver, home.getUserName());
	
  }
  
 
  @AfterMethod
  public void logOut() {
	  home.LogOutFromApplication(driver);
  }

 

  @AfterClass
  public void closeApplication() {
	  closingBrowser(driver);
  }

}
