package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void LaunchApp(String browser)
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
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Libs\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
