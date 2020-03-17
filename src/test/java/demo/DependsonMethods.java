package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsonMethods {
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods= {"login"})
	public void search() {
		System.out.println("search");
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=false)
	public void logout() {
		System.out.println("logout");
	}
}