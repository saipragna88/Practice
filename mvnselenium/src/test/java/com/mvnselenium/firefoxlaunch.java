package com.mvnselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunch 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Libs\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
