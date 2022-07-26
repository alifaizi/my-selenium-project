package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebElementPractice extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("Chrome", "https://www.amazon.com/");
		
		// Difference between storing in a WebEelement variable and not storing in a WebEelement variable 
		
		// Stored in a variable
		
		WebElement searchBttn = driver.findElement(By.id("nav-search-submit-button"));
		searchBttn.click();
		
		// Not stored in variable
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// From technical point of view there is no problem in user either of them
		// To make sure we are able to perform more than one action, we need to store 
		// store in an instance of WebElement and then use the reference to continue our code
		
		Utils.hardWait(6000);
		
		Utils.tearDown();
		
	}

}
