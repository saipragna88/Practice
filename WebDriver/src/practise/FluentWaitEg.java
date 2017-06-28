package practise;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitEg {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		WebElement started= wait.until(new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Get Started"));
			}
			
		});
		started.click();
		

	}

}
