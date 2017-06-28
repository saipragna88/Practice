package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		WebElement fromElement=driver.findElement(By.id("fromCity"));
		Select fromSelect=new Select(fromElement);
//		fromSelect.selectByIndex(2);
//		Sleeper.sleepTightInSeconds(5);
//		fromSelect.selectByValue("16|Anand");
//		Sleeper.sleepTightInSeconds(5);
//		fromSelect.selectByVisibleText("Chembur");
		WebElement toElement=driver.findElement(By.id("toCity"));
		Select toSelect=new Select(toElement);
		
		List<WebElement> fromCityList=fromSelect.getOptions();
		System.out.println(fromCityList.size());
		for (int i = 0; i < fromCityList.size(); i++) {
			String fromCity=fromCityList.get(i).getText();
			System.out.println(fromCity);
			fromCityList.get(i).click();
			List<WebElement> toCityList=toSelect.getOptions();
			for (int j = 0; j < toCityList.size(); j++) {
				if(fromCity.equalsIgnoreCase(toCityList.get(j).getText()))
				{
					System.out.println("Fail");
				}
				else
					System.out.println("pass");
			}
		}

	}

}
