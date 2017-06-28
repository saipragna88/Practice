package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Resizable {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement icon=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Actions act=new Actions(driver);
		Sleeper.sleepTightInSeconds(5);
		act.dragAndDropBy(icon, 344, 319).build().perform();

	}

}
