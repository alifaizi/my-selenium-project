package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionsMouseOverConcept extends BaseClass {

	public static void main(String[] args) {

		
		launchBrowser("chrome", "http://mrbool.com/");
		
		Actions action = new Actions(driver);
		
		WebElement moouseOverOnElement = driver.findElement(By.xpath("//a[@class='menulink']"));
		
		action.moveToElement(moouseOverOnElement).build().perform();
		
		testExecutionWait(2000);
		
		WebElement moveOnSubmenu = driver.findElement(By.xpath("//ul[@class='submenu']//li[2]//a"));
		action.moveToElement(moveOnSubmenu).build().perform();
		moveOnSubmenu.click();

		
		testExecutionWait(6000);
		closeDown();
	}

}
