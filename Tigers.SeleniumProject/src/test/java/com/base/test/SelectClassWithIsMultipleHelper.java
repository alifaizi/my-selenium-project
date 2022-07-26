package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SelectClassWithIsMultipleHelper extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='Month']"));
		
		Select selectMonth = new Select(month);
		
//		the usage for isMultiple helper method in select class is for us to know if we can
//		select multiple values from dropdown/list
		
//		Either we can store the value in a boolean variable like this:
		
		/*
		boolean checkIfElementIsMultiple = selectMonth.isMultiple();
		System.out.println(checkIfElementIsMultiple);
		*/
		
//		or we can create an if condition and print our result like this:
		
		if(selectMonth.isMultiple()) {
		System.out.println("Yes, we can select multiple values");
		}else {
		System.out.println("No, we can not select multiple values");
		}
		 
				
//		select multiple values from dropdown/list
		selectMonth.selectByIndex(1);
		selectMonth.selectByIndex(2);
		selectMonth.selectByIndex(3);
		selectMonth.selectByIndex(4);
	
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
	}

}
