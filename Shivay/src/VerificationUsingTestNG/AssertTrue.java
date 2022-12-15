package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void trueUse() {
	  boolean a=false;
	  //if a is then TC should b passed
	  Assert.assertTrue(a,"TCis failed a is false");
  }
}
