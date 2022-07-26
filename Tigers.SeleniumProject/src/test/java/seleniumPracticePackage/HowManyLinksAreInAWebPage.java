package seleniumPracticePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowManyLinksAreInAWebPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		
		int numOfSlides = sliders.size();
		
		System.out.println(numOfSlides);
		
		List<WebElement> linksOnPage = driver.findElements(By.tagName("a"));
		
		int numOfLinksOnPage = linksOnPage.size();
		
		System.out.println(numOfLinksOnPage);
		
	}

}
