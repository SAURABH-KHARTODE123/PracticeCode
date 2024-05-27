package com.demo.test;

public class ArraySort {

	public static void main(String[] args) {
		int  []original= {10,12,13,56,34,67,20,50,33,46,88};
		int []arr= new int[original.length];
		int j=0;
		for(int i=0;i<original.length-1;i++)
		{
			if(original[i]%2==0)
			{
				arr[j] = original[i] ;
				j++;
			}
		}
		
		
		System.out.print("Without Sorted Even: " );
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0) {
 			System.out.print( arr[i]+",");
			}
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=i+1;k<arr.length;k++)
			{
				if(arr[i] > arr[k])
				{
					int temp = arr[i];
					arr[i] =arr[k];
					arr[k] = temp;
				}
			}
		}
		
		System.out.print("\nSorted Even: " );
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0) {
 			System.out.print( arr[i]+",");
			}
		}
		

	}

}
