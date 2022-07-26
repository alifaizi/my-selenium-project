package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SelectDropDownHandle extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("chrome", "https://www.facebook.com/");
		
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Jul");
		
		WebElement day = driver.findElement(By.cssSelector("#day"));
		Select selectDay = new Select(day);
		selectDay.selectByValue("16");
		
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select selectYear = new Select(year);
		selectYear.selectByIndex(9);
		
				
		testExecutionWait(6000);
		closeDown();
	}

}
