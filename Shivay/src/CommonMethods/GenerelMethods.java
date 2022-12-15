package CommonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GenerelMethods {

	public static void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)",element);
	}
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File des=new File("C:\\selenium\\my screenshot"+fileName+".png");
		 FileHandler.copy(src, des);
	}
	public static void WaitTest(WebDriver driver,int WaitTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WaitTime));
	}
}
