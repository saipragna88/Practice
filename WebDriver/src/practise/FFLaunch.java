package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FFLaunch {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("pragnadotnet");
		//Sleeper.sleepTightInSeconds(5);
		//email.clear();
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
//		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.name("password")).sendKeys("061712");
//		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
//		driver.findElement(By.linkText("Sign out")).click();

	}

}
