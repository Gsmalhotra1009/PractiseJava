package com.javapractise;

import java.util.Calendar;
import java.util.Date;

public class FindingDay {

	public static void main(String str[]) {
	
	FindingDay day= new FindingDay();
	System.out.println(day.solution("Sat", 500));
	}
		public String solution(String s,int k) {
			String newday="";
			int modulus ;
			
			  String[] days = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
			   for(int i =0;i<=days.length-1;i++) {
					if(days[i]==s) {
		    		newday =days[i];
		    		modulus = (i+k) % 7;
		    		newday=days[modulus];
		    		System.out.println(days[modulus]);
		    	
		    		}
			  
	}
			  return newday;
	  
			}
		
}
			  
		
		

