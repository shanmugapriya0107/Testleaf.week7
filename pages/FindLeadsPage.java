package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class FindLeadsPage extends Baseclass_Leaftaps 
{
	public FindLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;    
	}	
	
	public FindLeadsPage enterFirstNameEditLead(String Uname) 
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Uname);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButtonEditLead() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLeadEditLead() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new ViewLeadPage(driver);

	}
	
	public FindLeadsPage clickEmail() 
	{	
		driver.findElement(By.linkText("Email")).click();
		return this;
	}
	
	public FindLeadsPage enterEmailDuplicateLead(String email) 
	{
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[1]")).sendKeys(email);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButtonDuplicateLead() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public FindLeadsPage verifyFirstResultingLead() throws InterruptedException 
	{
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		return this;
	}
	public ViewLeadPage clickFirstResultingLeadDuplicateLead() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new ViewLeadPage(driver);
	}
	
	public FindLeadsPage clickPhone() 
	{
		driver.findElement(By.linkText("Phone")).click();
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String phone) 
	{
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys(phone);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButtonDeleteLead() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public FindLeadsPage verifyFirstResultingLeadIDDeleteLead() throws InterruptedException 
	{
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLeadDeleteLead() 
	{
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new ViewLeadPage(driver);
	}
	
	public FindLeadsPage enterCapturedIDDeleteLead() 
	{
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.name("id")).sendKeys(text);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButtonDeleteLeadFinal() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public FindLeadsPage verifyDeleteLeads() 
	{
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
		return this;
	}

}
