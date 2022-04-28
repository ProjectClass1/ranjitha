package org.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterMethod;

public class A {
	@org.junit.BeforeClass
	public static void tc01() {
		System.out.println("test");
	}
	@Before
	public void beforeM() {
          System.out.println("beforeMethod");
	}
	
	@Test
	public void test4() {
System.out.println("test4");
	}
	
	@AfterMethod
	public void afterMethod() {
System.out.println("afterMethod");
	}
	@AfterClass
	public static void afterClass() {
System.out.println("afterClass");
	}
	
	
}
