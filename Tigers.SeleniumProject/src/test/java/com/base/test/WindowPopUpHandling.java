package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class WindowPopUpHandling extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "https://html.com/input-type-file/");
		
		WebElement fileUpload = driver.findElement(By.cssSelector("input#fileupload"));
		fileUpload.sendKeys("C:\\Users\\janal\\OneDrive\\Desktop\\Xpath with Examples.pdf");
		
		
		testExecutionWait(6000);
		closeDown();
	}

}
