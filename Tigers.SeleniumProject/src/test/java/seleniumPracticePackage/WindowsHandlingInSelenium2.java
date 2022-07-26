package seleniumPracticePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class WindowsHandlingInSelenium2 extends Utils{

	public static void main(String[] args) {
		getBrowser("chrome", "http://tek-school.com/retail/");
		//we used the getWindowHandle and stored the name of parent window in a String variable
		String parentWindow = driver.getWindowHandle();
		//we got and printed the TEST ENVIRONMENT text from parent window and printed it
		WebElement text1 = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		System.out.println(text1.getText());
		//we stored the locator for Desktops fild dropdown 
		WebElement deskTop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		//we used the Actions class to hover our mouse over that deskTop field dropdown
		Actions actions = new Actions(driver);
		actions.moveToElement(deskTop).perform();
		WebElement allDeskTopItems = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		//We used the Actions class to press ctrl and click on allDeskTopItems so that the link is
		//open in a new tab
		actions.keyDown(Keys.CONTROL)
		.click(allDeskTopItems)
		.keyUp(Keys.CONTROL)
		.build().perform();
		//we used the getWindowHandles and store the name of open windows in a Set<String>
		Set<String> allWindows = driver.getWindowHandles();
		//We used the Iterator to iterate through the list of window name stored in the Set<String>
		Iterator<String> i = allWindows.iterator();
		//we used the while loop to loop through the list of open windows and the condition we passed
		//if i.hasNext() which means, if there is a next value/window name stored in the set<string>
		while(i.hasNext()) {
			//then by using the i.next() which will return a String value, we will store that next 
			//window name in a String values and the reference we are use is childWindow
			String childWindow = i.next();
			//since we have to make sure that the name of parent and child window are different
			//we use an if-statement to check and make sure the names are not equals
			if(!parentWindow.equals(childWindow)) {
				//we switch to child window
				driver.switchTo().window(childWindow);
				//and perform the following actions
				WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
				searchField.sendKeys("iphone");
				WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
				searchBttn.click();
				hardWait(3000);
				//close the child window
				driver.close();
			}
		}
		hardWait(3000);
		//switch back to parent window and perform the remaining actions on the parent window
		driver.switchTo().window(parentWindow);
		WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
		searchMonitors.sendKeys("Monitors");
		WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchBttn.click();
		
		hardWait(6000);
		tearDown();
	}

}
