package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtnEg4 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> radios=driver.findElements(By.xpath(".//input[@name='lang' and @type='radio']"));
		for(WebElement ele : radios)
		{
			System.out.println(ele.getAttribute("value"));
			if(ele.getAttribute("value").equalsIgnoreCase("ruby"))
			{
				ele.click();
				break;
			}
		}
	}

}
