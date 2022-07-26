package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClassDragAndDrop extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://jqueryui.com/droppable/");

		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		hardWait(2000);
		WebElement elementA = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement elementB = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

		Actions action = new Actions(driver);
		action.dragAndDrop(elementA, elementB).perform();

		hardWait(6000);
		tearDown();

	}

}
