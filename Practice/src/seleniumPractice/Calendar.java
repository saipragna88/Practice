package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calendar extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox", "https://www.cleartrip.com/");
		String date="2/september/2018";
		String[] dateArr=date.split("/");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		driver.findElement(By.id("DepartDate")).click();
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!month.equalsIgnoreCase(calmonth))
		{
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> days=driver.findElements(By.xpath(".//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(WebElement calday:days)
		{
			if(calday.getText().equals(day))
			{
				calday.click();
				break;
			}
		}
		

	}

}
