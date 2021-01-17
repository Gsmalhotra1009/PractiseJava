package com.javasortings;

import java.util.ArrayList;
import java.util.List;



public class ValuemustbedividedbyitsEachModulus {

	public static void main(String str[]) {
		System.out.println(selfDividingNumbers(66, 708));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
	boolean flag = false;
		while(left<=right) {
			int new_left = left;
				if(new_left%10!=0) {
					while(new_left>0) {
					int modulus = new_left %10;
					
					if(modulus==0) {
					flag = false;
						break;
					
						}else {
						
						if(left % modulus==0) {
							flag = true;
						}else if(left % modulus !=0) {
							flag = false;
							break;
						}
					
						new_left = new_left/10;
					}
					
				}
					if(flag==true) {
						list.add(left);
					}
				
			}
			
			left++;
		
		}
		
		return list;	
		

	}
		
	}			