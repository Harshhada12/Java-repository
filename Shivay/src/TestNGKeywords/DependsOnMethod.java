package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test (dependsOnMethods= {"B"},priority=-1)
  public void A() {
	  Reporter.log("A tc is running", true);
  }
  @Test
  public void B() {
	  Reporter.log("B tc is running", true);
  }
  @Test
  public void C() throws InterruptedException {
	  Thread.sleep(2000);
Reporter.log("C tc is running", true);	  
  }
  @Test
  public void D() {
	  Reporter.log("D tc is running ", true);
		    
  
  }
  
}
