package seleniumPracticePackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElementVsFindElements3 extends Utils {

	public static void main(String[] args) {
	

		Utils.getBrowser("Chrome", "https://www.amazon.com/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");
		
		// FInd Elements:
				// We use find elements method to locate and perform multiple actions on multiple elements at a time

		List<WebElement> elements = driver.findElements(By.xpath("//div[@role='group']//div"));
		
		String element ="";
		
		for (int i = 0; i < elements.size(); i++) {
			
			//System.out.println(elements.get(i).getText());
			
			element = elements.get(i).getText();
			
			if (elements.get(i).getText().equals("Cell Phones & Accessories")) {
				
				System.out.println(elements.get(i).getText());

			}else {
				
			}
		}
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Cell Phone & Accessories");
		list1.add("Cell Phone & Accessories");
		list1.add("Cell Phone & Accessories");
		list1.add("Cell Phone & Accessories");
		list1.add("Cell Phone & Accessories");
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		Utils.hardWait(6000);

		Utils.tearDown();

	}

}
