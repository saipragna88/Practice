package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox","http://24hourfitness.com");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Get Pass")));
		
		driver.findElement(By.linkText("Get Pass")).click();
	}

}
