package com.study.PracticeExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Practice Exercise 2

Launch new Browser
Open URL http://toolsqa.com/automation-practice-form/
Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
Identify Submit button with ‘tagName’, convert it in to string and print it on the console
Click on the Link “Link Test” (Use ‘linkTest’ locator)*/

public class LocatorExcercise2 {

	public static WebDriver driver  = new FirefoxDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL= "http://toolsqa.com/automation-practice-form/";
		
		try{
		driver.get(URL);
		driver.findElement(By.partialLinkText("Partial ")).click();
		WebElement submitButton = driver.findElement(By.tagName("button"));
		System.out.println(submitButton.getText());
		driver.findElement(By.linkText("Link Test")).click();
		
		System.out.println("Success");
		}catch (Throwable t)
		{
			System.out.println("failed");
		}
		
	}

}
