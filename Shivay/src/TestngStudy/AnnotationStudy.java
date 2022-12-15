package TestngStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void ValidatePin() {
	  Reporter.log("pin validation done", true);
  }
	  @Test
	  public void ValidateUserID() {
	Reporter.log("validate user Id done", true);	  
	  
  }
  @BeforeMethod
  public void EnterUserIdAndPassword() {
	  Reporter.log("Enter User Id AND Password is done", true);
  }

  @AfterMethod
  public void LogOut() {
	  Reporter.log("Log out done", true);
  }

  @BeforeClass
  public void BrowserLaunch() {
	  Reporter.log("browser launch succesfully", true);
  }

  @AfterClass
  public void CloseBrowser() {
	  Reporter.log("browser close succesfully", true);
	  
  }

}
