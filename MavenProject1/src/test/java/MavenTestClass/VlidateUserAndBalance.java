package MavenTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MavenBase.Base;
import MavenPomClasses.NeoStoxHomePage;
import MavenPomClasses.NeoStoxPasswordPage;
import MavenPomClasses.NeoStoxSignLogin;
import Utility.UtilityNew;
@Listeners(MavenListener.Listener.class)
public class VlidateUserAndBalance extends Base {
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
	 Thread.sleep(2000);
	 password.sendPssword(driver, UtilityNew.readDataFromPropertyFile("Password"));
	 password.clikOnSubmitButton(driver);
	 Thread.sleep(2000);
	 home.popUpHandle(driver);
	  }
  @Test
  public void validateUserName() throws IOException {
	Assert.assertEquals(home.getUserName(), UtilityNew.readDataFromPropertyFile("UserName"),"Tc failed,actual and expected user Name are not matching");
	//UtilityNew.takeScreenshot(driver, home.getUserName());
	
  }
  @Test
  public void validateAcBalance() {
	  Assert.assertNotNull(home.getBalance(driver));
	  Reporter.log("ACbalance is"+home.getBalance(driver),true);
  }
  
 
  @AfterMethod
  public void logOut() {
	  home.LogOutFromApplication(driver);
  }

 

  @AfterClass
  public void closeApplication() throws InterruptedException{
	  closingBrowser(driver);
  }



  }

