package com.base.test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindingBrokenLinksOnAPage extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("---------->Printing number of links on the page>--------" + "\n");
		System.out.println("Number of links on the webpage is: " + links.size() + "\n");
		System.out.println("---------->Printing all link add<-----------------------" + "\n");
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println(url + " is empty");
				continue;
			}
			try {
				HttpURLConnection connectToServer = (HttpURLConnection) 
						(new URL(url).openConnection());
				connectToServer.connect();
				if (connectToServer.getResponseCode() >= 400) {
					System.err.println(url + " is broken");
				} else {
					System.out.println(url + " is valid");
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
