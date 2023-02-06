package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelData_Leaftaps;

public class Baseclass_Leaftaps {
	
	//public ChromeDriver driver; // for parallel execution
	public static ChromeDriver driver; // for sequential execution
	public String excelFileName;
	 
	@DataProvider(name="fetchData")
	public String[][] createLeadSendData() throws IOException 
	{
		String[][] readExcelData = ReadExcelData_Leaftaps.readExcelDataLeaftaps(excelFileName);
		return readExcelData;

	}
	
	@BeforeMethod 
	public void preCondition() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@AfterMethod
	public void postCondition() 
	{
		driver.close();
	}

}
