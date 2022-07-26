package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SelectClassIsMultiple extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		
		Select select = new Select(month);
		
		boolean ismultiple = select.isMultiple();
		
		System.out.println(ismultiple);
		
	}
}
