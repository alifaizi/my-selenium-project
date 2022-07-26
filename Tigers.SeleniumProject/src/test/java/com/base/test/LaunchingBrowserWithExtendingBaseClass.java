package com.base.test;

import com.base.BaseClass;

public class LaunchingBrowserWithExtendingBaseClass extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://www.google.com/");
		
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

}
