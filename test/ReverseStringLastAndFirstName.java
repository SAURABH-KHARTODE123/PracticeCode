package com.demo.test;

import java.util.Arrays;

public class ReverseStringLastAndFirstName {

	public static void main(String[] args) {
		String name="Saurabh Khartude";
		String arr[]=name.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(charAt(arr.i));
			System.out.print(arr[i]+" ");
		}
	}

}
