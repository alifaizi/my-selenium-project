package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utils;

public class LocatorsContinued {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Utils.hardWait(2000);
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));

		searchBox.sendKeys("T-shirts");
		
		Utils.hardWait(2000);
		
		WebElement submitButton = driver.findElement(By.name("submit_search"));
	
		submitButton.click();
		
		driver.quit();
			
	}

}
