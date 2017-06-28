package practise;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium Libs\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://seleniumhq.org");

	}

}
