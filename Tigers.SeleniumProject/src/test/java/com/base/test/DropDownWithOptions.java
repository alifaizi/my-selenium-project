package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class DropDownWithOptions extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		WebElement month = driver.findElement(By.cssSelector("select#month>option"));
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
	}

}
