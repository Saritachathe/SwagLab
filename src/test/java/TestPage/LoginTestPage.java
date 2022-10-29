package TestPage;

import java.io.IOException;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sun.org.apache.bcel.internal.classfile.Utility;

import Pojo.Browser;
import Utility.PageElement;
import Utility.extentReports;
import Utility.parametrization;
import pom.swagLoginPage;


public class LoginTestPage extends PageElement{
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void configureReports() {
		reports = extentReports.Reports();
	}
	
	
	@BeforeMethod
	public void launchApplication() {
		driver=Browser.openBrowser();
		
	}
	@Test
	public void SwagLabLoginTest() throws IOException
	{
		test=reports.createTest("SwagLabLoginTest");
		swagLoginPage swagLoginPage = new swagLoginPage(driver);
		swagLoginPage.enteruserName(parametrization.getExcelData(0,0,"SwagData"));
		swagLoginPage.enterPassword(parametrization.getExcelData(1, 0, "SwagData"));	
		swagLoginPage.clickonlogin();
		String expectedUrl ="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
	}
	@AfterMethod
	public void captureResults(ITestResult result)
		{
	
			if(result.getStatus() == ITestResult.SUCCESS)
			{
				test.log(Status.PASS,result.getName());
			}
			else if(result.getStatus() == ITestResult.FAILURE) 
			{
				test.log(Status.FAIL, result.getName());
			}
			else 
			{
				test.log(Status.SKIP, result.getName());
			}
		}
		@AfterTest
		public void flushResults()
		{
		reports.flush();		
		}
}
