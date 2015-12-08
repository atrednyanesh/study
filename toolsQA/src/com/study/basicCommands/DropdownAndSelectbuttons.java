package com.study.basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndSelectbuttons {

	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we use Select class of Selenium which can handle Select tag of html pages
		WebElement SelectButton = driver.findElement(By.xpath(""));
		Select doSelect = new Select(SelectButton);


		/*1.selectByVisibleText*/
		doSelect.selectByVisibleText("");//takes string parameter which could be any visible text for attribute "Value"


		/*2.selectByIndex*/
		doSelect.selectByIndex(0); //0 is int parameter where it could be index of the element in dropdown


		/*3.selectByValue*/
		doSelect.selectByValue("");//takes string parameter which could be text for attribute "Value"


		/*4.getOptions*/
		doSelect.getOptions();//gets a list of webElements with select tag



		List <WebElement> elementCount = doSelect.getOptions();
		System.out.println(elementCount.size());
		int iSize = elementCount.size();
		for(int i =0; i>iSize ; i++){
			String sValue = elementCount.get(i).getText();
			System.out.println(sValue);
		}
		
		/*5.DeSelect Methods, same inputs as of select methods*/
		doSelect.deselectAll();
		doSelect.deselectByIndex(0);
		doSelect.deselectByValue("");
		doSelect.deselectByVisibleText("");
		
		


	}

}
