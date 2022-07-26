package labSession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utils;

public class ExplicitWaitInSelenium extends Utils {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		
		Utils.getBrowser("chrome", "https://shop.demoqa.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
//		hardWait(10000); // Not Recommended

		WebElement text = driver.findElement(By.cssSelector("div#slide-6-layer-4"));
		
		wait.until(ExpectedConditions.visibilityOf(text));
		
		System.out.println(text.getText());
		
		
		long stopTime = System.currentTimeMillis();
		long diff = stopTime - startTime;
		System.out.println(diff);
		
	
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
