package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeMethod

	private void beforemethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod

	private void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@Test
	private void tc01() {
		System.out.println("Method  01 ");

	}

	@Test
	private void tc02() {
		System.out.println("Method  02 ");

	}

	@AfterClass
	private void afterclass() {
		System.out.println("After Class");
	}

}
