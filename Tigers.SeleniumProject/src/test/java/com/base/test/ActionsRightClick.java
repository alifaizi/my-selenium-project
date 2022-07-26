package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionsRightClick extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("chrome", "https://www.orangehrm.com/");
		
		WebElement rightClickOnContactSale = driver.findElement(By.xpath("(//li[@class='main-list'])[4]"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickOnContactSale).perform();
		
		
		
		
		testExecutionWait(6000);
		closeDown();
	}

}
