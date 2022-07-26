package seleniumPracticePackage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

	import utilities.Utils;

	public class WindowsHandlingInSelenium1 extends Utils{

		public static void main(String[] args) {
			getBrowser("chrome", "http://tek-school.com/retail/");
			//how we can get and print the name of parent window
//			String parentWindow = driver.getWindowHandle();
//			System.out.println(parentWindow);
			WebElement deskTop = driver.findElement(By.xpath("//a[text()='Desktops']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(deskTop).perform();
			WebElement allDeskTopIteam = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
			actions.keyDown(Keys.CONTROL)
			.click(allDeskTopIteam)
			.keyUp(Keys.CONTROL)
			.build().perform();
			
			Set<String> allWindows = driver.getWindowHandles();
			Iterator<String> i = allWindows.iterator();
			//the next available String/tab/window name that we stored in this set of String
			//is going to be the name of parent window
			String parentWindow = i.next();

			
			//the second next available String/tab/window name that we stored in this set of String
			//is going to be the name of child window
			//initially when we are launching the ulr, we will be already on parent window, so by 
			//switching to parent window will be useless we won't see anything happening
			//but if after launching the url and we are on parent window, we can switch to child window
			//and then we will be able to interact with all of the elements on the child window
			hardWait(3000);
			String childWindow = i.next();
			driver.switchTo().window(childWindow);
			hardWait(3000);
			driver.switchTo().window(parentWindow);
			hardWait(6000);
			tearDown();
		}

	}