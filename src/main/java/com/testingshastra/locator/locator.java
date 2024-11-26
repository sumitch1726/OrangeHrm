package com.testingshastra.locator;

public interface locator {
	String username="//input[@name=\"username\"]";
	String passowrd="//input[@name=\"password\"]";
	String usernametxt="Admin";
	String passwordtxt="admin123";
	String submitbtn="//button[@type=\"submit\"]";
	String PIM="//a[@href=\"/web/index.php/pim/viewPimModule\"]";
	String addbtn="//button[text()=' Add ']";
	String firstname="//input[@name=\"firstName\"]";
	String lastname="//input[@name=\"lastName\"]";
	String lastnametxt="S";
	String firstnamevalue="Amit";
	String savebtn="//button[text()=' Save ']";
	String admin="//a[@href=\"/web/index.php/admin/viewAdminModule\"]";
	String empname="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input";
	String adminAddBtn="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]";	

}
