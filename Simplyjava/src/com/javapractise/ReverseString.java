package com.javapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	
	    public static void main(String[] args)
	   
	    	
	    {
		       String name = "Geeks for geeks";
		       char n[] = name.toCharArray();
		       List<Character> list = new ArrayList<Character>();
		       for(Character ch : n) {
		    	   
		    	   list.add(ch);
		    	   
		       }
		       
		       Collections.reverse(list);
		       ListIterator li = list.listIterator();
		       while(li.hasNext()) {
		    	   System.out.print(li.next());
		    	   
		       }
		       
	    	
	
	    			
	    } 			
	    
	    }

	    
	    