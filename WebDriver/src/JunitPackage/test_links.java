package JunitPackage;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test_links extends Master
{
	@Test
	public void links()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}
}
