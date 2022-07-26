package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class SearchingAWebElementInAnotherWeb extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("edge", "http://tek-school.com/retail/");
		
		WebElement cameraText = driver.findElement(By.linkText("Canon EOS 5D Camera"));
		String strText = cameraText.getText();
		
		driver.navigate().to("https://www.amazon.com");
		
		WebElement amazonSearchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		BaseClass.testExecutionWait(6000);
		amazonSearchBox.sendKeys(strText);
		
		WebElement amazonSearchBoxButton = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		BaseClass.testExecutionWait(1000);
		amazonSearchBoxButton.click();
		
	
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
	}

}
