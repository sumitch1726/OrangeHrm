package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Keywrod {

	public static RemoteWebDriver driver=null;
		public void lounchBrowser(String browserName) {
			if(browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			}else
				if(browserName.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				}
		}
		
		
		public static void launchURL(String url) throws InterruptedException {
			driver.get(url);
			
			Thread.sleep(5000);
			System.out.println("open URL");
		}
		
		public void enterText(String locator,String textToenter) {
			driver.findElement(By.xpath(locator)).sendKeys(textToenter);
		}
		
		public void clickOn(String locatorValue) {
			
		 
			driver.findElement(By.xpath(locatorValue)).click();
		}
}
