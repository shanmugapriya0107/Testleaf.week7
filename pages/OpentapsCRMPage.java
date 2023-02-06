package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class OpentapsCRMPage extends Baseclass_Leaftaps
{
	public OpentapsCRMPage(ChromeDriver driver)
	{
		this.driver = driver;    
	}	
	
	public OpentapsCRMPage changeCompanyName(String changeCompanyName) 
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(changeCompanyName);
		return this;
	}	
	
	public ViewLeadPage clickUpdateButton() 
	{
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
	
	
	
	
}
