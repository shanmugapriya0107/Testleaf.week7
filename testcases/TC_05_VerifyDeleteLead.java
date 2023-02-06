package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass_Leaftaps;
import pages.LoginPage;

public class TC_05_VerifyDeleteLead extends Baseclass_Leaftaps
{
	@BeforeTest
	public void setValue() 
	{
		excelFileName = "DeleteLead_Data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runDeleteLead(String Uname, String Pword, String phone) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUsername(Uname)
		.enterPassword(Pword) 
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNumber(phone)
		.clickFindLeadsButtonDeleteLead()
		.verifyFirstResultingLeadIDDeleteLead()
		.clickFirstResultingLeadDeleteLead()
		.clickDeleteButton()
		.clickFindLeadsDeleteLead()
		.enterCapturedIDDeleteLead()
		.clickFindLeadsButtonDeleteLeadFinal()
		.verifyDeleteLeads();
	}
}
