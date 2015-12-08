package com.study.PracticeExcercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxesAndRadioButtons {
	/*	Practice Exercise

	Launch new Browser
	Open “http://toolsqa.com/automation-practice-form/“
	Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
	Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
	Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
	Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)*/



	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");

		/*1.*/
		WebElement radioButtonFemale = driver.findElement(By.id("sex-1"));
		boolean isSelected = radioButtonFemale.isSelected();

		if (isSelected == false){
			radioButtonFemale.click();
			System.out.println("Female option is now selected");
		}
		else {
			System.out.println("Female option is already selected");
		}


		/*2.*/

		WebElement RadioButton3 = driver.findElement(By.id("exp-2")); 
		RadioButton3.click();

		if (RadioButton3.isSelected() == true){
			System.out.println("3 years of Experiance is selected");
		}else{
			System.out.println("experiance dint get correctly selected");
		}


		/*3.*/
		List CheckBoxProfession = driver.findElements(By.name("profession"));
		int iSize1 = CheckBoxProfession.size();


		for (int i =0; i<=iSize1; i++){

			String value = ((WebElement) CheckBoxProfession.get(i)).getAttribute("Value");

			if (value.equalsIgnoreCase("Automation Tester")){

				((WebElement) CheckBoxProfession.get(i)).click();
				System.out.println("Automation tester is now selected");

				// This will take the execution out of for loop

				break;

			}


		}


		/*4.*/
		WebElement checkSeleniumIde = driver.findElement(By.cssSelector("input[value = 'Selenium IDE']"));
		checkSeleniumIde.click();

		if (checkSeleniumIde.isSelected() ==true){
			System.out.println("Selenium Ide checkbox is selected");
		}else{
			System.out.println("Something gone wrong");
		}




		driver.close();
	}

}
