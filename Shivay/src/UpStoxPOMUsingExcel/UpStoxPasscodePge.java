package UpStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePge {
//variable declaration
	@FindBy(name="yob") private WebElement passcode;
	public UpStoxPasscodePge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterPasscode(String pass) {
		passcode.sendKeys(pass);
	}
}
