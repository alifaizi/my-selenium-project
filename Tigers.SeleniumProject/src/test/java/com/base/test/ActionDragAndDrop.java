package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionDragAndDrop extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "http://demoqa.com/droppable/");

		Actions action = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[2]"));

		action.dragAndDrop(source, target).perform();

		String textTo = target.getText();

		if (textTo.equals("Dropped!")) {

			System.out.println("PASS: Source is dropped to target as expected");

		} else {

			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}

		testExecutionWait(6000);
		closeDown();

	}

}
