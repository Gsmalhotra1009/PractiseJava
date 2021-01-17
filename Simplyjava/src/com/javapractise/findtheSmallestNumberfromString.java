package com.javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.InlineView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findtheSmallestNumberfromString {

	public static void main(String str[]) {

		
		//Enter any string number
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		// Reading input from STDIN

		// String name = "4569";
		// int name_dig = Integer.parseInt(name);

		System.out.println("Hi, " + name + ".");
		name = name.replaceAll("", " ").trim();
		System.out.println(name);

		//Converting String to An array
		
		String[] arrayint = name.split(" ");
		System.out.println(Arrays.toString(arrayint));
		System.out.println(arrayint[0] + "#####################");

		
		//Converting string to an integer array
		int[] arrayi2 = Arrays.stream(arrayint).mapToInt(Integer::parseInt).toArray();

		int smallest = arrayi2[0];
		for (int i = 0; i < arrayi2.length; i++) {
			if (arrayi2[i] < smallest) {
				smallest = arrayi2[i];
			}

		}
		System.out.println(smallest);

	}
	
	
	
	
	
	
	
	
	
}
/*
 * List<Integer> list = new ArrayList<Integer>(); for(Integer intlist : arrayi2)
 * { list.add(intlist);
 * 
 * } Integer max = Collections.max(list); System.out.printl*
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * /*final int num = 10; public void display() { int num =12; Runnable r = new
 * Runnable(){ final int num = 15;
 * 
 * public void run(){ int num = 20; System.out.println(this.num); } }; r.run();
 * }
 * 
 * public static void main(String args[]) { LoggingIn sv = new LoggingIn();
 * sv.display(); }
 * 
 * }
 */

/*
 * int number[] = {2,0,2,1,1,0}; //System.out.println(get(number));
 * 
 * get(number);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * public static void get(int number[]) {
 * 
 * int i =0; while(i <number.length) { for(int y=i+1;y<number.length;y++) {
 * if(number[i] == number[y]) { int temp = number[i+1]; number[i+1] = number[y];
 * number[y] = temp; i = i+2; break; }else { i = i+2; } }
 * 
 * }
 * 
 * //System.out.println(number); for(int k =0; k <number.length;k++) {
 * System.out.print(number[k]); }
 * 
 * 
 * 
 * TreeMap<Integer, Integer>map = new TreeMap<Integer,Integer>(); for(Integer
 * digit : number) { Integer count = map.get(digit); if(count == null) {
 * map.put(digit, 1); }else { map.put(digit,++count); } }
 * 
 * 
 * 
 */

/*
 * public static WebDriver driver; public static WebDriverWait wait;
 * 
 * public static void getOpenBrowser(WebDriver driver, String Url) {
 * System.setProperty("webdriver.chrome.driver",
 * "D:\\Batches\\Selenium\\Login\\src\\main\\resources\\chromedriver.exe");
 * driver = new ChromeDriver(); driver.get(Url);
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS); }
 * 
 * 
 * 
 * public static void entercredentials() {
 * 
 * HashMap<String, String> map = new HashMap<String, String>(); map.put("admin",
 * "demo1"); map.put("admin", "demo123"); map.put("admin", "demo1234"); for
 * (Entry<String, String> entries : map.entrySet()) {
 * driver.findElement(By.id("user_login")).getc
 * driver.findElement(By.id("user_pass")).sendKeys(entries.getValue());
 * driver.findElement(By.id("wp-submit")).click();
 * 
 * driver.findElement(By.class)
 * 
 * driver.exi
 * 
 * if (driver.getTitle().equalsIgnoreCase("some random value")) {
 * System.out.println(driver.getTitle());
 * 
 * } else { driver.findElement(By.id("login_error")); } } } public static void
 * main(String str[]) throws InterruptedException { String url =
 * "http://demosite.center/wordpress/wp-login.php"; getOpenBrowser(driver, url);
 * entercredentials();
 * 
 * }
 */
