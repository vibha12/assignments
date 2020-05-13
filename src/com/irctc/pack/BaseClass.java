package com.irctc.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		
		String key="webdriver.chrome.driver";
		String value="D://Workspace//GitTask//drivers//chromedriver.exe";
		System.setProperty(key, value);
		
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();//maximize browser window
		driver.get("https://opensource-demo.orangehrmlive.com/");//launch the application's url.
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//close the browser.
		driver.close();
		
	}

}
