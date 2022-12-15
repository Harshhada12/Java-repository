package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test(groups="un")
  public void A() {
	  Reporter.log("A tc is running", true);
  }
  @Test(groups="un")
  public void B() {
	  Reporter.log("B tc is running", true);
  
  
  
  }
  @Test(groups="funds")
  public void C(){
	  
Reporter.log("C tc is running", true);	  
  }
  @Test
  public void D() {
	  Reporter.log("D tc is running ", true);
		    
  
  }
}
