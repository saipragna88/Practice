package com.javacodegeeks.junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PrepareMyBagTest {

	FirstDayAtSchool obj=new FirstDayAtSchool();
	String[] bag1={"Books", "Pens", "Notebooks"};
	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, obj.prepareMyBag());
	}
}
