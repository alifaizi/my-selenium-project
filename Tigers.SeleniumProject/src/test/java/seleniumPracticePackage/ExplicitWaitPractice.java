package seleniumPracticePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExplicitWaitPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:www.amazon.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		Stopwatch watch = null;
		
		try {
			
			watch = Stopwatch.createStarted();
						
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By. linkText("Books")));
			
			element.click();
			
		} catch (Exception e) {
			
			watch.stop();

			e.printStackTrace();
			
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
			
		}
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		driver.navigate().back();
		
	}

}
