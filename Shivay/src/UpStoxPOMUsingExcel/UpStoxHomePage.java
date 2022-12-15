package UpStoxPOMUsingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ScreenshotGeneralMethod.Screenshot2;

public class UpStoxHomePage {
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	@FindBy(id="funds")private WebElement funds;
	@FindBy(xpath="//div[text()='Logout']")private WebElement logoutButton;
	//
	public UpStoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//usages
	public void validateUserID(WebDriver driver,String expID) throws InterruptedException, IOException {
		Thread.sleep(1000);
		String actualUserID=userID.getText();
		String expectedUserID=expID;
		Screenshot2.Screenshotmethod(driver,actualUserID);
		if(actualUserID.equals(expectedUserID)) {
			System.out.println("Actual and expected userID is matching TC is passed");
		}
		else {
			System.out.println("Actual and Excepted UseID is not matching test case is fail");
		}
		
		}
		public void clickOnFunds() throws InterruptedException {
			Thread.sleep(1000);
			//CommonMethodForScrolling.scrollIntoView(driver, funds);
			funds.click();
			Thread.sleep(1000);
	} 
		public void logoutFromApplication() throws InterruptedException {
		Thread.sleep(1000);	
		//CommonMethodForScrolling.scrollIntoView(driver, userID);
		userID.click();
		Thread.sleep(1000);
		logoutButton.click();
		}
		public String getActualUserID(WebDriver driver) {
			String actualUserID=userID.getText();
			//GeneralMethods.scrollIntoView(driver,userID);
			return actualUserID;
		}
		
		
		
		
}
