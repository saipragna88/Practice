package junitpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Annotations {
	
	private ArrayList<String> testArray;
	
	@BeforeClass
	public static void onceExecutedBeforeAll()
	{
		System.out.println("@BeforeClass:onceExecutedBeforeAll");
	}
	
	@Before
	public void onceExecutedBeforeEach()
	{
		testArray=new ArrayList<String>();
		System.out.println("@Before:onceExecutedBeforeEach");
	}
	
	@After
	public void onceExecutedAfterEach()
	{
		testArray.clear();
		System.out.println("@After:onceExecutedAfterEach");
	}
	
	@AfterClass
	public static void onceExecutedAfterAll()
	{
		System.out.println("@AfterClass:onceExecutedAfterAll");
	}
	
	@Test
	public void emptyCollection()
	{
		assertTrue(testArray.isEmpty());
		System.out.println("@Test:emptyCollection");
	}
	
	@Test
	public void oneItemCollection()
	{
		testArray.add("a");
		assertEquals(1, testArray.size());
		System.out.println("@Test:oneItemCollection");
	}
	
	@Ignore
	public void executionIgnored()
	{
		System.out.println("@Ignore:executionIgnored");
	}
	
	
	

}