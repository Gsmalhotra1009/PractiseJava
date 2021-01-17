package com.JavaSingleton.SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTest {
WebDriver driver;
	
	@BeforeMethod
	 public void Setup() {
		WebDriverInit init = WebDriverInit.getInstance();
		driver = init.openbrowser();
	}
	
	@Test
	public void testMethod() {
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("")).sendKeys("What is ");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println();
	}
}
