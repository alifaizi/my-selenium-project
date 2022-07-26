package seleniumPracticePackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElementVsFindElements2 extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("Chrome", "https://www.amazon.com/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");

		// Find Element:

		WebElement element = driver.findElement(By.xpath("//div[@role='group']//div[1]"));
		System.out.println(element.getText());

		// FInd Elements:
		// We use find elements method to locate and perform multiple actions on
		// multiple elements at a time

		List<String> list1 = new ArrayList<String>();

		List<WebElement> elements = driver.findElements(By.xpath("//div[@role='group']//div"));

		for (int i = 0; i < elements.size(); i++) {
			
			System.out.println(elements.get(i).getText());

		}

		System.out.println(list1);

//		// -------------------->>>>>>> To run the following code the previous code should be commented <<<<<<<<--------------------

//		List<WebElement> elements3 = driver.findElements(By.xpath("//div[@role='group']//div"));
//
//		for (int i = 0; i < elements3.size(); i++) {
//
//			if (elements3.get(i).getText().equals("Apps & Games")) {
//
//				elements3.get(i).click();
//				break;
//
//			}else {
//
//		}
//			
//	}

		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
