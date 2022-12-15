package NeoStoxUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
 
public class Base {
	protected  WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		UtilityClass.Wait(driver,1000);
		}
public static void ClosingBrowser( WebDriver driver) throws InterruptedException {
	Reporter.log("closing browser",true);
	UtilityClass.Wait(driver,1000);
  //Thread.sleep(500);
   driver.close();
}
}
