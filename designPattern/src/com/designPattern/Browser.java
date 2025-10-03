package com.designPattern;

public class Browser {
	
	
	private volatile static Browser browser;
	
	private Browser() {}
	
	public static Browser getInstance() {
		if(browser == null) {
			synchronized (Browser.class) {
				if(browser == null) {
					browser = new Browser();
				}
			}
		}
		return browser;
	}
	
	public void displayMesg() {
		System.out.println("this is designPartern");
	}

}
