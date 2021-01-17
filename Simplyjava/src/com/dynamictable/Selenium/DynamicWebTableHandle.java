package com.dynamictable.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String str[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Batches\\Selenium\\Login\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("gsmalhotra1009@gmail.com");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("Awarded@123");

		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='item-text'][text()='Contacts']")).click();
		Thread.sleep(2000);
 
		 driver.findElement(By.xpath("//td[text()='susaine S']/preceding-sibling::td/div[@class='ui fitted read-only checkbox']")).click();

		// Iterating the rows and the columns

		WebElement table = driver
				.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid']"));
		java.util.List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
		for (int rownum = 0; rownum < rows.size(); rownum++) {
			List<WebElement> columns = rows.get(rownum).findElements(By.xpath("//tbody/tr["+rownum+"]/td"));
			for (int columnum = 0; columnum < columns.size(); columnum++) {
				String column_name = columns.get(columnum).getText();
				//System.out.println(column_name);
				if (column_name.equalsIgnoreCase("Gundeep Singh")) {
					WebElement element = columns.get(columnum - 1);
					System.out.println();
					element.click();
					System.out.println("I found the name " + "#################" + column_name);
					break;
				}
			}

		}

	}

}
