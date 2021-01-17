package com.javasortings;

public class NEWStringManipulation {

	public static void main(String str[]) {

		// String manipulations
		String longString = "The rains have started here ";
		String longString1 = "The rains have started here ";

		System.out.println(longString.charAt(5));

		System.out.println(longString.length());

		System.out.println(longString.indexOf('s')); // frst occurrence of 's'

		System.out.println(longString.indexOf('s', longString.indexOf('s') + 1)); // 2nd Occurrence of 'S'

		System.out.println(longString.indexOf("have"));

		System.out.println(longString.indexOf("What")); // -1 will be return

		System.out.println(longString.equalsIgnoreCase(longString1));

		System.out.println(longString.substring(8));

		System.out.println(longString.substring(0, 8));

		System.out.println(longString1.trim());

		System.out.println(longString.replaceAll("\\s", ""));

		// split
		String splitString = "You are doin a wonderful job";
		String words[] = splitString.split("\\s");
		System.out.println(splitString.split("//s"));
		System.out.println(words.length);

		//int to String conversion
		int i = 45;
		String name = String.valueOf(i);
		System.out.println(name);

		
		//Concatinating int and String together
		String x = "Hello";
		String y = "World";
		System.out.println(x + y);
		int a = 100;
		int b = 200;
		System.out.println(a + b);
		System.out.println(a + b + y + x);
		System.out.println(x + a + b + y);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+a + b);

	}

}
