package JunitPackage;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Master 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void launch()
	{
		driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void close()
	{
		driver.close();
	}

}
