package com.testing.chromeandfirefoxprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProfileDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
	
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\DemoAutomation\\Automation\\Web  Automation\\LIBRARY\\DRIVERS\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			oBrowser=new ChromeDriver(options);
			Thread.sleep(4000);
			oBrowser.get("https://www.icicibank.com/");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
