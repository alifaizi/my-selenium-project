package com.base.test;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindElementVsFindElementsPractice2 extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("edge", "https://www.amazon.com/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");

		// What if no element is found with findElement() method?
		// If no element is found, you will get noSuchElementFoundExceptioin
		WebElement element1 = driver.findElement(By.xpath("//div[@role='group']//div[1]"));
		System.out.println(element1.getText());

		// What if no element(s) are found with findElements() method?
		// If no elements are found, you will get an empty array
		List<String> list1 = new ArrayList<String>();
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@role='groupp']//div"));
		for (int i = 0; i < elements2.size(); i++) {
			list1.add(elements2.get(i).getText());
		}
		System.out.println(list1);

		// make sure to comment the above code before running the below one
		
		List<WebElement> elements3 = driver.findElements(By.xpath("//div[@role='group']//div"));
		for (int i = 0; i < elements3.size(); i++) {
			if (elements3.get(i).getText().equals("Apps & Games")) {
				elements3.get(i).click();
				break;
			}
		}
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}
