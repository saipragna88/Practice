package com.javacodegeeks.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PrepareMyBagTest.class,AddPencilsTest.class})
public class SuiteTest {

}
