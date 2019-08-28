package com.acti.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.qa.base.BaseClass;
import com.acti.qa.pages.CreateTaskPage;
import com.acti.qa.pages.EnterTimePage;
import com.acti.qa.pages.LoginPage;

public class TC00_ACTI_BaseTest extends BaseClass
{
	//class which extends baseclass and carries before and methods of testcases
	//so the testclasses have to extend this class 
	EnterTimePage ep;
	LoginPage lp;
	CreateTaskPage cp;
	public TC00_ACTI_BaseTest()
	{
		super();
		// to invoke a superclass constructor i.e baseclass constructor which loads the config file
	}
	
	@BeforeMethod
	public void preTest()
	{
		init();
		cp = new CreateTaskPage();
		ep = new EnterTimePage();
		lp= new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		//prop is an object of properties class
	}
	@AfterMethod
	public void cleanUp()
	{
		driver.close();
	}
	
}
