package MavenPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utility.UtilityNew;

public class NeoStoxPasswordPage {
	@FindBy(xpath="//input[@id='txt_accesspin']")private WebElement passField;
	@FindBy(xpath="//a[text()='Submit']")private WebElement submitButton;
	public NeoStoxPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void sendPssword(WebDriver driver,String pass) {
	UtilityNew.Wait(driver,1000 );	
	passField.sendKeys(pass);
	Reporter.log("sending password",true);
	
	}
public void clikOnSubmitButton(WebDriver driver) {
	UtilityNew.Wait(driver, 3000);
	submitButton.click();
	Reporter.log("click on submit button");
}
}
