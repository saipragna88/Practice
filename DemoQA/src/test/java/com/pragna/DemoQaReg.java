package com.pragna;

import com.pragna.helperClasses.BaseClass;
import com.pragna.pageObjects.DemoQaObjects;

public class DemoQaReg extends BaseClass {

	public static void main(String[] args) {
		
		launchApp();
		
		
		//firstname
		driver.findElement(DemoQaObjects.firstName).sendKeys("abcd");
		
		//lastname
		driver.findElement(DemoQaObjects.lastName).sendKeys("efgh");
		
		//marital status
//		driver.findElement(By.xpath("//input[@name='radio_4[]' and @value='single']")).click();
		driver.findElement(DemoQaObjects.maritalStatus).click();
//		Sleeper.sleepTightInSeconds(10);
		
		//hobby
//		driver.findElement(By.xpath("//input[@name='checkbox_5[]' and @value='dance']")).click();
		driver.findElement(DemoQaObjects.hobby).click();
//		Sleeper.sleepTightInSeconds(10);
		
		//country
//		driver.findElement(By.id("dropdown_7")).click();
		
//		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(DemoQaObjects.country).click();
		
//		Select s=new Select(driver.findElement(By.id("dropdown_7")));
//		s.selectByValue("India");
		
		//month
//		driver.findElement(By.xpath("//select[contains(@id,'mm_date')]")).click();
//		driver.findElement(By.xpath("//option[@value='10']")).click();
//		Sleeper.sleepTightInSeconds(10);
		driver.findElement(DemoQaObjects.month).click();
		//day
		driver.findElement(DemoQaObjects.day).click();
//		Sleeper.sleepTightInSeconds(10);
		//year
		driver.findElement(DemoQaObjects.year).click();
//		Sleeper.sleepTightInSeconds(10);
		//phoneNumber
		driver.findElement(DemoQaObjects.phone).sendKeys("9988776655");
		
		//username
		driver.findElement(DemoQaObjects.username).sendKeys("abcdefgh90090");
		
		//email
		driver.findElement(DemoQaObjects.email).sendKeys("abcdefg90090@yahoo.com");
		
		//profile pic using Robot class
//		driver.findElement(By.id("profile_pic_10")).click();
//		StringSelection location=new StringSelection("C:\\Users\\kalyan\\Pictures\\googlelogo_color_272x92dp.png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(location, null);
//		Robot r;
//		try {
//			r = new Robot();
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_V);
//
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_V);
//
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//profile pic using sendkeys
		driver.findElement(DemoQaObjects.profilePic)
		.sendKeys("C:\\Users\\kalyan\\Pictures\\googlelogo_color_272x92dp.png");
		
		//about yourself
		driver.findElement(DemoQaObjects.description).sendKeys("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		
		//pwd
		driver.findElement(DemoQaObjects.password).sendKeys("123456789");
		
		//confirm pwd
		driver.findElement(DemoQaObjects.cpassword).sendKeys("123456789");
		
		//submit
		driver.findElement(DemoQaObjects.submit).click();
	}
	
	
	
}
