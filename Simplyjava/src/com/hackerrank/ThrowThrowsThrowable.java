package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;

public class ThrowThrowsThrowable {

	  static void fun() 
	    { 
	        try
	        { 
	            throw new NullPointerException("demo"); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught inside fun()."); 
	            throw e; // rethrowing the exception 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            fun(); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught in main."); 
	        } 
	    } }
