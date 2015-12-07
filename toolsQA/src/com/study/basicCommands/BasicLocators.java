package com.study.basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {
	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*1.By ID - element id - With this strategy, If no element has a matching id attribute, a NoSuchElementException will be raised.*/
		driver.findElement(By.id("ID of the element"));
		
		/*2. By Name - */
		driver.findElement(By.name("NAME attribute of the element"));
		
		/*3.By ClassName*/
		driver.findElement(By.className("Element CLASSNAME"));
		WebElement parentElement = driver.findElement(By.className("button")); //this is how its used if child location is difficult to identify
		WebElement childElement = parentElement.findElement(By.id("submit"));
		childElement.submit();
		
		/*4. By TagName*/
		driver.findElement(By.tagName("Element TAGNAME"));
		
		WebElement element = driver.findElement(By.tagName("button or a or input for example"));
		// Action can be performed on Input Button element
		element.submit();
		
		
		/*5.By LinkText & PartialLinkText*/
		
		WebElement elementLinkText = driver.findElement(By.linkText("Partial Link Test"));
		elementLinkText.clear();
		
		WebElement elementpartialLinkText = driver.findElement(By.partialLinkText("Partial"));
		element.clear();
		
		
		/*6.By XPath - */
		driver.findElement(By.xpath("Element XPATHEXPRESSION"));
		//there are many different xpath strategies available
		
		
		
		
		
		
		
	}

}
