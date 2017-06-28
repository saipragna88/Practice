package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			String ltext=links.get(i).getText();
			System.out.println(ltext);
			links.get(i).click();
			Sleeper.sleepTightInSeconds(3);
			System.out.println(driver.getCurrentUrl()+"---"+driver.getTitle());
			driver.navigate().back();
			block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
			links=block.findElements(By.tagName("a"));
		}

	}

}
