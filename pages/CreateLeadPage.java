package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class CreateLeadPage extends Baseclass_Leaftaps 
{
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;    
	}	
	 
	public CreateLeadPage enterFirstName(String Fname) 
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;

	}
	
	public CreateLeadPage enterLastName(String Lname) 
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;

	}
	
	public CreateLeadPage enterCompanyName(String Cname) 
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		return this;

	}
	
	public ViewLeadPage clickCreateLeadFinal() 
	{
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		return new ViewLeadPage(driver);

	}
	
}
