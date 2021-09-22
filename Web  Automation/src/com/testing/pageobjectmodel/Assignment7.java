package com.testing.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static WebDriver oBrowser=null;
	public static ActiTime oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deletetask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\DemoAutomation\\\\Automation\\\\Web  Automation\\\\LIBRARY\\\\DRIVERS\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTime(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	public static void createCustomer()
	{
		try
		{
			oPage.getTaskIcon().click();
			Thread.sleep(3000);
			oPage.getaddButtonfortask().click();;
			Thread.sleep(3000);
			oPage.getaddButtonforcust().click();
			Thread.sleep(3000);
			oPage.getcustName().sendKeys("customer1");
			Thread.sleep(3000);
			oPage.getsavecstm().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteCustomer()
	{
		try
		{    
			oPage.getcustEdit().click();
			Thread.sleep(3000);
			oPage.getcustAction().click();
			Thread.sleep(3000);
			oPage.getcustDelete().click();
			Thread.sleep(3000);
			oPage.getconfirmDelete().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void createProject()
	{
		try
		{
			oPage.getaddButtonfortask().click();
			Thread.sleep(3000);
			oPage.getprjtbtn().click();
			Thread.sleep(3000);
			oPage.EnterNameForProject().sendKeys("project12");
			Thread.sleep(3000);
			oPage.saveProject().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteProject()
	{
		try
		{
			oPage.editProject().click();
			Thread.sleep(3000);
			oPage.actionProject().click();
			oPage.deleteProject().click();
			Thread.sleep(3000);
			oPage.confirmdeleteProject().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void  createTask()
	{
		try
		{
			oPage.getAddTask().click();
			Thread.sleep(3000);
			oPage.getnewTask().click();
			Thread.sleep(3000);
			oPage.getTN().sendKeys("task1");
			Thread.sleep(3000);
			oPage.getST().click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletetask()
	{
		try
		{
			oPage.getclick().click();
			Thread.sleep(3000);
			oPage.getclickdelete().click();
			Thread.sleep(3000);
			oPage.getcnfrm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}






