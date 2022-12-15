package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//capture links from a Webpage
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		//number of links
		System.out.println(AllLinks.size());
		for(int i=0;i<AllLinks.size();i++) {
			//by using href attribute we can get Url of required link
			WebElement element=AllLinks.get(i);
			String url=element.getAttribute("href");
			//create object of Url
			URL link=new URL(url);
			//create a connection using url object 'link'
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			//wait time 2 seconds
			Thread.sleep(1000);
			//establich connection
			httpconn.connect();
			int rescode=httpconn.getResponseCode();//return response code
			                                       //if res code is above
			                                       //400:broken links
			if(rescode>=400) {
				System.out.println(url +"-"+" is broken link");
			}
			else {
				System.out.println(url +"-"+" is valid link");
			}
				} 
		
		

	}

}
