package com.base.test;

import com.base.BaseClass;

public class launchingBrowser extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/index.php?route=product/search&search=camera");
		System.out.println(driver.getTitle());
		
	
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

		
	}

}
