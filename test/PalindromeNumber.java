package com.demo.test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int original=num;
		int i=0,rem=0,rev=0;
		
		while( num!=0)
		{
			rem=num%10;
   	     //System.out.println("rem= "+rem);
			rev=rev*10+rem;
		//	System.out.println("rev= "+rev);
			num=num/10;
		//	System.out.println("num= " +num);

		}
		
		if(original==rev)
		{
			System.out.println(original+" is Palindrome Number");
		}
		else
		{
			System.out.println(original+" is not Palindrome Number");
		}
	}

}
