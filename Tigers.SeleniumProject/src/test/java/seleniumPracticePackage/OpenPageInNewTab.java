package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utils;

public class OpenPageInNewTab extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");

		// Opening page in new tab
		
		WebElement CreatAPage = driver.findElement(By.linkText("Create a Page"));
		Actions acts = new Actions(driver);
		
		acts.moveToElement(CreatAPage).keyDown(Keys.CONTROL).click()
										.keyUp(Keys.CONTROL).build().perform();

	}
}
