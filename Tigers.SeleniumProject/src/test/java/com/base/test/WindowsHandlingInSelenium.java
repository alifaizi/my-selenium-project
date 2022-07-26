package com.base.test;

import java.util.Set;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class WindowsHandlingInSelenium extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent windwo: " + parentWin);
		
		driver.findElement(By.cssSelector("button#newWindowBtn")).click();
		testExecutionWait(2000);
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			
			System.out.println(handle);
			
		}
		

		testExecutionWait(6000);
		closeDown();

	}

}
