package junitpackage;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	Calculate c=new Calculate();
	int sum=c.sum(2, 5);
	int test_sum=7;
	@Test
	public void testSum()
	{
		System.out.println("@Test sum: "+test_sum);
		assertEquals(sum, test_sum);
	}

}
