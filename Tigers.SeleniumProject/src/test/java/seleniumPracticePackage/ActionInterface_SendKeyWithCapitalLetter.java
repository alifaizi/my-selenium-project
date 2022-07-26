package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionInterface_SendKeyWithCapitalLetter extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		String text = "tekschool";
		
		Actions actions = new Actions(driver);
		Action builder = actions.keyDown(Keys.SHIFT)
				.sendKeys(searchField, text)
				.keyUp(Keys.SHIFT)
				.build();
		builder.perform();
		
		
		hardWait(6000);
		tearDown();
		
	}

}
