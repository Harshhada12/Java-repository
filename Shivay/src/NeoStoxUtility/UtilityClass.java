package NeoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityClass {
	
	//commonly used method
	//excel reading screenshot,wait,Scroll method
public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
	File myFile=new File("C:\\selenium\\excelsheetworkbook\\excelsheetworkbook.xlsx");
	Sheet mysheet=WorkbookFactory.create(myFile).getSheet("Sheet4");
	String value=mysheet.getRow(row).getCell(cell).getStringCellValue();
	Reporter.log("entering data from excel",true);
	return value;
	}
public static void takeScreenshot(WebDriver driver,String fileName) throws IOException {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      File des = new File("C:\\selenium\\my screenshot\\"+fileName+".png");
	      FileHandler.copy(src, des);
	      Reporter.log("taking screenshot",true);
	
}
public static void ScrollIntoView(WebDriver driver,WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("argument[0].scrollIntoView(true)",element);
	Reporter.log("scrolling into view"+element.getText(),true);
}
public static void Wait(WebDriver driver,int Waittime) {
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Waittime));	
Reporter.log("Waiting for"+Waittime+"millis",true);
}

}
