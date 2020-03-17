package demo;

import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(dependsOnGroups= {"functional testing","smoke testing"})
	public void login() {
		System.out.println("TestCase1");
	}
	@Test(dependsOnGroups= {"functional testing","sanity testing"})
	public void search() {
		System.out.println("TestCase2");
	}
	@Test(dependsOnGroups= {"regression testing","re testing"})
	public void logout() {
		System.out.println("TestCase3");
	}
}