package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class WebDriverMethodsAndNavigation extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("edge", "https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		
		WebElement bookLink = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']"));
		bookLink.click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.google.com/");
		
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();
		
	
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
	}

}
