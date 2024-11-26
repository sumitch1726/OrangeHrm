package com.testingshastra;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Keyword.Keywrod;

public class TestBase {

	 //RemoteWebDriver driver=null;

		@BeforeMethod
		public void setup() throws InterruptedException {
			Keywrod keyword=new Keywrod();
			keyword.lounchBrowser("Chrome");
			Keywrod.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		}
		@AfterMethod
		public void tearDown() {
			Keywrod.driver.close();
		}
	}

