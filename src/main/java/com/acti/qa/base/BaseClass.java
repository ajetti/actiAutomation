package com.acti.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

//this is unit testing

/*//just for better understanding
 	Tester :Anisha
 	Date Created :08/28/2019
 	verified by:Jetti
 	Description:Parent class
 	*/

public class BaseClass {

	//this class is also mostly called driver script in real time
	public static WebDriver driver;//we are gonna use these in other methods so making them as global variables
	public static Properties prop;
	
	public BaseClass()//try and catch block in constructor
	{
		try
		{
			//create an object of file(from io package) ,file input stream(from io package)
			//,properties ( from util.properties package)
			File src = new File("./acti-config/config.properties");
			//the path is copied from by right clicking the config.properties file
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println("file not found exception"+e.getMessage());
		}
	}
	
	//@Test: to make sure this code works we can add @test annotation and run as testNG application
	public static void init()//initializing in this method
	{
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome"))
		{//copy path from chromedriver.exe but not full just foldername plus exe
		 System.setProperty("webdriver.chrome.driver", "./acti-browsers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			 System.setProperty("webdriver.gecko.driver", "./acti-browsers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("ie"))
		{
			 System.setProperty("webdriver.ie.driver", "./acti-browsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
			
		else{
			System.out.println("browser not valid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
