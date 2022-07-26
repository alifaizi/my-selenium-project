package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebDriverWaitInSelenium_ExplicitWait extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://demo.guru99.com/test/ajax.html");
		
		driver.findElement(By.cssSelector("input#yes")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement button = driver.findElement(By.cssSelector("input#buttoncheck"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(button));
		waitUntilElementVisible(button); // this is coming from Utils class
		button.click();
		
		WebElement text = driver.findElement(By.xpath("//p[@class='radiobutton']"));
		//wait.until(ExpectedConditions.elementVisibilityOf(button));
		waitUntilElementVisible(text); // this is coming from Utils class
		System.out.println(text.getText());
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
	}

}
