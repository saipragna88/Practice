package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox","http://24hourfitness.com");
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Get Pass")));
		
		driver.findElement(By.linkText("Get Pass")).click();
	}

}
