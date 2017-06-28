package testngDataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestngMaster {
	
	public static WebDriver driver;
//	public String url="http://opensource.demo.orangehrmlive.com/";
	public String expVal, actVal;
//	public String uname="Admin", pwd="admin";
//	public String fName="Pari",lName="Hiken";
//	public String eName=fName+" "+lName,uName=fName+lName+"12345",pswd=fName+lName+"12345",cpswd=fName+lName+"12345";
	@BeforeSuite
	@Parameters({"url"})
	public void Launch(String url)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		expVal="LOGIN";
		actVal= driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actVal, expVal, "Launch Failed");
		
		
	}
	
	@BeforeTest
	@Parameters({"uname","pwd"})
	public void Login(String uname, String pwd)
	{
		expVal="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		actVal=driver.getCurrentUrl();
		
		Assert.assertEquals(actVal,expVal,"Login Failed");
	}
	
	@AfterTest
	public void Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		expVal="LOGIN";
		actVal= driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actVal, expVal,"Logout Failed");
	}
	
	@AfterSuite
	public void Close()
	{
		driver.close();
	}
	

}
