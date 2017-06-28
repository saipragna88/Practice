package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("chrome", "http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links in "+driver.getTitle()+" is "+links.size());
		
//		for (WebElement link : links) {
//			System.out.println(link.getText());
//		}
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		driver.close();

	}

}
