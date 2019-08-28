package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.BaseClass;

public class LoginPage extends BaseClass
{

	/* tester:Anisha
	 * 2.Date:08/28/2019
	 * 3.Description:Login page Object
	 * verified by:Jetti	 
	 */
	
 
	//@findby is an annotation coming from selenium
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actilogo;
	@FindBy(id="username")WebElement usernameTb;
	@FindBy(name="pwd")WebElement passwordTb;
	@FindBy(id="loginButton")WebElement loginBtn;
	//***********************Page Initilization*********************
	public LoginPage()//constructor
	{
		PageFactory.initElements(driver, this);//here this refers to current class i.e LoginPage.class
	}
//*****************************Page Actions***************************
	public boolean logoDisplayed()
	{
		return actilogo.isDisplayed();
	}
	public EnterTimePage login(String username,String password)//return type is EnterTimePage object
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginBtn.click();
		return  new EnterTimePage();//creating obj for home page
	}
}
