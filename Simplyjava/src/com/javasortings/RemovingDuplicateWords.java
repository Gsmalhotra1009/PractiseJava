package com.javasortings;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateWords {

	public static void main(String str[]) {
		String sentence = "He is doing is job fine";
		String char_words[] = sentence.split(" ");
		Set<String> sep_words = new LinkedHashSet<String>();
		for(String s : char_words) {
			sep_words.add(s);
		}
		
		
		Iterator<String> it = sep_words.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
