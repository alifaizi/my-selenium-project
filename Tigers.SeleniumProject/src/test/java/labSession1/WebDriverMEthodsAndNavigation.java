package labSession1;

import utilities.Utils;

public class WebDriverMEthodsAndNavigation extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://www.amazon.com/");
		
		// Get Title
		System.out.println(driver.getTitle());
		
		// Get URL
		System.out.println(driver.getCurrentUrl());
		
		// Get current page's URL
		System.out.println(driver.getPageSource());
		
		//Opening the original page then change it to another URL in the same window.
		driver.navigate().to("https://www.ebay.com");
		
		// Get back to previous page
		Utils.hardWait(2000);
		driver.navigate().back();
		
		// Going forward
		Utils.hardWait(2000);
		driver.navigate().forward();
		
		// Refreshing the page
		Utils.hardWait(2000);
		driver.navigate().refresh();
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
