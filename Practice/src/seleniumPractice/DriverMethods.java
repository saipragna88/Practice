package seleniumPractice;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DriverMethods extends BrowserLaunch{

	public static void main(String[] args) {
		
		launchApp("firefox", "http://gmail.com");
		
		System.out.println("Title is "+driver.getTitle());
		System.out.println("Current Url is "+driver.getCurrentUrl());
//		System.out.println("Page Source is "+driver.getPageSource());
		System.out.println("Window Handle is "+driver.getWindowHandle());
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().refresh();
		driver.close();
	}

}
