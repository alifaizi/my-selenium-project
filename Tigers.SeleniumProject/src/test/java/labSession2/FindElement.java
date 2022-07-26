package labSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class FindElement extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://demo.guru99.com/test/web-table-element.php");
		
		
		//findElement
		
		//example 1:
		WebElement oneValue = driver.findElement(By.xpath("//table//tbody//tr[6]//td[1]"));
		System.out.println(oneValue.getText());
		
		//example 2:
		WebElement oneValue1 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[1]"));
		System.out.println(oneValue1.getText());
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
