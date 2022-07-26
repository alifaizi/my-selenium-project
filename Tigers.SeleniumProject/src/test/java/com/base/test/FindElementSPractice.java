package com.base.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindElementSPractice extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.amazon.com/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@role='group']//div"));
		String element = "";
		for(int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i).getText());
			element = elements.get(i).getText();
			if(elements.get(i).getText().equals("Cell Phones & Accessories")) {
//				System.out.println(elements.get(i).getText());
			}else {
			}
		}
		System.out.println(element);
		
		//Need to be practiced more
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Cell Phones & Accessories");
		list1.add("Cell Phones & Accessories");
		list1.add("Cell Phones & Accessories");
		list1.add("Cell Phones & Accessories");
		list1.add("Cell Phones & Accessories");
		list1.add("Cell Phones & Accessories");
		
		for(int i = 0; i < list1.size(); i++) {
			if(list1.get(i).equals("Cell Phones & Accessories")) {
				System.out.println(list1.get(i));
			}
		}
		
	}

}
