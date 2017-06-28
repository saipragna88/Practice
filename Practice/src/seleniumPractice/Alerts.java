package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts extends BrowserLaunch {

	public static void main(String[] args) {

		launchApp("firefox","http://primusbank.qedgetech.com");
		driver.findElement(By.id("login")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(3);
		alt.accept();
	}

}
