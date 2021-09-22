package com.testing.chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorDemo {

	
		public static void main(String[] args) {
			InternetExplorerDriver ie = null;
			try {
				//1. Open browser and navigate the url
				//Loading chrome driver executable file viz., chromedriver.exe 
				System.setProperty("webdriver.ie.driver", 
						"D:\\DemoAutomation\\Automation\\Web  Automation\\LIBRARY\\DRIVERS\\chromedriver.exe");
				
				//It will launch the chrome browsre
				ie = new InternetExplorerDriver();
				
				//Maximize the browser browser
				ie.manage().window().maximize();
				
				//navigate the URL
				ie.get("http://localhost:82/login.do");
				Thread.sleep(2000);		//Waiting for 2 sec
				
				//Validate the url is loaded successful
				String sTitle = ie.getTitle();
				if(sTitle.equalsIgnoreCase("actiTIME - Login")) {
					System.out.println("The actiTime URL is navigated/opened successful");
				}else {
					System.out.println("Failed to open the actiTime URL");
					return;
				}
				
				
				//2. Enter username, password and click on Login button
				ie.findElement(By.id("username")).sendKeys("admin");
				ie.findElement(By.name("pwd")).sendKeys("manager");
				ie.findElement(By.id("loginButton")).click();
				Thread.sleep(3000);		//Waiting for 2 sec
				
				//Validate login is successful
				String sText = ie.findElement(By.xpath("//td[@class='pagetitle']")).getText();
				if(sText.equalsIgnoreCase("Enter Time-Track")) {
					System.out.println("Login to actiTime was successful");
				}else {
					System.out.println("Failed to login to actiTime.");
					return;
				}
				
				
				//3. Handle the window shortcut If exist
				/*WebElement objShortCut = ie.findElement(By.xpath("//*[@style='display: block;']"));
				if(objShortCut.isDisplayed()) {
					ie.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
				}*/
				
				
				//4. Logout from the actiTime
				ie.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
				
				//User should be loggedout successful
				WebElement objLoginHeader = ie.findElement(By.id("headerContainer"));
				if(objLoginHeader.getText().equalsIgnoreCase("Please identify yourself")) {
					System.out.println("Logout from the actiTime was successful");
				}else {
					System.out.println("Failed to logout from the actiTime");
					return;
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally {
				//5. CLose the browser
				ie.close();
				
				ie = null;
			}
		}
	}
