package com.acti.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.BaseClass;
import com.acti.qa.pages.LoginPage;

public class TC01_ACTI_LoginPageTest extends TC00_ACTI_BaseTest
{

	
	
	@Test(priority=1)
	public void testVerifyActivelogo()
	{
		boolean flag = lp.logoDisplayed();
		System.out.println(flag);
		Assert.assertTrue(flag);//verifying if logo is displayed by test is passed//validate if test is passed
		
	}
	
	@Test(priority=2)
	public void testVerifyCredentials() throws Exception
	{
		lp.login("admin", "manager");
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Enter"));
	}
	
	
	
	
}
