package com.selenium;

import java.util.Calendar;
import java.util.Date;

public class leapyear {
	
	public static void main(String str[])
	{
		
		
		int year =2024 ;
		//Date date=new Date();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		//
		
		int noofdays=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(noofdays);
		
		if(noofdays<365)
		{
			System.out.println("This is a leap year" + noofdays);
			
		}}
		
		public static boolean doesleapyear(int year)
		{
			
			return (year%400==0||(year!=100||year%4==0));
					}
		}
	//	date.getYear();
		
		//System.out.println(date.getDate() +"/" + date.getMonth()+ "/" + date.getYear() );
	
			


