package com.irctc.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	
	
	
	@Test(description="Verify the valid credentials login. ",priority=2)
	public void verifyValidUserLogin() throws InterruptedException
	{
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		 uname.sendKeys("Admin");
		 
		 WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement signInbtn=driver.findElement(By.xpath("//input[@class='button']"));
		signInbtn.click();
		Thread.sleep(3000);
		
		Reporter.log("User logged in Successfully.");
		//to verify the user redirected on correct url!!
		String actualcurrenturl=driver.getCurrentUrl();
		System.out.println("Current Url :"+actualcurrenturl);
		String expectedCurrentUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualcurrenturl, expectedCurrentUrl);
		
		WebElement wellink=driver.findElement(By.id("welcome"));
		wellink.click();
		Thread.sleep(3000);
		//click on logout button
		WebElement logoutlink= driver.findElement(By.linkText("Logout"));
		logoutlink.click();
		Reporter.log("User logout successfully.");
	}
	@Test(priority=1,description="to check the wrong credentials.")
	public void verfiyWrongCredentials()
	{
		WebElement uname=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		 uname.sendKeys("Admin11");
		 
		 WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement signInbtn=driver.findElement(By.xpath("//input[@class='button']"));
		signInbtn.click();
		
        
		String actualvalidationmessage=driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText();
		System.out.println("Error message for wrong credentials :"+actualvalidationmessage);
		String expectedvalidationmsg="Invalid credentials";
		Assert.assertEquals(actualvalidationmessage, expectedvalidationmsg, "Wrong credentials,pls enter valid one");
		Reporter.log("Invalid credentials error mesg check");
		
	}

}
