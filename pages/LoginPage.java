package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass_Leaftaps;

public class LoginPage extends Baseclass_Leaftaps {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver; 
	} 
	public LoginPage enterUsername(String Uname)  
	{
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(Uname);
		
		return this;
	}
	
	public LoginPage enterPassword(String Pword) 
	{
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(Pword);
		
		return this;
	}
	
	public HomePage clickLoginButton() 
	{
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		
		return new HomePage(driver);
	}

}
