package listener;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Listener implements ITestListener {
  @Override
  public void onTestSuccess(ITestResult result) {
	  Reporter.log("TC is completes succesfully",true);
  }
  @Override
  public void onTestFailure(ITestResult result) {
	  Reporter.log("Tc is Fail not complete succesfully",true);
  }

  @Override
  public void onTestSkipped(ITestResult result) {
	  Reporter.log("TC is skipped please check",true);
  }

  
 

}
