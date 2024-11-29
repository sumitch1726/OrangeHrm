package Keyword;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.testingshastra.locator.locator;


public class Keywrod {

	public static RemoteWebDriver driver=null;
	public static FluentWait<WebDriver> wait=null;

	
		public void lounchBrowser(String browserName) {
			if(browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			}else
				if(browserName.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				}
			driver.manage().window().maximize();
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
		
		public void Dropdown(String locatordropdown, String dropdownvalue) throws InterruptedException {
			WebElement testDropdown=driver.findElement(By.xpath(locatordropdown));
			Select dropdowna=new Select(testDropdown);
			dropdowna.selectByVisibleText(dropdownvalue);
		}
		
		public void alert() {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		
		public void alertpopup(String yesbtn) {
	        String mainWindowHandle = driver.getWindowHandle();
			//WebElement triggerButton=driver.findElement(By.xpath(yesbtn));
			//triggerButton.click();
			 Set<String> windowHandles = driver.getWindowHandles();
			 for (String handle : windowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);  // Switch to the pop-up window
		                break;
		            }
			 }
			 
			 driver.findElement(By.xpath(yesbtn));
			 }
		
		public void searchUsername() {
			

			
		}
		
 public void login(String usernametxt, String passwordtxt) {
			driver.findElement(By.xpath(locator.username)).sendKeys(usernametxt);
			driver.findElement(By.xpath(locator.passowrd)).sendKeys(passwordtxt);
			driver.findElement(By.xpath(locator.submitbtn)).click();
		}
}
