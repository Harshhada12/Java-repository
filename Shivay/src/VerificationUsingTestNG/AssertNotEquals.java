package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void assertNotEqualsUse() {
  
  //my Tc should be passed when two thing are not equals--->
  String a="MH";
  String b="GA";
 Assert.assertNotEquals(a,b,"A and B are equal TC is failed");
 Reporter.log("TC is passed A and B ar not Matching",true);
  } 
}
