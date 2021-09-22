package com.testing.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static WebDriver oBrowser=null;
	public static ActiTime b1=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		modifyTask();
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
			b1=new ActiTime(oBrowser);
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
			b1.getUserName().sendKeys("admin");
			b1.getPassword().sendKeys("manager");
			b1.getLogin().click();
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
			b1.getFlyOutWindow().click();
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
			b1.getLogout().click();
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
			b1.getTaskIcon().click();
			Thread.sleep(3000);
			b1.getaddButtonfortask().click();;
			Thread.sleep(3000);
			b1.getaddButtonforcust().click();
			Thread.sleep(3000);
			b1.getcustName().sendKeys("customer01");
			Thread.sleep(3000);
			b1.getsavecstm().click();
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
			b1.getcustEdit().click();
			Thread.sleep(3000);
			b1.getcustAction().click();
			Thread.sleep(3000);
			b1.getcustDelete().click();
			Thread.sleep(3000);
			b1.getconfirmDelete().click();
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
			b1.getaddButtonfortask().click();
			Thread.sleep(3000);
			b1.getprjtbtn().click();
			Thread.sleep(3000);
			b1.EnterNameForProject().sendKeys("project12");
			Thread.sleep(3000);
			b1.saveProject().click();
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
			b1.editProject().click();
			Thread.sleep(3000);
			b1.actionProject().click();
			b1.deleteProject().click();
			Thread.sleep(3000);
			b1.confirmdeleteProject().click();
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
			b1.getAddTask().click();
			Thread.sleep(3000);
			b1.getnewTask().click();
			Thread.sleep(3000);
			b1.getTN().sendKeys("task1");
			Thread.sleep(3000);
			b1.getST().click();
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
			b1.getclick().click();
			Thread.sleep(3000);
			b1.getclickdelete().click();
			Thread.sleep(3000);
			b1.getcnfrm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyTask()
	{
		try
		{
		b1.getmoditask().click();
			Thread.sleep(3000);
			b1.getTaskText().sendKeys("Rrrrrrccccccbbbb");
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}






