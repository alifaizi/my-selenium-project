package labSession2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElements extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://demo.guru99.com/test/web-table-element.php");
		
		//findElements
		
		//example 1:
		
		//Capturing all element
		List<WebElement> allValue = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
		
		for (int i = 0; i < allValue.size(); i++) {
			
			System.out.println(allValue.get(i).getText());
			
		}
		
		System.out.println("--------------------------------------------");
		
		//example 2:
		
		//Capturing some of the elements not all
		List<WebElement> multiValue = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println(multiValue.get(i).getText());
			
		}
		
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
