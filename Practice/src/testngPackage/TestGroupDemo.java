package testngPackage;

import org.testng.annotations.Test;

public class TestGroupDemo {
	
	@Test(groups={"smoke"})
	public void Login()
	{
		System.out.println("Login done");
		System.out.println("smoke scenario passed");
	}
	
	@Test(groups={"regression"})
	public void Register()
	{
		System.out.println("Registration done");
	}

}
