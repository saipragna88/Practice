package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyClass {
	
	public static void main(String args[]){
		 
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String alertMsg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMsg);
		/*
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		*/
		/*
		String baseUrl="http://newtours.demoaut.com";
		driver.get(baseUrl);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		WebElement loginElement=driver.findElement(By.name("login"));
		loginElement.click();
		*/
		/*
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle= driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		*/
		/*
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		
		String tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		WebElement myElement=driver.findElement(By.id("email"));
		myElement.sendKeys("xyz@gmail.com");
		*/
		//driver.close();
		//driver.quit();
		System.exit(0);
	}
}
