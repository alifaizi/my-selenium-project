package seleniumPracticePackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChekingBrokenLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			System.out.println("-----------------------------------------");

			System.out.println(url);

			if (url == null || url.isEmpty()) {

				System.out.println("URL is Empty");

				continue;
			}

			try {
				HttpURLConnection conToServ = (HttpURLConnection) (new URL(url).openConnection());

				conToServ.connect();

				if (conToServ.getResponseCode() >= 400) {

					System.err.println(url + " is broken.");
				} else {

					System.out.println("This URL is valid.");
				}
			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		driver.quit();

	}

}
