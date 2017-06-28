package practise;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEg {

	public static void main(String[] args) {
		
		String reqDate="2-september-2018";
		String[] reqDateParts=reqDate.split("-");
		String reqDay=reqDateParts[0];
		String reqMonth=reqDateParts[1];
		String reqYear=reqDateParts[2];
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("DepartDate")).click();
		//year
		String currentYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!currentYear.equals(reqYear))
		{
			driver.findElement(By.className("nextMonth ")).click();
			currentYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//month
		String currentMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!currentMonth.equalsIgnoreCase(reqMonth))
		{
			driver.findElement(By.className("nextMonth ")).click();
			currentMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//day
		List<WebElement> days=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(int j=0;j<days.size();j++)
		{
			if(reqDay.equals(days.get(j).getText()))
			{
				days.get(j).click();
				break;
			}
		}
		
	}

}
