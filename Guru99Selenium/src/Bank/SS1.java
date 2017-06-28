package Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS1 {

	public static void main(String[] args) {
		String baseUrl="http://www.demo.guru99.com/V4/";
		String expectedTitle="Guru99 Bank Manager HomePage";
		WebDriver driver=new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uid")).sendKeys("mngr78908");
		driver.findElement(By.name("password")).sendKeys("UsUjyzE");
		driver.findElement(By.name("btnLogin")).click();
		
		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login failed");
		}

	}

}
