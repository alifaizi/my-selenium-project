package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utils;

public class WebDriverWaitInSelenium_Explicit extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://shop.demoqa.com/");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement text1 = driver.findElement(By.cssSelector("div#slide-6-layer-4"));
		wait1.until(ExpectedConditions.visibilityOf(text1));
		System.out.println(text1.getText());
		
	
		WebElement text2 = driver.findElement(By.cssSelector("div#slide-6-layer-4"));
		waitUntilElementVisible(text2); //This is called from wait method created in Utils class
		System.out.println(text2.getText());
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

		
	}
