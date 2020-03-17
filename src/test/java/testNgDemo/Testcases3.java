package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Testcases3 
{	 
	WebDriver driver=new ChromeDriver();
  @Test
  public void Testcase1() 
  {
	 // WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
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
