package seleniumPracticePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class WindowHandlingInSelenium extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops'"));
		Actions actions = new Actions(driver);
		actions.moveToElement(desktop).perform();
		
		WebElement allDeskTopItem = driver.findElement(By.xpath("//a[text()='show All Desktops'"));
		
		actions.keyDown(Keys.CONTROL)
		.click(allDeskTopItem)
		.build().perform();
		
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> i = allWindow.iterator();
		
		String parentWindow = i.next();
		String childWindow = i.next();
		
		hardWait(1000);
		driver.switchTo().window(childWindow);
		
		hardWait(1000);
		driver.switchTo().window(parentWindow);
		
	
		
		hardWait(6000);
		tearDown();
	}

}
