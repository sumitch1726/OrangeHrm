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
	String adminEdit = "(//button[@type=\"button\" ])[10]";
	String dropdown="(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]";
	String dropdownvalue = "ESS";	
	String editsadminsavebtn="(//button[@type=\"submit\" ])";
	String adminDelete="(//button[@type=\"button\" ])[9]";
	String adminDeleteYes="(//button[@type=\"button\"])[14]";
	String searchusername="(//input[@class=\"oxd-input oxd-input--active\"])[2]";
	String firstnamesearch="Admin";
	String searchbtn="//button[text()=\" Search \"]";
	String tabletxt="//div[@class=\"oxd-table\"]";
	String PIMreport="(//li[@class=\"oxd-topbar-body-nav-tab\"])[2]";
	String reportFile="(//i[@class=\"oxd-icon bi-file-text-fill\"])";
	String leave="//a[@class=\"oxd-main-menu-item active\"]";
	String LeaveCheckbox="(//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"])[3]";
	String cancelLeave = "//button[text()=\" Cancel \"]";


}
