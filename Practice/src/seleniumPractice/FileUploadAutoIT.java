package seleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUploadAutoIT extends BrowserLaunch {

	public static void main(String[] args) {
		
		launchApp("firefox","http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		//driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\kalyan\\Pictures\\googlelogo_color_272x92dp.png");
		driver.findElement(By.id("photofile")).click();
		Sleeper.sleepTightInSeconds(3);
		try {
//			Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\Practice\\src\\autoit\\FileUpload.exe");
			Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\Practice\\src\\autoit\\FileUpload1.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
