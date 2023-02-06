package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class ViewLeadPage extends Baseclass_Leaftaps 
{
	public ViewLeadPage(ChromeDriver driver)
	{ 
		this.driver = driver; 
	}
	
	public ViewLeadPage verifyLead() 
	{
		System.out.println("Lead is created");
		return this;
	}
	
	public ViewLeadPage verifyTitltOfPageEditLead() 
	{
		System.out.println("The Title of the page is: " + driver.getTitle());
		return this;
	}
	
	public OpentapsCRMPage clickEditButton() 
	{
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		return new OpentapsCRMPage(driver);

	}
	
	public ViewLeadPage verifyChangedCompanyNameAppears() 
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of the company is " +text);
		return this;
	}
	
	public DuplicateLeadPage clickDuplicateLead() 
	{
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public void verifyCapturedNameDuplicateLead() 
	{
		String attribute = driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).getAttribute("value");
		//System.out.println(attribute);
		String res = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		//System.out.println(res);
		if(attribute.equals(res))
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different name");
		}
	
	}
	
	public MyLeadsPage clickDeleteButton() 
	{
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		return new MyLeadsPage(driver);
	}
	
	
	
	
	
	
	
	
	
}