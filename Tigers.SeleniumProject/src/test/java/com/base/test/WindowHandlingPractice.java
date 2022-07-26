package com.base.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class WindowHandlingPractice extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "http://tek-school.com/retail/");
		
		String paretnWindow = driver.getWindowHandle();
		String childWindow = driver.getWindowHandle();
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Software']"));
		action.keyDown(Keys.CONTROL)
		.click(element)
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		Set <String> allWindows = driver.getWindowHandles();
		Iterator <String> iterat = allWindows.iterator();
		
		while (iterat.hasNext()){
			
			childWindow = iterat.next();
			
			if (!paretnWindow.equals(childWindow)) {
				
				//Switching to new window (Child Window)
				driver.switchTo().window(childWindow);
				
			}
		}
		
		testExecutionWait(1000);
		
		driver.close();
		
		//Switching back to main window (parent Window)
		driver.switchTo().window(paretnWindow);
		
		
		testExecutionWait(6000);
		closeDown();
			
	}

}
