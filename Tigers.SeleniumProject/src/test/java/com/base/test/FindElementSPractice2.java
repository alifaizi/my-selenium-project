package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindElementSPractice2 extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");

		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@role='group']//div"));

		for (int i = 0; i < elements.size(); i++) {

			// >>>------------- Printing all elements <<<----------------
			
			System.out.println(elements.get(i).getText()); 
			
			BaseClass.testExecutionWait(2000);
			
			driver.findElement(By.linkText("Baby")).click();

		}
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}
