package com.study.PracticeExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExcercise1 {

/*	Practice Exercise 1

	Launch new Browser
	Open URL http://toolsqa.com/automation-practice-form/
	Type Name & Last Name (Use Name locator)
	Click on Submit button (Use ID locator)*/
	
	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Dnyanesh");
		driver.findElement(By.name("lastname")).sendKeys("Atre");
		
		driver.findElement(By.id("submit")).click();
		driver.close();
		System.out.println("done");
		
		
	}

}
