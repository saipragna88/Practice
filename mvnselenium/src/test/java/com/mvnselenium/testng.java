package com.mvnselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testng 
{
	@Test
	public void launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Libs\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}

}
