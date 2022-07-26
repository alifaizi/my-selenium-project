package seleniumPracticePackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FindElementVsFindElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");
		
		
		//findElement:
		
		// findElement --> Returns the single element
		
		/*
		// Scenario 1
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchBox.sendKeys("abc");
		
		
		// Scenario 2
		//Even with multiple elements, findElement finds the first element in the list only
		WebElement multipleElement = driver.findElement(By.xpath("(//div[@class='row'])[4]//a"));
		System.out.println(multipleElement.getText());
		
		
		// Scenario 3
		// findElement did not find the element, it throws NoSuchElementException
		WebElement searchBttn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lga']"));
		searchBttn.click();
		*/
		
		
		
		
		//findElements:
		
		// findElements --> Returns multiple elements
		
		// Scenario 1
		/*
		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//div[@class='row']//a"));
		System.out.println(footerLinks.size());
		
		for (WebElement elements : footerLinks) {
			
			System.out.println(elements.getText());
		}
		*/
		
		
		
		// Scenario 2
		//findElements can find a single element too
		/*
		 * List<WebElement> singleElement = driver.findElements(By.xpath("//a[normalize-space()='TEST ENVIRONMENT']"));
		   System.out.println(singleElement.size());
		 */
		
		
		
		
		// Scenario 2
		// In case the locator does not match any elements or element on application, it returns 0 NOT exception
		List<WebElement> footerLinks = driver.findElements(By.xpath("//a[normalize-space()='TEST ENVIRONMENT']//abc"));
		System.out.println(footerLinks.size());
		
		for (WebElement elements : footerLinks) {
			
			System.out.println(elements.getText());
			
		}
		
	}

}
