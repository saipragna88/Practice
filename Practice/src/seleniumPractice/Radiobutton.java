package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiobutton extends BrowserLaunch{

	public static void main(String[] args) {
		
		launchApp("firefox", "http://www.echoecho.com/htmlforms10.htm");
		
		WebElement block=driver.findElement(By.xpath("//span[contains(text(),'N EXAMPLE')]/../table[3]//table"));
		
		List<WebElement> radios=block.findElements(By.tagName("input"));
		System.out.println("Number of radio buttons = "+radios.size());
		
		List<WebElement> grp1=block.findElements(By.name("group1"));
		for(int i=0;i<grp1.size();i++)
		{
			if(grp1.get(i).getAttribute("value").equalsIgnoreCase("Milk"))
			{
				radios.get(i).click();
			}
		}
		
//		for(int i=0;i<radios.size();i++)
//		{
//			String text=radios.get(i).getAttribute("value");
//			System.out.println(text);
//			if(text.equalsIgnoreCase("Milk"))
//			{
//				radios.get(i).click();
//			}
//			else if(text.equalsIgnoreCase("Beer"))
//			{
//				radios.get(i).click();
//			}
//		}
		

	}

}
