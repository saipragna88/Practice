package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowHandling extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox", "http://demoqa.com/frames-and-windows/");
//		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("New Browser Tab")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		while(it.hasNext())
		{
			String wId=it.next();
			System.out.println(wId);
//			driver.switchTo().window(wId);
//			System.out.println(driver.getTitle());
		}
	}

}
