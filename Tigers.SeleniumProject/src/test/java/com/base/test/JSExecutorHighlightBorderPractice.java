package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class JSExecutorHighlightBorderPractice extends BaseClass {

		public static void main(String[] args) {

			launchBrowser("chrome", "http://tek-school.com/retail/");
		
//			WebElement textField = driver.findElement(By.xpath("//input[@name='search']"));
//			
//			testExecutionWait(1000);
//			highlightelementRedBorder(textField);
//			
//			testExecutionWait(1000);
//			sendKeys(textField, "Tekschool");
//			
//			
//			WebElement searchButton = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
//			testExecutionWait(1000);
//			highlightelementBackground(searchButton);
//			testExecutionWait(1000);
//			clickWithJSE(searchButton);
			
			WebElement textField = driver.findElement(By.xpath("//input[@name='search']"));
			testExecutionWait(1000);
			highlightelementBorderAndBackground(textField);
			
			
			testExecutionWait(6000);
			closeDown();
		}

	}