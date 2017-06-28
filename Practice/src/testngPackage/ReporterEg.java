package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;

@Test
public class ReporterEg {
	
	public void testReport()
	{
		WebDriver driver=new FirefoxDriver();
		Reporter.log("Browser opened",true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized");
		driver.get("http://google.com");
		Reporter.log("Website opened");
		driver.close();
		Reporter.log("Browser closed");
		
	}

}
