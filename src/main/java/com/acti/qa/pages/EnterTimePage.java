package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.BaseClass;

public class EnterTimePage extends BaseClass
{

	/* tester:Anisha
	 * 2.Date:08/28/2019
	 * 3.Description:Login page Object
	 * verified by:Jetti	 
	 */
//*********************Page Elements******************************
	@FindBy(xpath="//div[@id='container_tt']")WebElement TimeTrackTab;
	@FindBy(xpath="//div[@id='container_tasks']")WebElement TasksTab;
	@FindBy(xpath="//div[@id='container_reports']")WebElement ReportsTab;
	@FindBy(xpath="//div[@id='container_users']")WebElement UsersTab;
	@FindBy(xpath="//a[@class='userProfileLink username']")WebElement JohnDoeLink;
	@FindBy(xpath="//a[text()='Logout']")WebElement LogoutLink;
//************************Page Initialization*******************************
	public EnterTimePage()//constructor
	{
		PageFactory.initElements(driver, this);//here this refers to current class i.e LoginPage.class
	}
//****************************Page Actions**************************************
	public boolean tabDisplayed1()
	{
		return TimeTrackTab.isDisplayed();
	}
	public boolean tabDisplayed2()
	{
		return TasksTab.isDisplayed();
	}
	public void clickTasktabClick()
	{
		TasksTab.click();
	}
	public boolean tabDisplayed3()
	{
		return ReportsTab.isDisplayed();
	}
	public boolean tabDisplayed4()
	{
		return UsersTab.isDisplayed();
	}
	public String validateUsernameDisplayed()
	{
		 return JohnDoeLink.getText();
		
	}
	public LoginPage logout()//here return type is loginpage obj beacuse after clicking logout the control goes back to login page
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	{
		LogoutLink.click();
		return  new LoginPage();
	}
}
