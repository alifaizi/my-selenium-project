package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SelectDropDownHadling2 extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("chrome", "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().deleteAllCookies();
		
		WebElement dropDown = driver.findElement(By.xpath("//p//select"));
		
		Select select = new Select(dropDown);
		select.selectByValue("USA");
	
	
		
		testExecutionWait(6000);
		closeDown();
	}

}
