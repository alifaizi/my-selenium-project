package seleniumPracticePackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.Utils;

public class FluentWaitInSelenium extends Utils{

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://shop.demoqa.com/");
		WebElement text1 = driver.findElement(By.cssSelector("dive#slide-6-layer-4"));
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
		.withTimeout(20, TimeUnit.SECONDS)
		.pollingEvery(2, TimeUnit.SECONDS)
		.withMessage("The text was not available in the UI")
		.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOf(text1));
		
		System.out.println(text1.getText());
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
