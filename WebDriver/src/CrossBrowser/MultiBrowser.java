package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiBrowser 
{
	@Test(dataProvider="getBrowserData")
	public void BrowserInvoke(String br, String url)
	{
		System.out.println(br+" "+url);
		WebDriver driver=null;
		if(br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Libs\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@DataProvider(parallel=true)
	public Object[][] getBrowserData()
	{
		return new Object[][]{
			{"firefox","http://google.com"},
			{"chrome","http://gmail.com"},
			{"ie","http://seleniumhq.org"}
		};
	}
	
	

}
