package com.testingShastra;

import org.testng.annotations.Test;

import com.testingshastra.TestBase;
import com.testingshastra.locator.locator;

import Keyword.Keywrod;

public class PIMReport extends TestBase{
	Keywrod keyword=new Keywrod();
@Test
	public void getPIMreport() throws InterruptedException {
		
		keyword.login(locator.usernametxt,locator.passwordtxt);
		Thread.sleep(3000);
		keyword.clickOn(locator.PIM);
		Thread.sleep(2000);
		keyword.clickOn(locator.PIMreport);
		Thread.sleep(2000);
		keyword.clickOn(locator.reportFile);
		Thread.sleep(3000);

	}

}
