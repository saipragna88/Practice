package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtnEg2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
//		driver.get("http://www.kayak.com");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
//		WebElement block=driver.findElement(By.xpath(".//div[@class='travelerBlock col-traveler col-2-3-m']"));
		List<WebElement> radiolist=block.findElements(By.tagName("input"));
		System.out.println(radiolist.size());
		for(int i=0;i<radiolist.size();i++)
		{
			String text=radiolist.get(i).getAttribute("value");
			System.out.println(text);
			if(text.equalsIgnoreCase("multicity"))
			{
				radiolist.get(i).click();
				continue;
			}
			
		}
	}

}
