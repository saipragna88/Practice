package com.javacodegeeks.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest {
	private int expected;
	private int first;
	private int second;
	
	public CalculateTest(int expected, int first, int second) {
		this.expected=expected;
		this.first=first;
		this.second=second;
	}
	
	@Parameters
	public static Collection numbers()
	{
		return (Collection) Arrays.asList(new Integer[][]{
			{3,1,2},
			{4,2,2},
			{50,10,40},
			{300,150,150}
		});
	}
	@Test
	public void sum()
	{
		Calculate c=new Calculate();
		System.out.println("Addition with parameters : "+first+" "+second);
		Assert.assertEquals(expected, c.sum(first, second));
	}
}
