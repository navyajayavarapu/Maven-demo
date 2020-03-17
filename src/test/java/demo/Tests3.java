package demo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Tests3 
{	 
	WebDriver driver=new ChromeDriver();
  @Test
  public void Testcase1() 
  {
	 // WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();
  }
  @Test
  public void Testcase2() 
  {
	 // WebDriver driver=new ChromeDriver();
	  driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do");
  }
  @Test
  public void Testcase3() 
  {
	  	//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @AfterMethod
  public void afterMethod() throws IOException
  {	
	    WebDriver driver=new ChromeDriver();
	    TakesScreenshot ts=((TakesScreenshot)driver);
		File Store=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Store, new File("D:\\Java\\locatorsconcept\\takescreenshot\\.png"));
  }

}
