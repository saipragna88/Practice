package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends BrowserLaunch{

	public static void main(String[] args) {

		launchApp("firefox", "http://www.echoecho.com/htmlforms09.htm");
		
//		driver.findElement(By.xpath("//span[contains(text(),'N EXAMPLE')]/../table[3]//input[@value='Milk']")).click();
		
		WebElement block=driver.findElement(By.xpath("//span[contains(text(),'N EXAMPLE')]/../table[3]//table"));
		
		List<WebElement> checkboxes=block.findElements(By.tagName("input"));
		System.out.println("Number of checkboxes = "+checkboxes.size());
		
		for (WebElement check : checkboxes) {
			System.out.println(check.getAttribute("value"));
			if(!check.isSelected())
			{
				check.click();
			}
		}
		

	}

}
