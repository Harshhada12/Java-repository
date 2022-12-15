package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnocationCount {
  @Test (invocationCount=5)//use for one tc run multiple time
  public void A() {
	  Reporter.log("A Tc is running",true);
  }
  @Test
  public void B() {
	  Reporter.log("B TC is running", true);
  }
}
