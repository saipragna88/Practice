package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboard extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox", "http://google.com");
		Actions act=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
//		act.moveToElement(gmail).build().perform();
//		act.contextClick().build().perform();
		act.contextClick(gmail).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		act.sendKeys(Keys.chord("P")).build().perform();
	}

}