package seleniumPracticePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class HandlingMultipleWindow extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "http://automationpractice.com/index.php");
		Utils.hardWait(2000);
		
		WebElement fb = driver.findElement(By.xpath("//li[@class='facebook']"));
		fb.click();
		Utils.hardWait(2000);
		
		WebElement tw = driver.findElement(By.className("twitter"));
		tw.click();
		Utils.hardWait(2000);
		
		String parentWin = driver.getWindowHandle();
		
		System.out.println(parentWin);
		
		Set <String> childWins = driver.getWindowHandles();
		
		Iterator <String> iterator = childWins.iterator();
		
		while((iterator.hasNext())){
			
			String childWindow = iterator.next();
			
			System.out.println(childWindow);
			
			//Switching window
			
			if (!childWindow.equalsIgnoreCase(parentWin)){
				
				driver.switchTo().window(childWindow);
				if(driver.getTitle().equalsIgnoreCase("Selenium Framework | Facebook")) {

				}
				
				driver.switchTo().window(childWindow);
				if(driver.getTitle().equalsIgnoreCase("Selenium Framework (@seleniumfrmwrk) / Twitter")) {
			}
			
				
				driver.switchTo().window(parentWin);
				if(driver.getTitle().equalsIgnoreCase("My Store")) {
					
				Utils.hardWait(6000);
				driver.close();
			
		}
	}

}
}
}
