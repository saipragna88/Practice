package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg 
{
	
	@Test
	@Parameters({"browser"})
	public void grid(String browser) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		

		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"), cap);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("full moon");
	}

}
