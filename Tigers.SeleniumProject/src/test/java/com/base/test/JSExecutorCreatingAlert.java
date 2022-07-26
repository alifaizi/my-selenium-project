package com.base.test;

import org.openqa.selenium.JavascriptExecutor;

import com.base.BaseClass;

public class JSExecutorCreatingAlert extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "http://tek-school.com/retail/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Welcome to ratail page.')");
		testExecutionWait(1000);
		driver.switchTo().alert().accept();
		
		
		js.executeScript("confirm('Are you sure you wan to delete this file?')");	
		testExecutionWait(1000);
		driver.switchTo().alert().accept();
		
		
		js.executeScript("prompt('Enter your passwor!')");
		testExecutionWait(1000);
		driver.switchTo().alert().accept();
		
		
		
		testExecutionWait(6000);
		closeDown();

	}

}
