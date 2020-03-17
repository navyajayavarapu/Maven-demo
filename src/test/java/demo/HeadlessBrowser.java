package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowser

{
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new HtmlUnitDriver();
	driver.manage().window().maximize();
	}
}
