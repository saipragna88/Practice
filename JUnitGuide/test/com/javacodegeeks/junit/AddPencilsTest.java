package com.javacodegeeks.junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AddPencilsTest {

	FirstDayAtSchool obj=new FirstDayAtSchool();
	String[] bag2={"Books", "Pens", "Notebooks","Pencils"};
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, obj.addPencils());
	}
}
