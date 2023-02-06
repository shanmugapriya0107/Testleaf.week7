package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class HomePage extends Baseclass_Leaftaps {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;  
	} 
	
	public MyHomePage clickCRMSFA()  
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}

}