package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox","http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> emplist=driver.findElements(By.xpath(".//table[@id='resultTable']/tbody/tr"));
		for(int i=0;i<emplist.size();i++)
		{
			List<WebElement> cells=emplist.get(i).findElements(By.tagName("td"));
			String eid=cells.get(1).getText();
			if(eid.equals("0001"))
			{
				cells.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
		
	}

}