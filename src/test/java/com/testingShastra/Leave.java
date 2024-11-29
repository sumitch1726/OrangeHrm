package com.testingShastra;
import org.testng.annotations.Test;

import com.testingshastra.TestBase;
import com.testingshastra.locator.locator;

import Keyword.Keywrod;
public class Leave extends TestBase {
	
	Keywrod keyword= new Keywrod();
	@Test
public void cancelLeave() throws InterruptedException {
	
	keyword.login(locator.usernametxt, locator.passwordtxt);
	Thread.sleep(2000);
	keyword.clickOn(locator.leave);
	keyword.clickOn(locator.LeaveCheckbox);
	keyword.clickOn(locator.cancelLeave);
	
}
}
