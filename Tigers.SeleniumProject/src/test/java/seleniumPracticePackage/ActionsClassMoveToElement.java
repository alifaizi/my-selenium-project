package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClassMoveToElement extends Utils{

	public static void main(String[] args) {
		
		getBrowser("chrome", "https://www.ebay.com/");
		
		WebElement electronics = driver.findElement(By.xpath("(//li[@class='hl-cat-nav__js-tab'])[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronics).perform();
		
		
		hardWait(6000);
		tearDown();

	}

}
