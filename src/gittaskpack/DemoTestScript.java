package gittaskpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.git.pages.*;

public class DemoTestScript extends TestBase {
 
	@Test(priority=1)
	public void openSeoMenuLink() throws InterruptedException
	{
		
		WebElement seomenu=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		DeleteCustomerPage.clickonElements(seomenu);
	//	Actions action=new Actions(driver);
		//action.moveToElement(seomenu).build().perform();
	    // DeleteCustomerPage.handleMouseHover(driver, seomenu);
	     WebElement menuoption=driver.findElement(By.xpath("//a[text()='Page-4']"));
	     menuoption.click();
	     
	     DeleteCustomerPage.printPageTitle(driver, "SEO Demo Page-4");
	  
	    
	}
	@Test(priority=2)
	public void DeleteUser() throws InterruptedException
	{
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='submit']")) ;
		DeleteCustomerPage.clickonElements(submitbtn);
		//sleep(5);
		acceptAlertPopup(driver);
	}
}

