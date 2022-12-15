package UpStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {
	@FindBy(name="userId")private WebElement userID;
	@FindBy(name="password")private WebElement password;
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signInButton;
	//variable initilization
	public UpstoxLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	//variable usage
	public void sendUserName(String Un) {
		userID.sendKeys(Un);
	}
	public void sendPassword(String PWD) {
		password.sendKeys(PWD);
	}
	public void clickOnSignInButton() {
		signInButton.click();
	}
	
	
}
