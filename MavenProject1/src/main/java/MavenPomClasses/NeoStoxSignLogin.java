package MavenPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utility.UtilityNew;

public class NeoStoxSignLogin {
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement MobileField;
	@FindBy(xpath="//a[@id='lnk_signup1']")private WebElement signInButton;
	public NeoStoxSignLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sendMobileNumber(WebDriver driver,String mob) {
		UtilityNew.Wait(driver, 1000);
		MobileField.sendKeys(mob);
		Reporter.log("sending mobile number..",true);
		
	}
	public void clickOnSignInButton(WebDriver driver) {
		UtilityNew.Wait(driver, 1000);
		signInButton.click();
		Reporter.log("clicking on sign in button",true);
	}
	

}
