package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionsMouseOver extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "https://www.orangehrm.com/");
		
		WebElement mouseOverToPlatForm = driver.findElement(By.xpath("(//a[@class='link'])[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mouseOverToPlatForm).perform();
		
		
		
		testExecutionWait(6000);
		closeDown();

		
	}

}
