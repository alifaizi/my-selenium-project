package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLoadingThePageMethods {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//Setting up the chrome driver
		WebDriverManager. chromedriver().setup();
		
		//Launching Chrome
		driver = new ChromeDriver();
		
		//Launching web page
		driver.get("https://www.amazon.com/");
		
		// Getting the title of web page
		System.out.println(driver.getTitle());
		
		// Getting the current URL of the page
		System.out.println(driver.getCurrentUrl());
		
		// Test Execution Wait Time
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// CLosing single browser
//		driver.close();
		
		// Closing multiple browsers opened by Selenium
		driver.quit();
	}

}
