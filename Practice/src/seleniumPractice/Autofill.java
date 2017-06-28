package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Autofill extends BrowserLaunch {

	public static void main(String[] args)  {
		
		launchApp("firefox", "http://redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("C");
		Sleeper.sleepTightInSeconds(3);
		List<WebElement> cities=driver.findElements(By.xpath(".//input[@id='src']/../ul/li"));
		System.out.println(cities.size());
		for (WebElement city : cities) {
			if(city.getText().equalsIgnoreCase("Coimbatore"))
			{
				city.click();
				break;
			}
		}
	}

}
