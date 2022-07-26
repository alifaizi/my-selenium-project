package seleniumPracticePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElementVsFindElements1 extends Utils {

	public static void main(String[] args) {
		
		
		// table	table
		// thead	table header
		// tbody	table body
		// tr		row
		// td		column
		// a		anchor

		Utils.getBrowser("Chrome", "https://demo.guru99.com/test/web-table-element.php");
		
		// Find Element:
				// We use find element method to locate and perform some action on one element at a time
		
		WebElement companyName = driver.findElement(By.xpath("//table//tbody//tr[1]//td"));
		System.out.println(companyName.getText());
		
		
		System.out.println("---------------------------------------------------------");
		
		
				// FInd Elements:
				// We use find elements method to locate and perform multiple actions on multiple elements at a time

		List<WebElement> allComName = driver.findElements(By.xpath("//table//tbody//tr"));
		
		for (int i = 0; i < allComName.size(); i++) {
			
			System.out.println(allComName.get(i).getText());
		}
		
		
		Utils.hardWait(6000);

		Utils.tearDown();

	}

}
