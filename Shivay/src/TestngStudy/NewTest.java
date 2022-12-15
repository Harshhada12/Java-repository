package TestngStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void A() {
	  Reporter.log("A TC is running", true);
  }
  @Test
  public void B() {
	  Reporter.log("B TC is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("C TC is running", true);
  }
  
}
