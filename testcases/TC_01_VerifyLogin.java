package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass_Leaftaps;
import pages.LoginPage;

public class TC_01_VerifyLogin extends Baseclass_Leaftaps
{
	
	@BeforeTest
	public void setValue() 
	{
		excelFileName = "Login_Data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String Uname, String Pword) 
	{
		new LoginPage(driver)
		.enterUsername(Uname)
		.enterPassword(Pword)
		.clickLoginButton();

	}
}
