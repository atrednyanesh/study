package com.study.PracticeExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*	Practice Exercise

Launch new Browser
Open DemoQA.com website
Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
Come back to Home page (Use ‘Back’ command)
Again go back to Registration page (This time use ‘Forward’ command)
Again come back to Home page (This time use ‘To’ command)
Refresh the Browser (Use ‘Refresh’ command)
Close the Browser
*/

public class NavigationCommandsPractice {

	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url  ="http://www.DemoQA.com";
		String ELRegistrationButton = ".//*[@id='menu-item-374']/a";
		try {
		driver.manage().window().maximize();
		System.out.println("Window maximized");
		driver.get(url);
		System.out.println("Url opened");
		driver.findElement(By.xpath(ELRegistrationButton)).click();
		System.out.println("On registration page");
		driver.navigate().back();
		System.out.println("back on homepage");
		driver.navigate().forward();
		System.out.println("Forwarded on registrtaion page");
		driver.navigate().to(url);
		System.out.println("navigated to home Page");
		driver.navigate().refresh();
		System.out.println("Page is refreshed");
		driver.close();
		System.out.println("Browser closed");
		System.out.println("Success");
		}catch (Throwable t){
			System.out.println("Failure");
		}
		
	}

}
