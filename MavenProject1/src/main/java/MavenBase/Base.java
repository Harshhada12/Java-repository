package MavenBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Utility.UtilityNew;

public class Base {
	protected static WebDriver driver;
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(UtilityNew.readDataFromPropertyFile("url"));
		driver.manage().window().maximize();
		Reporter.log("Launching browser",true);
		UtilityNew.Wait(driver, 1000);
	}
public static void closingBrowser(WebDriver driver) {
	Reporter.log("closing browser",true);
	driver.close();
	
}
}
