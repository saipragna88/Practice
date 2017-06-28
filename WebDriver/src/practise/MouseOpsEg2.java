package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpsEg2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement depts=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(depts).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()=\"Books & Audible\"]"))).build().perform();
		driver.findElement(By.xpath(".//span[text()=\"Children\'s Books\"]")).click();

	}

}
