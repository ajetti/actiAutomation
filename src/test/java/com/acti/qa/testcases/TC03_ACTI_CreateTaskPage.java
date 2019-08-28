package com.acti.qa.testcases;

import org.testng.annotations.Test;

public class TC03_ACTI_CreateTaskPage extends TC00_ACTI_BaseTest
{

	@Test(priority=1)
	public void TestCreateUser()
	{
		cp.createUserMethod("ansh", "jetti");
		String name = cp.verifyUserCreated();
		System.out.println(name);
	}
	
}
