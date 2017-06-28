package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutofillEg {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("s");
		List<WebElement> fromlist=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(fromlist.size());
		for (int i = 0; i < fromlist.size(); i++) {
			if(fromlist.get(i).getText().equalsIgnoreCase("Shirdi"))
			{
				fromlist.get(i).click();
				break;
			}
		}
		
	}

}
