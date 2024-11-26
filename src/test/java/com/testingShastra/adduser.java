package com.testingShastra;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testingshastra.TestBase;
import com.testingshastra.locator.locator;

import Keyword.Keywrod;
public class adduser extends TestBase{
	
	/*
	@Test
	public void verifyLoginAdminUser() throws InterruptedException {
		
	//Keywrod keyword= new Keywrod();

		
		Thread.sleep(2000);
		Keywrod.driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Thread.sleep(2000);

		Keywrod.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);

		Keywrod.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
	}
	
	*/
	
	Keywrod keyword=new Keywrod();

	@Test
	public void verifyloginAdminUserA() throws InterruptedException {
		
		keyword.enterText(locator.username, locator.usernametxt);
		keyword.enterText(locator.passowrd, locator.passwordtxt);
		keyword.clickOn(locator.submitbtn);
		Thread.sleep(3000);
		keyword.clickOn(locator.PIM);
		Thread.sleep(2000);
		keyword.clickOn( locator.addbtn);
		Thread.sleep(2000);
		keyword.enterText(locator.firstname, locator.firstnamevalue);
		keyword.enterText(locator.lastname, locator.lastnametxt);
		Thread.sleep(2000);
		keyword.clickOn(locator.savebtn);
		keyword.clickOn(locator.admin);
		Thread.sleep(2000);
		keyword.clickOn(locator.adminAddBtn);
		Thread.sleep(2000);
		keyword.enterText(locator.empname, locator.firstnamevalue);
	}
	
	
	}

