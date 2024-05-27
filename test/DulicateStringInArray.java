package com.demo.test;

public class DulicateStringInArray {

	public static void main(String[] args) {
		String [] original= {"Saurabh","Mayur","Rahul","Varad","Saurabh","Varad"};
		findDuplicates(original);
		
	}
	public static void findDuplicates(String []original)
	{
		System.out.print("Dulpicates element are: ");
		for(int i=0;i<original.length-1;i++)
		{
			for(int j=i+1;j<original.length ;j++)
			{
				if(original[i].equals(original[j]))
				{
					System.out.print(original[j]+" ");
				}
			}
		}
	}

}
