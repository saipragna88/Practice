package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.seleniumhq.org");
		Sleeper.sleepTightInSeconds(4);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(4);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(4);
		driver.navigate().refresh();
		Sleeper.sleepTightInSeconds(2);
		driver.close();

	}

}
