package NeoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.UtilityClass;

public class NeoStoxPasswordPage {
	@FindBy(id="txt_accesspin") private WebElement PasswordField;
	@FindBy(xpath="//a[text()='Submit']")private WebElement submitButton;
	public NeoStoxPasswordPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public void SendPassword(WebDriver driver,String pass) {
		UtilityClass.Wait(driver,1000);
		PasswordField.sendKeys(pass);
		Reporter.log("sending password",true);
		
	}
	public void ClickSubmitButton(WebDriver driver) throws InterruptedException {
		//UtilityClass.Wait(driver, 1000);
		Thread.sleep(3000);
		submitButton.click();
		Reporter.log("click submit button",true);
		
	}

}
