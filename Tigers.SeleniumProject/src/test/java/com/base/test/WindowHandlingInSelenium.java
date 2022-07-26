package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class WindowHandlingInSelenium extends BaseClass{

	public static void main(String[] args) {
		
		launchBrowser("chrome", "tek-school.com/retail/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(desktop).perform();
		
		WebElement showAllDesktops = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		
		action.keyDown(Keys.CONTROL)
		.click(showAllDesktops)
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		testExecutionWait(6000);
		closeDown();
	}

}
