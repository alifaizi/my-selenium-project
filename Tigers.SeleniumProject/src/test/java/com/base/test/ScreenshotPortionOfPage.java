package com.base.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;


public class ScreenshotPortionOfPage extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome", "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement portionOfPage = driver.findElement(By.xpath("(//div[@class='single_tab_div resp-tab-content resp-tab-content-active'])[1]"));
		
		String ssPath = ".\\Screenshots\\";
		String ssName = "Portion of Page";
		
		File src = portionOfPage.getScreenshotAs(OutputType.FILE);
		File trg = new File(ssPath + ssName + ".png");
		
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		testExecutionWait(6000);
		closeDown();

		
	}

}
