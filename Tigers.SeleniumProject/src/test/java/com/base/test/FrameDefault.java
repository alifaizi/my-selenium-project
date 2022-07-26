package com.base.test;

import com.base.BaseClass;

public class FrameDefault extends BaseClass {

	   public static void main(String[] args) {
		     
		   BaseClass.launchBrowser("chrome" , "https://www.globalsqa.com/demo-site/frames-and-windows/");
		      
		      //grabbing the first frame with the help of index
		   
		      driver.switchTo().frame(3);
		      
		      System.out.println("Getting the page source " + driver.getPageSource());
		      
		      // switching back to the parent web page
		      
		      driver.switchTo().defaultContent();
		      
		      testExecutionWait(6000);
		      closeDown();
		      
		   }
		}