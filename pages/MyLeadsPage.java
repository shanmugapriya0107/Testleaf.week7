package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class MyLeadsPage extends Baseclass_Leaftaps {
	
	public MyLeadsPage(ChromeDriver driver)
	{
		this.driver = driver; 
	}
	
	public CreateLeadPage clickCreateLead()  
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() 
	{
		
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	public FindLeadsPage clickFindLeadsDeleteLead() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}

}