package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindElementsPracticeContinued extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> printingSingleElementInTheTable = driver
				.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[1]"));

		for (int i = 0; i < printingSingleElementInTheTable.size(); i++) {

			// finding element in the table
			System.out.println(printingSingleElementInTheTable.get(i).getText());

			// clicking on the element found
			printingSingleElementInTheTable.get(i).click();

		}

		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}
