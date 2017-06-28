package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://kayak.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(2);
		//xpath
		driver.findElement(By.xpath(".//*[contains(@id,'traveler-leisure-select-button')]")).click();
		//cssSelector
		driver.findElement(By.cssSelector("span[id$='-traveler-business-select-button']")).click();
		Sleeper.sleepTightInSeconds(2);
		
		//Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[contains(@id,'location')]")).sendKeys("New York");
		//driver.findElement(By.cssSelector("a[id$='-dropdown']")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.close();
		
	}

}
