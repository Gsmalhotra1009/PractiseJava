package com.javapractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoringTableInHashMap {

	public static void main(String str[]) throws InterruptedException {
		HashMap<String, List> map = new HashMap<String, List>();
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

		WebElement table = driver.findElement(
				By.xpath("//div/table[@class='ui celled sortable striped table custom-grid table-scroll']"));
		List<WebElement> header = table.findElements(
				By.xpath("//div/table[@class='ui celled sortable striped table custom-grid table-scroll']//th"));

		for (int headerindex = 0; headerindex < header.size(); headerindex++) {
			System.out.println(header.get(headerindex).getText());

			List<WebElement> rows = table.findElements(By.xpath(
					"//div/table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody/tr"));
			for (int rownum = 0; rownum < rows.size(); rownum++) {

				List<WebElement> column = rows.get(rownum).findElements(By.xpath(
						"//div/table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody/tr/td"));
				for (int columnnum = 0; columnnum < column.size(); columnnum++) {

					List<String> l1 = new LinkedList<String>();
					l1.add(column.get(columnnum).getText());

				}

			}

		}

	}
}

/*
 * driver.get("http://localhost:81/index.php?action=Login&module=Users");
 * driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
 * driver.findElement(By.name("user_name")).sendKeys("admin");
 * driver.findElement(By.name("user_password")).sendKeys("admin");
 * driver.findElement(By.
 * xpath("//td[@class='small']/input[@title='Login [Alt+L]']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[text()='Sales']")
 * ).click(); Thread.sleep(5000);
 * 
 * WebElement table =
 * driver.findElement(By.xpath("//div/table[@class='lvt small']")); List
 * <WebElement> rows =
 * table.findElements(By.xpath("//div/table[@class='lvt small']/tbody/tr[1]"));
 * 
 * for(int rownum = 0 ;rownum<rows.size();rownum++) {
 * 
 * List<WebElement> columns = rows.get(rownum).findElements(By.
 * xpath("//div/table[@class='lvt small']/tbody/tr/td")); for(int columnum = 0;
 * columnum<columns.size();columnum++) { //
 * System.out.println(columns.get(columnum).getText());
 * 
 * map.put(rows.get(rownum).getText(), columns.get(columnum).getText());
 * System.out.println(map.keySet() +" "+ map.values());
 * 
 * }
 */