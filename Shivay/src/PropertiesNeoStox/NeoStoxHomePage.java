package PropertiesNeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeoStoxHomePage {
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(xpath="//span[@id='lbl_username']")private WebElement userName;
	@FindBy(xpath="//span[@id='lbl_curbalancetop']")private WebElement balance;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutButton;
	public NeoStoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void popUpHandle(WebDriver driver) {
		UtilityNew.Wait(driver, 1000);
		okButton.click();
		UtilityNew.scollIntoView(driver, closeButton);
		UtilityNew.Wait(driver, 1000);
		closeButton.click();
		Reporter.log("handle popup succesfully",true);
	}
	public String getUserName() {
	String actualUserName=userName.getText();
	Reporter.log("getting username",true);
	return actualUserName;
	}
	public String getBalance(WebDriver driver) {
		UtilityNew.Wait(driver, 1000);
		String actualBalance=balance.getText();
		Reporter.log("getting user Name",true);
		return actualBalance;
		
	}
	public void LogOutFromApplication(WebDriver driver) {
		UtilityNew.Wait(driver, 1000);
		logoutButton.click();
		Reporter.log("log out from application",true);
		
	}
}
