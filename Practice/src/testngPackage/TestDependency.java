package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void login()
	{
		System.out.println("Login done");
		Assert.assertEquals("Selenium","SE");
	}
	@Test(dependsOnMethods={"login"})
	public void doActivity()
	{
		System.out.println("Activity done");
	}
	@Test(dependsOnMethods={"login","doActivity"})
	public void logout()
	{
		System.out.println("Logout done");
	}

}
