package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownloadRobot extends BrowserLaunch {

	public static void main(String[] args) {
		launchApp("firefox","http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.4.0")).click();
		Sleeper.sleepTightInSeconds(5);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
