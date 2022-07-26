package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ClickVsSubmit extends BaseClass{

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/index.php?route=account/register");
		
//		WebElement clickOnContinueBttn = driver.findElement(By.xpath("//input[@value='Continue']"));
//		clickOnContinueBttn.click();
		
		WebElement submitMethod = driver.findElement(By.id("input-password"));
		submitMethod.submit();
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}

