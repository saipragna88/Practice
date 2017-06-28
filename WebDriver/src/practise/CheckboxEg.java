package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/"
				+ "tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checklist=block.findElements(By.tagName("input"));
		System.out.println(checklist.size());
		for (int i = 0; i < checklist.size(); i++) {
			String text=checklist.get(i).getAttribute("value");
			System.out.println(text);
			if(!checklist.get(i).isSelected())
			{
				checklist.get(i).click();
			}
		}
	}

}