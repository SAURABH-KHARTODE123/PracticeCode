package com.demo.test;

public class TrianglePattern {
static int rows=5;
static int col=5;
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i ;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}

	}

}
