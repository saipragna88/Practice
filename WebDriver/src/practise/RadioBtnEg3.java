package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtnEg3 {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://echoecho.com/htmlforms10.htm");
			driver.manage().window().maximize();
			
			WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td"
					+ "/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			List<WebElement> radio=block.findElements(By.name("group1"));
			System.out.println(radio.size());
			for (int i = 0; i < radio.size(); i++) {
				String text=radio.get(i).getAttribute("value");
				System.out.println(text);
				if(text.equalsIgnoreCase("Cheese"))
				{
					radio.get(i).click();
				}
			}
	
}
}
