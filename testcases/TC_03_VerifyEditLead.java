package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass_Leaftaps;
import pages.LoginPage;

public class TC_03_VerifyEditLead extends Baseclass_Leaftaps
{
	@BeforeTest
	public void setValue() 
	{
		excelFileName = "EditLead_Data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runEditLead(String Uname, String Pword, String Fname, String changeCompanyName) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUsername(Uname)
		.enterPassword(Pword) 
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstNameEditLead(Fname)
		.clickFindLeadsButtonEditLead()
		.clickFirstResultingLeadEditLead()
		.verifyTitltOfPageEditLead()
		.clickEditButton()
		.changeCompanyName(changeCompanyName)
		.clickUpdateButton()
		.verifyChangedCompanyNameAppears();
		
	}
}
