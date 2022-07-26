package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClassSelectable extends Utils{

	public static void main(String[] args) {

		getBrowser("chrome", "https://jqueryui.com/selectable/");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		hardWait(2000);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));

		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL) // We are pressing ctrl key
		.click(item1) //clicking on item 1
		.click(item2) //clicking on item 2
		.click(item3) //clicking on item 3
		.click(item4) //clicking on item 4
		.keyUp(Keys.CONTROL) // We are releasing the ctrl key
		.build()
		.perform(); // call the build method and then perform
		

		hardWait(6000);
		tearDown();
	}

}
