package com.base.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ScreenshotSpecificElement extends BaseClass{

	public static void main(String[] args) {

		
		launchBrowser("chrome", "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement specificElement = driver.findElement(By.xpath("(//img[@alt='GlobalSQA'])[1]"));
		
		String ssPath = ".\\Screenshots\\";
		String ssName = "Specific Element Screenshot";
		
		File src = specificElement.getScreenshotAs(OutputType.FILE);
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
