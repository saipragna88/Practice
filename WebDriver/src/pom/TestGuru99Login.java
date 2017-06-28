package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestGuru99Login
{
	WebDriver driver;
	Guru99Login objLogin;
	Guru99Home objHome;
	
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	

	@Test
	public void test_HomePageAppearCorrect()
	{
		objLogin = new Guru99Login(driver);
		String loginPageTitle=objLogin.getLoginTitletext();
		Assert.assertTrue(loginPageTitle.equalsIgnoreCase("guru99 bank"));
		objLogin.loginToGuru99("mngr78908", "UsUjyzE");
		objHome=new Guru99Home(driver);
		String homePageUsername=objHome.getHomePageUserName();
		Assert.assertTrue(homePageUsername.equalsIgnoreCase("Manger Id : mngr78908"));
		
	}

}
