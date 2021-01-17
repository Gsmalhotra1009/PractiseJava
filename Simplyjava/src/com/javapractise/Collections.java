package com.javapractise;

import java.sql.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.List;

public class Collections {

	
	
	public static void main(String str[]) {
		
		/*LocalDate id = LocalDate.of(2015, 12, 12);
		id = id.with(ChronoField.DAY_OF_YEAR,30);
		System.out.println(id);*/

		
		//Important 
	/*	StringBuilder sb = new StringBuilder("ab");
		sb.append("cd");
		String sdjh = new String(sb);
		sdjh.concat("ef");
		System.out.println(sdjh);*/
		
		//Important Quest
	/*	int a = 1;
	Integer b = 1;
	System.out.println(a==b);
	System.out.println(b.compareTo(a));*/
			
		
		
		
		
		/*Integer x = 8;
		System.out.println(x.SIZE + x.BYTES);
		*/
		
		
		
		List<String>  l1 = Arrays.asList("Gundeep","Rahul","Sahil","Shyam");
		List<String>  l2 = Arrays.asList("Gundeep","jefo");

		System.out.println(l1.containsAll(l2));
		
		
		
		
		
		
		
		
	}
	
	
	
		
		
		
		
	/*	for(String name:l1) {
			System.out.println(l1.get(0));
	
			
		}
		List<String>  l2 = Arrays.asList("Gundeep","Rahul");
	}
*/
}
