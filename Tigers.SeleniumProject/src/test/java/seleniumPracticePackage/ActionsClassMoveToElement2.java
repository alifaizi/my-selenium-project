package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClassMoveToElement2 extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");

		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));

		Actions action = new Actions(driver);

		action.moveToElement(desktop).perform();

		hardWait(6000);
		tearDown();

	}

}
