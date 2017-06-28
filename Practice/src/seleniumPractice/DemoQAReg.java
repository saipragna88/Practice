package seleniumPractice;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DemoQAReg
{
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//firstname
		driver.findElement(By.id("name_3_firstname")).sendKeys("abcd");
		
		//lastname
		driver.findElement(By.name("last_name")).sendKeys("efgh");
		
		//marital status
//		driver.findElement(By.xpath("//input[@name='radio_4[]' and @value='single']")).click();
		driver.findElement(By.xpath("//label[text()='Single']/../input[@value='married']")).click();
//		Sleeper.sleepTightInSeconds(10);
		
		//hobby
//		driver.findElement(By.xpath("//input[@name='checkbox_5[]' and @value='dance']")).click();
		driver.findElement(By.xpath("//label[text()='Dance']/following-sibling::input[@value='reading']")).click();
//		Sleeper.sleepTightInSeconds(10);
		
		//country
//		driver.findElement(By.id("dropdown_7")).click();
		
//		driver.findElement(By.xpath("//option[@value='India']")).click();
//		driver.findElement(By.xpath("//select[@id='dropdown_7']/option[@value='India']")).click();
		
		Select s=new Select(driver.findElement(By.id("dropdown_7")));
		s.selectByValue("India");
		
		//month
		driver.findElement(By.xpath("//select[contains(@id,'mm_date')]")).click();
		driver.findElement(By.xpath("//option[@value='10']")).click();
		Sleeper.sleepTightInSeconds(10);
		//day
		driver.findElement(By.xpath("//select[@id='dd_date_8']/option[@value='10']")).click();
//		Sleeper.sleepTightInSeconds(10);
		//year
		driver.findElement(By.xpath("//select[@id='yy_date_8']/option[@value='2010']")).click();
//		Sleeper.sleepTightInSeconds(10);
		//phoneNumber
		driver.findElement(By.id("phone_9")).sendKeys("9988776655");
		
		//username
		driver.findElement(By.id("username")).sendKeys("abcdefgh90090");
		
		//email
		driver.findElement(By.id("email_1")).sendKeys("abcdefg90090@yahoo.com");
		
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
		driver.findElement(By.xpath("//label[text()='Your Profile Picture']/following-sibling::input"))
		.sendKeys("C:\\Users\\kalyan\\Pictures\\googlelogo_color_272x92dp.png");
		Sleeper.sleepTightInSeconds(10);
		//about yourself
		driver.findElement(By.name("description")).sendKeys("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		
		//pwd
		driver.findElement(By.id("password_2")).sendKeys("123456789");
		
		//confirm pwd
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("123456789");
		
		//submit
		driver.findElement(By.name("pie_submit")).click();
	}
	
	
	
}
