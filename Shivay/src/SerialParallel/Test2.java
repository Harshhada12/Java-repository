package SerialParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void phonepay() throws InterruptedException 
  {System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phonepe.force.com/login?locale=us");
		Reporter.log("browser succesfully install", true);
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
  }
}
