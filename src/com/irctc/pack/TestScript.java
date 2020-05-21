package com.irctc.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	
	
	@Test
  public void uploadimag() throws InterruptedException
  {
		WebElement uname=driver.findElement(By.xpath("//input[@name='email']"));
		 uname.sendKeys("vibhagupta51@gmail.com");
		 
		 WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Vibha@1234");
		
		WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login']"));
		loginbtn.click();
		sleep(5);
		
		WebElement contact_link=driver.findElement(By.xpath("//span[text()='Contacts']"));
		contact_link.click();
		  sleep(3);
		WebElement Createcontactbtn=driver.findElement(By.xpath("//a[@href='/contacts/new']"));
		Createcontactbtn.click();
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
		WebElement fstnametxt=driver.findElement(By.xpath("//input[@name='first_name']"));
		sendkeys(driver, "Alfredo", fstnametxt, 5000);
		
		WebElement lastnametxt=driver.findElement(By.xpath("//input[@name='last_name']"));
		sendkeys(driver,"mouse" , lastnametxt, 3000);
		WebElement imagdiv =driver.findElement(By.xpath("//div[@class='ui left labeled input']"));
		//imag.click();
	    handleScrolls(driver, imagdiv);
	    
	    WebElement uploadfile=driver.findElement(By.xpath("//div[@class='ui left labeled input']/input[@name='image']"));
	    //uploadfile.click();
	    uploadfile(driver, uploadfile);
	    
	    WebElement savebtn=driver.findElement(By.xpath("//button[text()='Save']"));
	    click(savebtn);
	    implicitlyWait(driver, 3000);
	   
		
  }

}
