package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass_Leaftaps;
import pages.LoginPage;

public class TC_04_VerifyDuplicateLead extends Baseclass_Leaftaps
{
	@BeforeTest
	public void setValue() 
	{
		excelFileName = "DuplicateLead_Data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runDuplicateLead(String Uname, String Pword, String email) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUsername(Uname)
		.enterPassword(Pword) 
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.enterEmailDuplicateLead(email)
		.clickFindLeadsButtonDuplicateLead()
		.verifyFirstResultingLead()
		.clickFirstResultingLeadDuplicateLead()
		.clickDuplicateLead()
		.verifyTitleOfDuplicateLeadPage()
		.clickCreateLeadDuplicateLead()
		.verifyCapturedNameDuplicateLead();
		
}
}
