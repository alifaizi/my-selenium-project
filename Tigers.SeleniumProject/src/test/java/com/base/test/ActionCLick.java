package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionCLick extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("edge", "https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		WebElement elementToBeClicked = driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//a[@class=\"button e.g. button_hilite button_pale small_button\"][normalize-space()=\"Click Here\"]"));
		Actions action = new Actions(driver);
		
		action.click(elementToBeClicked).build().perform();
		
		
		
		testExecutionWait(6000);
		closeDown();

	}

}
