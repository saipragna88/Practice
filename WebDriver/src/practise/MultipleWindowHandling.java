package practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
//		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Privacy")).click();
//		driver.findElement(By.linkText("Terms of Service"));
		
//		System.out.println(driver.getWindowHandle());
		Set<String> listId=driver.getWindowHandles();
		Iterator<String> it=listId.iterator();
		while(it.hasNext())
		{
			String wId=it.next();
			driver.switchTo().window(wId);
			System.out.println(wId+"---"+driver.getTitle()+"---"+driver.getCurrentUrl());
			try {
				driver.findElement(By.linkText("Terms of Service")).click();
				String terms=driver.getWindowHandle();
				driver.switchTo().window(terms);
				System.out.println(terms+"---"+driver.getTitle()+"---"+driver.getCurrentUrl());
				
			} catch (Exception e) {
				System.out.println("Terms of Service does not exist in this window with title "+driver.getTitle());
			}
			
		}
		
		driver.quit();
		
		
	}

}
