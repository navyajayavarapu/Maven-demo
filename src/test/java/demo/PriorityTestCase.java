package demo;

import org.testng.annotations.Test;

public class PriorityTestCase {
	@Test(priority=2)
	public void testCase1() {
		System.out.println("testCase1");
	}
	@Test(priority=3,invocationCount=3,invocationTimeOut=5)
	public void testCase2() {
		System.out.println("testCase2");
	}
	@Test(priority=1)
	public void testCase() {
		System.out.println("testCase3");
	}
}