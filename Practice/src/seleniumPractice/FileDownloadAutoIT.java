package seleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownloadAutoIT extends BrowserLaunch {

	public static void main(String[] args) {

		launchApp("firefox","http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.4.0")).click();
		Sleeper.sleepTightInSeconds(5);
		try {
			Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\Practice\\src\\autoit\\FileDownload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
