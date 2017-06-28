package seleniumPractice;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	static WebDriver driver=null;
	public static void launchApp(String browserName,String url) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name of browser you would like to use:");
//		String browserName=sc.nextLine();
//		sc.close();
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Libs\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		

	}

}
