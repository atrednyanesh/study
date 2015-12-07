package com.study.basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigationCommands {
	
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	
	String url = "http://www.DemoQA.com";	
		/*1. Navigate To Command*/
		driver.navigate().to(url);
				
		/*2.Forward Command*/
		driver.navigate().forward();
		
		/*3.Back Command*/
		driver.navigate().back();
		
		/*4.Refresh Command*/
		driver.navigate().refresh();
		
		driver.close();
		System.out.println("done");
		
	}

}
