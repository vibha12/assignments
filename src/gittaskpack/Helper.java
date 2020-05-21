package gittaskpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	
	public static void launchUrl(WebDriver driver,String url)
	{
		driver.get(url);
	}
   
	
	public static  void sleep(int time) throws InterruptedException
	{
		time=time*1000;
		Thread.sleep(time);
		//System.out.println(time);
	}
	
	public static void handlwindowmax_min(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public static void explicitlyWait(WebDriver driver, int time,WebElement wb)
	{
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	
public static void acceptAlertPopup(WebDriver driver)
	
	{ 
		Alert alt=driver.switchTo().alert();
	String text=	alt.getText();
	System.out.println(text);
		alt.accept();
		
	}

public static void DeclinedAlertPopup(WebDriver driver)

{
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
	
	
}
public static void enterValueOnAlert(WebDriver driver,String value)
{
	Alert alt=driver.switchTo().alert();
	alt.sendKeys(value);
	alt.accept();
	
}

	
}
