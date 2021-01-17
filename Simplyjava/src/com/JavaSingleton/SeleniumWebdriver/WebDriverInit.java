package com.JavaSingleton.SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInit {

	private static WebDriverInit initweb = null;
	private WebDriver driver;
	
	private WebDriverInit() {
		
	}
	

	
	

	public WebDriver openbrowser() {
		System.setProperty ("webdriver.chrome.driver", "D:\\Batches\\Selenium\\Login\\src\\main\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		return driver;
		
	}



	public static WebDriverInit getInstance() {
		if(initweb == null) 
			initweb = new WebDriverInit();
			return initweb;
		
	}

}
