package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void A() {
	  Reporter.log("A tc is running", true);
  }
  @Test(enabled=false)//this method is used to disable the tc
  public void B() {
Reporter.log("B tc is running",true);	  
  }
  @Test
  public void C() {
	  Reporter.log("C tc is running",true);
  }
  @Test
  public void D() {
	  Reporter.log("D tc is running", true);
  }
}
