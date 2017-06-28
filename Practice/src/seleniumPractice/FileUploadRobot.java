package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUploadRobot extends BrowserLaunch {

	public static void main(String[] args) {
		launchApp("firefox","http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("photofile")).click();
		Sleeper.sleepTightInSeconds(3);
		try {
			Robot r=new Robot();
			StringSelection loc=new StringSelection("C:\\Users\\kalyan\\Pictures\\googlelogo_color_272x92dp.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(loc,null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
