package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class WebElementMethodDisplayedEnabledSelected extends BaseClass{
		
		public static void main(String[] args) {
			
			BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
			WebElement createNewAcct = driver.findElement(By.linkText("Create new account"));
			//isDisplayed(); 
			boolean isdisplayed = createNewAcct.isDisplayed();
			System.out.println("isDisplayed = " + isdisplayed);
			//isEnabled();
			boolean isenabled = createNewAcct.isEnabled();
			System.out.println("isEnabled = " + isenabled);
			//isSelected();
			createNewAcct.click();
			WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
//			boolean isselected1 = gender.isSelected();
//			System.out.println("isSelected = " + isselected1); //false
//			boolean isdisplayed2 = gender.isDisplayed();
//			System.out.println("Gender: isDisplayed = " + isdisplayed2);
//			boolean isenabled2 = gender.isEnabled();
//			System.out.println("Gender: isEnabled = " + isenabled2);
//			gender.click();
//			boolean isselected2 = gender.isSelected();
//			System.out.println("Gender: isSelected = " + isselected2); //true
			//we can create a method to check for all three conditions, isDisplayed, isEnabled, and isSelected
			//so that we avoid redundancy and use the same method again and again when we want to click on radio buttons
			//and check boxes
			//if you want to practice with the following method, comment the above code from line 23 to 31
			System.out.println(checkStatusOfRadioButton(gender));
//			clickOnRadioButton(gender);
			
			//if we want to first call the checkStatusOfRadioButton and then click on the radio button, then this is how we 
			//would write our method in our test or pageObject class
			if(checkStatusOfRadioButton(gender) == true) {
				gender.click();
			}else {
				System.out.println("return value was = false");
			}
			
			BaseClass.testExecutionWait(4000);
			BaseClass.closeDown();
	
		}


	}

