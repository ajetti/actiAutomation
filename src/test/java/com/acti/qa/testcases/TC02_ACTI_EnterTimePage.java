package com.acti.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.BaseClass;
import com.acti.qa.pages.EnterTimePage;
import com.acti.qa.pages.LoginPage;
//press [control shift o] to remove unwanted imports

public class TC02_ACTI_EnterTimePage extends TC00_ACTI_BaseTest 
{
	
	
	@Test(priority=1)
	public void testValidateTabsDisplayed()
	{
		
		boolean flag1 = ep.tabDisplayed1();
		System.out.println(flag1);
		Assert.assertTrue(flag1);
		
	}
	@Test(priority=2)
	public void testNameDisplayed()
	{
		String name=ep.validateUsernameDisplayed();
		System.out.println(name);
	}
	
	@Test
	public void testLogout()
	{
		ep.logout();
	}
	
	
	}

