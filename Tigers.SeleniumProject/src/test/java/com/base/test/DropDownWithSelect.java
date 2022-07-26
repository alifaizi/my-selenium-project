package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class DropDownWithSelect extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome","https://www.facebook.com/");
		
	WebElement creatNewAccount = driver.findElement(By.linkText("Create new account"));
		
	creatNewAccount.click();
	
	WebElement monthDD = driver.findElement(By.cssSelector("select#month"));
	
	Select select = new Select (monthDD);
	
	select.selectByValue("9");
//	select.selectByIndex(6);
//	select.selectByVisibleText("Aug");

	List<WebElement> option = select.getOptions();
	
	System.out.println("Number of elements in the droodown list :: " + option.size());
		
	for (int i = 0; i < option.size(); i++) {
		
		System.out.println(option.get(i).getText());
		
	}
		
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

		
	}

}
