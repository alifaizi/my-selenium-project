package com.base.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class WindowsHandlingInSelenium2 extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "http://tek-school.com/retail/");
		String parentWindow = driver.getWindowHandle();
		WebElement text = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		System.out.println(text.getText());
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions action = new Actions(driver);
		action.moveToElement(desktop).perform();
		WebElement allDesktops = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		action.keyDown(Keys.CONTROL).click(allDesktops).keyUp(Keys.CONTROL).build().perform();
		
		
		testExecutionWait(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();

		while (i.hasNext()) {

			String childWindow = i.next();

			if (!parentWindow.equals(childWindow)) {
				
				driver.switchTo().window(childWindow);
			}
		}

		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		searchField.sendKeys("iphone");
		WebElement searchButton = driver.findElement(By.xpath("//span[@class='input-group-btn']"));
		searchButton.click();
		
		testExecutionWait(2000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
		searchMonitors.sendKeys("Monitors");
		
		WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchBttn.click();
		
		testExecutionWait(6000);
		closeDown();

	}

}
