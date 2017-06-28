package com.javacodegeeks.junit;

import java.util.Arrays;

public class FirstDayAtSchool {

	public String[] prepareMyBag()
	{
		String[] schoolBag={"Books","Pens","Notebooks"};
		System.out.println("Schoolbag contains "+Arrays.toString(schoolBag));
		return schoolBag;
	}
	
	public String[] addPencils()
	{
		String[] schoolBag={"Books","Pens","Notebooks","Pencils"};
		System.out.println("Now schoolbag contains "+Arrays.toString(schoolBag));
		return schoolBag;
	}
	
}
