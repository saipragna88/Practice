package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends BrowserLaunch{

	public static void main(String[] args) {

		launchApp("firefox","http://www.khuranatravel.com/");
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		Select s=new Select(driver.findElement(By.id("fromCity")));
		List<WebElement> from=s.getOptions();
		for(int i=0;i<from.size();i++)
		{
			String fCity=from.get(i).getText();
			from.get(i).click();
			Select slt=new Select(driver.findElement(By.id("toCity")));
			List<WebElement> to=slt.getOptions();
			for(int j=0;j<to.size();j++)
			{
				String tCity=to.get(j).getText();
				if(fCity.equals(tCity))
				{
					System.out.println("Fail");
				}
				else
				{
					System.out.println("Pass");
				}
			}
		}

	}

}
