package com.base.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class WindowHandlingNewTab extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "http://tek-school.com/retail/");

		WebElement desktop = driver.findElement(By.xpath("//li[@class='dropdown']//a[text()='Desktops']"));

		// Printing name of parent window with getWindowHandle()
//		String parentWindow = driver.getWindowHandle();
//		System.out.println(parentWindow);

		Actions action = new Actions(driver);

		action.moveToElement(desktop).perform();

		WebElement mac1 = driver.findElement(By.xpath("//a[text()='Mac (1)']"));

		action.keyDown(Keys.CONTROL).click(mac1).keyUp(Keys.CONTROL).build().perform();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();

		String parentWindow = i.next();
		String childWindow = i.next();

		testExecutionWait(2000);
		driver.switchTo().window(childWindow);

		testExecutionWait(2000);
		driver.switchTo().window(parentWindow);

		testExecutionWait(6000);
		closeDown();
	}

}
