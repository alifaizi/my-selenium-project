package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionsDragAndDrop extends BaseClass{

	public static void main(String[] args) {
		
		launchBrowser("chrome", "http://demoqa.com/droppable/");
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
		
	
		testExecutionWait(6000);
		closeDown();
		
		
		

		
	}

}
