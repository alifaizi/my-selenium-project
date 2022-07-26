package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class HandlingDynamicDropdowns extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		List<WebElement> countries = driver.findElements(By.cssSelector("select[name=country]>option"));
		
		getCountryName(countries, "Nepal");
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
	}
	
	public static String getCountryName(List<WebElement> element, String countryName) {
		
		try {
			for (WebElement list : element) {
				String strCountryName = list.getText();
				if (strCountryName.equalsIgnoreCase(countryName)) {
					list.click();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return countryName;
	}

}