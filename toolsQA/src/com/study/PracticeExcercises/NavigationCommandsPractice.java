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
		driver.get(url);
		driver.findElement(By.xpath(ELRegistrationButton)).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.close();
		System.out.println("demo ok");
		}catch (Throwable t){
			System.out.println("test failed");
		}
		
	}

}
