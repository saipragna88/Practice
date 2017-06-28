package com.pragna.pageObjects;

import org.openqa.selenium.By;

import com.pragna.helperClasses.BaseClass;

public class DemoQaObjects extends BaseClass {
	
	public static By firstName=By.id("name_3_firstname");
	public static By lastName=By.name("last_name");
	public static By maritalStatus=By.xpath("//label[text()='Single']/../input[@value='married']");
	public static By hobby=By.xpath("//label[text()='Dance']/following-sibling::input[@value='reading']");
	public static By country=By.xpath("//select[@id='dropdown_7']/option[@value='India']");
	public static By month=By.xpath("//select[@id='mm_date_8']/option[@value='10']");
	public static By day=By.xpath("//select[@id='dd_date_8']/option[@value='10']");
	public static By year=By.xpath("//select[@id='yy_date_8']/option[@value='2010']");
	public static By phone=By.id("phone_9");
	public static By username=By.id("username");
	public static By email=By.id("email_1");
	public static By profilePic=By.xpath("//label[text()='Your Profile Picture']/following-sibling::input");
	public static By description=By.name("description");
	public static By password=By.id("password_2");
	public static By cpassword=By.id("confirm_password_password_2");
	public static By submit=By.name("pie_submit");
	
}
