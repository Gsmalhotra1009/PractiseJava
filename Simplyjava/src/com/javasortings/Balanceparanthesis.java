package com.javasortings;

import java.util.Stack;

public class Balanceparanthesis {

	public static void main(String str[])
	{
	 String expr= "a*(b+c)-(d*e)";
	 String abc=CheckBalancing(expr);
	 
	 System.out.println(abc);
	
		
	}	
		
		public static String CheckBalancing(String expr)
		{
			if(expr.isEmpty()) {
				return "Balanced";
				
			}
			
			Stack<Character> stack = new Stack<Character>();
			for(int i = 0; i < expr.length();i++) {
			char current = expr.charAt(i);
			if(current == '{' || current == '(' ||  current == '[' ) {
				stack.push(current);
			String s = "What is my Name";
			
			
		if(current == '}' || current == ')' || current == '[' ) {
			if(stack.isEmpty()) {
				return "Not Balamnced";
			}
			char peak= stack.peek();
			if(current == '}' && peak == '{' || current == ')' && peak == '(' && current == '[' && current == ']')
				stack.pop();
		}else {
			return "Not Balanced";
		}			
		}
			
			}
			return stack.isEmpty() ? "Balanced" : "Not Balanced";
			}
		}
				
			
		
	
	


