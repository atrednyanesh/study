package com.study.basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {

	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://www.DemoQA.com"; 
		driver.get(baseUrl);
	
		
		/*1.Clear Command - void */	
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		
		/*2.SendKeys Command - element.sendKeys(“text”);*/
		userName.sendKeys("username");
		
		/*3.Click Command -  element.click();*/
		WebElement submitButton = driver.findElement(By.id("locator"));
		submitButton.click();
		
		/*4.IsDisplayed Command - returns boolean  - element.isDisplayed();*/
		boolean isElementPresent;
		isElementPresent = userName.isDisplayed();
		System.out.println(isElementPresent);
		// also can be written as - 
		System.out.println(userName.isDisplayed());
		
		/*5.IsEnabled Command -  element.isEnabled() -  returns boolean*/
		boolean statusofElement = driver.findElement(By.xpath("")).isEnabled();
		
		//OR
		boolean StatusofElement;
		WebElement elementEnabled = driver.findElement(By.xpath(""));
		StatusofElement = elementEnabled.isEnabled();
		
		
		/*6.IsSelected Command - element.isSelected()  - returns boolean, generally used for radio buttons*/
		WebElement radioButton = driver.findElement(By.xpath(""));
		boolean isElementSelected;
		isElementSelected = radioButton.isSelected();
		System.out.println(isElementSelected);

		//OR
		System.out.println(radioButton.isSelected());
		
		/*7.Submit Command - element.submit();*/
		driver.findElement(By.id("")).submit();
		
		
		/*8.GetText Command - This method will fetch the visible (i.e. not hidden by CSS) innerText of the element. 
		 This accepts nothing as a parameter but returns a String value.*/
		WebElement element = driver.findElement(By.xpath("anyLink"));
		String linkText = element.getText();
		System.out.println(linkText);
		
		
		/*9.getTagName Command -  returns tagName as string*/
		WebElement link1 = driver.findElement(By.xpath("id"));
		link1.getTagName();
		//should provide a if its a link
		
		
		/*10. getCssValue Command - This method gets the value of the given attribute of the element. 
		 * This accepts the String as a parameter and returns a String value.*/
		element.getCssValue("id"); //here id is attribute key and will return the value of id
		

	}

}
