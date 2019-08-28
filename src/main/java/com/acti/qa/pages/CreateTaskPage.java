package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.BaseClass;

public class CreateTaskPage extends BaseClass
{
	/* tester:Anisha
	 * 2.Date:08/28/2019
	 * 3.Description:Login page Object
	 * verified by:Jetti	 
	 */
//*********************Page Elements*****************************************
	@FindBy(xpath="//div[@id='container_tasks'] ")WebElement TasksTab;
	@FindBy(xpath="//div[text()='Add New']")WebElement AddNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")WebElement NewCustomerBtn;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")WebElement CustNameTB;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description'] ")WebElement DescriptionTB;
	@FindBy(xpath="//div[contains(text(),'Create Customer')] ")WebElement CreateCustBtn;
	@FindBy(xpath="//div[@class='title'][contains(text(),'test')]")WebElement CreatedTaskName;
//***********************Page Initialization*************************************
		public CreateTaskPage()//constructor
		{
			PageFactory.initElements(driver, this);//here this refers to current class i.e LoginPage.class
		}
	//*****************************Page Actions***************************
		public void createUserMethod(String custname,String description)
		{
			TasksTab.click();
			AddNewBtn.click();
			NewCustomerBtn.click();
			CustNameTB.sendKeys(custname);
			DescriptionTB.sendKeys(description);
			CreateCustBtn.click();
		}
		
		public String verifyUserCreated()
		{
			String user = CreatedTaskName.getText();
			return user;
			
			
			
			
		}
}
