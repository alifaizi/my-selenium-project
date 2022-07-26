package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class DropDownWithSelectClass extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.sugarcrm.com/au/request-demo/");
	
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonCustomize")).click();
		
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyButtonDecline")).click();
		
		WebElement companySize = driver.findElement(By.cssSelector("select[name='employees_c']"));
		
		Select select = new Select(companySize);
		
	
//		select.selectByValue("level5");
		select.selectByVisibleText("501 - 1,000 employees");
//		select.selectByIndex(9);
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
	}

}
