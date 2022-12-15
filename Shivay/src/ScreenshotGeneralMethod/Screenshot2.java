package ScreenshotGeneralMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {
	public static void Screenshotmethod(WebDriver driver,String fileName) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\selenium\\my screenshot"+fileName+".png");
		 FileHandler.copy(src, dest);
	}
}
