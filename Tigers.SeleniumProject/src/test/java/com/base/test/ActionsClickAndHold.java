package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionsClickAndHold extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("chrome", "https://www.orangehrm.com/");
		
		WebElement reportingIcon = driver.findElement(By.xpath("(//li[@class='lang-nav esp-nav'])/a"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(reportingIcon).perform();
		
		
		testExecutionWait(6000);
		closeDown();
		
	}

}
