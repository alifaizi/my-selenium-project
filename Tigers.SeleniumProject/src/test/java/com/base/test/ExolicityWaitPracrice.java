package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class ExolicityWaitPracrice extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://shop.demoqa.com/");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement text1 = driver.findElement(By.cssSelector("div#slide-6-layer-4"));

		wait.until(ExpectedConditions.visibilityOf(text1));

		System.out.println(text1.getText());

		System.out.println("------------------");

		WebElement text2 = driver.findElement(By.cssSelector("div#slide-6-layer-4"));

		wait.until(ExpectedConditions.elementToBeClickable(text2));

		System.out.println(text2.getText());

		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}
