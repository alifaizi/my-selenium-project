package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

//public class WindowsHandlingInSelenium_ReusableMethod extends Utils {
//
//	public static void main(String[] args) {
		
//		getBrowser("chrome", "http://tek-school.com/retail/\"");
//		parentWindow = driver.getWindowHandle();
//		WebElement text = driver.findElement(By.linkText("TEST ENVIRONMENT"));
//		
//		System.out.println(text.getText());
//		
//		WebElement desktop = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='Desktops']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(desktop).perform();
//		
//		WebElement allDesktopItems = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
//		
//		action.keyDown(Keys.CONTROL).click(allDesktopItems).keyUp(Keys.CONTROL).build().perform();
//		
//		// Child window actions
//		
//		hardWait(2000);
//		
//		switchToWindow();
//		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
//		searchField.sendKeys("iPhone");
//		WebElement searchButton = driver.findElement(By.xpath("//span[@class='input-group-btn']//button//i"));
//		searchButton.click();
//		
//		hardWait(2000);
//		driver.close();
//		
//		//Parent Window actions
//		
//		hardWait(2000);
//		driver.switchTo().window(parentWindow);
//		WebElement searchMonitor = driver.findElement(By.xpath("//input[@name='search']"));
//		searchMonitor.sendKeys("Monitor");
//		WebElement searchButton2 = driver.findElement(By.xpath("//span[@class='input-group-btn']//button//i"));
//		searchButton2.click();
//		
//		
//		hardWait(6000);
//		tearDown();
//
//	}
//
//}
