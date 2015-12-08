package com.study.basicCommands;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxandRadioButtons {

	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. By id - */
		WebElement radioBtn = driver.findElement(By.id("toolsqa"));
		radioBtn.click();

		/*2.With IsSelected*/
		List  oRadioButton = driver.findElements(By.name("toolsqa"));
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		// This statement will return True, in case of first Radio button is selected
		bValue = radioBtn.isSelected();
		if(bValue = true){

			// This will select Second radio button, if the first radio button is selected by default

			((WebElement) oRadioButton.get(0)).click();

		}else{

			// If the first radio button is not selected by default, the first will be selected

			((WebElement) oRadioButton.get(0)).click();

		} 




		// Find the checkbox or radio button element by Name

		List oCheckBox = driver.findElements(By.name("tool"));

		// This will tell you the number of checkboxes are present

		int iSize = oCheckBox.size();

		// Start the loop from first checkbox to last checkboxe

		for(int i=0; i < iSize ; i++ ){

			// Store the checkbox name to the string variable, using 'Value' attribute

			String sValue = ((WebElement) oCheckBox.get(i)).getAttribute("value");

			// Select the checkbox it the value of the checkbox is same what you are looking for

			if (sValue.equalsIgnoreCase("toolsqa")){

				((WebElement) oCheckBox.get(i)).click();

				// This will take the execution out of for loop

				break;

			}

		}

		/*3. By Value*/
		// Find the checkbox or radio button element by Name

		List oCheckBox1 = driver.findElements(By.name("tool"));

		// This will tell you the number of checkboxes are present

		int iSize1 = oCheckBox1.size();

		// Start the loop from first checkbox to last checkboxe

		for(int i=0; i < iSize1 ; i++ ){

			// Store the checkbox name to the string variable, using 'Value' attribute

			String sValue = ((WebElement) oCheckBox1.get(i)).getAttribute("value");

			// Select the checkbox it the value of the checkbox is same what you are looking for

			if (sValue.equalsIgnoreCase("toolsqa")){

				((WebElement) oCheckBox1.get(i)).click();

				// This will take the execution out of for loop

				break;

			}

		}

		
		/*4. With CSS selector */
		
		WebElement CheckBox = driver.findElement(By.cssSelector("input[value='Tools QA']"));
 		CheckBox.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}




}
