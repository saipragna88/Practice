package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBr {
	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
	}
	
	@Test
	@Parameters({"uid","password"})
	public void Login(String uid, String password)
	{
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(password);
	}

}
