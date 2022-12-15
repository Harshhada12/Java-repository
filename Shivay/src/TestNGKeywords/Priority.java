package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test (priority=1)//priority is use to set order of excution of tc by default priority is 0
  public void A() {
	  Reporter.log("A tc is running", true);
  }
  @Test
  public void B() {
	  Reporter.log("B tc is running", true);
  }
  @Test(priority=-2)
  public void C() {
Reporter.log("C tc is running", true);	  
  }
  @Test
  public void D() {
	  Reporter.log("D tc is running ", true);
		    
  }
  
	  
  
}
