package com.study.module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
	 
	public static void main(String[] args) throws Throwable {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 		
        // Close the driver
        driver.quit();
    }
}