package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ActionChainPractice1 extends BaseClass {

	public static void main(String[] args) {
		
		
		//#url launch
		launchBrowser("chrome", "https://www.tutorialspoint.com/about/about_careers.htm");

		//#identify element
		WebElement text = driver.findElement(By.linkText("Privacy Policy"));

		System.out.println(text.getText());
	
		testExecutionWait (6000);
		closeDown();

	}

}
