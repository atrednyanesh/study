package com.study.browserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String exePath = "D:\\other\\chromedriver_win32 (1)\\chromedriver.exe";
		String URL = "http://www.wikipedia.com";
		
		
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*1. get command - to go to specific url*/

		driver.get(URL);
		System.out.println("successful");
		
		/*2. Get Title Command  - This method fetches the Title of the current page. */
		String title = driver.getTitle();
		System.out.println("Title of current page is " + "*******"+title+ "*******");
		
		
		/*3. Get Current URL Command - This method fetches the string representing the Current URL which is opened in the browser. 
		 Accepts nothing as a parameter and returns a String value.*/
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is "+ "*******"+currentUrl+ "*******");
		
		
		/*4.Get Page Source Command - This method returns the Source Code of the page.*/
		String PageSource = driver.getPageSource();
		System.out.println("*****************************************************************************************************");
		System.out.println(PageSource);
		System.out.println("*****************************************************************************************************");

		
		/*5.Close Command - closes the browser window for current instance*/
		driver.close();
		
		
		
		
	}

}
