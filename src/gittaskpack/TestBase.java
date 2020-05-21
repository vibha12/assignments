package gittaskpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.LaunchSuite;

public class TestBase extends Helper  {
	
	public static WebDriver driver;
	
	//Helper hlper;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:/Workspace/GitTask/drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
	     launchUrl(driver, "http://demo.guru99.com/test/delete_customer.php");
	     sleep(10);
	     handlwindowmax_min(driver);
	     
	}
	
	

	@AfterMethod
	public void  quiteBrowser()
	{
		driver.close();
	}

}
