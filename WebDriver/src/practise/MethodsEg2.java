package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {
	 
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Number of links in "+driver.getCurrentUrl()+" is "+links.size());
		for(int i=0;i<links.size();i++)
		{
			String text=links.get(i).getText();
			if(!text.equals(""))
			{
				System.out.println(text);
			}
			
		}
		
	}

}
