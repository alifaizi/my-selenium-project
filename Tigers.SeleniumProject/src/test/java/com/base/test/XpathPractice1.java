package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class XpathPractice1 extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@name='search']"));
		
		searchBox.sendKeys("Camera");
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@class='input-group-btn']"));
		
		searchButton.click();
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
		
	}

}
