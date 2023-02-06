package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass_Leaftaps;
import pages.LoginPage;

public class TC_02_VerifyCreateLead extends Baseclass_Leaftaps{ 
	
	@BeforeTest
	public void setValue() 
	{
		excelFileName = "CreateLead_Data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String Uname, String Pword, String Fname, String Lname, String Cname) 
	{ 
		new LoginPage(driver)
		.enterUsername(Uname)
		.enterPassword(Pword) 
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads() 
		.clickCreateLead()
		.enterFirstName(Fname) 
		.enterLastName(Lname)
		.enterCompanyName(Cname)
		.clickCreateLeadFinal()
		.verifyLead();

	}
}
