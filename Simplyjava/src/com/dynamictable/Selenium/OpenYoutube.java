package com.dynamictable.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenYoutube {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String str[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Batches\\Selenium\\Login\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

		if (driver.getTitle().equalsIgnoreCase("YouTube")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div//input[@id='search']")).click();
			driver.findElement(By.xpath("//div//input[@id='search']")).sendKeys("selenium");
			wait = new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//div[@class='sbqs_c'][text()='selenium']/b[text()=' tutorial']")));
			driver.findElement(By.xpath("//div[@class='sbqs_c'][text()='selenium']/b[text()=' tutorial']")).click();
			driver.findElement(By.partialLinkText("https://i.ytimg.com/vi/VZfvIxiphfo/hq720.jpg?sqp=-oaymwEZCNAFEJQ"))
					.click();
			driver.findElement(By.cssSelector("input#search-icon-legacy")).click();

		}
	}

}
