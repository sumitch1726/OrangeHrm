package com.testingShastra;

import org.testng.annotations.Test;
import com.testingshastra.locator.locator;
import com.testingshastra.TestBase;

import Keyword.Keywrod;

public class AdminEditUser extends TestBase {
	Keywrod keyword=new Keywrod();

	@Test
	public void AdminEditUsers() throws InterruptedException {
		
		keyword.login(locator.usernametxt,locator.passwordtxt);
		Thread.sleep(3000);
		
		keyword.clickOn(locator.admin);
		Thread.sleep(2000);
		
		keyword.clickOn(locator.adminEdit);
		Thread.sleep(5000);
	
		
		keyword.Dropdown(locator.dropdown,locator.dropdownvalue);
		Thread.sleep(5000);
		keyword.clickOn(locator.editsadminsavebtn);

	}
	@Test
	public void deleteAdminUser() throws InterruptedException {
		keyword.login(locator.usernametxt,locator.passwordtxt);
		Thread.sleep(3000);
		keyword.clickOn(locator.admin);
		Thread.sleep(2000);
		keyword.clickOn(locator.adminDelete);
		Thread.sleep(5000);
		keyword.alertpopup(locator.adminDeleteYes);
		Thread.sleep(5000);
		System.out.println("User deleted successfully");
	}

	@Test
	public void VerifySearchUser() throws InterruptedException {
		keyword.login(locator.usernametxt,locator.passwordtxt);
		Thread.sleep(3000);
		keyword.clickOn(locator.admin);
		Thread.sleep(2000);
		
		keyword.enterText(locator.firstnamesearch, locator.searchbtn);
		Thread.sleep(2000);
		
		keyword.alert();

		
	}


}
