package NeoStoxPOMClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.UtilityClass;

public class NeoStoxHomePage {
	
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(xpath="//span[@id='lbl_username']")private WebElement userName;
	@FindBy(xpath="//span[@id='lbl_curbalancetop']")private WebElement balance;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutButton;
	public NeoStoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void handlePopUP(WebDriver driver) {
	UtilityClass.Wait(driver, 1000);
	okButton.click();
	//UtilityClass.ScrollIntoView(driver, closeButton);
	UtilityClass.Wait(driver, 1000);
	closeButton.click();
	Reporter.log("popup handle",true);
}
public String getUserName(WebDriver driver) throws IOException {
	UtilityClass.Wait(driver, 1000);
	String actualUserName=userName.getText();
	UtilityClass.takeScreenshot(driver, actualUserName);
	Reporter.log("getting user Name",true);
	return actualUserName;
	
}
public String getBalance(WebDriver driver) {
	UtilityClass.Wait(driver, 1000);
	String actualBalance=balance.getText();
	Reporter.log("getting user Name",true);
	return actualBalance;
	
}
public void LogOutFromApplication(WebDriver driver) {
	UtilityClass.Wait(driver, 1000);
	logoutButton.click();
	Reporter.log("log out from application",true);
	
	
}
 
}
 

 


