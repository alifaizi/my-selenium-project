package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionInterfaceLaunchWebPageInANewTab extends Utils {
	
	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");

		// Opening page in new tab
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktop.click();
		WebElement showAllDesktop = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		Actions acts = new Actions(driver);
		
		acts.moveToElement(showAllDesktop).keyDown(Keys.CONTROL).click()
										.keyUp(Keys.CONTROL).build().perform();

		
		hardWait(6000);
		tearDown();
	}
}
