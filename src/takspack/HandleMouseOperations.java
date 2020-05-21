package takspack;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseOperations {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Workspace//GitTask//drivers//chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		
		Actions action =new Actions(driver);
		WebElement homelink=driver.findElement(By.xpath("//span[text()='Testing']"));
		action.moveToElement(homelink).build().perform();
		
		WebElement submenulink=driver.findElement(By.xpath("//span[text()='Agile Testing']"));
		submenulink.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}
