package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox", "http://amazon.com");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']//span[contains(text(),'Books & Audible')]"));
		act.moveToElement(books).build().perform();
		WebElement textbooks= driver.findElement(By.linkText("Textbooks"));
		act.moveToElement(textbooks).click().build().perform();
	}

}
