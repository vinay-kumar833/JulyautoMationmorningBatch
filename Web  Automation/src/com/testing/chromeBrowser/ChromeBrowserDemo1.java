package com.testing.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo1 
{
	public static WebDriver oBrowser =null;
	public static void main(String[]args)
	{
       launchBrowser();
	}
	static void launchBrowser()
	{
		try 
		{
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
