package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTC {
  @Test
  public void VerifyCheckBox () {
	 {
System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://vctcpune.com/selenium/practice.html");
WebElement checkBox1=driver.findElement(By.id("checkBoxOption1"));
 //if(checkBox1.isSelected()) 
	// {
//Reporter.log("checkbox is selcted tc is passed",true);	
//}
//else {
	//Reporter.log("checkbox is not selected tc is Failed", true);
//}
//checkBox1.click();
Assert.assertTrue(checkBox1.isSelected(), "ChesckBox is not selected TC is failed");
  }
  }}
