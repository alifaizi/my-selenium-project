package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class SearchingOnGoogle extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://www.google.com/");
		
		WebElement textField = driver.findElement(By.xpath("//form[@role='search']//descendant::div[@class='RNNXgb']//descendant::input"));

		textField.sendKeys("tekschool");
		
		WebElement searchButton = driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@name=\"btnK\"]"));
		
		searchButton.click();
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
	}

}
