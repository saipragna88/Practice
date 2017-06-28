package com.pragna.helperClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchApp(String browserType)
	{
		if(browserType.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
}
