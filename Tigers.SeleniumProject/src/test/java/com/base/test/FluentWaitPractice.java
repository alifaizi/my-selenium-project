package com.base.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.base.BaseClass;

public class FluentWaitPractice extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://shop.demoqa.com/");
		
		WebElement ajaxElement = driver.findElement(By.xpath("//div[@id='slide-6-layer-4']"));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.withMessage("This is a test step starting from line 20");
		wait.until(ExpectedConditions.visibilityOf(ajaxElement));
		
		System.out.println("The Ajax element is: " + ajaxElement.getText());
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
			
	}

}
