package com.base.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class ScreenshotHalfPage extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome", "http://tek-school.com/retail/");
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(".\\Screenshots\\Half Page Screenshot.png");
		
		try {
			FileUtils.copyFile(srcFile, trgFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		testExecutionWait(6000);
		closeDown();
	}

}
