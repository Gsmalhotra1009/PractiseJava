package com.javasortings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ExtractnumberfromString {
	
	public static void getmap(String str) {
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		Stack<Character> stack = new Stack<Character>(); 
		for(int i = str.length()-1; i >= 0 ;i--)
		{
			char current = str.charAt(i);
			if(current == '0'||current == '1'|| current == '2' ||current == '3' ||current == '4' ||current == '5' ||current == '6' ||current == '7' ||current == '8'||current == '9') {
				stack.push(current);
				System.out.print(stack.push(current));
			}
			
			StringBuilder strbuilder = new StringBuilder(str.length());
			//for(int j = str.length()-1 ; j<= 0 ;j--) {
			if(stack.isEmpty()) {

				System.out.println("Stack is empty");
			}else if (str.charAt(i) == stack.peek()) {
					strbuilder.append(stack.pop());
				}else {
					strbuilder.append(i);
				}
			System.out.println(strbuilder);
			}
			
		}
		
	/*	int reverse[] = new int[str.length()];
		for(int j=str.length()-1 ; j>= 0 ; j--)
		{
			
		}
		
	*/	
		
		/*StringBuilder strinBuilder = new StringBuilder(str.length());
		for(int i = str.length()-1 ; i >= 0; i--) {
			if(map.containsKey(i)) {
				Character value= map.get(i);
				
		
			}else {
				strinBuilder.append(str.charAt(i));
				strinBuilder.insert(map.keySet(), value);
			}
			System.out.println(strinBuilder);
		}
		
		
*/		
		
		
	/*	int ar[] = new int[str.length()];
		int head = 0;

		//reverse logic
		for(int i = str.length()-1; i >= 0; i--){
			if(linkedhashmap.containsKey(i)){
				ar[i] = linkedhashmap.get(i);
		}else{
			ar[head] = str.charAt(i);
			head++;
		}

		}

			System.out.println(ar.toString());*/
	

	
	
	
	
public static void main(String str[]) {
	String name= "Gu1ndee2p";
	getmap(name);
}

}



		
