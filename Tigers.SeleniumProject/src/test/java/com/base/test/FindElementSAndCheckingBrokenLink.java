package com.base.test;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindElementSAndCheckingBrokenLink extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("------------Printing Number of Links on this page-----------" + "\n");
		
		System.out.println("Number of links on this pages is: " + links.size() + "\n");
		
		System.out.println("------------Printing All Links-----------" + "\n");
		
		for (WebElement link : links) {
			
			String url = link.getAttribute("href");
			
//			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				
				System.out.println(url + " is empty!");
				
				continue;	
			}
			
			System.out.println("------------Printing All Valid Links-----------" + "\n");
			
			try {
				HttpURLConnection connectToServer = (HttpURLConnection) (new URL(url).openConnection());
				
				connectToServer.connect();
				
				if (connectToServer.getResponseCode()>=400) {
					
					System.out.println(url + " is broken");
					
				} else {
					
					System.err.println(url + " is valid");

				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
	}

}
