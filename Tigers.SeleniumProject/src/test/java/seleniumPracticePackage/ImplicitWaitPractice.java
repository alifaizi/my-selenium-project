package seleniumPracticePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitPractice {

	public static void main(String[] args) {

		
		// Launching a browser
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		//Implementing implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//StopWatch
		
		Stopwatch watch = null;
		
		try {
			
			watch = Stopwatch.createStarted();
			
			driver.findElement(By.linkText("Sell")).click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			watch.stop();
			
			System.out.println(e);
			
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
		}
		
		
		driver.navigate().back();
		
		
		
	}

}
