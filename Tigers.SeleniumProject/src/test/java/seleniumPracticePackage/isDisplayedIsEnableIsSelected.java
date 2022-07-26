package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class isDisplayedIsEnableIsSelected extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://demo.nopcommerce.com/register/");
		
		//isDisplayed();
		//isEnabled();
		
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display Status: " + searchStore.isDisplayed()); 	//True
		System.out.println("Enable Status: " + searchStore.isEnabled());
		
		//isSelected(); is used for Radio Buttons, Check Boxes, and Drop Down Menus 
		
		WebElement maleRadioBttn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRadioBttn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		Utils.hardWait(1000);
		
		System.out.println(maleRadioBttn.isSelected()); 	//false
		System.out.println(femaleRadioBttn.isSelected());	//False
		
		Utils.hardWait(1000);
		
		maleRadioBttn.click(); //Select male radio button
		
		Utils.hardWait(1000);
		
		System.out.println(maleRadioBttn.isSelected());		//True
		System.out.println(femaleRadioBttn.isSelected());	//False
		
		Utils.hardWait(1000);
		
		femaleRadioBttn.click(); //Select female radio button
		
		Utils.hardWait(1000);
		
		System.out.println(maleRadioBttn.isSelected()); 	//False
		System.out.println(femaleRadioBttn.isSelected()); 	//True
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
