package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionClickAndHold extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "https://demoqa.com/droppable/");
		
		WebElement elementToBeHolded = driver.findElement(By.xpath("//a[@id=\"droppableExample-tab-accept\"]"));
		
		Actions action = new Actions (driver);
		
		action.clickAndHold(elementToBeHolded).build().perform();
		
		testExecutionWait(1000);
		
		action.contextClick(elementToBeHolded).build().perform();
		
		
		testExecutionWait(6000);
		closeDown();
	}

}
