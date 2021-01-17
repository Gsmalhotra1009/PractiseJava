package com.javapractise;

public class Stringpallindromew {

	public static void main(String str[]) {
		ispalindrome("Nitin");

	}

	public static String gettext(String name) {

		String fromstringbuilder = null;
		if (name == null || name.isEmpty()) {
			return name;
		}

		char c[] = name.toCharArray();

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(c[i]);
			StringBuilder strbuilder = new StringBuilder(name.length());
			strbuilder.append(c[i]);
			fromstringbuilder = strbuilder.toString();

		}
		return fromstringbuilder;

	}

	public static boolean ispalindrome(String input)

	{
		String reversetext = gettext(input);

		if (input.equalsIgnoreCase(reversetext)) {
		System.out.println("This is fine");
			return true;
		}
		System.out.println("This is not fine");
		return false;

	}

}