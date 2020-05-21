package com.git.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteCustomerPage {
	
	public static void handleMouseHover(WebDriver driver, WebElement wb)
	{
		Actions action=new Actions(driver);
		action.moveToElement(wb).build().perform();
		
		
	}
	
	public static void clickonElements( WebElement wb)
	{
		wb.click();
	}

	public static void printPageTitle(WebDriver driver,String title)
	{
		 title=driver.getTitle();
		 System.out.println(title);
		 
	
	}
	  
	


	
}
