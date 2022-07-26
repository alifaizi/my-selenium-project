package com.base.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.base.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotFullPage extends BaseClass{

	public static void main(String[] args) throws IOException {

		launchBrowser("chrome", "http://tek-school.com/retail/");
		
		String ssPath = ".\\Screenshots\\";
		String ssName = "First Screenshot";
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "PNG", new File(ssPath + ssName + ".png"));
		
		testExecutionWait(6000);
		closeDown();
	}

}
