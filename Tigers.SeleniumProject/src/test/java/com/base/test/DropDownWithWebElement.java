package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class DropDownWithWebElement extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement> month = driver.findElements(By.cssSelector("select#month>option"));
		
		for (int i = 0; i < month.size(); i++) {
			
			if(month.get(i).getText().equals("Feb")) {
				
				month.get(i).click();
				
				break;
			}
		}
		
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
	}

}
