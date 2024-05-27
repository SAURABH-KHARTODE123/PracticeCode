package com.demo.test;

import java.util.Scanner;

public class StringPalindrome 
{
   public static void main(String[] args)
   {
	   System.out.println("Enter  the string: ");
	   Scanner sc=new Scanner(System.in);
	   
	   String o=sc.nextLine();
	   int i;
	   String empty="";
	   for(i=o.length()-1;i>=0;i--)
	   {
		   empty+=o.charAt(i);
	   }
	   
	   
	   if(o.toLowerCase().equals(empty.toLowerCase()))
	   {
		  System.out.println(o+" is Palindrome String"); 
	   }
	   else
	   {
		   System.out.println(o+" is Not Palindrome String");
	   }
   }
   
}
