package com.javapractise;

public class RemovingWhiteSpaces {

	public static void main(String str[]) {
		String name = "I am a wonderful person";
		String withouwhitespace = name.replaceAll("\\s+", "");
		System.out.print(withouwhitespace);
	

	//removing whitespace without usining inbuilt method 
	   char c[] = name.toCharArray();
	   for(int i = 0 ;i<=c.length;i++) {

		   String withoutwhitespace = "";
		   if((c[i]!=' ')&&( c[i]!='\t')) {
			withoutwhitespace = withoutwhitespace +c[i];
			   
		   }
	   }
	
	}
}
