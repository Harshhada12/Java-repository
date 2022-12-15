package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
  @Test(groups= {"un","funds"})
  public void E() {
	  Reporter.log("E tc is running", true);
  }
  @Test
  public void F() {
	  Reporter.log("F tc is running", true);
  }
  @Test(groups="un")
  public void G(){
	  
Reporter.log("G tc is running", true);	  
  }
  @Test(groups="funds")
  public void H() {
	  Reporter.log("H tc is running ", true);
		    
  }
  }

