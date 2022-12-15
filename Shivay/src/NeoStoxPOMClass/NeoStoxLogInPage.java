package NeoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.UtilityClass;

public class NeoStoxLogInPage {
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;
@FindBy(xpath="//a[@id='lnk_signup1']") private WebElement signInButton; 

public NeoStoxLogInPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
public void sendMobileNumber(WebDriver driver,String mobNum) {
	UtilityClass.Wait(driver, 1000);
	mobileNumField.sendKeys(mobNum);
	Reporter.log("sendig mobile number",true);
}
public void ClickOnSignInButton(WebDriver driver) {
	UtilityClass.Wait(driver, 2000);
	signInButton.click();
	Reporter.log("clicking on sign in button",true);
}
}