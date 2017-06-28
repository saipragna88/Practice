package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropDown {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("menu1")).click();
		List<WebElement> dd_menu=driver.findElements(By.xpath(".//ul[@class='dropdown-menu']//li/a"));
		for(WebElement element : dd_menu)
		{
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("javascript"))
			{
				element.click();
				break;
			}
		}
		
	}

}
