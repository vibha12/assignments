package com.irctc.pack;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.get("https://ui.cogmento.com/");//launch the application's url.
	    sleep(6);
	}
	
	public void implicitlyWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public  static void sleep(int seconds)
	{
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void click(WebElement wbe)
	{
		wbe.click();
	}
	
	public static void uploadfile(WebDriver driver, WebElement wb)
	{
		String workingdir= System.getProperty("user.dir");
		System.out.println(workingdir);
		String filepath=workingdir+ "..uploadfile/abc.txt";
		//File f=new File(filepath);
		//driver.get(filepath);
		//wb.click();
		wb.sendKeys(filepath);
	
	}
	
	public static void handleScrolls( WebDriver driver,WebElement wb  )
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",wb);
	}
	
	public void sendkeys(WebDriver driver,String value,WebElement wb, int time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.MILLISECONDS);
		wb.sendKeys(value);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//close the browser.
		driver.close();
		
	}

}
