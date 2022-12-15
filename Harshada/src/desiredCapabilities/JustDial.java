package desiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\23-Jul B Morn\\Selenium\\chromedriver.exe");
				//create object of ChromeOptions
				ChromeOptions opt = new ChromeOptions();
				//opt.addArguments("--disable-notifications");
				//opt.addArguments("incognito");
				//opt.addArguments("start-maximized"); 
				opt.addArguments("headless");
				WebDriver driver= new ChromeDriver(opt);
				//driver.manage().window().maximize();
				driver.get("https://www.justdial.com/")

	}

}
