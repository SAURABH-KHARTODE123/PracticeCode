package com.demo.test;

public class Pattern {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	  public static void main(String[] args) {
//	        for(int i=1;i<=4;i++)
//	        {
//	            for (int j=1;j<=7;j++)
//	            {
//	                 
//	               if(j-i<=0)
//	               {
//	                   System.out.print("*-");
//	               }
//	               
//	                else
//	                {
//	                    System.out.println(" ");
//	                }
//	            }
//	           System.out.println();
//	        }
//	       // System.out.println("Try programiz.pro");
		  for(int i=1;i<=5;i++) {
			  for(int j=5-i;j>0;j--) {
				  System.out.print("  ");
			  }
			  for(int j=1;j<=i;j++) {
				  System.out.print("*  ");
			  }
			  System.out.println();
		  }
		  
		  
	  }
	}
