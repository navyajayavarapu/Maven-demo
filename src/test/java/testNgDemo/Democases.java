package testNgDemo;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Democases 
{
	WebDriver driver;
	  @Test
	  public void Testcase1() 
	  {
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 System.out.println("Orange HRM");
		
	  }
	  @Test
	  public void Testcase2() 
	  {
		  driver=new ChromeDriver();
		  driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do");
		  System.out.println("PRTC");
	  }
	  @Test
	  public void Testcase3() 
	  {
		  	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.easycalculation.com/");
			System.out.println("Easy calculation");
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
			//driver=new ChromeDriver();
			//driver.manage().window().maximize();
			System.out.println("Before method");
	  }

	  @AfterMethod
	  public void afterMethod() throws IOException 
	  {
		  	//driver=new ChromeDriver();
			System.out.println("after method");
			driver.close();
	  }

}
