package seleniumPracticePackage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.Utils;

public class FullPageScreenshot extends Utils {

	public static void main(String[] args) throws IOException {

		getBrowser("chrome", "http://tek-school.com/retail/");
		
		hardWait(2000);
		
		String screenshotName = "Full Page Screenshot"; 
		
		String path = ".\\screenshots\\";
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "PNG", new File(path + screenshotName + ".png"));
		
		
		hardWait(6000);
		tearDown();
	}

}
