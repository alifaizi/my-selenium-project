package com.base.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class AlertHandlingPractice2 extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
				
		WebElement logInBtn = driver.findElement(By.cssSelector("input[name='proceed']"));
		
		logInBtn.click();
		
		testExecutionWait(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		testExecutionWait(2000);
		
		alert.accept();
		
		
		testExecutionWait(6000);
		closeDown();
		
		
		
		
	}

}
