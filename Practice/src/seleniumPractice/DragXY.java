package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragXY extends BrowserLaunch {

	public static void main(String[] args) {
		launchApp("firefox", "http://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 200, 200).build().perform();
	}

}
