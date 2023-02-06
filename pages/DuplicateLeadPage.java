package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class DuplicateLeadPage extends Baseclass_Leaftaps
{
	public DuplicateLeadPage(ChromeDriver driver)
	{ 
		this.driver = driver; 
	}
	
	public DuplicateLeadPage verifyTitleOfDuplicateLeadPage() 
	{
		System.out.println("The Title of the page is: " + driver.getTitle());
		return this;
	}
	
	public ViewLeadPage clickCreateLeadDuplicateLead() 
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewLeadPage(driver);
	}
}
