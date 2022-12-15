package PropertiesNeoStox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew {
	public static String readDataFromPropertyFile(String Key) throws IOException {
		Properties prob=new Properties();
		//create object of fileInputStream
		FileInputStream myfile = new FileInputStream("F:\\workspaceNew\\Shivay\\MyProperties.properties");
		prob.load(myfile);
		String value=prob.getProperty(Key);
		Reporter.log("reading value of"+Key+"from property file",true);
		return value;
	}
public static void takeScreenshot(WebDriver driver,String fileName) throws IOException {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\selenium\\my screenshot"+fileName+".png");
	 FileHandler.copy(src, dest);
	 Reporter.log("taking screenshot",true);
	
}
public static void scollIntoView(WebDriver driver,WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("argument[0].scrollIntoView(true)",element);
	Reporter.log("scroll into view"+element.getText(),true);
}
public static void Wait(WebDriver driver,int waitTime) {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	Reporter.log("waiting for"+waitTime+"mills",true);
}
}
