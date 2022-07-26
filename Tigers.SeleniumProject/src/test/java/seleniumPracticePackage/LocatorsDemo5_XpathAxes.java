package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class LocatorsDemo5_XpathAxes extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("Chrome", "http://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().window().maximize();
		
		// Self
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='Apollo Tyres']/self::a"));
		
		System.out.println(element1.getText());
		
		
		Utils.hardWait(4000);
		Utils.tearDown();
		
	}

}
