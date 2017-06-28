package testngPackage;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {

	@Test(priority=0)
	public void function1()
	{
		System.out.println("function1 code");
	}
	
//	@Test(enabled=false)
	public void function2()
	{
		throw new SkipException("Skipped function2");
//		System.out.println("function2 code");
	}
	
	@Test(priority=2)
	public void a()
	{
		System.out.println("a code");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method code");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method code");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class code");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class code");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test code");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test code");
	}
}
